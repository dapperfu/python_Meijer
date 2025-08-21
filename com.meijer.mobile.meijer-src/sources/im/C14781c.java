package im;

import Co.ProductFullDetails;
import Hl.FlyBuyOrderDetail;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import hj.OrderDetail;
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
import mv.AbstractC15779K;
import mv.C15784P;
import mv.C15799f;
import mv.C15805i;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import mv.W;
import ol.OrderHistoryItem;
import pl.TipData;
import pl.TipNotification;
import uo.OrderOutOfStockItem;
import yo.C18335a;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u00020\u00182\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0017\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001d2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u001e0\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0086@¢\u0006\u0004\b%\u0010&J(\u0010*\u001a\u00020)2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\n\u0010(\u001a\u00060\u0011j\u0002`'H\u0086@¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\u0004\u0018\u00010,2\n\u0010(\u001a\u00060\u0011j\u0002`'H\u0086@¢\u0006\u0004\b-\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lim/c;", "", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "Lyo/a;", "appPrefManager", "LRo/c;", "productsRepository", "Lmv/K;", "ioDispatcher", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/a;Lyo/a;LRo/c;Lmv/K;)V", "Lol/b;", "orderHistoryItem", "", "k", "(Lol/b;)Z", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lim/b;", "f", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderResponseHolder", "Lim/a;", "g", "(Ljava/lang/String;Lim/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(Lim/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "listOutOfStockUpc", "LCo/h;", "allUpcItems", "Luo/a;", "j", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "Lhj/c;", "l", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpl/a;", "i", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "b", "Lyo/a;", "c", "LRo/c;", "d", "Lmv/K;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: im.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14781c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C18335a appPrefManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository", f = "OrderStatusRepository.kt", l = {43, 46, 56, 66}, m = "fetchActiveOrders")
    /* renamed from: im.c$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f138253a;

        /* renamed from: b, reason: collision with root package name */
        Object f138254b;

        /* renamed from: c, reason: collision with root package name */
        Object f138255c;

        /* renamed from: d, reason: collision with root package name */
        Object f138256d;

        /* renamed from: e, reason: collision with root package name */
        Object f138257e;

        /* renamed from: f, reason: collision with root package name */
        Object f138258f;

        /* renamed from: g, reason: collision with root package name */
        Object f138259g;

        /* renamed from: h, reason: collision with root package name */
        Object f138260h;

        /* renamed from: i, reason: collision with root package name */
        Object f138261i;

        /* renamed from: j, reason: collision with root package name */
        Object f138262j;

        /* renamed from: k, reason: collision with root package name */
        int f138263k;

        /* renamed from: l, reason: collision with root package name */
        int f138264l;

        /* renamed from: m, reason: collision with root package name */
        int f138265m;

        /* renamed from: n, reason: collision with root package name */
        int f138266n;

        /* renamed from: o, reason: collision with root package name */
        int f138267o;

        /* renamed from: p, reason: collision with root package name */
        int f138268p;

        /* renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f138269q;

        /* renamed from: s, reason: collision with root package name */
        int f138271s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f138269q = obj;
            this.f138271s |= Integer.MIN_VALUE;
            return C14781c.this.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lim/b;", "<anonymous>", "(Lmv/O;)Lim/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$fetchOrderDetails$2", f = "OrderStatusRepository.kt", l = {118, 118}, m = "invokeSuspend")
    /* renamed from: im.c$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderResponseHolder>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f138272a;

        /* renamed from: b, reason: collision with root package name */
        Object f138273b;

        /* renamed from: c, reason: collision with root package name */
        Object f138274c;

        /* renamed from: d, reason: collision with root package name */
        int f138275d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f138276e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f138278g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LHl/b;", "<anonymous>", "(Lmv/O;)LHl/b;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$fetchOrderDetails$2$getFlyBuyDetails$1", f = "OrderStatusRepository.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: im.c$b$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super FlyBuyOrderDetail>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f138279a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14781c f138280b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f138281c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C14781c c14781c, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f138280b = c14781c;
                this.f138281c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f138280b, this.f138281c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super FlyBuyOrderDetail> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws NumberFormatException {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f138279a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f138280b.ordersRepository;
                int i11 = Integer.parseInt(this.f138281c);
                this.f138279a = 1;
                Object objV = aVar.v(i11, this);
                if (objV == objF) {
                    return objF;
                }
                return objV;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lhj/c;", "<anonymous>", "(Lmv/O;)Lhj/c;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$fetchOrderDetails$2$getOrderDetails$1", f = "OrderStatusRepository.kt", l = {113}, m = "invokeSuspend")
        /* renamed from: im.c$b$b, reason: collision with other inner class name */
        static final class C2186b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderDetail>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f138282a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14781c f138283b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f138284c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2186b(C14781c c14781c, String str, Continuation<? super C2186b> continuation) {
                super(2, continuation);
                this.f138283b = c14781c;
                this.f138284c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2186b(this.f138283b, this.f138284c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderDetail> continuation) {
                return ((C2186b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f138282a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f138283b.ordersRepository;
                String str = this.f138284c;
                this.f138282a = 1;
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
            this.f138278g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C14781c.this.new b(this.f138278g, continuation);
            bVar.f138276e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderResponseHolder> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC15783O interfaceC15783O;
            W wB;
            W w10;
            OrderDetail orderDetail;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138275d;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        orderDetail = (OrderDetail) this.f138274c;
                        ResultKt.b(obj);
                        return new OrderResponseHolder(orderDetail, (FlyBuyOrderDetail) obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wB = (W) this.f138273b;
                w10 = (W) this.f138272a;
                interfaceC15783O = (InterfaceC15783O) this.f138276e;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                interfaceC15783O = (InterfaceC15783O) this.f138276e;
                W wB2 = C15809k.b(interfaceC15783O, null, null, new C2186b(C14781c.this, this.f138278g, null), 3, null);
                wB = C15809k.b(interfaceC15783O, null, null, new a(C14781c.this, this.f138278g, null), 3, null);
                this.f138276e = interfaceC15783O;
                this.f138272a = wB2;
                this.f138273b = wB;
                this.f138275d = 1;
                Object objH = wB2.H(this);
                if (objH != objF) {
                    w10 = wB2;
                    obj = objH;
                }
                return objF;
            }
            OrderDetail orderDetail2 = (OrderDetail) obj;
            this.f138276e = interfaceC15783O;
            this.f138272a = w10;
            this.f138273b = wB;
            this.f138274c = orderDetail2;
            this.f138275d = 2;
            Object objH2 = wB.H(this);
            if (objH2 != objF) {
                orderDetail = orderDetail2;
                obj = objH2;
                return new OrderResponseHolder(orderDetail, (FlyBuyOrderDetail) obj);
            }
            return objF;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository", f = "OrderStatusRepository.kt", l = {131}, m = "fetchOrderSubstitutions")
    /* renamed from: im.c$c, reason: collision with other inner class name */
    static final class C2187c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f138285a;

        /* renamed from: b, reason: collision with root package name */
        Object f138286b;

        /* renamed from: c, reason: collision with root package name */
        Object f138287c;

        /* renamed from: d, reason: collision with root package name */
        Object f138288d;

        /* renamed from: e, reason: collision with root package name */
        Object f138289e;

        /* renamed from: f, reason: collision with root package name */
        int f138290f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f138291g;

        /* renamed from: i, reason: collision with root package name */
        int f138293i;

        C2187c(Continuation<? super C2187c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f138291g = obj;
            this.f138293i |= Integer.MIN_VALUE;
            return C14781c.this.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository", f = "OrderStatusRepository.kt", l = {167}, m = "fetchProductDetails")
    /* renamed from: im.c$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f138294a;

        /* renamed from: b, reason: collision with root package name */
        Object f138295b;

        /* renamed from: c, reason: collision with root package name */
        Object f138296c;

        /* renamed from: d, reason: collision with root package name */
        Object f138297d;

        /* renamed from: e, reason: collision with root package name */
        Object f138298e;

        /* renamed from: f, reason: collision with root package name */
        Object f138299f;

        /* renamed from: g, reason: collision with root package name */
        Object f138300g;

        /* renamed from: h, reason: collision with root package name */
        Object f138301h;

        /* renamed from: i, reason: collision with root package name */
        int f138302i;

        /* renamed from: j, reason: collision with root package name */
        int f138303j;

        /* renamed from: k, reason: collision with root package name */
        int f138304k;

        /* renamed from: l, reason: collision with root package name */
        int f138305l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f138306m;

        /* renamed from: o, reason: collision with root package name */
        int f138308o;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f138306m = obj;
            this.f138308o |= Integer.MIN_VALUE;
            return C14781c.this.h(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lpl/a;", "<anonymous>", "(Lmv/O;)Lpl/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$fetchTipNotification$2", f = "OrderStatusRepository.kt", l = {94}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: im.c$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super TipData>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f138309a;

        /* renamed from: b, reason: collision with root package name */
        Object f138310b;

        /* renamed from: c, reason: collision with root package name */
        Object f138311c;

        /* renamed from: d, reason: collision with root package name */
        Object f138312d;

        /* renamed from: e, reason: collision with root package name */
        int f138313e;

        /* renamed from: f, reason: collision with root package name */
        int f138314f;

        /* renamed from: g, reason: collision with root package name */
        int f138315g;

        /* renamed from: h, reason: collision with root package name */
        int f138316h;

        /* renamed from: i, reason: collision with root package name */
        int f138317i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f138318j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f138320l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f138320l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = C14781c.this.new e(this.f138320l, continuation);
            eVar.f138318j = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super TipData> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138317i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f138318j;
                    C14781c c14781c = C14781c.this;
                    String str = this.f138320l;
                    Result.Companion companion = Result.INSTANCE;
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = c14781c.ordersRepository;
                    this.f138318j = interfaceC15783O;
                    this.f138309a = interfaceC15783O;
                    this.f138310b = this;
                    this.f138311c = this;
                    this.f138312d = interfaceC15783O;
                    this.f138313e = 0;
                    this.f138314f = 0;
                    this.f138315g = 0;
                    this.f138316h = 0;
                    this.f138317i = 1;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lhj/c;", "<anonymous>", "(Lmv/O;)Lhj/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$updateRateAndTipNotification$2", f = "OrderStatusRepository.kt", l = {76}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: im.c$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderDetail>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f138321a;

        /* renamed from: b, reason: collision with root package name */
        Object f138322b;

        /* renamed from: c, reason: collision with root package name */
        Object f138323c;

        /* renamed from: d, reason: collision with root package name */
        Object f138324d;

        /* renamed from: e, reason: collision with root package name */
        int f138325e;

        /* renamed from: f, reason: collision with root package name */
        int f138326f;

        /* renamed from: g, reason: collision with root package name */
        int f138327g;

        /* renamed from: h, reason: collision with root package name */
        int f138328h;

        /* renamed from: i, reason: collision with root package name */
        int f138329i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f138330j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f138332l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f138333m;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lhj/c;", "<anonymous>", "(Lmv/O;)Lhj/c;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$updateRateAndTipNotification$2$1$1", f = "OrderStatusRepository.kt", l = {85, 86}, m = "invokeSuspend")
        /* renamed from: im.c$f$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderDetail>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f138334a;

            /* renamed from: b, reason: collision with root package name */
            Object f138335b;

            /* renamed from: c, reason: collision with root package name */
            int f138336c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f138337d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C14781c f138338e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f138339f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f138340g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lhj/c;", "<anonymous>", "(Lmv/O;)Lhj/c;"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$updateRateAndTipNotification$2$1$1$orderFullDetails$1", f = "OrderStatusRepository.kt", l = {78}, m = "invokeSuspend")
            /* renamed from: im.c$f$a$a, reason: collision with other inner class name */
            static final class C2188a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderDetail>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f138341a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C14781c f138342b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f138343c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2188a(C14781c c14781c, String str, Continuation<? super C2188a> continuation) {
                    super(2, continuation);
                    this.f138342b = c14781c;
                    this.f138343c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2188a(this.f138342b, this.f138343c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderDetail> continuation) {
                    return ((C2188a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f138341a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f138342b.ordersRepository;
                    String str = this.f138343c;
                    this.f138341a = 1;
                    Object objY = aVar.y(str, this);
                    if (objY == objF) {
                        return objF;
                    }
                    return objY;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.orders.OrderStatusRepository$updateRateAndTipNotification$2$1$1$updateTipInfo$1", f = "OrderStatusRepository.kt", l = {BinsView.LABEL_WIDTH_DP}, m = "invokeSuspend")
            /* renamed from: im.c$f$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f138344a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C14781c f138345b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f138346c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f138347d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C14781c c14781c, String str, String str2, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f138345b = c14781c;
                    this.f138346c = str;
                    this.f138347d = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f138345b, this.f138346c, this.f138347d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f138344a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f138345b.ordersRepository;
                    String str = this.f138346c;
                    String str2 = this.f138347d;
                    this.f138344a = 1;
                    Object objK = aVar.K(str, str2, this);
                    if (objK == objF) {
                        return objF;
                    }
                    return objK;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C14781c c14781c, String str, String str2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f138338e = c14781c;
                this.f138339f = str;
                this.f138340g = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f138338e, this.f138339f, this.f138340g, continuation);
                aVar.f138337d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderDetail> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InterfaceC15783O interfaceC15783O;
                W wB;
                W w10;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f138336c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wB = (W) this.f138335b;
                    w10 = (W) this.f138334a;
                    interfaceC15783O = (InterfaceC15783O) this.f138337d;
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    interfaceC15783O = (InterfaceC15783O) this.f138337d;
                    W wB2 = C15809k.b(interfaceC15783O, null, null, new C2188a(this.f138338e, this.f138339f, null), 3, null);
                    wB = C15809k.b(interfaceC15783O, null, null, new b(this.f138338e, this.f138339f, this.f138340g, null), 3, null);
                    W[] wArr = {wB2, wB};
                    this.f138337d = interfaceC15783O;
                    this.f138334a = wB2;
                    this.f138335b = wB;
                    this.f138336c = 1;
                    if (C15799f.b(wArr, this) != objF) {
                        w10 = wB2;
                    }
                    return objF;
                }
                this.f138337d = interfaceC15783O;
                this.f138334a = w10;
                this.f138335b = wB;
                this.f138336c = 2;
                Object objH = w10.H(this);
                if (objH == objF) {
                    return objF;
                }
                return objH;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f138332l = str;
            this.f138333m = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = C14781c.this.new f(this.f138332l, this.f138333m, continuation);
            fVar.f138330j = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderDetail> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138329i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f138330j;
                    C14781c c14781c = C14781c.this;
                    String str = this.f138332l;
                    String str2 = this.f138333m;
                    Result.Companion companion = Result.INSTANCE;
                    a aVar = new a(c14781c, str, str2, null);
                    this.f138330j = interfaceC15783O;
                    this.f138321a = interfaceC15783O;
                    this.f138322b = this;
                    this.f138323c = this;
                    this.f138324d = interfaceC15783O;
                    this.f138325e = 0;
                    this.f138326f = 0;
                    this.f138327g = 0;
                    this.f138328h = 0;
                    this.f138329i = 1;
                    obj = C15784P.g(aVar, this);
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

    public C14781c(com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, C18335a appPrefManager, Ro.c productsRepository, AbstractC15779K ioDispatcher) {
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
        return C15805i.g(this.ioDispatcher, new b(str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r12, im.OrderResponseHolder r13, kotlin.coroutines.Continuation<? super im.FullOrderResponseHolder> r14) throws com.meijer.mobile.home.ux.orders.NullOrderException {
        /*
            r11 = this;
            boolean r0 = r14 instanceof im.C14781c.C2187c
            if (r0 == 0) goto L13
            r0 = r14
            im.c$c r0 = (im.C14781c.C2187c) r0
            int r1 = r0.f138293i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138293i = r1
            goto L18
        L13:
            im.c$c r0 = new im.c$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f138291g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f138293i
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r12 = r0.f138289e
            hj.c r12 = (hj.OrderDetail) r12
            java.lang.Object r13 = r0.f138288d
            Hl.b r13 = (Hl.FlyBuyOrderDetail) r13
            java.lang.Object r1 = r0.f138287c
            hj.c r1 = (hj.OrderDetail) r1
            java.lang.Object r1 = r0.f138286b
            im.b r1 = (im.OrderResponseHolder) r1
            java.lang.Object r0 = r0.f138285a
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
            hj.c r14 = r13.getFullOrderDetails()
            if (r14 == 0) goto L7d
            Hl.b r2 = r13.getFlyBuyResponse()
            com.meijer.mobile.digitalshopping.api.orders.a r4 = r11.ordersRepository
            r0.f138285a = r12
            r0.f138286b = r13
            r0.f138287c = r14
            r0.f138288d = r2
            r0.f138289e = r14
            r13 = 0
            r0.f138290f = r13
            r0.f138293i = r3
            java.lang.Object r12 = r4.x(r12, r0)
            if (r12 != r1) goto L6c
            return r1
        L6c:
            r4 = r14
            r5 = r2
            r14 = r12
        L6f:
            r6 = r14
            xl.a r6 = (xl.OrderSubstitutionsDetail) r6
            im.a r3 = new im.a
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
        throw new UnsupportedOperationException("Method not decompiled: im.C14781c.g(java.lang.String, im.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(im.FullOrderResponseHolder r14, kotlin.coroutines.Continuation<? super im.FullOrderResponseHolder> r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.C14781c.h(im.a, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object e(kotlin.coroutines.Continuation<? super java.util.List<im.FullOrderResponseHolder>> r27) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.C14781c.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object i(String str, Continuation<? super TipData> continuation) {
        return C15805i.g(this.ioDispatcher, new e(str, null), continuation);
    }

    public final Object l(String str, String str2, Continuation<? super OrderDetail> continuation) {
        return C15805i.g(this.ioDispatcher, new f(str, str2, null), continuation);
    }
}
