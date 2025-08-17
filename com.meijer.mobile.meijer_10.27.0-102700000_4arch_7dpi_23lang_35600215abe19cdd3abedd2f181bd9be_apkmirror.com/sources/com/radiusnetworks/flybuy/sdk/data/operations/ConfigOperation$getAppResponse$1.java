package com.radiusnetworks.flybuy.sdk.data.operations;

import com.radiusnetworks.flybuy.api.model.AppResponse;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$getAppResponse$1", f = "ConfigOperation.kt", l = {BinsView.TOTE_HEIGHT_DP}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ConfigOperation$getAppResponse$1 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<AppResponse, SdkError, Unit> $callback;
    final /* synthetic */ boolean $force;
    int label;
    final /* synthetic */ ConfigOperation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfigOperation$getAppResponse$1(ConfigOperation configOperation, boolean z10, Function2<? super AppResponse, ? super SdkError, Unit> function2, Continuation<? super ConfigOperation$getAppResponse$1> continuation) {
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
    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
        return ((ConfigOperation$getAppResponse$1) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
        AppResponse appResponse = (AppResponse) obj;
        Function2<AppResponse, SdkError, Unit> function2 = this.$callback;
        if (function2 != null) {
            function2.invoke(appResponse, null);
        }
        return Unit.f142422a;
    }
}
