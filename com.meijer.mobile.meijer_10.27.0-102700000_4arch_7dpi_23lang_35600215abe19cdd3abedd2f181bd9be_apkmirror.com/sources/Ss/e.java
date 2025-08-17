package Ss;

import B2.InterfaceC2943h;
import F2.f;
import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u000e\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0011*\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"LSs/e;", "", "Lct/b;", "aesEncryptionHandler", "<init>", "(Lct/b;)V", "", "deviceToken", "LF2/f;", "k", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LSs/e$b;", "i", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lct/b;", "Landroid/content/Context;", "LB2/h;", "b", "Lkotlin/properties/ReadOnlyProperty;", "h", "(Landroid/content/Context;)LB2/h;", "dataStore", "c", "Lkotlin/Lazy;", "g", "()Landroid/content/Context;", "context", "d", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ct.b aesEncryptionHandler;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReadOnlyProperty dataStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy context;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f34696e = {Reflection.k(new PropertyReference2Impl(e.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final f.a<String> f34697f = F2.i.g("encryptedEncryptionToken");

    /* renamed from: g, reason: collision with root package name */
    private static final Lazy<e> f34698g = LazyKt.b(new Function0() { // from class: Ss.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e.j();
        }
    });

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LSs/e$a;", "", "<init>", "()V", "LF2/f$a;", "", "PREFERENCE_KEY", "LF2/f$a;", "b", "()LF2/f$a;", "LSs/e;", "instance$delegate", "Lkotlin/Lazy;", "a", "()LSs/e;", "instance", "PREFERENCE_NAME", "Ljava/lang/String;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ss.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final e a() {
            return (e) e.f34698g.getValue();
        }

        public final f.a<String> b() {
            return e.f34697f;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"LSs/e$b;", "", "", "a", "()Ljava/lang/String;", "token", "b", "LSs/e$b$a;", "LSs/e$b$b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LSs/e$b$a;", "LSs/e$b;", "", "token", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String token;

            public a(String token) {
                Intrinsics.j(token, "token");
                this.token = token;
            }

            @Override // Ss.e.b
            /* renamed from: a, reason: from getter */
            public String getToken() {
                return this.token;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LSs/e$b$b;", "LSs/e$b;", "", "token", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Ss.e$b$b, reason: collision with other inner class name */
        public static final class C0769b implements b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String token;

            public C0769b(String token) {
                Intrinsics.j(token, "token");
                this.token = token;
            }

            @Override // Ss.e.b
            /* renamed from: a, reason: from getter */
            public String getToken() {
                return this.token;
            }
        }

        /* renamed from: a */
        String getToken();
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.client.EncryptionTokenProvider", f = "EncryptionTokenProvider.kt", l = {48, 54}, m = "getEncryptionToken")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f34704a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34705b;

        /* renamed from: d, reason: collision with root package name */
        int f34707d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34705b = obj;
            this.f34707d |= Integer.MIN_VALUE;
            return e.this.i(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.client.EncryptionTokenProvider$setDeviceToken$2", f = "EncryptionTokenProvider.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34708a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34709b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f34711d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f34711d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = e.this.new d(this.f34711d, continuation);
            dVar.f34709b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((d) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f34708a == 0) {
                ResultKt.b(obj);
                ((F2.c) this.f34709b).i(e.INSTANCE.b(), e.this.aesEncryptionHandler.e(this.f34711d));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e(ct.b aesEncryptionHandler) {
        Intrinsics.j(aesEncryptionHandler, "aesEncryptionHandler");
        this.aesEncryptionHandler = aesEncryptionHandler;
        this.dataStore = E2.a.b("com.okta.authfoundation.client.encryptionToken", null, null, null, 14, null);
        this.context = LazyKt.b(new Function0() { // from class: Ss.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context f() {
        return a.f34693a.a();
    }

    private final Context g() {
        return (Context) this.context.getValue();
    }

    private final InterfaceC2943h<F2.f> h(Context context) {
        return (InterfaceC2943h) this.dataStore.getValue(context, f34696e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e j() {
        return new e(new ct.b(null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation<? super Ss.e.b> r7) throws java.security.KeyStoreException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Ss.e.c
            if (r0 == 0) goto L13
            r0 = r7
            Ss.e$c r0 = (Ss.e.c) r0
            int r1 = r0.f34707d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34707d = r1
            goto L18
        L13:
            Ss.e$c r0 = new Ss.e$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34705b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f34707d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f34704a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.b(r7)
            goto La4
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            java.lang.Object r2 = r0.f34704a
            Ss.e r2 = (Ss.e) r2
            kotlin.ResultKt.b(r7)
            goto L5c
        L41:
            kotlin.ResultKt.b(r7)
            android.content.Context r7 = r6.g()
            B2.h r7 = r6.h(r7)
            tv.f r7 = r7.getData()
            r0.f34704a = r6
            r0.f34707d = r4
            java.lang.Object r7 = tv.C17154h.C(r7, r0)
            if (r7 != r1) goto L5b
            goto La2
        L5b:
            r2 = r6
        L5c:
            F2.f r7 = (F2.f) r7
            r4 = 0
            if (r7 == 0) goto L6a
            F2.f$a<java.lang.String> r5 = Ss.e.f34697f
            java.lang.Object r7 = r7.b(r5)
            java.lang.String r7 = (java.lang.String) r7
            goto L6b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L86
            ct.b r5 = r2.aesEncryptionHandler
            java.lang.Object r7 = r5.c(r7)
            boolean r5 = kotlin.Result.g(r7)
            if (r5 == 0) goto L7a
            r7 = r4
        L7a:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L83
            Ss.e$b$a r4 = new Ss.e$b$a
            r4.<init>(r7)
        L83:
            if (r4 == 0) goto L86
            return r4
        L86:
            ct.b r7 = r2.aesEncryptionHandler
            r7.g()
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.i(r7, r4)
            r0.f34704a = r7
            r0.f34707d = r3
            java.lang.Object r0 = r2.k(r7, r0)
            if (r0 != r1) goto La3
        La2:
            return r1
        La3:
            r0 = r7
        La4:
            Ss.e$b$b r7 = new Ss.e$b$b
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ss.e.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object k(String str, Continuation<? super F2.f> continuation) {
        return F2.j.a(h(g()), new d(str, null), continuation);
    }
}
