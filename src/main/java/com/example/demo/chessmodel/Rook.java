package com.example.demo.chessmodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.demo.utils.BoardIndex;

@Component
public class Rook implements ChessPiece {

	@Override
	public boolean canHandleRequest(String type) {
		return type.equals("Rook");
	}

	@Override
	public List<String> moves(BoardIndex index) {
		Set<String> unique_moves = new HashSet<String>();

		int row = index.getX();
		int col = index.getY();

		for (int i=0; i<8; i++) {
			unique_moves.add(chessPositions[i][col]);
			unique_moves.add(chessPositions[row][i]);
		}

		return new ArrayList<String>(unique_moves);
	}

}
