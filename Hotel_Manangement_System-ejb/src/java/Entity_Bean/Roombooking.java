/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_Bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

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
    @NamedQuery(name = "Roombooking.findByCheckin", query = "SELECT r FROM Roombooking r WHERE r.checkin = :checkin"),
    @NamedQuery(name = "Roombooking.findByCheckout", query = "SELECT r FROM Roombooking r WHERE r.checkout = :checkout"),
    @NamedQuery(name = "Roombooking.findBySpecialservice", query = "SELECT r FROM Roombooking r WHERE r.specialservice = :specialservice"),
    @NamedQuery(name = "Roombooking.findByEmailid", query = "SELECT r FROM Roombooking r WHERE r.emailid = :emailid")})
public class Roombooking implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "BOOKINGID")
    private String bookingid;
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
    @Size(min = 1, max = 50)
    @Column(name = "SPECIALSERVICE")
    private String specialservice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMAILID")
    private String emailid;
    @JoinColumn(name = "USERID", referencedColumnName = "USERID")
    @ManyToOne(optional = false)
    private Userlogin userid;
    @JoinColumn(name = "ROOMNO", referencedColumnName = "ROOMNO")
    @ManyToOne(optional = false)
    private Hotelroom roomno;

    public Roombooking() {
    }

    public Roombooking(String bookingid) {
        this.bookingid = bookingid;
    }

    public Roombooking(String bookingid, Date checkin, Date checkout, String specialservice, String emailid) {
        this.bookingid = bookingid;
        this.checkin = checkin;
        this.checkout = checkout;
        this.specialservice = specialservice;
        this.emailid = emailid;
    }

    public String getBookingid() {
        return bookingid;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
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

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Userlogin getUserid() {
        return userid;
    }

    public void setUserid(Userlogin userid) {
        this.userid = userid;
    }

    public Hotelroom getRoomno() {
        return roomno;
    }

    public void setRoomno(Hotelroom roomno) {
        this.roomno = roomno;
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
