package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
final class NC0 extends AbstractC7308Su {

    /* renamed from: i, reason: collision with root package name */
    private int[] f69680i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f69681j;

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    protected final void e() {
        this.f69681j = this.f69680i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    protected final void g() {
        this.f69681j = null;
        this.f69680i = null;
    }

    public final void i(int[] iArr) {
        this.f69680i = iArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f69681j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferD = d(((iLimit - iPosition) / this.f71016b.f78923d) * this.f71017c.f78923d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferD.putShort(byteBuffer.getShort(i10 + i10 + iPosition));
            }
            iPosition += this.f71016b.f78923d;
        }
        byteBuffer.position(iLimit);
        byteBufferD.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    public final C9453rt c(C9453rt c9453rt) throws zzcg {
        int[] iArr = this.f69680i;
        if (iArr == null) {
            return C9453rt.f78919e;
        }
        if (c9453rt.f78922c != 2) {
            throw new zzcg("Unhandled input format:", c9453rt);
        }
        boolean z10 = c9453rt.f78921b != iArr.length;
        int i10 = 0;
        while (true) {
            int length = iArr.length;
            if (i10 >= length) {
                return z10 ? new C9453rt(c9453rt.f78920a, length, 2) : C9453rt.f78919e;
            }
            int i11 = iArr[i10];
            if (i11 >= c9453rt.f78921b) {
                throw new zzcg("Unhandled input format:", c9453rt);
            }
            z10 |= i11 != i10;
            i10++;
        }
    }

    NC0() {
    }
}
