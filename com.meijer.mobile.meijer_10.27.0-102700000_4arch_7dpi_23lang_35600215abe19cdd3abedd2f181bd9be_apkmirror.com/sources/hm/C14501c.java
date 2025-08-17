package hm;

import Co.ProductFullDetails;
import Gl.FlyBuyOrderDetail;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import gj.OrderDetail;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nl.OrderHistoryItem;
import ol.TipData;
import ol.TipNotification;
import qv.AbstractC16618K;
import qv.C16623P;
import qv.C16638f;
import qv.C16644i;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import qv.W;
import uo.OrderOutOfStockItem;
import yo.C18264a;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u00020\u00182\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0017\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001d2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u001e0\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0086@¢\u0006\u0004\b%\u0010&J(\u0010*\u001a\u00020)2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\n\u0010(\u001a\u00060\u0011j\u0002`'H\u0086@¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\u0004\u0018\u00010,2\n\u0010(\u001a\u00060\u0011j\u0002`'H\u0086@¢\u0006\u0004\b-\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lhm/c;", "", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "Lyo/a;", "appPrefManager", "LRo/c;", "productsRepository", "Lqv/K;", "ioDispatcher", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/a;Lyo/a;LRo/c;Lqv/K;)V", "Lnl/b;", "orderHistoryItem", "", "k", "(Lnl/b;)Z", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lhm/b;", "f", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderResponseHolder", "Lhm/a;", "g", "(Ljava/lang/String;Lhm/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(Lhm/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "listOutOfStockUpc", "LCo/h;", "allUpcItems", "Luo/a;", "j", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "Lgj/c;", "l", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lol/a;", "i", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "b", "Lyo/a;", "c", "LRo/c;", "d", "Lqv/K;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hm.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14501c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C18264a appPrefManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository", f = "OrderStatusRepository.kt", l = {43, 46, 56, 66}, m = "fetchActiveOrders")
    /* renamed from: hm.c$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f135613a;

        /* renamed from: b, reason: collision with root package name */
        Object f135614b;

        /* renamed from: c, reason: collision with root package name */
        Object f135615c;

        /* renamed from: d, reason: collision with root package name */
        Object f135616d;

        /* renamed from: e, reason: collision with root package name */
        Object f135617e;

        /* renamed from: f, reason: collision with root package name */
        Object f135618f;

        /* renamed from: g, reason: collision with root package name */
        Object f135619g;

        /* renamed from: h, reason: collision with root package name */
        Object f135620h;

        /* renamed from: i, reason: collision with root package name */
        Object f135621i;

        /* renamed from: j, reason: collision with root package name */
        Object f135622j;

        /* renamed from: k, reason: collision with root package name */
        int f135623k;

        /* renamed from: l, reason: collision with root package name */
        int f135624l;

        /* renamed from: m, reason: collision with root package name */
        int f135625m;

        /* renamed from: n, reason: collision with root package name */
        int f135626n;

        /* renamed from: o, reason: collision with root package name */
        int f135627o;

        /* renamed from: p, reason: collision with root package name */
        int f135628p;

        /* renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f135629q;

        /* renamed from: s, reason: collision with root package name */
        int f135631s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f135629q = obj;
            this.f135631s |= Integer.MIN_VALUE;
            return C14501c.this.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lhm/b;", "<anonymous>", "(Lqv/O;)Lhm/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$fetchOrderDetails$2", f = "OrderStatusRepository.kt", l = {118, 118}, m = "invokeSuspend")
    /* renamed from: hm.c$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super OrderResponseHolder>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f135632a;

        /* renamed from: b, reason: collision with root package name */
        Object f135633b;

        /* renamed from: c, reason: collision with root package name */
        Object f135634c;

        /* renamed from: d, reason: collision with root package name */
        int f135635d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f135636e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f135638g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LGl/b;", "<anonymous>", "(Lqv/O;)LGl/b;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$fetchOrderDetails$2$getFlyBuyDetails$1", f = "OrderStatusRepository.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: hm.c$b$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super FlyBuyOrderDetail>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f135639a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14501c f135640b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f135641c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C14501c c14501c, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f135640b = c14501c;
                this.f135641c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f135640b, this.f135641c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super FlyBuyOrderDetail> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws NumberFormatException {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f135639a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f135640b.ordersRepository;
                int i11 = Integer.parseInt(this.f135641c);
                this.f135639a = 1;
                Object objV = aVar.v(i11, this);
                if (objV == objF) {
                    return objF;
                }
                return objV;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lgj/c;", "<anonymous>", "(Lqv/O;)Lgj/c;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$fetchOrderDetails$2$getOrderDetails$1", f = "OrderStatusRepository.kt", l = {113}, m = "invokeSuspend")
        /* renamed from: hm.c$b$b, reason: collision with other inner class name */
        static final class C2143b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super OrderDetail>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f135642a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14501c f135643b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f135644c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2143b(C14501c c14501c, String str, Continuation<? super C2143b> continuation) {
                super(2, continuation);
                this.f135643b = c14501c;
                this.f135644c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2143b(this.f135643b, this.f135644c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super OrderDetail> continuation) {
                return ((C2143b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f135642a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f135643b.ordersRepository;
                String str = this.f135644c;
                this.f135642a = 1;
                Object objY = aVar.y(str, this);
                if (objY == objF) {
                    return objF;
                }
                return objY;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f135638g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C14501c.this.new b(this.f135638g, continuation);
            bVar.f135636e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super OrderResponseHolder> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC16622O interfaceC16622O;
            W wB;
            W w10;
            OrderDetail orderDetail;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f135635d;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        orderDetail = (OrderDetail) this.f135634c;
                        ResultKt.b(obj);
                        return new OrderResponseHolder(orderDetail, (FlyBuyOrderDetail) obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wB = (W) this.f135633b;
                w10 = (W) this.f135632a;
                interfaceC16622O = (InterfaceC16622O) this.f135636e;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                interfaceC16622O = (InterfaceC16622O) this.f135636e;
                W wB2 = C16648k.b(interfaceC16622O, null, null, new C2143b(C14501c.this, this.f135638g, null), 3, null);
                wB = C16648k.b(interfaceC16622O, null, null, new a(C14501c.this, this.f135638g, null), 3, null);
                this.f135636e = interfaceC16622O;
                this.f135632a = wB2;
                this.f135633b = wB;
                this.f135635d = 1;
                Object objB = wB2.B(this);
                if (objB != objF) {
                    w10 = wB2;
                    obj = objB;
                }
                return objF;
            }
            OrderDetail orderDetail2 = (OrderDetail) obj;
            this.f135636e = interfaceC16622O;
            this.f135632a = w10;
            this.f135633b = wB;
            this.f135634c = orderDetail2;
            this.f135635d = 2;
            Object objB2 = wB.B(this);
            if (objB2 != objF) {
                orderDetail = orderDetail2;
                obj = objB2;
                return new OrderResponseHolder(orderDetail, (FlyBuyOrderDetail) obj);
            }
            return objF;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository", f = "OrderStatusRepository.kt", l = {131}, m = "fetchOrderSubstitutions")
    /* renamed from: hm.c$c, reason: collision with other inner class name */
    static final class C2144c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f135645a;

        /* renamed from: b, reason: collision with root package name */
        Object f135646b;

        /* renamed from: c, reason: collision with root package name */
        Object f135647c;

        /* renamed from: d, reason: collision with root package name */
        Object f135648d;

        /* renamed from: e, reason: collision with root package name */
        Object f135649e;

        /* renamed from: f, reason: collision with root package name */
        int f135650f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f135651g;

        /* renamed from: i, reason: collision with root package name */
        int f135653i;

        C2144c(Continuation<? super C2144c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f135651g = obj;
            this.f135653i |= Integer.MIN_VALUE;
            return C14501c.this.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository", f = "OrderStatusRepository.kt", l = {167}, m = "fetchProductDetails")
    /* renamed from: hm.c$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f135654a;

        /* renamed from: b, reason: collision with root package name */
        Object f135655b;

        /* renamed from: c, reason: collision with root package name */
        Object f135656c;

        /* renamed from: d, reason: collision with root package name */
        Object f135657d;

        /* renamed from: e, reason: collision with root package name */
        Object f135658e;

        /* renamed from: f, reason: collision with root package name */
        Object f135659f;

        /* renamed from: g, reason: collision with root package name */
        Object f135660g;

        /* renamed from: h, reason: collision with root package name */
        Object f135661h;

        /* renamed from: i, reason: collision with root package name */
        int f135662i;

        /* renamed from: j, reason: collision with root package name */
        int f135663j;

        /* renamed from: k, reason: collision with root package name */
        int f135664k;

        /* renamed from: l, reason: collision with root package name */
        int f135665l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f135666m;

        /* renamed from: o, reason: collision with root package name */
        int f135668o;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f135666m = obj;
            this.f135668o |= Integer.MIN_VALUE;
            return C14501c.this.h(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lol/a;", "<anonymous>", "(Lqv/O;)Lol/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$fetchTipNotification$2", f = "OrderStatusRepository.kt", l = {94}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: hm.c$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super TipData>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f135669a;

        /* renamed from: b, reason: collision with root package name */
        Object f135670b;

        /* renamed from: c, reason: collision with root package name */
        Object f135671c;

        /* renamed from: d, reason: collision with root package name */
        Object f135672d;

        /* renamed from: e, reason: collision with root package name */
        int f135673e;

        /* renamed from: f, reason: collision with root package name */
        int f135674f;

        /* renamed from: g, reason: collision with root package name */
        int f135675g;

        /* renamed from: h, reason: collision with root package name */
        int f135676h;

        /* renamed from: i, reason: collision with root package name */
        int f135677i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f135678j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f135680l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f135680l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = C14501c.this.new e(this.f135680l, continuation);
            eVar.f135678j = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super TipData> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f135677i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f135678j;
                    C14501c c14501c = C14501c.this;
                    String str = this.f135680l;
                    Result.Companion companion = Result.INSTANCE;
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = c14501c.ordersRepository;
                    this.f135678j = interfaceC16622O;
                    this.f135669a = interfaceC16622O;
                    this.f135670b = this;
                    this.f135671c = this;
                    this.f135672d = interfaceC16622O;
                    this.f135673e = 0;
                    this.f135674f = 0;
                    this.f135675g = 0;
                    this.f135676h = 0;
                    this.f135677i = 1;
                    obj = aVar.D(str, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            if (Result.h(objB)) {
                TipNotification tipNotification = (TipNotification) objB;
                if (tipNotification != null) {
                    objB = tipNotification.getTipData();
                } else {
                    objB = null;
                }
            }
            Object objB2 = Result.b(objB);
            ResultKt.b(objB2);
            return objB2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lgj/c;", "<anonymous>", "(Lqv/O;)Lgj/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$updateRateAndTipNotification$2", f = "OrderStatusRepository.kt", l = {76}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: hm.c$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super OrderDetail>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f135681a;

        /* renamed from: b, reason: collision with root package name */
        Object f135682b;

        /* renamed from: c, reason: collision with root package name */
        Object f135683c;

        /* renamed from: d, reason: collision with root package name */
        Object f135684d;

        /* renamed from: e, reason: collision with root package name */
        int f135685e;

        /* renamed from: f, reason: collision with root package name */
        int f135686f;

        /* renamed from: g, reason: collision with root package name */
        int f135687g;

        /* renamed from: h, reason: collision with root package name */
        int f135688h;

        /* renamed from: i, reason: collision with root package name */
        int f135689i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f135690j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f135692l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f135693m;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lgj/c;", "<anonymous>", "(Lqv/O;)Lgj/c;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$updateRateAndTipNotification$2$1$1", f = "OrderStatusRepository.kt", l = {85, 86}, m = "invokeSuspend")
        /* renamed from: hm.c$f$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super OrderDetail>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f135694a;

            /* renamed from: b, reason: collision with root package name */
            Object f135695b;

            /* renamed from: c, reason: collision with root package name */
            int f135696c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f135697d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C14501c f135698e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f135699f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f135700g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lgj/c;", "<anonymous>", "(Lqv/O;)Lgj/c;"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$updateRateAndTipNotification$2$1$1$orderFullDetails$1", f = "OrderStatusRepository.kt", l = {78}, m = "invokeSuspend")
            /* renamed from: hm.c$f$a$a, reason: collision with other inner class name */
            static final class C2145a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super OrderDetail>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f135701a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C14501c f135702b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f135703c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2145a(C14501c c14501c, String str, Continuation<? super C2145a> continuation) {
                    super(2, continuation);
                    this.f135702b = c14501c;
                    this.f135703c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2145a(this.f135702b, this.f135703c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super OrderDetail> continuation) {
                    return ((C2145a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f135701a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f135702b.ordersRepository;
                    String str = this.f135703c;
                    this.f135701a = 1;
                    Object objY = aVar.y(str, this);
                    if (objY == objF) {
                        return objF;
                    }
                    return objY;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$updateRateAndTipNotification$2$1$1$updateTipInfo$1", f = "OrderStatusRepository.kt", l = {BinsView.LABEL_WIDTH_DP}, m = "invokeSuspend")
            /* renamed from: hm.c$f$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f135704a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C14501c f135705b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f135706c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f135707d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C14501c c14501c, String str, String str2, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f135705b = c14501c;
                    this.f135706c = str;
                    this.f135707d = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f135705b, this.f135706c, this.f135707d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f135704a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f135705b.ordersRepository;
                    String str = this.f135706c;
                    String str2 = this.f135707d;
                    this.f135704a = 1;
                    Object objK = aVar.K(str, str2, this);
                    if (objK == objF) {
                        return objF;
                    }
                    return objK;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C14501c c14501c, String str, String str2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f135698e = c14501c;
                this.f135699f = str;
                this.f135700g = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f135698e, this.f135699f, this.f135700g, continuation);
                aVar.f135697d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super OrderDetail> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InterfaceC16622O interfaceC16622O;
                W wB;
                W w10;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f135696c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wB = (W) this.f135695b;
                    w10 = (W) this.f135694a;
                    interfaceC16622O = (InterfaceC16622O) this.f135697d;
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    interfaceC16622O = (InterfaceC16622O) this.f135697d;
                    W wB2 = C16648k.b(interfaceC16622O, null, null, new C2145a(this.f135698e, this.f135699f, null), 3, null);
                    wB = C16648k.b(interfaceC16622O, null, null, new b(this.f135698e, this.f135699f, this.f135700g, null), 3, null);
                    W[] wArr = {wB2, wB};
                    this.f135697d = interfaceC16622O;
                    this.f135694a = wB2;
                    this.f135695b = wB;
                    this.f135696c = 1;
                    if (C16638f.b(wArr, this) != objF) {
                        w10 = wB2;
                    }
                    return objF;
                }
                this.f135697d = interfaceC16622O;
                this.f135694a = w10;
                this.f135695b = wB;
                this.f135696c = 2;
                Object objB = w10.B(this);
                if (objB == objF) {
                    return objF;
                }
                return objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f135692l = str;
            this.f135693m = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = C14501c.this.new f(this.f135692l, this.f135693m, continuation);
            fVar.f135690j = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super OrderDetail> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f135689i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f135690j;
                    C14501c c14501c = C14501c.this;
                    String str = this.f135692l;
                    String str2 = this.f135693m;
                    Result.Companion companion = Result.INSTANCE;
                    a aVar = new a(c14501c, str, str2, null);
                    this.f135690j = interfaceC16622O;
                    this.f135681a = interfaceC16622O;
                    this.f135682b = this;
                    this.f135683c = this;
                    this.f135684d = interfaceC16622O;
                    this.f135685e = 0;
                    this.f135686f = 0;
                    this.f135687g = 0;
                    this.f135688h = 0;
                    this.f135689i = 1;
                    obj = C16623P.g(aVar, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            ResultKt.b(objB);
            return objB;
        }
    }

    private final boolean k(OrderHistoryItem orderHistoryItem) {
        return OrderHistoryItem.o(orderHistoryItem, null, 1, null) && orderHistoryItem.getIsActive() && !orderHistoryItem.getTippedAndRated() && !this.appPrefManager.c().contains(orderHistoryItem.getCode());
    }

    public C14501c(com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, C18264a appPrefManager, Ro.c productsRepository, AbstractC16618K ioDispatcher) {
        Intrinsics.j(ordersRepository, "ordersRepository");
        Intrinsics.j(appPrefManager, "appPrefManager");
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.ordersRepository = ordersRepository;
        this.appPrefManager = appPrefManager;
        this.productsRepository = productsRepository;
        this.ioDispatcher = ioDispatcher;
    }

    private final Object f(String str, Continuation<? super OrderResponseHolder> continuation) {
        return C16644i.g(this.ioDispatcher, new b(str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r12, hm.OrderResponseHolder r13, kotlin.coroutines.Continuation<? super hm.FullOrderResponseHolder> r14) throws com.meijer.mobile.home.ux.orders.NullOrderException {
        /*
            r11 = this;
            boolean r0 = r14 instanceof hm.C14501c.C2144c
            if (r0 == 0) goto L13
            r0 = r14
            hm.c$c r0 = (hm.C14501c.C2144c) r0
            int r1 = r0.f135653i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135653i = r1
            goto L18
        L13:
            hm.c$c r0 = new hm.c$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f135651g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f135653i
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r12 = r0.f135649e
            gj.c r12 = (gj.OrderDetail) r12
            java.lang.Object r13 = r0.f135648d
            Gl.b r13 = (Gl.FlyBuyOrderDetail) r13
            java.lang.Object r1 = r0.f135647c
            gj.c r1 = (gj.OrderDetail) r1
            java.lang.Object r1 = r0.f135646b
            hm.b r1 = (hm.OrderResponseHolder) r1
            java.lang.Object r0 = r0.f135645a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.b(r14)
            r4 = r12
            r5 = r13
            goto L6f
        L3f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L47:
            kotlin.ResultKt.b(r14)
            gj.c r14 = r13.getFullOrderDetails()
            if (r14 == 0) goto L7d
            Gl.b r2 = r13.getFlyBuyResponse()
            com.meijer.mobile.digitalshopping.api.orders.a r4 = r11.ordersRepository
            r0.f135645a = r12
            r0.f135646b = r13
            r0.f135647c = r14
            r0.f135648d = r2
            r0.f135649e = r14
            r13 = 0
            r0.f135650f = r13
            r0.f135653i = r3
            java.lang.Object r12 = r4.x(r12, r0)
            if (r12 != r1) goto L6c
            return r1
        L6c:
            r4 = r14
            r5 = r2
            r14 = r12
        L6f:
            r6 = r14
            wl.a r6 = (wl.OrderSubstitutionsDetail) r6
            hm.a r3 = new hm.a
            r7 = 0
            r8 = 0
            r9 = 24
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L7d:
            com.meijer.mobile.home.ux.orders.NullOrderException r12 = new com.meijer.mobile.home.ux.orders.NullOrderException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.C14501c.g(java.lang.String, hm.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(hm.FullOrderResponseHolder r14, kotlin.coroutines.Continuation<? super hm.FullOrderResponseHolder> r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.C14501c.h(hm.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final List<OrderOutOfStockItem> j(List<String> listOutOfStockUpc, List<ProductFullDetails> allUpcItems) {
        ArrayList arrayList = new ArrayList();
        for (ProductFullDetails productFullDetails : allUpcItems) {
            if (listOutOfStockUpc.contains(productFullDetails.getCode())) {
                arrayList.add(new OrderOutOfStockItem(null, productFullDetails.getName(), productFullDetails.j(), productFullDetails.getQtyIncrement(), productFullDetails.getPrice(), productFullDetails, 1, null));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0103, code lost:
    
        if (r1 == r2) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0177 -> B:37:0x0184). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x02bb -> B:75:0x02bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x02c5 -> B:77:0x02cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation<? super java.util.List<hm.FullOrderResponseHolder>> r27) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.C14501c.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object i(String str, Continuation<? super TipData> continuation) {
        return C16644i.g(this.ioDispatcher, new e(str, null), continuation);
    }

    public final Object l(String str, String str2, Continuation<? super OrderDetail> continuation) {
        return C16644i.g(this.ioDispatcher, new f(str, str2, null), continuation);
    }
}
