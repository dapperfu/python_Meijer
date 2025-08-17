package com.google.maps.model;

import com.google.maps.internal.StringJoin;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class Size implements StringJoin.UrlValue, Serializable {
    private static final long serialVersionUID = 1;
    public int height;
    public int width;

    public Size(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        return String.format("%dx%d", Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    public String toString() {
        return toUrlValue();
    }

    public Size() {
    }
}
