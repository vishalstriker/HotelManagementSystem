/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_Bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Vishal
 */
@Entity
@Table(name = "HOTELROOM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotelroom.findAll", query = "SELECT h FROM Hotelroom h"),
    @NamedQuery(name = "Hotelroom.findByRoomid", query = "SELECT h FROM Hotelroom h WHERE h.roomid = :roomid"),
    @NamedQuery(name = "Hotelroom.findByRoomno", query = "SELECT h FROM Hotelroom h WHERE h.roomno = :roomno"),
    @NamedQuery(name = "Hotelroom.findByRoomsize", query = "SELECT h FROM Hotelroom h WHERE h.roomsize = :roomsize"),
    @NamedQuery(name = "Hotelroom.findByRoomtype", query = "SELECT h FROM Hotelroom h WHERE h.roomtype = :roomtype"),
    @NamedQuery(name = "Hotelroom.findByRoomprice", query = "SELECT h FROM Hotelroom h WHERE h.roomprice = :roomprice"),
    @NamedQuery(name = "Hotelroom.findByRoomdescription", query = "SELECT h FROM Hotelroom h WHERE h.roomdescription = :roomdescription"),
    @NamedQuery(name = "Hotelroom.findByRoomfloor", query = "SELECT h FROM Hotelroom h WHERE h.roomfloor = :roomfloor"),
    @NamedQuery(name = "Hotelroom.findByRoomimage", query = "SELECT h FROM Hotelroom h WHERE h.roomimage = :roomimage")})
public class Hotelroom implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOMID")
    private BigDecimal roomid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ROOMNO")
    private String roomno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOMSIZE")
    private BigInteger roomsize;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ROOMTYPE")
    private String roomtype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOMPRICE")
    private double roomprice;
    @Size(max = 100)
    @Column(name = "ROOMDESCRIPTION")
    private String roomdescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOMFLOOR")
    private BigInteger roomfloor;
    @Size(max = 200)
    @Column(name = "ROOMIMAGE")
    private String roomimage;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomid")
    private Collection<Roomservices> roomservicesCollection;

    public Hotelroom() {
    }

    public Hotelroom(BigDecimal roomid) {
        this.roomid = roomid;
    }

    public Hotelroom(BigDecimal roomid, String roomno, BigInteger roomsize, String roomtype, double roomprice, BigInteger roomfloor) {
        this.roomid = roomid;
        this.roomno = roomno;
        this.roomsize = roomsize;
        this.roomtype = roomtype;
        this.roomprice = roomprice;
        this.roomfloor = roomfloor;
    }

    public BigDecimal getRoomid() {
        return roomid;
    }

    public void setRoomid(BigDecimal roomid) {
        this.roomid = roomid;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public BigInteger getRoomsize() {
        return roomsize;
    }

    public void setRoomsize(BigInteger roomsize) {
        this.roomsize = roomsize;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public double getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(double roomprice) {
        this.roomprice = roomprice;
    }

    public String getRoomdescription() {
        return roomdescription;
    }

    public void setRoomdescription(String roomdescription) {
        this.roomdescription = roomdescription;
    }

    public BigInteger getRoomfloor() {
        return roomfloor;
    }

    public void setRoomfloor(BigInteger roomfloor) {
        this.roomfloor = roomfloor;
    }

    public String getRoomimage() {
        return roomimage;
    }

    public void setRoomimage(String roomimage) {
        this.roomimage = roomimage;
    }

    @XmlTransient
    public Collection<Roomservices> getRoomservicesCollection() {
        return roomservicesCollection;
    }

    public void setRoomservicesCollection(Collection<Roomservices> roomservicesCollection) {
        this.roomservicesCollection = roomservicesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomid != null ? roomid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotelroom)) {
            return false;
        }
        Hotelroom other = (Hotelroom) object;
        if ((this.roomid == null && other.roomid != null) || (this.roomid != null && !this.roomid.equals(other.roomid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity_Bean.Hotelroom[ roomid=" + roomid + " ]";
    }
    
}
