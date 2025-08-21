package com.radiusnetworks.flybuy.sdk.data.order;

import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import mv.C0;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$all$1", f = "LocalOrdersDataStore.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class LocalOrdersDataStore$all$1 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends Order>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LocalOrdersDataStore this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$all$1$1", f = "LocalOrdersDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$all$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<List<Order>> $orders;
        int label;
        final /* synthetic */ LocalOrdersDataStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<List<Order>> objectRef, LocalOrdersDataStore localOrdersDataStore, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$orders = objectRef;
            this.this$0 = localOrdersDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$orders, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.label == 0) {
                ResultKt.b(obj);
                this.$orders.f143742a = this.this$0.db.orderDao$core_defaultRelease().all();
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalOrdersDataStore$all$1(LocalOrdersDataStore localOrdersDataStore, Continuation<? super LocalOrdersDataStore$all$1> continuation) {
        super(2, continuation);
        this.this$0 = localOrdersDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalOrdersDataStore$all$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends Order>> continuation) {
        return invoke2(interfaceC15783O, (Continuation<? super List<Order>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<Order>> continuation) {
        return ((LocalOrdersDataStore$all$1) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Object objF = IntrinsicsKt.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            C0 c0D = C15809k.d(C15784P.a(C15800f0.b()), null, null, new AnonymousClass1(objectRef2, this.this$0, null), 3, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (c0D.o0(this) == objF) {
                return objF;
            }
            objectRef = objectRef2;
        }
        List list = (List) objectRef.f143742a;
        if (list == null) {
            return CollectionsKt.m();
        }
        return list;
    }
}
