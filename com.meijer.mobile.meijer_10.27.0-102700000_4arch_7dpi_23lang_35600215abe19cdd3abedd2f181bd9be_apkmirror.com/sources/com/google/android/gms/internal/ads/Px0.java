package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class Px0 extends Tx0 implements G7 {

    /* renamed from: h, reason: collision with root package name */
    protected final String f69454h = "moov";

    @Override // com.google.android.gms.internal.ads.G7
    public final String zza() {
        return this.f69454h;
    }

    public Px0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.G7
    public final void a(Ux0 ux0, ByteBuffer byteBuffer, long j10, D7 d72) throws IOException {
        ux0.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f70492b = ux0;
        this.f70494d = ux0.zzb();
        ux0.f(ux0.zzb() + j10);
        this.f70495e = ux0.zzb();
        this.f70491a = d72;
    }
}
