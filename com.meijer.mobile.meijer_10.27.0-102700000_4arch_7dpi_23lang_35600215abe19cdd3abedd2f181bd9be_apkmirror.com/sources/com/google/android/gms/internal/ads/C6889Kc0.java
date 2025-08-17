package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Kc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6889Kc0 extends AbstractC15136a {
    public static final Parcelable.Creator<C6889Kc0> CREATOR = new C6923Lc0();

    /* renamed from: a, reason: collision with root package name */
    public final int f68132a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68133b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68134c;

    C6889Kc0(int i10, String str, String str2) {
        this.f68132a = i10;
        this.f68133b = str;
        this.f68134c = str2;
    }

    public C6889Kc0(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f68132a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.w(parcel, 2, this.f68133b, false);
        C15137b.w(parcel, 3, this.f68134c, false);
        C15137b.b(parcel, iA);
    }
}
