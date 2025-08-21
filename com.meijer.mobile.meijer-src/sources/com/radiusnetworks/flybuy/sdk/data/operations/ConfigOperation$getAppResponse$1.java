package com.radiusnetworks.flybuy.sdk.data.operations;

import com.radiusnetworks.flybuy.api.model.AppInstanceResponse;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$getAppResponse$1", f = "ConfigOperation.kt", l = {160}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class ConfigOperation$getAppResponse$1 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<AppInstanceResponse, SdkError, Unit> $callback;
    final /* synthetic */ boolean $force;
    int label;
    final /* synthetic */ ConfigOperation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfigOperation$getAppResponse$1(ConfigOperation configOperation, boolean z10, Function2<? super AppInstanceResponse, ? super SdkError, Unit> function2, Continuation<? super ConfigOperation$getAppResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = configOperation;
        this.$force = z10;
        this.$callback = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConfigOperation$getAppResponse$1(this.this$0, this.$force, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
        return ((ConfigOperation$getAppResponse$1) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            ConfigOperation configOperation = this.this$0;
            boolean z10 = this.$force;
            this.label = 1;
            obj = configOperation.checkAppResponseCacheOrFetch(z10, this);
            if (obj == objF) {
                return objF;
            }
        }
        AppInstanceResponse appInstanceResponse = (AppInstanceResponse) obj;
        Function2<AppInstanceResponse, SdkError, Unit> function2 = this.$callback;
        if (function2 != null) {
            function2.invoke(appInstanceResponse, null);
        }
        return Unit.f143329a;
    }
}
