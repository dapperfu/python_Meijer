package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class TransitAgency implements Serializable {
    private static final long serialVersionUID = 1;
    public String name;
    public String phone;
    public String url;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[TransitAgency: ");
        sb2.append(this.name);
        if (this.url != null) {
            sb2.append(", url=");
            sb2.append(this.url);
        }
        if (this.phone != null) {
            sb2.append(", phone=");
            sb2.append(this.phone);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
