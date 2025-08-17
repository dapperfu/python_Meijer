package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Hc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6786Hc extends AbstractC15136a {
    public static final Parcelable.Creator<C6786Hc> CREATOR = new C6820Ic();

    /* renamed from: a, reason: collision with root package name */
    private ParcelFileDescriptor f67473a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f67474b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f67475c;

    /* renamed from: d, reason: collision with root package name */
    private final long f67476d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f67477e;

    public C6786Hc() {
        this(null, false, false, 0L, false);
    }

    public final synchronized long B() {
        return this.f67476d;
    }

    public final synchronized boolean K0() {
        return this.f67473a != null;
    }

    final synchronized ParcelFileDescriptor T() {
        return this.f67473a;
    }

    public final synchronized boolean W0() {
        return this.f67477e;
    }

    public final synchronized InputStream c0() {
        if (this.f67473a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f67473a);
        this.f67473a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean q0() {
        return this.f67474b;
    }

    public final synchronized boolean zzf() {
        return this.f67475c;
    }

    public C6786Hc(ParcelFileDescriptor parcelFileDescriptor, boolean z10, boolean z11, long j10, boolean z12) {
        this.f67473a = parcelFileDescriptor;
        this.f67474b = z10;
        this.f67475c = z11;
        this.f67476d = j10;
        this.f67477e = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, T(), i10, false);
        C15137b.c(parcel, 3, q0());
        C15137b.c(parcel, 4, zzf());
        C15137b.s(parcel, 5, B());
        C15137b.c(parcel, 6, W0());
        C15137b.b(parcel, iA);
    }
}
