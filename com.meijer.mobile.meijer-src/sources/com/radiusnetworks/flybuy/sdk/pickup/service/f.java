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
import mv.InterfaceC15783O;

/* loaded from: classes12.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f120980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationService f120981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CircularRegion f120982c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f120983d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f120981b, this.f120982c, this.f120983d, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LocationService locationService, CircularRegion circularRegion, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f120981b = locationService;
        this.f120982c = circularRegion;
        this.f120983d = num;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC15783O) obj, (Continuation) obj2)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objF = IntrinsicsKt.f();
        int i10 = this.f120980a;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        LocationService locationService = this.f120981b;
        CircularRegion circularRegion = this.f120982c;
        Integer num = this.f120983d;
        this.f120980a = 1;
        int i11 = t.f121004s;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(this));
        FlyBuyCore.getSites().fetch(circularRegion, new SiteOptions.Builder().setPer(num).build(), new d(safeContinuation, locationService));
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
