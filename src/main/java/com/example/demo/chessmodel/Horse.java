package com.example.demo.chessmodel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.utils.BoardIndex;

@Component
public class Horse implements ChessPiece {

	@Override
	public boolean canHandleRequest(String type) {
		return type.equals("Horse");
	}

	@Override
	public List<String> moves(BoardIndex index) {
		List<String> moves = new ArrayList<String>();

		int row = index.getX();
		int col = index.getY();

		int[] rowStepsArray = new int[] { 2, 2, -2, -2, 1, 1, -1, -1 };
		int[] colStepsArray = new int[] { -1, 1, 1, -1, 2, -2, 2, -2 };

		for (int i = 0; i <= 7; i++) {
			int estimatedRowPositoin = row + rowStepsArray[ i ];
			int estimatedColPositoin = col + colStepsArray[ i ];
			
			System.out.println(estimatedColPositoin);
			System.out.println(estimatedRowPositoin);
			if (
					( estimatedRowPositoin > 0 && estimatedRowPositoin < 8 ) &&
					( estimatedColPositoin > 0 && estimatedColPositoin < 8 )
					) {
				moves.add(chessPositions[estimatedRowPositoin][estimatedColPositoin]);
			}
		}
		
		return moves;
	}

}
