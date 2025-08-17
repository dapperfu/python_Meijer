package qm;

import com.meijer.mobile.instoreshopping.service.store.models.SearchStoresResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\fJ2\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lqm/b;", "", "Lqm/a;", "storeAPI", "LXi/a;", "authTokenProvider", "Lqv/K;", "ioDispatcher", "<init>", "(Lqm/a;LXi/a;Lqv/K;)V", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/instoreshopping/service/store/models/SearchStoresResponse;", "e", "", "latitude", "longitude", "", "searchRadiusInMiles", "maxStores", "d", "(DDIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lqm/a;", "b", "LXi/a;", "Lqv/K;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qm.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16537b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16536a storeAPI;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Xi.a authTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.store.StoreDataSource", f = "StoreDataSource.kt", l = {53}, m = "fetchToken")
    /* renamed from: qm.b$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f157311a;

        /* renamed from: c, reason: collision with root package name */
        int f157313c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157311a = obj;
            this.f157313c |= Integer.MIN_VALUE;
            return C16537b.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/instoreshopping/service/store/models/SearchStoresResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/instoreshopping/service/store/models/SearchStoresResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.store.StoreDataSource$getNearbyStores$2", f = "StoreDataSource.kt", l = {43, 42}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: qm.b$b, reason: collision with other inner class name */
    static final class C2438b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super SearchStoresResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f157314a;

        /* renamed from: b, reason: collision with root package name */
        int f157315b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f157317d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f157318e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f157319f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f157320g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2438b(double d10, double d11, int i10, int i11, Continuation<? super C2438b> continuation) {
            super(2, continuation);
            this.f157317d = d10;
            this.f157318e = d11;
            this.f157319f = i10;
            this.f157320g = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16537b.this.new C2438b(this.f157317d, this.f157318e, this.f157319f, this.f157320g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super SearchStoresResponse> continuation) {
            return ((C2438b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            if (r13 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r12.f157315b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r13)
                goto L51
            L12:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1a:
                java.lang.Object r1 = r12.f157314a
                qm.a r1 = (qm.InterfaceC16536a) r1
                kotlin.ResultKt.b(r13)
            L21:
                r3 = r1
                goto L39
            L23:
                kotlin.ResultKt.b(r13)
                qm.b r13 = qm.C16537b.this
                qm.a r1 = qm.C16537b.b(r13)
                qm.b r13 = qm.C16537b.this
                r12.f157314a = r1
                r12.f157315b = r3
                java.lang.Object r13 = qm.C16537b.a(r13, r12)
                if (r13 != r0) goto L21
                goto L50
            L39:
                r4 = r13
                com.meijer.mobile.authentication.core.model.BearerToken r4 = (com.meijer.mobile.authentication.core.model.BearerToken) r4
                double r5 = r12.f157317d
                double r7 = r12.f157318e
                int r9 = r12.f157319f
                int r10 = r12.f157320g
                r13 = 0
                r12.f157314a = r13
                r12.f157315b = r2
                r11 = r12
                java.lang.Object r13 = r3.a(r4, r5, r7, r9, r10, r11)
                if (r13 != r0) goto L51
            L50:
                return r0
            L51:
                retrofit2.Response r13 = (retrofit2.Response) r13
                boolean r0 = r13.isSuccessful()
                if (r0 == 0) goto L61
                java.lang.Object r13 = r13.body()
                kotlin.jvm.internal.Intrinsics.g(r13)
                return r13
            L61:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r13)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qm.C16537b.C2438b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/instoreshopping/service/store/models/SearchStoresResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/instoreshopping/service/store/models/SearchStoresResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.store.StoreDataSource$getStores$2", f = "StoreDataSource.kt", l = {31, 31}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: qm.b$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super SearchStoresResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f157321a;

        /* renamed from: b, reason: collision with root package name */
        int f157322b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16537b.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super SearchStoresResponse> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f157322b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L46
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f157321a
                qm.a r1 = (qm.InterfaceC16536a) r1
                kotlin.ResultKt.b(r5)
                goto L38
            L22:
                kotlin.ResultKt.b(r5)
                qm.b r5 = qm.C16537b.this
                qm.a r1 = qm.C16537b.b(r5)
                qm.b r5 = qm.C16537b.this
                r4.f157321a = r1
                r4.f157322b = r3
                java.lang.Object r5 = qm.C16537b.a(r5, r4)
                if (r5 != r0) goto L38
                goto L45
            L38:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f157321a = r3
                r4.f157322b = r2
                java.lang.Object r5 = r1.b(r5, r4)
                if (r5 != r0) goto L46
            L45:
                return r0
            L46:
                retrofit2.Response r5 = (retrofit2.Response) r5
                boolean r0 = r5.isSuccessful()
                if (r0 == 0) goto L56
                java.lang.Object r5 = r5.body()
                kotlin.jvm.internal.Intrinsics.g(r5)
                return r5
            L56:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qm.C16537b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C16537b(InterfaceC16536a storeAPI, Xi.a authTokenProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(storeAPI, "storeAPI");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.storeAPI = storeAPI;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super com.meijer.mobile.authentication.core.model.BearerToken> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof qm.C16537b.a
            if (r0 == 0) goto L13
            r0 = r5
            qm.b$a r0 = (qm.C16537b.a) r0
            int r1 = r0.f157313c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157313c = r1
            goto L18
        L13:
            qm.b$a r0 = new qm.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f157311a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157313c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            Xi.a r5 = r4.authTokenProvider
            io.reactivex.l r5 = r5.a()
            tv.f r5 = xv.h.b(r5)
            qv.K r2 = r4.ioDispatcher
            tv.f r5 = tv.C17154h.H(r5, r2)
            r0.f157313c = r3
            java.lang.Object r5 = tv.C17154h.W(r5, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            java.lang.String r0 = "single(...)"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.C16537b.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d(double d10, double d11, int i10, int i11, Continuation<? super SearchStoresResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new C2438b(d10, d11, i10, i11, null), continuation);
    }

    public final Object e(Continuation<? super SearchStoresResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new c(null), continuation);
    }
}
