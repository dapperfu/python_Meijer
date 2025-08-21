package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9874vp0 implements Ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f79974a;

    /* renamed from: b, reason: collision with root package name */
    private final Et0 f79975b;

    /* renamed from: c, reason: collision with root package name */
    private final Zt0 f79976c;

    /* renamed from: d, reason: collision with root package name */
    private final Xr0 f79977d;

    /* renamed from: e, reason: collision with root package name */
    private final Es0 f79978e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f79979f;

    private C9874vp0(String str, Et0 et0, Zt0 zt0, Xr0 xr0, Es0 es0, Integer num) {
        this.f79974a = str;
        this.f79975b = et0;
        this.f79976c = zt0;
        this.f79977d = xr0;
        this.f79978e = es0;
        this.f79979f = num;
    }

    public final Xr0 b() {
        return this.f79977d;
    }

    public final Es0 c() {
        return this.f79978e;
    }

    public final Zt0 d() {
        return this.f79976c;
    }

    public final Integer e() {
        return this.f79979f;
    }

    public final String f() {
        return this.f79974a;
    }

    @Override // com.google.android.gms.internal.ads.Ap0
    public final Et0 zzd() {
        return this.f79975b;
    }

    public static C9874vp0 a(String str, Zt0 zt0, Xr0 xr0, Es0 es0, Integer num) throws GeneralSecurityException {
        if (es0 == Es0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C9874vp0(str, Hp0.a(str), zt0, xr0, es0, num);
    }
}
