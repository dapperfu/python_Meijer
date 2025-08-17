package com.radiusnetworks.flybuy.sdk.data.order;

import androidx.view.AbstractC5985A;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.error.OrderError;
import com.radiusnetworks.flybuy.sdk.data.error.OrderErrorType;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import com.radiusnetworks.flybuy.sdk.data.room.dao.OrderDao;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabaseExtensionsKt;
import com.radiusnetworks.flybuy.sdk.data.room.domain.BeaconRegion;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import io.constructor.data.local.PreferencesHelper;
import j$.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;
import qv.C16623P;
import qv.C16639f0;
import qv.C16644i;
import qv.C16646j;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0013J%\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\r2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00150\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00150\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/order/LocalOrdersDataStore;", "Lcom/radiusnetworks/flybuy/sdk/data/order/LocalOrdersRepository;", "Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;", "db", "<init>", "(Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;)V", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushData;", "pushData", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "dispatchUpdateOrderFromPush", "(Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "redemptionCode", "Landroidx/lifecycle/A;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "getOrder", "(Ljava/lang/String;)Landroidx/lifecycle/A;", "", PreferencesHelper.PREF_ID, "(I)Landroidx/lifecycle/A;", "orderId", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;", "getBeaconRegionsForOrder", "findBeaconRegionsForOrder", "(I)Ljava/util/List;", "Lkotlin/Function1;", "", "callback", "updateOrderFromPush", "(Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushData;Lkotlin/jvm/functions/Function1;)V", "Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;", "getOpenLiveData", "()Landroidx/lifecycle/A;", "openLiveData", "getAllLiveData", "allLiveData", "getAll", "()Ljava/util/List;", "all", "getOpen", "open", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LocalOrdersDataStore implements LocalOrdersRepository {
    private final AppDatabase db;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/radiusnetworks/flybuy/sdk/data/error/OrderError;", "<anonymous>", "(Lqv/O;)Lcom/radiusnetworks/flybuy/sdk/data/error/OrderError;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$dispatchUpdateOrderFromPush$2", f = "LocalOrdersDataStore.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$dispatchUpdateOrderFromPush$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super OrderError>, Object> {
        final /* synthetic */ FlybuyPushData $pushData;
        int label;
        final /* synthetic */ LocalOrdersDataStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FlybuyPushData flybuyPushData, LocalOrdersDataStore localOrdersDataStore, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$pushData = flybuyPushData;
            this.this$0 = localOrdersDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$pushData, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super OrderError> continuation) {
            return ((AnonymousClass2) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Instant instant;
            Instant instant2;
            Instant instant3;
            IntrinsicsKt.f();
            if (this.label == 0) {
                ResultKt.b(obj);
                try {
                    Integer orderId = this.$pushData.getOrderId();
                    if (orderId != null) {
                        LocalOrdersDataStore localOrdersDataStore = this.this$0;
                        FlybuyPushData flybuyPushData = this.$pushData;
                        int iIntValue = orderId.intValue();
                        AppDatabaseExtensionsKt.updateOrderStates(localOrdersDataStore.db, iIntValue, flybuyPushData.getOrderState(), flybuyPushData.getCustomerState(), flybuyPushData.getLocationTrackingEnabled());
                        OrderDao orderDaoOrderDao$core_defaultRelease = localOrdersDataStore.db.orderDao$core_defaultRelease();
                        String etaAt = flybuyPushData.getEtaAt();
                        if (etaAt != null) {
                            instant = Instant.parse(etaAt);
                        } else {
                            instant = null;
                        }
                        orderDaoOrderDao$core_defaultRelease.updateEtaAt(iIntValue, instant);
                        Integer wrongSiteId = flybuyPushData.getWrongSiteId();
                        if (wrongSiteId != null) {
                            Boxing.d(localOrdersDataStore.db.orderDao$core_defaultRelease().updateWrongSiteId(iIntValue, wrongSiteId.intValue()));
                        }
                        OrderDao orderDaoOrderDao$core_defaultRelease2 = localOrdersDataStore.db.orderDao$core_defaultRelease();
                        String estimatedReadyAt = flybuyPushData.getEstimatedReadyAt();
                        if (estimatedReadyAt != null) {
                            instant2 = Instant.parse(estimatedReadyAt);
                        } else {
                            instant2 = null;
                        }
                        orderDaoOrderDao$core_defaultRelease2.updateEstimatedReadyAt(iIntValue, instant2);
                        OrderDao orderDaoOrderDao$core_defaultRelease3 = localOrdersDataStore.db.orderDao$core_defaultRelease();
                        String orderFiredAt = flybuyPushData.getOrderFiredAt();
                        if (orderFiredAt != null) {
                            instant3 = Instant.parse(orderFiredAt);
                        } else {
                            instant3 = null;
                        }
                        orderDaoOrderDao$core_defaultRelease3.updateOrderFiredAt(iIntValue, instant3);
                        String pickupType = flybuyPushData.getPickupType();
                        if (pickupType != null) {
                            Boxing.d(localOrdersDataStore.db.orderDao$core_defaultRelease().updatePickupType(iIntValue, pickupType));
                        }
                    }
                    return null;
                } catch (Exception unused) {
                    return new OrderError(OrderErrorType.FAILED_TO_UPDATE_PUSH_DATA);
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$findBeaconRegionsForOrder$1", f = "LocalOrdersDataStore.kt", l = {63}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$findBeaconRegionsForOrder$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends BeaconRegion>>, Object> {
        final /* synthetic */ int $orderId;
        Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$findBeaconRegionsForOrder$1$1", f = "LocalOrdersDataStore.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$findBeaconRegionsForOrder$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C19791 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<List<BeaconRegion>> $beaconRegions;
            final /* synthetic */ int $orderId;
            int label;
            final /* synthetic */ LocalOrdersDataStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19791(Ref.ObjectRef<List<BeaconRegion>> objectRef, LocalOrdersDataStore localOrdersDataStore, int i10, Continuation<? super C19791> continuation) {
                super(2, continuation);
                this.$beaconRegions = objectRef;
                this.this$0 = localOrdersDataStore;
                this.$orderId = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C19791(this.$beaconRegions, this.this$0, this.$orderId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C19791) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.List] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.label == 0) {
                    ResultKt.b(obj);
                    this.$beaconRegions.f142835a = this.this$0.db.beaconRegionDao$core_defaultRelease().findBeaconRegionsForOrder(this.$orderId);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i10, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$orderId = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LocalOrdersDataStore.this.new AnonymousClass1(this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends BeaconRegion>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<BeaconRegion>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<BeaconRegion>> continuation) {
            return ((AnonymousClass1) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                C0 c0D = C16648k.d(C16623P.a(C16639f0.b()), null, null, new C19791(objectRef2, LocalOrdersDataStore.this, this.$orderId, null), 3, null);
                this.L$0 = objectRef2;
                this.label = 1;
                if (c0D.n0(this) == objF) {
                    return objF;
                }
                objectRef = objectRef2;
            }
            List list = (List) objectRef.f142835a;
            if (list == null) {
                return CollectionsKt.m();
            }
            return list;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$updateOrderFromPush$1", f = "LocalOrdersDataStore.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$updateOrderFromPush$1, reason: invalid class name and case insensitive filesystem */
    public static final class C130111 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<SdkError, Unit> $callback;
        final /* synthetic */ FlybuyPushData $pushData;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$updateOrderFromPush$1$1", f = "LocalOrdersDataStore.kt", l = {71}, m = "invokeSuspend")
        /* renamed from: com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore$updateOrderFromPush$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C19801 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<SdkError, Unit> $callback;
            final /* synthetic */ FlybuyPushData $pushData;
            int label;
            final /* synthetic */ LocalOrdersDataStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19801(LocalOrdersDataStore localOrdersDataStore, FlybuyPushData flybuyPushData, Function1<? super SdkError, Unit> function1, Continuation<? super C19801> continuation) {
                super(2, continuation);
                this.this$0 = localOrdersDataStore;
                this.$pushData = flybuyPushData;
                this.$callback = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C19801(this.this$0, this.$pushData, this.$callback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C19801) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                    LocalOrdersDataStore localOrdersDataStore = this.this$0;
                    FlybuyPushData flybuyPushData = this.$pushData;
                    this.label = 1;
                    obj = localOrdersDataStore.dispatchUpdateOrderFromPush(flybuyPushData, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                SdkError sdkError = (SdkError) obj;
                Function1<SdkError, Unit> function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(sdkError);
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130111(FlybuyPushData flybuyPushData, Function1<? super SdkError, Unit> function1, Continuation<? super C130111> continuation) {
            super(2, continuation);
            this.$pushData = flybuyPushData;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C130111 c130111 = LocalOrdersDataStore.this.new C130111(this.$pushData, this.$callback, continuation);
            c130111.L$0 = obj;
            return c130111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C130111) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                CoroutineContext coroutineContext = ((InterfaceC16622O) this.L$0).getCoroutineContext();
                C19801 c19801 = new C19801(LocalOrdersDataStore.this, this.$pushData, this.$callback, null);
                this.label = 1;
                if (C16644i.g(coroutineContext, c19801, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersRepository
    public AbstractC5985A<Order> getOrder(String redemptionCode) {
        Intrinsics.j(redemptionCode, "redemptionCode");
        return this.db.orderDao$core_defaultRelease().getOrderByRedemptionCode(redemptionCode);
    }

    public LocalOrdersDataStore(AppDatabase db2) {
        Intrinsics.j(db2, "db");
        this.db = db2;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersRepository
    public List<BeaconRegion> findBeaconRegionsForOrder(int orderId) {
        return (List) C16646j.b(null, new AnonymousClass1(orderId, null), 1, null);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersRepository
    public List<Order> getAll() {
        return (List) C16646j.b(null, new LocalOrdersDataStore$all$1(this, null), 1, null);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersRepository
    public AbstractC5985A<List<Order>> getAllLiveData() {
        return this.db.orderDao$core_defaultRelease().allLiveData();
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersRepository
    public AbstractC5985A<List<BeaconRegion>> getBeaconRegionsForOrder(int orderId) {
        return this.db.beaconRegionDao$core_defaultRelease().getBeaconRegionsForOrder(orderId);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersRepository
    public List<Order> getOpen() {
        return (List) C16646j.b(null, new LocalOrdersDataStore$open$1(this, null), 1, null);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersRepository
    public AbstractC5985A<List<Order>> getOpenLiveData() {
        return this.db.orderDao$core_defaultRelease().openLiveData();
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersRepository
    public AbstractC5985A<Order> getOrder(int id2) {
        return this.db.orderDao$core_defaultRelease().getOrderById(id2);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersRepository
    public void updateOrderFromPush(FlybuyPushData pushData, Function1<? super SdkError, Unit> callback) {
        Intrinsics.j(pushData, "pushData");
        C16648k.d(C16623P.a(C16639f0.a()), null, null, new C130111(pushData, callback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dispatchUpdateOrderFromPush(FlybuyPushData flybuyPushData, Continuation<? super SdkError> continuation) {
        return C16644i.g(C16639f0.b(), new AnonymousClass2(flybuyPushData, this, null), continuation);
    }
}
