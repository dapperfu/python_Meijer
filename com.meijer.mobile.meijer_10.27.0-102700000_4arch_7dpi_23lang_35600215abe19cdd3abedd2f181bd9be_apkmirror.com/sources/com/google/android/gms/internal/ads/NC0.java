package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
final class NC0 extends AbstractC7183Su {

    /* renamed from: i, reason: collision with root package name */
    private int[] f68840i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f68841j;

    @Override // com.google.android.gms.internal.ads.AbstractC7183Su
    protected final void e() {
        this.f68841j = this.f68840i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7183Su
    protected final void g() {
        this.f68841j = null;
        this.f68840i = null;
    }

    public final void i(int[] iArr) {
        this.f68840i = iArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f68841j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferD = d(((iLimit - iPosition) / this.f70176b.f78083d) * this.f70177c.f78083d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferD.putShort(byteBuffer.getShort(i10 + i10 + iPosition));
            }
            iPosition += this.f70176b.f78083d;
        }
        byteBuffer.position(iLimit);
        byteBufferD.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7183Su
    public final C9328rt c(C9328rt c9328rt) throws zzcg {
        int[] iArr = this.f68840i;
        if (iArr == null) {
            return C9328rt.f78079e;
        }
        if (c9328rt.f78082c != 2) {
            throw new zzcg("Unhandled input format:", c9328rt);
        }
        boolean z10 = c9328rt.f78081b != iArr.length;
        int i10 = 0;
        while (true) {
            int length = iArr.length;
            if (i10 >= length) {
                return z10 ? new C9328rt(c9328rt.f78080a, length, 2) : C9328rt.f78079e;
            }
            int i11 = iArr[i10];
            if (i11 >= c9328rt.f78081b) {
                throw new zzcg("Unhandled input format:", c9328rt);
            }
            z10 |= i11 != i10;
            i10++;
        }
    }

    NC0() {
    }
}
