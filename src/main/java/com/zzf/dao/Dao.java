package com.zzf.dao;

import com.zzf.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface Dao {
    //在网页修改

    public Book selectbyid(@Param("id") int id);
}
