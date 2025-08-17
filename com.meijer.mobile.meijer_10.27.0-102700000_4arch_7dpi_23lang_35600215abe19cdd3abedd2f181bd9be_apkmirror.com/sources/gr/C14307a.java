package gr;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import cr.SubscriptionDetails;
import dr.SubscriptionProductRequest;
import er.InterfaceC13751a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;
import retrofit2.HttpException;
import yl.k;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lgr/a;", "", "Ler/a;", "subscriptionsApi", "LXi/a;", "authTokenProvider", "Lqv/K;", "ioDispatcher", "Lyl/k;", "featureManager", "<init>", "(Ler/a;LXi/a;Lqv/K;Lyl/k;)V", "T", "Lkotlin/Result;", "Lkotlin/Function1;", "Lretrofit2/HttpException;", "default", "g", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ldr/g;", "subscriptionProductRequest", "Lcr/j;", "e", "(Ldr/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ler/a;", "b", "LXi/a;", "c", "Lqv/K;", "d", "Lyl/k;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gr.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14307a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13751a subscriptionsApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Xi.a authTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k featureManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcr/j;", "<anonymous>", "(Lqv/O;)Lcr/j;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.service.datasource.SubscriptionDataSource$addSubscriptionByProduct$2", f = "SubscriptionDataSource.kt", l = {59, 58}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: gr.a$a, reason: collision with other inner class name */
    static final class C2116a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super SubscriptionDetails>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f134061a;

        /* renamed from: b, reason: collision with root package name */
        int f134062b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SubscriptionProductRequest f134064d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2116a(SubscriptionProductRequest subscriptionProductRequest, Continuation<? super C2116a> continuation) {
            super(2, continuation);
            this.f134064d = subscriptionProductRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14307a.this.new C2116a(this.f134064d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super SubscriptionDetails> continuation) {
            return ((C2116a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f134062b
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.ResultKt.b(r6)
                goto L50
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                java.lang.Object r1 = r5.f134061a
                er.a r1 = (er.InterfaceC13751a) r1
                kotlin.ResultKt.b(r6)
                goto L3d
            L23:
                kotlin.ResultKt.b(r6)
                gr.a r6 = gr.C14307a.this
                er.a r1 = gr.C14307a.c(r6)
                gr.a r6 = gr.C14307a.this
                Xi.a r6 = gr.C14307a.a(r6)
                r5.f134061a = r1
                r5.f134062b = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3d
                goto L4f
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                dr.g r4 = r5.f134064d
                com.meijer.mobile.subscription.service.api.models.SubscriptionProductRequestJson r4 = fr.C13946p.a(r4)
                r5.f134061a = r2
                r5.f134062b = r3
                java.lang.Object r6 = r1.a(r6, r4, r5)
                if (r6 != r0) goto L50
            L4f:
                return r0
            L50:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L68
                java.lang.Object r6 = r6.body()
                com.meijer.mobile.subscription.service.api.models.SubscriptionDetailsResponseJson r6 = (com.meijer.mobile.subscription.service.api.models.SubscriptionDetailsResponseJson) r6
                if (r6 == 0) goto L64
                cr.j r2 = fr.C13945o.a(r6)
            L64:
                kotlin.jvm.internal.Intrinsics.g(r2)
                return r2
            L68:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: gr.C14307a.C2116a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lcr/j;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.service.datasource.SubscriptionDataSource$getAllSubscriptions$2", f = "SubscriptionDataSource.kt", l = {101, HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: gr.a$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends SubscriptionDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f134065a;

        /* renamed from: b, reason: collision with root package name */
        Object f134066b;

        /* renamed from: c, reason: collision with root package name */
        Object f134067c;

        /* renamed from: d, reason: collision with root package name */
        Object f134068d;

        /* renamed from: e, reason: collision with root package name */
        Object f134069e;

        /* renamed from: f, reason: collision with root package name */
        Object f134070f;

        /* renamed from: g, reason: collision with root package name */
        int f134071g;

        /* renamed from: h, reason: collision with root package name */
        int f134072h;

        /* renamed from: i, reason: collision with root package name */
        int f134073i;

        /* renamed from: j, reason: collision with root package name */
        int f134074j;

        /* renamed from: k, reason: collision with root package name */
        int f134075k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f134076l;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends SubscriptionDetails>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<SubscriptionDetails>>) continuation);
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C14307a.this.new b(continuation);
            bVar.f134076l = obj;
            return bVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<SubscriptionDetails>> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00e3, code lost:
        
            if (r4 == r0) goto L29;
         */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v11 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gr.C14307a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(HttpException httpException) {
            return CollectionsKt.m();
        }
    }

    public C14307a(InterfaceC13751a subscriptionsApi, Xi.a authTokenProvider, AbstractC16618K ioDispatcher, k featureManager) {
        Intrinsics.j(subscriptionsApi, "subscriptionsApi");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        Intrinsics.j(featureManager, "featureManager");
        this.subscriptionsApi = subscriptionsApi;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
        this.featureManager = featureManager;
    }

    public final Object e(SubscriptionProductRequest subscriptionProductRequest, Continuation<? super SubscriptionDetails> continuation) {
        return C16644i.g(this.ioDispatcher, new C2116a(subscriptionProductRequest, null), continuation);
    }

    public final Object f(Continuation<? super List<SubscriptionDetails>> continuation) {
        return C16644i.g(this.ioDispatcher, new b(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object g(Object obj, Function1<? super HttpException, ? extends T> function1) {
        Throwable thE = Result.e(obj);
        if (thE == null) {
            return obj;
        }
        try {
            if ((thE instanceof HttpException) && ((HttpException) thE).code() == 404) {
                return Result.b(function1.invoke(thE));
            }
            throw thE;
        } catch (Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            return Result.b(ResultKt.a(th2));
        }
    }
}
