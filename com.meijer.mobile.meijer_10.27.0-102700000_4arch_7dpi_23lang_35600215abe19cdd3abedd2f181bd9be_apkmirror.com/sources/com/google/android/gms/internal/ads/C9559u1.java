package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.u1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9559u1 implements InterfaceC7422a0 {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f78710a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78711b;

    /* renamed from: c, reason: collision with root package name */
    private final C9771w0 f78712c = new C9771w0();

    /* synthetic */ C9559u1(B0 b02, int i10, C9666v1 c9666v1) {
        this.f78710a = b02;
        this.f78711b = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7422a0
    public final /* synthetic */ void zzb() {
    }

    private final long b(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        while (interfaceC9236r0.zze() < interfaceC9236r0.zzd() - 6) {
            B0 b02 = this.f78710a;
            int i10 = this.f78711b;
            C9771w0 c9771w0 = this.f78712c;
            long jZze = interfaceC9236r0.zze();
            byte[] bArr = new byte[2];
            interfaceC9236r0.g(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                interfaceC9236r0.zzj();
                interfaceC9236r0.zzg((int) (jZze - interfaceC9236r0.zzf()));
            } else {
                GQ gq2 = new GQ(16);
                System.arraycopy(bArr, 0, gq2.n(), 0, 2);
                gq2.k(C9557u0.a(interfaceC9236r0, gq2.n(), 2, 14));
                interfaceC9236r0.zzj();
                interfaceC9236r0.zzg((int) (jZze - interfaceC9236r0.zzf()));
                if (C9878x0.c(gq2, b02, i10, c9771w0)) {
                    break;
                }
            }
            interfaceC9236r0.zzg(1);
        }
        if (interfaceC9236r0.zze() >= interfaceC9236r0.zzd() - 6) {
            interfaceC9236r0.zzg((int) (interfaceC9236r0.zzd() - interfaceC9236r0.zze()));
            return this.f78710a.f65398j;
        }
        return this.f78712c.f79396a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7422a0
    public final Z a(InterfaceC9236r0 interfaceC9236r0, long j10) throws IOException {
        long jZzf = interfaceC9236r0.zzf();
        long jB = b(interfaceC9236r0);
        long jZze = interfaceC9236r0.zze();
        interfaceC9236r0.zzg(Math.max(6, this.f78710a.f65391c));
        long jB2 = b(interfaceC9236r0);
        long jZze2 = interfaceC9236r0.zze();
        if (jB <= j10 && jB2 > j10) {
            return Z.e(jZze);
        }
        if (jB2 <= j10) {
            return Z.f(jB2, jZze2);
        }
        return Z.d(jB, jZzf);
    }
}
