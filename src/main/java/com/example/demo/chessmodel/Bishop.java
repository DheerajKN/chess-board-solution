package com.example.demo.chessmodel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.utils.BoardIndex;

@Component
public class Bishop implements ChessPiece {

	@Override
	public boolean canHandleRequest(String type) {
		return type.equals("Bishop");
	}

	@Override
	public List<String> moves(BoardIndex index) {
		List<String> moves = new ArrayList<String>();

		int row = index.getX();
		int col = index.getY();

		for (int i = 1; i <= row; i++) {
            if (row - i > 0 && col + i < 8) {
                moves.add(chessPositions[(row - i)] [( col + i )]);
            }
        }

        for (int i = 1; i <= ( 8 - col ); i++) {
            if (( row + i ) < 8 && col + i < 8) {
                moves.add(chessPositions[(row + i)] [( col + i )]);
            }
        }

        for (int i = 1; i <= ( 8 - row ); i++) {
            if (( col - i ) > 0  && row + i < 8) {
                moves.add(chessPositions[(row + i)] [( col - i )]);
            }
        }

        for (int i = row; i >= 0; i--) {
            if (col - i > 0 && col - i != col && row + i < 8) {
                moves.add(chessPositions[(row - i)] [( col - i )]);
            }
        }

		return moves;
	}

}
