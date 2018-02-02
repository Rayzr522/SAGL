
package com.sagl.java2d.entity;

public class BoxI {

	private int	x;
	private int	y;
	private int	width;
	private int	height;

	public BoxI(int x, int y, int width, int height) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean checkBounds(BoxI box) {

		boolean collide = false;

		int thisLeft = x;
		int thisTop = y;
		int thisRight = x + width;
		int thisBottom = y + height;

		int otherX = box.getX();
		int otherY = box.getY();
		int otherWidth = box.getWidth();
		int otherHeight = box.getHeight();

		int otherLeft = otherX;
		int otherTop = otherY;
		int otherRight = otherX + otherWidth;
		int otherBottom = otherY + otherHeight;

		if (thisLeft >= otherLeft && thisLeft <= otherRight && thisTop >= otherTop && thisTop <= otherBottom) collide = true;
		if (thisRight >= otherLeft && thisRight <= otherRight && thisTop >= otherTop && thisTop <= otherBottom) collide = true;
		if (thisRight >= otherLeft && thisRight <= otherRight && thisBottom >= otherTop && thisBottom <= otherBottom) collide = true;
		if (thisLeft >= otherLeft && thisLeft <= otherRight && thisBottom >= otherTop && thisBottom <= otherBottom) collide = true;

		if (thisLeft <= otherLeft && thisRight >= otherRight && thisTop <= otherTop && thisBottom >= otherBottom) collide = true;

		if (thisLeft >= otherLeft && thisLeft <= otherRight && thisRight >= otherRight && thisTop <= otherTop && thisBottom >= otherBottom) collide = true;
		if (thisLeft <= otherLeft && thisRight >= otherRight && thisTop >= otherTop && thisTop <= otherBottom && thisBottom >= otherBottom) collide = true;
		if (thisLeft <= otherLeft && thisRight <= otherRight && thisRight >= otherLeft && thisTop <= otherTop && thisBottom >= otherBottom) collide = true;
		if (thisLeft <= otherLeft && thisRight >= otherRight && thisTop <= otherTop && thisBottom <= otherBottom && thisBottom >= otherTop) collide = true;

		return collide;

	}

	public boolean checkPoint(int x, int y) {

		return (x > this.x && x < this.x + width && y > this.y && y < this.y + height);

	}

}
