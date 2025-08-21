package com.radiusnetworks.flybuy.sdk;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import mv.C0;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;

/* loaded from: classes12.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f120951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f120952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f120953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Ref.ObjectRef objectRef, String str, Continuation continuation) {
        super(2, continuation);
        this.f120952b = objectRef;
        this.f120953c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f120952b, this.f120953c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.f120952b, this.f120953c, (Continuation) obj2).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.f120951a;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.b(obj);
            C0 c0D = C15809k.d(C15784P.a(C15800f0.b()), null, null, new f(this.f120952b, this.f120953c, null), 3, null);
            this.f120951a = 1;
            if (c0D.o0(this) == objF) {
                return objF;
            }
        }
        return Unit.f143329a;
    }
}
