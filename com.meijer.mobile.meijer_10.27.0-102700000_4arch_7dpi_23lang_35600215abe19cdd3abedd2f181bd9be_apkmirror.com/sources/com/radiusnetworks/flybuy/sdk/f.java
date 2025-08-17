package com.radiusnetworks.flybuy.sdk;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import qv.C0;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;

/* loaded from: classes11.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f119976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f119977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f119978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Ref.ObjectRef objectRef, String str, Continuation continuation) {
        super(2, continuation);
        this.f119977b = objectRef;
        this.f119978c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f119977b, this.f119978c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.f119976a;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.b(obj);
            C0 c0D = C16648k.d(C16623P.a(C16639f0.b()), null, null, new e(this.f119977b, this.f119978c, null), 3, null);
            this.f119976a = 1;
            if (c0D.n0(this) == objF) {
                return objF;
            }
        }
        return Unit.f142422a;
    }
}
