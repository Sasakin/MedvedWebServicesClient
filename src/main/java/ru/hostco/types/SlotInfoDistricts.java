
package ru.hostco.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ���������� � ����� �� ������� ������� ��������.
 * 
 * <p>Java class for SlotInfoDistricts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlotInfoDistricts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/types}SlotInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="district" type="{http://www.hostco.ru/types}DistrictRequestItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlotInfoDistricts", propOrder = {
    "district"
})
public class SlotInfoDistricts
    extends SlotInfo
{

    protected List<DistrictRequestItem> district;

    /**
     * Gets the value of the district property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the district property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistrictRequestItem }
     * 
     * 
     */
    public List<DistrictRequestItem> getDistrict() {
        if (district == null) {
            district = new ArrayList<DistrictRequestItem>();
        }
        return this.district;
    }

}
