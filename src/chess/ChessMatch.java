package chess;

import boardgame.Board;

public class ChessMatch {
	
	// The center of chess system
	
	private Board board;

	public ChessMatch() {
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] cpM = new ChessPiece[board.getRows()][board.getColumns()];
		
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; i < board.getColumns(); i++) {
				cpM[i][j] = (ChessPiece) board.piece(i, j); // makes a downcast. Piece --> ChessPiece
			}
		}
		
		return cpM;
		
	}
	
}
