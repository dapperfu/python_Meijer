package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.u1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9684u1 implements InterfaceC7547a0 {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f79550a;

    /* renamed from: b, reason: collision with root package name */
    private final int f79551b;

    /* renamed from: c, reason: collision with root package name */
    private final C9896w0 f79552c = new C9896w0();

    /* synthetic */ C9684u1(B0 b02, int i10, C9791v1 c9791v1) {
        this.f79550a = b02;
        this.f79551b = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7547a0
    public final /* synthetic */ void zzb() {
    }

    private final long b(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        while (interfaceC9361r0.zze() < interfaceC9361r0.zzd() - 6) {
            B0 b02 = this.f79550a;
            int i10 = this.f79551b;
            C9896w0 c9896w0 = this.f79552c;
            long jZze = interfaceC9361r0.zze();
            byte[] bArr = new byte[2];
            interfaceC9361r0.g(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                interfaceC9361r0.zzj();
                interfaceC9361r0.zzg((int) (jZze - interfaceC9361r0.zzf()));
            } else {
                GQ gq2 = new GQ(16);
                System.arraycopy(bArr, 0, gq2.n(), 0, 2);
                gq2.k(C9682u0.a(interfaceC9361r0, gq2.n(), 2, 14));
                interfaceC9361r0.zzj();
                interfaceC9361r0.zzg((int) (jZze - interfaceC9361r0.zzf()));
                if (C10003x0.c(gq2, b02, i10, c9896w0)) {
                    break;
                }
            }
            interfaceC9361r0.zzg(1);
        }
        if (interfaceC9361r0.zze() >= interfaceC9361r0.zzd() - 6) {
            interfaceC9361r0.zzg((int) (interfaceC9361r0.zzd() - interfaceC9361r0.zze()));
            return this.f79550a.f66238j;
        }
        return this.f79552c.f80236a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7547a0
    public final Z a(InterfaceC9361r0 interfaceC9361r0, long j10) throws IOException {
        long jZzf = interfaceC9361r0.zzf();
        long jB = b(interfaceC9361r0);
        long jZze = interfaceC9361r0.zze();
        interfaceC9361r0.zzg(Math.max(6, this.f79550a.f66231c));
        long jB2 = b(interfaceC9361r0);
        long jZze2 = interfaceC9361r0.zze();
        if (jB <= j10 && jB2 > j10) {
            return Z.e(jZze);
        }
        if (jB2 <= j10) {
            return Z.f(jB2, jZze2);
        }
        return Z.d(jB, jZzf);
    }
}
