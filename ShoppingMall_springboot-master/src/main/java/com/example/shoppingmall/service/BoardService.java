package com.example.shoppingmall.service;

import com.example.shoppingmall.domain.board.Board;
import com.example.shoppingmall.domain.board.BoardRepository;
import com.example.shoppingmall.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    private final UserRepository userRepository;

    //id로 조회
    public Board getBoardById(Long boardId) {
        return boardRepository.findById(boardId).orElse(null);
    }

    //제목으로 조회
    public Board getBoardByTitle(String title) {
        return boardRepository.findByTitle(title);
    }

    //게시판 전체 조회
    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    //게시판 수정
//    public void boardModify(Board board, Long boardId) {
//        Board oldBoard = getBoardById(boardId);
//
//
//    }

}
