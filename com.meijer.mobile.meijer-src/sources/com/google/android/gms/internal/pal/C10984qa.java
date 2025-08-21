package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.qa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10984qa implements InterfaceC11015sa {

    /* renamed from: a, reason: collision with root package name */
    private final String f84651a;

    /* renamed from: b, reason: collision with root package name */
    private final C10745bf f84652b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC10730b0 f84653c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC10987qd f84654d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f84655e;

    /* renamed from: f, reason: collision with root package name */
    private final int f84656f;

    public static C10984qa e(String str, AbstractC10730b0 abstractC10730b0, EnumC10987qd enumC10987qd, int i10, Integer num) throws GeneralSecurityException {
        if (i10 == 5) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C10984qa(str, abstractC10730b0, enumC10987qd, i10, num);
    }

    public final EnumC10987qd a() {
        return this.f84654d;
    }

    public final AbstractC10730b0 b() {
        return this.f84653c;
    }

    public final Integer c() {
        return this.f84655e;
    }

    public final String d() {
        return this.f84651a;
    }

    public final int f() {
        return this.f84656f;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11015sa
    public final C10745bf zzb() {
        return this.f84652b;
    }

    private C10984qa(String str, AbstractC10730b0 abstractC10730b0, EnumC10987qd enumC10987qd, int i10, Integer num) {
        this.f84651a = str;
        this.f84652b = Ba.a(str);
        this.f84653c = abstractC10730b0;
        this.f84654d = enumC10987qd;
        this.f84656f = i10;
        this.f84655e = num;
    }
}
