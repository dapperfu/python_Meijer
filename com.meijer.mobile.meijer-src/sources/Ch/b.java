package Ch;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yo.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001d\u001fB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0012J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'¨\u0006("}, d2 = {"LCh/b;", "", "LCh/e;", "profileRepository", "LCh/c;", "accountsAMSRepository", "LZq/b;", "storeInfoRepository", "Lyo/k;", "userManager", "Lyo/f;", "storeManager", "Lzl/k;", "featureManager", "<init>", "(LCh/e;LCh/c;LZq/b;Lyo/k;Lyo/f;Lzl/k;)V", "", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCh/b$a;", "callback", "g", "(LCh/b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEh/y;", "i", "LCs/a;", "account", "f", "(LCs/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LCh/e;", "b", "LCh/c;", "c", "LZq/b;", "d", "Lyo/k;", "e", "Lyo/f;", "Lzl/k;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ch.e profileRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ch.c accountsAMSRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"LCh/b$a;", "", "LCh/b$b;", "calls", "", "a", "(LCh/b$b;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void a(EnumC0088b calls);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LCh/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ch.b$b, reason: collision with other inner class name */
    public static final class EnumC0088b {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0088b f4323a = new EnumC0088b("USER_TOKEN", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0088b f4324b = new EnumC0088b("ACCOUNT", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0088b f4325c = new EnumC0088b("PREFERENCES", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumC0088b[] f4326d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f4327e;

        static {
            EnumC0088b[] enumC0088bArrA = a();
            f4326d = enumC0088bArrA;
            f4327e = EnumEntriesKt.a(enumC0088bArrA);
        }

        private static final /* synthetic */ EnumC0088b[] a() {
            return new EnumC0088b[]{f4323a, f4324b, f4325c};
        }

        public static EnumC0088b valueOf(String str) {
            return (EnumC0088b) Enum.valueOf(EnumC0088b.class, str);
        }

        public static EnumC0088b[] values() {
            return (EnumC0088b[]) f4326d.clone();
        }

        private EnumC0088b(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountRepository", f = "AccountRepository.kt", l = {107}, m = "createNewAccount")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4328a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f4329b;

        /* renamed from: d, reason: collision with root package name */
        int f4331d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4329b = obj;
            this.f4331d |= Integer.MIN_VALUE;
            return b.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountRepository", f = "AccountRepository.kt", l = {50, 52, 56, 57}, m = "fetchAccountData")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4332a;

        /* renamed from: b, reason: collision with root package name */
        Object f4333b;

        /* renamed from: c, reason: collision with root package name */
        Object f4334c;

        /* renamed from: d, reason: collision with root package name */
        Object f4335d;

        /* renamed from: e, reason: collision with root package name */
        Object f4336e;

        /* renamed from: f, reason: collision with root package name */
        int f4337f;

        /* renamed from: g, reason: collision with root package name */
        int f4338g;

        /* renamed from: h, reason: collision with root package name */
        int f4339h;

        /* renamed from: i, reason: collision with root package name */
        int f4340i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f4341j;

        /* renamed from: l, reason: collision with root package name */
        int f4343l;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4341j = obj;
            this.f4343l |= Integer.MIN_VALUE;
            return b.this.g(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountRepository", f = "AccountRepository.kt", l = {64}, m = "fetchStoreInfo")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4344a;

        /* renamed from: b, reason: collision with root package name */
        Object f4345b;

        /* renamed from: c, reason: collision with root package name */
        Object f4346c;

        /* renamed from: d, reason: collision with root package name */
        Object f4347d;

        /* renamed from: e, reason: collision with root package name */
        Object f4348e;

        /* renamed from: f, reason: collision with root package name */
        int f4349f;

        /* renamed from: g, reason: collision with root package name */
        int f4350g;

        /* renamed from: h, reason: collision with root package name */
        int f4351h;

        /* renamed from: i, reason: collision with root package name */
        int f4352i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f4353j;

        /* renamed from: l, reason: collision with root package name */
        int f4355l;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4353j = obj;
            this.f4355l |= Integer.MIN_VALUE;
            return b.this.h(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.AccountRepository", f = "AccountRepository.kt", l = {91}, m = "getSettingsPreferences")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4356a;

        /* renamed from: b, reason: collision with root package name */
        Object f4357b;

        /* renamed from: c, reason: collision with root package name */
        Object f4358c;

        /* renamed from: d, reason: collision with root package name */
        Object f4359d;

        /* renamed from: e, reason: collision with root package name */
        Object f4360e;

        /* renamed from: f, reason: collision with root package name */
        int f4361f;

        /* renamed from: g, reason: collision with root package name */
        int f4362g;

        /* renamed from: h, reason: collision with root package name */
        int f4363h;

        /* renamed from: i, reason: collision with root package name */
        int f4364i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f4365j;

        /* renamed from: l, reason: collision with root package name */
        int f4367l;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4365j = obj;
            this.f4367l |= Integer.MIN_VALUE;
            return b.this.i(this);
        }
    }

    public b(Ch.e profileRepository, Ch.c accountsAMSRepository, Zq.b storeInfoRepository, k userManager, yo.f storeManager, zl.k featureManager) {
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
        throw new UnsupportedOperationException("Method not decompiled: Ch.b.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(Cs.MeijerAccount r11, kotlin.coroutines.Continuation<? super Cs.MeijerAccount> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof Ch.b.c
            if (r0 == 0) goto L13
            r0 = r12
            Ch.b$c r0 = (Ch.b.c) r0
            int r1 = r0.f4331d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4331d = r1
            goto L18
        L13:
            Ch.b$c r0 = new Ch.b$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f4329b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4331d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.f4328a
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
            Ch.e r12 = r10.profileRepository
            r0.f4328a = r11
            r0.f4331d = r3
            java.lang.Object r12 = r12.d(r11, r0)
            if (r12 != r1) goto L45
            return r1
        L45:
            Eh.D r12 = (Eh.UpdateConfirmationResponse) r12
            boolean r0 = r12.getIsSuccess()
            if (r0 == 0) goto L6e
            long r0 = r12.getAccountId()
            r11.B(r0)
            yo.f r2 = r10.storeManager
            yo.d r3 = yo.d.f171588a
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
        throw new UnsupportedOperationException("Method not decompiled: Ch.b.f(Cs.a, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object g(Ch.b.a r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.b.g(Ch.b$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation<? super Eh.SettingsPreferences> r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof Ch.b.f
            if (r2 == 0) goto L17
            r2 = r0
            Ch.b$f r2 = (Ch.b.f) r2
            int r3 = r2.f4367l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f4367l = r3
            goto L1c
        L17:
            Ch.b$f r2 = new Ch.b$f
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f4365j
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f4367l
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L4c
            if (r4 != r5) goto L44
            java.lang.Object r3 = r2.f4360e
            Eh.y$a r3 = (Eh.SettingsPreferences.Companion) r3
            java.lang.Object r4 = r2.f4359d
            Ch.b r4 = (Ch.b) r4
            java.lang.Object r4 = r2.f4358c
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r4 = r2.f4357b
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r4 = r2.f4356a
            Ch.b r4 = (Ch.b) r4
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
            Eh.y$a r0 = Eh.SettingsPreferences.INSTANCE     // Catch: java.lang.Exception -> L42
            Ch.e r4 = d(r1)     // Catch: java.lang.Exception -> L42
            r2.f4356a = r1     // Catch: java.lang.Exception -> L42
            r2.f4357b = r2     // Catch: java.lang.Exception -> L42
            r2.f4358c = r2     // Catch: java.lang.Exception -> L42
            r2.f4359d = r1     // Catch: java.lang.Exception -> L42
            r2.f4360e = r0     // Catch: java.lang.Exception -> L42
            r2.f4361f = r6     // Catch: java.lang.Exception -> L42
            r2.f4362g = r6     // Catch: java.lang.Exception -> L42
            r2.f4363h = r6     // Catch: java.lang.Exception -> L42
            r2.f4364i = r6     // Catch: java.lang.Exception -> L42
            r2.f4367l = r5     // Catch: java.lang.Exception -> L42
            java.lang.Object r4 = r4.i(r2)     // Catch: java.lang.Exception -> L42
            if (r4 != r3) goto L72
            return r3
        L72:
            r3 = r0
            r0 = r4
        L74:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L42
            Eh.y r0 = r3.a(r0)     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L42
            goto L90
        L7f:
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            mv.E0.i(r2)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L90:
            boolean r2 = kotlin.Result.h(r0)
            if (r2 == 0) goto L9e
            r2 = r0
            Eh.y r2 = (Eh.SettingsPreferences) r2
            yo.k r3 = r1.userManager
            r3.f0(r2)
        L9e:
            java.lang.Throwable r2 = kotlin.Result.e(r0)
            if (r2 == 0) goto Lbe
            qw.a$a r3 = qw.a.INSTANCE
            java.lang.String r4 = "Failed to fetch settings preferences"
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r3.u(r2, r4, r5)
            Eh.y r6 = new Eh.y
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
        throw new UnsupportedOperationException("Method not decompiled: Ch.b.i(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
