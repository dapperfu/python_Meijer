package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class Px0 extends Tx0 implements G7 {

    /* renamed from: h, reason: collision with root package name */
    protected final String f70294h = "moov";

    @Override // com.google.android.gms.internal.ads.G7
    public final String zza() {
        return this.f70294h;
    }

    public Px0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.G7
    public final void a(Ux0 ux0, ByteBuffer byteBuffer, long j10, D7 d72) throws IOException {
        ux0.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f71332b = ux0;
        this.f71334d = ux0.zzb();
        ux0.f(ux0.zzb() + j10);
        this.f71335e = ux0.zzb();
        this.f71331a = d72;
    }
}
