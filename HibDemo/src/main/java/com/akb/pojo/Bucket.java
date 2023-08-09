package com.akb.pojo;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="BUCKET_TABLE")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Bucket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bid;
	
	@Column(name="BUCKET_SIZES")
	private long bsize;
	
	private Bname bname;
	
	@Temporal(TemporalType.DATE)
	private Date bdate;
	
	@Transient
	private int x;
	
	@Lob
	private byte[] img;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public long getBsize() {
		return bsize;
	}

	public void setBsize(long bsize) {
		this.bsize = bsize;
	}

	
	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public Bname getBname() {
		return bname;
	}

	public void setBname(Bname bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Bucket [bid=" + bid + ", bsize=" + bsize + ", bname=" + bname + ", bdate=" + bdate + ", x=" + x
				+ ", img=" + Arrays.toString(img) + "]";
	}
	
	
}
