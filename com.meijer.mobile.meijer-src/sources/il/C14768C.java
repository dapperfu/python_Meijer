package il;

import Co.ProductFullDetails;
import Tq.PointOfService;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.cart.model.hybris.Cart;
import com.meijer.mobile.cart.model.hybris.EntryJson;
import fj.Entry;
import fj.ShoppingCart;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj.C15212b;
import kj.C15217g;
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
import mv.C15807j;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.S;
import sj.C17078b;
import uk.c;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0011H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\rH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\r0\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0010R&\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\r0;8VX\u0097\u0004¢\u0006\f\u0012\u0004\b>\u0010\u001d\u001a\u0004\b*\u0010=R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0010R \u0010D\u001a\b\u0012\u0004\u0012\u00020A0;8VX\u0097\u0004¢\u0006\f\u0012\u0004\bC\u0010\u001d\u001a\u0004\bB\u0010=R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020A0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0010R$\u0010J\u001a\f\u0012\b\u0012\u00060Fj\u0002`G0;8VX\u0097\u0004¢\u0006\f\u0012\u0004\bI\u0010\u001d\u001a\u0004\bH\u0010=R\u001e\u0010L\u001a\f\u0012\b\u0012\u00060Fj\u0002`G0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0010¨\u0006M"}, d2 = {"Lil/C;", "Lil/f;", "LTq/j;", "storeProvider", "LCs/b;", "userProvider", "Lsj/b;", "cartDataSource", "Lil/b;", "cartEntriesRepository", "<init>", "(LTq/j;LCs/b;Lsj/b;Lil/b;)V", "Lpv/f;", "Luk/c;", "LTq/c;", "l", "()Lpv/f;", "", "setLoading", "calculateLightningCart", "retainOutOfStockItems", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "m", "(ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCalculate", "", "d", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "()V", "x", "cartRes", "v", "(Luk/c;)V", "", "throwable", "w", "(Ljava/lang/Throwable;)V", "a", "LTq/j;", "getStoreProvider", "()LTq/j;", "b", "LCs/b;", "u", "()LCs/b;", "c", "Lsj/b;", "Lil/b;", "Lwv/a;", "e", "Lwv/a;", "mutex", "Lpv/B;", "f", "Lpv/B;", "_cartFlow", "q", "cartFlow", "Lio/reactivex/l;", "Lfj/C;", "()Lio/reactivex/l;", "getShoppingCartStream$annotations", "shoppingCartStream", "shoppingCartFlow", "", "t", "getTotalItemCountStream$annotations", "totalItemCountStream", "totalItemCountFlow", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "r", "getCartId$annotations", "cartId", "s", "cartIdFlow", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: il.C, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14768C implements InterfaceC14774f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C17078b cartDataSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C14770b cartEntriesRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<uk.c<Cart>> _cartFlow;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: il.C$a */
    public static final class a implements InterfaceC16561f<Pair<? extends uk.c<ShoppingCart>, ? extends Instant>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f137730a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: il.C$a$a, reason: collision with other inner class name */
        public static final class C2171a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f137731a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$_get_shoppingCartFlow_$lambda$3$$inlined$map$1$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: il.C$a$a$a, reason: collision with other inner class name */
            public static final class C2172a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f137732a;

                /* renamed from: b, reason: collision with root package name */
                int f137733b;

                /* renamed from: c, reason: collision with root package name */
                Object f137734c;

                /* renamed from: e, reason: collision with root package name */
                Object f137736e;

                /* renamed from: f, reason: collision with root package name */
                Object f137737f;

                /* renamed from: g, reason: collision with root package name */
                Object f137738g;

                /* renamed from: h, reason: collision with root package name */
                int f137739h;

                public C2172a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f137732a = obj;
                    this.f137733b |= Integer.MIN_VALUE;
                    return C2171a.this.emit(null, this);
                }
            }

            public C2171a(InterfaceC16562g interfaceC16562g) {
                this.f137731a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof il.C14768C.a.C2171a.C2172a
                    if (r0 == 0) goto L13
                    r0 = r7
                    il.C$a$a$a r0 = (il.C14768C.a.C2171a.C2172a) r0
                    int r1 = r0.f137733b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f137733b = r1
                    goto L18
                L13:
                    il.C$a$a$a r0 = new il.C$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f137732a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f137733b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f137738g
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r6 = r0.f137736e
                    il.C$a$a$a r6 = (il.C14768C.a.C2171a.C2172a) r6
                    kotlin.ResultKt.b(r7)
                    goto L63
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f137731a
                    r2 = r6
                    uk.c r2 = (uk.c) r2
                    il.C$i r4 = il.C14768C.i.f137794a
                    uk.c r2 = uk.e.f(r2, r4)
                    j$.time.Instant r4 = j$.time.Instant.now()
                    kotlin.Pair r2 = kotlin.TuplesKt.a(r2, r4)
                    r0.f137734c = r6
                    r0.f137736e = r0
                    r0.f137737f = r6
                    r0.f137738g = r7
                    r6 = 0
                    r0.f137739h = r6
                    r0.f137733b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L63
                    return r1
                L63:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: il.C14768C.a.C2171a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC16561f interfaceC16561f) {
            this.f137730a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super Pair<? extends uk.c<ShoppingCart>, ? extends Instant>> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f137730a.collect(new C2171a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: il.C$b */
    public static final class b implements InterfaceC16561f<Pair<? extends Integer, ? extends Instant>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f137740a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: il.C$b$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f137741a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$_get_shoppingCartFlow_$lambda$3$$inlined$map$2$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: il.C$b$a$a, reason: collision with other inner class name */
            public static final class C2173a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f137742a;

                /* renamed from: b, reason: collision with root package name */
                int f137743b;

                /* renamed from: c, reason: collision with root package name */
                Object f137744c;

                /* renamed from: e, reason: collision with root package name */
                Object f137746e;

                /* renamed from: f, reason: collision with root package name */
                Object f137747f;

                /* renamed from: g, reason: collision with root package name */
                Object f137748g;

                /* renamed from: h, reason: collision with root package name */
                int f137749h;

                public C2173a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f137742a = obj;
                    this.f137743b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f137741a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof il.C14768C.b.a.C2173a
                    if (r0 == 0) goto L13
                    r0 = r7
                    il.C$b$a$a r0 = (il.C14768C.b.a.C2173a) r0
                    int r1 = r0.f137743b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f137743b = r1
                    goto L18
                L13:
                    il.C$b$a$a r0 = new il.C$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f137742a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f137743b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f137748g
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r6 = r0.f137746e
                    il.C$b$a$a r6 = (il.C14768C.b.a.C2173a) r6
                    kotlin.ResultKt.b(r7)
                    goto L65
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f137741a
                    r2 = r6
                    java.lang.Number r2 = (java.lang.Number) r2
                    int r2 = r2.intValue()
                    java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.d(r2)
                    j$.time.Instant r4 = j$.time.Instant.now()
                    kotlin.Pair r2 = kotlin.TuplesKt.a(r2, r4)
                    r0.f137744c = r6
                    r0.f137746e = r0
                    r0.f137747f = r6
                    r0.f137748g = r7
                    r6 = 0
                    r0.f137749h = r6
                    r0.f137743b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L65
                    return r1
                L65:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: il.C14768C.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC16561f interfaceC16561f) {
            this.f137740a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super Pair<? extends Integer, ? extends Instant>> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f137740a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$cartFlow$1", f = "ShoppingCartProvider.kt", l = {354, 105}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: il.C$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f137750a;

        /* renamed from: b, reason: collision with root package name */
        Object f137751b;

        /* renamed from: c, reason: collision with root package name */
        Object f137752c;

        /* renamed from: d, reason: collision with root package name */
        Object f137753d;

        /* renamed from: e, reason: collision with root package name */
        Object f137754e;

        /* renamed from: f, reason: collision with root package name */
        Object f137755f;

        /* renamed from: g, reason: collision with root package name */
        int f137756g;

        /* renamed from: h, reason: collision with root package name */
        int f137757h;

        /* renamed from: i, reason: collision with root package name */
        int f137758i;

        /* renamed from: j, reason: collision with root package name */
        int f137759j;

        /* renamed from: k, reason: collision with root package name */
        int f137760k;

        /* renamed from: l, reason: collision with root package name */
        int f137761l;

        /* renamed from: m, reason: collision with root package name */
        int f137762m;

        /* renamed from: n, reason: collision with root package name */
        private /* synthetic */ Object f137763n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C14768C.this.new c(continuation);
            cVar.f137763n = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
        
            if (il.C14768C.n(r6, false, false, false, r13, 7, null) == r0) goto L27;
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
        /* JADX WARN: Type inference failed for: r1v2, types: [wv.a] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v3, types: [wv.a] */
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
            throw new UnsupportedOperationException("Method not decompiled: il.C14768C.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk/c;", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "cartRes", "", "<anonymous>", "(Luk/c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$cartFlow$2", f = "ShoppingCartProvider.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: il.C$d */
    static final class d extends SuspendLambda implements Function2<uk.c<Cart>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f137765a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f137766b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C14768C.this.new d(continuation);
            dVar.f137766b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(uk.c<Cart> cVar, Continuation<? super Unit> continuation) {
            return ((d) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<? extends nk.i> listM;
            List<EntryJson> listV;
            IntrinsicsKt.f();
            if (this.f137765a == 0) {
                ResultKt.b(obj);
                uk.c cVar = (uk.c) this.f137766b;
                C14770b c14770b = C14768C.this.cartEntriesRepository;
                Cart cart = (Cart) cVar.a();
                if (cart != null && (listV = cart.v()) != null) {
                    List<EntryJson> list = listV;
                    listM = new ArrayList<>(CollectionsKt.x(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        listM.add(C15217g.b((EntryJson) it.next()));
                    }
                } else {
                    listM = null;
                }
                if (listM == null) {
                    listM = CollectionsKt.m();
                }
                c14770b.g(listM);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: il.C$e */
    public static final class e implements InterfaceC16561f<uk.c<PointOfService>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f137768a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: il.C$e$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f137769a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$cartStoreFlow$$inlined$map$1$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: il.C$e$a$a, reason: collision with other inner class name */
            public static final class C2174a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f137770a;

                /* renamed from: b, reason: collision with root package name */
                int f137771b;

                /* renamed from: c, reason: collision with root package name */
                Object f137772c;

                /* renamed from: e, reason: collision with root package name */
                Object f137774e;

                /* renamed from: f, reason: collision with root package name */
                Object f137775f;

                /* renamed from: g, reason: collision with root package name */
                Object f137776g;

                /* renamed from: h, reason: collision with root package name */
                int f137777h;

                public C2174a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f137770a = obj;
                    this.f137771b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f137769a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof il.C14768C.e.a.C2174a
                    if (r0 == 0) goto L13
                    r0 = r7
                    il.C$e$a$a r0 = (il.C14768C.e.a.C2174a) r0
                    int r1 = r0.f137771b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f137771b = r1
                    goto L18
                L13:
                    il.C$e$a$a r0 = new il.C$e$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f137770a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f137771b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f137776g
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r6 = r0.f137774e
                    il.C$e$a$a r6 = (il.C14768C.e.a.C2174a) r6
                    kotlin.ResultKt.b(r7)
                    goto L5b
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f137769a
                    r2 = r6
                    uk.c r2 = (uk.c) r2
                    il.C$f r4 = il.C14768C.f.f137778a
                    uk.c r2 = uk.e.f(r2, r4)
                    r0.f137772c = r6
                    r0.f137774e = r0
                    r0.f137775f = r6
                    r0.f137776g = r7
                    r6 = 0
                    r0.f137777h = r6
                    r0.f137771b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L5b
                    return r1
                L5b:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: il.C14768C.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(InterfaceC16561f interfaceC16561f) {
            this.f137768a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super uk.c<PointOfService>> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f137768a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: il.C$f */
    static final class f implements Function1<ShoppingCart, PointOfService> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f137778a = new f();

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
    /* renamed from: il.C$g */
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f137779a;

        /* renamed from: b, reason: collision with root package name */
        boolean f137780b;

        /* renamed from: c, reason: collision with root package name */
        boolean f137781c;

        /* renamed from: d, reason: collision with root package name */
        Object f137782d;

        /* renamed from: e, reason: collision with root package name */
        Object f137783e;

        /* renamed from: f, reason: collision with root package name */
        Object f137784f;

        /* renamed from: g, reason: collision with root package name */
        Object f137785g;

        /* renamed from: h, reason: collision with root package name */
        int f137786h;

        /* renamed from: i, reason: collision with root package name */
        int f137787i;

        /* renamed from: j, reason: collision with root package name */
        int f137788j;

        /* renamed from: k, reason: collision with root package name */
        int f137789k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f137790l;

        /* renamed from: n, reason: collision with root package name */
        int f137792n;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f137790l = obj;
            this.f137792n |= Integer.MIN_VALUE;
            return C14768C.this.m(false, false, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "Lkotlin/Pair;", "", "j$/time/Instant", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$shoppingCartFlow$2$3", f = "ShoppingCartProvider.kt", l = {149}, m = "invokeSuspend")
    /* renamed from: il.C$j */
    static final class j extends SuspendLambda implements Function2<InterfaceC16562g<? super Pair<? extends Integer, ? extends Instant>>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f137795a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f137796b;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(continuation);
            jVar.f137796b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Pair<Integer, Instant>> interfaceC16562g, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f137795a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f137796b;
                Pair pairA = TuplesKt.a(Boxing.d(-1), Instant.MIN);
                this.f137796b = interfaceC16562g;
                this.f137795a = 1;
                if (interfaceC16562g.emit(pairA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012 \u0010\u0005\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/Pair;", "Luk/c;", "Lfj/C;", "j$/time/Instant", "kotlin.jvm.PlatformType", "<destruct>", "Lil/z;", "unconfirmedChanges", "", "<anonymous>", "(Lkotlin/Pair;Lil/z;Lkotlin/Pair;)Luk/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$shoppingCartFlow$2$4", f = "ShoppingCartProvider.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: il.C$k */
    static final class k extends SuspendLambda implements Function4<Pair<? extends uk.c<ShoppingCart>, ? extends Instant>, ProductChangeRequest, Pair<? extends Integer, ? extends Instant>, Continuation<? super uk.c<ShoppingCart>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f137797a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f137798b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f137799c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f137800d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: il.C$k$a */
        static final class a implements Function1<ShoppingCart, ShoppingCart> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<Entry> f137801a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Instant f137802b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Instant f137803c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f137804d;

            a(List<Entry> list, Instant instant, Instant instant2, int i10) {
                this.f137801a = list;
                this.f137802b = instant;
                this.f137803c = instant2;
                this.f137804d = i10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShoppingCart invoke(ShoppingCart shoppingCart) {
                if (shoppingCart != null) {
                    return shoppingCart.a((2147483645 & 1) != 0 ? shoppingCart.code : null, (2147483645 & 2) != 0 ? shoppingCart.entries : CollectionsKt.j1(MapsKt.u(nk.k.a(shoppingCart.p()), nk.k.a(this.f137801a)).values()), (2147483645 & 4) != 0 ? shoppingCart.customerData : null, (2147483645 & 8) != 0 ? shoppingCart.outOfStockEntries : null, (2147483645 & 16) != 0 ? shoppingCart.pointOfService : null, (2147483645 & 32) != 0 ? shoppingCart.substitutePreference : null, (2147483645 & 64) != 0 ? shoppingCart.deliveryMode : null, (2147483645 & 128) != 0 ? shoppingCart.deliveryAddress : null, (2147483645 & 256) != 0 ? shoppingCart.extendedDeliveryCost : null, (2147483645 & 512) != 0 ? shoppingCart.paymentInfo : null, (2147483645 & 1024) != 0 ? shoppingCart.selectedPaymentOption : null, (2147483645 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingCart.multiTenderPaymentInfo : null, (2147483645 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingCart.pickUpPerson : null, (2147483645 & 8192) != 0 ? shoppingCart.pickUpSlotInfo : null, (2147483645 & 16384) != 0 ? shoppingCart.specialSavings : null, (2147483645 & 32768) != 0 ? shoppingCart.mperksSavings : null, (2147483645 & 65536) != 0 ? shoppingCart.couponsSavings : null, (2147483645 & 131072) != 0 ? shoppingCart.teamMemberSavings : null, (2147483645 & 262144) != 0 ? shoppingCart.totalSavings : null, (2147483645 & 524288) != 0 ? shoppingCart.productDiscounts : null, (2147483645 & 1048576) != 0 ? shoppingCart.orderDiscounts : null, (2147483645 & 2097152) != 0 ? shoppingCart.depositPrice : null, (2147483645 & 4194304) != 0 ? shoppingCart.deliveryCost : null, (2147483645 & 8388608) != 0 ? shoppingCart.subTotal : null, (2147483645 & 16777216) != 0 ? shoppingCart.totalDiscounts : null, (2147483645 & 33554432) != 0 ? shoppingCart.itemsTotal : null, (2147483645 & 67108864) != 0 ? shoppingCart.totalCosts : null, (2147483645 & 134217728) != 0 ? shoppingCart.totalPrice : null, (2147483645 & 268435456) != 0 ? shoppingCart.totalTax : null, (2147483645 & 536870912) != 0 ? shoppingCart.totalPriceWithTax : null, (2147483645 & 1073741824) != 0 ? shoppingCart.creditTransactionAmount : null, (2147483645 & Integer.MIN_VALUE) != 0 ? shoppingCart.totalItems : this.f137802b.isAfter(this.f137803c) ? this.f137804d : shoppingCart.getTotalItems(), (16383 & 1) != 0 ? shoppingCart.tippedAndRated : false, (16383 & 2) != 0 ? shoppingCart.originalOrderId : null, (16383 & 4) != 0 ? shoppingCart.isEditingDryOrder : false, (16383 & 8) != 0 ? shoppingCart.deliveryAddressIsAlcoholEligible : false, (16383 & 16) != 0 ? shoppingCart.highValuePromos : null, (16383 & 32) != 0 ? shoppingCart.earlyDeliveryAvailable : false, (16383 & 64) != 0 ? shoppingCart.promoCodeMessage : null, (16383 & 128) != 0 ? shoppingCart.fulfillmentEligibility : null, (16383 & 256) != 0 ? shoppingCart.partnerEligibility : null, (16383 & 512) != 0 ? shoppingCart.availableFulfillmentEligibilities : null, (16383 & 1024) != 0 ? shoppingCart.ebtEligibleTotal : null, (16383 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingCart.ebtNonEligibleTotal : null, (16383 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingCart.ebtSurchargePrice : null, (16383 & 8192) != 0 ? shoppingCart.ebtSuggestedTotal : null);
                }
                return null;
            }
        }

        k(Continuation<? super k> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair<? extends uk.c<ShoppingCart>, Instant> pair, ProductChangeRequest zVar, Pair<Integer, Instant> pair2, Continuation<? super uk.c<ShoppingCart>> continuation) {
            k kVar = new k(continuation);
            kVar.f137798b = pair;
            kVar.f137799c = zVar;
            kVar.f137800d = pair2;
            return kVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f137797a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Pair pair = (Pair) this.f137798b;
            ProductChangeRequest zVar = (ProductChangeRequest) this.f137799c;
            Pair pair2 = (Pair) this.f137800d;
            uk.c cVar = (uk.c) pair.a();
            Instant instant = (Instant) pair.b();
            int iIntValue = ((Number) pair2.a()).intValue();
            Instant instant2 = (Instant) pair2.b();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(zVar, 10));
            for (nk.i iVar : zVar) {
                Entry entry = iVar instanceof Entry ? (Entry) iVar : null;
                if (entry == null) {
                    nk.f fVarM = iVar.getProduct();
                    ProductFullDetails productFullDetails = fVarM instanceof ProductFullDetails ? (ProductFullDetails) fVarM : null;
                    entry = new Entry(0, productFullDetails == null ? new ProductFullDetails(iVar.g2(), null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -2, 268435455, null) : productFullDetails, 0.0d, iVar.getQuantity(), 0.0d, null, null, null, null, null, null, null, null, null, false, 32753, null);
                }
                arrayList.add(entry);
            }
            return uk.e.f(cVar, new a(arrayList, instant2, instant, iIntValue));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lpv/g;", "it", "", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$special$$inlined$flatMapLatest$1", f = "ShoppingCartProvider.kt", l = {189}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: il.C$l */
    public static final class l extends SuspendLambda implements Function3<InterfaceC16562g<? super uk.c<ShoppingCart>>, uk.c<ShoppingCart>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f137805a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f137806b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f137807c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C14768C f137808d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Continuation continuation, C14768C c14768c) {
            super(3, continuation);
            this.f137808d = c14768c;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super uk.c<ShoppingCart>> interfaceC16562g, uk.c<ShoppingCart> cVar, Continuation<? super Unit> continuation) {
            l lVar = new l(continuation, this.f137808d);
            lVar.f137806b = interfaceC16562g;
            lVar.f137807c = cVar;
            return lVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f137805a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f137806b;
                Object obj2 = this.f137807c;
                InterfaceC16561f interfaceC16561fR = C16563h.r(C16563h.m(new a(this.f137808d.q()), this.f137808d.cartEntriesRepository.j(), C16563h.P(new b(this.f137808d.cartEntriesRepository.i()), new j(null)), new k(null)));
                this.f137806b = interfaceC16562g;
                this.f137807c = obj2;
                this.f137805a = 1;
                if (C16563h.x(interfaceC16562g, interfaceC16561fR, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: il.C$m */
    public static final class m implements InterfaceC16561f<uk.c<ShoppingCart>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f137809a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: il.C$m$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f137810a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$special$$inlined$map$1$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: il.C$m$a$a, reason: collision with other inner class name */
            public static final class C2175a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f137811a;

                /* renamed from: b, reason: collision with root package name */
                int f137812b;

                /* renamed from: c, reason: collision with root package name */
                Object f137813c;

                /* renamed from: e, reason: collision with root package name */
                Object f137815e;

                /* renamed from: f, reason: collision with root package name */
                Object f137816f;

                /* renamed from: g, reason: collision with root package name */
                Object f137817g;

                /* renamed from: h, reason: collision with root package name */
                int f137818h;

                public C2175a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f137811a = obj;
                    this.f137812b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f137810a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof il.C14768C.m.a.C2175a
                    if (r0 == 0) goto L13
                    r0 = r7
                    il.C$m$a$a r0 = (il.C14768C.m.a.C2175a) r0
                    int r1 = r0.f137812b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f137812b = r1
                    goto L18
                L13:
                    il.C$m$a$a r0 = new il.C$m$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f137811a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f137812b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f137817g
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r6 = r0.f137815e
                    il.C$m$a$a r6 = (il.C14768C.m.a.C2175a) r6
                    kotlin.ResultKt.b(r7)
                    goto L5b
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f137810a
                    r2 = r6
                    uk.c r2 = (uk.c) r2
                    il.C$h r4 = il.C14768C.h.f137793a
                    uk.c r2 = uk.e.f(r2, r4)
                    r0.f137813c = r6
                    r0.f137815e = r0
                    r0.f137816f = r6
                    r0.f137817g = r7
                    r6 = 0
                    r0.f137818h = r6
                    r0.f137812b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L5b
                    return r1
                L5b:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: il.C14768C.m.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public m(InterfaceC16561f interfaceC16561f) {
            this.f137809a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super uk.c<ShoppingCart>> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f137809a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: il.C$n */
    public static final class n implements InterfaceC16561f<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f137819a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: il.C$n$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f137820a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$special$$inlined$map$2$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: il.C$n$a$a, reason: collision with other inner class name */
            public static final class C2176a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f137821a;

                /* renamed from: b, reason: collision with root package name */
                int f137822b;

                /* renamed from: c, reason: collision with root package name */
                Object f137823c;

                /* renamed from: e, reason: collision with root package name */
                Object f137825e;

                /* renamed from: f, reason: collision with root package name */
                Object f137826f;

                /* renamed from: g, reason: collision with root package name */
                Object f137827g;

                /* renamed from: h, reason: collision with root package name */
                int f137828h;

                public C2176a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f137821a = obj;
                    this.f137822b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f137820a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof il.C14768C.n.a.C2176a
                    if (r0 == 0) goto L13
                    r0 = r7
                    il.C$n$a$a r0 = (il.C14768C.n.a.C2176a) r0
                    int r1 = r0.f137822b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f137822b = r1
                    goto L18
                L13:
                    il.C$n$a$a r0 = new il.C$n$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f137821a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f137822b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f137827g
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r6 = r0.f137825e
                    il.C$n$a$a r6 = (il.C14768C.n.a.C2176a) r6
                    kotlin.ResultKt.b(r7)
                    goto L71
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f137820a
                    r2 = r6
                    uk.c r2 = (uk.c) r2
                    java.lang.Object r2 = r2.a()
                    fj.C r2 = (fj.ShoppingCart) r2
                    if (r2 == 0) goto L52
                    int r2 = r2.getTotalItems()
                    java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.d(r2)
                    goto L53
                L52:
                    r2 = 0
                L53:
                    il.C$p r4 = il.C14768C.p.f137839a
                    int r2 = yk.C18328d.b(r2, r4)
                    java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.d(r2)
                    r0.f137823c = r6
                    r0.f137825e = r0
                    r0.f137826f = r6
                    r0.f137827g = r7
                    r6 = 0
                    r0.f137828h = r6
                    r0.f137822b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L71
                    return r1
                L71:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: il.C14768C.n.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public n(InterfaceC16561f interfaceC16561f) {
            this.f137819a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super Integer> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f137819a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: il.C$o */
    public static final class o implements InterfaceC16561f<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f137829a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: il.C$o$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f137830a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.ShoppingCartProvider$special$$inlined$map$3$2", f = "ShoppingCartProvider.kt", l = {50}, m = "emit")
            /* renamed from: il.C$o$a$a, reason: collision with other inner class name */
            public static final class C2177a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f137831a;

                /* renamed from: b, reason: collision with root package name */
                int f137832b;

                /* renamed from: c, reason: collision with root package name */
                Object f137833c;

                /* renamed from: e, reason: collision with root package name */
                Object f137835e;

                /* renamed from: f, reason: collision with root package name */
                Object f137836f;

                /* renamed from: g, reason: collision with root package name */
                Object f137837g;

                /* renamed from: h, reason: collision with root package name */
                int f137838h;

                public C2177a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f137831a = obj;
                    this.f137832b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f137830a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof il.C14768C.o.a.C2177a
                    if (r0 == 0) goto L13
                    r0 = r6
                    il.C$o$a$a r0 = (il.C14768C.o.a.C2177a) r0
                    int r1 = r0.f137832b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f137832b = r1
                    goto L18
                L13:
                    il.C$o$a$a r0 = new il.C$o$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f137831a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f137832b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f137837g
                    pv.g r5 = (pv.InterfaceC16562g) r5
                    java.lang.Object r5 = r0.f137835e
                    il.C$o$a$a r5 = (il.C14768C.o.a.C2177a) r5
                    kotlin.ResultKt.b(r6)
                    goto L65
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    pv.g r6 = r4.f137830a
                    r2 = r5
                    uk.c r2 = (uk.c) r2
                    java.lang.Object r2 = r2.a()
                    com.meijer.mobile.cart.model.hybris.Cart r2 = (com.meijer.mobile.cart.model.hybris.Cart) r2
                    if (r2 == 0) goto L4f
                    java.lang.String r2 = r2.getCode()
                    if (r2 != 0) goto L51
                L4f:
                    java.lang.String r2 = "-1"
                L51:
                    r0.f137833c = r5
                    r0.f137835e = r0
                    r0.f137836f = r5
                    r0.f137837g = r6
                    r5 = 0
                    r0.f137838h = r5
                    r0.f137832b = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L65
                    return r1
                L65:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: il.C14768C.o.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public o(InterfaceC16561f interfaceC16561f) {
            this.f137829a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super String> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f137829a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
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

    @Override // il.InterfaceC14774f
    public Object d(boolean z10, boolean z11, Continuation<? super Unit> continuation) {
        Object objN = n(this, false, z10, z11, continuation, 1, null);
        return objN == IntrinsicsKt.f() ? objN : Unit.f143329a;
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: il.C$h */
    static final class h implements Function1<Cart, ShoppingCart> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f137793a = new h();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShoppingCart invoke(Cart cart) {
            if (cart != null) {
                return C15212b.d(cart, null, 1, null);
            }
            return null;
        }

        h() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: il.C$i */
    static final class i implements Function1<Cart, ShoppingCart> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f137794a = new i();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShoppingCart invoke(Cart cart) {
            if (cart != null) {
                return C15212b.d(cart, null, 1, null);
            }
            return null;
        }

        i() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: il.C$p */
    static final class p implements Function0<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f137839a = new p();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return 0;
        }

        p() {
        }
    }

    public C14768C(Tq.j storeProvider, Cs.b userProvider, C17078b cartDataSource, C14770b cartEntriesRepository) {
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(cartDataSource, "cartDataSource");
        Intrinsics.j(cartEntriesRepository, "cartEntriesRepository");
        this.storeProvider = storeProvider;
        this.userProvider = userProvider;
        this.cartDataSource = cartDataSource;
        this.cartEntriesRepository = cartEntriesRepository;
        this.mutex = wv.g.b(false, 1, null);
        this._cartFlow = S.a(null);
    }

    public static /* synthetic */ Object n(C14768C c14768c, boolean z10, boolean z11, boolean z12, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        return c14768c.m(z10, z11, z12, continuation);
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
        throw new UnsupportedOperationException("Method not decompiled: il.C14768C.m(boolean, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC16561f<uk.c<Cart>> q() throws InterruptedException {
        C15807j.b(null, new c(null), 1, null);
        return C16563h.O(C16563h.z(this._cartFlow), new d(null));
    }

    @Override // il.InterfaceC14774f
    public void reset() {
        InterfaceC16549B<uk.c<Cart>> interfaceC16549B = this._cartFlow;
        while (!interfaceC16549B.e(interfaceC16549B.getValue(), new c.Success(null))) {
        }
    }

    /* renamed from: u, reason: from getter */
    public final Cs.b getUserProvider() {
        return this.userProvider;
    }

    public final void v(uk.c<Cart> cartRes) {
        Intrinsics.j(cartRes, "cartRes");
        InterfaceC16549B<uk.c<Cart>> interfaceC16549B = this._cartFlow;
        while (!interfaceC16549B.e(interfaceC16549B.getValue(), cartRes)) {
        }
    }

    public final void w(Throwable throwable) {
        uk.c<Cart> value;
        Intrinsics.j(throwable, "throwable");
        InterfaceC16549B<uk.c<Cart>> interfaceC16549B = this._cartFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, uk.e.g(value, throwable)));
    }

    public final void x() {
        uk.c<Cart> value;
        InterfaceC16549B<uk.c<Cart>> interfaceC16549B = this._cartFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, uk.e.e(value)));
    }

    @Override // il.InterfaceC14774f
    public InterfaceC16561f<Integer> a() {
        return C16563h.r(new n(c()));
    }

    @Override // il.InterfaceC14774f
    public io.reactivex.l<uk.c<ShoppingCart>> b() {
        return tv.h.d(c(), null, 1, null);
    }

    @Override // il.InterfaceC14774f
    public InterfaceC16561f<uk.c<ShoppingCart>> c() {
        return C16563h.e0(new m(q()), new l(null, this));
    }

    public InterfaceC16561f<uk.c<PointOfService>> l() {
        return new e(c());
    }

    public io.reactivex.l<String> r() {
        return tv.h.d(s(), null, 1, null);
    }

    public InterfaceC16561f<String> s() {
        return C16563h.r(new o(q()));
    }

    public io.reactivex.l<Integer> t() {
        return tv.h.d(a(), null, 1, null);
    }
}
