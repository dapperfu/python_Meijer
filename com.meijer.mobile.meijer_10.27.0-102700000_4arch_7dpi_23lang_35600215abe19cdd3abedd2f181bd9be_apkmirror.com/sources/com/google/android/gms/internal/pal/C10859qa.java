package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.qa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10859qa implements InterfaceC10890sa {

    /* renamed from: a, reason: collision with root package name */
    private final String f83811a;

    /* renamed from: b, reason: collision with root package name */
    private final C10620bf f83812b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC10605b0 f83813c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC10862qd f83814d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f83815e;

    /* renamed from: f, reason: collision with root package name */
    private final int f83816f;

    public static C10859qa e(String str, AbstractC10605b0 abstractC10605b0, EnumC10862qd enumC10862qd, int i10, Integer num) throws GeneralSecurityException {
        if (i10 == 5) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C10859qa(str, abstractC10605b0, enumC10862qd, i10, num);
    }

    public final EnumC10862qd a() {
        return this.f83814d;
    }

    public final AbstractC10605b0 b() {
        return this.f83813c;
    }

    public final Integer c() {
        return this.f83815e;
    }

    public final String d() {
        return this.f83811a;
    }

    public final int f() {
        return this.f83816f;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10890sa
    public final C10620bf zzb() {
        return this.f83812b;
    }

    private C10859qa(String str, AbstractC10605b0 abstractC10605b0, EnumC10862qd enumC10862qd, int i10, Integer num) {
        this.f83811a = str;
        this.f83812b = Ba.a(str);
        this.f83813c = abstractC10605b0;
        this.f83814d = enumC10862qd;
        this.f83816f = i10;
        this.f83815e = num;
    }
}
