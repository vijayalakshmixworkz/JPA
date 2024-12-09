package com.xworkz.artGalleryManagement.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "artwork_transactions")
@NamedQuery(name = "findAll", query = "SELECT a FROM ArtGalleryEntity a")
@NamedQuery(name = "findArtworkTitleAndBuyerById", query = "SELECT a.artworkTitle, a.buyerName FROM ArtGalleryEntity a WHERE a.id = :id")
@NamedQuery(name = "countGroupByArtworkTitleAndTransactionDate", query = "SELECT a.artworkTitle, a.transactionDate, COUNT(a) FROM ArtGalleryEntity a GROUP BY a.artworkTitle, a.transactionDate")
@NamedQuery(name = "countByPriceGreaterThan10000", query = "SELECT a.artworkTitle, COUNT(a) FROM ArtGalleryEntity a WHERE a.price > 10000 GROUP BY a.artworkTitle")
@NamedQuery(name = "findById", query = "SELECT a FROM ArtGalleryEntity a WHERE a.id = :id")
@NamedQuery(name = "findByBuyerNameAndPrice", query = "SELECT a FROM ArtGalleryEntity a WHERE a.buyerName = :buyerName AND a.price = :price")
@NamedQuery(name = "findBuyerNameByIsPaidAndTotalAmount", query = "SELECT a.buyerName FROM ArtGalleryEntity a WHERE a.isPaid = :isPaid AND a.totalAmount = :totalAmount")
@NamedQuery(name = "deleteByArtworkTitleAndTotalAmount", query = "DELETE FROM ArtGalleryEntity a WHERE a.artworkTitle = :artworkTitle AND a.totalAmount = :totalAmount")
@NamedQuery(name = "updateByOwnerNameAndTotalAmount", query = "UPDATE ArtGalleryEntity a SET a.totalAmount = :newTotalAmount WHERE a.ownerName = :ownerName AND a.totalAmount = :currentTotalAmount")
@NamedQuery(name = "updateByTotalAmountAndIsPaid", query = "UPDATE ArtGalleryEntity a SET a.isPaid = :newIsPaid WHERE a.totalAmount = :totalAmount AND a.isPaid = :currentIsPaid")

public class ArtGalleryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "artwork_title", nullable = false)
	private String artworkTitle;

	@Column(name = "buyer_name", nullable = false)
	private String buyerName;

	@Column(name = "owner_name", nullable = false)
	private String ownerName;

	@Column(name = "transaction_date", nullable = false)
	private LocalDate transactionDate;

	@Column(name = "purchase_time", nullable = false)
	private LocalDateTime purchaseTime;

	@Column(name = "price", nullable = false)
	private float price;
	@Column(name = "total_amount", nullable = false)
	private long totalAmount;

	@Column(name = "is_paid", nullable = false)
	private boolean isPaid;

	@Column(name = "artwork_code", unique = true, nullable = false)
	private String artworkCode;

	public ArtGalleryEntity() {

	}

	public ArtGalleryEntity(String artworkTitle, String buyerName, String ownerName, LocalDate transactionDate,
			LocalDateTime purchaseTime, float price, long totalAmount, boolean isPaid, String artworkCode) {
		super();
		this.artworkTitle = artworkTitle;
		this.buyerName = buyerName;
		this.ownerName = ownerName;
		this.transactionDate = transactionDate;
		this.purchaseTime = purchaseTime;
		this.price = price;
		this.totalAmount = totalAmount;
		this.isPaid = isPaid;
		this.artworkCode = artworkCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArtworkTitle() {
		return artworkTitle;
	}

	public void setArtworkTitle(String artworkTitle) {
		this.artworkTitle = artworkTitle;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public LocalDateTime getPurchaseTime() {
		return purchaseTime;
	}

	public void setPurchaseTime(LocalDateTime purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public String getArtworkCode() {
		return artworkCode;
	}

	public void setArtworkCode(String artworkCode) {
		this.artworkCode = artworkCode;
	}

	@Override
	public String toString() {
		return "ArtGalleryEntity [id=" + id + ", artworkTitle=" + artworkTitle + ", buyerName=" + buyerName
				+ ", ownerName=" + ownerName + ", transactionDate=" + transactionDate + ", purchaseTime=" + purchaseTime
				+ ", price=" + price + ", totalAmount=" + totalAmount + ", isPaid=" + isPaid + ", artworkCode="
				+ artworkCode + "]";
	}

}
