package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Gt0;
import com.google.android.gms.internal.ads.Ht0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class Ht0<MessageType extends Ht0<MessageType, BuilderType>, BuilderType extends Gt0<MessageType, BuilderType>> implements InterfaceC9245pv0 {
    protected int zzq = 0;

    int e(Hv0 hv0) {
        return d();
    }

    int d() {
        throw new UnsupportedOperationException();
    }

    zzhag f() {
        return new zzhag(this);
    }

    void h(int i10) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void g(Iterable<T> iterable, List<? super T> list) {
        Gt0.i(iterable, list);
    }

    private String k(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9245pv0
    public Zt0 a() {
        try {
            int iZzaY = zzaY();
            Zt0 zt0 = Zt0.f73122b;
            byte[] bArr = new byte[iZzaY];
            C8389hu0 c8389hu0 = new C8389hu0(bArr, 0, iZzaY);
            c(c8389hu0);
            c8389hu0.g();
            return new Wt0(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(k("ByteString"), e10);
        }
    }

    public void i(OutputStream outputStream) throws IOException {
        C8494iu0 c8494iu0 = new C8494iu0(outputStream, AbstractC8708ku0.c(zzaY()));
        c(c8494iu0);
        c8494iu0.j();
    }

    public byte[] j() {
        try {
            int iZzaY = zzaY();
            byte[] bArr = new byte[iZzaY];
            C8389hu0 c8389hu0 = new C8389hu0(bArr, 0, iZzaY);
            c(c8389hu0);
            c8389hu0.g();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(k("byte array"), e10);
        }
    }
}
