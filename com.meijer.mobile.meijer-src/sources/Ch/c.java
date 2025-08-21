package Ch;

import Eh.AbstractC3244h;
import Eh.AccountAddresses;
import Eh.CreateAccountSubmission;
import Eh.ProfileInformation;
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
import yo.k;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0086@¢\u0006\u0004\b \u0010\u0019J \u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0086@¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020$2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0086@¢\u0006\u0004\b'\u0010&J\u0018\u0010*\u001a\u00020\"2\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\"H\u0086@¢\u0006\u0004\b,\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00105R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u000204078\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00105R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020<078\u0006¢\u0006\f\n\u0004\b \u00108\u001a\u0004\b>\u0010:¨\u0006@"}, d2 = {"LCh/c;", "", "LAh/c;", "accountsAMSDataSource", "LZq/b;", "storeInfoRepository", "Lyo/k;", "userManager", "Lyo/f;", "storeManager", "<init>", "(LAh/c;LZq/b;Lyo/k;Lyo/f;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lpk/h;", "f", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEh/i;", "createAccountSubmission", "LEh/h;", "d", "(LEh/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCs/a;", "g", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "meijerAccount", "LEh/B;", "l", "(LCs/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "LEh/a;", "h", "accountAddress", "", "skipAddressVerification", "LEh/d;", "c", "(LEh/a;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "", "accountAddressId", "e", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "a", "LAh/c;", "b", "LZq/b;", "Lyo/k;", "Lyo/f;", "Lpv/B;", "LEh/b;", "Lpv/B;", "_addressesFlow", "Lpv/P;", "Lpv/P;", "i", "()Lpv/P;", "addressesFlow", "LEh/v;", "_profileInformationFlow", "j", "profileInformationFlow", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ah.c accountsAMSDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<AccountAddresses> _addressesFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<AccountAddresses> addressesFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ProfileInformation> _profileInformationFlow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final P<ProfileInformation> profileInformationFlow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {110, 115}, m = "addAccountAddress")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4376a;

        /* renamed from: b, reason: collision with root package name */
        Object f4377b;

        /* renamed from: c, reason: collision with root package name */
        Object f4378c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4379d;

        /* renamed from: e, reason: collision with root package name */
        int f4380e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4381f;

        /* renamed from: h, reason: collision with root package name */
        int f4383h;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4381f = obj;
            this.f4383h |= Integer.MIN_VALUE;
            return c.this.c(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {139, 142}, m = "deleteAccountAddress")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        long f4384a;

        /* renamed from: b, reason: collision with root package name */
        Object f4385b;

        /* renamed from: c, reason: collision with root package name */
        boolean f4386c;

        /* renamed from: d, reason: collision with root package name */
        int f4387d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f4388e;

        /* renamed from: g, reason: collision with root package name */
        int f4390g;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4388e = obj;
            this.f4390g |= Integer.MIN_VALUE;
            return c.this.e(0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {73}, m = "fetchStoreInfo")
    /* renamed from: Ch.c$c, reason: collision with other inner class name */
    static final class C0089c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f4391a;

        /* renamed from: b, reason: collision with root package name */
        int f4392b;

        /* renamed from: c, reason: collision with root package name */
        int f4393c;

        /* renamed from: d, reason: collision with root package name */
        int f4394d;

        /* renamed from: e, reason: collision with root package name */
        int f4395e;

        /* renamed from: f, reason: collision with root package name */
        Object f4396f;

        /* renamed from: g, reason: collision with root package name */
        Object f4397g;

        /* renamed from: h, reason: collision with root package name */
        Object f4398h;

        /* renamed from: i, reason: collision with root package name */
        Object f4399i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f4400j;

        /* renamed from: l, reason: collision with root package name */
        int f4402l;

        C0089c(Continuation<? super C0089c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4400j = obj;
            this.f4402l |= Integer.MIN_VALUE;
            return c.this.f(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {48, 52}, m = "getAccount")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4403a;

        /* renamed from: b, reason: collision with root package name */
        Object f4404b;

        /* renamed from: c, reason: collision with root package name */
        Object f4405c;

        /* renamed from: d, reason: collision with root package name */
        Object f4406d;

        /* renamed from: e, reason: collision with root package name */
        Object f4407e;

        /* renamed from: f, reason: collision with root package name */
        Object f4408f;

        /* renamed from: g, reason: collision with root package name */
        Object f4409g;

        /* renamed from: h, reason: collision with root package name */
        int f4410h;

        /* renamed from: i, reason: collision with root package name */
        int f4411i;

        /* renamed from: j, reason: collision with root package name */
        int f4412j;

        /* renamed from: k, reason: collision with root package name */
        int f4413k;

        /* renamed from: l, reason: collision with root package name */
        int f4414l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f4415m;

        /* renamed from: o, reason: collision with root package name */
        int f4417o;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4415m = obj;
            this.f4417o |= Integer.MIN_VALUE;
            return c.this.g(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {98}, m = "getAccountAddresses")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f4418a;

        /* renamed from: c, reason: collision with root package name */
        int f4420c;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4418a = obj;
            this.f4420c |= Integer.MIN_VALUE;
            return c.this.h(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {58, 63}, m = "updateAccount")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4421a;

        /* renamed from: b, reason: collision with root package name */
        Object f4422b;

        /* renamed from: c, reason: collision with root package name */
        Object f4423c;

        /* renamed from: d, reason: collision with root package name */
        Object f4424d;

        /* renamed from: e, reason: collision with root package name */
        Object f4425e;

        /* renamed from: f, reason: collision with root package name */
        Object f4426f;

        /* renamed from: g, reason: collision with root package name */
        Object f4427g;

        /* renamed from: h, reason: collision with root package name */
        Object f4428h;

        /* renamed from: i, reason: collision with root package name */
        int f4429i;

        /* renamed from: j, reason: collision with root package name */
        int f4430j;

        /* renamed from: k, reason: collision with root package name */
        int f4431k;

        /* renamed from: l, reason: collision with root package name */
        int f4432l;

        /* renamed from: m, reason: collision with root package name */
        int f4433m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f4434n;

        /* renamed from: p, reason: collision with root package name */
        int f4436p;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4434n = obj;
            this.f4436p |= Integer.MIN_VALUE;
            return c.this.l(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountsAMSRepository", f = "AccountsAMSRepository.kt", l = {126, 131}, m = "updateAccountAddress")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4437a;

        /* renamed from: b, reason: collision with root package name */
        Object f4438b;

        /* renamed from: c, reason: collision with root package name */
        Object f4439c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4440d;

        /* renamed from: e, reason: collision with root package name */
        int f4441e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4442f;

        /* renamed from: h, reason: collision with root package name */
        int f4444h;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4442f = obj;
            this.f4444h |= Integer.MIN_VALUE;
            return c.this.m(null, false, this);
        }
    }

    public c(Ah.c accountsAMSDataSource, Zq.b storeInfoRepository, k userManager, yo.f storeManager) {
        Intrinsics.j(accountsAMSDataSource, "accountsAMSDataSource");
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeManager, "storeManager");
        this.accountsAMSDataSource = accountsAMSDataSource;
        this.storeInfoRepository = storeInfoRepository;
        this.userManager = userManager;
        this.storeManager = storeManager;
        InterfaceC16549B<AccountAddresses> interfaceC16549BA = S.a(new AccountAddresses(null, 1, null));
        this._addressesFlow = interfaceC16549BA;
        this.addressesFlow = C16563h.c(interfaceC16549BA);
        InterfaceC16549B<ProfileInformation> interfaceC16549BA2 = S.a(new ProfileInformation(null, 0, null, null, null, null, 63, null));
        this._profileInformationFlow = interfaceC16549BA2;
        this.profileInformationFlow = C16563h.c(interfaceC16549BA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r18, kotlin.coroutines.Continuation<? super pk.StoreDetails> r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.c.f(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(Eh.AccountAddress r7, boolean r8, kotlin.coroutines.Continuation<? super Eh.AbstractC3240d> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof Ch.c.a
            if (r0 == 0) goto L13
            r0 = r9
            Ch.c$a r0 = (Ch.c.a) r0
            int r1 = r0.f4383h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4383h = r1
            goto L18
        L13:
            Ch.c$a r0 = new Ch.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4381f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4383h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.f4378c
            Eh.d r7 = (Eh.AbstractC3240d) r7
            java.lang.Object r7 = r0.f4377b
            java.lang.Object r8 = r0.f4376a
            Eh.a r8 = (Eh.AccountAddress) r8
            kotlin.ResultKt.b(r9)
            return r7
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            boolean r8 = r0.f4379d
            java.lang.Object r7 = r0.f4376a
            Eh.a r7 = (Eh.AccountAddress) r7
            kotlin.ResultKt.b(r9)
            goto L5a
        L48:
            kotlin.ResultKt.b(r9)
            Ah.c r9 = r6.accountsAMSDataSource
            r0.f4376a = r7
            r0.f4379d = r8
            r0.f4383h = r4
            java.lang.Object r9 = r9.d(r7, r8, r0)
            if (r9 != r1) goto L5a
            goto L74
        L5a:
            r2 = r9
            Eh.d r2 = (Eh.AbstractC3240d) r2
            boolean r4 = r2 instanceof Eh.AbstractC3240d.Success
            r5 = 0
            if (r4 == 0) goto L76
            r0.f4376a = r7
            r0.f4377b = r9
            r0.f4378c = r2
            r0.f4379d = r8
            r0.f4380e = r5
            r0.f4383h = r3
            java.lang.Object r7 = r6.h(r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            return r9
        L76:
            qw.a$a r7 = qw.a.INSTANCE
            java.lang.String r8 = "Failed to add address"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r7.s(r8, r0)
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.c.c(Eh.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d(CreateAccountSubmission createAccountSubmission, Continuation<? super AbstractC3244h> continuation) {
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
            boolean r0 = r8 instanceof Ch.c.b
            if (r0 == 0) goto L13
            r0 = r8
            Ch.c$b r0 = (Ch.c.b) r0
            int r1 = r0.f4390g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4390g = r1
            goto L18
        L13:
            Ch.c$b r0 = new Ch.c$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4388e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4390g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f4385b
            kotlin.ResultKt.b(r8)
            return r6
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            long r6 = r0.f4384a
            kotlin.ResultKt.b(r8)
            goto L4c
        L3c:
            kotlin.ResultKt.b(r8)
            Ah.c r8 = r5.accountsAMSDataSource
            r0.f4384a = r6
            r0.f4390g = r4
            java.lang.Object r8 = r8.f(r6, r0)
            if (r8 != r1) goto L4c
            goto L66
        L4c:
            r2 = r8
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r4 = 0
            if (r2 == 0) goto L68
            r0.f4385b = r8
            r0.f4384a = r6
            r0.f4386c = r2
            r0.f4387d = r4
            r0.f4390g = r3
            java.lang.Object r6 = r5.h(r0)
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            return r8
        L68:
            qw.a$a r6 = qw.a.INSTANCE
            java.lang.String r7 = "Failed to delete address"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r6.s(r7, r0)
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.c.e(long, kotlin.coroutines.Continuation):java.lang.Object");
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
        throw new UnsupportedOperationException("Method not decompiled: Ch.c.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.Continuation<? super java.util.List<Eh.AccountAddress>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Ch.c.e
            if (r0 == 0) goto L13
            r0 = r5
            Ch.c$e r0 = (Ch.c.e) r0
            int r1 = r0.f4420c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4420c = r1
            goto L18
        L13:
            Ch.c$e r0 = new Ch.c$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4418a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4420c
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
            Ah.c r5 = r4.accountsAMSDataSource
            r0.f4420c = r3
            java.lang.Object r5 = r5.h(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: Ch.c.h(kotlin.coroutines.Continuation):java.lang.Object");
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

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        r4 = r5;
        r5 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(Cs.MeijerAccount r20, kotlin.coroutines.Continuation<? super Eh.B> r21) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.c.l(Cs.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(Eh.AccountAddress r7, boolean r8, kotlin.coroutines.Continuation<? super Eh.AbstractC3240d> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof Ch.c.g
            if (r0 == 0) goto L13
            r0 = r9
            Ch.c$g r0 = (Ch.c.g) r0
            int r1 = r0.f4444h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4444h = r1
            goto L18
        L13:
            Ch.c$g r0 = new Ch.c$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4442f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4444h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.f4439c
            Eh.d r7 = (Eh.AbstractC3240d) r7
            java.lang.Object r7 = r0.f4438b
            java.lang.Object r8 = r0.f4437a
            Eh.a r8 = (Eh.AccountAddress) r8
            kotlin.ResultKt.b(r9)
            return r7
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            boolean r8 = r0.f4440d
            java.lang.Object r7 = r0.f4437a
            Eh.a r7 = (Eh.AccountAddress) r7
            kotlin.ResultKt.b(r9)
            goto L5a
        L48:
            kotlin.ResultKt.b(r9)
            Ah.c r9 = r6.accountsAMSDataSource
            r0.f4437a = r7
            r0.f4440d = r8
            r0.f4444h = r4
            java.lang.Object r9 = r9.k(r7, r8, r0)
            if (r9 != r1) goto L5a
            goto L74
        L5a:
            r2 = r9
            Eh.d r2 = (Eh.AbstractC3240d) r2
            boolean r4 = r2 instanceof Eh.AbstractC3240d.Success
            r5 = 0
            if (r4 == 0) goto L76
            r0.f4437a = r7
            r0.f4438b = r9
            r0.f4439c = r2
            r0.f4440d = r8
            r0.f4441e = r5
            r0.f4444h = r3
            java.lang.Object r7 = r6.h(r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            return r9
        L76:
            qw.a$a r7 = qw.a.INSTANCE
            java.lang.String r8 = "Failed to update address"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r7.s(r8, r0)
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.c.m(Eh.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
