package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class Z5 extends AbstractC15136a {
    public static final Parcelable.Creator<Z5> CREATOR = new C11100a6();

    /* renamed from: a, reason: collision with root package name */
    public final List f85341a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f85341a;
        int iA = C15137b.a(parcel);
        C15137b.A(parcel, 1, list, false);
        C15137b.b(parcel, iA);
    }

    Z5(List list) {
        this.f85341a = list;
    }
}
