package pp;

import Tq.j;
import ei.InterfaceC13669f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qp.InterfaceC16595c;
import qp.InterfaceC16596d;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u001f\u0010 J \u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#2\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00101¨\u00062"}, d2 = {"Lpp/c;", "", "LCs/b;", "userProvider", "LTq/j;", "storeProvider", "Lqp/d;", "criteoSponsoredProductsListApi", "Lqp/c;", "criteoSponsoredProductsApi", "Lei/f;", "experienceCloudIdProvider", "Lqv/K;", "ioDispatcher", "<init>", "(LCs/b;LTq/j;Lqp/d;Lqp/c;Lei/f;Lqv/K;)V", "", "query", "", "isDepartmentSearch", "filters", "", "Lpp/f;", "f", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmk/f;", "product", "department", "", "price", "isAvailable", "g", "(Lmk/f;Ljava/lang/String;DZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpp/b;", "criteoOrder", "Lkotlin/Result;", "", "h", "(Lpp/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LCs/b;", "b", "LTq/j;", "c", "Lqp/d;", "d", "Lqp/c;", "e", "Lei/f;", "Lqv/K;", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: pp.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16348c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16596d criteoSponsoredProductsListApi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16595c criteoSponsoredProductsApi;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13669f experienceCloudIdProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lpp/f;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.sponsored.CriteoSponsorshipsDataSource$getSponsoredProducts$2", f = "CriteoSponsorshipsDataSource.kt", l = {62, 61, 71, 70}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: pp.c$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends SponsoredProduct>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f156173a;

        /* renamed from: b, reason: collision with root package name */
        Object f156174b;

        /* renamed from: c, reason: collision with root package name */
        Object f156175c;

        /* renamed from: d, reason: collision with root package name */
        Object f156176d;

        /* renamed from: e, reason: collision with root package name */
        Object f156177e;

        /* renamed from: f, reason: collision with root package name */
        int f156178f;

        /* renamed from: g, reason: collision with root package name */
        int f156179g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f156180h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f156181i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C16348c f156182j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f156183k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f156184l;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends SponsoredProduct>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<SponsoredProduct>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, C16348c c16348c, String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f156181i = z10;
            this.f156182j = c16348c;
            this.f156183k = str;
            this.f156184l = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f156181i, this.f156182j, this.f156183k, this.f156184l, continuation);
            aVar.f156180h = obj;
            return aVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<SponsoredProduct>> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0100, code lost:
        
            if (r0 != r13) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0163, code lost:
        
            if (r0 != r13) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x016e A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:9:0x0021, B:55:0x0166, B:56:0x0168, B:58:0x016e, B:59:0x017c, B:60:0x0181, B:16:0x004d, B:48:0x012c, B:52:0x0132, B:19:0x0060, B:41:0x0103, B:22:0x0081, B:31:0x00c4, B:35:0x00ca, B:25:0x009c, B:27:0x00a1, B:44:0x010a), top: B:80:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x017c A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:9:0x0021, B:55:0x0166, B:56:0x0168, B:58:0x016e, B:59:0x017c, B:60:0x0181, B:16:0x004d, B:48:0x012c, B:52:0x0132, B:19:0x0060, B:41:0x0103, B:22:0x0081, B:31:0x00c4, B:35:0x00ca, B:25:0x009c, B:27:0x00a1, B:44:0x010a), top: B:80:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0270  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r82) {
            /*
                Method dump skipped, instructions count: 632
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pp.C16348c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.sponsored.CriteoSponsorshipsDataSource", f = "CriteoSponsorshipsDataSource.kt", l = {104, 103}, m = "getSponsoredProducts")
    /* renamed from: pp.c$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f156185a;

        /* renamed from: b, reason: collision with root package name */
        Object f156186b;

        /* renamed from: c, reason: collision with root package name */
        Object f156187c;

        /* renamed from: d, reason: collision with root package name */
        Object f156188d;

        /* renamed from: e, reason: collision with root package name */
        double f156189e;

        /* renamed from: f, reason: collision with root package name */
        boolean f156190f;

        /* renamed from: g, reason: collision with root package name */
        int f156191g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f156192h;

        /* renamed from: j, reason: collision with root package name */
        int f156194j;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f156192h = obj;
            this.f156194j |= Integer.MIN_VALUE;
            return C16348c.this.g(null, null, 0.0d, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.sponsored.CriteoSponsorshipsDataSource", f = "CriteoSponsorshipsDataSource.kt", l = {126}, m = "sendOrderInfoToCriteo-gIAlu-s")
    /* renamed from: pp.c$c, reason: collision with other inner class name */
    static final class C2424c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f156195a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f156196b;

        /* renamed from: d, reason: collision with root package name */
        int f156198d;

        C2424c(Continuation<? super C2424c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f156196b = obj;
            this.f156198d |= Integer.MIN_VALUE;
            Object objH = C16348c.this.h(null, this);
            return objH == IntrinsicsKt.f() ? objH : Result.a(objH);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Lkotlin/Result;", "", "<anonymous>", "(Lqv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.sponsored.CriteoSponsorshipsDataSource$sendOrderInfoToCriteo$2", f = "CriteoSponsorshipsDataSource.kt", l = {130, 128}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: pp.c$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Result<? extends Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f156199a;

        /* renamed from: b, reason: collision with root package name */
        Object f156200b;

        /* renamed from: c, reason: collision with root package name */
        Object f156201c;

        /* renamed from: d, reason: collision with root package name */
        Object f156202d;

        /* renamed from: e, reason: collision with root package name */
        Object f156203e;

        /* renamed from: f, reason: collision with root package name */
        int f156204f;

        /* renamed from: g, reason: collision with root package name */
        int f156205g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f156206h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ CriteoOrder f156208j;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Result<? extends Unit>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super Result<Unit>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CriteoOrder criteoOrder, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f156208j = criteoOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C16348c.this.new d(this.f156208j, continuation);
            dVar.f156206h = obj;
            return dVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super Result<Unit>> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(24:0|2|(6:(1:(6:6|80|7|8|62|(5:64|72|(2:74|(1:76)(1:77))|78|79)(2:65|66))(2:11|12))(4:13|81|14|15)|71|72|(0)|78|79)(5:18|83|19|(1:22)|60)|87|23|(1:25)|29|(2:32|30)|89|34|(6:38|(1:40)(1:41)|42|43|35|36)|90|44|45|(6:48|(1:50)(1:52)|51|53|54|46)|91|55|56|57|85|58|(3:61|62|(0)(0))|60|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x01bb, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01bc, code lost:
        
            r1 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01be, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x01bf, code lost:
        
            r15 = r3;
         */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01aa A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001a, B:62:0x01a2, B:64:0x01aa, B:65:0x01b5, B:66:0x01ba), top: B:80:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01b5 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001a, B:62:0x01a2, B:64:0x01aa, B:65:0x01b5, B:66:0x01ba), top: B:80:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01d3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 519
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pp.C16348c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C16348c(Cs.b userProvider, j storeProvider, InterfaceC16596d criteoSponsoredProductsListApi, InterfaceC16595c criteoSponsoredProductsApi, InterfaceC13669f experienceCloudIdProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(criteoSponsoredProductsListApi, "criteoSponsoredProductsListApi");
        Intrinsics.j(criteoSponsoredProductsApi, "criteoSponsoredProductsApi");
        Intrinsics.j(experienceCloudIdProvider, "experienceCloudIdProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.userProvider = userProvider;
        this.storeProvider = storeProvider;
        this.criteoSponsoredProductsListApi = criteoSponsoredProductsListApi;
        this.criteoSponsoredProductsApi = criteoSponsoredProductsApi;
        this.experienceCloudIdProvider = experienceCloudIdProvider;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object f(String str, boolean z10, String str2, Continuation<? super List<SponsoredProduct>> continuation) {
        return C16644i.g(this.ioDispatcher, new a(z10, this, str, str2, null), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:7))(0)|8|67|(1:(1:(5:12|13|14|37|(5:39|47|(8:71|49|(1:51)(1:54)|(1:56)|57|(2:60|58)|73|61)(1:64)|65|66)(2:42|43))(2:17|18))(3:19|20|21))(3:22|23|(2:25|35)(1:26))|27|(1:29)|30|69|31|32|68|33|(1:74)(3:36|37|(0)(0))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0105, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010e, code lost:
    
        r2 = null;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0110, code lost:
    
        r3 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.b(kotlin.ResultKt.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7 A[Catch: all -> 0x0105, TryCatch #1 {all -> 0x0105, blocks: (B:37:0x00ef, B:39:0x00f7, B:42:0x0107, B:43:0x010c, B:33:0x00e7), top: B:68:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107 A[Catch: all -> 0x0105, TryCatch #1 {all -> 0x0105, blocks: (B:37:0x00ef, B:39:0x00f7, B:42:0x0107, B:43:0x010c, B:33:0x00e7), top: B:68:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182 A[PHI: r0
      0x0182: PHI (r0v12 java.lang.Object) = (r0v6 java.lang.Object), (r0v8 java.lang.Object) binds: [B:48:0x011e, B:63:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(mk.f r22, java.lang.String r23, double r24, boolean r26, kotlin.coroutines.Continuation<? super java.util.List<pp.SponsoredProduct>> r27) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.C16348c.g(mk.f, java.lang.String, double, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(pp.CriteoOrder r6, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pp.C16348c.C2424c
            if (r0 == 0) goto L13
            r0 = r7
            pp.c$c r0 = (pp.C16348c.C2424c) r0
            int r1 = r0.f156198d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156198d = r1
            goto L18
        L13:
            pp.c$c r0 = new pp.c$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f156196b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f156198d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f156195a
            pp.b r6 = (pp.CriteoOrder) r6
            kotlin.ResultKt.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            qv.K r7 = r5.ioDispatcher
            pp.c$d r2 = new pp.c$d
            r4 = 0
            r2.<init>(r6, r4)
            r0.f156195a = r6
            r0.f156198d = r3
            java.lang.Object r7 = qv.C16644i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.C16348c.h(pp.b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
