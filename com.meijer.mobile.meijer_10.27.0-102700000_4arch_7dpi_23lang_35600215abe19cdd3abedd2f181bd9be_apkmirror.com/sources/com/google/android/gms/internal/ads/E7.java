package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class E7 extends Tx0 implements Closeable {
    @Override // com.google.android.gms.internal.ads.Tx0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    static {
        AbstractC7525ay0.b(E7.class);
    }

    @Override // com.google.android.gms.internal.ads.Tx0
    public final String toString() {
        String string = this.f70492b.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    public E7(Ux0 ux0, D7 d72) throws IOException {
        g(ux0, ux0.zzc(), d72);
    }
}
