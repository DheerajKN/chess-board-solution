package com.example.demo.chessmodel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.utils.BoardIndex;

@Component
public class King implements ChessPiece {

	@Override
	public boolean canHandleRequest(String type) {
		return type.equals("King");
	}

	@Override
	public List<String> moves(BoardIndex index) {
		List<String> moves = new ArrayList<String>();

		int row = index.getX();
		int col = index.getY();

		for (int i = -1; i <= 1; i++) { 
			for (int j = -1; j <= 1; j++) { 
				if (row - i != 0) {
					if (col - j > 0 && col - j <= 8) { 
						if (!( ( row - i ) == row && ( col - j ) == col )) { 
							moves.add(chessPositions[(row - i)][( col - j )]); 
						} 
					}
				}
			} 
		} 

		return moves;
	}

}
