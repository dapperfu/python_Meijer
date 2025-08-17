package com.radiusnetworks.flybuy.sdk.pickup.service;

import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;
import qv.W;

/* loaded from: classes11.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f120042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f120043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CircularRegion f120044c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f120045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t tVar, CircularRegion circularRegion, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f120043b = tVar;
        this.f120044c = circularRegion;
        this.f120045d = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f120043b, this.f120044c, this.f120045d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.f120042a;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        W wB = C16648k.b(C16623P.a(C16639f0.b()), null, null, new g(this.f120043b, this.f120044c, this.f120045d, null), 3, null);
        this.f120042a = 1;
        Object objB = wB.B(this);
        if (objB == objF) {
            return objF;
        }
        return objB;
    }
}
