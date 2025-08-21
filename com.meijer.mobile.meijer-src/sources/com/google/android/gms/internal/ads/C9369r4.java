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
final class C9369r4 implements X0 {

    /* renamed from: a, reason: collision with root package name */
    private final X0 f78755a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8835m4 f78756b;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC9049o4 f78761g;

    /* renamed from: h, reason: collision with root package name */
    private C f78762h;

    /* renamed from: d, reason: collision with root package name */
    private int f78758d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f78759e = 0;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f78760f = OV.f69936f;

    /* renamed from: c, reason: collision with root package name */
    private final GQ f78757c = new GQ();

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ int b(InterfaceC9810vA0 interfaceC9810vA0, int i10, boolean z10) {
        return V0.a(this, interfaceC9810vA0, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ void c(GQ gq2, int i10) {
        V0.b(this, gq2, i10);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ void e(long j10) {
    }

    private final void i(int i10) {
        int length = this.f78760f.length;
        int i11 = this.f78759e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f78758d;
        int iMax = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.f78760f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f78758d, bArr2, 0, i12);
        this.f78758d = 0;
        this.f78759e = i12;
        this.f78760f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void a(final long j10, final int i10, int i11, int i12, W0 w02) {
        if (this.f78761g == null) {
            this.f78755a.a(j10, i10, i11, i12, w02);
            return;
        }
        C8211gC.e(w02 == null, "DRM on subtitles is not supported");
        int i13 = (this.f78759e - i12) - i11;
        this.f78761g.a(this.f78760f, i13, i11, C8942n4.a(), new ME() { // from class: com.google.android.gms.internal.ads.q4
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                this.f78542a.h(j10, i10, (C8195g4) obj);
            }
        });
        int i14 = i13 + i11;
        this.f78758d = i14;
        if (i14 == this.f78759e) {
            this.f78758d = 0;
            this.f78759e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void d(C c10) {
        String str = c10.f66504o;
        str.getClass();
        C8211gC.d(C7182Pc.b(str) == 3);
        if (!c10.equals(this.f78762h)) {
            this.f78762h = c10;
            this.f78761g = this.f78756b.b(c10) ? this.f78756b.c(c10) : null;
        }
        if (this.f78761g == null) {
            this.f78755a.d(c10);
            return;
        }
        X0 x02 = this.f78755a;
        C9717uH0 c9717uH0B = c10.b();
        c9717uH0B.B("application/x-media3-cues");
        c9717uH0B.a(c10.f66504o);
        c9717uH0B.F(Long.MAX_VALUE);
        c9717uH0B.e(this.f78756b.a(c10));
        x02.d(c9717uH0B.H());
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final int f(InterfaceC9810vA0 interfaceC9810vA0, int i10, boolean z10, int i11) throws IOException {
        if (this.f78761g == null) {
            return this.f78755a.f(interfaceC9810vA0, i10, z10, 0);
        }
        i(i10);
        int iZza = interfaceC9810vA0.zza(this.f78760f, this.f78759e, i10);
        if (iZza != -1) {
            this.f78759e += iZza;
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void g(GQ gq2, int i10, int i11) {
        if (this.f78761g == null) {
            this.f78755a.g(gq2, i10, i11);
            return;
        }
        i(i10);
        gq2.h(this.f78760f, this.f78759e, i10);
        this.f78759e += i10;
    }

    final /* synthetic */ void h(long j10, int i10, C8195g4 c8195g4) {
        C8211gC.b(this.f78762h);
        AbstractC8042eh0 abstractC8042eh0 = c8195g4.f75070a;
        long j11 = c8195g4.f75072c;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC8042eh0.size());
        Iterator<E> it = abstractC8042eh0.iterator();
        while (it.hasNext()) {
            arrayList.add(((C7510Yx) it.next()).a());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j11);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        GQ gq2 = this.f78757c;
        int length = bArrMarshall.length;
        gq2.j(bArrMarshall, length);
        this.f78755a.c(this.f78757c, length);
        long j12 = c8195g4.f75071b;
        if (j12 == -9223372036854775807L) {
            C8211gC.f(this.f78762h.f66509t == Long.MAX_VALUE);
        } else {
            long j13 = this.f78762h.f66509t;
            j10 = j13 == Long.MAX_VALUE ? j10 + j12 : j12 + j13;
        }
        this.f78755a.a(j10, i10, length, 0, null);
    }

    public C9369r4(X0 x02, InterfaceC8835m4 interfaceC8835m4) {
        this.f78755a = x02;
        this.f78756b = interfaceC8835m4;
    }
}
