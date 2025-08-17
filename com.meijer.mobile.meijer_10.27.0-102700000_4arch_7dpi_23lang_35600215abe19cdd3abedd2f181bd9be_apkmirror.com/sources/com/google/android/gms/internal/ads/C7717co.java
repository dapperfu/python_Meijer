package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.co, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7717co extends AbstractC15136a {
    public static final Parcelable.Creator<C7717co> CREATOR = new C7930eo();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73260a;

    /* renamed from: b, reason: collision with root package name */
    public final List f73261b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f73260a;
        int iA = C15137b.a(parcel);
        C15137b.c(parcel, 2, z10);
        C15137b.y(parcel, 3, this.f73261b, false);
        C15137b.b(parcel, iA);
    }

    public C7717co(boolean z10, List list) {
        this.f73260a = z10;
        this.f73261b = list;
    }
}
