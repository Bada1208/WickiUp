package com.linnik.wickiup.patterns._1_creational._3_prototype;

/**
 * @author LinnykOleh
 */
public abstract class Item implements Cloneable{

	private String title;
	private double price;
	private String url;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "" +
				", title=" + title +
				", price=" + price +
				", url=" + url;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
