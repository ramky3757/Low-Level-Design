package com.java.tictactoe;

public class TicTacToe {
	
	private int[][] Board;
	private final int n;
	private final int[] rowsum, colsum;
	private int diagsum, revDiagsum;
	private int Winner;
	
	public int getWinner() {
		return Winner;
	}


	public void setWinner(int winner) {
		Winner = winner;
	}


	public TicTacToe(int n) {
		this.n = n;
		Board = new int[n][n];
		rowsum = new int[n];
		colsum = new int[n];
	}
	/*
	 * @param player is either 0  or 1
	 * @param row is the move's row index
	 * @param column is the move's column index
	 * @return winner +1 if it's first player, -1 if it's second player and zero(0) if its draw
	 * @thorws IllegalArguemntException if it's invalid move
	 */
	
	public int move(int player, int row, int col) throws IllegalArgumentException {
		
		if(row <0 || col <0 || row>=n || col >=n) {			
			throw new IllegalArgumentException("Moves out of boundary");
		} 
		if(Board[row][col]!=0) {
			throw new IllegalArgumentException("Position is already occupied");
		}
		if(player!=0 && player!=1) {
			throw new IllegalArgumentException("Invalid Player");
		}
		if(getWinner()!=0) {
			throw new IllegalArgumentException("Board Player");
		}
		
		else {			
			player = player== 0?-1:+1;
			Board[row][col] = player;
			boolean win = false;
						
			rowsum[row]+= player;
			colsum[col]+= player;
			
			if(row == col) {
				diagsum+= player;
			}
			
			if(row == n-1-col) {
				revDiagsum += player;
			}
							
				if(rowsum[row] == Math.abs(n) || colsum[col] == Math.abs(n) || diagsum == Math.abs(n) || revDiagsum == Math.abs(n)) {
					return player;
				}
				 
				return 0;				
			}
		}
	}


