package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.common.internal.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6539v extends AbstractC15136a {
    public static final Parcelable.Creator<C6539v> CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    private final int f64945a;

    /* renamed from: b, reason: collision with root package name */
    private List f64946b;

    public final int B() {
        return this.f64945a;
    }

    public final List T() {
        return this.f64946b;
    }

    public final void c0(C6534p c6534p) {
        if (this.f64946b == null) {
            this.f64946b = new ArrayList();
        }
        this.f64946b.add(c6534p);
    }

    public C6539v(int i10, List list) {
        this.f64945a = i10;
        this.f64946b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f64945a);
        C15137b.A(parcel, 2, this.f64946b, false);
        C15137b.b(parcel, iA);
    }
}
