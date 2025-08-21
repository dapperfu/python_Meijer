package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class t2 extends AbstractC15707a {
    public static final Parcelable.Creator<t2> CREATOR = new u2();

    /* renamed from: a, reason: collision with root package name */
    private final String f82408a;

    /* renamed from: b, reason: collision with root package name */
    private final int f82409b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82410c;

    /* renamed from: d, reason: collision with root package name */
    private final String f82411d;

    /* renamed from: e, reason: collision with root package name */
    private final String f82412e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f82413f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82414g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f82415h;

    /* renamed from: i, reason: collision with root package name */
    private final int f82416i;

    public t2(String str, int i10, int i11, String str2, String str3, String str4, boolean z10, Y1 y12) {
        this.f82408a = (String) com.google.android.gms.common.internal.r.l(str);
        this.f82409b = i10;
        this.f82410c = i11;
        this.f82414g = str2;
        this.f82411d = str3;
        this.f82412e = str4;
        this.f82413f = !z10;
        this.f82415h = z10;
        this.f82416i = y12.zzc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t2) {
            t2 t2Var = (t2) obj;
            if (C6660q.a(this.f82408a, t2Var.f82408a) && this.f82409b == t2Var.f82409b && this.f82410c == t2Var.f82410c && C6660q.a(this.f82414g, t2Var.f82414g) && C6660q.a(this.f82411d, t2Var.f82411d) && C6660q.a(this.f82412e, t2Var.f82412e) && this.f82413f == t2Var.f82413f && this.f82415h == t2Var.f82415h && this.f82416i == t2Var.f82416i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6660q.b(this.f82408a, Integer.valueOf(this.f82409b), Integer.valueOf(this.f82410c), this.f82414g, this.f82411d, this.f82412e, Boolean.valueOf(this.f82413f), Boolean.valueOf(this.f82415h), Integer.valueOf(this.f82416i));
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f82408a + ",packageVersionCode=" + this.f82409b + ",logSource=" + this.f82410c + ",logSourceName=" + this.f82414g + ",uploadAccount=" + this.f82411d + ",loggingId=" + this.f82412e + ",logAndroidId=" + this.f82413f + ",isAnonymous=" + this.f82415h + ",qosTier=" + this.f82416i + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f82408a, false);
        C15708b.n(parcel, 3, this.f82409b);
        C15708b.n(parcel, 4, this.f82410c);
        C15708b.w(parcel, 5, this.f82411d, false);
        C15708b.w(parcel, 6, this.f82412e, false);
        C15708b.c(parcel, 7, this.f82413f);
        C15708b.w(parcel, 8, this.f82414g, false);
        C15708b.c(parcel, 9, this.f82415h);
        C15708b.n(parcel, 10, this.f82416i);
        C15708b.b(parcel, iA);
    }

    public t2(String str, int i10, int i11, String str2, String str3, boolean z10, String str4, boolean z11, int i12) {
        this.f82408a = str;
        this.f82409b = i10;
        this.f82410c = i11;
        this.f82411d = str2;
        this.f82412e = str3;
        this.f82413f = z10;
        this.f82414g = str4;
        this.f82415h = z11;
        this.f82416i = i12;
    }
}
