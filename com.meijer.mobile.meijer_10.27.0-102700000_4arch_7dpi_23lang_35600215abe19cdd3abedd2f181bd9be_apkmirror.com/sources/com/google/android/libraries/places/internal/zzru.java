package com.google.android.libraries.places.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import qv.C16648k;
import sv.t;
import tv.InterfaceC17153g;

/* loaded from: classes6.dex */
final class zzru implements InterfaceC17153g {
    final /* synthetic */ t zza;
    final /* synthetic */ Function2 zzb;

    zzru(t tVar, Function2 function2) {
        this.zza = tVar;
        this.zzb = function2;
    }

    @Override // tv.InterfaceC17153g
    public final Object emit(Object obj, Continuation continuation) {
        t tVar = this.zza;
        Object objR = tVar.r(C16648k.b(tVar, null, null, new zzrt(this.zzb, obj, null), 3, null), continuation);
        return objR == IntrinsicsKt.f() ? objR : Unit.f142422a;
    }
}
