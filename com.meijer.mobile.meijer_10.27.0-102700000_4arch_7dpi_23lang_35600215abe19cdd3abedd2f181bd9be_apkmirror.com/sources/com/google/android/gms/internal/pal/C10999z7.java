package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pal.z7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10999z7 implements A7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC10843pa f84251a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y9 f84252b;

    C10999z7(AbstractC10843pa abstractC10843pa, Y9 y92) {
        this.f84251a = abstractC10843pa;
        this.f84252b = y92;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzc() {
        return this.f84251a.getClass();
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzd() {
        return this.f84252b.getClass();
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC10919u7 zza(Class cls) throws GeneralSecurityException {
        try {
            return new X7(this.f84251a, this.f84252b, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC10919u7 zzb() {
        AbstractC10843pa abstractC10843pa = this.f84251a;
        return new X7(abstractC10843pa, this.f84252b, abstractC10843pa.g());
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Set zze() {
        return this.f84251a.j();
    }
}
