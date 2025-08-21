package com.radiusnetworks.flybuy.sdk.manager;

import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.manager.AnalyticsManager$sync$1", f = "AnalyticsManager.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AnalyticsManager$sync$1 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<SdkError, Unit> $callback;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnalyticsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsManager$sync$1(AnalyticsManager analyticsManager, Function1<? super SdkError, Unit> function1, Continuation<? super AnalyticsManager$sync$1> continuation) {
        super(2, continuation);
        this.this$0 = analyticsManager;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AnalyticsManager$sync$1 analyticsManager$sync$1 = new AnalyticsManager$sync$1(this.this$0, this.$callback, continuation);
        analyticsManager$sync$1.L$0 = obj;
        return analyticsManager$sync$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
        return ((AnalyticsManager$sync$1) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        IntrinsicsKt.f();
        if (this.label == 0) {
            ResultKt.b(obj);
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.L$0;
            AnalyticsManager analyticsManager = this.this$0;
            Function1<SdkError, Unit> function1 = this.$callback;
            try {
                LogExtensionsKt.logd(interfaceC15783O, true, "AnalyticsManager.sync called");
                analyticsManager.getAnalyticsEventOperation$core_defaultRelease().enqueueAnalyticsWorker();
                if (function1 != null) {
                    function1.invoke(null);
                }
                return Unit.f143329a;
            } catch (Exception e10) {
                LogExtensionsKt.logd(interfaceC15783O, true, e10, "catchAndThrow caught exception", new Object[0]);
                com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
                throw e10;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
