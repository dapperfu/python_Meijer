package com.google.android.gms.internal.ads;

import Ic.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Fa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6714Fa extends AbstractCallableC7691cb {
    public C6714Fa(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11) {
        super(c8863na, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", c8611l8, i10, 24);
    }

    private final void c() throws ExecutionException, InterruptedException, TimeoutException {
        Ic.a aVarH = this.f73201a.h();
        if (aVarH == null) {
            return;
        }
        try {
            a.C0217a c0217aB = aVarH.b();
            String strA = c0217aB.a();
            int i10 = C9184qa.f77795b;
            if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(strA);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                strA = C7547b9.a(bArr, true);
            }
            if (strA != null) {
                synchronized (this.f73204d) {
                    this.f73204d.z0(strA);
                    this.f73204d.y0(c0217aB.b());
                    this.f73204d.a0(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws ExecutionException, IllegalAccessException, InterruptedException, TimeoutException, InvocationTargetException {
        if (this.f73201a.q()) {
            c();
            return;
        }
        synchronized (this.f73204d) {
            this.f73204d.z0((String) this.f73205e.invoke(null, this.f73201a.b()));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    public final Void b() throws Exception {
        if (this.f73201a.r()) {
            super.b();
            return null;
        }
        if (this.f73201a.q()) {
            c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        b();
        return null;
    }
}
