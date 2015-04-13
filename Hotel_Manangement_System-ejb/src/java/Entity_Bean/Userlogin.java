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
@Table(name = "USERLOGIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userlogin.findAll", query = "SELECT u FROM Userlogin u"),
    @NamedQuery(name = "Userlogin.findByLoginid", query = "SELECT u FROM Userlogin u WHERE u.loginid = :loginid"),
    @NamedQuery(name = "Userlogin.findByUsername", query = "SELECT u FROM Userlogin u WHERE u.username = :username"),
    @NamedQuery(name = "Userlogin.findByPassword", query = "SELECT u FROM Userlogin u WHERE u.password = :password"),
    @NamedQuery(name = "Userlogin.findByEmailid", query = "SELECT u FROM Userlogin u WHERE u.emailid = :emailid"),
    @NamedQuery(name = "Userlogin.findByUserType", query = "SELECT u FROM Userlogin u WHERE u.userType = :userType")})
public class Userlogin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LOGINID")
    private BigInteger loginid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PASSWORD")
    private String password;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMAILID")
    private String emailid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "USER_TYPE")
    private String userType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emailid")
    private Collection<Roombooking> roombookingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emailid")
    private Collection<Roomservices> roomservicesCollection;

    public Userlogin() {
    }

    public Userlogin(String emailid) {
        this.emailid = emailid;
    }

    public Userlogin(String emailid, BigInteger loginid, String username, String password, String userType) {
        this.emailid = emailid;
        this.loginid = loginid;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public BigInteger getLoginid() {
        return loginid;
    }

    public void setLoginid(BigInteger loginid) {
        this.loginid = loginid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @XmlTransient
    public Collection<Roombooking> getRoombookingCollection() {
        return roombookingCollection;
    }

    public void setRoombookingCollection(Collection<Roombooking> roombookingCollection) {
        this.roombookingCollection = roombookingCollection;
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
        hash += (emailid != null ? emailid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userlogin)) {
            return false;
        }
        Userlogin other = (Userlogin) object;
        if ((this.emailid == null && other.emailid != null) || (this.emailid != null && !this.emailid.equals(other.emailid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity_Bean.Userlogin[ emailid=" + emailid + " ]";
    }
    
}
