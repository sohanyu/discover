package net.ninini.code.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class THomeResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public THomeResourceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("community is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("community is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(Long value) {
            addCriterion("community =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(Long value) {
            addCriterion("community <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(Long value) {
            addCriterion("community >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(Long value) {
            addCriterion("community >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(Long value) {
            addCriterion("community <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(Long value) {
            addCriterion("community <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<Long> values) {
            addCriterion("community in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<Long> values) {
            addCriterion("community not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(Long value1, Long value2) {
            addCriterion("community between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(Long value1, Long value2) {
            addCriterion("community not between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andSpaceIsNull() {
            addCriterion("space is null");
            return (Criteria) this;
        }

        public Criteria andSpaceIsNotNull() {
            addCriterion("space is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceEqualTo(BigDecimal value) {
            addCriterion("space =", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotEqualTo(BigDecimal value) {
            addCriterion("space <>", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceGreaterThan(BigDecimal value) {
            addCriterion("space >", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("space >=", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceLessThan(BigDecimal value) {
            addCriterion("space <", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("space <=", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceIn(List<BigDecimal> values) {
            addCriterion("space in", values, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotIn(List<BigDecimal> values) {
            addCriterion("space not in", values, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("space between", value1, value2, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("space not between", value1, value2, "space");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIsNull() {
            addCriterion("total_floor is null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIsNotNull() {
            addCriterion("total_floor is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorEqualTo(Integer value) {
            addCriterion("total_floor =", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotEqualTo(Integer value) {
            addCriterion("total_floor <>", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorGreaterThan(Integer value) {
            addCriterion("total_floor >", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_floor >=", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorLessThan(Integer value) {
            addCriterion("total_floor <", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorLessThanOrEqualTo(Integer value) {
            addCriterion("total_floor <=", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIn(List<Integer> values) {
            addCriterion("total_floor in", values, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotIn(List<Integer> values) {
            addCriterion("total_floor not in", values, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorBetween(Integer value1, Integer value2) {
            addCriterion("total_floor between", value1, value2, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("total_floor not between", value1, value2, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNull() {
            addCriterion("contacts_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNotNull() {
            addCriterion("contacts_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneEqualTo(String value) {
            addCriterion("contacts_phone =", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotEqualTo(String value) {
            addCriterion("contacts_phone <>", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThan(String value) {
            addCriterion("contacts_phone >", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_phone >=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThan(String value) {
            addCriterion("contacts_phone <", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThanOrEqualTo(String value) {
            addCriterion("contacts_phone <=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLike(String value) {
            addCriterion("contacts_phone like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotLike(String value) {
            addCriterion("contacts_phone not like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIn(List<String> values) {
            addCriterion("contacts_phone in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotIn(List<String> values) {
            addCriterion("contacts_phone not in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneBetween(String value1, String value2) {
            addCriterion("contacts_phone between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotBetween(String value1, String value2) {
            addCriterion("contacts_phone not between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsWechatIsNull() {
            addCriterion("contacts_wechat is null");
            return (Criteria) this;
        }

        public Criteria andContactsWechatIsNotNull() {
            addCriterion("contacts_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andContactsWechatEqualTo(String value) {
            addCriterion("contacts_wechat =", value, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNotEqualTo(String value) {
            addCriterion("contacts_wechat <>", value, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsWechatGreaterThan(String value) {
            addCriterion("contacts_wechat >", value, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsWechatGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_wechat >=", value, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsWechatLessThan(String value) {
            addCriterion("contacts_wechat <", value, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsWechatLessThanOrEqualTo(String value) {
            addCriterion("contacts_wechat <=", value, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsWechatLike(String value) {
            addCriterion("contacts_wechat like", value, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNotLike(String value) {
            addCriterion("contacts_wechat not like", value, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsWechatIn(List<String> values) {
            addCriterion("contacts_wechat in", values, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNotIn(List<String> values) {
            addCriterion("contacts_wechat not in", values, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsWechatBetween(String value1, String value2) {
            addCriterion("contacts_wechat between", value1, value2, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNotBetween(String value1, String value2) {
            addCriterion("contacts_wechat not between", value1, value2, "contactsWechat");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNull() {
            addCriterion("contacts_name is null");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNotNull() {
            addCriterion("contacts_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNameEqualTo(String value) {
            addCriterion("contacts_name =", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotEqualTo(String value) {
            addCriterion("contacts_name <>", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThan(String value) {
            addCriterion("contacts_name >", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_name >=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThan(String value) {
            addCriterion("contacts_name <", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThanOrEqualTo(String value) {
            addCriterion("contacts_name <=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLike(String value) {
            addCriterion("contacts_name like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotLike(String value) {
            addCriterion("contacts_name not like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameIn(List<String> values) {
            addCriterion("contacts_name in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotIn(List<String> values) {
            addCriterion("contacts_name not in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameBetween(String value1, String value2) {
            addCriterion("contacts_name between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotBetween(String value1, String value2) {
            addCriterion("contacts_name not between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andUserPidIsNull() {
            addCriterion("user_pid is null");
            return (Criteria) this;
        }

        public Criteria andUserPidIsNotNull() {
            addCriterion("user_pid is not null");
            return (Criteria) this;
        }

        public Criteria andUserPidEqualTo(Long value) {
            addCriterion("user_pid =", value, "userPid");
            return (Criteria) this;
        }

        public Criteria andUserPidNotEqualTo(Long value) {
            addCriterion("user_pid <>", value, "userPid");
            return (Criteria) this;
        }

        public Criteria andUserPidGreaterThan(Long value) {
            addCriterion("user_pid >", value, "userPid");
            return (Criteria) this;
        }

        public Criteria andUserPidGreaterThanOrEqualTo(Long value) {
            addCriterion("user_pid >=", value, "userPid");
            return (Criteria) this;
        }

        public Criteria andUserPidLessThan(Long value) {
            addCriterion("user_pid <", value, "userPid");
            return (Criteria) this;
        }

        public Criteria andUserPidLessThanOrEqualTo(Long value) {
            addCriterion("user_pid <=", value, "userPid");
            return (Criteria) this;
        }

        public Criteria andUserPidIn(List<Long> values) {
            addCriterion("user_pid in", values, "userPid");
            return (Criteria) this;
        }

        public Criteria andUserPidNotIn(List<Long> values) {
            addCriterion("user_pid not in", values, "userPid");
            return (Criteria) this;
        }

        public Criteria andUserPidBetween(Long value1, Long value2) {
            addCriterion("user_pid between", value1, value2, "userPid");
            return (Criteria) this;
        }

        public Criteria andUserPidNotBetween(Long value1, Long value2) {
            addCriterion("user_pid not between", value1, value2, "userPid");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(Long value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(Long value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(Long value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(Long value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(Long value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<Long> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<Long> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(Long value1, Long value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(Long value1, Long value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andPropertyRightIsNull() {
            addCriterion("property_right is null");
            return (Criteria) this;
        }

        public Criteria andPropertyRightIsNotNull() {
            addCriterion("property_right is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyRightEqualTo(Integer value) {
            addCriterion("property_right =", value, "propertyRight");
            return (Criteria) this;
        }

        public Criteria andPropertyRightNotEqualTo(Integer value) {
            addCriterion("property_right <>", value, "propertyRight");
            return (Criteria) this;
        }

        public Criteria andPropertyRightGreaterThan(Integer value) {
            addCriterion("property_right >", value, "propertyRight");
            return (Criteria) this;
        }

        public Criteria andPropertyRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("property_right >=", value, "propertyRight");
            return (Criteria) this;
        }

        public Criteria andPropertyRightLessThan(Integer value) {
            addCriterion("property_right <", value, "propertyRight");
            return (Criteria) this;
        }

        public Criteria andPropertyRightLessThanOrEqualTo(Integer value) {
            addCriterion("property_right <=", value, "propertyRight");
            return (Criteria) this;
        }

        public Criteria andPropertyRightIn(List<Integer> values) {
            addCriterion("property_right in", values, "propertyRight");
            return (Criteria) this;
        }

        public Criteria andPropertyRightNotIn(List<Integer> values) {
            addCriterion("property_right not in", values, "propertyRight");
            return (Criteria) this;
        }

        public Criteria andPropertyRightBetween(Integer value1, Integer value2) {
            addCriterion("property_right between", value1, value2, "propertyRight");
            return (Criteria) this;
        }

        public Criteria andPropertyRightNotBetween(Integer value1, Integer value2) {
            addCriterion("property_right not between", value1, value2, "propertyRight");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRentStatusIsNull() {
            addCriterion("rent_status is null");
            return (Criteria) this;
        }

        public Criteria andRentStatusIsNotNull() {
            addCriterion("rent_status is not null");
            return (Criteria) this;
        }

        public Criteria andRentStatusEqualTo(Integer value) {
            addCriterion("rent_status =", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotEqualTo(Integer value) {
            addCriterion("rent_status <>", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusGreaterThan(Integer value) {
            addCriterion("rent_status >", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_status >=", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusLessThan(Integer value) {
            addCriterion("rent_status <", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("rent_status <=", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusIn(List<Integer> values) {
            addCriterion("rent_status in", values, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotIn(List<Integer> values) {
            addCriterion("rent_status not in", values, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusBetween(Integer value1, Integer value2) {
            addCriterion("rent_status between", value1, value2, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_status not between", value1, value2, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNull() {
            addCriterion("sale_status is null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNotNull() {
            addCriterion("sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusEqualTo(Integer value) {
            addCriterion("sale_status =", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotEqualTo(Integer value) {
            addCriterion("sale_status <>", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThan(Integer value) {
            addCriterion("sale_status >", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_status >=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThan(Integer value) {
            addCriterion("sale_status <", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sale_status <=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIn(List<Integer> values) {
            addCriterion("sale_status in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotIn(List<Integer> values) {
            addCriterion("sale_status not in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusBetween(Integer value1, Integer value2) {
            addCriterion("sale_status between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_status not between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusIsNull() {
            addCriterion("new_status is null");
            return (Criteria) this;
        }

        public Criteria andNewStatusIsNotNull() {
            addCriterion("new_status is not null");
            return (Criteria) this;
        }

        public Criteria andNewStatusEqualTo(Integer value) {
            addCriterion("new_status =", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotEqualTo(Integer value) {
            addCriterion("new_status <>", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusGreaterThan(Integer value) {
            addCriterion("new_status >", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_status >=", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusLessThan(Integer value) {
            addCriterion("new_status <", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("new_status <=", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusIn(List<Integer> values) {
            addCriterion("new_status in", values, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotIn(List<Integer> values) {
            addCriterion("new_status not in", values, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusBetween(Integer value1, Integer value2) {
            addCriterion("new_status between", value1, value2, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("new_status not between", value1, value2, "newStatus");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIsNull() {
            addCriterion("soil_type is null");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIsNotNull() {
            addCriterion("soil_type is not null");
            return (Criteria) this;
        }

        public Criteria andSoilTypeEqualTo(Integer value) {
            addCriterion("soil_type =", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeNotEqualTo(Integer value) {
            addCriterion("soil_type <>", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeGreaterThan(Integer value) {
            addCriterion("soil_type >", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("soil_type >=", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeLessThan(Integer value) {
            addCriterion("soil_type <", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeLessThanOrEqualTo(Integer value) {
            addCriterion("soil_type <=", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIn(List<Integer> values) {
            addCriterion("soil_type in", values, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeNotIn(List<Integer> values) {
            addCriterion("soil_type not in", values, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeBetween(Integer value1, Integer value2) {
            addCriterion("soil_type between", value1, value2, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("soil_type not between", value1, value2, "soilType");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceIsNull() {
            addCriterion("rent_normal_price is null");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceIsNotNull() {
            addCriterion("rent_normal_price is not null");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceEqualTo(BigDecimal value) {
            addCriterion("rent_normal_price =", value, "rentNormalPrice");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceNotEqualTo(BigDecimal value) {
            addCriterion("rent_normal_price <>", value, "rentNormalPrice");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceGreaterThan(BigDecimal value) {
            addCriterion("rent_normal_price >", value, "rentNormalPrice");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rent_normal_price >=", value, "rentNormalPrice");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceLessThan(BigDecimal value) {
            addCriterion("rent_normal_price <", value, "rentNormalPrice");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rent_normal_price <=", value, "rentNormalPrice");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceIn(List<BigDecimal> values) {
            addCriterion("rent_normal_price in", values, "rentNormalPrice");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceNotIn(List<BigDecimal> values) {
            addCriterion("rent_normal_price not in", values, "rentNormalPrice");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent_normal_price between", value1, value2, "rentNormalPrice");
            return (Criteria) this;
        }

        public Criteria andRentNormalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent_normal_price not between", value1, value2, "rentNormalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceIsNull() {
            addCriterion("sale_normal_price is null");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceIsNotNull() {
            addCriterion("sale_normal_price is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceEqualTo(BigDecimal value) {
            addCriterion("sale_normal_price =", value, "saleNormalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceNotEqualTo(BigDecimal value) {
            addCriterion("sale_normal_price <>", value, "saleNormalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceGreaterThan(BigDecimal value) {
            addCriterion("sale_normal_price >", value, "saleNormalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_normal_price >=", value, "saleNormalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceLessThan(BigDecimal value) {
            addCriterion("sale_normal_price <", value, "saleNormalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_normal_price <=", value, "saleNormalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceIn(List<BigDecimal> values) {
            addCriterion("sale_normal_price in", values, "saleNormalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceNotIn(List<BigDecimal> values) {
            addCriterion("sale_normal_price not in", values, "saleNormalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_normal_price between", value1, value2, "saleNormalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleNormalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_normal_price not between", value1, value2, "saleNormalPrice");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(Integer value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(Integer value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(Integer value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(Integer value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(Integer value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(Integer value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<Integer> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<Integer> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(Integer value1, Integer value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(Integer value1, Integer value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andIncomeWayIsNull() {
            addCriterion("income_way is null");
            return (Criteria) this;
        }

        public Criteria andIncomeWayIsNotNull() {
            addCriterion("income_way is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeWayEqualTo(String value) {
            addCriterion("income_way =", value, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andIncomeWayNotEqualTo(String value) {
            addCriterion("income_way <>", value, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andIncomeWayGreaterThan(String value) {
            addCriterion("income_way >", value, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andIncomeWayGreaterThanOrEqualTo(String value) {
            addCriterion("income_way >=", value, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andIncomeWayLessThan(String value) {
            addCriterion("income_way <", value, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andIncomeWayLessThanOrEqualTo(String value) {
            addCriterion("income_way <=", value, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andIncomeWayLike(String value) {
            addCriterion("income_way like", value, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andIncomeWayNotLike(String value) {
            addCriterion("income_way not like", value, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andIncomeWayIn(List<String> values) {
            addCriterion("income_way in", values, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andIncomeWayNotIn(List<String> values) {
            addCriterion("income_way not in", values, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andIncomeWayBetween(String value1, String value2) {
            addCriterion("income_way between", value1, value2, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andIncomeWayNotBetween(String value1, String value2) {
            addCriterion("income_way not between", value1, value2, "incomeWay");
            return (Criteria) this;
        }

        public Criteria andAgentIsNull() {
            addCriterion("agent is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("agent is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(Integer value) {
            addCriterion("agent =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(Integer value) {
            addCriterion("agent <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(Integer value) {
            addCriterion("agent >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(Integer value) {
            addCriterion("agent <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(Integer value) {
            addCriterion("agent <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<Integer> values) {
            addCriterion("agent in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<Integer> values) {
            addCriterion("agent not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(Integer value1, Integer value2) {
            addCriterion("agent between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(Integer value1, Integer value2) {
            addCriterion("agent not between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneIsNull() {
            addCriterion("agent_phone is null");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneIsNotNull() {
            addCriterion("agent_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneEqualTo(String value) {
            addCriterion("agent_phone =", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneNotEqualTo(String value) {
            addCriterion("agent_phone <>", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneGreaterThan(String value) {
            addCriterion("agent_phone >", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("agent_phone >=", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneLessThan(String value) {
            addCriterion("agent_phone <", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneLessThanOrEqualTo(String value) {
            addCriterion("agent_phone <=", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneLike(String value) {
            addCriterion("agent_phone like", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneNotLike(String value) {
            addCriterion("agent_phone not like", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneIn(List<String> values) {
            addCriterion("agent_phone in", values, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneNotIn(List<String> values) {
            addCriterion("agent_phone not in", values, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneBetween(String value1, String value2) {
            addCriterion("agent_phone between", value1, value2, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneNotBetween(String value1, String value2) {
            addCriterion("agent_phone not between", value1, value2, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentWechatIsNull() {
            addCriterion("agent_wechat is null");
            return (Criteria) this;
        }

        public Criteria andAgentWechatIsNotNull() {
            addCriterion("agent_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andAgentWechatEqualTo(String value) {
            addCriterion("agent_wechat =", value, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andAgentWechatNotEqualTo(String value) {
            addCriterion("agent_wechat <>", value, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andAgentWechatGreaterThan(String value) {
            addCriterion("agent_wechat >", value, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andAgentWechatGreaterThanOrEqualTo(String value) {
            addCriterion("agent_wechat >=", value, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andAgentWechatLessThan(String value) {
            addCriterion("agent_wechat <", value, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andAgentWechatLessThanOrEqualTo(String value) {
            addCriterion("agent_wechat <=", value, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andAgentWechatLike(String value) {
            addCriterion("agent_wechat like", value, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andAgentWechatNotLike(String value) {
            addCriterion("agent_wechat not like", value, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andAgentWechatIn(List<String> values) {
            addCriterion("agent_wechat in", values, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andAgentWechatNotIn(List<String> values) {
            addCriterion("agent_wechat not in", values, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andAgentWechatBetween(String value1, String value2) {
            addCriterion("agent_wechat between", value1, value2, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andAgentWechatNotBetween(String value1, String value2) {
            addCriterion("agent_wechat not between", value1, value2, "agentWechat");
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(Integer value) {
            addCriterion("del =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(Integer value) {
            addCriterion("del <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(Integer value) {
            addCriterion("del >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("del >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(Integer value) {
            addCriterion("del <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(Integer value) {
            addCriterion("del <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<Integer> values) {
            addCriterion("del in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<Integer> values) {
            addCriterion("del not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(Integer value1, Integer value2) {
            addCriterion("del between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(Integer value1, Integer value2) {
            addCriterion("del not between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(Integer value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(Integer value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(Integer value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(Integer value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<Integer> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<Integer> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(Integer value1, Integer value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andLoftIsNull() {
            addCriterion("loft is null");
            return (Criteria) this;
        }

        public Criteria andLoftIsNotNull() {
            addCriterion("loft is not null");
            return (Criteria) this;
        }

        public Criteria andLoftEqualTo(Integer value) {
            addCriterion("loft =", value, "loft");
            return (Criteria) this;
        }

        public Criteria andLoftNotEqualTo(Integer value) {
            addCriterion("loft <>", value, "loft");
            return (Criteria) this;
        }

        public Criteria andLoftGreaterThan(Integer value) {
            addCriterion("loft >", value, "loft");
            return (Criteria) this;
        }

        public Criteria andLoftGreaterThanOrEqualTo(Integer value) {
            addCriterion("loft >=", value, "loft");
            return (Criteria) this;
        }

        public Criteria andLoftLessThan(Integer value) {
            addCriterion("loft <", value, "loft");
            return (Criteria) this;
        }

        public Criteria andLoftLessThanOrEqualTo(Integer value) {
            addCriterion("loft <=", value, "loft");
            return (Criteria) this;
        }

        public Criteria andLoftIn(List<Integer> values) {
            addCriterion("loft in", values, "loft");
            return (Criteria) this;
        }

        public Criteria andLoftNotIn(List<Integer> values) {
            addCriterion("loft not in", values, "loft");
            return (Criteria) this;
        }

        public Criteria andLoftBetween(Integer value1, Integer value2) {
            addCriterion("loft between", value1, value2, "loft");
            return (Criteria) this;
        }

        public Criteria andLoftNotBetween(Integer value1, Integer value2) {
            addCriterion("loft not between", value1, value2, "loft");
            return (Criteria) this;
        }

        public Criteria andFitmentIsNull() {
            addCriterion("fitment is null");
            return (Criteria) this;
        }

        public Criteria andFitmentIsNotNull() {
            addCriterion("fitment is not null");
            return (Criteria) this;
        }

        public Criteria andFitmentEqualTo(Integer value) {
            addCriterion("fitment =", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentNotEqualTo(Integer value) {
            addCriterion("fitment <>", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentGreaterThan(Integer value) {
            addCriterion("fitment >", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("fitment >=", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentLessThan(Integer value) {
            addCriterion("fitment <", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentLessThanOrEqualTo(Integer value) {
            addCriterion("fitment <=", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentIn(List<Integer> values) {
            addCriterion("fitment in", values, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentNotIn(List<Integer> values) {
            addCriterion("fitment not in", values, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentBetween(Integer value1, Integer value2) {
            addCriterion("fitment between", value1, value2, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentNotBetween(Integer value1, Integer value2) {
            addCriterion("fitment not between", value1, value2, "fitment");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andTraitIsNull() {
            addCriterion("trait is null");
            return (Criteria) this;
        }

        public Criteria andTraitIsNotNull() {
            addCriterion("trait is not null");
            return (Criteria) this;
        }

        public Criteria andTraitEqualTo(Integer value) {
            addCriterion("trait =", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitNotEqualTo(Integer value) {
            addCriterion("trait <>", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitGreaterThan(Integer value) {
            addCriterion("trait >", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitGreaterThanOrEqualTo(Integer value) {
            addCriterion("trait >=", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitLessThan(Integer value) {
            addCriterion("trait <", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitLessThanOrEqualTo(Integer value) {
            addCriterion("trait <=", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitIn(List<Integer> values) {
            addCriterion("trait in", values, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitNotIn(List<Integer> values) {
            addCriterion("trait not in", values, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitBetween(Integer value1, Integer value2) {
            addCriterion("trait between", value1, value2, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitNotBetween(Integer value1, Integer value2) {
            addCriterion("trait not between", value1, value2, "trait");
            return (Criteria) this;
        }

        public Criteria andSeeTimeIsNull() {
            addCriterion("see_time is null");
            return (Criteria) this;
        }

        public Criteria andSeeTimeIsNotNull() {
            addCriterion("see_time is not null");
            return (Criteria) this;
        }

        public Criteria andSeeTimeEqualTo(String value) {
            addCriterion("see_time =", value, "seeTime");
            return (Criteria) this;
        }

        public Criteria andSeeTimeNotEqualTo(String value) {
            addCriterion("see_time <>", value, "seeTime");
            return (Criteria) this;
        }

        public Criteria andSeeTimeGreaterThan(String value) {
            addCriterion("see_time >", value, "seeTime");
            return (Criteria) this;
        }

        public Criteria andSeeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("see_time >=", value, "seeTime");
            return (Criteria) this;
        }

        public Criteria andSeeTimeLessThan(String value) {
            addCriterion("see_time <", value, "seeTime");
            return (Criteria) this;
        }

        public Criteria andSeeTimeLessThanOrEqualTo(String value) {
            addCriterion("see_time <=", value, "seeTime");
            return (Criteria) this;
        }

        public Criteria andSeeTimeLike(String value) {
            addCriterion("see_time like", value, "seeTime");
            return (Criteria) this;
        }

        public Criteria andSeeTimeNotLike(String value) {
            addCriterion("see_time not like", value, "seeTime");
            return (Criteria) this;
        }

        public Criteria andSeeTimeIn(List<String> values) {
            addCriterion("see_time in", values, "seeTime");
            return (Criteria) this;
        }

        public Criteria andSeeTimeNotIn(List<String> values) {
            addCriterion("see_time not in", values, "seeTime");
            return (Criteria) this;
        }

        public Criteria andSeeTimeBetween(String value1, String value2) {
            addCriterion("see_time between", value1, value2, "seeTime");
            return (Criteria) this;
        }

        public Criteria andSeeTimeNotBetween(String value1, String value2) {
            addCriterion("see_time not between", value1, value2, "seeTime");
            return (Criteria) this;
        }

        public Criteria andOptimizationIsNull() {
            addCriterion("optimization is null");
            return (Criteria) this;
        }

        public Criteria andOptimizationIsNotNull() {
            addCriterion("optimization is not null");
            return (Criteria) this;
        }

        public Criteria andOptimizationEqualTo(Integer value) {
            addCriterion("optimization =", value, "optimization");
            return (Criteria) this;
        }

        public Criteria andOptimizationNotEqualTo(Integer value) {
            addCriterion("optimization <>", value, "optimization");
            return (Criteria) this;
        }

        public Criteria andOptimizationGreaterThan(Integer value) {
            addCriterion("optimization >", value, "optimization");
            return (Criteria) this;
        }

        public Criteria andOptimizationGreaterThanOrEqualTo(Integer value) {
            addCriterion("optimization >=", value, "optimization");
            return (Criteria) this;
        }

        public Criteria andOptimizationLessThan(Integer value) {
            addCriterion("optimization <", value, "optimization");
            return (Criteria) this;
        }

        public Criteria andOptimizationLessThanOrEqualTo(Integer value) {
            addCriterion("optimization <=", value, "optimization");
            return (Criteria) this;
        }

        public Criteria andOptimizationIn(List<Integer> values) {
            addCriterion("optimization in", values, "optimization");
            return (Criteria) this;
        }

        public Criteria andOptimizationNotIn(List<Integer> values) {
            addCriterion("optimization not in", values, "optimization");
            return (Criteria) this;
        }

        public Criteria andOptimizationBetween(Integer value1, Integer value2) {
            addCriterion("optimization between", value1, value2, "optimization");
            return (Criteria) this;
        }

        public Criteria andOptimizationNotBetween(Integer value1, Integer value2) {
            addCriterion("optimization not between", value1, value2, "optimization");
            return (Criteria) this;
        }

        public Criteria andRealSpaceIsNull() {
            addCriterion("real_space is null");
            return (Criteria) this;
        }

        public Criteria andRealSpaceIsNotNull() {
            addCriterion("real_space is not null");
            return (Criteria) this;
        }

        public Criteria andRealSpaceEqualTo(BigDecimal value) {
            addCriterion("real_space =", value, "realSpace");
            return (Criteria) this;
        }

        public Criteria andRealSpaceNotEqualTo(BigDecimal value) {
            addCriterion("real_space <>", value, "realSpace");
            return (Criteria) this;
        }

        public Criteria andRealSpaceGreaterThan(BigDecimal value) {
            addCriterion("real_space >", value, "realSpace");
            return (Criteria) this;
        }

        public Criteria andRealSpaceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_space >=", value, "realSpace");
            return (Criteria) this;
        }

        public Criteria andRealSpaceLessThan(BigDecimal value) {
            addCriterion("real_space <", value, "realSpace");
            return (Criteria) this;
        }

        public Criteria andRealSpaceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_space <=", value, "realSpace");
            return (Criteria) this;
        }

        public Criteria andRealSpaceIn(List<BigDecimal> values) {
            addCriterion("real_space in", values, "realSpace");
            return (Criteria) this;
        }

        public Criteria andRealSpaceNotIn(List<BigDecimal> values) {
            addCriterion("real_space not in", values, "realSpace");
            return (Criteria) this;
        }

        public Criteria andRealSpaceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_space between", value1, value2, "realSpace");
            return (Criteria) this;
        }

        public Criteria andRealSpaceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_space not between", value1, value2, "realSpace");
            return (Criteria) this;
        }

        public Criteria andBuildStructureIsNull() {
            addCriterion("build_structure is null");
            return (Criteria) this;
        }

        public Criteria andBuildStructureIsNotNull() {
            addCriterion("build_structure is not null");
            return (Criteria) this;
        }

        public Criteria andBuildStructureEqualTo(Integer value) {
            addCriterion("build_structure =", value, "buildStructure");
            return (Criteria) this;
        }

        public Criteria andBuildStructureNotEqualTo(Integer value) {
            addCriterion("build_structure <>", value, "buildStructure");
            return (Criteria) this;
        }

        public Criteria andBuildStructureGreaterThan(Integer value) {
            addCriterion("build_structure >", value, "buildStructure");
            return (Criteria) this;
        }

        public Criteria andBuildStructureGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_structure >=", value, "buildStructure");
            return (Criteria) this;
        }

        public Criteria andBuildStructureLessThan(Integer value) {
            addCriterion("build_structure <", value, "buildStructure");
            return (Criteria) this;
        }

        public Criteria andBuildStructureLessThanOrEqualTo(Integer value) {
            addCriterion("build_structure <=", value, "buildStructure");
            return (Criteria) this;
        }

        public Criteria andBuildStructureIn(List<Integer> values) {
            addCriterion("build_structure in", values, "buildStructure");
            return (Criteria) this;
        }

        public Criteria andBuildStructureNotIn(List<Integer> values) {
            addCriterion("build_structure not in", values, "buildStructure");
            return (Criteria) this;
        }

        public Criteria andBuildStructureBetween(Integer value1, Integer value2) {
            addCriterion("build_structure between", value1, value2, "buildStructure");
            return (Criteria) this;
        }

        public Criteria andBuildStructureNotBetween(Integer value1, Integer value2) {
            addCriterion("build_structure not between", value1, value2, "buildStructure");
            return (Criteria) this;
        }

        public Criteria andStairsRatioIsNull() {
            addCriterion("stairs_ratio is null");
            return (Criteria) this;
        }

        public Criteria andStairsRatioIsNotNull() {
            addCriterion("stairs_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andStairsRatioEqualTo(String value) {
            addCriterion("stairs_ratio =", value, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andStairsRatioNotEqualTo(String value) {
            addCriterion("stairs_ratio <>", value, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andStairsRatioGreaterThan(String value) {
            addCriterion("stairs_ratio >", value, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andStairsRatioGreaterThanOrEqualTo(String value) {
            addCriterion("stairs_ratio >=", value, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andStairsRatioLessThan(String value) {
            addCriterion("stairs_ratio <", value, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andStairsRatioLessThanOrEqualTo(String value) {
            addCriterion("stairs_ratio <=", value, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andStairsRatioLike(String value) {
            addCriterion("stairs_ratio like", value, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andStairsRatioNotLike(String value) {
            addCriterion("stairs_ratio not like", value, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andStairsRatioIn(List<String> values) {
            addCriterion("stairs_ratio in", values, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andStairsRatioNotIn(List<String> values) {
            addCriterion("stairs_ratio not in", values, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andStairsRatioBetween(String value1, String value2) {
            addCriterion("stairs_ratio between", value1, value2, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andStairsRatioNotBetween(String value1, String value2) {
            addCriterion("stairs_ratio not between", value1, value2, "stairsRatio");
            return (Criteria) this;
        }

        public Criteria andHeatingIsNull() {
            addCriterion("heating is null");
            return (Criteria) this;
        }

        public Criteria andHeatingIsNotNull() {
            addCriterion("heating is not null");
            return (Criteria) this;
        }

        public Criteria andHeatingEqualTo(Integer value) {
            addCriterion("heating =", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotEqualTo(Integer value) {
            addCriterion("heating <>", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThan(Integer value) {
            addCriterion("heating >", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("heating >=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThan(Integer value) {
            addCriterion("heating <", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThanOrEqualTo(Integer value) {
            addCriterion("heating <=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingIn(List<Integer> values) {
            addCriterion("heating in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotIn(List<Integer> values) {
            addCriterion("heating not in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingBetween(Integer value1, Integer value2) {
            addCriterion("heating between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotBetween(Integer value1, Integer value2) {
            addCriterion("heating not between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNull() {
            addCriterion("elevator is null");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNotNull() {
            addCriterion("elevator is not null");
            return (Criteria) this;
        }

        public Criteria andElevatorEqualTo(Integer value) {
            addCriterion("elevator =", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotEqualTo(Integer value) {
            addCriterion("elevator <>", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThan(Integer value) {
            addCriterion("elevator >", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("elevator >=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThan(Integer value) {
            addCriterion("elevator <", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThanOrEqualTo(Integer value) {
            addCriterion("elevator <=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorIn(List<Integer> values) {
            addCriterion("elevator in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotIn(List<Integer> values) {
            addCriterion("elevator not in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorBetween(Integer value1, Integer value2) {
            addCriterion("elevator between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotBetween(Integer value1, Integer value2) {
            addCriterion("elevator not between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeIsNull() {
            addCriterion("hangout_time is null");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeIsNotNull() {
            addCriterion("hangout_time is not null");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeEqualTo(Date value) {
            addCriterion("hangout_time =", value, "hangoutTime");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeNotEqualTo(Date value) {
            addCriterion("hangout_time <>", value, "hangoutTime");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeGreaterThan(Date value) {
            addCriterion("hangout_time >", value, "hangoutTime");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hangout_time >=", value, "hangoutTime");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeLessThan(Date value) {
            addCriterion("hangout_time <", value, "hangoutTime");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeLessThanOrEqualTo(Date value) {
            addCriterion("hangout_time <=", value, "hangoutTime");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeIn(List<Date> values) {
            addCriterion("hangout_time in", values, "hangoutTime");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeNotIn(List<Date> values) {
            addCriterion("hangout_time not in", values, "hangoutTime");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeBetween(Date value1, Date value2) {
            addCriterion("hangout_time between", value1, value2, "hangoutTime");
            return (Criteria) this;
        }

        public Criteria andHangoutTimeNotBetween(Date value1, Date value2) {
            addCriterion("hangout_time not between", value1, value2, "hangoutTime");
            return (Criteria) this;
        }

        public Criteria andOwnershipIsNull() {
            addCriterion("ownership is null");
            return (Criteria) this;
        }

        public Criteria andOwnershipIsNotNull() {
            addCriterion("ownership is not null");
            return (Criteria) this;
        }

        public Criteria andOwnershipEqualTo(Integer value) {
            addCriterion("ownership =", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotEqualTo(Integer value) {
            addCriterion("ownership <>", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipGreaterThan(Integer value) {
            addCriterion("ownership >", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipGreaterThanOrEqualTo(Integer value) {
            addCriterion("ownership >=", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLessThan(Integer value) {
            addCriterion("ownership <", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLessThanOrEqualTo(Integer value) {
            addCriterion("ownership <=", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipIn(List<Integer> values) {
            addCriterion("ownership in", values, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotIn(List<Integer> values) {
            addCriterion("ownership not in", values, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipBetween(Integer value1, Integer value2) {
            addCriterion("ownership between", value1, value2, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotBetween(Integer value1, Integer value2) {
            addCriterion("ownership not between", value1, value2, "ownership");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeIsNull() {
            addCriterion("bought_time is null");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeIsNotNull() {
            addCriterion("bought_time is not null");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeEqualTo(Integer value) {
            addCriterion("bought_time =", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeNotEqualTo(Integer value) {
            addCriterion("bought_time <>", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeGreaterThan(Integer value) {
            addCriterion("bought_time >", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bought_time >=", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeLessThan(Integer value) {
            addCriterion("bought_time <", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeLessThanOrEqualTo(Integer value) {
            addCriterion("bought_time <=", value, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeIn(List<Integer> values) {
            addCriterion("bought_time in", values, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeNotIn(List<Integer> values) {
            addCriterion("bought_time not in", values, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeBetween(Integer value1, Integer value2) {
            addCriterion("bought_time between", value1, value2, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andBoughtTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("bought_time not between", value1, value2, "boughtTime");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeIsNull() {
            addCriterion("property_right_attribute is null");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeIsNotNull() {
            addCriterion("property_right_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeEqualTo(Integer value) {
            addCriterion("property_right_attribute =", value, "propertyRightAttribute");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeNotEqualTo(Integer value) {
            addCriterion("property_right_attribute <>", value, "propertyRightAttribute");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeGreaterThan(Integer value) {
            addCriterion("property_right_attribute >", value, "propertyRightAttribute");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeGreaterThanOrEqualTo(Integer value) {
            addCriterion("property_right_attribute >=", value, "propertyRightAttribute");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeLessThan(Integer value) {
            addCriterion("property_right_attribute <", value, "propertyRightAttribute");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeLessThanOrEqualTo(Integer value) {
            addCriterion("property_right_attribute <=", value, "propertyRightAttribute");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeIn(List<Integer> values) {
            addCriterion("property_right_attribute in", values, "propertyRightAttribute");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeNotIn(List<Integer> values) {
            addCriterion("property_right_attribute not in", values, "propertyRightAttribute");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeBetween(Integer value1, Integer value2) {
            addCriterion("property_right_attribute between", value1, value2, "propertyRightAttribute");
            return (Criteria) this;
        }

        public Criteria andPropertyRightAttributeNotBetween(Integer value1, Integer value2) {
            addCriterion("property_right_attribute not between", value1, value2, "propertyRightAttribute");
            return (Criteria) this;
        }

        public Criteria andPledgeIsNull() {
            addCriterion("pledge is null");
            return (Criteria) this;
        }

        public Criteria andPledgeIsNotNull() {
            addCriterion("pledge is not null");
            return (Criteria) this;
        }

        public Criteria andPledgeEqualTo(String value) {
            addCriterion("pledge =", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeNotEqualTo(String value) {
            addCriterion("pledge <>", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeGreaterThan(String value) {
            addCriterion("pledge >", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeGreaterThanOrEqualTo(String value) {
            addCriterion("pledge >=", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeLessThan(String value) {
            addCriterion("pledge <", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeLessThanOrEqualTo(String value) {
            addCriterion("pledge <=", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeLike(String value) {
            addCriterion("pledge like", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeNotLike(String value) {
            addCriterion("pledge not like", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeIn(List<String> values) {
            addCriterion("pledge in", values, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeNotIn(List<String> values) {
            addCriterion("pledge not in", values, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeBetween(String value1, String value2) {
            addCriterion("pledge between", value1, value2, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeNotBetween(String value1, String value2) {
            addCriterion("pledge not between", value1, value2, "pledge");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(BigDecimal value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(BigDecimal value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(BigDecimal value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(BigDecimal value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<BigDecimal> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<BigDecimal> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberIsNull() {
            addCriterion("building_number is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberIsNotNull() {
            addCriterion("building_number is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberEqualTo(Integer value) {
            addCriterion("building_number =", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberNotEqualTo(Integer value) {
            addCriterion("building_number <>", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberGreaterThan(Integer value) {
            addCriterion("building_number >", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("building_number >=", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberLessThan(Integer value) {
            addCriterion("building_number <", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("building_number <=", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberIn(List<Integer> values) {
            addCriterion("building_number in", values, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberNotIn(List<Integer> values) {
            addCriterion("building_number not in", values, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberBetween(Integer value1, Integer value2) {
            addCriterion("building_number between", value1, value2, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("building_number not between", value1, value2, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andHouseUnitIsNull() {
            addCriterion("house_unit is null");
            return (Criteria) this;
        }

        public Criteria andHouseUnitIsNotNull() {
            addCriterion("house_unit is not null");
            return (Criteria) this;
        }

        public Criteria andHouseUnitEqualTo(Integer value) {
            addCriterion("house_unit =", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitNotEqualTo(Integer value) {
            addCriterion("house_unit <>", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitGreaterThan(Integer value) {
            addCriterion("house_unit >", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_unit >=", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitLessThan(Integer value) {
            addCriterion("house_unit <", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitLessThanOrEqualTo(Integer value) {
            addCriterion("house_unit <=", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitIn(List<Integer> values) {
            addCriterion("house_unit in", values, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitNotIn(List<Integer> values) {
            addCriterion("house_unit not in", values, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitBetween(Integer value1, Integer value2) {
            addCriterion("house_unit between", value1, value2, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("house_unit not between", value1, value2, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andAgentPidIsNull() {
            addCriterion("agent_pid is null");
            return (Criteria) this;
        }

        public Criteria andAgentPidIsNotNull() {
            addCriterion("agent_pid is not null");
            return (Criteria) this;
        }

        public Criteria andAgentPidEqualTo(Long value) {
            addCriterion("agent_pid =", value, "agentPid");
            return (Criteria) this;
        }

        public Criteria andAgentPidNotEqualTo(Long value) {
            addCriterion("agent_pid <>", value, "agentPid");
            return (Criteria) this;
        }

        public Criteria andAgentPidGreaterThan(Long value) {
            addCriterion("agent_pid >", value, "agentPid");
            return (Criteria) this;
        }

        public Criteria andAgentPidGreaterThanOrEqualTo(Long value) {
            addCriterion("agent_pid >=", value, "agentPid");
            return (Criteria) this;
        }

        public Criteria andAgentPidLessThan(Long value) {
            addCriterion("agent_pid <", value, "agentPid");
            return (Criteria) this;
        }

        public Criteria andAgentPidLessThanOrEqualTo(Long value) {
            addCriterion("agent_pid <=", value, "agentPid");
            return (Criteria) this;
        }

        public Criteria andAgentPidIn(List<Long> values) {
            addCriterion("agent_pid in", values, "agentPid");
            return (Criteria) this;
        }

        public Criteria andAgentPidNotIn(List<Long> values) {
            addCriterion("agent_pid not in", values, "agentPid");
            return (Criteria) this;
        }

        public Criteria andAgentPidBetween(Long value1, Long value2) {
            addCriterion("agent_pid between", value1, value2, "agentPid");
            return (Criteria) this;
        }

        public Criteria andAgentPidNotBetween(Long value1, Long value2) {
            addCriterion("agent_pid not between", value1, value2, "agentPid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}