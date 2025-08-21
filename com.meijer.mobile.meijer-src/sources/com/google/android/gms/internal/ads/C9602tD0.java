package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.tD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9602tD0 extends AbstractC7308Su {

    /* renamed from: i, reason: collision with root package name */
    private int f79354i;

    /* renamed from: j, reason: collision with root package name */
    private int f79355j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f79356k;

    /* renamed from: l, reason: collision with root package name */
    private int f79357l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f79358m = OV.f69936f;

    /* renamed from: n, reason: collision with root package name */
    private int f79359n;

    /* renamed from: o, reason: collision with root package name */
    private long f79360o;

    public final long i() {
        return this.f79360o;
    }

    public final void j() {
        this.f79360o = 0L;
    }

    public final void k(int i10, int i11) {
        this.f79354i = i10;
        this.f79355j = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su, com.google.android.gms.internal.ads.InterfaceC9455ru
    public final boolean zzh() {
        return super.zzh() && this.f79359n == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    public final C9453rt c(C9453rt c9453rt) throws zzcg {
        if (c9453rt.f78922c != 2) {
            throw new zzcg("Unhandled input format:", c9453rt);
        }
        this.f79356k = true;
        return (this.f79354i == 0 && this.f79355j == 0) ? C9453rt.f78919e : c9453rt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    protected final void e() {
        if (this.f79356k) {
            this.f79356k = false;
            int i10 = this.f79355j;
            int i11 = this.f71016b.f78923d;
            this.f79358m = new byte[i10 * i11];
            this.f79357l = this.f79354i * i11;
        }
        this.f79359n = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    protected final void f() {
        if (this.f79356k) {
            if (this.f79359n > 0) {
                this.f79360o += r0 / this.f71016b.f78923d;
            }
            this.f79359n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    protected final void g() {
        this.f79358m = OV.f69936f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 != 0) {
            int iMin = Math.min(i10, this.f79357l);
            this.f79360o += iMin / this.f71016b.f78923d;
            this.f79357l -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.f79357l <= 0) {
                int i11 = i10 - iMin;
                int length = (this.f79359n + i11) - this.f79358m.length;
                ByteBuffer byteBufferD = d(length);
                int iMax = Math.max(0, Math.min(length, this.f79359n));
                byteBufferD.put(this.f79358m, 0, iMax);
                int iMax2 = Math.max(0, Math.min(length - iMax, i11));
                byteBuffer.limit(byteBuffer.position() + iMax2);
                byteBufferD.put(byteBuffer);
                byteBuffer.limit(iLimit);
                int i12 = i11 - iMax2;
                int i13 = this.f79359n - iMax;
                this.f79359n = i13;
                byte[] bArr = this.f79358m;
                System.arraycopy(bArr, iMax, bArr, 0, i13);
                byteBuffer.get(this.f79358m, this.f79359n, i12);
                this.f79359n += i12;
                byteBufferD.flip();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su, com.google.android.gms.internal.ads.InterfaceC9455ru
    public final ByteBuffer zzb() {
        int i10;
        if (super.zzh() && (i10 = this.f79359n) > 0) {
            d(i10).put(this.f79358m, 0, this.f79359n).flip();
            this.f79359n = 0;
        }
        return super.zzb();
    }
}
