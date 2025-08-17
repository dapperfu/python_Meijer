package com.radiusnetworks.flybuy.sdk.data.order;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$event$6$2$1", f = "RemoteOrdersDataStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class RemoteOrdersDataStore$event$6$2$1 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Order, SdkError, Unit> $callback;
    final /* synthetic */ OrderEventInfo $orderEventInfo;
    final /* synthetic */ SdkError $sdkError;
    final /* synthetic */ RemoteOrdersDataStore $this_run;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$event$6$2$1$1", f = "RemoteOrdersDataStore.kt", l = {253}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$event$6$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Order, SdkError, Unit> $callback;
        final /* synthetic */ OrderEventInfo $orderEventInfo;
        final /* synthetic */ SdkError $sdkError;
        final /* synthetic */ RemoteOrdersDataStore $this_run;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(RemoteOrdersDataStore remoteOrdersDataStore, OrderEventInfo orderEventInfo, Function2<? super Order, ? super SdkError, Unit> function2, SdkError sdkError, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_run = remoteOrdersDataStore;
            this.$orderEventInfo = orderEventInfo;
            this.$callback = function2;
            this.$sdkError = sdkError;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_run, this.$orderEventInfo, this.$callback, this.$sdkError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                RemoteOrdersDataStore remoteOrdersDataStore = this.$this_run;
                int orderId = this.$orderEventInfo.getOrderId();
                this.label = 1;
                obj = remoteOrdersDataStore.getOrder(orderId, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Order order = (Order) obj;
            Function2<Order, SdkError, Unit> function2 = this.$callback;
            if (function2 != null) {
                function2.invoke(order, this.$sdkError);
            }
            return Unit.f142422a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RemoteOrdersDataStore$event$6$2$1(RemoteOrdersDataStore remoteOrdersDataStore, OrderEventInfo orderEventInfo, Function2<? super Order, ? super SdkError, Unit> function2, SdkError sdkError, Continuation<? super RemoteOrdersDataStore$event$6$2$1> continuation) {
        super(2, continuation);
        this.$this_run = remoteOrdersDataStore;
        this.$orderEventInfo = orderEventInfo;
        this.$callback = function2;
        this.$sdkError = sdkError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteOrdersDataStore$event$6$2$1 remoteOrdersDataStore$event$6$2$1 = new RemoteOrdersDataStore$event$6$2$1(this.$this_run, this.$orderEventInfo, this.$callback, this.$sdkError, continuation);
        remoteOrdersDataStore$event$6$2$1.L$0 = obj;
        return remoteOrdersDataStore$event$6$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
        return ((RemoteOrdersDataStore$event$6$2$1) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.f();
        if (this.label == 0) {
            ResultKt.b(obj);
            C16648k.d((InterfaceC16622O) this.L$0, null, null, new AnonymousClass1(this.$this_run, this.$orderEventInfo, this.$callback, this.$sdkError, null), 3, null);
            return Unit.f142422a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
