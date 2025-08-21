package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class Bt0 implements Pk0 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f66453e = {0};

    /* renamed from: a, reason: collision with root package name */
    private final Lq0 f66454a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66455b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f66456c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f66457d;

    private Bt0(Kp0 kp0) throws GeneralSecurityException {
        this.f66454a = new C10203yt0(kp0.d().d(Bk0.a()));
        this.f66455b = kp0.b().b();
        this.f66456c = kp0.c().c();
        if (kp0.b().f().equals(Qp0.f70501d)) {
            this.f66457d = Arrays.copyOf(f66453e, 1);
        } else {
            this.f66457d = new byte[0];
        }
    }

    public static Pk0 a(Kp0 kp0) throws GeneralSecurityException {
        return new Bt0(kp0);
    }

    public static Pk0 b(Zp0 zp0) throws GeneralSecurityException {
        return new Bt0(zp0);
    }

    public final byte[] c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.f66457d;
        return bArr2.length > 0 ? C8066et0.b(this.f66456c, this.f66454a.a(C8066et0.b(bArr, bArr2), this.f66455b)) : C8066et0.b(this.f66456c, this.f66454a.a(bArr, this.f66455b));
    }

    private Bt0(Zp0 zp0) throws GeneralSecurityException {
        String strValueOf = String.valueOf(zp0.b().f());
        this.f66454a = new At0("HMAC".concat(strValueOf), new SecretKeySpec(zp0.d().d(Bk0.a()), "HMAC"));
        this.f66455b = zp0.b().b();
        this.f66456c = zp0.c().c();
        if (zp0.b().g().equals(C8381hq0.f75631d)) {
            this.f66457d = Arrays.copyOf(f66453e, 1);
        } else {
            this.f66457d = new byte[0];
        }
    }

    public Bt0(Lq0 lq0, int i10) throws GeneralSecurityException {
        this.f66454a = lq0;
        this.f66455b = i10;
        this.f66456c = new byte[0];
        this.f66457d = new byte[0];
        lq0.a(new byte[0], i10);
    }
}
