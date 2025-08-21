package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pal.x7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11092x7 implements A7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC11044u7 f85044a;

    C11092x7(InterfaceC11044u7 interfaceC11044u7) {
        this.f85044a = interfaceC11044u7;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC11044u7 zzb() {
        return this.f85044a;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final InterfaceC11044u7 zza(Class cls) throws GeneralSecurityException {
        if (this.f85044a.zzc().equals(cls)) {
            return this.f85044a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Class zzc() {
        return this.f85044a.getClass();
    }

    @Override // com.google.android.gms.internal.pal.A7
    public final Set zze() {
        return Collections.singleton(this.f85044a.zzc());
    }
}
