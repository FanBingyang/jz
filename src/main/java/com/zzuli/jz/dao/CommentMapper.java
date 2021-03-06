package com.zzuli.jz.dao;

import com.zzuli.jz.bean.Comment;
import com.zzuli.jz.bean.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    Comment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Fri Jun 12 14:51:11 CST 2020
     */
    int updateByPrimaryKey(Comment record);
}