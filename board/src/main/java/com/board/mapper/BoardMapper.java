package com.board.mapper;

import com.board.domain.BoardVO;
import org.apache.ibatis.annotations.Param;

public interface BoardMapper {
    public void boardInsert(BoardVO board)throws Exception; 
}
