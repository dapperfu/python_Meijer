package zh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0011J\"\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0016H\u0086@¢\u0006\u0004\b \u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lzh/c;", "", "Lyh/b;", "accountsAMSApi", "LXi/a;", "authTokenProvider", "LCs/b;", "userProvider", "<init>", "(Lyh/b;LXi/a;LCs/b;)V", "LDh/i;", "createAccountSubmission", "LDh/h;", "e", "(LDh/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCs/a;", "g", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "LDh/a;", "h", "accountAddress", "", "skipAddressVerification", "LDh/d;", "d", "(LDh/a;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "", "accountAddressId", "f", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "a", "Lyh/b;", "b", "LXi/a;", "c", "LCs/b;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: zh.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C18465c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yh.b accountsAMSApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Xi.a authTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountsAMSDataSource", f = "AccountsAMSDataSource.kt", l = {109, 107}, m = "addAccountAddress")
    /* renamed from: zh.c$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f171866a;

        /* renamed from: b, reason: collision with root package name */
        Object f171867b;

        /* renamed from: c, reason: collision with root package name */
        Object f171868c;

        /* renamed from: d, reason: collision with root package name */
        Object f171869d;

        /* renamed from: e, reason: collision with root package name */
        Object f171870e;

        /* renamed from: f, reason: collision with root package name */
        Object f171871f;

        /* renamed from: g, reason: collision with root package name */
        Object f171872g;

        /* renamed from: h, reason: collision with root package name */
        boolean f171873h;

        /* renamed from: i, reason: collision with root package name */
        int f171874i;

        /* renamed from: j, reason: collision with root package name */
        int f171875j;

        /* renamed from: k, reason: collision with root package name */
        int f171876k;

        /* renamed from: l, reason: collision with root package name */
        int f171877l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f171878m;

        /* renamed from: o, reason: collision with root package name */
        int f171880o;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f171878m = obj;
            this.f171880o |= Integer.MIN_VALUE;
            return C18465c.this.d(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountsAMSDataSource", f = "AccountsAMSDataSource.kt", l = {49}, m = "createAccount")
    /* renamed from: zh.c$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f171881a;

        /* renamed from: b, reason: collision with root package name */
        Object f171882b;

        /* renamed from: c, reason: collision with root package name */
        Object f171883c;

        /* renamed from: d, reason: collision with root package name */
        Object f171884d;

        /* renamed from: e, reason: collision with root package name */
        Object f171885e;

        /* renamed from: f, reason: collision with root package name */
        int f171886f;

        /* renamed from: g, reason: collision with root package name */
        int f171887g;

        /* renamed from: h, reason: collision with root package name */
        int f171888h;

        /* renamed from: i, reason: collision with root package name */
        int f171889i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f171890j;

        /* renamed from: l, reason: collision with root package name */
        int f171892l;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f171890j = obj;
            this.f171892l |= Integer.MIN_VALUE;
            return C18465c.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountsAMSDataSource", f = "AccountsAMSDataSource.kt", l = {163, 160}, m = "deleteAccountAddress")
    /* renamed from: zh.c$c, reason: collision with other inner class name */
    static final class C2770c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        long f171893a;

        /* renamed from: b, reason: collision with root package name */
        Object f171894b;

        /* renamed from: c, reason: collision with root package name */
        Object f171895c;

        /* renamed from: d, reason: collision with root package name */
        Object f171896d;

        /* renamed from: e, reason: collision with root package name */
        Object f171897e;

        /* renamed from: f, reason: collision with root package name */
        Object f171898f;

        /* renamed from: g, reason: collision with root package name */
        Object f171899g;

        /* renamed from: h, reason: collision with root package name */
        int f171900h;

        /* renamed from: i, reason: collision with root package name */
        int f171901i;

        /* renamed from: j, reason: collision with root package name */
        int f171902j;

        /* renamed from: k, reason: collision with root package name */
        int f171903k;

        /* renamed from: l, reason: collision with root package name */
        int f171904l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f171905m;

        /* renamed from: o, reason: collision with root package name */
        int f171907o;

        C2770c(Continuation<? super C2770c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f171905m = obj;
            this.f171907o |= Integer.MIN_VALUE;
            return C18465c.this.f(0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountsAMSDataSource", f = "AccountsAMSDataSource.kt", l = {71, 69}, m = "getAccount")
    /* renamed from: zh.c$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f171908a;

        /* renamed from: b, reason: collision with root package name */
        Object f171909b;

        /* renamed from: c, reason: collision with root package name */
        Object f171910c;

        /* renamed from: d, reason: collision with root package name */
        Object f171911d;

        /* renamed from: e, reason: collision with root package name */
        Object f171912e;

        /* renamed from: f, reason: collision with root package name */
        Object f171913f;

        /* renamed from: g, reason: collision with root package name */
        int f171914g;

        /* renamed from: h, reason: collision with root package name */
        int f171915h;

        /* renamed from: i, reason: collision with root package name */
        int f171916i;

        /* renamed from: j, reason: collision with root package name */
        int f171917j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f171918k;

        /* renamed from: m, reason: collision with root package name */
        int f171920m;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f171918k = obj;
            this.f171920m |= Integer.MIN_VALUE;
            return C18465c.this.g(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountsAMSDataSource", f = "AccountsAMSDataSource.kt", l = {86, 84}, m = "getAccountAddresses")
    /* renamed from: zh.c$e */
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f171921a;

        /* renamed from: b, reason: collision with root package name */
        Object f171922b;

        /* renamed from: c, reason: collision with root package name */
        Object f171923c;

        /* renamed from: d, reason: collision with root package name */
        Object f171924d;

        /* renamed from: e, reason: collision with root package name */
        Object f171925e;

        /* renamed from: f, reason: collision with root package name */
        Object f171926f;

        /* renamed from: g, reason: collision with root package name */
        int f171927g;

        /* renamed from: h, reason: collision with root package name */
        int f171928h;

        /* renamed from: i, reason: collision with root package name */
        int f171929i;

        /* renamed from: j, reason: collision with root package name */
        int f171930j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f171931k;

        /* renamed from: m, reason: collision with root package name */
        int f171933m;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f171931k = obj;
            this.f171933m |= Integer.MIN_VALUE;
            return C18465c.this.h(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountsAMSDataSource", f = "AccountsAMSDataSource.kt", l = {183, 181}, m = "sendEmailVerification")
    /* renamed from: zh.c$f */
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f171934a;

        /* renamed from: b, reason: collision with root package name */
        Object f171935b;

        /* renamed from: c, reason: collision with root package name */
        Object f171936c;

        /* renamed from: d, reason: collision with root package name */
        Object f171937d;

        /* renamed from: e, reason: collision with root package name */
        Object f171938e;

        /* renamed from: f, reason: collision with root package name */
        Object f171939f;

        /* renamed from: g, reason: collision with root package name */
        int f171940g;

        /* renamed from: h, reason: collision with root package name */
        int f171941h;

        /* renamed from: i, reason: collision with root package name */
        int f171942i;

        /* renamed from: j, reason: collision with root package name */
        int f171943j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f171944k;

        /* renamed from: m, reason: collision with root package name */
        int f171946m;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f171944k = obj;
            this.f171946m |= Integer.MIN_VALUE;
            return C18465c.this.i(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.AccountsAMSDataSource", f = "AccountsAMSDataSource.kt", l = {138, 135}, m = "updateAccountAddress")
    /* renamed from: zh.c$g */
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f171947a;

        /* renamed from: b, reason: collision with root package name */
        Object f171948b;

        /* renamed from: c, reason: collision with root package name */
        Object f171949c;

        /* renamed from: d, reason: collision with root package name */
        Object f171950d;

        /* renamed from: e, reason: collision with root package name */
        Object f171951e;

        /* renamed from: f, reason: collision with root package name */
        Object f171952f;

        /* renamed from: g, reason: collision with root package name */
        Object f171953g;

        /* renamed from: h, reason: collision with root package name */
        boolean f171954h;

        /* renamed from: i, reason: collision with root package name */
        int f171955i;

        /* renamed from: j, reason: collision with root package name */
        int f171956j;

        /* renamed from: k, reason: collision with root package name */
        int f171957k;

        /* renamed from: l, reason: collision with root package name */
        int f171958l;

        /* renamed from: m, reason: collision with root package name */
        int f171959m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f171960n;

        /* renamed from: p, reason: collision with root package name */
        int f171962p;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f171960n = obj;
            this.f171962p |= Integer.MIN_VALUE;
            return C18465c.this.j(null, false, this);
        }
    }

    public C18465c(yh.b accountsAMSApi, Xi.a authTokenProvider, Cs.b userProvider) {
        Intrinsics.j(accountsAMSApi, "accountsAMSApi");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(userProvider, "userProvider");
        this.accountsAMSApi = accountsAMSApi;
        this.authTokenProvider = authTokenProvider;
        this.userProvider = userProvider;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:8))(0)|7|9|72|(1:(1:(5:13|14|15|33|(5:35|41|(3:74|44|(5:46|(1:48)(1:51)|(1:53)(1:54)|(4:58|(1:60)|61|(1:65))|66)(1:68))|70|71)(2:38|39))(2:18|19))(3:20|21|22))(3:23|24|(2:26|32)(1:27))|28|29|73|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0107, code lost:
    
        if (r0 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0124, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012c, code lost:
    
        qv.E0.i(r8.getContext());
        r2 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.b(kotlin.ResultKt.a(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(Dh.AccountAddress r19, boolean r20, kotlin.coroutines.Continuation<? super Dh.AbstractC3371d> r21) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.C18465c.d(Dh.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(Dh.CreateAccountSubmission r6, kotlin.coroutines.Continuation<? super Dh.AbstractC3375h> r7) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.C18465c.e(Dh.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
    
        if (r0 == r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r21, kotlin.coroutines.Continuation<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.C18465c.f(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation<? super Cs.MeijerAccount> r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.C18465c.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.Continuation<? super java.util.List<Dh.AccountAddress>> r14) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.C18465c.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (r15 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.C18465c.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:73)|(1:(1:(5:13|14|15|33|(5:35|41|(3:74|44|(5:46|(1:48)(1:51)|(1:53)(1:54)|(4:58|(1:60)|61|(1:65))|66)(1:68))|70|71)(2:38|39))(2:18|19))(3:20|21|22))(3:23|24|(2:26|32)(1:27))|28|29|72|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0113, code lost:
    
        if (r0 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0130, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0138, code lost:
    
        qv.E0.i(r9.getContext());
        r2 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.b(kotlin.ResultKt.a(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(Dh.AccountAddress r20, boolean r21, kotlin.coroutines.Continuation<? super Dh.AbstractC3371d> r22) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.C18465c.j(Dh.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
