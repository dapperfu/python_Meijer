package com.google.android.libraries.places.widget.internal.placedetails;

import V2.CreationExtras;
import android.app.Application;
import androidx.view.c0;
import androidx.view.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes6.dex */
public final class zzas implements f0.c {
    final /* synthetic */ Application zza;

    zzas(Application application) {
        this.zza = application;
    }

    @Override // androidx.lifecycle.f0.c
    public /* bridge */ /* synthetic */ c0 create(Class cls, CreationExtras creationExtras) {
        return super.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.f0.c
    public /* bridge */ /* synthetic */ c0 create(KClass kClass, CreationExtras creationExtras) {
        return super.create(kClass, creationExtras);
    }

    @Override // androidx.lifecycle.f0.c
    public final c0 create(Class modelClass) {
        Intrinsics.j(modelClass, "modelClass");
        return new zzbi(this.zza);
    }
}
