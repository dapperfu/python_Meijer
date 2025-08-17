package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class Bt0 implements Pk0 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f65613e = {0};

    /* renamed from: a, reason: collision with root package name */
    private final Lq0 f65614a;

    /* renamed from: b, reason: collision with root package name */
    private final int f65615b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f65616c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f65617d;

    private Bt0(Kp0 kp0) throws GeneralSecurityException {
        this.f65614a = new C10078yt0(kp0.d().d(Bk0.a()));
        this.f65615b = kp0.b().b();
        this.f65616c = kp0.c().c();
        if (kp0.b().f().equals(Qp0.f69661d)) {
            this.f65617d = Arrays.copyOf(f65613e, 1);
        } else {
            this.f65617d = new byte[0];
        }
    }

    public static Pk0 a(Kp0 kp0) throws GeneralSecurityException {
        return new Bt0(kp0);
    }

    public static Pk0 b(Zp0 zp0) throws GeneralSecurityException {
        return new Bt0(zp0);
    }

    public final byte[] c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.f65617d;
        return bArr2.length > 0 ? C7941et0.b(this.f65616c, this.f65614a.a(C7941et0.b(bArr, bArr2), this.f65615b)) : C7941et0.b(this.f65616c, this.f65614a.a(bArr, this.f65615b));
    }

    private Bt0(Zp0 zp0) throws GeneralSecurityException {
        String strValueOf = String.valueOf(zp0.b().f());
        this.f65614a = new At0("HMAC".concat(strValueOf), new SecretKeySpec(zp0.d().d(Bk0.a()), "HMAC"));
        this.f65615b = zp0.b().b();
        this.f65616c = zp0.c().c();
        if (zp0.b().g().equals(C8256hq0.f74791d)) {
            this.f65617d = Arrays.copyOf(f65613e, 1);
        } else {
            this.f65617d = new byte[0];
        }
    }

    public Bt0(Lq0 lq0, int i10) throws GeneralSecurityException {
        this.f65614a = lq0;
        this.f65615b = i10;
        this.f65616c = new byte[0];
        this.f65617d = new byte[0];
        lq0.a(new byte[0], i10);
    }
}
