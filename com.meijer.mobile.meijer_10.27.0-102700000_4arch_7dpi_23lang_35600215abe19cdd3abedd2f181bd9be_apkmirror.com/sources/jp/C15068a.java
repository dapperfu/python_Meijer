package jp;

import Co.ProductFullDetails;
import Tq.j;
import ei.InterfaceC13669f;
import io.constructor.data.model.common.ResultData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kp.InterfaceC15297a;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;
import retrofit2.HttpException;
import retrofit2.Response;
import yl.AbstractC18227f;
import yl.k;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 *2\u00020\u0001:\u0001,BE\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0086@¢\u0006\u0004\b\u001f\u0010 J0\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0086@¢\u0006\u0004\b!\u0010 J4\u0010#\u001a\f\u0012\b\u0012\u00060\u0014j\u0002`\"0\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0086@¢\u0006\u0004\b#\u0010 J4\u0010%\u001a\f\u0012\b\u0012\u00060\u0014j\u0002`\"0\u001d2\u0006\u0010$\u001a\u00020\u00142\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0086@¢\u0006\u0004\b%\u0010&J0\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\n\u0010'\u001a\u00060\u0014j\u0002`\"2\f\b\u0002\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0086@¢\u0006\u0004\b(\u0010)J0\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\n\u0010'\u001a\u00060\u0014j\u0002`\"2\f\b\u0002\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0086@¢\u0006\u0004\b*\u0010)J0\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\n\u0010'\u001a\u00060\u0014j\u0002`\"2\f\b\u0002\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0086@¢\u0006\u0004\b+\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Ljp/a;", "", "Lkp/a;", "productRecommendationApi", "LXi/a;", "userTokenProvider", "LCs/b;", "userProvider", "LTq/j;", "storeProvider", "Lei/f;", "experienceCloudIdProvider", "Lyl/k;", "featureManager", "Lqv/K;", "ioDispatcher", "<init>", "(Lkp/a;LXi/a;LCs/b;LTq/j;Lei/f;Lyl/k;Lqv/K;)V", "Lmk/d;", "type", "", "s", "(Lmk/d;)Ljava/lang/String;", "i", "t", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "LCo/h;", "n", "(Lmk/d;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "Lcom/meijer/mobile/core/models/products/ProductCode;", "j", "recommendationType", "l", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upc", "r", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "u", "a", "Lkp/a;", "b", "LXi/a;", "c", "LCs/b;", "d", "LTq/j;", "e", "Lei/f;", "f", "Lyl/k;", "g", "Lqv/K;", "recommendations_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15068a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15297a productRecommendationApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Xi.a userTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13669f experienceCloudIdProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k featureManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LCo/h;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.recommendations.ProductRecommendationsDataSource$getFrequentlyBoughtTogether$2", f = "ProductRecommendationsDataSource.kt", l = {180}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: jp.a$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductFullDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f140840a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f140842c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f140843d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductFullDetails>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<ProductFullDetails>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f140842c = str;
            this.f140843d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C15068a.this.new c(this.f140842c, this.f140843d, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductFullDetails>> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f140840a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15297a interfaceC15297a = C15068a.this.productRecommendationApi;
                String str = this.f140842c;
                int i11 = this.f140843d;
                this.f140840a = 1;
                obj = interfaceC15297a.e(str, i11, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.g(objBody);
                Iterable iterable = (Iterable) objBody;
                int i12 = this.f140843d;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Bo.c.d((ResultData) it.next(), i12, null, 2, null));
                }
                return arrayList;
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.recommendations.ProductRecommendationsDataSource$getProductRecommendationUpcs$2", f = "ProductRecommendationsDataSource.kt", l = {105, 104}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: jp.a$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends String>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f140844a;

        /* renamed from: b, reason: collision with root package name */
        int f140845b;

        /* renamed from: c, reason: collision with root package name */
        Object f140846c;

        /* renamed from: d, reason: collision with root package name */
        Object f140847d;

        /* renamed from: e, reason: collision with root package name */
        Object f140848e;

        /* renamed from: f, reason: collision with root package name */
        Object f140849f;

        /* renamed from: g, reason: collision with root package name */
        int f140850g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Integer f140851h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C15068a f140852i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ mk.d f140853j;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends String>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<String>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Integer num, C15068a c15068a, mk.d dVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f140851h = num;
            this.f140852i = c15068a;
            this.f140853j = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f140851h, this.f140852i, this.f140853j, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<String>> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
        
            if (r13 == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                Method dump skipped, instructions count: 219
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.C15068a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqv/O;", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.recommendations.ProductRecommendationsDataSource$getProductRecommendationUpcsV2$2", f = "ProductRecommendationsDataSource.kt", l = {137, 136}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: jp.a$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends String>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f140854a;

        /* renamed from: b, reason: collision with root package name */
        int f140855b;

        /* renamed from: c, reason: collision with root package name */
        Object f140856c;

        /* renamed from: d, reason: collision with root package name */
        Object f140857d;

        /* renamed from: e, reason: collision with root package name */
        Object f140858e;

        /* renamed from: f, reason: collision with root package name */
        int f140859f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Integer f140860g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C15068a f140861h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f140862i;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends String>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<String>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Integer num, C15068a c15068a, String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f140860g = num;
            this.f140861h = c15068a;
            this.f140862i = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f140860g, this.f140861h, this.f140862i, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<String>> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
        
            if (r12 == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f140859f
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L36
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r11.f140856c
                java.lang.String r0 = (java.lang.String) r0
                kotlin.ResultKt.b(r12)
                goto Laf
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L20:
                int r1 = r11.f140855b
                int r3 = r11.f140854a
                java.lang.Object r5 = r11.f140858e
                kp.a r5 = (kp.InterfaceC15297a) r5
                java.lang.Object r6 = r11.f140857d
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r11.f140856c
                java.lang.String r7 = (java.lang.String) r7
                kotlin.ResultKt.b(r12)
                r9 = r3
            L34:
                r8 = r7
                goto L88
            L36:
                kotlin.ResultKt.b(r12)
                java.lang.Integer r12 = r11.f140860g
                if (r12 == 0) goto L42
                int r12 = r12.intValue()
                goto L4c
            L42:
                jp.a r12 = r11.f140861h
                Tq.j r12 = jp.C15068a.e(r12)
                int r12 = r12.g()
            L4c:
                jp.a r1 = r11.f140861h
                Cs.b r1 = jp.C15068a.f(r1)
                java.lang.String r1 = r1.a()
                if (r1 == 0) goto L61
                boolean r5 = kotlin.text.StringsKt.r0(r1)
                if (r5 == 0) goto L5f
                goto L61
            L5f:
                r6 = r1
                goto L62
            L61:
                r6 = r4
            L62:
                if (r6 == 0) goto Lca
                jp.a r1 = r11.f140861h
                java.lang.String r7 = r11.f140862i
                kp.a r5 = jp.C15068a.b(r1)
                Xi.a r1 = jp.C15068a.g(r1)
                r11.f140856c = r7
                r11.f140857d = r6
                r11.f140858e = r5
                r11.f140854a = r12
                r8 = 0
                r11.f140855b = r8
                r11.f140859f = r3
                java.lang.Object r1 = r1.c(r11)
                if (r1 != r0) goto L84
                goto Lae
            L84:
                r9 = r12
                r12 = r1
                r1 = r8
                goto L34
            L88:
                com.meijer.mobile.authentication.core.model.BearerToken r12 = (com.meijer.mobile.authentication.core.model.BearerToken) r12
                java.util.Locale r3 = java.util.Locale.ROOT
                java.lang.String r7 = "ROOT"
                kotlin.jvm.internal.Intrinsics.i(r3, r7)
                java.lang.String r7 = r6.toUpperCase(r3)
                java.lang.String r3 = "toUpperCase(...)"
                kotlin.jvm.internal.Intrinsics.i(r7, r3)
                r11.f140856c = r6
                r11.f140857d = r4
                r11.f140858e = r4
                r11.f140854a = r9
                r11.f140855b = r1
                r11.f140859f = r2
                r10 = r11
                r6 = r12
                java.lang.Object r12 = r5.c(r6, r7, r8, r9, r10)
                if (r12 != r0) goto Laf
            Lae:
                return r0
            Laf:
                retrofit2.Response r12 = (retrofit2.Response) r12
                boolean r0 = r12.isSuccessful()
                if (r0 == 0) goto Lc4
                java.lang.Object r12 = r12.body()
                kotlin.jvm.internal.Intrinsics.g(r12)
                java.util.List r12 = (java.util.List) r12
                if (r12 != 0) goto Lc3
                goto Lca
            Lc3:
                return r12
            Lc4:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r12)
                throw r0
            Lca:
                java.util.List r12 = kotlin.collections.CollectionsKt.m()
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.C15068a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LCo/h;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.recommendations.ProductRecommendationsDataSource$getProductRecommendations$2", f = "ProductRecommendationsDataSource.kt", l = {58, 63, 57}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: jp.a$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductFullDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f140863a;

        /* renamed from: b, reason: collision with root package name */
        int f140864b;

        /* renamed from: c, reason: collision with root package name */
        Object f140865c;

        /* renamed from: d, reason: collision with root package name */
        Object f140866d;

        /* renamed from: e, reason: collision with root package name */
        Object f140867e;

        /* renamed from: f, reason: collision with root package name */
        Object f140868f;

        /* renamed from: g, reason: collision with root package name */
        Object f140869g;

        /* renamed from: h, reason: collision with root package name */
        int f140870h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f140871i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C15068a f140872j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ mk.d f140873k;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductFullDetails>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<ProductFullDetails>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Integer num, C15068a c15068a, mk.d dVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f140871i = num;
            this.f140872j = c15068a;
            this.f140873k = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f140871i, this.f140872j, this.f140873k, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductFullDetails>> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                Method dump skipped, instructions count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.C15068a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LCo/h;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.recommendations.ProductRecommendationsDataSource$getProductRecommendationsV2$2", f = "ProductRecommendationsDataSource.kt", l = {88, 93, 87}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: jp.a$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductFullDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f140874a;

        /* renamed from: b, reason: collision with root package name */
        int f140875b;

        /* renamed from: c, reason: collision with root package name */
        Object f140876c;

        /* renamed from: d, reason: collision with root package name */
        Object f140877d;

        /* renamed from: e, reason: collision with root package name */
        Object f140878e;

        /* renamed from: f, reason: collision with root package name */
        Object f140879f;

        /* renamed from: g, reason: collision with root package name */
        Object f140880g;

        /* renamed from: h, reason: collision with root package name */
        int f140881h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f140882i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C15068a f140883j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ mk.d f140884k;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductFullDetails>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<ProductFullDetails>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Integer num, C15068a c15068a, mk.d dVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f140882i = num;
            this.f140883j = c15068a;
            this.f140884k = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f140882i, this.f140883j, this.f140884k, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductFullDetails>> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.C15068a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LCo/h;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.recommendations.ProductRecommendationsDataSource$getProductSuggestions$2", f = "ProductRecommendationsDataSource.kt", l = {170, 169}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: jp.a$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductFullDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f140885a;

        /* renamed from: b, reason: collision with root package name */
        int f140886b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f140888d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f140889e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductFullDetails>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<ProductFullDetails>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, String str, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f140888d = i10;
            this.f140889e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C15068a.this.new h(this.f140888d, this.f140889e, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductFullDetails>> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f140886b
                r2 = 1
                r3 = 0
                r4 = 2
                if (r1 == 0) goto L23
                if (r1 == r2) goto L1b
                if (r1 != r4) goto L13
                kotlin.ResultKt.b(r7)
                goto L4e
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.f140885a
                kp.a r1 = (kp.InterfaceC15297a) r1
                kotlin.ResultKt.b(r7)
                goto L3d
            L23:
                kotlin.ResultKt.b(r7)
                jp.a r7 = jp.C15068a.this
                kp.a r1 = jp.C15068a.b(r7)
                jp.a r7 = jp.C15068a.this
                Xi.a r7 = jp.C15068a.g(r7)
                r6.f140885a = r1
                r6.f140886b = r2
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L3d
                goto L4d
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r7 = (com.meijer.mobile.authentication.core.model.BearerToken) r7
                int r2 = r6.f140888d
                java.lang.String r5 = r6.f140889e
                r6.f140885a = r3
                r6.f140886b = r4
                java.lang.Object r7 = r1.d(r7, r2, r5, r6)
                if (r7 != r0) goto L4e
            L4d:
                return r0
            L4e:
                retrofit2.Response r7 = (retrofit2.Response) r7
                boolean r0 = r7.isSuccessful()
                if (r0 == 0) goto L85
                java.lang.Object r7 = r7.body()
                kotlin.jvm.internal.Intrinsics.g(r7)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                int r0 = r6.f140888d
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.x(r7, r2)
                r1.<init>(r2)
                java.util.Iterator r7 = r7.iterator()
            L70:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L84
                java.lang.Object r2 = r7.next()
                io.constructor.data.model.common.ResultData r2 = (io.constructor.data.model.common.ResultData) r2
                Co.h r2 = Bo.c.d(r2, r0, r3, r4, r3)
                r1.add(r2)
                goto L70
            L84:
                return r1
            L85:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.C15068a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LCo/h;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.recommendations.ProductRecommendationsDataSource$getSuggestedAlternatives$2", f = "ProductRecommendationsDataSource.kt", l = {190, 189}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: jp.a$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductFullDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f140890a;

        /* renamed from: b, reason: collision with root package name */
        int f140891b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f140893d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f140894e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductFullDetails>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<ProductFullDetails>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, String str, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f140893d = i10;
            this.f140894e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C15068a.this.new i(this.f140893d, this.f140894e, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductFullDetails>> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f140891b
                r2 = 1
                r3 = 0
                r4 = 2
                if (r1 == 0) goto L23
                if (r1 == r2) goto L1b
                if (r1 != r4) goto L13
                kotlin.ResultKt.b(r7)
                goto L4e
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.f140890a
                kp.a r1 = (kp.InterfaceC15297a) r1
                kotlin.ResultKt.b(r7)
                goto L3d
            L23:
                kotlin.ResultKt.b(r7)
                jp.a r7 = jp.C15068a.this
                kp.a r1 = jp.C15068a.b(r7)
                jp.a r7 = jp.C15068a.this
                Xi.a r7 = jp.C15068a.g(r7)
                r6.f140890a = r1
                r6.f140891b = r2
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L3d
                goto L4d
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r7 = (com.meijer.mobile.authentication.core.model.BearerToken) r7
                int r2 = r6.f140893d
                java.lang.String r5 = r6.f140894e
                r6.f140890a = r3
                r6.f140891b = r4
                java.lang.Object r7 = r1.b(r7, r2, r5, r6)
                if (r7 != r0) goto L4e
            L4d:
                return r0
            L4e:
                retrofit2.Response r7 = (retrofit2.Response) r7
                boolean r0 = r7.isSuccessful()
                if (r0 == 0) goto L85
                java.lang.Object r7 = r7.body()
                kotlin.jvm.internal.Intrinsics.g(r7)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                int r0 = r6.f140893d
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.x(r7, r2)
                r1.<init>(r2)
                java.util.Iterator r7 = r7.iterator()
            L70:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L84
                java.lang.Object r2 = r7.next()
                io.constructor.data.model.common.ResultData r2 = (io.constructor.data.model.common.ResultData) r2
                Co.h r2 = Bo.c.d(r2, r0, r3, r4, r3)
                r1.add(r2)
                goto L70
            L84:
                return r1
            L85:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.C15068a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jp.a$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[mk.d.values().length];
            try {
                iArr[mk.d.f150120a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mk.d.f150121b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C15068a(InterfaceC15297a productRecommendationApi, Xi.a userTokenProvider, Cs.b userProvider, j storeProvider, InterfaceC13669f experienceCloudIdProvider, k featureManager, AbstractC16618K ioDispatcher) {
        Intrinsics.j(productRecommendationApi, "productRecommendationApi");
        Intrinsics.j(userTokenProvider, "userTokenProvider");
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(experienceCloudIdProvider, "experienceCloudIdProvider");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.productRecommendationApi = productRecommendationApi;
        this.userTokenProvider = userTokenProvider;
        this.userProvider = userProvider;
        this.storeProvider = storeProvider;
        this.experienceCloudIdProvider = experienceCloudIdProvider;
        this.featureManager = featureManager;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(mk.d type) {
        if (this.featureManager.e(AbstractC18227f.k0.f170587h) && type == mk.d.f150121b) {
            return "plp_app";
        }
        if (this.featureManager.e(AbstractC18227f.l0.f170589h) && type == mk.d.f150120a) {
            return "plp_favonsale_app";
        }
        return null;
    }

    public static /* synthetic */ Object k(C15068a c15068a, mk.d dVar, Integer num, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return c15068a.j(dVar, num, continuation);
    }

    public static /* synthetic */ Object m(C15068a c15068a, String str, Integer num, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return c15068a.l(str, num, continuation);
    }

    public static /* synthetic */ Object o(C15068a c15068a, mk.d dVar, Integer num, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return c15068a.n(dVar, num, continuation);
    }

    public static /* synthetic */ Object q(C15068a c15068a, mk.d dVar, Integer num, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return c15068a.p(dVar, num, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String s(mk.d type) {
        int i10 = b.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            return "favorites-on-sale";
        }
        if (i10 == 2) {
            return "buy-again";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(Continuation<? super String> continuation) {
        if (this.featureManager.e(AbstractC18227f.k0.f170587h) || this.featureManager.e(AbstractC18227f.l0.f170589h)) {
            return this.experienceCloudIdProvider.a(continuation);
        }
        return null;
    }

    public final Object h(String str, int i10, Continuation<? super List<ProductFullDetails>> continuation) {
        return C16644i.g(this.ioDispatcher, new c(str, i10, null), continuation);
    }

    public final Object j(mk.d dVar, Integer num, Continuation<? super List<String>> continuation) {
        return C16644i.g(this.ioDispatcher, new d(num, this, dVar, null), continuation);
    }

    public final Object l(String str, Integer num, Continuation<? super List<String>> continuation) {
        return C16644i.g(this.ioDispatcher, new e(num, this, str, null), continuation);
    }

    public final Object n(mk.d dVar, Integer num, Continuation<? super List<ProductFullDetails>> continuation) {
        return C16644i.g(this.ioDispatcher, new f(num, this, dVar, null), continuation);
    }

    public final Object p(mk.d dVar, Integer num, Continuation<? super List<ProductFullDetails>> continuation) {
        return C16644i.g(this.ioDispatcher, new g(num, this, dVar, null), continuation);
    }

    public final Object r(String str, int i10, Continuation<? super List<ProductFullDetails>> continuation) {
        return C16644i.g(this.ioDispatcher, new h(i10, str, null), continuation);
    }

    public final Object u(String str, int i10, Continuation<? super List<ProductFullDetails>> continuation) {
        return C16644i.g(this.ioDispatcher, new i(i10, str, null), continuation);
    }
}
