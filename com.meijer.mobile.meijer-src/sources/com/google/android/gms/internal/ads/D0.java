package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f66939a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66940b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && D0.class == obj.getClass()) {
            D0 d02 = (D0) obj;
            if (Objects.equals(this.f66939a, d02.f66939a) && Objects.equals(this.f66940b, d02.f66940b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f66940b.hashCode() * 31;
        String str = this.f66939a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public D0(String str, String str2) {
        this.f66939a = OV.e(str);
        this.f66940b = str2;
    }
}
