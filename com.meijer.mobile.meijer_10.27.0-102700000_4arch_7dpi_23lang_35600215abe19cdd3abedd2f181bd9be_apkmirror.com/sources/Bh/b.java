package Bh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yo.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001d\u001fB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0012J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'¨\u0006("}, d2 = {"LBh/b;", "", "LBh/e;", "profileRepository", "LBh/c;", "accountsAMSRepository", "LZq/b;", "storeInfoRepository", "Lyo/k;", "userManager", "Lyo/f;", "storeManager", "Lyl/k;", "featureManager", "<init>", "(LBh/e;LBh/c;LZq/b;Lyo/k;Lyo/f;Lyl/k;)V", "", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LBh/b$a;", "callback", "g", "(LBh/b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LDh/y;", "i", "LCs/a;", "account", "f", "(LCs/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LBh/e;", "b", "LBh/c;", "c", "LZq/b;", "d", "Lyo/k;", "e", "Lyo/f;", "Lyl/k;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bh.e profileRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bh.c accountsAMSRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"LBh/b$a;", "", "LBh/b$b;", "calls", "", "a", "(LBh/b$b;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void a(EnumC0050b calls);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LBh/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bh.b$b, reason: collision with other inner class name */
    public static final class EnumC0050b {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0050b f2294a = new EnumC0050b("USER_TOKEN", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0050b f2295b = new EnumC0050b("ACCOUNT", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0050b f2296c = new EnumC0050b("PREFERENCES", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumC0050b[] f2297d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f2298e;

        static {
            EnumC0050b[] enumC0050bArrA = a();
            f2297d = enumC0050bArrA;
            f2298e = EnumEntriesKt.a(enumC0050bArrA);
        }

        private static final /* synthetic */ EnumC0050b[] a() {
            return new EnumC0050b[]{f2294a, f2295b, f2296c};
        }

        public static EnumC0050b valueOf(String str) {
            return (EnumC0050b) Enum.valueOf(EnumC0050b.class, str);
        }

        public static EnumC0050b[] values() {
            return (EnumC0050b[]) f2297d.clone();
        }

        private EnumC0050b(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountRepository", f = "AccountRepository.kt", l = {107}, m = "createNewAccount")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2299a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2300b;

        /* renamed from: d, reason: collision with root package name */
        int f2302d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2300b = obj;
            this.f2302d |= Integer.MIN_VALUE;
            return b.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountRepository", f = "AccountRepository.kt", l = {50, 52, 56, 57}, m = "fetchAccountData")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2303a;

        /* renamed from: b, reason: collision with root package name */
        Object f2304b;

        /* renamed from: c, reason: collision with root package name */
        Object f2305c;

        /* renamed from: d, reason: collision with root package name */
        Object f2306d;

        /* renamed from: e, reason: collision with root package name */
        Object f2307e;

        /* renamed from: f, reason: collision with root package name */
        int f2308f;

        /* renamed from: g, reason: collision with root package name */
        int f2309g;

        /* renamed from: h, reason: collision with root package name */
        int f2310h;

        /* renamed from: i, reason: collision with root package name */
        int f2311i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f2312j;

        /* renamed from: l, reason: collision with root package name */
        int f2314l;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2312j = obj;
            this.f2314l |= Integer.MIN_VALUE;
            return b.this.g(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountRepository", f = "AccountRepository.kt", l = {64}, m = "fetchStoreInfo")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2315a;

        /* renamed from: b, reason: collision with root package name */
        Object f2316b;

        /* renamed from: c, reason: collision with root package name */
        Object f2317c;

        /* renamed from: d, reason: collision with root package name */
        Object f2318d;

        /* renamed from: e, reason: collision with root package name */
        Object f2319e;

        /* renamed from: f, reason: collision with root package name */
        int f2320f;

        /* renamed from: g, reason: collision with root package name */
        int f2321g;

        /* renamed from: h, reason: collision with root package name */
        int f2322h;

        /* renamed from: i, reason: collision with root package name */
        int f2323i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f2324j;

        /* renamed from: l, reason: collision with root package name */
        int f2326l;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2324j = obj;
            this.f2326l |= Integer.MIN_VALUE;
            return b.this.h(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountRepository", f = "AccountRepository.kt", l = {91}, m = "getSettingsPreferences")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2327a;

        /* renamed from: b, reason: collision with root package name */
        Object f2328b;

        /* renamed from: c, reason: collision with root package name */
        Object f2329c;

        /* renamed from: d, reason: collision with root package name */
        Object f2330d;

        /* renamed from: e, reason: collision with root package name */
        Object f2331e;

        /* renamed from: f, reason: collision with root package name */
        int f2332f;

        /* renamed from: g, reason: collision with root package name */
        int f2333g;

        /* renamed from: h, reason: collision with root package name */
        int f2334h;

        /* renamed from: i, reason: collision with root package name */
        int f2335i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f2336j;

        /* renamed from: l, reason: collision with root package name */
        int f2338l;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2336j = obj;
            this.f2338l |= Integer.MIN_VALUE;
            return b.this.i(this);
        }
    }

    public b(Bh.e profileRepository, Bh.c accountsAMSRepository, Zq.b storeInfoRepository, k userManager, yo.f storeManager, yl.k featureManager) {
        Intrinsics.j(profileRepository, "profileRepository");
        Intrinsics.j(accountsAMSRepository, "accountsAMSRepository");
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(featureManager, "featureManager");
        this.profileRepository = profileRepository;
        this.accountsAMSRepository = accountsAMSRepository;
        this.storeInfoRepository = storeInfoRepository;
        this.userManager = userManager;
        this.storeManager = storeManager;
        this.featureManager = featureManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.b.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(Cs.MeijerAccount r11, kotlin.coroutines.Continuation<? super Cs.MeijerAccount> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof Bh.b.c
            if (r0 == 0) goto L13
            r0 = r12
            Bh.b$c r0 = (Bh.b.c) r0
            int r1 = r0.f2302d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2302d = r1
            goto L18
        L13:
            Bh.b$c r0 = new Bh.b$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f2300b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2302d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.f2299a
            Cs.a r11 = (Cs.MeijerAccount) r11
            kotlin.ResultKt.b(r12)
            goto L45
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.ResultKt.b(r12)
            Bh.e r12 = r10.profileRepository
            r0.f2299a = r11
            r0.f2302d = r3
            java.lang.Object r12 = r12.d(r11, r0)
            if (r12 != r1) goto L45
            return r1
        L45:
            Dh.C r12 = (Dh.UpdateConfirmationResponse) r12
            boolean r0 = r12.getIsSuccess()
            if (r0 == 0) goto L6e
            long r0 = r12.getAccountId()
            r11.B(r0)
            yo.f r2 = r10.storeManager
            yo.d r3 = yo.d.f170813a
            int r4 = r11.getStoreId()
            java.lang.String r7 = r11.getZip()
            r8 = 8
            r9 = 0
            r5 = 0
            r6 = 0
            yo.f.q(r2, r3, r4, r5, r6, r7, r8, r9)
            yo.k r12 = r10.userManager
            r12.e0(r11)
            return r11
        L6e:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.b.f(Cs.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0174, code lost:
    
        if (h(r3) == r4) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(Bh.b.a r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.b.g(Bh.b$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation<? super Dh.SettingsPreferences> r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof Bh.b.f
            if (r2 == 0) goto L17
            r2 = r0
            Bh.b$f r2 = (Bh.b.f) r2
            int r3 = r2.f2338l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f2338l = r3
            goto L1c
        L17:
            Bh.b$f r2 = new Bh.b$f
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f2336j
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f2338l
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L4c
            if (r4 != r5) goto L44
            java.lang.Object r3 = r2.f2331e
            Dh.y$a r3 = (Dh.SettingsPreferences.Companion) r3
            java.lang.Object r4 = r2.f2330d
            Bh.b r4 = (Bh.b) r4
            java.lang.Object r4 = r2.f2329c
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r4 = r2.f2328b
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r4 = r2.f2327a
            Bh.b r4 = (Bh.b) r4
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Exception -> L42
            goto L74
        L42:
            r0 = move-exception
            goto L7f
        L44:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L4c:
            kotlin.ResultKt.b(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L42
            Dh.y$a r0 = Dh.SettingsPreferences.INSTANCE     // Catch: java.lang.Exception -> L42
            Bh.e r4 = d(r1)     // Catch: java.lang.Exception -> L42
            r2.f2327a = r1     // Catch: java.lang.Exception -> L42
            r2.f2328b = r2     // Catch: java.lang.Exception -> L42
            r2.f2329c = r2     // Catch: java.lang.Exception -> L42
            r2.f2330d = r1     // Catch: java.lang.Exception -> L42
            r2.f2331e = r0     // Catch: java.lang.Exception -> L42
            r2.f2332f = r6     // Catch: java.lang.Exception -> L42
            r2.f2333g = r6     // Catch: java.lang.Exception -> L42
            r2.f2334h = r6     // Catch: java.lang.Exception -> L42
            r2.f2335i = r6     // Catch: java.lang.Exception -> L42
            r2.f2338l = r5     // Catch: java.lang.Exception -> L42
            java.lang.Object r4 = r4.i(r2)     // Catch: java.lang.Exception -> L42
            if (r4 != r3) goto L72
            return r3
        L72:
            r3 = r0
            r0 = r4
        L74:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L42
            Dh.y r0 = r3.a(r0)     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L42
            goto L90
        L7f:
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            qv.E0.i(r2)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L90:
            boolean r2 = kotlin.Result.h(r0)
            if (r2 == 0) goto L9e
            r2 = r0
            Dh.y r2 = (Dh.SettingsPreferences) r2
            yo.k r3 = r1.userManager
            r3.f0(r2)
        L9e:
            java.lang.Throwable r2 = kotlin.Result.e(r0)
            if (r2 == 0) goto Lbe
            uw.a$a r3 = uw.a.INSTANCE
            java.lang.String r4 = "Failed to fetch settings preferences"
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r3.u(r2, r4, r5)
            Dh.y r6 = new Dh.y
            r15 = 255(0xff, float:3.57E-43)
            r16 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        Lbe:
            kotlin.ResultKt.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.b.i(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
