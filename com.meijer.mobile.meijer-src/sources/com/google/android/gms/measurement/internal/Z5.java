package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class Z5 extends AbstractC15707a {
    public static final Parcelable.Creator<Z5> CREATOR = new C11225a6();

    /* renamed from: a, reason: collision with root package name */
    public final List f86181a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f86181a;
        int iA = C15708b.a(parcel);
        C15708b.A(parcel, 1, list, false);
        C15708b.b(parcel, iA);
    }

    Z5(List list) {
        this.f86181a = list;
    }
}
