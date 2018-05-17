package com.board.mapper;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardMapper {
	//글작성
    public void boardInsert(BoardVO board)throws Exception;
    
    //글목록
    public List<BoardVO> boardList() throws Exception; //추가
}
