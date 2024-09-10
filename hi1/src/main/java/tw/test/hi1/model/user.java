package tw.test.hi1.model;

import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityResult;
import jakarta.persistence.FetchType;
import jakarta.persistence.FieldResult;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.Table;

//@SqlResultSetMapping(
//		name="userBike",
//		entities = {
//				@EntityResult(
//						entityClass = user.class,fields = {
//								@FieldResult(name = "id",column = "user.id"),
//								@FieldResult(name = "name",column = "user.name")
//						}
//				),
//				@EntityResult(
//						entityClass = bike.class,fields = {
//								@FieldResult(name = "bid",column = "bike.bid"),
//								@FieldResult(name = "uid",column = "bike.uid"),
//								@FieldResult(name = "color",column = "bike.color"),
//								@FieldResult(name = "speed",column = "bike.speed")
//						}
//				)
//		},
//		columns = {}
//)
@Entity
@Table(name = "user")
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
	private List<bike> bikes;
	
	public user(){
		bikes = new LinkedList<bike>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<bike> getBikes() {
		return bikes;
	}

	public void setBikes(List<bike> bikes) {
		this.bikes = bikes;
	}
	
	public void addBike(bike bike) {
		bikes.add(bike);
	}
	
	public void removeBike(bike bike) {
		bikes.remove(bike);
	}
}
