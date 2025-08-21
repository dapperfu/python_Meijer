package wr;

import Co.ProductFullDetails;
import Lu.g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ev.C13889a;
import fj.EntryChange;
import fj.ShoppingCart;
import il.m;
import io.reactivex.l;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16549B;
import pv.S;
import qw.a;
import uk.AbstractC17440a;
import uk.c;
import ur.AbstractC17454a;
import wr.f;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001NB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001b2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001f\u0010 J$\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\nH\u0086@¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\n2\n\u0010'\u001a\u00060\u0016j\u0002`&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002¢\u0006\u0004\b/\u00100J=\u00102\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\nH\u0002¢\u0006\u0004\b4\u0010+J\u000f\u00105\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u0010%J\u001f\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020\u000e2\u0006\u00107\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u000e2\u0006\u00107\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b@\u0010AJ-\u0010E\u001a\u00020\u000e2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0,2\u0006\u0010D\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u00020\n2\n\u0010I\u001a\u00060\u0016j\u0002`&H\u0002¢\u0006\u0004\bJ\u0010)J\u001b\u0010K\u001a\u00020\u000e2\n\u0010I\u001a\u00060\u0016j\u0002`&H\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010M\u001a\u00020\u000e2\n\u0010I\u001a\u00060\u0016j\u0002`&H\u0002¢\u0006\u0004\bM\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR(\u0010[\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bT\u0010U\u0012\u0004\bZ\u0010%\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u001c0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020f0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010d¨\u0006i"}, d2 = {"Lwr/f;", "", "Lil/m;", "cartRepository", "LRo/a;", "productAnalytics", "Lmv/O;", "applicationScope", "<init>", "(Lil/m;LRo/a;Lmv/O;)V", "", "sendInstantCartUpdates", "Lwr/a;", "listener", "", "q", "(ZLwr/a;)V", "LCo/h;", "product", "", "quantityToUpdate", "calculateLightningCart", "", "searchTerm", "K", "(LCo/h;DZLjava/lang/String;)V", "T", "Luk/a;", "Lur/a;", "updateRequestChallenge", "searchQuery", "A", "(Luk/a;ZLjava/lang/String;)V", "retainOutOfStockItems", "m", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "()V", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "x", "(Ljava/lang/String;)Z", "v", "()Z", "Luk/c;", "Lfj/C;", "cartResource", "O", "(Luk/c;)V", "isRequestFromPendingQueue", "L", "(LCo/h;DZZLjava/lang/String;)V", "w", "C", "Lur/a$c;", "updateRequest", "H", "(Lur/a$c;Z)V", "Lur/a$d;", "J", "(Lur/a$d;Z)V", "Lur/a$a;", "l", "(Lur/a$a;)V", "k", "(LCo/h;D)V", "Lfj/j;", "entryChange", "request", "z", "(Luk/c;Lur/a;Z)V", "y", "(Z)V", "productCode", "u", "F", "(Ljava/lang/String;)V", "D", "a", "Lil/m;", "b", "LRo/a;", "c", "Lmv/O;", "d", "Lwr/a;", "o", "()Lwr/a;", "I", "(Lwr/a;)V", "getCartInteractionListener$annotations", "cartInteractionListener", "e", "Z", "Lpv/B;", "f", "Lpv/B;", "_cart", "Ljava/util/Queue;", "g", "Ljava/util/Queue;", "cartUpdateInFlightQueue", "Lwr/f$a;", "h", "productPendingQueue", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m cartRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ro.a productAnalytics;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O applicationScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public InterfaceC17909a cartInteractionListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean sendInstantCartUpdates;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<uk.c<ShoppingCart>> _cart;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Queue<AbstractC17454a> cartUpdateInFlightQueue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Queue<PendingRequest> productPendingQueue;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwr/f$a;", "", "LCo/h;", "product", "", "quantityToUpdate", "<init>", "(LCo/h;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wr.f$a, reason: from toString */
    static final /* data */ class PendingRequest {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails product;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double quantityToUpdate;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingRequest)) {
                return false;
            }
            PendingRequest pendingRequest = (PendingRequest) other;
            return Intrinsics.e(this.product, pendingRequest.product) && Double.compare(this.quantityToUpdate, pendingRequest.quantityToUpdate) == 0;
        }

        public PendingRequest(ProductFullDetails product, double d10) {
            Intrinsics.j(product, "product");
            this.product = product;
            this.quantityToUpdate = d10;
        }

        /* renamed from: a, reason: from getter */
        public final ProductFullDetails getProduct() {
            return this.product;
        }

        /* renamed from: b, reason: from getter */
        public final double getQuantityToUpdate() {
            return this.quantityToUpdate;
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate);
        }

        public String toString() {
            return "PendingRequest(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.cart.interactor.CartInteractor$addToCart$1", f = "CartInteractor.kt", l = {394, HttpResponseStatus.ERROR_LENGTH_REQUIRED}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f167431a;

        /* renamed from: b, reason: collision with root package name */
        Object f167432b;

        /* renamed from: c, reason: collision with root package name */
        Object f167433c;

        /* renamed from: d, reason: collision with root package name */
        Object f167434d;

        /* renamed from: e, reason: collision with root package name */
        Object f167435e;

        /* renamed from: f, reason: collision with root package name */
        Object f167436f;

        /* renamed from: g, reason: collision with root package name */
        int f167437g;

        /* renamed from: h, reason: collision with root package name */
        int f167438h;

        /* renamed from: i, reason: collision with root package name */
        int f167439i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f167440j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AbstractC17454a.Add f167442l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC17454a.Add c2609a, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f167442l = c2609a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = f.this.new b(this.f167442l, continuation);
            bVar.f167440j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(1:(1:(9:6|65|7|48|53|(2:55|(1:57)(1:58))|59|61|62)(2:11|12))(4:13|71|14|15))(9:18|63|19|20|73|21|22|(1:25)|46)|69|26|36|(1:38)|39|(2:41|(5:43|67|44|(5:47|48|53|(0)|59)|46)(1:60))|61|62|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wr.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<uk.c<ShoppingCart>, Unit> {
        c(Object obj) {
            super(1, obj, f.class, "updatedCart", "updatedCart(Lcom/meijer/mobile/core/util/content/Resource;)V", 0);
        }

        public final void a(uk.c<ShoppingCart> p02) {
            Intrinsics.j(p02, "p0");
            ((f) this.receiver).O(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uk.c<ShoppingCart> cVar) {
            a(cVar);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.cart.interactor.CartInteractor$removeFromCart$1", f = "CartInteractor.kt", l = {HttpResponseStatus.REDIRECTION_NOT_MODIFIED, 316, 335}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f167443a;

        /* renamed from: b, reason: collision with root package name */
        Object f167444b;

        /* renamed from: c, reason: collision with root package name */
        Object f167445c;

        /* renamed from: d, reason: collision with root package name */
        Object f167446d;

        /* renamed from: e, reason: collision with root package name */
        Object f167447e;

        /* renamed from: f, reason: collision with root package name */
        Object f167448f;

        /* renamed from: g, reason: collision with root package name */
        int f167449g;

        /* renamed from: h, reason: collision with root package name */
        int f167450h;

        /* renamed from: i, reason: collision with root package name */
        boolean f167451i;

        /* renamed from: j, reason: collision with root package name */
        int f167452j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f167453k;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ AbstractC17454a.Remove f167455m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f167456n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC17454a.Remove cVar, boolean z10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f167455m = cVar;
            this.f167456n = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = f.this.new e(this.f167455m, this.f167456n, continuation);
            eVar.f167453k = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0121 A[PHI: r10 r11
          0x0121: PHI (r10v2 java.lang.Object) = (r10v1 java.lang.Object), (r10v3 java.lang.Object) binds: [B:35:0x00b7, B:52:0x0120] A[DONT_GENERATE, DONT_INLINE]
          0x0121: PHI (r11v2 mv.O) = (r11v1 mv.O), (r11v3 mv.O) binds: [B:35:0x00b7, B:52:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0190  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 431
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wr.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.cart.interactor.CartInteractor$setItemQuantity$1", f = "CartInteractor.kt", l = {356, 377}, m = "invokeSuspend")
    /* renamed from: wr.f$f, reason: collision with other inner class name */
    static final class C2670f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f167457a;

        /* renamed from: b, reason: collision with root package name */
        Object f167458b;

        /* renamed from: c, reason: collision with root package name */
        Object f167459c;

        /* renamed from: d, reason: collision with root package name */
        Object f167460d;

        /* renamed from: e, reason: collision with root package name */
        Object f167461e;

        /* renamed from: f, reason: collision with root package name */
        Object f167462f;

        /* renamed from: g, reason: collision with root package name */
        int f167463g;

        /* renamed from: h, reason: collision with root package name */
        int f167464h;

        /* renamed from: i, reason: collision with root package name */
        boolean f167465i;

        /* renamed from: j, reason: collision with root package name */
        int f167466j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f167467k;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ AbstractC17454a.Update f167469m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f167470n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2670f(AbstractC17454a.Update dVar, boolean z10, Continuation<? super C2670f> continuation) {
            super(2, continuation);
            this.f167469m = dVar;
            this.f167470n = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2670f c2670f = f.this.new C2670f(this.f167469m, this.f167470n, continuation);
            c2670f.f167467k = obj;
            return c2670f;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C2670f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wr.f.C2670f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ void r(f fVar, boolean z10, InterfaceC17909a interfaceC17909a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        fVar.q(z10, interfaceC17909a);
    }

    public f(m cartRepository, Ro.a productAnalytics, InterfaceC15783O applicationScope) {
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(productAnalytics, "productAnalytics");
        Intrinsics.j(applicationScope, "applicationScope");
        this.cartRepository = cartRepository;
        this.productAnalytics = productAnalytics;
        this.applicationScope = applicationScope;
        this.sendInstantCartUpdates = true;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this._cart = S.a(new c.Loading(defaultConstructorMarker, 1, defaultConstructorMarker));
        this.cartUpdateInFlightQueue = new ConcurrentLinkedQueue();
        this.productPendingQueue = new ConcurrentLinkedQueue();
    }

    public static /* synthetic */ void B(f fVar, AbstractC17440a abstractC17440a, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        fVar.A(abstractC17440a, z10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        if (this.sendInstantCartUpdates) {
            o().observeCart(this._cart.getValue());
        } else if (w()) {
            o().observeCart(this._cart.getValue());
        }
    }

    private final void D(final String productCode) {
        CollectionsKt.H(this.productPendingQueue, new Function1() { // from class: wr.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(f.E(productCode, (f.PendingRequest) obj));
            }
        });
    }

    private final void F(final String productCode) {
        CollectionsKt.H(this.productPendingQueue, new Function1() { // from class: wr.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(f.G(productCode, (f.PendingRequest) obj));
            }
        });
    }

    private final void H(AbstractC17454a.Remove updateRequest, boolean calculateLightningCart) {
        this.cartUpdateInFlightQueue.offer(updateRequest);
        C();
        C15809k.d(this.applicationScope, null, null, new e(updateRequest, calculateLightningCart, null), 3, null);
    }

    private final void J(AbstractC17454a.Update updateRequest, boolean calculateLightningCart) {
        this.cartUpdateInFlightQueue.offer(updateRequest);
        C();
        C15809k.d(this.applicationScope, null, null, new C2670f(updateRequest, calculateLightningCart, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r1
      0x0034: PHI (r1v26 fj.i) = (r1v13 fj.i), (r1v29 fj.i) binds: [B:20:0x005a, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void L(Co.ProductFullDetails r23, double r24, boolean r26, boolean r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wr.f.L(Co.h, double, boolean, boolean, java.lang.String):void");
    }

    public static /* synthetic */ void M(f fVar, ProductFullDetails productFullDetails, double d10, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            str = null;
        }
        fVar.K(productFullDetails, d10, z11, str);
    }

    static /* synthetic */ void N(f fVar, ProductFullDetails productFullDetails, double d10, boolean z10, boolean z11, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            str = null;
        }
        fVar.L(productFullDetails, d10, z10, z12, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(uk.c<ShoppingCart> cartResource) {
        InterfaceC16549B<uk.c<ShoppingCart>> interfaceC16549B = this._cart;
        while (!interfaceC16549B.e(interfaceC16549B.getValue(), cartResource)) {
        }
        if (this.sendInstantCartUpdates) {
            o().observeCart(cartResource);
        } else if (w()) {
            o().observeCart(cartResource);
        }
    }

    private final void k(ProductFullDetails product, double quantityToUpdate) {
        this.productPendingQueue.offer(new PendingRequest(product, quantityToUpdate));
    }

    private final void l(AbstractC17454a.Add updateRequest) {
        this.cartUpdateInFlightQueue.offer(updateRequest);
        C();
        C15809k.d(this.applicationScope, null, null, new b(updateRequest, null), 3, null);
    }

    public static /* synthetic */ Object n(f fVar, boolean z10, boolean z11, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return fVar.m(z10, z11, continuation);
    }

    private final boolean u(String productCode) {
        Queue<AbstractC17454a> queue = this.cartUpdateInFlightQueue;
        if (queue != null && queue.isEmpty()) {
            return false;
        }
        Iterator<T> it = queue.iterator();
        while (it.hasNext()) {
            if (Intrinsics.e(((AbstractC17454a) it.next()).getProductCode(), productCode)) {
                return true;
            }
        }
        return false;
    }

    private final boolean w() {
        return this.cartUpdateInFlightQueue.isEmpty() && this.productPendingQueue.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(boolean calculateLightningCart) {
        Object next;
        Iterator<T> it = this.productPendingQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PendingRequest) next).getQuantityToUpdate() == 0.0d) {
                    break;
                }
            }
        }
        PendingRequest pendingRequest = (PendingRequest) next;
        if (pendingRequest != null) {
            D(pendingRequest.getProduct().getCode());
            N(this, pendingRequest.getProduct(), pendingRequest.getQuantityToUpdate(), calculateLightningCart, true, null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(uk.c<EntryChange> entryChange, AbstractC17454a request, boolean calculateLightningCart) {
        Object obj = null;
        for (Object obj2 : this.productPendingQueue) {
            if (Intrinsics.e(((PendingRequest) obj2).getProduct().getCode(), request.getProductCode())) {
                obj = obj2;
            }
        }
        PendingRequest pendingRequest = (PendingRequest) obj;
        if (pendingRequest != null) {
            F(pendingRequest.getProduct().getCode());
            N(this, pendingRequest.getProduct(), pendingRequest.getQuantityToUpdate(), calculateLightningCart, true, null, 16, null);
        }
    }

    public final <T> void A(AbstractC17440a<AbstractC17454a, T> updateRequestChallenge, boolean calculateLightningCart, String searchQuery) {
        Intrinsics.j(updateRequestChallenge, "updateRequestChallenge");
        if (!(updateRequestChallenge instanceof AbstractC17440a.Accept)) {
            if (!(updateRequestChallenge instanceof AbstractC17440a.Cancel)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        AbstractC17454a abstractC17454a = (AbstractC17454a) ((AbstractC17440a.Accept) updateRequestChallenge).f();
        if (abstractC17454a instanceof AbstractC17454a.Add) {
            Ro.a aVar = this.productAnalytics;
            if (searchQuery == null) {
                searchQuery = "";
            }
            AbstractC17454a.Add c2609a = (AbstractC17454a.Add) abstractC17454a;
            aVar.d(searchQuery, c2609a.getProduct());
            D(abstractC17454a.getProductCode());
            l(c2609a);
            return;
        }
        if (abstractC17454a instanceof AbstractC17454a.Update) {
            D(abstractC17454a.getProductCode());
            J((AbstractC17454a.Update) abstractC17454a, calculateLightningCart);
        } else if (abstractC17454a instanceof AbstractC17454a.Remove) {
            H((AbstractC17454a.Remove) abstractC17454a, calculateLightningCart);
        } else {
            if (!Intrinsics.e(abstractC17454a, AbstractC17454a.b.f164334b)) {
                throw new NoWhenBranchMatchedException();
            }
            D(abstractC17454a.getProductCode());
        }
    }

    public final void I(InterfaceC17909a interfaceC17909a) {
        Intrinsics.j(interfaceC17909a, "<set-?>");
        this.cartInteractionListener = interfaceC17909a;
    }

    public final void K(ProductFullDetails product, double quantityToUpdate, boolean calculateLightningCart, String searchTerm) {
        Intrinsics.j(product, "product");
        L(product, quantityToUpdate, calculateLightningCart, false, searchTerm);
    }

    public final Object m(boolean z10, boolean z11, Continuation<? super Unit> continuation) {
        Object objD = this.cartRepository.d(z10, z11, continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
    }

    public final InterfaceC17909a o() {
        InterfaceC17909a interfaceC17909a = this.cartInteractionListener;
        if (interfaceC17909a != null) {
            return interfaceC17909a;
        }
        Intrinsics.x("cartInteractionListener");
        return null;
    }

    public final void q(boolean sendInstantCartUpdates, InterfaceC17909a listener) {
        Intrinsics.j(listener, "listener");
        this.sendInstantCartUpdates = sendInstantCartUpdates;
        I(listener);
        l<uk.c<ShoppingCart>> lVarObserveOn = this.cartRepository.b().distinctUntilChanged().subscribeOn(C13889a.b()).observeOn(Iu.a.a());
        final c cVar = new c(this);
        g<? super uk.c<ShoppingCart>> gVar = new g() { // from class: wr.b
            @Override // Lu.g
            public final void accept(Object obj) {
                f.s(cVar, obj);
            }
        };
        final d dVar = new d(qw.a.INSTANCE);
        Dk.a.a(lVarObserveOn.subscribe(gVar, new g() { // from class: wr.c
            @Override // Lu.g
            public final void accept(Object obj) {
                f.t(dVar, obj);
            }
        }), o().getDisposables());
    }

    public final boolean v() {
        Queue<AbstractC17454a> queue = this.cartUpdateInFlightQueue;
        if (queue != null && queue.isEmpty()) {
            return false;
        }
        Iterator<T> it = queue.iterator();
        while (it.hasNext()) {
            if (((AbstractC17454a) it.next()) instanceof AbstractC17454a.Remove) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        Queue<AbstractC17454a> queue = this.cartUpdateInFlightQueue;
        if (queue == null || !queue.isEmpty()) {
            Iterator<T> it = queue.iterator();
            while (it.hasNext()) {
                if (Intrinsics.e(((AbstractC17454a) it.next()).getProductCode(), forProduct)) {
                    return true;
                }
            }
        }
        Queue<PendingRequest> queue2 = this.productPendingQueue;
        if (queue2 != null && queue2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = queue2.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.e(((PendingRequest) it2.next()).getProduct().getCode(), forProduct)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(String str, PendingRequest pendingRequest) {
        if (Intrinsics.e(pendingRequest.getProduct().getCode(), str) && pendingRequest.getQuantityToUpdate() == 0.0d) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(String str, PendingRequest pendingRequest) {
        return Intrinsics.e(pendingRequest.getProduct().getCode(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void p() {
        o().observeCart(this._cart.getValue());
    }
}
