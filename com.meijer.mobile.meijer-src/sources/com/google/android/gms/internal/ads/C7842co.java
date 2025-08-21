package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.co, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7842co extends AbstractC15707a {
    public static final Parcelable.Creator<C7842co> CREATOR = new C8055eo();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f74100a;

    /* renamed from: b, reason: collision with root package name */
    public final List f74101b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f74100a;
        int iA = C15708b.a(parcel);
        C15708b.c(parcel, 2, z10);
        C15708b.y(parcel, 3, this.f74101b, false);
        C15708b.b(parcel, iA);
    }

    public C7842co(boolean z10, List list) {
        this.f74100a = z10;
        this.f74101b = list;
    }
}
