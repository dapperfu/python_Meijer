package com.google.android.libraries.places.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import mv.C15809k;
import ov.t;
import pv.InterfaceC16562g;

/* loaded from: classes6.dex */
final class zzru implements InterfaceC16562g {
    final /* synthetic */ t zza;
    final /* synthetic */ Function2 zzb;

    zzru(t tVar, Function2 function2) {
        this.zza = tVar;
        this.zzb = function2;
    }

    @Override // pv.InterfaceC16562g
    public final Object emit(Object obj, Continuation continuation) {
        t tVar = this.zza;
        Object objR = tVar.r(C15809k.b(tVar, null, null, new zzrt(this.zzb, obj, null), 3, null), continuation);
        return objR == IntrinsicsKt.f() ? objR : Unit.f143329a;
    }
}
