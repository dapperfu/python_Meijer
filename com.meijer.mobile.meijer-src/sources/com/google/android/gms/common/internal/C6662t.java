package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.common.internal.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6662t extends AbstractC15707a {
    public static final Parcelable.Creator<C6662t> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    private final int f65778a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f65779b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f65780c;

    /* renamed from: d, reason: collision with root package name */
    private final int f65781d;

    /* renamed from: e, reason: collision with root package name */
    private final int f65782e;

    public C6662t(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f65778a = i10;
        this.f65779b = z10;
        this.f65780c = z11;
        this.f65781d = i11;
        this.f65782e = i12;
    }

    public int B() {
        return this.f65781d;
    }

    public int I0() {
        return this.f65778a;
    }

    public int T() {
        return this.f65782e;
    }

    public boolean b0() {
        return this.f65779b;
    }

    public boolean r0() {
        return this.f65780c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, I0());
        C15708b.c(parcel, 2, b0());
        C15708b.c(parcel, 3, r0());
        C15708b.n(parcel, 4, B());
        C15708b.n(parcel, 5, T());
        C15708b.b(parcel, iA);
    }
}
