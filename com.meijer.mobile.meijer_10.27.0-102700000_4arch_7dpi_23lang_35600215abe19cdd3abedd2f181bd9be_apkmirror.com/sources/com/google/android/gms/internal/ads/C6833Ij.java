package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Ij, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6833Ij extends AbstractC15136a {
    public static final Parcelable.Creator<C6833Ij> CREATOR = new C6867Jj();

    /* renamed from: a, reason: collision with root package name */
    public final String f67672a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f67673b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67674c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67675d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f67672a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.c(parcel, 2, this.f67673b);
        C15137b.n(parcel, 3, this.f67674c);
        C15137b.w(parcel, 4, this.f67675d, false);
        C15137b.b(parcel, iA);
    }

    public C6833Ij(String str, boolean z10, int i10, String str2) {
        this.f67672a = str;
        this.f67673b = z10;
        this.f67674c = i10;
        this.f67675d = str2;
    }
}
