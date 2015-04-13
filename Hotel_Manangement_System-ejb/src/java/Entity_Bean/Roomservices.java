/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_Bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vishal
 */
@Entity
@Table(name = "ROOMSERVICES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roomservices.findAll", query = "SELECT r FROM Roomservices r"),
    @NamedQuery(name = "Roomservices.findByServicesid", query = "SELECT r FROM Roomservices r WHERE r.servicesid = :servicesid"),
    @NamedQuery(name = "Roomservices.findByServicetype", query = "SELECT r FROM Roomservices r WHERE r.servicetype = :servicetype"),
    @NamedQuery(name = "Roomservices.findByServiceDesc", query = "SELECT r FROM Roomservices r WHERE r.serviceDesc = :serviceDesc")})
public class Roomservices implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SERVICESID")
    private BigDecimal servicesid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SERVICETYPE")
    private String servicetype;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SERVICE_DESC")
    private String serviceDesc;
    @JoinColumn(name = "EMAILID", referencedColumnName = "EMAILID")
    @ManyToOne(optional = false)
    private Userlogin emailid;
    @JoinColumn(name = "BOOKINGID", referencedColumnName = "BOOKINGID")
    @ManyToOne(optional = false)
    private Roombooking bookingid;
    @JoinColumn(name = "ROOMID", referencedColumnName = "ROOMID")
    @ManyToOne(optional = false)
    private Hotelroom roomid;

    public Roomservices() {
    }

    public Roomservices(BigDecimal servicesid) {
        this.servicesid = servicesid;
    }

    public Roomservices(BigDecimal servicesid, String servicetype, String serviceDesc) {
        this.servicesid = servicesid;
        this.servicetype = servicetype;
        this.serviceDesc = serviceDesc;
    }

    public BigDecimal getServicesid() {
        return servicesid;
    }

    public void setServicesid(BigDecimal servicesid) {
        this.servicesid = servicesid;
    }

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    public Userlogin getEmailid() {
        return emailid;
    }

    public void setEmailid(Userlogin emailid) {
        this.emailid = emailid;
    }

    public Roombooking getBookingid() {
        return bookingid;
    }

    public void setBookingid(Roombooking bookingid) {
        this.bookingid = bookingid;
    }

    public Hotelroom getRoomid() {
        return roomid;
    }

    public void setRoomid(Hotelroom roomid) {
        this.roomid = roomid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (servicesid != null ? servicesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roomservices)) {
            return false;
        }
        Roomservices other = (Roomservices) object;
        if ((this.servicesid == null && other.servicesid != null) || (this.servicesid != null && !this.servicesid.equals(other.servicesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity_Bean.Roomservices[ servicesid=" + servicesid + " ]";
    }
    
}
