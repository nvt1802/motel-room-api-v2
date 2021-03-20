package tainv13.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "motel_room")
public class MotelRoom extends ModelCommon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long motelId;

	@Column(columnDefinition = "varchar(100)")
	@NotBlank
	@Length(max = 100)
	private String motelName;

	@Min(value = 1)
	@Max(value = 40)
	private double acreage;

	@Min(value = 100000)
	@Max(value = 3500000)
	private long price;

	@Column(name = "province_id")
	private Long provinceId;

	@Column(name = "district_id")
	private Long districtId;

	@Column(name = "ward_id")
	private Long wardId;

	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;

	private boolean motelStatus;

	@Column(columnDefinition = "varchar(100)")
	@Length(max = 100)
	private String address;

	@Min(value = 1)
	@Max(value = 5)
	private int maxPeople;

	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinTable(name = "Motel_Criteria", joinColumns = { @JoinColumn(name = "motel_id") }, inverseJoinColumns = {
			@JoinColumn(name = "criteria_id", updatable = false, insertable = false) })
	List<Criteria> criteria;

	public MotelRoom() {
		super();
	}

	public MotelRoom(long motelId, @NotBlank @Length(max = 100) String motelName, @Min(1) @Max(40) double acreage,
			@Min(100000) @Max(3500000) long price, Long provinceId, Long districtId, Long wardId, Account account,
			boolean motelStatus, @Length(max = 100) String address, @Min(1) @Max(5) int maxPeople,
			List<Criteria> criteria) {
		super();
		this.motelId = motelId;
		this.motelName = motelName;
		this.acreage = acreage;
		this.price = price;
		this.provinceId = provinceId;
		this.districtId = districtId;
		this.wardId = wardId;
		this.account = account;
		this.motelStatus = motelStatus;
		this.address = address;
		this.maxPeople = maxPeople;
		this.criteria = criteria;
	}

	public long getMotelId() {
		return motelId;
	}

	public void setMotelId(long motelId) {
		this.motelId = motelId;
	}

	public String getMotelName() {
		return motelName;
	}

	public void setMotelName(String motelName) {
		this.motelName = motelName;
	}

	public double getAcreage() {
		return acreage;
	}

	public void setAcreage(double acreage) {
		this.acreage = acreage;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public Long getWardId() {
		return wardId;
	}

	public void setWardId(Long wardId) {
		this.wardId = wardId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public boolean isMotelStatus() {
		return motelStatus;
	}

	public void setMotelStatus(boolean motelStatus) {
		this.motelStatus = motelStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}

	public List<Criteria> getCriteria() {
		return criteria;
	}

	public void setCriteria(List<Criteria> criteria) {
		this.criteria = criteria;
	}
}
