package pr;

import Co.ProductFullDetails;
import androidx.view.c0;
import androidx.view.d0;
import cr.SubscriptionDetails;
import ir.C14846a;
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
import pr.AbstractC16490a;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import sp.ProductState;
import sp.Y;
import tv.h;
import wl.ProductEligibility;
import zl.AbstractC18503f;
import zl.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lpr/d;", "Landroidx/lifecycle/c0;", "Lzl/k;", "featureManager", "Lsp/Y;", "productStateRepository", "Lir/a;", "subscriptionRepository", "<init>", "(Lzl/k;Lsp/Y;Lir/a;)V", "Lwl/b;", "eligibility", "", "q", "(Lwl/b;)Z", "LCo/h;", "product", "", "r", "(LCo/h;)V", "a", "Lzl/k;", "b", "Lsp/Y;", "c", "Lir/a;", "Lpv/B;", "Lpr/c;", "d", "Lpv/B;", "_summaryFlow", "Lpv/P;", "e", "Lpv/P;", "p", "()Lpv/P;", "summaryFlow", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pr.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16493d extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k featureManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Y productStateRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14846a subscriptionRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<SubscriptionSummaryDecorator> _summaryFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<SubscriptionSummaryDecorator> summaryFlow;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lsp/b;", "LCo/h;", "kotlin.jvm.PlatformType", "productStates", "Lcr/j;", "subscriptions", "Lpr/c;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)Lpr/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.summary.SubscriptionSummaryViewModel$1", f = "SubscriptionSummaryViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: pr.d$a */
    static final class a extends SuspendLambda implements Function3<List<? extends ProductState<ProductFullDetails>>, List<? extends SubscriptionDetails>, Continuation<? super SubscriptionSummaryDecorator>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157082a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f157083b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f157084c;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<ProductState<ProductFullDetails>> list, List<SubscriptionDetails> list2, Continuation<? super SubscriptionSummaryDecorator> continuation) {
            a aVar = C16493d.this.new a(continuation);
            aVar.f157083b = list;
            aVar.f157084c = list2;
            return aVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            IntrinsicsKt.f();
            if (this.f157082a == 0) {
                ResultKt.b(obj);
                List list = (List) this.f157083b;
                List list2 = (List) this.f157084c;
                Intrinsics.g(list);
                ProductState c17116b = (ProductState) CollectionsKt.u0(list);
                if (c17116b == null || !C16493d.this.featureManager.e(AbstractC18503f.Z.f172865h)) {
                    return null;
                }
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.e(((SubscriptionDetails) next).getProductInfo().getProductCode(), ((ProductFullDetails) c17116b.g()).getCode())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                SubscriptionDetails subscriptionDetails = (SubscriptionDetails) next;
                if (!C16493d.this.q(c17116b.getEligibility()) && (subscriptionDetails == null || !subscriptionDetails.getIsActive())) {
                    return null;
                }
                return new SubscriptionSummaryDecorator((ProductFullDetails) c17116b.g(), new AbstractC16490a.CreateSubscription(c17116b.g()), subscriptionDetails, EnumC16491b.f157069d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpr/c;", "newSummary", "", "<anonymous>", "(Lpr/c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.summary.SubscriptionSummaryViewModel$2", f = "SubscriptionSummaryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pr.d$b */
    static final class b extends SuspendLambda implements Function2<SubscriptionSummaryDecorator, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157086a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f157087b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C16493d.this.new b(continuation);
            bVar.f157087b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SubscriptionSummaryDecorator subscriptionSummaryDecorator, Continuation<? super Unit> continuation) {
            return ((b) create(subscriptionSummaryDecorator, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f157086a == 0) {
                ResultKt.b(obj);
                C16493d.this._summaryFlow.setValue((SubscriptionSummaryDecorator) this.f157087b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C16493d(k featureManager, Y productStateRepository, C14846a subscriptionRepository) {
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(productStateRepository, "productStateRepository");
        Intrinsics.j(subscriptionRepository, "subscriptionRepository");
        this.featureManager = featureManager;
        this.productStateRepository = productStateRepository;
        this.subscriptionRepository = subscriptionRepository;
        InterfaceC16549B<SubscriptionSummaryDecorator> interfaceC16549BA = S.a(null);
        this._summaryFlow = interfaceC16549BA;
        this.summaryFlow = C16563h.c(interfaceC16549BA);
        C16563h.J(C16563h.O(C16563h.r(C16563h.l(h.b(productStateRepository.Y0()), subscriptionRepository.d(), new a(null))), new b(null)), d0.a(this));
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
        if (!Intrinsics.e(eligibility.k(), ProductEligibility.a.C2660a.f167269a) && !Intrinsics.e(eligibility.k(), ProductEligibility.a.c.f167271a)) {
            return false;
        }
        return true;
    }
}
