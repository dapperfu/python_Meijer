package sp;

import Co.ProductFullDetails;
import Fq.FavoriteListStore;
import Fq.ShoppingListStore;
import Gp.ProductRatings;
import Ho.ProductSponsorship;
import Pk.Coupon;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.l;
import Xk.ProductComplexPromo;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import cr.SubscriptionDetails;
import dl.C13702d;
import dv.C13732b;
import fj.ShoppingCart;
import ir.C14846a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mv.AbstractC15779K;
import mv.InterfaceC15783O;
import qw.a;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b'\u0010%J\u0010\u0010)\u001a\u00020(H\u0087@¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0007¢\u0006\u0004\b+\u0010,J,\u00102\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010-H\u0086@¢\u0006\u0004\b2\u00103J5\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u000e2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR'\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR7\u0010]\u001a\u001e\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060-j\u0002`Y\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u001c0X0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010T\u001a\u0004\b\\\u0010VR'\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010T\u001a\u0004\b_\u0010VR'\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0\u001c0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010T\u001a\u0004\bc\u0010VR#\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0f0\u001c0e8F¢\u0006\u0006\u001a\u0004\bg\u0010hRP\u0010n\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020k l*\n\u0012\u0004\u0012\u00020k\u0018\u00010j0j l*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020k l*\n\u0012\u0004\u0012\u00020k\u0018\u00010j0j\u0018\u00010e0e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010hR8\u0010q\u001a&\u0012\f\u0012\n l*\u0004\u0018\u00010o0o l*\u0012\u0012\f\u0012\n l*\u0004\u0018\u00010o0o\u0018\u00010e0e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010hR8\u0010t\u001a&\u0012\f\u0012\n l*\u0004\u0018\u00010r0r l*\u0012\u0012\f\u0012\n l*\u0004\u0018\u00010r0r\u0018\u00010e0e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010hRP\u0010w\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020u l*\n\u0012\u0004\u0012\u00020u\u0018\u00010\u001c0\u001c l*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020u l*\n\u0012\u0004\u0012\u00020u\u0018\u00010\u001c0\u001c\u0018\u00010e0e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010hRP\u0010z\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020x l*\n\u0012\u0004\u0012\u00020x\u0018\u00010\u001c0\u001c l*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020x l*\n\u0012\u0004\u0012\u00020x\u0018\u00010\u001c0\u001c\u0018\u00010e0e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010hRh\u0010}\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020{ l*\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020{\u0018\u00010X0X l**\u0012$\u0012\"\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020{ l*\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020{\u0018\u00010X0X\u0018\u00010e0e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010hR&\u0010\u007f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0f0\u001c0e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010hR(\u0010\u0081\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0f0\u001c0e8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010h¨\u0006\u0082\u0001"}, d2 = {"Lsp/Y;", "", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "LEq/b;", "shoppingListRepository", "LEq/a;", "favoritesRepository", "Lil/m;", "cartRepository", "Ldl/d;", "couponsRepository", "LRo/c;", "productsRepository", "Lpp/d;", "productMetadataStore", "Lpp/e;", "sponsorshipsDataStore", "LKp/g;", "productReviewManager", "Lir/a;", "subscriptionsListRepository", "Lmv/K;", "ioDispatcher", "<init>", "(Lyo/k;LTq/j;LEq/b;LEq/a;Lil/m;Ldl/d;LRo/c;Lpp/d;Lpp/e;LKp/g;Lir/a;Lmv/K;)V", "", "LCo/h;", "list", "", "m1", "(Ljava/util/List;)V", "LQo/l;", "productQuery", "l1", "(LQo/l;)V", "j1", "i1", "LJu/b;", "F0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q0", "()LJu/b;", "", "query", "", "isDepartmentSearch", "filters", "d1", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "products", "criteoSponsoredProducts", "c1", "(LRo/c;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "a", "Lyo/k;", "b", "LTq/j;", "c", "LEq/b;", "d", "LEq/a;", "e", "Lil/m;", "f", "Ldl/d;", "g", "LRo/c;", "h", "Lpp/d;", "i", "Lpp/e;", "j", "LKp/g;", "k", "Lir/a;", "l", "Lmv/K;", "m", "LQo/l;", "LEk/n;", "n", "Lkotlin/Lazy;", "X0", "()LEk/n;", "productsStore", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "LXk/a;", "o", "R0", "complexPromosStore", "p", "U0", "criteoSponsoredProductStore", "LGp/c;", "q", "W0", "productRatingsStore", "Lio/reactivex/l;", "Lsp/b;", "Y0", "()Lio/reactivex/l;", "productsStream", "Luk/c;", "Lfj/C;", "kotlin.jvm.PlatformType", "Q0", "cartStream", "LFq/e;", "Z0", "shoppingListStream", "LFq/b;", "V0", "favoriteItemsStream", "Lcr/j;", "a1", "subscriptionsListStream", "LPk/a;", "T0", "couponsStream", "LQk/b;", "S0", "couponLoadingStatesStream", "P0", "authenticatedProductStream", "b1", "unauthProductsStream", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Eq.a favoritesRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final pp.d productMetadataStore;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final pp.e sponsorshipsDataStore;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Kp.g productReviewManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C14846a subscriptionsListRepository;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Qo.l productQuery;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy productsStore;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy complexPromosStore;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy criteoSponsoredProductStore;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Lazy productRatingsStore;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        a(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        b(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        c(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        d(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        e(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        f(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        g(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        h(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LXk/a;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.state.ProductStateRepository$enableComplexPromos$4$1", f = "ProductStateRepository.kt", l = {314}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ProductComplexPromo>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161587a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f161589c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ProductComplexPromo>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ProductComplexPromo>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ProductFullDetails productFullDetails, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f161589c = productFullDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Y.this.new i(this.f161589c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ProductComplexPromo>> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f161587a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Ro.c cVar = Y.this.productsRepository;
            String code = this.f161589c.getCode();
            this.f161587a = 1;
            Object objK = cVar.k(code, this);
            if (objK == objF) {
                return objF;
            }
            return objK;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        j(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LGp/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.state.ProductStateRepository$enableProductRatings$3$1", f = "ProductStateRepository.kt", l = {282}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ProductRatings>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161590a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ProductFullDetails> f161592c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ProductRatings>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ProductRatings>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(List<ProductFullDetails> list, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f161592c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Y.this.new k(this.f161592c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ProductRatings>> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f161590a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Kp.g gVar = Y.this.productReviewManager;
            List<ProductFullDetails> list = this.f161592c;
            Intrinsics.g(list);
            List<ProductFullDetails> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductFullDetails) it.next()).getCode());
            }
            this.f161590a = 1;
            Object objE = gVar.e(arrayList, this);
            if (objE == objF) {
                return objF;
            }
            return objE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        l(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.state.ProductStateRepository", f = "ProductStateRepository.kt", l = {336}, m = "mergeSponsoredProductsFromCriteo")
    static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f161593a;

        /* renamed from: b, reason: collision with root package name */
        Object f161594b;

        /* renamed from: c, reason: collision with root package name */
        Object f161595c;

        /* renamed from: d, reason: collision with root package name */
        boolean f161596d;

        /* renamed from: e, reason: collision with root package name */
        int f161597e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161598f;

        /* renamed from: h, reason: collision with root package name */
        int f161600h;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f161598f = obj;
            this.f161600h |= Integer.MIN_VALUE;
            return Y.this.d1(null, false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class n extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        n(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u000b\u0010\n\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "T1", "T2", "T3", "T4", "R", "t1", "t2", "t3", "t4", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class o<T1, T2, T3, T4, R> implements Lu.i<T1, T2, T3, T4, R> {
        public o() {
        }

        @Override // Lu.i
        public final R a(T1 t12, T2 t22, T3 t32, T4 t42) {
            List list = (List) t32;
            Y y10 = Y.this;
            Ro.c cVar = y10.productsRepository;
            return (R) C17117c.c(y10.c1(cVar, (List) t12, (List) t22), null, null, null, Y.this.storeProvider.a(), Y.this.productQuery, CollectionsKt.m(), null, null, list, (List) t42, null, 1216, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class p extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        p(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        q(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class r extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        r(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f1(List list, List it) {
        Intrinsics.j(it, "it");
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k1(List list, List it) {
        Intrinsics.j(it, "it");
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v0(Pair pair) {
        Intrinsics.j(pair, "<destruct>");
        return ((List) pair.b()) == null;
    }

    public Y(yo.k userManager, Tq.j storeProvider, Eq.b shoppingListRepository, Eq.a favoritesRepository, il.m cartRepository, C13702d couponsRepository, Ro.c productsRepository, pp.d productMetadataStore, pp.e sponsorshipsDataStore, Kp.g productReviewManager, C14846a subscriptionsListRepository, AbstractC15779K ioDispatcher) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(favoritesRepository, "favoritesRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(productMetadataStore, "productMetadataStore");
        Intrinsics.j(sponsorshipsDataStore, "sponsorshipsDataStore");
        Intrinsics.j(productReviewManager, "productReviewManager");
        Intrinsics.j(subscriptionsListRepository, "subscriptionsListRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.userManager = userManager;
        this.storeProvider = storeProvider;
        this.shoppingListRepository = shoppingListRepository;
        this.favoritesRepository = favoritesRepository;
        this.cartRepository = cartRepository;
        this.couponsRepository = couponsRepository;
        this.productsRepository = productsRepository;
        this.productMetadataStore = productMetadataStore;
        this.sponsorshipsDataStore = sponsorshipsDataStore;
        this.productReviewManager = productReviewManager;
        this.subscriptionsListRepository = subscriptionsListRepository;
        this.ioDispatcher = ioDispatcher;
        this.productsStore = LazyKt.b(new Function0() { // from class: sp.L
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y.h1();
            }
        });
        this.complexPromosStore = LazyKt.b(new Function0() { // from class: sp.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y.o0();
            }
        });
        this.criteoSponsoredProductStore = LazyKt.b(new Function0() { // from class: sp.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y.p0();
            }
        });
        this.productRatingsStore = LazyKt.b(new Function0() { // from class: sp.O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y.g1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.reactivex.y A0(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (io.reactivex.y) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map C0(ProductFullDetails productFullDetails, List list, Map oldMap) {
        Intrinsics.j(oldMap, "oldMap");
        return MapsKt.u(oldMap, MapsKt.g(TuplesKt.a(productFullDetails.getCode(), list)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List G0(Y y10, List products, List criteoSponsored) {
        Intrinsics.j(products, "products");
        Intrinsics.j(criteoSponsored, "criteoSponsored");
        return y10.c1(y10.productsRepository, products, criteoSponsored);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List H0(Function2 function2, Object p02, Object p12) {
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        return (List) function2.invoke(p02, p12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.reactivex.y I0(Y y10, List products) {
        Intrinsics.j(products, "products");
        if (!products.isEmpty()) {
            return tv.n.b(y10.ioDispatcher, y10.new k(products, null));
        }
        io.reactivex.u uVarI = io.reactivex.u.i(CollectionsKt.m());
        Intrinsics.g(uVarI);
        return uVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.reactivex.y J0(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (io.reactivex.y) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List L0(List list, List it) {
        Intrinsics.j(it, "it");
        return list == null ? CollectionsKt.m() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N0(Throwable th2) {
        qw.a.INSTANCE.f(th2, "Error in product ratings stream", new Object[0]);
        return Unit.f143329a;
    }

    private final io.reactivex.l<uk.c<ShoppingCart>> Q0() {
        io.reactivex.l<uk.c<ShoppingCart>> lVarB = this.cartRepository.b();
        final f fVar = new f(qw.a.INSTANCE);
        return lVarB.doOnError(new Lu.g() { // from class: sp.f
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.b0(fVar, obj);
            }
        });
    }

    private final Ek.n<Map<String, List<ProductComplexPromo>>> R0() {
        return (Ek.n) this.complexPromosStore.getValue();
    }

    private final io.reactivex.l<Map<String, Qk.b>> S0() {
        io.reactivex.l<Map<String, Qk.b>> lVarM = this.couponsRepository.m();
        final g gVar = new g(qw.a.INSTANCE);
        return lVarM.doOnError(new Lu.g() { // from class: sp.g
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.c0(gVar, obj);
            }
        });
    }

    private final io.reactivex.l<List<Coupon>> T0() {
        io.reactivex.l<List<Coupon>> lVarT = this.couponsRepository.t();
        final h hVar = new h(qw.a.INSTANCE);
        return lVarT.doOnError(new Lu.g() { // from class: sp.F
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.d0(hVar, obj);
            }
        });
    }

    private final Ek.n<List<ProductFullDetails>> U0() {
        return (Ek.n) this.criteoSponsoredProductStore.getValue();
    }

    private final io.reactivex.l<FavoriteListStore> V0() {
        io.reactivex.l lVarD = tv.h.d(this.favoritesRepository.f(), null, 1, null);
        final l lVar = new l(qw.a.INSTANCE);
        return lVarD.doOnError(new Lu.g() { // from class: sp.q
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.e0(lVar, obj);
            }
        });
    }

    private final Ek.n<List<ProductRatings>> W0() {
        return (Ek.n) this.productRatingsStore.getValue();
    }

    private final Ek.n<List<ProductFullDetails>> X0() {
        return (Ek.n) this.productsStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Z(Y y10, Object[] sources) {
        Intrinsics.j(sources, "sources");
        Object obj = sources[0];
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.product.model.fulldetails.ProductFullDetails>");
        Object obj2 = sources[1];
        Intrinsics.h(obj2, "null cannot be cast to non-null type com.meijer.mobile.shoppinglist.domain.models.ShoppingListStore");
        ShoppingListStore shoppingListStore = (ShoppingListStore) obj2;
        Object obj3 = sources[2];
        Intrinsics.h(obj3, "null cannot be cast to non-null type com.meijer.mobile.shoppinglist.domain.models.FavoriteListStore");
        FavoriteListStore favoriteListStore = (FavoriteListStore) obj3;
        Object obj4 = sources[3];
        Intrinsics.h(obj4, "null cannot be cast to non-null type com.meijer.mobile.core.util.content.Resource<com.meijer.mobile.cart.model.common.ShoppingCart>");
        Object obj5 = sources[4];
        Intrinsics.h(obj5, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.coupon.model.common.Coupon>");
        List list = (List) obj5;
        Object obj6 = sources[5];
        Intrinsics.h(obj6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.meijer.mobile.coupon.model.common.action.CouponActionLoadingState>");
        Map map = (Map) obj6;
        Object obj7 = sources[6];
        Intrinsics.h(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.collections.List<com.meijer.mobile.coupon.service.complexpromos.domain.models.ProductComplexPromo>>");
        Map map2 = (Map) obj7;
        Object obj8 = sources[7];
        Intrinsics.h(obj8, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.product.model.fulldetails.ProductFullDetails>");
        Object obj9 = sources[8];
        Intrinsics.h(obj9, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.product.model.fulldetails.models.sponsorship.ProductSponsorship>");
        List list2 = (List) obj9;
        Object obj10 = sources[9];
        Intrinsics.h(obj10, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.reviews.models.ProductRatings>");
        Object obj11 = sources[10];
        Intrinsics.h(obj11, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.subscription.model.domain.SubscriptionDetails>");
        List list3 = (List) obj11;
        return C17117c.a(y10.c1(y10.productsRepository, (List) obj, (List) obj8), shoppingListStore, favoriteListStore, (ShoppingCart) ((uk.c) obj4).a(), y10.storeProvider.a(), y10.productQuery, list, map, map2, list2, (List) obj10, list3);
    }

    private final io.reactivex.l<ShoppingListStore> Z0() {
        io.reactivex.l lVarD = tv.h.d(this.shoppingListRepository.h(), null, 1, null);
        final n nVar = new n(qw.a.INSTANCE);
        return lVarD.doOnError(new Lu.g() { // from class: sp.s
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.f0(nVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a0(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (List) function1.invoke(p02);
    }

    private final io.reactivex.l<List<SubscriptionDetails>> a1() {
        io.reactivex.l lVarD = tv.h.d(this.subscriptionsListRepository.d(), null, 1, null);
        final p pVar = new p(qw.a.INSTANCE);
        return lVarD.doOnError(new Lu.g() { // from class: sp.r
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.g0(pVar, obj);
            }
        });
    }

    private final io.reactivex.l<List<ProductState<ProductFullDetails>>> b1() {
        C13732b c13732b = C13732b.f128880a;
        io.reactivex.l<List<ProductFullDetails>> lVarT = X0().t();
        a.Companion companion = qw.a.INSTANCE;
        final q qVar = new q(companion);
        io.reactivex.l<List<ProductFullDetails>> lVarDoOnError = lVarT.doOnError(new Lu.g() { // from class: sp.X
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.h0(qVar, obj);
            }
        });
        Intrinsics.i(lVarDoOnError, "doOnError(...)");
        io.reactivex.l<List<ProductFullDetails>> lVarT2 = U0().t();
        io.reactivex.l<List<ProductSponsorship>> lVarB = this.sponsorshipsDataStore.b();
        io.reactivex.l<List<ProductRatings>> lVarT3 = W0().t();
        final r rVar = new r(companion);
        io.reactivex.l<List<ProductRatings>> lVarDoOnError2 = lVarT3.doOnError(new Lu.g() { // from class: sp.e
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.i0(rVar, obj);
            }
        });
        Intrinsics.i(lVarDoOnError2, "doOnError(...)");
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarCombineLatest = io.reactivex.l.combineLatest(lVarDoOnError, lVarT2, lVarB, lVarDoOnError2, new o());
        Intrinsics.f(lVarCombineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        return lVarCombineLatest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ProductFullDetails> c1(Ro.c cVar, List<ProductFullDetails> list, List<ProductFullDetails> list2) {
        Parcelable parcelable = this.productQuery;
        l.k kVar = parcelable instanceof l.k ? (l.k) parcelable : null;
        Map<FilterFacet, List<FilterFacetOption>> mapF3 = kVar != null ? kVar.F3() : null;
        return (list2.isEmpty() || !(mapF3 == null || mapF3.isEmpty() || Oo.a.c(mapF3))) ? list : cVar.u(list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e1(List it) {
        Intrinsics.j(it, "it");
        return CollectionsKt.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ek.n g1() {
        return new Ek.n(CollectionsKt.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ek.n h1() {
        return new Ek.n(CollectionsKt.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n1(List list, List oldList) {
        Intrinsics.j(oldList, "oldList");
        List list2 = oldList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(((nk.f) obj).getCode(), obj);
        }
        List list3 = list;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list3, 10)), 16));
        for (Object obj2 : list3) {
            linkedHashMap2.put(((nk.f) obj2).getCode(), obj2);
        }
        return CollectionsKt.j1(MapsKt.u(linkedHashMap, linkedHashMap2).values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ek.n o0() {
        return new Ek.n(MapsKt.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ek.n p0() {
        return new Ek.n(CollectionsKt.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable r0(List it) {
        Intrinsics.j(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable s0(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (Iterable) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair t0(ProductFullDetails product, Map promoStore) {
        Intrinsics.j(product, "product");
        Intrinsics.j(promoStore, "promoStore");
        return TuplesKt.a(product, promoStore.get(product.getCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair u0(Function2 function2, Object p02, Object p12) {
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        return (Pair) function2.invoke(p02, p12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w0(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.reactivex.y x0(Y y10, Pair pair) {
        Intrinsics.j(pair, "<destruct>");
        Object objA = pair.a();
        Intrinsics.i(objA, "component1(...)");
        final ProductFullDetails productFullDetails = (ProductFullDetails) objA;
        io.reactivex.u uVarB = tv.n.b(y10.ioDispatcher, y10.new i(productFullDetails, null));
        final Function1 function1 = new Function1() { // from class: sp.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.y0(productFullDetails, (List) obj);
            }
        };
        return uVarB.j(new Lu.o() { // from class: sp.I
            @Override // Lu.o
            public final Object apply(Object obj) {
                return Y.z0(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair y0(ProductFullDetails productFullDetails, List it) {
        Intrinsics.j(it, "it");
        return TuplesKt.a(productFullDetails, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair z0(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (Pair) function1.invoke(p02);
    }

    public final io.reactivex.l<List<ProductState<ProductFullDetails>>> Y0() {
        return this.userManager.b() ? P0() : b1();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d1(java.lang.String r6, boolean r7, java.lang.String r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof sp.Y.m
            if (r0 == 0) goto L13
            r0 = r9
            sp.Y$m r0 = (sp.Y.m) r0
            int r1 = r0.f161600h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161600h = r1
            goto L18
        L13:
            sp.Y$m r0 = new sp.Y$m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f161598f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f161600h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r6 = r0.f161595c
            sp.Y r6 = (sp.Y) r6
            java.lang.Object r6 = r0.f161594b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f161593a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L36
            goto L66
        L36:
            r6 = move-exception
            goto L6d
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.ResultKt.b(r9)
            Ek.n r9 = r5.U0()
            sp.P r2 = new sp.P
            r2.<init>()
            r9.a(r2)
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L36
            Ro.c r9 = r5.productsRepository     // Catch: java.lang.Throwable -> L36
            r0.f161593a = r6     // Catch: java.lang.Throwable -> L36
            r0.f161594b = r8     // Catch: java.lang.Throwable -> L36
            r0.f161595c = r5     // Catch: java.lang.Throwable -> L36
            r0.f161596d = r7     // Catch: java.lang.Throwable -> L36
            r0.f161597e = r3     // Catch: java.lang.Throwable -> L36
            r0.f161600h = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r9 = r9.q(r6, r7, r8, r0)     // Catch: java.lang.Throwable -> L36
            if (r9 != r1) goto L66
            return r1
        L66:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L36
            goto L77
        L6d:
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L77:
            boolean r7 = kotlin.Result.h(r6)
            if (r7 == 0) goto L8c
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            Ek.n r8 = r5.U0()
            sp.Q r9 = new sp.Q
            r9.<init>()
            r8.a(r9)
        L8c:
            java.lang.Throwable r6 = kotlin.Result.e(r6)
            if (r6 == 0) goto La8
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            mv.E0.i(r7)
            boolean r7 = r6 instanceof java.lang.Error
            if (r7 != 0) goto La7
            qw.a$a r7 = qw.a.INSTANCE
            java.lang.String r8 = "Failed to merge sponsored products from Criteo."
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r7.f(r6, r8, r9)
            goto La8
        La7:
            throw r6
        La8:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sp.Y.d1(java.lang.String, boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void i1(Qo.l productQuery) {
        Intrinsics.j(productQuery, "productQuery");
        this.productQuery = productQuery;
        j1(productQuery.f());
    }

    public final void j1(final List<ProductFullDetails> list) {
        Intrinsics.j(list, "list");
        X0().a(new Function1() { // from class: sp.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.k1(list, (List) obj);
            }
        });
    }

    public final void l1(Qo.l productQuery) {
        Intrinsics.j(productQuery, "productQuery");
        this.productQuery = productQuery.g();
        m1(productQuery.f());
    }

    public final void m1(final List<ProductFullDetails> list) {
        Intrinsics.j(list, "list");
        X0().a(new Function1() { // from class: sp.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.n1(list, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(Y y10, Pair pair) {
        final ProductFullDetails productFullDetails = (ProductFullDetails) pair.a();
        Object objB = pair.b();
        Intrinsics.i(objB, "component2(...)");
        final List list = (List) objB;
        y10.R0().a(new Function1() { // from class: sp.G
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.C0(productFullDetails, list, (Map) obj);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(Y y10, final List list) {
        y10.W0().a(new Function1() { // from class: sp.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.L0(list, (List) obj);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final io.reactivex.l<List<ProductState<ProductFullDetails>>> P0() {
        io.reactivex.l<List<ProductFullDetails>> lVarT = X0().t();
        a.Companion companion = qw.a.INSTANCE;
        final a aVar = new a(companion);
        io.reactivex.l<List<ProductFullDetails>> lVarDoOnError = lVarT.doOnError(new Lu.g() { // from class: sp.z
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.U(aVar, obj);
            }
        });
        io.reactivex.l<ShoppingListStore> lVarDistinctUntilChanged = Z0().distinctUntilChanged();
        io.reactivex.l<FavoriteListStore> lVarDistinctUntilChanged2 = V0().distinctUntilChanged();
        io.reactivex.l<uk.c<ShoppingCart>> lVarDistinctUntilChanged3 = Q0().distinctUntilChanged();
        io.reactivex.l<List<Coupon>> lVarDistinctUntilChanged4 = T0().distinctUntilChanged();
        io.reactivex.l<Map<String, Qk.b>> lVarDistinctUntilChanged5 = S0().distinctUntilChanged();
        io.reactivex.l<Map<String, List<ProductComplexPromo>>> lVarT2 = R0().t();
        final b bVar = new b(companion);
        io.reactivex.l<Map<String, List<ProductComplexPromo>>> lVarDoOnError2 = lVarT2.doOnError(new Lu.g() { // from class: sp.K
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.V(bVar, obj);
            }
        });
        io.reactivex.l<List<ProductFullDetails>> lVarT3 = U0().t();
        final c cVar = new c(companion);
        io.reactivex.l<List<ProductFullDetails>> lVarDoOnError3 = lVarT3.doOnError(new Lu.g() { // from class: sp.S
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.W(cVar, obj);
            }
        });
        io.reactivex.l<List<ProductSponsorship>> lVarB = this.sponsorshipsDataStore.b();
        final d dVar = new d(companion);
        io.reactivex.l<List<ProductSponsorship>> lVarDoOnError4 = lVarB.doOnError(new Lu.g() { // from class: sp.T
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.X(dVar, obj);
            }
        });
        io.reactivex.l<List<ProductRatings>> lVarT4 = W0().t();
        final e eVar = new e(companion);
        List listP = CollectionsKt.p(lVarDoOnError, lVarDistinctUntilChanged, lVarDistinctUntilChanged2, lVarDistinctUntilChanged3, lVarDistinctUntilChanged4, lVarDistinctUntilChanged5, lVarDoOnError2, lVarDoOnError3, lVarDoOnError4, lVarT4.doOnError(new Lu.g() { // from class: sp.U
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.Y(eVar, obj);
            }
        }), a1().distinctUntilChanged());
        final Function1 function1 = new Function1() { // from class: sp.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.Z(this.f161567a, (Object[]) obj);
            }
        };
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarCombineLatest = io.reactivex.l.combineLatest(listP, new Lu.o() { // from class: sp.W
            @Override // Lu.o
            public final Object apply(Object obj) {
                return Y.a0(function1, obj);
            }
        });
        Intrinsics.i(lVarCombineLatest, "combineLatest(...)");
        return lVarCombineLatest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @SuppressLint({"DeprecatedCall"})
    public final Object F0(Continuation<? super Ju.b> continuation) {
        io.reactivex.l<List<ProductFullDetails>> lVarT = X0().t();
        io.reactivex.l<List<ProductFullDetails>> lVarT2 = U0().t();
        final Function2 function2 = new Function2() { // from class: sp.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Y.G0(this.f161622a, (List) obj, (List) obj2);
            }
        };
        io.reactivex.l lVarDistinctUntilChanged = io.reactivex.l.combineLatest(lVarT, lVarT2, new Lu.c() { // from class: sp.i
            @Override // Lu.c
            public final Object apply(Object obj, Object obj2) {
                return Y.H0(function2, obj, obj2);
            }
        }).distinctUntilChanged();
        final Function1 function1 = new Function1() { // from class: sp.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.I0(this.f161624a, (List) obj);
            }
        };
        io.reactivex.l lVarFlatMapSingle = lVarDistinctUntilChanged.flatMapSingle(new Lu.o() { // from class: sp.k
            @Override // Lu.o
            public final Object apply(Object obj) {
                return Y.J0(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: sp.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.K0(this.f161626a, (List) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: sp.m
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.M0(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: sp.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.N0((Throwable) obj);
            }
        };
        Ju.b bVarSubscribe = lVarFlatMapSingle.subscribe(gVar, new Lu.g() { // from class: sp.p
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.O0(function13, obj);
            }
        });
        Intrinsics.i(bVarSubscribe, "subscribe(...)");
        return bVarSubscribe;
    }

    public final Ju.b q0() {
        io.reactivex.l<List<ProductFullDetails>> lVarDistinctUntilChanged = X0().t().distinctUntilChanged();
        final Function1 function1 = new Function1() { // from class: sp.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.r0((List) obj);
            }
        };
        io.reactivex.l<U> lVarFlatMapIterable = lVarDistinctUntilChanged.flatMapIterable(new Lu.o() { // from class: sp.v
            @Override // Lu.o
            public final Object apply(Object obj) {
                return Y.s0(function1, obj);
            }
        });
        io.reactivex.l<Map<String, List<ProductComplexPromo>>> lVarT = R0().t();
        final Function2 function2 = new Function2() { // from class: sp.w
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Y.t0((ProductFullDetails) obj, (Map) obj2);
            }
        };
        io.reactivex.l lVarWithLatestFrom = lVarFlatMapIterable.withLatestFrom(lVarT, (Lu.c<? super U, ? super U, ? extends R>) new Lu.c() { // from class: sp.x
            @Override // Lu.c
            public final Object apply(Object obj, Object obj2) {
                return Y.u0(function2, obj, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: sp.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Y.v0((Pair) obj));
            }
        };
        io.reactivex.l lVarFilter = lVarWithLatestFrom.filter(new Lu.q() { // from class: sp.A
            @Override // Lu.q
            public final boolean test(Object obj) {
                return Y.w0(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: sp.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.x0(this.f161552a, (Pair) obj);
            }
        };
        io.reactivex.l lVarFlatMapSingle = lVarFilter.flatMapSingle(new Lu.o() { // from class: sp.C
            @Override // Lu.o
            public final Object apply(Object obj) {
                return Y.A0(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: sp.D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.B0(this.f161554a, (Pair) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: sp.E
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.D0(function14, obj);
            }
        };
        final j jVar = new j(qw.a.INSTANCE);
        Ju.b bVarSubscribe = lVarFlatMapSingle.subscribe(gVar, new Lu.g() { // from class: sp.u
            @Override // Lu.g
            public final void accept(Object obj) {
                Y.E0(jVar, obj);
            }
        });
        Intrinsics.i(bVarSubscribe, "subscribe(...)");
        return bVarSubscribe;
    }
}
