package com.google.android.libraries.places.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import mv.InterfaceC15783O;

/* loaded from: classes6.dex */
final class zzrt extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ Function2 zzb;
    final /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzrt(Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.zzb = function2;
        this.zzc = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzrt(this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzrt) create((InterfaceC15783O) obj, (Continuation) obj2)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.zza;
        ResultKt.b(obj);
        if (i10 != 0) {
            return obj;
        }
        Function2 function2 = this.zzb;
        Object obj2 = this.zzc;
        this.zza = 1;
        Object objInvoke = function2.invoke(obj2, this);
        if (objInvoke == objF) {
            return objF;
        }
        return objInvoke;
    }
}
