package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.vision.l1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11051l1 extends AbstractC15136a {
    public static final Parcelable.Creator<C11051l1> CREATOR = new M0();

    /* renamed from: a, reason: collision with root package name */
    public int f84567a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f84568b;

    public C11051l1() {
    }

    public C11051l1(int i10, boolean z10) {
        this.f84567a = i10;
        this.f84568b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f84567a);
        C15137b.c(parcel, 3, this.f84568b);
        C15137b.b(parcel, iA);
    }
}
