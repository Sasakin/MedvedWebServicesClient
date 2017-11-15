package ru.hostco.app.db.dao;

import oracle.jdbc.OracleTypes;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.jdbc.ReturningWork;
import org.springframework.stereotype.Repository;
import ru.hostco.types.DepartmentType;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository("departmentTypeDao")
public class DepartmentTypeDaoImpl extends AbstractDao implements DepartmentTypeDao {
    @Override
    public void persist(Object entity) {
        // do nothing
    }

    @Override
    public void delete(Object entity) {
        // do nothing
    }

    @SuppressWarnings("unchecked")
    public List<DepartmentType> findAllDepartmentTypes() {
        try {
            Session session = getSession();
            return session.doReturningWork(new ReturningWork<List>() {
                @Override
                public List execute(Connection connection) throws SQLException {
                    CallableStatement st = null;
                    List<DepartmentType> depList = new ArrayList<DepartmentType>();
                    String sqlString = "{call p_rfisz_medved.update_mu_info(?)}";
                    st = connection.prepareCall(sqlString);
                    st.registerOutParameter(1, OracleTypes.CURSOR);
                    st.execute();
                    ResultSet rs = (ResultSet) st.getObject(1);
                    while (rs.next()) {
                        DepartmentType department = new DepartmentType();
                        department.setDeptCode(rs.getString("DEPT_CODE"));
                        department.setDeptName(rs.getString("DEPT_NAME"));
                        department.setDeptShortName(rs.getString("DEPT_SHORT_NAME"));
                        department.setDeptType(rs.getInt("DEPT_TYPE"));
                        department.setDeptAddress(rs.getString("DEPT_ADDRESS"));
                        department.setDeptPhone(rs.getString("DEPT_PHONE"));
                        department.setDeptNotes(rs.getString("DEPT_NOTES"));
                        department.setDeleted(rs.getBoolean("DELETED"));
                        depList.add(department);
                    }
                    return depList;
                }
            });
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return null;
    }
}
