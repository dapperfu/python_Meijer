package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.fo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8037fo extends AbstractC15136a {
    public static final Parcelable.Creator<C8037fo> CREATOR = new C8144go();

    /* renamed from: a, reason: collision with root package name */
    public final String f74176a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f74176a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.b(parcel, iA);
    }

    public C8037fo(String str) {
        this.f74176a = str;
    }
}
