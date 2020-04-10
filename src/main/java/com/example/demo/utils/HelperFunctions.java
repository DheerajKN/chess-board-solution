package com.example.demo.utils;

import java.time.temporal.ValueRange;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.chessmodel.ChessPiece;

@Component
public class HelperFunctions implements ChessPiece {

	@Override
	public boolean canHandleRequest(String type) {
		return false;
	}

	@Override
	public List<String> moves(BoardIndex index) {
		return null;
	}
	
	public BoardIndex getIndex(String position) {
//		for(int i=0; i<8; i++) {
//			for(int j=0; j<8; j++) {
//				if(chessPositions[i][j].equalsIgnoreCase(position)) {
//					System.out.println(""+i+" "+j);
//					return new BoardIndex(i, j);
//				}
//			}
//		}
		
		int x = (int) position.charAt(1);
		int y = (int) position.charAt(0);
		
		ValueRange xRange = java.time.temporal.ValueRange.of(49, 56);
		ValueRange yRange = java.time.temporal.ValueRange.of(65, 71);
		
		if(xRange.isValidIntValue(x) && yRange.isValidIntValue(y)) {
			x = (x - 56) * -1;
			y -= 65;
			
			return new BoardIndex(x, y);
		}
		return null;
	}
}
