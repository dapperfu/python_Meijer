package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pal.x7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10967x7 implements A7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10919u7 f84204a;

    C10967x7(InterfaceC10919u7 interfaceC10919u7) {
        this.f84204a = interfaceC10919u7;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC10919u7 zzb() {
        return this.f84204a;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC10919u7 zza(Class cls) throws GeneralSecurityException {
        if (this.f84204a.zzc().equals(cls)) {
            return this.f84204a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzc() {
        return this.f84204a.getClass();
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Set zze() {
        return Collections.singleton(this.f84204a.zzc());
    }
}
