/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_Bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
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
@Table(name = "ROOMBOOKING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roombooking.findAll", query = "SELECT r FROM Roombooking r"),
    @NamedQuery(name = "Roombooking.findByBookingid", query = "SELECT r FROM Roombooking r WHERE r.bookingid = :bookingid"),
    @NamedQuery(name = "Roombooking.findByRoomid", query = "SELECT r FROM Roombooking r WHERE r.roomid = :roomid"),
    @NamedQuery(name = "Roombooking.findByCheckin", query = "SELECT r FROM Roombooking r WHERE r.checkin = :checkin"),
    @NamedQuery(name = "Roombooking.findByCheckout", query = "SELECT r FROM Roombooking r WHERE r.checkout = :checkout"),
    @NamedQuery(name = "Roombooking.findBySpecialservice", query = "SELECT r FROM Roombooking r WHERE r.specialservice = :specialservice")})
public class Roombooking implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BOOKINGID")
    private BigDecimal bookingid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOMID")
    private BigInteger roomid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CHECKIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CHECKOUT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkout;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SPECIALSERVICE")
    private String specialservice;
    @JoinColumn(name = "EMAILID", referencedColumnName = "EMAILID")
    @ManyToOne(optional = false)
    private Userlogin emailid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookingid")
    private Collection<Roomservices> roomservicesCollection;

    public Roombooking() {
    }

    public Roombooking(BigDecimal bookingid) {
        this.bookingid = bookingid;
    }

    public Roombooking(BigDecimal bookingid, BigInteger roomid, Date checkin, Date checkout, String specialservice) {
        this.bookingid = bookingid;
        this.roomid = roomid;
        this.checkin = checkin;
        this.checkout = checkout;
        this.specialservice = specialservice;
    }

    public BigDecimal getBookingid() {
        return bookingid;
    }

    public void setBookingid(BigDecimal bookingid) {
        this.bookingid = bookingid;
    }

    public BigInteger getRoomid() {
        return roomid;
    }

    public void setRoomid(BigInteger roomid) {
        this.roomid = roomid;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public String getSpecialservice() {
        return specialservice;
    }

    public void setSpecialservice(String specialservice) {
        this.specialservice = specialservice;
    }

    public Userlogin getEmailid() {
        return emailid;
    }

    public void setEmailid(Userlogin emailid) {
        this.emailid = emailid;
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
        hash += (bookingid != null ? bookingid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roombooking)) {
            return false;
        }
        Roombooking other = (Roombooking) object;
        if ((this.bookingid == null && other.bookingid != null) || (this.bookingid != null && !this.bookingid.equals(other.bookingid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity_Bean.Roombooking[ bookingid=" + bookingid + " ]";
    }
    
}
