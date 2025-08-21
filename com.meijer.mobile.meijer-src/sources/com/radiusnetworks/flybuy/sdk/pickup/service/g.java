package com.radiusnetworks.flybuy.sdk.pickup.service;

import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import mv.C15800f0;
import mv.C15805i;
import mv.InterfaceC15783O;

/* loaded from: classes12.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f120984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationService f120985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CircularRegion f120986c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f120987d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f120985b, this.f120986c, this.f120987d, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LocationService locationService, CircularRegion circularRegion, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f120985b = locationService;
        this.f120986c = circularRegion;
        this.f120987d = num;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC15783O) obj, (Continuation) obj2)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.f120984a;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        LocationService locationService = this.f120985b;
        CircularRegion circularRegion = this.f120986c;
        Integer num = this.f120987d;
        this.f120984a = 1;
        int i11 = t.f121004s;
        Object objG = C15805i.g(C15800f0.b(), new f(locationService, circularRegion, num, null), this);
        if (objG == objF) {
            return objF;
        }
        return objG;
    }
}
