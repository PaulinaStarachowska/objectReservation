package model;

import java.math.BigDecimal;
import java.util.Date;

public class Reservation {
    private final Tenant tenant;
    private final Object object;
    private final Date checkInDate;
    private final Date checkOutDate;
    private final Landlord landlord;
    private final BigDecimal price;


    public Reservation(final Tenant tenant, final Object object,
                       final Date checkInDate, final Date checkOutDate, Landlord landlord, BigDecimal price) {
        this.tenant = tenant;
        this.object = object;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.landlord = landlord;
        this.price = price;
    }

    public Object getObject() {
        return this.object;
    }

    public Date getCheckInDate() {
        return this.checkInDate;
    }

    public Date getCheckOutDate() {
        return this.checkOutDate;
    }

    public Landlord getLandlord() { return this.landlord; }

    public BigDecimal getPrice() { return this.price; }

    @Override
    public String toString() {
        return "Tenant: " + this.tenant.toString()
                + "\nObject: " + this.object.toString()
                + "\nCheckIn Date: " + this.checkInDate
                + "\nCheckOut Date: " + this.checkOutDate
                + "\nLandlord: " + this.landlord.toString()
                + "\nPrice: " + this.price.toString();
    }
}

