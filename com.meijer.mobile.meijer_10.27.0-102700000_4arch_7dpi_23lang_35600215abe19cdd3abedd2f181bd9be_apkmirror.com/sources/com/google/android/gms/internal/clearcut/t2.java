package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class t2 extends AbstractC15136a {
    public static final Parcelable.Creator<t2> CREATOR = new u2();

    /* renamed from: a, reason: collision with root package name */
    private final String f81568a;

    /* renamed from: b, reason: collision with root package name */
    private final int f81569b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81570c;

    /* renamed from: d, reason: collision with root package name */
    private final String f81571d;

    /* renamed from: e, reason: collision with root package name */
    private final String f81572e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f81573f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81574g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f81575h;

    /* renamed from: i, reason: collision with root package name */
    private final int f81576i;

    public t2(String str, int i10, int i11, String str2, String str3, String str4, boolean z10, Y1 y12) {
        this.f81568a = (String) com.google.android.gms.common.internal.r.l(str);
        this.f81569b = i10;
        this.f81570c = i11;
        this.f81574g = str2;
        this.f81571d = str3;
        this.f81572e = str4;
        this.f81573f = !z10;
        this.f81575h = z10;
        this.f81576i = y12.zzc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t2) {
            t2 t2Var = (t2) obj;
            if (C6535q.a(this.f81568a, t2Var.f81568a) && this.f81569b == t2Var.f81569b && this.f81570c == t2Var.f81570c && C6535q.a(this.f81574g, t2Var.f81574g) && C6535q.a(this.f81571d, t2Var.f81571d) && C6535q.a(this.f81572e, t2Var.f81572e) && this.f81573f == t2Var.f81573f && this.f81575h == t2Var.f81575h && this.f81576i == t2Var.f81576i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6535q.b(this.f81568a, Integer.valueOf(this.f81569b), Integer.valueOf(this.f81570c), this.f81574g, this.f81571d, this.f81572e, Boolean.valueOf(this.f81573f), Boolean.valueOf(this.f81575h), Integer.valueOf(this.f81576i));
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f81568a + ",packageVersionCode=" + this.f81569b + ",logSource=" + this.f81570c + ",logSourceName=" + this.f81574g + ",uploadAccount=" + this.f81571d + ",loggingId=" + this.f81572e + ",logAndroidId=" + this.f81573f + ",isAnonymous=" + this.f81575h + ",qosTier=" + this.f81576i + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f81568a, false);
        C15137b.n(parcel, 3, this.f81569b);
        C15137b.n(parcel, 4, this.f81570c);
        C15137b.w(parcel, 5, this.f81571d, false);
        C15137b.w(parcel, 6, this.f81572e, false);
        C15137b.c(parcel, 7, this.f81573f);
        C15137b.w(parcel, 8, this.f81574g, false);
        C15137b.c(parcel, 9, this.f81575h);
        C15137b.n(parcel, 10, this.f81576i);
        C15137b.b(parcel, iA);
    }

    public t2(String str, int i10, int i11, String str2, String str3, boolean z10, String str4, boolean z11, int i12) {
        this.f81568a = str;
        this.f81569b = i10;
        this.f81570c = i11;
        this.f81571d = str2;
        this.f81572e = str3;
        this.f81573f = z10;
        this.f81574g = str4;
        this.f81575h = z11;
        this.f81576i = i12;
    }
}
