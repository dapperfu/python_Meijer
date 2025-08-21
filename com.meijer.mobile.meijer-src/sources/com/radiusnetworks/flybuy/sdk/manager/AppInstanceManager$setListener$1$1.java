package com.radiusnetworks.flybuy.sdk.manager;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.manager.AppInstanceManager$setListener$1$1", f = "AppInstanceManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class AppInstanceManager$setListener$1$1 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AppInstanceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInstanceManager$setListener$1$1(AppInstanceManager appInstanceManager, Continuation<? super AppInstanceManager$setListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = appInstanceManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppInstanceManager$setListener$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
        return ((AppInstanceManager$setListener$1$1) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.f();
        if (this.label == 0) {
            ResultKt.b(obj);
            Function1 function1 = (Function1) this.this$0.listenerReference.get();
            if (function1 != null) {
                function1.invoke(this.this$0.getAppInstanceID());
            }
            return Unit.f143329a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
