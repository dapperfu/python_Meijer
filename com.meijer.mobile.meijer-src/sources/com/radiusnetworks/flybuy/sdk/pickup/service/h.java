package com.radiusnetworks.flybuy.sdk.pickup.service;

import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.W;

/* loaded from: classes12.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f120988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationService f120989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CircularRegion f120990c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f120991d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f120989b, this.f120990c, this.f120991d, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LocationService locationService, CircularRegion circularRegion, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f120989b = locationService;
        this.f120990c = circularRegion;
        this.f120991d = num;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC15783O) obj, (Continuation) obj2)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.f120988a;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        W wB = C15809k.b(C15784P.a(C15800f0.b()), null, null, new g(this.f120989b, this.f120990c, this.f120991d, null), 3, null);
        this.f120988a = 1;
        Object objH = wB.H(this);
        if (objH == objF) {
            return objF;
        }
        return objH;
    }
}
