package com.zzuli.jz.bean;

import java.io.Serializable;

public class Role implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_role.id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_role.name
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_role
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_role.id
     *
     * @return the value of base_role.id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_role.id
     *
     * @param id the value for base_role.id
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_role.name
     *
     * @return the value of base_role.name
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_role.name
     *
     * @param name the value for base_role.name
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}