package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.fo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8162fo extends AbstractC15707a {
    public static final Parcelable.Creator<C8162fo> CREATOR = new C8269go();

    /* renamed from: a, reason: collision with root package name */
    public final String f75016a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f75016a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.b(parcel, iA);
    }

    public C8162fo(String str) {
        this.f75016a = str;
    }
}
