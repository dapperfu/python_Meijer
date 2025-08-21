package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class H7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f68215a;

    /* renamed from: b, reason: collision with root package name */
    public final C8623k5 f68216b;

    /* renamed from: c, reason: collision with root package name */
    public final J4 f68217c;

    /* renamed from: d, reason: collision with root package name */
    public final L9 f68218d;

    /* renamed from: e, reason: collision with root package name */
    public final G2 f68219e;

    /* renamed from: f, reason: collision with root package name */
    public final C8839m6 f68220f;

    /* synthetic */ H7(String str, C8300h3 c8300h3, C8623k5 c8623k5, J4 j42, L9 l92, C8839m6 c8839m6, C8201g7 c8201g7) {
        this.f68215a = str;
        this.f68216b = c8623k5;
        this.f68217c = j42;
        this.f68218d = l92;
        this.f68219e = c8300h3;
        this.f68220f = c8839m6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H7)) {
            return false;
        }
        H7 h72 = (H7) obj;
        return Objects.equals(this.f68215a, h72.f68215a) && this.f68219e.equals(h72.f68219e) && Objects.equals(this.f68216b, h72.f68216b) && Objects.equals(this.f68217c, h72.f68217c) && Objects.equals(this.f68218d, h72.f68218d) && Objects.equals(this.f68220f, h72.f68220f);
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
        int iHashCode = this.f68215a.hashCode() * 31;
        C8623k5 c8623k5 = this.f68216b;
        return (((((((iHashCode + (c8623k5 != null ? c8623k5.hashCode() : 0)) * 31) + this.f68217c.hashCode()) * 31) + this.f68219e.hashCode()) * 31) + this.f68218d.hashCode()) * 31;
    }
}
