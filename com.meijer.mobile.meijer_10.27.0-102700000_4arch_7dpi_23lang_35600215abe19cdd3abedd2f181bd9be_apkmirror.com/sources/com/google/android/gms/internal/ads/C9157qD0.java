package com.google.android.gms.internal.ads;

import fsimpl.C14045dq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9157qD0 {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f77753d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f77754e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, C14045dq.DST_ATOP, -103, 87, 83, 1, C14045dq.SCREEN, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f77755a = InterfaceC9330ru.f78084a;

    /* renamed from: c, reason: collision with root package name */
    private int f77757c = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f77756b = 2;

    private static final void c(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z10 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(Li0.a(i11));
    }

    public final void a(By0 by0, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i10;
        ByteBuffer byteBuffer2 = by0.f65631d;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - by0.f65631d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f77756b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = by0.f65631d;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i11 = iLimit - iPosition;
        int i12 = this.f77756b;
        int i13 = (i11 + com.medallia.digital.mobilesdk.l3.f92484c) / com.medallia.digital.mobilesdk.l3.f92484c;
        int i14 = i13 + 27 + i11;
        if (i12 == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i14 += length + 44;
        } else {
            length = 0;
        }
        if (this.f77755a.capacity() < i14) {
            this.f77755a = ByteBuffer.allocate(i14).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f77755a.clear();
        }
        ByteBuffer byteBuffer4 = this.f77755a;
        if (this.f77756b == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i10 = 22;
                c(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(Li0.a(length2));
                byteBuffer.put(bArr);
                int i15 = length2 + 28;
                byteBuffer.putInt(22, OV.x(byteBuffer.array(), byteBuffer.arrayOffset(), i15, 0));
                byteBuffer.position(i15);
            } else {
                byteBuffer = byteBuffer4;
                i10 = 22;
                byteBuffer.put(f77753d);
            }
            byteBuffer.put(f77754e);
        } else {
            byteBuffer = byteBuffer4;
            i10 = 22;
        }
        int iC = this.f77757c + M0.c(byteBuffer3);
        this.f77757c = iC;
        int i16 = i10;
        ByteBuffer byteBuffer5 = byteBuffer;
        c(byteBuffer5, iC, this.f77756b, i13, false);
        for (int i17 = 0; i17 < i13; i17++) {
            if (i11 >= 255) {
                byteBuffer5.put((byte) -1);
                i11 -= 255;
            } else {
                byteBuffer5.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f77756b == 2) {
            byteBuffer5.putInt(length + 66, OV.x(byteBuffer5.array(), byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i16, OV.x(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.f77756b++;
        this.f77755a = byteBuffer5;
        by0.b();
        by0.j(this.f77755a.remaining());
        by0.f65631d.put(this.f77755a);
        by0.k();
    }

    public final void b() {
        this.f77755a = InterfaceC9330ru.f78084a;
        this.f77757c = 0;
        this.f77756b = 2;
    }
}
