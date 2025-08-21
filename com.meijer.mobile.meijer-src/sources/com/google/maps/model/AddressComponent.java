package com.google.maps.model;

import com.google.maps.internal.StringJoin;
import java.io.Serializable;

/* loaded from: classes8.dex */
public class AddressComponent implements Serializable {
    private static final long serialVersionUID = 1;
    public String longName;
    public String shortName;
    public AddressComponentType[] types;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[AddressComponent: ");
        sb2.append("\"");
        sb2.append(this.longName);
        sb2.append("\"");
        if (this.shortName != null) {
            sb2.append(" (\"");
            sb2.append(this.shortName);
            sb2.append("\")");
        }
        sb2.append(" (");
        sb2.append(StringJoin.join(", ", this.types));
        sb2.append(")");
        sb2.append("]");
        return sb2.toString();
    }
}
