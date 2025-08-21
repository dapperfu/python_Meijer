package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.rp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9445rp extends AbstractC15707a {
    public static final Parcelable.Creator<C9445rp> CREATOR = new C9552sp();

    /* renamed from: a, reason: collision with root package name */
    public final String f78906a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78907b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f78906a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.w(parcel, 2, this.f78907b, false);
        C15708b.b(parcel, iA);
    }

    public C9445rp(String str, String str2) {
        this.f78906a = str;
        this.f78907b = str2;
    }
}
