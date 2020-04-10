package com.example.demo.chessmodel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.utils.BoardIndex;

@Component
public class Pawn implements ChessPiece {

	@Override
	public boolean canHandleRequest(String type) {
		return type.equals("Pawn");
	}

	@Override
	public List<String> moves(BoardIndex index) {
		List<String> moves = new ArrayList<String>();

		int row = index.getX();
		int col = index.getY();

		 if (row != 0) {
			 if(col != 7)
				 moves.add(chessPositions[(row)] [( col + 1 )] );
            moves.add(chessPositions[(row)] [( col )] );
            if(col != 0)
            	moves.add(chessPositions[(row)] [( col - 1 )] );
        }

		return moves;
	}

}
