package com.generate.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProviderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProviderExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProCodeIsNull() {
            addCriterion("proCode is null");
            return (Criteria) this;
        }

        public Criteria andProCodeIsNotNull() {
            addCriterion("proCode is not null");
            return (Criteria) this;
        }

        public Criteria andProCodeEqualTo(String value) {
            addCriterion("proCode =", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotEqualTo(String value) {
            addCriterion("proCode <>", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThan(String value) {
            addCriterion("proCode >", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThanOrEqualTo(String value) {
            addCriterion("proCode >=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThan(String value) {
            addCriterion("proCode <", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThanOrEqualTo(String value) {
            addCriterion("proCode <=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLike(String value) {
            addCriterion("proCode like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotLike(String value) {
            addCriterion("proCode not like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeIn(List<String> values) {
            addCriterion("proCode in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotIn(List<String> values) {
            addCriterion("proCode not in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeBetween(String value1, String value2) {
            addCriterion("proCode between", value1, value2, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotBetween(String value1, String value2) {
            addCriterion("proCode not between", value1, value2, "proCode");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("proName is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("proName is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("proName =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("proName <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("proName >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("proName >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("proName <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("proName <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("proName like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("proName not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("proName in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("proName not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("proName between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("proName not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProDescIsNull() {
            addCriterion("proDesc is null");
            return (Criteria) this;
        }

        public Criteria andProDescIsNotNull() {
            addCriterion("proDesc is not null");
            return (Criteria) this;
        }

        public Criteria andProDescEqualTo(String value) {
            addCriterion("proDesc =", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotEqualTo(String value) {
            addCriterion("proDesc <>", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThan(String value) {
            addCriterion("proDesc >", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThanOrEqualTo(String value) {
            addCriterion("proDesc >=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThan(String value) {
            addCriterion("proDesc <", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThanOrEqualTo(String value) {
            addCriterion("proDesc <=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLike(String value) {
            addCriterion("proDesc like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotLike(String value) {
            addCriterion("proDesc not like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescIn(List<String> values) {
            addCriterion("proDesc in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotIn(List<String> values) {
            addCriterion("proDesc not in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescBetween(String value1, String value2) {
            addCriterion("proDesc between", value1, value2, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotBetween(String value1, String value2) {
            addCriterion("proDesc not between", value1, value2, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProContactIsNull() {
            addCriterion("proContact is null");
            return (Criteria) this;
        }

        public Criteria andProContactIsNotNull() {
            addCriterion("proContact is not null");
            return (Criteria) this;
        }

        public Criteria andProContactEqualTo(String value) {
            addCriterion("proContact =", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactNotEqualTo(String value) {
            addCriterion("proContact <>", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactGreaterThan(String value) {
            addCriterion("proContact >", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactGreaterThanOrEqualTo(String value) {
            addCriterion("proContact >=", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactLessThan(String value) {
            addCriterion("proContact <", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactLessThanOrEqualTo(String value) {
            addCriterion("proContact <=", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactLike(String value) {
            addCriterion("proContact like", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactNotLike(String value) {
            addCriterion("proContact not like", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactIn(List<String> values) {
            addCriterion("proContact in", values, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactNotIn(List<String> values) {
            addCriterion("proContact not in", values, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactBetween(String value1, String value2) {
            addCriterion("proContact between", value1, value2, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactNotBetween(String value1, String value2) {
            addCriterion("proContact not between", value1, value2, "proContact");
            return (Criteria) this;
        }

        public Criteria andProPhoneIsNull() {
            addCriterion("proPhone is null");
            return (Criteria) this;
        }

        public Criteria andProPhoneIsNotNull() {
            addCriterion("proPhone is not null");
            return (Criteria) this;
        }

        public Criteria andProPhoneEqualTo(String value) {
            addCriterion("proPhone =", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneNotEqualTo(String value) {
            addCriterion("proPhone <>", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneGreaterThan(String value) {
            addCriterion("proPhone >", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("proPhone >=", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneLessThan(String value) {
            addCriterion("proPhone <", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneLessThanOrEqualTo(String value) {
            addCriterion("proPhone <=", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneLike(String value) {
            addCriterion("proPhone like", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneNotLike(String value) {
            addCriterion("proPhone not like", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneIn(List<String> values) {
            addCriterion("proPhone in", values, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneNotIn(List<String> values) {
            addCriterion("proPhone not in", values, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneBetween(String value1, String value2) {
            addCriterion("proPhone between", value1, value2, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneNotBetween(String value1, String value2) {
            addCriterion("proPhone not between", value1, value2, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProAddressIsNull() {
            addCriterion("proAddress is null");
            return (Criteria) this;
        }

        public Criteria andProAddressIsNotNull() {
            addCriterion("proAddress is not null");
            return (Criteria) this;
        }

        public Criteria andProAddressEqualTo(String value) {
            addCriterion("proAddress =", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotEqualTo(String value) {
            addCriterion("proAddress <>", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressGreaterThan(String value) {
            addCriterion("proAddress >", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressGreaterThanOrEqualTo(String value) {
            addCriterion("proAddress >=", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLessThan(String value) {
            addCriterion("proAddress <", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLessThanOrEqualTo(String value) {
            addCriterion("proAddress <=", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLike(String value) {
            addCriterion("proAddress like", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotLike(String value) {
            addCriterion("proAddress not like", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressIn(List<String> values) {
            addCriterion("proAddress in", values, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotIn(List<String> values) {
            addCriterion("proAddress not in", values, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressBetween(String value1, String value2) {
            addCriterion("proAddress between", value1, value2, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotBetween(String value1, String value2) {
            addCriterion("proAddress not between", value1, value2, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProFaxIsNull() {
            addCriterion("proFax is null");
            return (Criteria) this;
        }

        public Criteria andProFaxIsNotNull() {
            addCriterion("proFax is not null");
            return (Criteria) this;
        }

        public Criteria andProFaxEqualTo(String value) {
            addCriterion("proFax =", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxNotEqualTo(String value) {
            addCriterion("proFax <>", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxGreaterThan(String value) {
            addCriterion("proFax >", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxGreaterThanOrEqualTo(String value) {
            addCriterion("proFax >=", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxLessThan(String value) {
            addCriterion("proFax <", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxLessThanOrEqualTo(String value) {
            addCriterion("proFax <=", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxLike(String value) {
            addCriterion("proFax like", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxNotLike(String value) {
            addCriterion("proFax not like", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxIn(List<String> values) {
            addCriterion("proFax in", values, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxNotIn(List<String> values) {
            addCriterion("proFax not in", values, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxBetween(String value1, String value2) {
            addCriterion("proFax between", value1, value2, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxNotBetween(String value1, String value2) {
            addCriterion("proFax not between", value1, value2, "proFax");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("createdBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("createdBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("createdBy =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("createdBy <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("createdBy >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("createdBy >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("createdBy <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("createdBy <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("createdBy in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("createdBy not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("createdBy between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("createdBy not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creationDate is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creationDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("creationDate =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("creationDate <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("creationDate >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("creationDate >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("creationDate <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("creationDate <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("creationDate in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("creationDate not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("creationDate between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("creationDate not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modifyDate =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modifyDate <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modifyDate >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyDate >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modifyDate <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modifyDate <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modifyDate in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modifyDate not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modifyDate between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modifyDate not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNull() {
            addCriterion("modifyBy is null");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNotNull() {
            addCriterion("modifyBy is not null");
            return (Criteria) this;
        }

        public Criteria andModifyByEqualTo(Long value) {
            addCriterion("modifyBy =", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotEqualTo(Long value) {
            addCriterion("modifyBy <>", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThan(Long value) {
            addCriterion("modifyBy >", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThanOrEqualTo(Long value) {
            addCriterion("modifyBy >=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThan(Long value) {
            addCriterion("modifyBy <", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThanOrEqualTo(Long value) {
            addCriterion("modifyBy <=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByIn(List<Long> values) {
            addCriterion("modifyBy in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotIn(List<Long> values) {
            addCriterion("modifyBy not in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByBetween(Long value1, Long value2) {
            addCriterion("modifyBy between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotBetween(Long value1, Long value2) {
            addCriterion("modifyBy not between", value1, value2, "modifyBy");
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