package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.common.internal.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6664v extends AbstractC15707a {
    public static final Parcelable.Creator<C6664v> CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    private final int f65785a;

    /* renamed from: b, reason: collision with root package name */
    private List f65786b;

    public final int B() {
        return this.f65785a;
    }

    public final List T() {
        return this.f65786b;
    }

    public final void b0(C6659p c6659p) {
        if (this.f65786b == null) {
            this.f65786b = new ArrayList();
        }
        this.f65786b.add(c6659p);
    }

    public C6664v(int i10, List list) {
        this.f65785a = i10;
        this.f65786b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f65785a);
        C15708b.A(parcel, 2, this.f65786b, false);
        C15708b.b(parcel, iA);
    }
}
