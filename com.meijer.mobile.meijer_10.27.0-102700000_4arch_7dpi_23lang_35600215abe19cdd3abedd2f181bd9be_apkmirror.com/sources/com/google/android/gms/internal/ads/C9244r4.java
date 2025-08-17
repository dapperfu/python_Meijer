package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.r4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9244r4 implements X0 {

    /* renamed from: a, reason: collision with root package name */
    private final X0 f77915a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8710m4 f77916b;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC8924o4 f77921g;

    /* renamed from: h, reason: collision with root package name */
    private C f77922h;

    /* renamed from: d, reason: collision with root package name */
    private int f77918d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f77919e = 0;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f77920f = OV.f69096f;

    /* renamed from: c, reason: collision with root package name */
    private final GQ f77917c = new GQ();

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ int b(InterfaceC9685vA0 interfaceC9685vA0, int i10, boolean z10) {
        return V0.a(this, interfaceC9685vA0, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ void c(GQ gq2, int i10) {
        V0.b(this, gq2, i10);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ void e(long j10) {
    }

    private final void i(int i10) {
        int length = this.f77920f.length;
        int i11 = this.f77919e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f77918d;
        int iMax = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.f77920f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f77918d, bArr2, 0, i12);
        this.f77918d = 0;
        this.f77919e = i12;
        this.f77920f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void a(final long j10, final int i10, int i11, int i12, W0 w02) {
        if (this.f77921g == null) {
            this.f77915a.a(j10, i10, i11, i12, w02);
            return;
        }
        C8086gC.e(w02 == null, "DRM on subtitles is not supported");
        int i13 = (this.f77919e - i12) - i11;
        this.f77921g.a(this.f77920f, i13, i11, C8817n4.a(), new ME() { // from class: com.google.android.gms.internal.ads.q4
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                this.f77702a.h(j10, i10, (C8070g4) obj);
            }
        });
        int i14 = i13 + i11;
        this.f77918d = i14;
        if (i14 == this.f77919e) {
            this.f77918d = 0;
            this.f77919e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void d(C c10) {
        String str = c10.f65664o;
        str.getClass();
        C8086gC.d(C7057Pc.b(str) == 3);
        if (!c10.equals(this.f77922h)) {
            this.f77922h = c10;
            this.f77921g = this.f77916b.b(c10) ? this.f77916b.c(c10) : null;
        }
        if (this.f77921g == null) {
            this.f77915a.d(c10);
            return;
        }
        X0 x02 = this.f77915a;
        C9592uH0 c9592uH0B = c10.b();
        c9592uH0B.B("application/x-media3-cues");
        c9592uH0B.a(c10.f65664o);
        c9592uH0B.F(Long.MAX_VALUE);
        c9592uH0B.e(this.f77916b.a(c10));
        x02.d(c9592uH0B.H());
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final int f(InterfaceC9685vA0 interfaceC9685vA0, int i10, boolean z10, int i11) throws IOException {
        if (this.f77921g == null) {
            return this.f77915a.f(interfaceC9685vA0, i10, z10, 0);
        }
        i(i10);
        int iZza = interfaceC9685vA0.zza(this.f77920f, this.f77919e, i10);
        if (iZza != -1) {
            this.f77919e += iZza;
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void g(GQ gq2, int i10, int i11) {
        if (this.f77921g == null) {
            this.f77915a.g(gq2, i10, i11);
            return;
        }
        i(i10);
        gq2.h(this.f77920f, this.f77919e, i10);
        this.f77919e += i10;
    }

    final /* synthetic */ void h(long j10, int i10, C8070g4 c8070g4) {
        C8086gC.b(this.f77922h);
        AbstractC7917eh0 abstractC7917eh0 = c8070g4.f74230a;
        long j11 = c8070g4.f74232c;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC7917eh0.size());
        Iterator<E> it = abstractC7917eh0.iterator();
        while (it.hasNext()) {
            arrayList.add(((C7385Yx) it.next()).a());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j11);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        GQ gq2 = this.f77917c;
        int length = bArrMarshall.length;
        gq2.j(bArrMarshall, length);
        this.f77915a.c(this.f77917c, length);
        long j12 = c8070g4.f74231b;
        if (j12 == -9223372036854775807L) {
            C8086gC.f(this.f77922h.f65669t == Long.MAX_VALUE);
        } else {
            long j13 = this.f77922h.f65669t;
            j10 = j13 == Long.MAX_VALUE ? j10 + j12 : j12 + j13;
        }
        this.f77915a.a(j10, i10, length, 0, null);
    }

    public C9244r4(X0 x02, InterfaceC8710m4 interfaceC8710m4) {
        this.f77915a = x02;
        this.f77916b = interfaceC8710m4;
    }
}
