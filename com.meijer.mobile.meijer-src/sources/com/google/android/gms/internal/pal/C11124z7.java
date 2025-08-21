package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pal.z7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11124z7 implements A7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC10968pa f85091a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y9 f85092b;

    C11124z7(AbstractC10968pa abstractC10968pa, Y9 y92) {
        this.f85091a = abstractC10968pa;
        this.f85092b = y92;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzc() {
        return this.f85091a.getClass();
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzd() {
        return this.f85092b.getClass();
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC11044u7 zza(Class cls) throws GeneralSecurityException {
        try {
            return new X7(this.f85091a, this.f85092b, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC11044u7 zzb() {
        AbstractC10968pa abstractC10968pa = this.f85091a;
        return new X7(abstractC10968pa, this.f85092b, abstractC10968pa.g());
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Set zze() {
        return this.f85091a.j();
    }
}
