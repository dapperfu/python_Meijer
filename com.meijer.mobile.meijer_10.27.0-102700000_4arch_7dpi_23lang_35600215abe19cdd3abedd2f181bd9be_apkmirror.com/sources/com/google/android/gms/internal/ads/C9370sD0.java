package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.sD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9370sD0 extends AbstractC7183Su {

    /* renamed from: i, reason: collision with root package name */
    private static final int f78188i = Float.floatToIntBits(Float.NaN);

    private static void i(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f78188i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7183Su
    public final C9328rt c(C9328rt c9328rt) throws zzcg {
        int i10 = c9328rt.f78082c;
        int i11 = OV.f69091a;
        if (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736) {
            return new C9328rt(c9328rt.f78080a, c9328rt.f78081b, 4);
        }
        if (i10 == 4) {
            return C9328rt.f78079e;
        }
        throw new zzcg("Unhandled input format:", c9328rt);
    }

    C9370sD0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferD;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f70176b.f78082c;
        if (i11 != 21) {
            if (i11 != 22) {
                if (i11 != 1342177280) {
                    if (i11 == 1610612736) {
                        byteBufferD = d(i10);
                        while (iPosition < iLimit) {
                            int i12 = byteBuffer.get(iPosition + 3) & 255;
                            int i13 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                            i(i12 | i13 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferD);
                            iPosition += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    byteBufferD = d((i10 / 3) * 4);
                    while (iPosition < iLimit) {
                        i(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferD);
                        iPosition += 3;
                    }
                }
            } else {
                byteBufferD = d(i10);
                while (iPosition < iLimit) {
                    int i14 = byteBuffer.get(iPosition) & 255;
                    int i15 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                    i(i14 | i15 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferD);
                    iPosition += 4;
                }
            }
        } else {
            byteBufferD = d((i10 / 3) * 4);
            while (iPosition < iLimit) {
                i(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferD);
                iPosition += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferD.flip();
    }
}
