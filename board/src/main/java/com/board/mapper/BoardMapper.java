package com.board.mapper;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardMapper {
	//���ۼ�
    public void boardInsert(BoardVO board)throws Exception;
    
    //�۸��
    public List<BoardVO> boardList() throws Exception; //�߰�
}
