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

/* loaded from: classes12.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f120946a;

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f120947b;

    /* renamed from: c, reason: collision with root package name */
    public int f120948c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f120949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f120950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Ref.ObjectRef objectRef, String str, Continuation continuation) {
        super(2, continuation);
        this.f120949d = objectRef;
        this.f120950e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f120949d, this.f120950e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f120949d, this.f120950e, (Continuation) obj2).invokeSuspend(Unit.f143329a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Object value;
        Object objF = IntrinsicsKt.f();
        int i10 = this.f120948c;
        T t10 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                objectRef3 = this.f120947b;
                objectRef2 = this.f120946a;
                try {
                    ResultKt.b(obj);
                    value = ((Result) obj).getValue();
                } catch (Exception unused) {
                    objectRef = objectRef2;
                    objectRef3 = objectRef;
                    objectRef3.f143742a = t10;
                    return Unit.f143329a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.b(obj);
            objectRef = this.f120949d;
            try {
                String str = this.f120950e;
                try {
                    this.f120946a = objectRef;
                    this.f120947b = objectRef;
                    this.f120948c = 1;
                    Object redirectUrl = UrlExtensionKt.getRedirectUrl(str, this);
                    if (redirectUrl == objF) {
                        return objF;
                    }
                    objectRef3 = objectRef;
                    value = redirectUrl;
                    objectRef2 = objectRef3;
                } catch (Exception unused2) {
                    objectRef3 = objectRef;
                    objectRef3.f143742a = t10;
                    return Unit.f143329a;
                }
            } catch (Exception unused3) {
                objectRef2 = objectRef;
                objectRef = objectRef2;
                objectRef3 = objectRef;
                objectRef3.f143742a = t10;
                return Unit.f143329a;
            }
        }
        if (Result.g(value)) {
            value = null;
        }
        t10 = (String) value;
        objectRef3.f143742a = t10;
        return Unit.f143329a;
    }
}
