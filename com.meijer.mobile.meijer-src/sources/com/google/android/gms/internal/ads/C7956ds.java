package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ds, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7956ds {

    /* renamed from: a, reason: collision with root package name */
    private long f74332a;

    public final long a(ByteBuffer byteBuffer) {
        K7 k72;
        J7 j72;
        long j10 = this.f74332a;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new E7(new C7850cs(byteBufferDuplicate), C8277gs.f75253c).d().iterator();
            while (true) {
                k72 = null;
                if (!it.hasNext()) {
                    j72 = null;
                    break;
                }
                G7 g72 = (G7) it.next();
                if (g72 instanceof J7) {
                    j72 = (J7) g72;
                    break;
                }
            }
            Iterator it2 = j72.d().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                G7 g73 = (G7) it2.next();
                if (g73 instanceof K7) {
                    k72 = (K7) g73;
                    break;
                }
            }
            long jG = (k72.g() * 1000) / k72.h();
            this.f74332a = jG;
            return jG;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
