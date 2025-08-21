package nm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnm/b;", "", "Lnm/a;", "accountsAPI", "LYi/a;", "authTokenProvider", "Lmv/K;", "ioDispatcher", "<init>", "(Lnm/a;LYi/a;Lmv/K;)V", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/instoreshopping/service/accounts/models/BlockedUserRequest;", "request", "", "d", "(Lcom/meijer/mobile/instoreshopping/service/accounts/models/BlockedUserRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/instoreshopping/service/accounts/models/MPerksBarcodeResponse;", "c", "a", "Lnm/a;", "LYi/a;", "Lmv/K;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: nm.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15964b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15963a accountsAPI;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Yi.a authTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.accounts.AccountsDataSource", f = "AccountsDataSource.kt", l = {38}, m = "fetchToken")
    /* renamed from: nm.b$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f152517a;

        /* renamed from: c, reason: collision with root package name */
        int f152519c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f152517a = obj;
            this.f152519c |= Integer.MIN_VALUE;
            return C15964b.this.b(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.accounts.AccountsDataSource", f = "AccountsDataSource.kt", l = {34, 34}, m = "getBarcode")
    /* renamed from: nm.b$b, reason: collision with other inner class name */
    static final class C2357b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f152520a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f152521b;

        /* renamed from: d, reason: collision with root package name */
        int f152523d;

        C2357b(Continuation<? super C2357b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f152521b = obj;
            this.f152523d |= Integer.MIN_VALUE;
            return C15964b.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.accounts.AccountsDataSource", f = "AccountsDataSource.kt", l = {30, 30}, m = "isUserBlocked")
    /* renamed from: nm.b$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f152524a;

        /* renamed from: b, reason: collision with root package name */
        Object f152525b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f152526c;

        /* renamed from: e, reason: collision with root package name */
        int f152528e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f152526c = obj;
            this.f152528e |= Integer.MIN_VALUE;
            return C15964b.this.d(null, this);
        }
    }

    public C15964b(InterfaceC15963a accountsAPI, Yi.a authTokenProvider, AbstractC15779K ioDispatcher) {
        Intrinsics.j(accountsAPI, "accountsAPI");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.accountsAPI = accountsAPI;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super com.meijer.mobile.authentication.core.model.BearerToken> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof nm.C15964b.a
            if (r0 == 0) goto L13
            r0 = r5
            nm.b$a r0 = (nm.C15964b.a) r0
            int r1 = r0.f152519c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152519c = r1
            goto L18
        L13:
            nm.b$a r0 = new nm.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f152517a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f152519c
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
            Yi.a r5 = r4.authTokenProvider
            io.reactivex.l r5 = r5.a()
            pv.f r5 = tv.h.b(r5)
            mv.K r2 = r4.ioDispatcher
            pv.f r5 = pv.C16563h.H(r5, r2)
            r0.f152519c = r3
            java.lang.Object r5 = pv.C16563h.W(r5, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            java.lang.String r0 = "single(...)"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.C15964b.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super com.meijer.mobile.instoreshopping.service.accounts.models.MPerksBarcodeResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nm.C15964b.C2357b
            if (r0 == 0) goto L13
            r0 = r6
            nm.b$b r0 = (nm.C15964b.C2357b) r0
            int r1 = r0.f152523d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152523d = r1
            goto L18
        L13:
            nm.b$b r0 = new nm.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f152521b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f152523d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r6)
            goto L5a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f152520a
            nm.a r2 = (nm.InterfaceC15963a) r2
            kotlin.ResultKt.b(r6)
            goto L4c
        L3c:
            kotlin.ResultKt.b(r6)
            nm.a r2 = r5.accountsAPI
            r0.f152520a = r2
            r0.f152523d = r4
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L4c
            goto L59
        L4c:
            com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
            r4 = 0
            r0.f152520a = r4
            r0.f152523d = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            retrofit2.Response r6 = (retrofit2.Response) r6
            boolean r0 = r6.isSuccessful()
            if (r0 == 0) goto L6a
            java.lang.Object r6 = r6.body()
            kotlin.jvm.internal.Intrinsics.g(r6)
            return r6
        L6a:
            retrofit2.HttpException r0 = new retrofit2.HttpException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.C15964b.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.meijer.mobile.instoreshopping.service.accounts.models.BlockedUserRequest r8, kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof nm.C15964b.c
            if (r0 == 0) goto L13
            r0 = r9
            nm.b$c r0 = (nm.C15964b.c) r0
            int r1 = r0.f152528e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152528e = r1
            goto L18
        L13:
            nm.b$c r0 = new nm.b$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f152526c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f152528e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.f152524a
            com.meijer.mobile.instoreshopping.service.accounts.models.BlockedUserRequest r8 = (com.meijer.mobile.instoreshopping.service.accounts.models.BlockedUserRequest) r8
            kotlin.ResultKt.b(r9)
            goto L6a
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f152525b
            nm.a r8 = (nm.InterfaceC15963a) r8
            java.lang.Object r2 = r0.f152524a
            com.meijer.mobile.instoreshopping.service.accounts.models.BlockedUserRequest r2 = (com.meijer.mobile.instoreshopping.service.accounts.models.BlockedUserRequest) r2
            kotlin.ResultKt.b(r9)
            goto L5a
        L44:
            kotlin.ResultKt.b(r9)
            nm.a r9 = r7.accountsAPI
            r0.f152524a = r8
            r0.f152525b = r9
            r0.f152528e = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 != r1) goto L56
            goto L69
        L56:
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r6
        L5a:
            com.meijer.mobile.authentication.core.model.BearerToken r9 = (com.meijer.mobile.authentication.core.model.BearerToken) r9
            r0.f152524a = r2
            r5 = 0
            r0.f152525b = r5
            r0.f152528e = r3
            java.lang.Object r9 = r8.b(r9, r2, r0)
            if (r9 != r1) goto L6a
        L69:
            return r1
        L6a:
            retrofit2.Response r9 = (retrofit2.Response) r9
            boolean r8 = r9.isSuccessful()
            if (r8 == 0) goto L85
            java.lang.Object r8 = r9.body()
            kotlin.jvm.internal.Intrinsics.g(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r8 = r8 ^ r4
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.a(r8)
            return r8
        L85:
            retrofit2.HttpException r8 = new retrofit2.HttpException
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.C15964b.d(com.meijer.mobile.instoreshopping.service.accounts.models.BlockedUserRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
