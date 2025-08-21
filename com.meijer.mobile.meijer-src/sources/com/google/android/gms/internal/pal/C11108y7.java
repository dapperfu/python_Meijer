package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pal.y7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11108y7 implements A7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Y9 f85074a;

    C11108y7(Y9 y92) {
        this.f85074a = y92;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzc() {
        return this.f85074a.getClass();
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC11044u7 zza(Class cls) throws GeneralSecurityException {
        try {
            return new C11076w7(this.f85074a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC11044u7 zzb() {
        Y9 y92 = this.f85074a;
        return new C11076w7(y92, y92.g());
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Set zze() {
        return this.f85074a.j();
    }
}
