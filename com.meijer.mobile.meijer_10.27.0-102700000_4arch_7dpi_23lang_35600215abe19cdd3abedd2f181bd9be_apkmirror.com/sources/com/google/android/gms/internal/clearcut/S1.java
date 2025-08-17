package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes6.dex */
public class S1 {

    /* renamed from: a, reason: collision with root package name */
    protected volatile int f81203a = -1;

    public static final void b(S1 s12, byte[] bArr, int i10, int i11) {
        try {
            N1 n1T = N1.t(bArr, 0, i11);
            s12.a(n1T);
            n1T.p();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public void a(N1 n12) throws IOException {
    }

    public final int c() {
        int iD = d();
        this.f81203a = iD;
        return iD;
    }

    protected int d() {
        return 0;
    }

    @Override // 
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public S1 clone() throws CloneNotSupportedException {
        return (S1) super.clone();
    }

    public String toString() {
        return U1.a(this);
    }
}
