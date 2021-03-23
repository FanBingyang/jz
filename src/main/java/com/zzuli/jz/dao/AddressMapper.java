package com.zzuli.jz.dao;

import com.zzuli.jz.bean.Address;
import com.zzuli.jz.bean.AddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    long countByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int deleteByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int insertSelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    List<Address> selectByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    Address selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int updateByPrimaryKey(Address record);
}