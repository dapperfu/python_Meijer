package com.radiusnetworks.flybuy.sdk.pickup.service;

import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import com.radiusnetworks.flybuy.sdk.manager.builder.SiteOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qv.InterfaceC16622O;

/* loaded from: classes11.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f120034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f120035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CircularRegion f120036c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f120037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t tVar, CircularRegion circularRegion, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f120035b = tVar;
        this.f120036c = circularRegion;
        this.f120037d = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f120035b, this.f120036c, this.f120037d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objF = IntrinsicsKt.f();
        int i10 = this.f120034a;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        t tVar = this.f120035b;
        CircularRegion circularRegion = this.f120036c;
        Integer num = this.f120037d;
        this.f120034a = 1;
        int i11 = t.f120057s;
        tVar.getClass();
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(this));
        FlyBuyCore.getSites().fetch(circularRegion, new SiteOptions.Builder().setPer(num).build(), new d(tVar, safeContinuation));
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(this);
        }
        if (objB == objF) {
            return objF;
        }
        return objB;
    }
}
