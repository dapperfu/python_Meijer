package zh;

import Dh.AccountAddress;
import Dh.UpdateConfirmationResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B%\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzh/a;", "", "Lyh/c;", "accountsApi", "LXi/a;", "authTokenProvider", "Lqv/K;", "ioDispatcher", "<init>", "(Lyh/c;LXi/a;Lqv/K;)V", "", "LDh/a;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountAddress", "LDh/C;", "c", "(LDh/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "accountAddressId", "d", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lyh/c;", "b", "LXi/a;", "Lqv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zh.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C18463a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yh.c accountsApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Xi.a authTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LDh/C;", "<anonymous>", "(Lqv/O;)LDh/C;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountAddressesDataSource$addAccountAddress$2", f = "AccountAddressesDataSource.kt", l = {46, 45}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: zh.a$a, reason: collision with other inner class name */
    static final class C2769a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171846a;

        /* renamed from: b, reason: collision with root package name */
        int f171847b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AccountAddress f171849d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2769a(AccountAddress accountAddress, Continuation<? super C2769a> continuation) {
            super(2, continuation);
            this.f171849d = accountAddress;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18463a.this.new C2769a(this.f171849d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((C2769a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                int r1 = r5.f171847b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L50
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f171846a
                yh.c r1 = (yh.c) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                zh.a r6 = zh.C18463a.this
                yh.c r1 = zh.C18463a.a(r6)
                zh.a r6 = zh.C18463a.this
                Xi.a r6 = zh.C18463a.b(r6)
                r5.f171846a = r1
                r5.f171847b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4f
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                Dh.a r3 = r5.f171849d
                com.meijer.mobile.accounts.service.models.network.AccountAddressJson r3 = Ch.b.v(r3)
                r4 = 0
                r5.f171846a = r4
                r5.f171847b = r2
                java.lang.Object r6 = r1.o(r6, r3, r5)
                if (r6 != r0) goto L50
            L4f:
                return r0
            L50:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L68
                java.lang.Object r6 = r6.body()
                kotlin.jvm.internal.Intrinsics.g(r6)
                com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson r6 = (com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson) r6
                rk.a r0 = rk.EnumC16795a.f159036n
                Dh.C r6 = Ch.b.C(r6, r0)
                return r6
            L68:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.C18463a.C2769a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LDh/C;", "<anonymous>", "(Lqv/O;)LDh/C;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountAddressesDataSource$deleteAccountAddress$2", f = "AccountAddressesDataSource.kt", l = {74, 73}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: zh.a$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171850a;

        /* renamed from: b, reason: collision with root package name */
        int f171851b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f171853d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f171853d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18463a.this.new b(this.f171853d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
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
                int r1 = r6.f171851b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r7)
                goto L4c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f171850a
                yh.c r1 = (yh.c) r1
                kotlin.ResultKt.b(r7)
                goto L3c
            L22:
                kotlin.ResultKt.b(r7)
                zh.a r7 = zh.C18463a.this
                yh.c r1 = zh.C18463a.a(r7)
                zh.a r7 = zh.C18463a.this
                Xi.a r7 = zh.C18463a.b(r7)
                r6.f171850a = r1
                r6.f171851b = r3
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r7 = (com.meijer.mobile.authentication.core.model.BearerToken) r7
                long r3 = r6.f171853d
                r5 = 0
                r6.f171850a = r5
                r6.f171851b = r2
                java.lang.Object r7 = r1.v(r7, r3, r6)
                if (r7 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r7 = (retrofit2.Response) r7
                boolean r0 = r7.isSuccessful()
                if (r0 == 0) goto L64
                java.lang.Object r7 = r7.body()
                kotlin.jvm.internal.Intrinsics.g(r7)
                com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson r7 = (com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson) r7
                rk.a r0 = rk.EnumC16795a.f159036n
                Dh.C r7 = Ch.b.C(r7, r0)
                return r7
            L64:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.C18463a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LDh/a;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountAddressesDataSource$getAccountAddresses$2", f = "AccountAddressesDataSource.kt", l = {35, 34}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: zh.a$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends AccountAddress>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171854a;

        /* renamed from: b, reason: collision with root package name */
        int f171855b;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends AccountAddress>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<AccountAddress>>) continuation);
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18463a.this.new c(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<AccountAddress>> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f171855b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L4a
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f171854a
                yh.c r1 = (yh.c) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                zh.a r5 = zh.C18463a.this
                yh.c r1 = zh.C18463a.a(r5)
                zh.a r5 = zh.C18463a.this
                Xi.a r5 = zh.C18463a.b(r5)
                r4.f171854a = r1
                r4.f171855b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f171854a = r3
                r4.f171855b = r2
                java.lang.Object r5 = r1.a(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r5 = (retrofit2.Response) r5
                boolean r0 = r5.isSuccessful()
                if (r0 == 0) goto L7f
                java.lang.Object r5 = r5.body()
                kotlin.jvm.internal.Intrinsics.g(r5)
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.CollectionsKt.x(r5, r1)
                r0.<init>(r1)
                java.util.Iterator r5 = r5.iterator()
            L6a:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L7e
                java.lang.Object r1 = r5.next()
                com.meijer.mobile.accounts.service.models.network.AccountAddressJson r1 = (com.meijer.mobile.accounts.service.models.network.AccountAddressJson) r1
                Dh.a r1 = Ch.b.h(r1)
                r0.add(r1)
                goto L6a
            L7e:
                return r0
            L7f:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.C18463a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LDh/C;", "<anonymous>", "(Lqv/O;)LDh/C;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountAddressesDataSource$updateAccountAddress$2", f = "AccountAddressesDataSource.kt", l = {60, 59}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: zh.a$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171857a;

        /* renamed from: b, reason: collision with root package name */
        int f171858b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AccountAddress f171860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AccountAddress accountAddress, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f171860d = accountAddress;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18463a.this.new d(this.f171860d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                int r1 = r5.f171858b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L50
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f171857a
                yh.c r1 = (yh.c) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                zh.a r6 = zh.C18463a.this
                yh.c r1 = zh.C18463a.a(r6)
                zh.a r6 = zh.C18463a.this
                Xi.a r6 = zh.C18463a.b(r6)
                r5.f171857a = r1
                r5.f171858b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4f
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                Dh.a r3 = r5.f171860d
                com.meijer.mobile.accounts.service.models.network.AccountAddressJson r3 = Ch.b.v(r3)
                r4 = 0
                r5.f171857a = r4
                r5.f171858b = r2
                java.lang.Object r6 = r1.r(r6, r3, r5)
                if (r6 != r0) goto L50
            L4f:
                return r0
            L50:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L68
                java.lang.Object r6 = r6.body()
                kotlin.jvm.internal.Intrinsics.g(r6)
                com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson r6 = (com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson) r6
                rk.a r0 = rk.EnumC16795a.f159036n
                Dh.C r6 = Ch.b.C(r6, r0)
                return r6
            L68:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.C18463a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C18463a(yh.c accountsApi, Xi.a authTokenProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(accountsApi, "accountsApi");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.accountsApi = accountsApi;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object c(AccountAddress accountAddress, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new C2769a(accountAddress, null), continuation);
    }

    public final Object d(long j10, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new b(j10, null), continuation);
    }

    public final Object e(Continuation<? super List<AccountAddress>> continuation) {
        return C16644i.g(this.ioDispatcher, new c(null), continuation);
    }

    public final Object f(AccountAddress accountAddress, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new d(accountAddress, null), continuation);
    }
}
