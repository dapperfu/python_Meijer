package Bh;

import Dh.AbstractC3375h;
import Dh.AccountAddresses;
import Dh.CreateAccountSubmission;
import Dh.ProfileInformation;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;
import yo.k;
import zh.C18465c;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0086@¢\u0006\u0004\b\u001c\u0010\u0019J \u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b#\u0010\"J\u0018\u0010&\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$H\u0086@¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b(\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00101R\u001d\u00107\u001a\b\u0012\u0004\u0012\u000200038\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00101R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u000208038\u0006¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b:\u00106¨\u0006<"}, d2 = {"LBh/c;", "", "Lzh/c;", "accountsAMSDataSource", "LZq/b;", "storeInfoRepository", "Lyo/k;", "userManager", "Lyo/f;", "storeManager", "<init>", "(Lzh/c;LZq/b;Lyo/k;Lyo/f;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lok/h;", "f", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LDh/i;", "createAccountSubmission", "LDh/h;", "d", "(LDh/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCs/a;", "g", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "LDh/a;", "h", "accountAddress", "", "skipAddressVerification", "LDh/d;", "c", "(LDh/a;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "", "accountAddressId", "e", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "a", "Lzh/c;", "b", "LZq/b;", "Lyo/k;", "Lyo/f;", "Ltv/B;", "LDh/b;", "Ltv/B;", "_addressesFlow", "Ltv/P;", "Ltv/P;", "i", "()Ltv/P;", "addressesFlow", "LDh/v;", "_profileInformationFlow", "j", "profileInformationFlow", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18465c accountsAMSDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<AccountAddresses> _addressesFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<AccountAddresses> addressesFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ProfileInformation> _profileInformationFlow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final P<ProfileInformation> profileInformationFlow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {95, HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "addAccountAddress")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2347a;

        /* renamed from: b, reason: collision with root package name */
        Object f2348b;

        /* renamed from: c, reason: collision with root package name */
        Object f2349c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2350d;

        /* renamed from: e, reason: collision with root package name */
        int f2351e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2352f;

        /* renamed from: h, reason: collision with root package name */
        int f2354h;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2352f = obj;
            this.f2354h |= Integer.MIN_VALUE;
            return c.this.c(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {124, l3.f92485d}, m = "deleteAccountAddress")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        long f2355a;

        /* renamed from: b, reason: collision with root package name */
        Object f2356b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2357c;

        /* renamed from: d, reason: collision with root package name */
        int f2358d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2359e;

        /* renamed from: g, reason: collision with root package name */
        int f2361g;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2359e = obj;
            this.f2361g |= Integer.MIN_VALUE;
            return c.this.e(0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {58}, m = "fetchStoreInfo")
    /* renamed from: Bh.c$c, reason: collision with other inner class name */
    static final class C0051c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f2362a;

        /* renamed from: b, reason: collision with root package name */
        int f2363b;

        /* renamed from: c, reason: collision with root package name */
        int f2364c;

        /* renamed from: d, reason: collision with root package name */
        int f2365d;

        /* renamed from: e, reason: collision with root package name */
        int f2366e;

        /* renamed from: f, reason: collision with root package name */
        Object f2367f;

        /* renamed from: g, reason: collision with root package name */
        Object f2368g;

        /* renamed from: h, reason: collision with root package name */
        Object f2369h;

        /* renamed from: i, reason: collision with root package name */
        Object f2370i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f2371j;

        /* renamed from: l, reason: collision with root package name */
        int f2373l;

        C0051c(Continuation<? super C0051c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2371j = obj;
            this.f2373l |= Integer.MIN_VALUE;
            return c.this.f(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {47, 51}, m = "getAccount")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2374a;

        /* renamed from: b, reason: collision with root package name */
        Object f2375b;

        /* renamed from: c, reason: collision with root package name */
        Object f2376c;

        /* renamed from: d, reason: collision with root package name */
        Object f2377d;

        /* renamed from: e, reason: collision with root package name */
        Object f2378e;

        /* renamed from: f, reason: collision with root package name */
        Object f2379f;

        /* renamed from: g, reason: collision with root package name */
        Object f2380g;

        /* renamed from: h, reason: collision with root package name */
        int f2381h;

        /* renamed from: i, reason: collision with root package name */
        int f2382i;

        /* renamed from: j, reason: collision with root package name */
        int f2383j;

        /* renamed from: k, reason: collision with root package name */
        int f2384k;

        /* renamed from: l, reason: collision with root package name */
        int f2385l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f2386m;

        /* renamed from: o, reason: collision with root package name */
        int f2388o;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2386m = obj;
            this.f2388o |= Integer.MIN_VALUE;
            return c.this.g(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {83}, m = "getAccountAddresses")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f2389a;

        /* renamed from: c, reason: collision with root package name */
        int f2391c;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2389a = obj;
            this.f2391c |= Integer.MIN_VALUE;
            return c.this.h(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {111, 116}, m = "updateAccountAddress")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2392a;

        /* renamed from: b, reason: collision with root package name */
        Object f2393b;

        /* renamed from: c, reason: collision with root package name */
        Object f2394c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2395d;

        /* renamed from: e, reason: collision with root package name */
        int f2396e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2397f;

        /* renamed from: h, reason: collision with root package name */
        int f2399h;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2397f = obj;
            this.f2399h |= Integer.MIN_VALUE;
            return c.this.l(null, false, this);
        }
    }

    public c(C18465c accountsAMSDataSource, Zq.b storeInfoRepository, k userManager, yo.f storeManager) {
        Intrinsics.j(accountsAMSDataSource, "accountsAMSDataSource");
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeManager, "storeManager");
        this.accountsAMSDataSource = accountsAMSDataSource;
        this.storeInfoRepository = storeInfoRepository;
        this.userManager = userManager;
        this.storeManager = storeManager;
        InterfaceC17140B<AccountAddresses> interfaceC17140BA = S.a(new AccountAddresses(null, 1, null));
        this._addressesFlow = interfaceC17140BA;
        this.addressesFlow = C17154h.c(interfaceC17140BA);
        InterfaceC17140B<ProfileInformation> interfaceC17140BA2 = S.a(new ProfileInformation(null, 0, null, null, null, null, 63, null));
        this._profileInformationFlow = interfaceC17140BA2;
        this.profileInformationFlow = C17154h.c(interfaceC17140BA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r18, kotlin.coroutines.Continuation<? super ok.StoreDetails> r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.c.f(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(Dh.AccountAddress r7, boolean r8, kotlin.coroutines.Continuation<? super Dh.AbstractC3371d> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof Bh.c.a
            if (r0 == 0) goto L13
            r0 = r9
            Bh.c$a r0 = (Bh.c.a) r0
            int r1 = r0.f2354h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2354h = r1
            goto L18
        L13:
            Bh.c$a r0 = new Bh.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f2352f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2354h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.f2349c
            Dh.d r7 = (Dh.AbstractC3371d) r7
            java.lang.Object r7 = r0.f2348b
            java.lang.Object r8 = r0.f2347a
            Dh.a r8 = (Dh.AccountAddress) r8
            kotlin.ResultKt.b(r9)
            return r7
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            boolean r8 = r0.f2350d
            java.lang.Object r7 = r0.f2347a
            Dh.a r7 = (Dh.AccountAddress) r7
            kotlin.ResultKt.b(r9)
            goto L5a
        L48:
            kotlin.ResultKt.b(r9)
            zh.c r9 = r6.accountsAMSDataSource
            r0.f2347a = r7
            r0.f2350d = r8
            r0.f2354h = r4
            java.lang.Object r9 = r9.d(r7, r8, r0)
            if (r9 != r1) goto L5a
            goto L74
        L5a:
            r2 = r9
            Dh.d r2 = (Dh.AbstractC3371d) r2
            boolean r4 = r2 instanceof Dh.AbstractC3371d.Success
            r5 = 0
            if (r4 == 0) goto L76
            r0.f2347a = r7
            r0.f2348b = r9
            r0.f2349c = r2
            r0.f2350d = r8
            r0.f2351e = r5
            r0.f2354h = r3
            java.lang.Object r7 = r6.h(r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            return r9
        L76:
            uw.a$a r7 = uw.a.INSTANCE
            java.lang.String r8 = "Failed to add address"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r7.s(r8, r0)
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.c.c(Dh.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d(CreateAccountSubmission createAccountSubmission, Continuation<? super AbstractC3375h> continuation) {
        return this.accountsAMSDataSource.e(createAccountSubmission, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r6, kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Bh.c.b
            if (r0 == 0) goto L13
            r0 = r8
            Bh.c$b r0 = (Bh.c.b) r0
            int r1 = r0.f2361g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2361g = r1
            goto L18
        L13:
            Bh.c$b r0 = new Bh.c$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2359e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2361g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f2356b
            kotlin.ResultKt.b(r8)
            return r6
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            long r6 = r0.f2355a
            kotlin.ResultKt.b(r8)
            goto L4c
        L3c:
            kotlin.ResultKt.b(r8)
            zh.c r8 = r5.accountsAMSDataSource
            r0.f2355a = r6
            r0.f2361g = r4
            java.lang.Object r8 = r8.f(r6, r0)
            if (r8 != r1) goto L4c
            goto L66
        L4c:
            r2 = r8
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r4 = 0
            if (r2 == 0) goto L68
            r0.f2356b = r8
            r0.f2355a = r6
            r0.f2357c = r2
            r0.f2358d = r4
            r0.f2361g = r3
            java.lang.Object r6 = r5.h(r0)
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            return r8
        L68:
            uw.a$a r6 = uw.a.INSTANCE
            java.lang.String r7 = "Failed to delete address"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r6.s(r7, r0)
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.c.e(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation<? super Cs.MeijerAccount> r15) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.c.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.Continuation<? super java.util.List<Dh.AccountAddress>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Bh.c.e
            if (r0 == 0) goto L13
            r0 = r5
            Bh.c$e r0 = (Bh.c.e) r0
            int r1 = r0.f2391c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2391c = r1
            goto L18
        L13:
            Bh.c$e r0 = new Bh.c$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2389a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2391c
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
            zh.c r5 = r4.accountsAMSDataSource
            r0.f2391c = r3
            java.lang.Object r5 = r5.h(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            tv.B<Dh.b> r1 = r4._addressesFlow
        L44:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            Dh.b r3 = (Dh.AccountAddresses) r3
            Dh.b r3 = r3.a(r0)
            boolean r2 = r1.e(r2, r3)
            if (r2 == 0) goto L44
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.c.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final P<AccountAddresses> i() {
        return this.addressesFlow;
    }

    public final P<ProfileInformation> j() {
        return this.profileInformationFlow;
    }

    public final Object k(Continuation<? super Boolean> continuation) {
        return this.accountsAMSDataSource.i(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(Dh.AccountAddress r7, boolean r8, kotlin.coroutines.Continuation<? super Dh.AbstractC3371d> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof Bh.c.f
            if (r0 == 0) goto L13
            r0 = r9
            Bh.c$f r0 = (Bh.c.f) r0
            int r1 = r0.f2399h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2399h = r1
            goto L18
        L13:
            Bh.c$f r0 = new Bh.c$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f2397f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2399h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.f2394c
            Dh.d r7 = (Dh.AbstractC3371d) r7
            java.lang.Object r7 = r0.f2393b
            java.lang.Object r8 = r0.f2392a
            Dh.a r8 = (Dh.AccountAddress) r8
            kotlin.ResultKt.b(r9)
            return r7
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            boolean r8 = r0.f2395d
            java.lang.Object r7 = r0.f2392a
            Dh.a r7 = (Dh.AccountAddress) r7
            kotlin.ResultKt.b(r9)
            goto L5a
        L48:
            kotlin.ResultKt.b(r9)
            zh.c r9 = r6.accountsAMSDataSource
            r0.f2392a = r7
            r0.f2395d = r8
            r0.f2399h = r4
            java.lang.Object r9 = r9.j(r7, r8, r0)
            if (r9 != r1) goto L5a
            goto L74
        L5a:
            r2 = r9
            Dh.d r2 = (Dh.AbstractC3371d) r2
            boolean r4 = r2 instanceof Dh.AbstractC3371d.Success
            r5 = 0
            if (r4 == 0) goto L76
            r0.f2392a = r7
            r0.f2393b = r9
            r0.f2394c = r2
            r0.f2395d = r8
            r0.f2396e = r5
            r0.f2399h = r3
            java.lang.Object r7 = r6.h(r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            return r9
        L76:
            uw.a$a r7 = uw.a.INSTANCE
            java.lang.String r8 = "Failed to update address"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r7.s(r8, r0)
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.c.l(Dh.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
