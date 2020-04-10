package com.example.demo.chessmodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.utils.BoardIndex;

@Component
public class Queen implements ChessPiece {

	@Autowired
	private Bishop bishop;
	
	@Autowired
	private Rook rook;
	
	@Override
	public boolean canHandleRequest(String type) {
		return type.equals("Queen");
	}

	@Override
	public List<String> moves(BoardIndex index) {
		
		Set<String> set = new HashSet<>();

        set.addAll(bishop.moves(index));
        set.addAll(rook.moves(index));

        return new ArrayList<String>(set);
	}

}
