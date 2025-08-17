package com.radiusnetworks.flybuy.sdk.data.operations;

import com.radiusnetworks.flybuy.sdk.logging.FlyBuyLogging;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$rotateAppInstanceId$1", f = "ConfigOperation.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ConfigOperation$rotateAppInstanceId$1 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConfigOperation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigOperation$rotateAppInstanceId$1(ConfigOperation configOperation, Continuation<? super ConfigOperation$rotateAppInstanceId$1> continuation) {
        super(2, continuation);
        this.this$0 = configOperation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConfigOperation$rotateAppInstanceId$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
        return ((ConfigOperation$rotateAppInstanceId$1) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.b(obj);
            LogExtensionsKt.logd(FlyBuyLogging.INSTANCE, true, "rotateAppInstanceId()");
            String id2 = TimeZone.getDefault().getID();
            ConfigOperation configOperation = this.this$0;
            String str = configOperation.storedPushToken;
            Intrinsics.g(id2);
            this.label = 1;
            if (configOperation.updateAppInstance(str, id2, true, this) == objF) {
                return objF;
            }
        }
        return Unit.f142422a;
    }
}
