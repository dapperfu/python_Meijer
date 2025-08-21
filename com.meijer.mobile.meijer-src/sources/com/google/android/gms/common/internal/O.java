package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC6654k;
import id.C14719b;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class O extends AbstractC15707a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* renamed from: a, reason: collision with root package name */
    final int f65657a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f65658b;

    /* renamed from: c, reason: collision with root package name */
    private final C14719b f65659c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f65660d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f65661e;

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
        return this.f65659c.equals(o10.f65659c) && C6660q.a(T(), o10.T());
    }

    public final C14719b B() {
        return this.f65659c;
    }

    public final InterfaceC6654k T() {
        IBinder iBinder = this.f65658b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC6654k.a.a2(iBinder);
    }

    O(int i10, IBinder iBinder, C14719b c14719b, boolean z10, boolean z11) {
        this.f65657a = i10;
        this.f65658b = iBinder;
        this.f65659c = c14719b;
        this.f65660d = z10;
        this.f65661e = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f65657a);
        C15708b.m(parcel, 2, this.f65658b, false);
        C15708b.u(parcel, 3, this.f65659c, i10, false);
        C15708b.c(parcel, 4, this.f65660d);
        C15708b.c(parcel, 5, this.f65661e);
        C15708b.b(parcel, iA);
    }
}
