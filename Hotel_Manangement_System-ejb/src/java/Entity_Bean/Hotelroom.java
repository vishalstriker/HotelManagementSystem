/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_Bean;

import java.io.Serializable;
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
    @NamedQuery(name = "Hotelroom.findByRoomno", query = "SELECT h FROM Hotelroom h WHERE h.roomno = :roomno"),
    @NamedQuery(name = "Hotelroom.findByRoomtype", query = "SELECT h FROM Hotelroom h WHERE h.roomtype = :roomtype"),
    @NamedQuery(name = "Hotelroom.findByRoomprice", query = "SELECT h FROM Hotelroom h WHERE h.roomprice = :roomprice"),
    @NamedQuery(name = "Hotelroom.findByRoomdescription", query = "SELECT h FROM Hotelroom h WHERE h.roomdescription = :roomdescription"),
    @NamedQuery(name = "Hotelroom.findByRoomfloor", query = "SELECT h FROM Hotelroom h WHERE h.roomfloor = :roomfloor"),
    @NamedQuery(name = "Hotelroom.findByRoomimage", query = "SELECT h FROM Hotelroom h WHERE h.roomimage = :roomimage"),
    @NamedQuery(name = "Hotelroom.findByIsavailable", query = "SELECT h FROM Hotelroom h WHERE h.isavailable = :isavailable")})
public class Hotelroom implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ROOMNO")
    private String roomno;
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
    @Column(name = "ISAVAILABLE")
    private Character isavailable;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomno")
    private Collection<Roombooking> roombookingCollection;

    public Hotelroom() {
    }

    public Hotelroom(String roomno) {
        this.roomno = roomno;
    }

    public Hotelroom(String roomno, String roomtype, double roomprice, BigInteger roomfloor) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomprice = roomprice;
        this.roomfloor = roomfloor;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
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

    public Character getIsavailable() {
        return isavailable;
    }

    public void setIsavailable(Character isavailable) {
        this.isavailable = isavailable;
    }

    @XmlTransient
    public Collection<Roombooking> getRoombookingCollection() {
        return roombookingCollection;
    }

    public void setRoombookingCollection(Collection<Roombooking> roombookingCollection) {
        this.roombookingCollection = roombookingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomno != null ? roomno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotelroom)) {
            return false;
        }
        Hotelroom other = (Hotelroom) object;
        if ((this.roomno == null && other.roomno != null) || (this.roomno != null && !this.roomno.equals(other.roomno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity_Bean.Hotelroom[ roomno=" + roomno + " ]";
    }
    
}
