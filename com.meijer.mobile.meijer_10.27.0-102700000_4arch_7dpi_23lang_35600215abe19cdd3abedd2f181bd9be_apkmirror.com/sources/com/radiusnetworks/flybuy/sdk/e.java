package com.radiusnetworks.flybuy.sdk;

import com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import qv.InterfaceC16622O;

/* loaded from: classes11.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f119971a;

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f119972b;

    /* renamed from: c, reason: collision with root package name */
    public int f119973c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f119974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f119975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Ref.ObjectRef objectRef, String str, Continuation continuation) {
        super(2, continuation);
        this.f119974d = objectRef;
        this.f119975e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f119974d, this.f119975e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Object value;
        Object objF = IntrinsicsKt.f();
        int i10 = this.f119973c;
        T t10 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                objectRef2 = this.f119972b;
                objectRef = this.f119971a;
                try {
                    ResultKt.b(obj);
                    value = ((Result) obj).getValue();
                } catch (Exception unused) {
                    objectRef2 = objectRef;
                    objectRef2.f142835a = t10;
                    return Unit.f142422a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.b(obj);
            Ref.ObjectRef objectRef3 = this.f119974d;
            try {
                String str = this.f119975e;
                this.f119971a = objectRef3;
                this.f119972b = objectRef3;
                this.f119973c = 1;
                Object redirectUrl = UrlExtensionKt.getRedirectUrl(str, this);
                if (redirectUrl == objF) {
                    return objF;
                }
                objectRef2 = objectRef3;
                value = redirectUrl;
                objectRef = objectRef2;
            } catch (Exception unused2) {
                objectRef = objectRef3;
                objectRef2 = objectRef;
                objectRef2.f142835a = t10;
                return Unit.f142422a;
            }
        }
        if (Result.g(value)) {
            value = null;
        }
        t10 = (String) value;
        objectRef2.f142835a = t10;
        return Unit.f142422a;
    }
}
