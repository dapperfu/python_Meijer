package Ys;

import B2.InterfaceC2911h;
import Ev.AbstractC3260b;
import F2.f;
import F2.i;
import Qs.p;
import Qs.r;
import Vs.h;
import Vs.n;
import Vs.s;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.okta.authfoundation.client.j;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000e\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u000e\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"LYs/e;", "", "LVs/s;", "tokenStorage", "<init>", "(LVs/s;)V", "", "r", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVs/h$a;", "", "n", "(LVs/h$a;)Z", "s", "o", "a", "LVs/s;", "Landroid/content/Context;", "LB2/h;", "LF2/f;", "b", "Lkotlin/properties/ReadOnlyProperty;", "l", "(Landroid/content/Context;)LB2/h;", "dataStore", "c", "Lkotlin/Lazy;", "k", "()Landroid/content/Context;", "context", "LVs/f;", "d", "m", "()LVs/f;", "defaultCredentialIdDataStore", "Lbt/d;", "e", "Lbt/d;", "jwtParser", "f", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s tokenStorage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReadOnlyProperty dataStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy defaultCredentialIdDataStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bt.d jwtParser;

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f43276g = {Reflection.k(new PropertyReference2Impl(e.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final f.a<Boolean> f43277h = i.a("migrated");

    /* renamed from: i, reason: collision with root package name */
    private static final r<KeyGenParameterSpec> f43278i = new r<>(new Function0() { // from class: Ys.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e.p();
        }
    });

    /* renamed from: j, reason: collision with root package name */
    private static final r<h> f43279j = new r<>(new Function0() { // from class: Ys.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e.q();
        }
    });

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00188\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00188\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001a¨\u0006!"}, d2 = {"LYs/e$a;", "", "<init>", "()V", "Landroid/security/keystore/KeyGenParameterSpec;", "keyGenParameterSpec", "LVs/n;", "d", "(Landroid/security/keystore/KeyGenParameterSpec;)LVs/n;", "<set-?>", "legacyKeyGenParameterSpec$delegate", "LQs/r;", "b", "()Landroid/security/keystore/KeyGenParameterSpec;", "setLegacyKeyGenParameterSpec", "(Landroid/security/keystore/KeyGenParameterSpec;)V", "legacyKeyGenParameterSpec", "LVs/h;", "legacyStorage$delegate", "c", "()LVs/h;", "setLegacyStorage", "(LVs/h;)V", "legacyStorage", "", "PREFERENCE_NAME", "Ljava/lang/String;", "LF2/f$a;", "", "MIGRATED", "LF2/f$a;", "LEGACY_CREDENTIAL_NAME_TAG_KEY", "LEGACY_DEFAULT_CREDENTIAL_NAME_TAG_VALUE", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ys.e$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f43285a = {Reflection.f(new MutablePropertyReference1Impl(Companion.class, "legacyKeyGenParameterSpec", "getLegacyKeyGenParameterSpec()Landroid/security/keystore/KeyGenParameterSpec;", 0)), Reflection.f(new MutablePropertyReference1Impl(Companion.class, "legacyStorage", "getLegacyStorage()Lcom/okta/authfoundation/credential/LegacyTokenStorage;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final n d(KeyGenParameterSpec keyGenParameterSpec) {
            AbstractC3260b abstractC3260bB = j.INSTANCE.b();
            p pVar = p.f31427a;
            return new n(abstractC3260bB, pVar.C(), pVar.A(), Ss.a.f35759a.a(), keyGenParameterSpec);
        }

        public final KeyGenParameterSpec b() {
            return (KeyGenParameterSpec) e.f43278i.a(this, f43285a[0]);
        }

        public final h c() {
            return (h) e.f43279j.a(this, f43285a[1]);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.storage.migration.V1ToV2StorageMigrator", f = "V1ToV2StorageMigrator.kt", l = {77}, m = "isMigrationNeeded$auth_foundation_release")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f43286a;

        /* renamed from: c, reason: collision with root package name */
        int f43288c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43286a = obj;
            this.f43288c |= Integer.MIN_VALUE;
            return e.this.o(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.storage.migration.V1ToV2StorageMigrator", f = "V1ToV2StorageMigrator.kt", l = {82, 91, 93}, m = "migrate")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f43289a;

        /* renamed from: b, reason: collision with root package name */
        Object f43290b;

        /* renamed from: c, reason: collision with root package name */
        Object f43291c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f43292d;

        /* renamed from: f, reason: collision with root package name */
        int f43294f;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43292d = obj;
            this.f43294f |= Integer.MIN_VALUE;
            return e.this.r(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.storage.migration.V1ToV2StorageMigrator", f = "V1ToV2StorageMigrator.kt", l = {70, 70, 71}, m = "migrateIfNeeded$auth_foundation_release")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f43295a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f43296b;

        /* renamed from: d, reason: collision with root package name */
        int f43298d;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43296b = obj;
            this.f43298d |= Integer.MIN_VALUE;
            return e.this.s(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.credential.storage.migration.V1ToV2StorageMigrator$migrateIfNeeded$2", f = "V1ToV2StorageMigrator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ys.e$e, reason: collision with other inner class name */
    static final class C0916e extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f43299a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f43300b;

        C0916e(Continuation<? super C0916e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0916e c0916e = new C0916e(continuation);
            c0916e.f43300b = obj;
            return c0916e;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((C0916e) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f43299a == 0) {
                ResultKt.b(obj);
                ((F2.c) this.f43300b).i(e.f43277h, Boxing.a(true));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e(s tokenStorage) {
        Intrinsics.j(tokenStorage, "tokenStorage");
        this.tokenStorage = tokenStorage;
        this.dataStore = E2.a.b("com.okta.authfoundation.credential.storage.isStorageMigratedFromV1", null, null, null, 14, null);
        this.context = LazyKt.b(new Function0() { // from class: Ys.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.i();
            }
        });
        this.defaultCredentialIdDataStore = LazyKt.b(new Function0() { // from class: Ys.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.j();
            }
        });
        this.jwtParser = bt.d.INSTANCE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context i() {
        return Ss.a.f35759a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vs.f j() {
        return Vs.f.INSTANCE.a();
    }

    private final Context k() {
        return (Context) this.context.getValue();
    }

    private final InterfaceC2911h<f> l(Context context) {
        return (InterfaceC2911h) this.dataStore.getValue(context, f43276g[0]);
    }

    private final Vs.f m() {
        return (Vs.f) this.defaultCredentialIdDataStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyGenParameterSpec p() {
        KeyGenParameterSpec AES256_GCM_SPEC = z4.e.f172377a;
        Intrinsics.i(AES256_GCM_SPEC, "AES256_GCM_SPEC");
        return AES256_GCM_SPEC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h q() {
        Companion companion = INSTANCE;
        return companion.d(companion.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:43:0x00d2, B:55:?], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:55:?, B:43:0x00d2], limit reached: 53 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d0 -> B:30:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e6 -> B:30:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ys.e.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Ys.e.b
            if (r0 == 0) goto L13
            r0 = r5
            Ys.e$b r0 = (Ys.e.b) r0
            int r1 = r0.f43288c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43288c = r1
            goto L18
        L13:
            Ys.e$b r0 = new Ys.e$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f43286a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f43288c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            android.content.Context r5 = r4.k()
            B2.h r5 = r4.l(r5)
            pv.f r5 = r5.getData()
            r0.f43288c = r3
            java.lang.Object r5 = pv.C16563h.C(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            F2.f r5 = (F2.f) r5
            if (r5 == 0) goto L5f
            F2.f$a<java.lang.Boolean> r0 = Ys.e.f43277h
            java.lang.Object r5 = r5.b(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L5f
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L5e
            goto L5f
        L5e:
            r3 = 0
        L5f:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ys.e.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (F2.j.a(r7, r2, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Ys.e.d
            if (r0 == 0) goto L13
            r0 = r7
            Ys.e$d r0 = (Ys.e.d) r0
            int r1 = r0.f43298d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43298d = r1
            goto L18
        L13:
            Ys.e$d r0 = new Ys.e$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f43296b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f43298d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.b(r7)
            goto L82
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f43295a
            Ys.e r2 = (Ys.e) r2
            kotlin.ResultKt.b(r7)
            goto L69
        L3f:
            java.lang.Object r2 = r0.f43295a
            Ys.e r2 = (Ys.e) r2
            kotlin.ResultKt.b(r7)
            goto L56
        L47:
            kotlin.ResultKt.b(r7)
            r0.f43295a = r6
            r0.f43298d = r5
            java.lang.Object r7 = r6.o(r0)
            if (r7 != r1) goto L55
            goto L81
        L55:
            r2 = r6
        L56:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L69
            r0.f43295a = r2
            r0.f43298d = r4
            java.lang.Object r7 = r2.r(r0)
            if (r7 != r1) goto L69
            goto L81
        L69:
            android.content.Context r7 = r2.k()
            B2.h r7 = r2.l(r7)
            Ys.e$e r2 = new Ys.e$e
            r4 = 0
            r2.<init>(r4)
            r0.f43295a = r4
            r0.f43298d = r3
            java.lang.Object r7 = F2.j.a(r7, r2, r0)
            if (r7 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ys.e.s(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean n(h.a aVar) {
        return Intrinsics.e(aVar.b().get("com.okta.kotlin.credential.name"), "Default");
    }
}
