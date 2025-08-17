package Ml;

import Ol.PicklistItem;
import java.util.List;
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
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"LMl/b;", "", "LLl/b;", "picklistAPI", "LXi/a;", "authTokenProvider", "Lqv/K;", "ioDispatcher", "<init>", "(LLl/b;LXi/a;Lqv/K;)V", "", "storeId", "", "LOl/d;", "c", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LLl/b;", "b", "LXi/a;", "Lqv/K;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ll.b picklistAPI;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Xi.a authTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.PicklistDataSource", f = "PicklistDataSource.kt", l = {29}, m = "getPicklist")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f19732a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19733b;

        /* renamed from: d, reason: collision with root package name */
        int f19735d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19733b = obj;
            this.f19735d |= Integer.MIN_VALUE;
            return b.this.c(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LOl/d;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.PicklistDataSource$getPicklist$2", f = "PicklistDataSource.kt", l = {31, 30}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Ml.b$b, reason: collision with other inner class name */
    static final class C0331b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends PicklistItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f19736a;

        /* renamed from: b, reason: collision with root package name */
        int f19737b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f19739d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends PicklistItem>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<PicklistItem>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0331b(int i10, Continuation<? super C0331b> continuation) {
            super(2, continuation);
            this.f19739d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new C0331b(this.f19739d, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<PicklistItem>> continuation) {
            return ((C0331b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                int r1 = r5.f19737b
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
                java.lang.Object r1 = r5.f19736a
                Ll.b r1 = (Ll.b) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Ml.b r6 = Ml.b.this
                Ll.b r1 = Ml.b.b(r6)
                Ml.b r6 = Ml.b.this
                Xi.a r6 = Ml.b.a(r6)
                r5.f19736a = r1
                r5.f19737b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                int r3 = r5.f19739d
                r4 = 0
                r5.f19736a = r4
                r5.f19737b = r2
                java.lang.Object r6 = r1.a(r6, r3, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L68
                java.lang.Object r6 = r6.body()
                com.meijer.mobile.greenville.model.response.picklist.PicklistResponse r6 = (com.meijer.mobile.greenville.model.response.picklist.PicklistResponse) r6
                if (r6 == 0) goto L63
                java.util.List r6 = Ql.a.a(r6)
                if (r6 == 0) goto L63
                return r6
            L63:
                java.util.List r6 = kotlin.collections.CollectionsKt.m()
                return r6
            L68:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ml.b.C0331b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(Ll.b picklistAPI, Xi.a authTokenProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(picklistAPI, "picklistAPI");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.picklistAPI = picklistAPI;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r6, kotlin.coroutines.Continuation<? super java.util.List<Ol.PicklistItem>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Ml.b.a
            if (r0 == 0) goto L13
            r0 = r7
            Ml.b$a r0 = (Ml.b.a) r0
            int r1 = r0.f19735d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19735d = r1
            goto L18
        L13:
            Ml.b$a r0 = new Ml.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19733b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f19735d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.b(r7)
            qv.K r7 = r5.ioDispatcher
            Ml.b$b r2 = new Ml.b$b
            r4 = 0
            r2.<init>(r6, r4)
            r0.f19732a = r6
            r0.f19735d = r3
            java.lang.Object r7 = qv.C16644i.g(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r6 = r7
            java.util.List r6 = (java.util.List) r6
            uw.a$a r6 = uw.a.INSTANCE
            java.lang.String r0 = "GreenvilleService"
            uw.a$b r6 = r6.x(r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Picklist Fetched!"
            r6.a(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ml.b.c(int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
