package com.google.android.libraries.places.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ov.t;
import pv.InterfaceC16561f;

/* loaded from: classes6.dex */
final class zzrv extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ InterfaceC16561f zzb;
    final /* synthetic */ Function2 zzc;
    private /* synthetic */ Object zzd;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzrv zzrvVar = new zzrv(this.zzb, this.zzc, continuation);
        zzrvVar.zzd = obj;
        return zzrvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzrv(InterfaceC16561f interfaceC16561f, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.zzb = interfaceC16561f;
        this.zzc = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzrv) create((t) obj, (Continuation) obj2)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.zza;
        ResultKt.b(obj);
        if (i10 == 0) {
            t tVar = (t) this.zzd;
            InterfaceC16561f interfaceC16561f = this.zzb;
            zzru zzruVar = new zzru(tVar, this.zzc);
            this.zza = 1;
            if (interfaceC16561f.collect(zzruVar, this) == objF) {
                return objF;
            }
        }
        return Unit.f143329a;
    }
}
