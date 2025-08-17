package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pal.y7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10983y7 implements A7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Y9 f84234a;

    C10983y7(Y9 y92) {
        this.f84234a = y92;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzc() {
        return this.f84234a.getClass();
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC10919u7 zza(Class cls) throws GeneralSecurityException {
        try {
            return new C10951w7(this.f84234a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC10919u7 zzb() {
        Y9 y92 = this.f84234a;
        return new C10951w7(y92, y92.g());
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Set zze() {
        return this.f84234a.j();
    }
}
