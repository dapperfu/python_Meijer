package pr;

import Co.ProductFullDetails;
import androidx.view.c0;
import androidx.view.d0;
import cr.SubscriptionDetails;
import ir.C14758a;
import java.util.Iterator;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pr.AbstractC16364a;
import sp.ProductState;
import sp.Y;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;
import vl.ProductEligibility;
import xv.h;
import yl.AbstractC18227f;
import yl.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lpr/d;", "Landroidx/lifecycle/c0;", "Lyl/k;", "featureManager", "Lsp/Y;", "productStateRepository", "Lir/a;", "subscriptionRepository", "<init>", "(Lyl/k;Lsp/Y;Lir/a;)V", "Lvl/b;", "eligibility", "", "q", "(Lvl/b;)Z", "LCo/h;", "product", "", "r", "(LCo/h;)V", "a", "Lyl/k;", "b", "Lsp/Y;", "c", "Lir/a;", "Ltv/B;", "Lpr/c;", "d", "Ltv/B;", "_summaryFlow", "Ltv/P;", "e", "Ltv/P;", "p", "()Ltv/P;", "summaryFlow", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pr.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16367d extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k featureManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Y productStateRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14758a subscriptionRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<SubscriptionSummaryDecorator> _summaryFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<SubscriptionSummaryDecorator> summaryFlow;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lsp/b;", "LCo/h;", "kotlin.jvm.PlatformType", "productStates", "Lcr/j;", "subscriptions", "Lpr/c;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)Lpr/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.summary.SubscriptionSummaryViewModel$1", f = "SubscriptionSummaryViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: pr.d$a */
    static final class a extends SuspendLambda implements Function3<List<? extends ProductState<ProductFullDetails>>, List<? extends SubscriptionDetails>, Continuation<? super SubscriptionSummaryDecorator>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156309a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f156310b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f156311c;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<ProductState<ProductFullDetails>> list, List<SubscriptionDetails> list2, Continuation<? super SubscriptionSummaryDecorator> continuation) {
            a aVar = C16367d.this.new a(continuation);
            aVar.f156310b = list;
            aVar.f156311c = list2;
            return aVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            IntrinsicsKt.f();
            if (this.f156309a == 0) {
                ResultKt.b(obj);
                List list = (List) this.f156310b;
                List list2 = (List) this.f156311c;
                Intrinsics.g(list);
                ProductState c16993b = (ProductState) CollectionsKt.u0(list);
                if (c16993b == null || !C16367d.this.featureManager.e(AbstractC18227f.Z.f170565h)) {
                    return null;
                }
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.e(((SubscriptionDetails) next).getProductInfo().getProductCode(), ((ProductFullDetails) c16993b.g()).getCode())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                SubscriptionDetails subscriptionDetails = (SubscriptionDetails) next;
                if (!C16367d.this.q(c16993b.getEligibility()) && (subscriptionDetails == null || !subscriptionDetails.getIsActive())) {
                    return null;
                }
                return new SubscriptionSummaryDecorator((ProductFullDetails) c16993b.g(), new AbstractC16364a.CreateSubscription(c16993b.g()), subscriptionDetails, EnumC16365b.f156296d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpr/c;", "newSummary", "", "<anonymous>", "(Lpr/c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.summary.SubscriptionSummaryViewModel$2", f = "SubscriptionSummaryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pr.d$b */
    static final class b extends SuspendLambda implements Function2<SubscriptionSummaryDecorator, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156313a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f156314b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C16367d.this.new b(continuation);
            bVar.f156314b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SubscriptionSummaryDecorator subscriptionSummaryDecorator, Continuation<? super Unit> continuation) {
            return ((b) create(subscriptionSummaryDecorator, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f156313a == 0) {
                ResultKt.b(obj);
                C16367d.this._summaryFlow.setValue((SubscriptionSummaryDecorator) this.f156314b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C16367d(k featureManager, Y productStateRepository, C14758a subscriptionRepository) {
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(productStateRepository, "productStateRepository");
        Intrinsics.j(subscriptionRepository, "subscriptionRepository");
        this.featureManager = featureManager;
        this.productStateRepository = productStateRepository;
        this.subscriptionRepository = subscriptionRepository;
        InterfaceC17140B<SubscriptionSummaryDecorator> interfaceC17140BA = S.a(null);
        this._summaryFlow = interfaceC17140BA;
        this.summaryFlow = C17154h.c(interfaceC17140BA);
        C17154h.J(C17154h.O(C17154h.r(C17154h.l(h.b(productStateRepository.Y0()), subscriptionRepository.c(), new a(null))), new b(null)), d0.a(this));
    }

    public final P<SubscriptionSummaryDecorator> p() {
        return this.summaryFlow;
    }

    public final void r(ProductFullDetails product) {
        Intrinsics.j(product, "product");
        this.productStateRepository.j1(CollectionsKt.e(product));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(ProductEligibility eligibility) {
        if (!Intrinsics.e(eligibility.k(), ProductEligibility.a.C2600a.f164847a) && !Intrinsics.e(eligibility.k(), ProductEligibility.a.c.f164849a)) {
            return false;
        }
        return true;
    }
}
