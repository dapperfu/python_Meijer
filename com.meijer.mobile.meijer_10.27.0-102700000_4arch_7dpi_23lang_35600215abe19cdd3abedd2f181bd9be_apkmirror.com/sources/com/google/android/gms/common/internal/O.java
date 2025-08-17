package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC6529k;
import gd.C14243b;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class O extends AbstractC15136a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* renamed from: a, reason: collision with root package name */
    final int f64817a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f64818b;

    /* renamed from: c, reason: collision with root package name */
    private final C14243b f64819c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f64820d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f64821e;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return this.f64819c.equals(o10.f64819c) && C6535q.a(T(), o10.T());
    }

    public final C14243b B() {
        return this.f64819c;
    }

    public final InterfaceC6529k T() {
        IBinder iBinder = this.f64818b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC6529k.a.a2(iBinder);
    }

    O(int i10, IBinder iBinder, C14243b c14243b, boolean z10, boolean z11) {
        this.f64817a = i10;
        this.f64818b = iBinder;
        this.f64819c = c14243b;
        this.f64820d = z10;
        this.f64821e = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f64817a);
        C15137b.m(parcel, 2, this.f64818b, false);
        C15137b.u(parcel, 3, this.f64819c, i10, false);
        C15137b.c(parcel, 4, this.f64820d);
        C15137b.c(parcel, 5, this.f64821e);
        C15137b.b(parcel, iA);
    }
}
