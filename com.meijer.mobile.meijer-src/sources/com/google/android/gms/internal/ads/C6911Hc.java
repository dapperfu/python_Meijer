package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Hc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6911Hc extends AbstractC15707a {
    public static final Parcelable.Creator<C6911Hc> CREATOR = new C6945Ic();

    /* renamed from: a, reason: collision with root package name */
    private ParcelFileDescriptor f68313a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f68314b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f68315c;

    /* renamed from: d, reason: collision with root package name */
    private final long f68316d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f68317e;

    public C6911Hc() {
        this(null, false, false, 0L, false);
    }

    public final synchronized long B() {
        return this.f68316d;
    }

    public final synchronized boolean I0() {
        return this.f68313a != null;
    }

    final synchronized ParcelFileDescriptor T() {
        return this.f68313a;
    }

    public final synchronized boolean U0() {
        return this.f68317e;
    }

    public final synchronized InputStream b0() {
        if (this.f68313a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f68313a);
        this.f68313a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean r0() {
        return this.f68314b;
    }

    public final synchronized boolean zzf() {
        return this.f68315c;
    }

    public C6911Hc(ParcelFileDescriptor parcelFileDescriptor, boolean z10, boolean z11, long j10, boolean z12) {
        this.f68313a = parcelFileDescriptor;
        this.f68314b = z10;
        this.f68315c = z11;
        this.f68316d = j10;
        this.f68317e = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, T(), i10, false);
        C15708b.c(parcel, 3, r0());
        C15708b.c(parcel, 4, zzf());
        C15708b.s(parcel, 5, B());
        C15708b.c(parcel, 6, U0());
        C15708b.b(parcel, iA);
    }
}
