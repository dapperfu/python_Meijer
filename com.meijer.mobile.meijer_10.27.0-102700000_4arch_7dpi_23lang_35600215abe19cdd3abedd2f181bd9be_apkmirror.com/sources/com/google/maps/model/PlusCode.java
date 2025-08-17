package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class PlusCode implements Serializable {
    private static final long serialVersionUID = 1;
    public String compoundCode;
    public String globalCode;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[PlusCode: ");
        sb2.append(this.globalCode);
        if (this.compoundCode != null) {
            sb2.append(", compoundCode=");
            sb2.append(this.compoundCode);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
