package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.J;
import com.google.android.gms.internal.pal.K;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class K<MessageType extends K<MessageType, BuilderType>, BuilderType extends J<MessageType, BuilderType>> implements InterfaceC10815g1 {
    protected int zza = 0;

    int c() {
        throw null;
    }

    void d(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10815g1
    public final AbstractC10730b0 a() {
        try {
            int iD = D();
            AbstractC10730b0 abstractC10730b0 = AbstractC10730b0.f83895b;
            byte[] bArr = new byte[iD];
            AbstractC10878k0 abstractC10878k0C = AbstractC10878k0.c(bArr);
            b(abstractC10878k0C);
            abstractC10878k0C.d();
            return new Y(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10815g1
    public final byte[] i() {
        try {
            byte[] bArr = new byte[D()];
            AbstractC10878k0 abstractC10878k0C = AbstractC10878k0.c(bArr);
            b(abstractC10878k0C);
            abstractC10878k0C.d();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
