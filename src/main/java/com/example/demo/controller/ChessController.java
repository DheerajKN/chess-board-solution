package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.chessmodel.ChessPiece;
import com.example.demo.utils.BoardIndex;
import com.example.demo.utils.HelperFunctions;

@RestController
public class ChessController {
	
	@Autowired
	List<ChessPiece> chessPieces;

	@Autowired
	HelperFunctions helperFunctions;
	
	@GetMapping("/moves/{piece}/{position}")
	public ResponseEntity<?> getChessPieceMoves(
			@PathVariable String piece,
			@PathVariable String position){
		Optional<ChessPiece> chessObject = chessPieces.stream()
				.filter(chessPiece -> chessPiece.canHandleRequest(piece)).findFirst();
		
		BoardIndex index = helperFunctions.getIndex(position);
		
		if (index == null) {
			return ResponseEntity.badRequest().body("Incorrect Chess Index Value Provided");
		}
		
		if(chessObject.isPresent()) {
			return ResponseEntity.ok(chessObject.get().moves(index));
		}
		return ResponseEntity.badRequest().build();
	}
}
