package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class H7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f67375a;

    /* renamed from: b, reason: collision with root package name */
    public final C8498k5 f67376b;

    /* renamed from: c, reason: collision with root package name */
    public final J4 f67377c;

    /* renamed from: d, reason: collision with root package name */
    public final L9 f67378d;

    /* renamed from: e, reason: collision with root package name */
    public final G2 f67379e;

    /* renamed from: f, reason: collision with root package name */
    public final C8714m6 f67380f;

    /* synthetic */ H7(String str, C8175h3 c8175h3, C8498k5 c8498k5, J4 j42, L9 l92, C8714m6 c8714m6, C8076g7 c8076g7) {
        this.f67375a = str;
        this.f67376b = c8498k5;
        this.f67377c = j42;
        this.f67378d = l92;
        this.f67379e = c8175h3;
        this.f67380f = c8714m6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H7)) {
            return false;
        }
        H7 h72 = (H7) obj;
        return Objects.equals(this.f67375a, h72.f67375a) && this.f67379e.equals(h72.f67379e) && Objects.equals(this.f67376b, h72.f67376b) && Objects.equals(this.f67377c, h72.f67377c) && Objects.equals(this.f67378d, h72.f67378d) && Objects.equals(this.f67380f, h72.f67380f);
    }

    static {
        new E1().c();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public final int hashCode() {
        int iHashCode = this.f67375a.hashCode() * 31;
        C8498k5 c8498k5 = this.f67376b;
        return (((((((iHashCode + (c8498k5 != null ? c8498k5.hashCode() : 0)) * 31) + this.f67377c.hashCode()) * 31) + this.f67379e.hashCode()) * 31) + this.f67378d.hashCode()) * 31;
    }
}
