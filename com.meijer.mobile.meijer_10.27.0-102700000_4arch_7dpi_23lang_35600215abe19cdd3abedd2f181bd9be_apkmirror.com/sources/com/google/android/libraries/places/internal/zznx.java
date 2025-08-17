package com.google.android.libraries.places.internal;

import Be.p;
import V2.CreationExtras;
import androidx.view.c0;
import androidx.view.f0;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;

/* loaded from: classes6.dex */
public final class zznx implements f0.c {
    private final zznn zza;
    private final zzoa zzb;
    private final zzoz zzc;

    public zznx(zznn zznnVar, zzoa zzoaVar, zzoz zzozVar) {
        this.zza = zznnVar;
        this.zzb = zzoaVar;
        this.zzc = zzozVar;
    }

    @Override // androidx.lifecycle.f0.c
    public final c0 create(Class cls) {
        p.e(cls == zzny.class, "This factory can only be used to instantiate its enclosing class.");
        return new zzny(this.zza, this.zzb, this.zzc, null);
    }

    @Override // androidx.lifecycle.f0.c
    public final c0 create(Class cls, CreationExtras creationExtras) {
        return create(cls);
    }

    @Override // androidx.lifecycle.f0.c
    public final c0 create(KClass kClass, CreationExtras creationExtras) {
        return create(JvmClassMappingKt.b(kClass));
    }
}
