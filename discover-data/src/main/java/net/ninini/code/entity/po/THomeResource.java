package net.ninini.code.entity.po;

import java.math.BigDecimal;
import java.util.Date;

public class THomeResource {
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

    private String description;

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
        this.address = address == null ? null : address.trim();
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone == null ? null : contactsPhone.trim();
    }

    public String getContactsWechat() {
        return contactsWechat;
    }

    public void setContactsWechat(String contactsWechat) {
        this.contactsWechat = contactsWechat == null ? null : contactsWechat.trim();
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName == null ? null : contactsName.trim();
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
        this.incomeWay = incomeWay == null ? null : incomeWay.trim();
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
        this.agentPhone = agentPhone == null ? null : agentPhone.trim();
    }

    public String getAgentWechat() {
        return agentWechat;
    }

    public void setAgentWechat(String agentWechat) {
        this.agentWechat = agentWechat == null ? null : agentWechat.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}