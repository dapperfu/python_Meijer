package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.tD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9477tD0 extends AbstractC7183Su {

    /* renamed from: i, reason: collision with root package name */
    private int f78514i;

    /* renamed from: j, reason: collision with root package name */
    private int f78515j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f78516k;

    /* renamed from: l, reason: collision with root package name */
    private int f78517l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f78518m = OV.f69096f;

    /* renamed from: n, reason: collision with root package name */
    private int f78519n;

    /* renamed from: o, reason: collision with root package name */
    private long f78520o;

    public final long i() {
        return this.f78520o;
    }

    public final void j() {
        this.f78520o = 0L;
    }

    public final void k(int i10, int i11) {
        this.f78514i = i10;
        this.f78515j = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7183Su, com.google.android.gms.internal.ads.InterfaceC9330ru
    public final boolean zzh() {
        return super.zzh() && this.f78519n == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7183Su
    public final C9328rt c(C9328rt c9328rt) throws zzcg {
        if (c9328rt.f78082c != 2) {
            throw new zzcg("Unhandled input format:", c9328rt);
        }
        this.f78516k = true;
        return (this.f78514i == 0 && this.f78515j == 0) ? C9328rt.f78079e : c9328rt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7183Su
    protected final void e() {
        if (this.f78516k) {
            this.f78516k = false;
            int i10 = this.f78515j;
            int i11 = this.f70176b.f78083d;
            this.f78518m = new byte[i10 * i11];
            this.f78517l = this.f78514i * i11;
        }
        this.f78519n = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7183Su
    protected final void f() {
        if (this.f78516k) {
            if (this.f78519n > 0) {
                this.f78520o += r0 / this.f70176b.f78083d;
            }
            this.f78519n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7183Su
    protected final void g() {
        this.f78518m = OV.f69096f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 != 0) {
            int iMin = Math.min(i10, this.f78517l);
            this.f78520o += iMin / this.f70176b.f78083d;
            this.f78517l -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.f78517l <= 0) {
                int i11 = i10 - iMin;
                int length = (this.f78519n + i11) - this.f78518m.length;
                ByteBuffer byteBufferD = d(length);
                int iMax = Math.max(0, Math.min(length, this.f78519n));
                byteBufferD.put(this.f78518m, 0, iMax);
                int iMax2 = Math.max(0, Math.min(length - iMax, i11));
                byteBuffer.limit(byteBuffer.position() + iMax2);
                byteBufferD.put(byteBuffer);
                byteBuffer.limit(iLimit);
                int i12 = i11 - iMax2;
                int i13 = this.f78519n - iMax;
                this.f78519n = i13;
                byte[] bArr = this.f78518m;
                System.arraycopy(bArr, iMax, bArr, 0, i13);
                byteBuffer.get(this.f78518m, this.f78519n, i12);
                this.f78519n += i12;
                byteBufferD.flip();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7183Su, com.google.android.gms.internal.ads.InterfaceC9330ru
    public final ByteBuffer zzb() {
        int i10;
        if (super.zzh() && (i10 = this.f78519n) > 0) {
            d(i10).put(this.f78518m, 0, this.f78519n).flip();
            this.f78519n = 0;
        }
        return super.zzb();
    }
}
