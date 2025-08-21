package com.google.android.gms.internal.ads;

import Kc.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Fa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6839Fa extends AbstractCallableC7816cb {
    public C6839Fa(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11) {
        super(c8988na, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", c8736l8, i10, 24);
    }

    private final void c() throws ExecutionException, InterruptedException, TimeoutException {
        Kc.a aVarH = this.f74041a.h();
        if (aVarH == null) {
            return;
        }
        try {
            a.C0277a c0277aB = aVarH.b();
            String strA = c0277aB.a();
            int i10 = C9309qa.f78635b;
            if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(strA);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                strA = C7672b9.a(bArr, true);
            }
            if (strA != null) {
                synchronized (this.f74044d) {
                    this.f74044d.z0(strA);
                    this.f74044d.y0(c0277aB.b());
                    this.f74044d.a0(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws ExecutionException, IllegalAccessException, InterruptedException, TimeoutException, InvocationTargetException {
        if (this.f74041a.q()) {
            c();
            return;
        }
        synchronized (this.f74044d) {
            this.f74044d.z0((String) this.f74045e.invoke(null, this.f74041a.b()));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    public final Void b() throws Exception {
        if (this.f74041a.r()) {
            super.b();
            return null;
        }
        if (this.f74041a.q()) {
            c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        b();
        return null;
    }
}
