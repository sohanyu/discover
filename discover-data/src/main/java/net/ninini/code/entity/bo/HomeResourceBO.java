package net.ninini.code.entity.bo;

import net.ninini.code.entity.po.THomeResource;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HomeResourceBO implements Serializable {

    private Long pid;

    private Integer area;

    private Integer city;

    private Integer province;

    private Long community;

    private BigDecimal space;

    private Integer floor;

    private Integer totalFloor;

    private String address;

    private String contactsPhone;

    private String contactsWechat;

    private String contactsName;

    private Long userPid;

    private Long houseType;

    private Integer propertyRight;

    private Date createTime;

    private Date updateTime;

    private Integer rentStatus;

    private Integer saleStatus;

    private Integer newStatus;

    private Integer soilType;

    private BigDecimal rentNormalPrice;

    private BigDecimal saleNormalPrice;

    private Integer purpose;

    private String incomeWay;

    private Integer agent;

    private String agentPhone;

    private String agentWechat;

    private Integer del;

    private Integer sort;

    private Integer direction;

    private Integer loft;

    private Integer fitment;

    private Date birthday;

    private Integer trait;

    private String seeTime;

    private Integer optimization;

    private BigDecimal realSpace;

    private Integer buildStructure;

    private String stairsRatio;

    private Integer heating;

    private Integer elevator;

    private Date hangoutTime;

    private Integer ownership;

    private Date lastUpdateTime;

    private Integer boughtTime;

    private Integer propertyRightAttribute;

    private String pledge;

    private BigDecimal lat;

    private BigDecimal lng;

    private Integer buildingNumber;

    private Integer houseUnit;

    private Long agentPid;

    private String description;

    private String permit;


    public HomeResourceBO() {
    }

    public HomeResourceBO(THomeResource tHomeResource) {
        this.pid = tHomeResource.getPid();
        this.area = tHomeResource.getArea();
        this.city = tHomeResource.getCity();
        this.province = tHomeResource.getProvince();
        this.community = tHomeResource.getCommunity();
        this.space = tHomeResource.getSpace();
        this.floor = tHomeResource.getFloor();
        this.totalFloor = tHomeResource.getTotalFloor();
        this.address = tHomeResource.getAddress();
        this.contactsPhone = tHomeResource.getContactsPhone();
        this.contactsWechat = tHomeResource.getContactsWechat();
        this.contactsName = tHomeResource.getContactsName();
        this.userPid = tHomeResource.getUserPid();
        this.houseType = tHomeResource.getHouseType();
        this.propertyRight = tHomeResource.getPropertyRight();
        this.createTime = tHomeResource.getCreateTime();
        this.updateTime = tHomeResource.getUpdateTime();
        this.rentStatus = tHomeResource.getRentStatus();
        this.saleStatus = tHomeResource.getSaleStatus();
        this.newStatus = tHomeResource.getNewStatus();
        this.soilType = tHomeResource.getSoilType();
        this.rentNormalPrice = tHomeResource.getRentNormalPrice();
        this.saleNormalPrice = tHomeResource.getSaleNormalPrice();
        this.purpose = tHomeResource.getPurpose();
        this.incomeWay = tHomeResource.getIncomeWay();
        this.agent = tHomeResource.getAgent();
        this.agentPhone = tHomeResource.getAgentPhone();
        this.agentWechat = tHomeResource.getAgentWechat();
        this.del = tHomeResource.getDel();
        this.sort = tHomeResource.getSort();
        this.description = tHomeResource.getDescription();
        this.direction = tHomeResource.getDirection();
        this.loft = tHomeResource.getLoft();
        this.fitment = tHomeResource.getFitment();
        this.birthday = tHomeResource.getBirthday();
        this.trait = tHomeResource.getTrait();
        this.seeTime = tHomeResource.getSeeTime();
        this.optimization = tHomeResource.getOptimization();
        this.realSpace = tHomeResource.getRealSpace();
        this.buildStructure = tHomeResource.getBuildStructure();
        this.stairsRatio = tHomeResource.getStairsRatio();
        this.heating = tHomeResource.getHeating();
        this.elevator = tHomeResource.getElevator();
        this.hangoutTime = tHomeResource.getHangoutTime();
        this.ownership = tHomeResource.getOwnership();
        this.lastUpdateTime = tHomeResource.getLastUpdateTime();
        this.boughtTime = tHomeResource.getBoughtTime();
        this.propertyRightAttribute = tHomeResource.getPropertyRightAttribute();
        this.pledge = tHomeResource.getPledge();
        this.lat = tHomeResource.getLat();
        this.lng = tHomeResource.getLng();
        this.buildingNumber = tHomeResource.getBuildingNumber();
        this.houseUnit = tHomeResource.getHouseUnit();
        this.agentPid = tHomeResource.getAgentPid();
        this.permit = tHomeResource.getPermit();
    }


    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Long getCommunity() {
        return community;
    }

    public void setCommunity(Long community) {
        this.community = community;
    }

    public BigDecimal getSpace() {
        return space;
    }

    public void setSpace(BigDecimal space) {
        this.space = space;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(Integer totalFloor) {
        this.totalFloor = totalFloor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public String getContactsWechat() {
        return contactsWechat;
    }

    public void setContactsWechat(String contactsWechat) {
        this.contactsWechat = contactsWechat;
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public Long getUserPid() {
        return userPid;
    }

    public void setUserPid(Long userPid) {
        this.userPid = userPid;
    }

    public Long getHouseType() {
        return houseType;
    }

    public void setHouseType(Long houseType) {
        this.houseType = houseType;
    }

    public Integer getPropertyRight() {
        return propertyRight;
    }

    public void setPropertyRight(Integer propertyRight) {
        this.propertyRight = propertyRight;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(Integer rentStatus) {
        this.rentStatus = rentStatus;
    }

    public Integer getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Integer getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    public Integer getSoilType() {
        return soilType;
    }

    public void setSoilType(Integer soilType) {
        this.soilType = soilType;
    }

    public BigDecimal getRentNormalPrice() {
        return rentNormalPrice;
    }

    public void setRentNormalPrice(BigDecimal rentNormalPrice) {
        this.rentNormalPrice = rentNormalPrice;
    }

    public BigDecimal getSaleNormalPrice() {
        return saleNormalPrice;
    }

    public void setSaleNormalPrice(BigDecimal saleNormalPrice) {
        this.saleNormalPrice = saleNormalPrice;
    }

    public Integer getPurpose() {
        return purpose;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
    }

    public String getIncomeWay() {
        return incomeWay;
    }

    public void setIncomeWay(String incomeWay) {
        this.incomeWay = incomeWay;
    }

    public Integer getAgent() {
        return agent;
    }

    public void setAgent(Integer agent) {
        this.agent = agent;
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    public String getAgentWechat() {
        return agentWechat;
    }

    public void setAgentWechat(String agentWechat) {
        this.agentWechat = agentWechat;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getLoft() {
        return loft;
    }

    public void setLoft(Integer loft) {
        this.loft = loft;
    }

    public Integer getFitment() {
        return fitment;
    }

    public void setFitment(Integer fitment) {
        this.fitment = fitment;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getTrait() {
        return trait;
    }

    public void setTrait(Integer trait) {
        this.trait = trait;
    }

    public String getSeeTime() {
        return seeTime;
    }

    public void setSeeTime(String seeTime) {
        this.seeTime = seeTime;
    }

    public Integer getOptimization() {
        return optimization;
    }

    public void setOptimization(Integer optimization) {
        this.optimization = optimization;
    }

    public BigDecimal getRealSpace() {
        return realSpace;
    }

    public void setRealSpace(BigDecimal realSpace) {
        this.realSpace = realSpace;
    }

    public Integer getBuildStructure() {
        return buildStructure;
    }

    public void setBuildStructure(Integer buildStructure) {
        this.buildStructure = buildStructure;
    }

    public String getStairsRatio() {
        return stairsRatio;
    }

    public void setStairsRatio(String stairsRatio) {
        this.stairsRatio = stairsRatio;
    }

    public Integer getHeating() {
        return heating;
    }

    public void setHeating(Integer heating) {
        this.heating = heating;
    }

    public Integer getElevator() {
        return elevator;
    }

    public void setElevator(Integer elevator) {
        this.elevator = elevator;
    }

    public Date getHangoutTime() {
        return hangoutTime;
    }

    public void setHangoutTime(Date hangoutTime) {
        this.hangoutTime = hangoutTime;
    }

    public Integer getOwnership() {
        return ownership;
    }

    public void setOwnership(Integer ownership) {
        this.ownership = ownership;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getBoughtTime() {
        return boughtTime;
    }

    public void setBoughtTime(Integer boughtTime) {
        this.boughtTime = boughtTime;
    }

    public Integer getPropertyRightAttribute() {
        return propertyRightAttribute;
    }

    public void setPropertyRightAttribute(Integer propertyRightAttribute) {
        this.propertyRightAttribute = propertyRightAttribute;
    }

    public String getPledge() {
        return pledge;
    }

    public void setPledge(String pledge) {
        this.pledge = pledge;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public Integer getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Integer buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public Integer getHouseUnit() {
        return houseUnit;
    }

    public void setHouseUnit(Integer houseUnit) {
        this.houseUnit = houseUnit;
    }

    public Long getAgentPid() {
        return agentPid;
    }

    public void setAgentPid(Long agentPid) {
        this.agentPid = agentPid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }
}
