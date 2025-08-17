package com.radiusnetworks.flybuy.sdk.pickup.service;

import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qv.C16639f0;
import qv.C16644i;
import qv.InterfaceC16622O;

/* loaded from: classes11.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f120038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f120039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CircularRegion f120040c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f120041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t tVar, CircularRegion circularRegion, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f120039b = tVar;
        this.f120040c = circularRegion;
        this.f120041d = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f120039b, this.f120040c, this.f120041d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.f120038a;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        t tVar = this.f120039b;
        CircularRegion circularRegion = this.f120040c;
        Integer num = this.f120041d;
        this.f120038a = 1;
        int i11 = t.f120057s;
        tVar.getClass();
        Object objG = C16644i.g(C16639f0.b(), new f(tVar, circularRegion, num, null), this);
        if (objG == objF) {
            return objF;
        }
        return objG;
    }
}
