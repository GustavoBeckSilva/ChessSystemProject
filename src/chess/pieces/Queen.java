package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece{

	public Queen(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "Q";
	}
	
	@Override
	public boolean[][] possibleMoves() {

		boolean mat[][] = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0,0);
		
		// Above movement 
		
		p.setValues(position.getRow() - 1, position.getColumn());

		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;
		
		// Left movement
		
		p.setValues(position.getRow(), position.getColumn() - 1);
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);

		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;
		
		// Right movement
		
		p.setValues(position.getRow(), position.getColumn() + 1);
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
			
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;
		
		// Below movement
		
		p.setValues(position.getRow() + 1, position.getColumn());

		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;
		
		// NW movement 
		
		p.setValues(position.getRow() - 1, position.getColumn() - 1);

		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() - 1);
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;
		
		// LE movement
		
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() + 1);

		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;
		
		// SE movement
		
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() + 1);
			
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;
		
		// SW movement
		
		p.setValues(position.getRow() + 1, position.getColumn() - 1);

		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() - 1);
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;
		
		return mat;
	}
	
}
