package pm;

import com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequest;
import com.meijer.mobile.instoreshopping.service.productimages.model.response.EDaAItemDetailsResponse;
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
import mv.AbstractC15779K;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lpm/e;", "", "Lpm/d;", "productImagesAPI", "Lpm/a;", "eDaAProductImagesAPI", "LYi/a;", "authTokenProvider", "Lmv/K;", "ioDispatcher", "<init>", "(Lpm/d;Lpm/a;LYi/a;Lmv/K;)V", "Lcom/meijer/mobile/instoreshopping/service/productimages/model/request/EDaAProductImageRequest;", "request", "Lkotlin/Result;", "", "Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/EDaAItemDetailsResponse;", "c", "(Lcom/meijer/mobile/instoreshopping/service/productimages/model/request/EDaAProductImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lpm/d;", "b", "Lpm/a;", "LYi/a;", "d", "Lmv/K;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pm.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C16468e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16467d productImagesAPI;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16464a eDaAProductImagesAPI;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Yi.a authTokenProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.productimages.ProductImagesDataSource", f = "ProductImagesDataSource.kt", l = {52}, m = "getEDaAProductImage-gIAlu-s")
    /* renamed from: pm.e$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f156773a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f156774b;

        /* renamed from: d, reason: collision with root package name */
        int f156776d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f156774b = obj;
            this.f156776d |= Integer.MIN_VALUE;
            Object objC = C16468e.this.c(null, this);
            return objC == IntrinsicsKt.f() ? objC : Result.a(objC);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmv/O;", "Lkotlin/Result;", "", "Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/EDaAItemDetailsResponse;", "<anonymous>", "(Lmv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.productimages.ProductImagesDataSource$getEDaAProductImage$2", f = "ProductImagesDataSource.kt", l = {53, 53}, m = "invokeSuspend")
    /* renamed from: pm.e$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Result<? extends List<? extends EDaAItemDetailsResponse>>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f156777a;

        /* renamed from: b, reason: collision with root package name */
        int f156778b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EDaAProductImageRequest f156780d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Result<? extends List<? extends EDaAItemDetailsResponse>>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super Result<? extends List<EDaAItemDetailsResponse>>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EDaAProductImageRequest eDaAProductImageRequest, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f156780d = eDaAProductImageRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16468e.this.new b(this.f156780d, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super Result<? extends List<EDaAItemDetailsResponse>>> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
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
                int r1 = r5.f156778b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f156777a
                pm.a r1 = (pm.InterfaceC16464a) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                pm.e r6 = pm.C16468e.this
                pm.a r1 = pm.C16468e.b(r6)
                pm.e r6 = pm.C16468e.this
                Yi.a r6 = pm.C16468e.a(r6)
                r5.f156777a = r1
                r5.f156778b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequest r3 = r5.f156780d
                r4 = 0
                r5.f156777a = r4
                r5.f156778b = r2
                java.lang.Object r6 = r1.a(r6, r3, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r6 = (retrofit2.Response) r6
                java.lang.Object r6 = tm.C17273a.a(r6)
                kotlin.Result r6 = kotlin.Result.a(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pm.C16468e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C16468e(InterfaceC16467d productImagesAPI, InterfaceC16464a eDaAProductImagesAPI, Yi.a authTokenProvider, AbstractC15779K ioDispatcher) {
        Intrinsics.j(productImagesAPI, "productImagesAPI");
        Intrinsics.j(eDaAProductImagesAPI, "eDaAProductImagesAPI");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.productImagesAPI = productImagesAPI;
        this.eDaAProductImagesAPI = eDaAProductImagesAPI;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequest r6, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.meijer.mobile.instoreshopping.service.productimages.model.response.EDaAItemDetailsResponse>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pm.C16468e.a
            if (r0 == 0) goto L13
            r0 = r7
            pm.e$a r0 = (pm.C16468e.a) r0
            int r1 = r0.f156776d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156776d = r1
            goto L18
        L13:
            pm.e$a r0 = new pm.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f156774b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f156776d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f156773a
            com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequest r6 = (com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequest) r6
            kotlin.ResultKt.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            mv.K r7 = r5.ioDispatcher
            pm.e$b r2 = new pm.e$b
            r4 = 0
            r2.<init>(r6, r4)
            r0.f156773a = r6
            r0.f156776d = r3
            java.lang.Object r7 = mv.C15805i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.C16468e.c(com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
