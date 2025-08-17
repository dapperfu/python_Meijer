package hl;

import Co.ProductFullDetails;
import Tq.PointOfService;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.cart.model.hybris.Cart;
import com.meijer.mobile.cart.model.hybris.EntryJson;
import ej.Entry;
import ej.ShoppingCart;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jj.C14978b;
import jj.C14983g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16646j;
import qv.InterfaceC16622O;
import rj.C16793b;
import tk.c;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.S;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0011H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\rH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00103R\"\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\r0\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0010R&\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\r0;8VX\u0097\u0004¢\u0006\f\u0012\u0004\b>\u0010\u001d\u001a\u0004\b.\u0010=R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0010R \u0010D\u001a\b\u0012\u0004\u0012\u00020A0;8VX\u0097\u0004¢\u0006\f\u0012\u0004\bC\u0010\u001d\u001a\u0004\bB\u0010=R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020A0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R$\u0010J\u001a\f\u0012\b\u0012\u00060Fj\u0002`G0;8VX\u0097\u0004¢\u0006\f\u0012\u0004\bI\u0010\u001d\u001a\u0004\bH\u0010=R\u001e\u0010L\u001a\f\u0012\b\u0012\u00060Fj\u0002`G0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0010¨\u0006M"}, d2 = {"Lhl/C;", "Lhl/f;", "LTq/j;", "storeProvider", "LCs/b;", "userProvider", "Lrj/b;", "cartDataSource", "Lhl/b;", "cartEntriesRepository", "<init>", "(LTq/j;LCs/b;Lrj/b;Lhl/b;)V", "Ltv/f;", "Ltk/c;", "LTq/c;", "l", "()Ltv/f;", "", "setLoading", "calculateLightningCart", "retainOutOfStockItems", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "m", "(ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCalculate", "", "e", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "()V", "x", "cartRes", "v", "(Ltk/c;)V", "", "throwable", "w", "(Ljava/lang/Throwable;)V", "a", "LTq/j;", "getStoreProvider", "()LTq/j;", "b", "LCs/b;", "u", "()LCs/b;", "c", "Lrj/b;", "d", "Lhl/b;", "LAv/a;", "LAv/a;", "mutex", "Ltv/B;", "f", "Ltv/B;", "_cartFlow", "q", "cartFlow", "Lio/reactivex/l;", "Lej/C;", "()Lio/reactivex/l;", "getShoppingCartStream$annotations", "shoppingCartStream", "shoppingCartFlow", "", "t", "getTotalItemCountStream$annotations", "totalItemCountStream", "totalItemCountFlow", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "r", "getCartId$annotations", "cartId", "s", "cartIdFlow", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hl.C, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14488C implements InterfaceC14494f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C16793b cartDataSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C14490b cartEntriesRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Av.a mutex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<tk.c<Cart>> _cartFlow;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hl.C$a */
    public static final class a implements InterfaceC17152f<Pair<? extends tk.c<ShoppingCart>, ? extends Instant>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f135090a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hl.C$a$a, reason: collision with other inner class name */
        public static final class C2128a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f135091a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$_get_shoppingCartFlow_$lambda$3$$inlined$map$1$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: hl.C$a$a$a, reason: collision with other inner class name */
            public static final class C2129a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f135092a;

                /* renamed from: b, reason: collision with root package name */
                int f135093b;

                /* renamed from: c, reason: collision with root package name */
                Object f135094c;

                /* renamed from: e, reason: collision with root package name */
                Object f135096e;

                /* renamed from: f, reason: collision with root package name */
                Object f135097f;

                /* renamed from: g, reason: collision with root package name */
                Object f135098g;

                /* renamed from: h, reason: collision with root package name */
                int f135099h;

                public C2129a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f135092a = obj;
                    this.f135093b |= Integer.MIN_VALUE;
                    return C2128a.this.emit(null, this);
                }
            }

            public C2128a(InterfaceC17153g interfaceC17153g) {
                this.f135091a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hl.C14488C.a.C2128a.C2129a
                    if (r0 == 0) goto L13
                    r0 = r7
                    hl.C$a$a$a r0 = (hl.C14488C.a.C2128a.C2129a) r0
                    int r1 = r0.f135093b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135093b = r1
                    goto L18
                L13:
                    hl.C$a$a$a r0 = new hl.C$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f135092a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f135093b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f135098g
                    tv.g r6 = (tv.InterfaceC17153g) r6
                    java.lang.Object r6 = r0.f135096e
                    hl.C$a$a$a r6 = (hl.C14488C.a.C2128a.C2129a) r6
                    kotlin.ResultKt.b(r7)
                    goto L63
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    tv.g r7 = r5.f135091a
                    r2 = r6
                    tk.c r2 = (tk.c) r2
                    hl.C$i r4 = hl.C14488C.i.f135154a
                    tk.c r2 = tk.e.f(r2, r4)
                    j$.time.Instant r4 = j$.time.Instant.now()
                    kotlin.Pair r2 = kotlin.TuplesKt.a(r2, r4)
                    r0.f135094c = r6
                    r0.f135096e = r0
                    r0.f135097f = r6
                    r0.f135098g = r7
                    r6 = 0
                    r0.f135099h = r6
                    r0.f135093b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L63
                    return r1
                L63:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hl.C14488C.a.C2128a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC17152f interfaceC17152f) {
            this.f135090a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super Pair<? extends tk.c<ShoppingCart>, ? extends Instant>> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f135090a.collect(new C2128a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hl.C$b */
    public static final class b implements InterfaceC17152f<Pair<? extends Integer, ? extends Instant>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f135100a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hl.C$b$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f135101a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$_get_shoppingCartFlow_$lambda$3$$inlined$map$2$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: hl.C$b$a$a, reason: collision with other inner class name */
            public static final class C2130a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f135102a;

                /* renamed from: b, reason: collision with root package name */
                int f135103b;

                /* renamed from: c, reason: collision with root package name */
                Object f135104c;

                /* renamed from: e, reason: collision with root package name */
                Object f135106e;

                /* renamed from: f, reason: collision with root package name */
                Object f135107f;

                /* renamed from: g, reason: collision with root package name */
                Object f135108g;

                /* renamed from: h, reason: collision with root package name */
                int f135109h;

                public C2130a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f135102a = obj;
                    this.f135103b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f135101a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hl.C14488C.b.a.C2130a
                    if (r0 == 0) goto L13
                    r0 = r7
                    hl.C$b$a$a r0 = (hl.C14488C.b.a.C2130a) r0
                    int r1 = r0.f135103b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135103b = r1
                    goto L18
                L13:
                    hl.C$b$a$a r0 = new hl.C$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f135102a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f135103b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f135108g
                    tv.g r6 = (tv.InterfaceC17153g) r6
                    java.lang.Object r6 = r0.f135106e
                    hl.C$b$a$a r6 = (hl.C14488C.b.a.C2130a) r6
                    kotlin.ResultKt.b(r7)
                    goto L65
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    tv.g r7 = r5.f135101a
                    r2 = r6
                    java.lang.Number r2 = (java.lang.Number) r2
                    int r2 = r2.intValue()
                    java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.d(r2)
                    j$.time.Instant r4 = j$.time.Instant.now()
                    kotlin.Pair r2 = kotlin.TuplesKt.a(r2, r4)
                    r0.f135104c = r6
                    r0.f135106e = r0
                    r0.f135107f = r6
                    r0.f135108g = r7
                    r6 = 0
                    r0.f135109h = r6
                    r0.f135103b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L65
                    return r1
                L65:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hl.C14488C.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC17152f interfaceC17152f) {
            this.f135100a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super Pair<? extends Integer, ? extends Instant>> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f135100a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$cartFlow$1", f = "ShoppingCartProvider.kt", l = {354, 105}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: hl.C$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f135110a;

        /* renamed from: b, reason: collision with root package name */
        Object f135111b;

        /* renamed from: c, reason: collision with root package name */
        Object f135112c;

        /* renamed from: d, reason: collision with root package name */
        Object f135113d;

        /* renamed from: e, reason: collision with root package name */
        Object f135114e;

        /* renamed from: f, reason: collision with root package name */
        Object f135115f;

        /* renamed from: g, reason: collision with root package name */
        int f135116g;

        /* renamed from: h, reason: collision with root package name */
        int f135117h;

        /* renamed from: i, reason: collision with root package name */
        int f135118i;

        /* renamed from: j, reason: collision with root package name */
        int f135119j;

        /* renamed from: k, reason: collision with root package name */
        int f135120k;

        /* renamed from: l, reason: collision with root package name */
        int f135121l;

        /* renamed from: m, reason: collision with root package name */
        int f135122m;

        /* renamed from: n, reason: collision with root package name */
        private /* synthetic */ Object f135123n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C14488C.this.new c(continuation);
            cVar.f135123n = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
        
            if (hl.C14488C.n(r6, false, false, false, r13, 7, null) == r0) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e2 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:7:0x002d, B:28:0x00c4, B:31:0x00dc, B:33:0x00e2, B:34:0x00eb, B:30:0x00cb, B:20:0x0079, B:22:0x0083, B:23:0x008f, B:25:0x009b), top: B:39:0x000a, inners: #1 }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [Av.a] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v3, types: [Av.a] */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: hl.C14488C.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltk/c;", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "cartRes", "", "<anonymous>", "(Ltk/c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$cartFlow$2", f = "ShoppingCartProvider.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: hl.C$d */
    static final class d extends SuspendLambda implements Function2<tk.c<Cart>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f135125a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f135126b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C14488C.this.new d(continuation);
            dVar.f135126b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(tk.c<Cart> cVar, Continuation<? super Unit> continuation) {
            return ((d) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<? extends mk.i> listM;
            List<EntryJson> listV;
            IntrinsicsKt.f();
            if (this.f135125a == 0) {
                ResultKt.b(obj);
                tk.c cVar = (tk.c) this.f135126b;
                C14490b c14490b = C14488C.this.cartEntriesRepository;
                Cart cart = (Cart) cVar.a();
                if (cart != null && (listV = cart.v()) != null) {
                    List<EntryJson> list = listV;
                    listM = new ArrayList<>(CollectionsKt.x(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        listM.add(C14983g.b((EntryJson) it.next()));
                    }
                } else {
                    listM = null;
                }
                if (listM == null) {
                    listM = CollectionsKt.m();
                }
                c14490b.g(listM);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hl.C$e */
    public static final class e implements InterfaceC17152f<tk.c<PointOfService>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f135128a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hl.C$e$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f135129a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$cartStoreFlow$$inlined$map$1$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: hl.C$e$a$a, reason: collision with other inner class name */
            public static final class C2131a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f135130a;

                /* renamed from: b, reason: collision with root package name */
                int f135131b;

                /* renamed from: c, reason: collision with root package name */
                Object f135132c;

                /* renamed from: e, reason: collision with root package name */
                Object f135134e;

                /* renamed from: f, reason: collision with root package name */
                Object f135135f;

                /* renamed from: g, reason: collision with root package name */
                Object f135136g;

                /* renamed from: h, reason: collision with root package name */
                int f135137h;

                public C2131a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f135130a = obj;
                    this.f135131b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f135129a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hl.C14488C.e.a.C2131a
                    if (r0 == 0) goto L13
                    r0 = r7
                    hl.C$e$a$a r0 = (hl.C14488C.e.a.C2131a) r0
                    int r1 = r0.f135131b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135131b = r1
                    goto L18
                L13:
                    hl.C$e$a$a r0 = new hl.C$e$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f135130a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f135131b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f135136g
                    tv.g r6 = (tv.InterfaceC17153g) r6
                    java.lang.Object r6 = r0.f135134e
                    hl.C$e$a$a r6 = (hl.C14488C.e.a.C2131a) r6
                    kotlin.ResultKt.b(r7)
                    goto L5b
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    tv.g r7 = r5.f135129a
                    r2 = r6
                    tk.c r2 = (tk.c) r2
                    hl.C$f r4 = hl.C14488C.f.f135138a
                    tk.c r2 = tk.e.f(r2, r4)
                    r0.f135132c = r6
                    r0.f135134e = r0
                    r0.f135135f = r6
                    r0.f135136g = r7
                    r6 = 0
                    r0.f135137h = r6
                    r0.f135131b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L5b
                    return r1
                L5b:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hl.C14488C.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(InterfaceC17152f interfaceC17152f) {
            this.f135128a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super tk.c<PointOfService>> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f135128a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hl.C$f */
    static final class f implements Function1<ShoppingCart, PointOfService> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f135138a = new f();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PointOfService invoke(ShoppingCart shoppingCart) {
            if (shoppingCart != null) {
                return shoppingCart.getPointOfService();
            }
            return null;
        }

        f() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider", f = "ShoppingCartProvider.kt", l = {298, 306}, m = "fetchCurrentCart$digitalshopping_release")
    /* renamed from: hl.C$g */
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f135139a;

        /* renamed from: b, reason: collision with root package name */
        boolean f135140b;

        /* renamed from: c, reason: collision with root package name */
        boolean f135141c;

        /* renamed from: d, reason: collision with root package name */
        Object f135142d;

        /* renamed from: e, reason: collision with root package name */
        Object f135143e;

        /* renamed from: f, reason: collision with root package name */
        Object f135144f;

        /* renamed from: g, reason: collision with root package name */
        Object f135145g;

        /* renamed from: h, reason: collision with root package name */
        int f135146h;

        /* renamed from: i, reason: collision with root package name */
        int f135147i;

        /* renamed from: j, reason: collision with root package name */
        int f135148j;

        /* renamed from: k, reason: collision with root package name */
        int f135149k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f135150l;

        /* renamed from: n, reason: collision with root package name */
        int f135152n;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f135150l = obj;
            this.f135152n |= Integer.MIN_VALUE;
            return C14488C.this.m(false, false, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltv/g;", "Lkotlin/Pair;", "", "j$/time/Instant", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$shoppingCartFlow$2$3", f = "ShoppingCartProvider.kt", l = {149}, m = "invokeSuspend")
    /* renamed from: hl.C$j */
    static final class j extends SuspendLambda implements Function2<InterfaceC17153g<? super Pair<? extends Integer, ? extends Instant>>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f135155a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f135156b;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(continuation);
            jVar.f135156b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super Pair<Integer, Instant>> interfaceC17153g, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f135155a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f135156b;
                Pair pairA = TuplesKt.a(Boxing.d(-1), Instant.MIN);
                this.f135156b = interfaceC17153g;
                this.f135155a = 1;
                if (interfaceC17153g.emit(pairA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012 \u0010\u0005\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/Pair;", "Ltk/c;", "Lej/C;", "j$/time/Instant", "kotlin.jvm.PlatformType", "<destruct>", "Lhl/z;", "unconfirmedChanges", "", "<anonymous>", "(Lkotlin/Pair;Lhl/z;Lkotlin/Pair;)Ltk/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$shoppingCartFlow$2$4", f = "ShoppingCartProvider.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: hl.C$k */
    static final class k extends SuspendLambda implements Function4<Pair<? extends tk.c<ShoppingCart>, ? extends Instant>, ProductChangeRequest, Pair<? extends Integer, ? extends Instant>, Continuation<? super tk.c<ShoppingCart>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f135157a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f135158b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f135159c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f135160d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hl.C$k$a */
        static final class a implements Function1<ShoppingCart, ShoppingCart> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<Entry> f135161a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Instant f135162b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Instant f135163c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f135164d;

            a(List<Entry> list, Instant instant, Instant instant2, int i10) {
                this.f135161a = list;
                this.f135162b = instant;
                this.f135163c = instant2;
                this.f135164d = i10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShoppingCart invoke(ShoppingCart shoppingCart) {
                if (shoppingCart != null) {
                    return shoppingCart.a((2147483645 & 1) != 0 ? shoppingCart.code : null, (2147483645 & 2) != 0 ? shoppingCart.entries : CollectionsKt.j1(MapsKt.u(mk.k.a(shoppingCart.p()), mk.k.a(this.f135161a)).values()), (2147483645 & 4) != 0 ? shoppingCart.customerData : null, (2147483645 & 8) != 0 ? shoppingCart.outOfStockEntries : null, (2147483645 & 16) != 0 ? shoppingCart.pointOfService : null, (2147483645 & 32) != 0 ? shoppingCart.substitutePreference : null, (2147483645 & 64) != 0 ? shoppingCart.deliveryMode : null, (2147483645 & 128) != 0 ? shoppingCart.deliveryAddress : null, (2147483645 & 256) != 0 ? shoppingCart.extendedDeliveryCost : null, (2147483645 & 512) != 0 ? shoppingCart.paymentInfo : null, (2147483645 & 1024) != 0 ? shoppingCart.selectedPaymentOption : null, (2147483645 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingCart.multiTenderPaymentInfo : null, (2147483645 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingCart.pickUpPerson : null, (2147483645 & 8192) != 0 ? shoppingCart.pickUpSlotInfo : null, (2147483645 & 16384) != 0 ? shoppingCart.specialSavings : null, (2147483645 & 32768) != 0 ? shoppingCart.mperksSavings : null, (2147483645 & 65536) != 0 ? shoppingCart.couponsSavings : null, (2147483645 & 131072) != 0 ? shoppingCart.teamMemberSavings : null, (2147483645 & 262144) != 0 ? shoppingCart.totalSavings : null, (2147483645 & 524288) != 0 ? shoppingCart.productDiscounts : null, (2147483645 & 1048576) != 0 ? shoppingCart.orderDiscounts : null, (2147483645 & 2097152) != 0 ? shoppingCart.depositPrice : null, (2147483645 & 4194304) != 0 ? shoppingCart.deliveryCost : null, (2147483645 & 8388608) != 0 ? shoppingCart.subTotal : null, (2147483645 & 16777216) != 0 ? shoppingCart.totalDiscounts : null, (2147483645 & 33554432) != 0 ? shoppingCart.itemsTotal : null, (2147483645 & 67108864) != 0 ? shoppingCart.totalCosts : null, (2147483645 & 134217728) != 0 ? shoppingCart.totalPrice : null, (2147483645 & 268435456) != 0 ? shoppingCart.totalTax : null, (2147483645 & 536870912) != 0 ? shoppingCart.totalPriceWithTax : null, (2147483645 & 1073741824) != 0 ? shoppingCart.creditTransactionAmount : null, (2147483645 & Integer.MIN_VALUE) != 0 ? shoppingCart.totalItems : this.f135162b.isAfter(this.f135163c) ? this.f135164d : shoppingCart.getTotalItems(), (16383 & 1) != 0 ? shoppingCart.tippedAndRated : false, (16383 & 2) != 0 ? shoppingCart.originalOrderId : null, (16383 & 4) != 0 ? shoppingCart.isEditingDryOrder : false, (16383 & 8) != 0 ? shoppingCart.deliveryAddressIsAlcoholEligible : false, (16383 & 16) != 0 ? shoppingCart.highValuePromos : null, (16383 & 32) != 0 ? shoppingCart.earlyDeliveryAvailable : false, (16383 & 64) != 0 ? shoppingCart.promoCodeMessage : null, (16383 & 128) != 0 ? shoppingCart.fulfillmentEligibility : null, (16383 & 256) != 0 ? shoppingCart.partnerEligibility : null, (16383 & 512) != 0 ? shoppingCart.availableFulfillmentEligibilities : null, (16383 & 1024) != 0 ? shoppingCart.ebtEligibleTotal : null, (16383 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingCart.ebtNonEligibleTotal : null, (16383 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingCart.ebtSurchargePrice : null, (16383 & 8192) != 0 ? shoppingCart.ebtSuggestedTotal : null);
                }
                return null;
            }
        }

        k(Continuation<? super k> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair<? extends tk.c<ShoppingCart>, Instant> pair, ProductChangeRequest zVar, Pair<Integer, Instant> pair2, Continuation<? super tk.c<ShoppingCart>> continuation) {
            k kVar = new k(continuation);
            kVar.f135158b = pair;
            kVar.f135159c = zVar;
            kVar.f135160d = pair2;
            return kVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f135157a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Pair pair = (Pair) this.f135158b;
            ProductChangeRequest zVar = (ProductChangeRequest) this.f135159c;
            Pair pair2 = (Pair) this.f135160d;
            tk.c cVar = (tk.c) pair.a();
            Instant instant = (Instant) pair.b();
            int iIntValue = ((Number) pair2.a()).intValue();
            Instant instant2 = (Instant) pair2.b();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(zVar, 10));
            for (mk.i iVar : zVar) {
                Entry entry = iVar instanceof Entry ? (Entry) iVar : null;
                if (entry == null) {
                    mk.f fVarM = iVar.getProduct();
                    ProductFullDetails productFullDetails = fVarM instanceof ProductFullDetails ? (ProductFullDetails) fVarM : null;
                    entry = new Entry(0, productFullDetails == null ? new ProductFullDetails(iVar.h2(), null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -2, 268435455, null) : productFullDetails, 0.0d, iVar.getQuantity(), 0.0d, null, null, null, null, null, null, null, null, null, false, 32753, null);
                }
                arrayList.add(entry);
            }
            return tk.e.f(cVar, new a(arrayList, instant2, instant, iIntValue));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Ltv/g;", "it", "", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$special$$inlined$flatMapLatest$1", f = "ShoppingCartProvider.kt", l = {189}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: hl.C$l */
    public static final class l extends SuspendLambda implements Function3<InterfaceC17153g<? super tk.c<ShoppingCart>>, tk.c<ShoppingCart>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f135165a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f135166b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f135167c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C14488C f135168d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Continuation continuation, C14488C c14488c) {
            super(3, continuation);
            this.f135168d = c14488c;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super tk.c<ShoppingCart>> interfaceC17153g, tk.c<ShoppingCart> cVar, Continuation<? super Unit> continuation) {
            l lVar = new l(continuation, this.f135168d);
            lVar.f135166b = interfaceC17153g;
            lVar.f135167c = cVar;
            return lVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f135165a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f135166b;
                Object obj2 = this.f135167c;
                InterfaceC17152f interfaceC17152fR = C17154h.r(C17154h.m(new a(this.f135168d.q()), this.f135168d.cartEntriesRepository.j(), C17154h.P(new b(this.f135168d.cartEntriesRepository.i()), new j(null)), new k(null)));
                this.f135166b = interfaceC17153g;
                this.f135167c = obj2;
                this.f135165a = 1;
                if (C17154h.x(interfaceC17153g, interfaceC17152fR, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hl.C$m */
    public static final class m implements InterfaceC17152f<tk.c<ShoppingCart>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f135169a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hl.C$m$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f135170a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$special$$inlined$map$1$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: hl.C$m$a$a, reason: collision with other inner class name */
            public static final class C2132a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f135171a;

                /* renamed from: b, reason: collision with root package name */
                int f135172b;

                /* renamed from: c, reason: collision with root package name */
                Object f135173c;

                /* renamed from: e, reason: collision with root package name */
                Object f135175e;

                /* renamed from: f, reason: collision with root package name */
                Object f135176f;

                /* renamed from: g, reason: collision with root package name */
                Object f135177g;

                /* renamed from: h, reason: collision with root package name */
                int f135178h;

                public C2132a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f135171a = obj;
                    this.f135172b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f135170a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hl.C14488C.m.a.C2132a
                    if (r0 == 0) goto L13
                    r0 = r7
                    hl.C$m$a$a r0 = (hl.C14488C.m.a.C2132a) r0
                    int r1 = r0.f135172b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135172b = r1
                    goto L18
                L13:
                    hl.C$m$a$a r0 = new hl.C$m$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f135171a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f135172b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f135177g
                    tv.g r6 = (tv.InterfaceC17153g) r6
                    java.lang.Object r6 = r0.f135175e
                    hl.C$m$a$a r6 = (hl.C14488C.m.a.C2132a) r6
                    kotlin.ResultKt.b(r7)
                    goto L5b
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    tv.g r7 = r5.f135170a
                    r2 = r6
                    tk.c r2 = (tk.c) r2
                    hl.C$h r4 = hl.C14488C.h.f135153a
                    tk.c r2 = tk.e.f(r2, r4)
                    r0.f135173c = r6
                    r0.f135175e = r0
                    r0.f135176f = r6
                    r0.f135177g = r7
                    r6 = 0
                    r0.f135178h = r6
                    r0.f135172b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L5b
                    return r1
                L5b:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hl.C14488C.m.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public m(InterfaceC17152f interfaceC17152f) {
            this.f135169a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super tk.c<ShoppingCart>> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f135169a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hl.C$n */
    public static final class n implements InterfaceC17152f<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f135179a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hl.C$n$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f135180a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$special$$inlined$map$2$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: hl.C$n$a$a, reason: collision with other inner class name */
            public static final class C2133a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f135181a;

                /* renamed from: b, reason: collision with root package name */
                int f135182b;

                /* renamed from: c, reason: collision with root package name */
                Object f135183c;

                /* renamed from: e, reason: collision with root package name */
                Object f135185e;

                /* renamed from: f, reason: collision with root package name */
                Object f135186f;

                /* renamed from: g, reason: collision with root package name */
                Object f135187g;

                /* renamed from: h, reason: collision with root package name */
                int f135188h;

                public C2133a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f135181a = obj;
                    this.f135182b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f135180a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hl.C14488C.n.a.C2133a
                    if (r0 == 0) goto L13
                    r0 = r7
                    hl.C$n$a$a r0 = (hl.C14488C.n.a.C2133a) r0
                    int r1 = r0.f135182b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135182b = r1
                    goto L18
                L13:
                    hl.C$n$a$a r0 = new hl.C$n$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f135181a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f135182b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f135187g
                    tv.g r6 = (tv.InterfaceC17153g) r6
                    java.lang.Object r6 = r0.f135185e
                    hl.C$n$a$a r6 = (hl.C14488C.n.a.C2133a) r6
                    kotlin.ResultKt.b(r7)
                    goto L71
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    tv.g r7 = r5.f135180a
                    r2 = r6
                    tk.c r2 = (tk.c) r2
                    java.lang.Object r2 = r2.a()
                    ej.C r2 = (ej.ShoppingCart) r2
                    if (r2 == 0) goto L52
                    int r2 = r2.getTotalItems()
                    java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.d(r2)
                    goto L53
                L52:
                    r2 = 0
                L53:
                    hl.C$p r4 = hl.C14488C.p.f135199a
                    int r2 = xk.C18066d.b(r2, r4)
                    java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.d(r2)
                    r0.f135183c = r6
                    r0.f135185e = r0
                    r0.f135186f = r6
                    r0.f135187g = r7
                    r6 = 0
                    r0.f135188h = r6
                    r0.f135182b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L71
                    return r1
                L71:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hl.C14488C.n.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public n(InterfaceC17152f interfaceC17152f) {
            this.f135179a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super Integer> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f135179a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hl.C$o */
    public static final class o implements InterfaceC17152f<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f135189a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hl.C$o$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f135190a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$special$$inlined$map$3$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: hl.C$o$a$a, reason: collision with other inner class name */
            public static final class C2134a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f135191a;

                /* renamed from: b, reason: collision with root package name */
                int f135192b;

                /* renamed from: c, reason: collision with root package name */
                Object f135193c;

                /* renamed from: e, reason: collision with root package name */
                Object f135195e;

                /* renamed from: f, reason: collision with root package name */
                Object f135196f;

                /* renamed from: g, reason: collision with root package name */
                Object f135197g;

                /* renamed from: h, reason: collision with root package name */
                int f135198h;

                public C2134a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f135191a = obj;
                    this.f135192b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f135190a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof hl.C14488C.o.a.C2134a
                    if (r0 == 0) goto L13
                    r0 = r6
                    hl.C$o$a$a r0 = (hl.C14488C.o.a.C2134a) r0
                    int r1 = r0.f135192b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135192b = r1
                    goto L18
                L13:
                    hl.C$o$a$a r0 = new hl.C$o$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f135191a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f135192b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f135197g
                    tv.g r5 = (tv.InterfaceC17153g) r5
                    java.lang.Object r5 = r0.f135195e
                    hl.C$o$a$a r5 = (hl.C14488C.o.a.C2134a) r5
                    kotlin.ResultKt.b(r6)
                    goto L65
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    tv.g r6 = r4.f135190a
                    r2 = r5
                    tk.c r2 = (tk.c) r2
                    java.lang.Object r2 = r2.a()
                    com.meijer.mobile.cart.model.hybris.Cart r2 = (com.meijer.mobile.cart.model.hybris.Cart) r2
                    if (r2 == 0) goto L4f
                    java.lang.String r2 = r2.getCode()
                    if (r2 != 0) goto L51
                L4f:
                    java.lang.String r2 = "-1"
                L51:
                    r0.f135193c = r5
                    r0.f135195e = r0
                    r0.f135196f = r5
                    r0.f135197g = r6
                    r5 = 0
                    r0.f135198h = r5
                    r0.f135192b = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L65
                    return r1
                L65:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: hl.C14488C.o.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public o(InterfaceC17152f interfaceC17152f) {
            this.f135189a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super String> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f135189a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cart o(Cart cart) {
        return cart;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cart p(Cart cart) {
        return cart;
    }

    @Override // hl.InterfaceC14494f
    public Object e(boolean z10, boolean z11, Continuation<? super Unit> continuation) {
        Object objN = n(this, false, z10, z11, continuation, 1, null);
        return objN == IntrinsicsKt.f() ? objN : Unit.f142422a;
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hl.C$h */
    static final class h implements Function1<Cart, ShoppingCart> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f135153a = new h();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShoppingCart invoke(Cart cart) {
            if (cart != null) {
                return C14978b.d(cart, null, 1, null);
            }
            return null;
        }

        h() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hl.C$i */
    static final class i implements Function1<Cart, ShoppingCart> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f135154a = new i();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShoppingCart invoke(Cart cart) {
            if (cart != null) {
                return C14978b.d(cart, null, 1, null);
            }
            return null;
        }

        i() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hl.C$p */
    static final class p implements Function0<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f135199a = new p();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return 0;
        }

        p() {
        }
    }

    public C14488C(Tq.j storeProvider, Cs.b userProvider, C16793b cartDataSource, C14490b cartEntriesRepository) {
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(cartDataSource, "cartDataSource");
        Intrinsics.j(cartEntriesRepository, "cartEntriesRepository");
        this.storeProvider = storeProvider;
        this.userProvider = userProvider;
        this.cartDataSource = cartDataSource;
        this.cartEntriesRepository = cartEntriesRepository;
        this.mutex = Av.g.b(false, 1, null);
        this._cartFlow = S.a(null);
    }

    public static /* synthetic */ Object n(C14488C c14488c, boolean z10, boolean z11, boolean z12, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        return c14488c.m(z10, z11, z12, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fd, code lost:
    
        if (r0 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(boolean r14, boolean r15, boolean r16, kotlin.coroutines.Continuation<? super com.meijer.mobile.cart.model.hybris.Cart> r17) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.C14488C.m(boolean, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC17152f<tk.c<Cart>> q() throws InterruptedException {
        C16646j.b(null, new c(null), 1, null);
        return C17154h.O(C17154h.z(this._cartFlow), new d(null));
    }

    @Override // hl.InterfaceC14494f
    public void reset() {
        InterfaceC17140B<tk.c<Cart>> interfaceC17140B = this._cartFlow;
        while (!interfaceC17140B.e(interfaceC17140B.getValue(), new c.Success(null))) {
        }
    }

    /* renamed from: u, reason: from getter */
    public final Cs.b getUserProvider() {
        return this.userProvider;
    }

    public final void v(tk.c<Cart> cartRes) {
        Intrinsics.j(cartRes, "cartRes");
        InterfaceC17140B<tk.c<Cart>> interfaceC17140B = this._cartFlow;
        while (!interfaceC17140B.e(interfaceC17140B.getValue(), cartRes)) {
        }
    }

    public final void w(Throwable throwable) {
        tk.c<Cart> value;
        Intrinsics.j(throwable, "throwable");
        InterfaceC17140B<tk.c<Cart>> interfaceC17140B = this._cartFlow;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, tk.e.g(value, throwable)));
    }

    public final void x() {
        tk.c<Cart> value;
        InterfaceC17140B<tk.c<Cart>> interfaceC17140B = this._cartFlow;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, tk.e.e(value)));
    }

    @Override // hl.InterfaceC14494f
    public InterfaceC17152f<Integer> b() {
        return C17154h.r(new n(d()));
    }

    @Override // hl.InterfaceC14494f
    public io.reactivex.l<tk.c<ShoppingCart>> c() {
        return xv.h.d(d(), null, 1, null);
    }

    @Override // hl.InterfaceC14494f
    public InterfaceC17152f<tk.c<ShoppingCart>> d() {
        return C17154h.e0(new m(q()), new l(null, this));
    }

    public InterfaceC17152f<tk.c<PointOfService>> l() {
        return new e(d());
    }

    public io.reactivex.l<String> r() {
        return xv.h.d(s(), null, 1, null);
    }

    public InterfaceC17152f<String> s() {
        return C17154h.r(new o(q()));
    }

    public io.reactivex.l<Integer> t() {
        return xv.h.d(b(), null, 1, null);
    }
}
