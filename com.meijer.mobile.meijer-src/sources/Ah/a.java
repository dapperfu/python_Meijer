package Ah;

import Eh.AccountAddress;
import Eh.UpdateConfirmationResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B%\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, d2 = {"LAh/a;", "", "Lzh/c;", "accountsApi", "LYi/a;", "authTokenProvider", "Lmv/K;", "ioDispatcher", "<init>", "(Lzh/c;LYi/a;Lmv/K;)V", "", "LEh/a;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountAddress", "LEh/D;", "c", "(LEh/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "accountAddressId", "d", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lzh/c;", "b", "LYi/a;", "Lmv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zh.c accountsApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Yi.a authTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountAddressesDataSource$addAccountAddress$2", f = "AccountAddressesDataSource.kt", l = {46, 45}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Ah.a$a, reason: collision with other inner class name */
    static final class C0010a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f348a;

        /* renamed from: b, reason: collision with root package name */
        int f349b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AccountAddress f351d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0010a(AccountAddress accountAddress, Continuation<? super C0010a> continuation) {
            super(2, continuation);
            this.f351d = accountAddress;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new C0010a(this.f351d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((C0010a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f349b
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
                java.lang.Object r1 = r5.f348a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Ah.a r6 = Ah.a.this
                zh.c r1 = Ah.a.a(r6)
                Ah.a r6 = Ah.a.this
                Yi.a r6 = Ah.a.b(r6)
                r5.f348a = r1
                r5.f349b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4f
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                Eh.a r3 = r5.f351d
                com.meijer.mobile.accounts.service.models.network.AccountAddressJson r3 = Dh.b.u(r3)
                r4 = 0
                r5.f348a = r4
                r5.f349b = r2
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
                sk.a r0 = sk.EnumC17080a.f160812n
                Eh.D r6 = Dh.b.D(r6, r0)
                return r6
            L68:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.a.C0010a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountAddressesDataSource$deleteAccountAddress$2", f = "AccountAddressesDataSource.kt", l = {74, 73}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f352a;

        /* renamed from: b, reason: collision with root package name */
        int f353b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f355d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f355d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.f355d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r6.f353b
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
                java.lang.Object r1 = r6.f352a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r7)
                goto L3c
            L22:
                kotlin.ResultKt.b(r7)
                Ah.a r7 = Ah.a.this
                zh.c r1 = Ah.a.a(r7)
                Ah.a r7 = Ah.a.this
                Yi.a r7 = Ah.a.b(r7)
                r6.f352a = r1
                r6.f353b = r3
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r7 = (com.meijer.mobile.authentication.core.model.BearerToken) r7
                long r3 = r6.f355d
                r5 = 0
                r6.f352a = r5
                r6.f353b = r2
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
                sk.a r0 = sk.EnumC17080a.f160812n
                Eh.D r7 = Dh.b.D(r7, r0)
                return r7
            L64:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LEh/a;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountAddressesDataSource$getAccountAddresses$2", f = "AccountAddressesDataSource.kt", l = {35, 34}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends AccountAddress>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f356a;

        /* renamed from: b, reason: collision with root package name */
        int f357b;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends AccountAddress>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<AccountAddress>>) continuation);
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new c(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<AccountAddress>> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r4.f357b
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
                java.lang.Object r1 = r4.f356a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                Ah.a r5 = Ah.a.this
                zh.c r1 = Ah.a.a(r5)
                Ah.a r5 = Ah.a.this
                Yi.a r5 = Ah.a.b(r5)
                r4.f356a = r1
                r4.f357b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f356a = r3
                r4.f357b = r2
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
                Eh.a r1 = Dh.b.h(r1)
                r0.add(r1)
                goto L6a
            L7e:
                return r0
            L7f:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountAddressesDataSource$updateAccountAddress$2", f = "AccountAddressesDataSource.kt", l = {60, 59}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f359a;

        /* renamed from: b, reason: collision with root package name */
        int f360b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AccountAddress f362d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AccountAddress accountAddress, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f362d = accountAddress;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new d(this.f362d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f360b
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
                java.lang.Object r1 = r5.f359a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Ah.a r6 = Ah.a.this
                zh.c r1 = Ah.a.a(r6)
                Ah.a r6 = Ah.a.this
                Yi.a r6 = Ah.a.b(r6)
                r5.f359a = r1
                r5.f360b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4f
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                Eh.a r3 = r5.f362d
                com.meijer.mobile.accounts.service.models.network.AccountAddressJson r3 = Dh.b.u(r3)
                r4 = 0
                r5.f359a = r4
                r5.f360b = r2
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
                sk.a r0 = sk.EnumC17080a.f160812n
                Eh.D r6 = Dh.b.D(r6, r0)
                return r6
            L68:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(zh.c accountsApi, Yi.a authTokenProvider, AbstractC15779K ioDispatcher) {
        Intrinsics.j(accountsApi, "accountsApi");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.accountsApi = accountsApi;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object c(AccountAddress accountAddress, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new C0010a(accountAddress, null), continuation);
    }

    public final Object d(long j10, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new b(j10, null), continuation);
    }

    public final Object e(Continuation<? super List<AccountAddress>> continuation) {
        return C15805i.g(this.ioDispatcher, new c(null), continuation);
    }

    public final Object f(AccountAddress accountAddress, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new d(accountAddress, null), continuation);
    }
}
