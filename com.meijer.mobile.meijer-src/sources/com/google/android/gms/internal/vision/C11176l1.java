package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.vision.l1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11176l1 extends AbstractC15707a {
    public static final Parcelable.Creator<C11176l1> CREATOR = new M0();

    /* renamed from: a, reason: collision with root package name */
    public int f85407a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f85408b;

    public C11176l1() {
    }

    public C11176l1(int i10, boolean z10) {
        this.f85407a = i10;
        this.f85408b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f85407a);
        C15708b.c(parcel, 3, this.f85408b);
        C15708b.b(parcel, iA);
    }
}
