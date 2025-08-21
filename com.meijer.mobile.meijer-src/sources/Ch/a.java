package Ch;

import Eh.AccountAddress;
import Eh.AccountAddresses;
import Eh.UpdateConfirmationResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0011\u0010\fJ\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006!"}, d2 = {"LCh/a;", "", "LAh/a;", "dataSource", "LCs/b;", "userProvider", "<init>", "(LAh/a;LCs/b;)V", "LEh/a;", "accountAddress", "LEh/D;", "a", "(LEh/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "", "accountAddressId", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAh/a;", "LCs/b;", "Lpv/B;", "LEh/b;", "Lpv/B;", "_addressesFlow", "Lpv/P;", "d", "Lpv/P;", "()Lpv/P;", "addressesFlow", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ah.a dataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<AccountAddresses> _addressesFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<AccountAddresses> addressesFlow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountAddressesRepository", f = "AccountAddressesRepository.kt", l = {87, 89}, m = "deleteAddress")
    /* renamed from: Ch.a$a, reason: collision with other inner class name */
    static final class C0087a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        long f4299a;

        /* renamed from: b, reason: collision with root package name */
        Object f4300b;

        /* renamed from: c, reason: collision with root package name */
        Object f4301c;

        /* renamed from: d, reason: collision with root package name */
        int f4302d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f4303e;

        /* renamed from: g, reason: collision with root package name */
        int f4305g;

        C0087a(Continuation<? super C0087a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4303e = obj;
            this.f4305g |= Integer.MIN_VALUE;
            return a.this.b(0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountAddressesRepository", f = "AccountAddressesRepository.kt", l = {30}, m = "getAccountAddresses")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f4306a;

        /* renamed from: c, reason: collision with root package name */
        int f4308c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4306a = obj;
            this.f4308c |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountAddressesRepository", f = "AccountAddressesRepository.kt", l = {71, 73, 76}, m = "saveAddress")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4309a;

        /* renamed from: b, reason: collision with root package name */
        Object f4310b;

        /* renamed from: c, reason: collision with root package name */
        Object f4311c;

        /* renamed from: d, reason: collision with root package name */
        int f4312d;

        /* renamed from: e, reason: collision with root package name */
        int f4313e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4314f;

        /* renamed from: h, reason: collision with root package name */
        int f4316h;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4314f = obj;
            this.f4316h |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    public a(Ah.a dataSource, Cs.b userProvider) {
        Intrinsics.j(dataSource, "dataSource");
        Intrinsics.j(userProvider, "userProvider");
        this.dataSource = dataSource;
        this.userProvider = userProvider;
        InterfaceC16549B<AccountAddresses> interfaceC16549BA = S.a(new AccountAddresses(null, 1, null));
        this._addressesFlow = interfaceC16549BA;
        this.addressesFlow = C16563h.c(interfaceC16549BA);
    }

    private final Object a(AccountAddress accountAddress, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.dataSource.c(accountAddress, continuation);
    }

    private final Object f(AccountAddress accountAddress, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.dataSource.f(accountAddress, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r7, kotlin.coroutines.Continuation<? super Eh.UpdateConfirmationResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof Ch.a.C0087a
            if (r0 == 0) goto L13
            r0 = r9
            Ch.a$a r0 = (Ch.a.C0087a) r0
            int r1 = r0.f4305g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4305g = r1
            goto L18
        L13:
            Ch.a$a r0 = new Ch.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4303e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4305g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f4301c
            Eh.D r7 = (Eh.UpdateConfirmationResponse) r7
            java.lang.Object r7 = r0.f4300b
            kotlin.ResultKt.b(r9)
            return r7
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            long r7 = r0.f4299a
            kotlin.ResultKt.b(r9)
            goto L50
        L40:
            kotlin.ResultKt.b(r9)
            Ah.a r9 = r6.dataSource
            r0.f4299a = r7
            r0.f4305g = r4
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 != r1) goto L50
            goto L6a
        L50:
            r2 = r9
            Eh.D r2 = (Eh.UpdateConfirmationResponse) r2
            boolean r4 = r2.getIsSuccess()
            r5 = 0
            if (r4 == 0) goto L6c
            r0.f4300b = r9
            r0.f4301c = r2
            r0.f4299a = r7
            r0.f4302d = r5
            r0.f4305g = r3
            java.lang.Object r7 = r6.c(r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r9
        L6c:
            qw.a$a r7 = qw.a.INSTANCE
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            sk.a r0 = r2.getErrorType()
            if (r0 == 0) goto L7b
            java.lang.String r0 = r0.getServiceErrorString()
            goto L7c
        L7b:
            r0 = 0
        L7c:
            r8.<init>(r0)
            java.lang.String r0 = "Failed to delete address"
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r7.u(r8, r0, r1)
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.a.b(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super java.util.List<Eh.AccountAddress>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Ch.a.b
            if (r0 == 0) goto L13
            r0 = r5
            Ch.a$b r0 = (Ch.a.b) r0
            int r1 = r0.f4308c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4308c = r1
            goto L18
        L13:
            Ch.a$b r0 = new Ch.a$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4306a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4308c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            Ah.a r5 = r4.dataSource
            r0.f4308c = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            pv.B<Eh.b> r1 = r4._addressesFlow
        L44:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            Eh.b r3 = (Eh.AccountAddresses) r3
            Eh.b r3 = r3.a(r0)
            boolean r2 = r1.e(r2, r3)
            if (r2 == 0) goto L44
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.a.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final P<AccountAddresses> d() {
        return this.addressesFlow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
    
        if (r5 == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
    
        if (r5 == r4) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(Eh.AccountAddress r21, kotlin.coroutines.Continuation<? super Eh.UpdateConfirmationResponse> r22) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.a.e(Eh.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
