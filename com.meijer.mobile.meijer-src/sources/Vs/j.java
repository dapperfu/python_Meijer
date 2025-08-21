package Vs;

import Vs.b;
import android.content.Context;
import com.okta.authfoundation.credential.storage.TokenDatabase;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u001e\u0010\u0017J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001f\u0010 J\"\u0010!\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%¨\u0006'"}, d2 = {"LVs/j;", "LVs/s;", "Lcom/okta/authfoundation/credential/storage/TokenDatabase;", "tokenDatabase", "LVs/q;", "tokenEncryptionHandler", "<init>", "(Lcom/okta/authfoundation/credential/storage/TokenDatabase;LVs/q;)V", "Lcom/okta/authfoundation/credential/storage/TokenEntity;", "tokenEntity", "Landroidx/biometric/e$d;", "promptInfo", "LVs/p;", "k", "(Lcom/okta/authfoundation/credential/storage/TokenEntity;Landroidx/biometric/e$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVs/b$c;", "", "j", "(LVs/b$c;)Ljava/lang/Integer;", "", PreferencesHelper.PREF_ID, "LVs/p$c;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "token", "metadata", "security", "", "b", "(LVs/p;LVs/p$c;LVs/b$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "e", "(LVs/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Landroidx/biometric/e$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVs/q;", "LXs/a;", "LXs/a;", "tokenDao", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class j implements s {

    /* renamed from: d, reason: collision with root package name */
    private static j f40334d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q tokenEncryptionHandler;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Xs.a tokenDao;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC17929a f40335e = wv.g.b(false, 1, null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000b\u0010\u0006R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LVs/j$a;", "", "<init>", "()V", "LVs/j;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "", "d", "(Landroid/content/Context;)Z", "c", "instance", "LVs/j;", "Lwv/a;", "instanceMutex", "Lwv/a;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Vs.j$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.okta.authfoundation.credential.RoomTokenStorage$Companion", f = "RoomTokenStorage.kt", l = {56, 70}, m = "createInstance")
        /* renamed from: Vs.j$a$a, reason: collision with other inner class name */
        static final class C0868a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f40338a;

            /* renamed from: b, reason: collision with root package name */
            Object f40339b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f40340c;

            /* renamed from: e, reason: collision with root package name */
            int f40342e;

            C0868a(Continuation<? super C0868a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f40340c = obj;
                this.f40342e |= Integer.MIN_VALUE;
                return Companion.this.b(this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.okta.authfoundation.credential.RoomTokenStorage$Companion", f = "RoomTokenStorage.kt", l = {185, 47}, m = "getInstance")
        /* renamed from: Vs.j$a$b */
        static final class b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f40343a;

            /* renamed from: b, reason: collision with root package name */
            Object f40344b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f40345c;

            /* renamed from: e, reason: collision with root package name */
            int f40347e;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f40345c = obj;
                this.f40347e |= Integer.MIN_VALUE;
                return Companion.this.c(this);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(kotlin.coroutines.Continuation<? super Vs.j> r7) throws java.security.KeyStoreException {
            /*
                r6 = this;
                boolean r0 = r7 instanceof Vs.j.Companion.C0868a
                if (r0 == 0) goto L13
                r0 = r7
                Vs.j$a$a r0 = (Vs.j.Companion.C0868a) r0
                int r1 = r0.f40342e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40342e = r1
                goto L18
            L13:
                Vs.j$a$a r0 = new Vs.j$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f40340c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f40342e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.f40338a
                Vs.j r0 = (Vs.j) r0
                kotlin.ResultKt.b(r7)
                return r0
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r2 = r0.f40339b
                android.content.Context r2 = (android.content.Context) r2
                java.lang.Object r4 = r0.f40338a
                Vs.j$a r4 = (Vs.j.Companion) r4
                kotlin.ResultKt.b(r7)
                goto L61
            L44:
                kotlin.ResultKt.b(r7)
                Ss.a r7 = Ss.a.f35759a
                android.content.Context r2 = r7.a()
                Ss.e$a r7 = Ss.e.INSTANCE
                Ss.e r7 = r7.a()
                r0.f40338a = r6
                r0.f40339b = r2
                r0.f40342e = r4
                java.lang.Object r7 = r7.i(r0)
                if (r7 != r1) goto L60
                goto Lb2
            L60:
                r4 = r6
            L61:
                Ss.e$b r7 = (Ss.e.b) r7
                boolean r5 = r7 instanceof Ss.e.b.C0790b
                if (r5 == 0) goto L6a
                r4.d(r2)
            L6a:
                java.lang.String r7 = r7.getToken()
                java.lang.String r4 = "sqlcipher"
                java.lang.System.loadLibrary(r4)
                java.lang.Class<com.okta.authfoundation.credential.storage.TokenDatabase> r4 = com.okta.authfoundation.credential.storage.TokenDatabase.class
                java.lang.String r5 = "token_database"
                androidx.room.G$a r2 = androidx.room.C6278w.a(r2, r4, r5)
                net.zetetic.database.sqlcipher.SupportOpenHelperFactory r4 = new net.zetetic.database.sqlcipher.SupportOpenHelperFactory
                java.nio.charset.Charset r5 = kotlin.text.Charsets.UTF_8
                byte[] r7 = r7.getBytes(r5)
                java.lang.String r5 = "getBytes(...)"
                kotlin.jvm.internal.Intrinsics.i(r7, r5)
                r4.<init>(r7)
                androidx.room.G$a r7 = r2.g(r4)
                androidx.room.G r7 = r7.d()
                com.okta.authfoundation.credential.storage.TokenDatabase r7 = (com.okta.authfoundation.credential.storage.TokenDatabase) r7
                Vs.j r2 = new Vs.j
                Qs.p r4 = Qs.p.f31427a
                Vs.q r4 = r4.F()
                r2.<init>(r7, r4)
                Ys.e r7 = new Ys.e
                r7.<init>(r2)
                r0.f40338a = r2
                r4 = 0
                r0.f40339b = r4
                r0.f40342e = r3
                java.lang.Object r7 = r7.s(r0)
                if (r7 != r1) goto Lb3
            Lb2:
                return r1
            Lb3:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: Vs.j.Companion.b(kotlin.coroutines.Continuation):java.lang.Object");
        }

        private final boolean d(Context context) {
            return context.deleteDatabase("token_database");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(kotlin.coroutines.Continuation<? super Vs.j> r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof Vs.j.Companion.b
                if (r0 == 0) goto L13
                r0 = r8
                Vs.j$a$b r0 = (Vs.j.Companion.b) r0
                int r1 = r0.f40347e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40347e = r1
                goto L18
            L13:
                Vs.j$a$b r0 = new Vs.j$a$b
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f40345c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f40347e
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L48
                if (r2 == r4) goto L3f
                if (r2 != r3) goto L37
                java.lang.Object r1 = r0.f40344b
                Vs.j$a r1 = (Vs.j.Companion) r1
                java.lang.Object r0 = r0.f40343a
                wv.a r0 = (wv.InterfaceC17929a) r0
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L35
                goto L72
            L35:
                r8 = move-exception
                goto L83
            L37:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L3f:
                java.lang.Object r2 = r0.f40343a
                wv.a r2 = (wv.InterfaceC17929a) r2
                kotlin.ResultKt.b(r8)
                r8 = r2
                goto L5a
            L48:
                kotlin.ResultKt.b(r8)
                wv.a r8 = Vs.j.g()
                r0.f40343a = r8
                r0.f40347e = r4
                java.lang.Object r2 = r8.g(r5, r0)
                if (r2 != r1) goto L5a
                goto L6e
            L5a:
                Vs.j r2 = Vs.j.f()     // Catch: java.lang.Throwable -> L7a
                if (r2 != 0) goto L7f
                Vs.j$a r2 = Vs.j.INSTANCE     // Catch: java.lang.Throwable -> L7a
                r0.f40343a = r8     // Catch: java.lang.Throwable -> L7a
                r0.f40344b = r2     // Catch: java.lang.Throwable -> L7a
                r0.f40347e = r3     // Catch: java.lang.Throwable -> L7a
                java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L7a
                if (r0 != r1) goto L6f
            L6e:
                return r1
            L6f:
                r6 = r0
                r0 = r8
                r8 = r6
            L72:
                r2 = r8
                Vs.j r2 = (Vs.j) r2     // Catch: java.lang.Throwable -> L35
                Vs.j.i(r2)     // Catch: java.lang.Throwable -> L35
                r8 = r0
                goto L7f
            L7a:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
                goto L83
            L7f:
                r8.h(r5)
                return r2
            L83:
                r0.h(r5)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Vs.j.Companion.c(kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.RoomTokenStorage", f = "RoomTokenStorage.kt", l = {108, 110}, m = "add")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f40348a;

        /* renamed from: b, reason: collision with root package name */
        Object f40349b;

        /* renamed from: c, reason: collision with root package name */
        Object f40350c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f40351d;

        /* renamed from: f, reason: collision with root package name */
        int f40353f;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40351d = obj;
            this.f40353f |= Integer.MIN_VALUE;
            return j.this.b(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.RoomTokenStorage", f = "RoomTokenStorage.kt", l = {145, 146}, m = "getToken")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f40354a;

        /* renamed from: b, reason: collision with root package name */
        Object f40355b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f40356c;

        /* renamed from: e, reason: collision with root package name */
        int f40358e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40356c = obj;
            this.f40358e |= Integer.MIN_VALUE;
            return j.this.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.RoomTokenStorage", f = "RoomTokenStorage.kt", l = {151, 160, 165}, m = "getTokenFromEntity")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f40359a;

        /* renamed from: b, reason: collision with root package name */
        Object f40360b;

        /* renamed from: c, reason: collision with root package name */
        Object f40361c;

        /* renamed from: d, reason: collision with root package name */
        Object f40362d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40363e;

        /* renamed from: g, reason: collision with root package name */
        int f40365g;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40363e = obj;
            this.f40365g |= Integer.MIN_VALUE;
            return j.this.k(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.RoomTokenStorage", f = "RoomTokenStorage.kt", l = {82}, m = "metadata")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40366a;

        /* renamed from: c, reason: collision with root package name */
        int f40368c;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40366a = obj;
            this.f40368c |= Integer.MIN_VALUE;
            return j.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.RoomTokenStorage", f = "RoomTokenStorage.kt", l = {125, 126}, m = "remove")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f40369a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40370b;

        /* renamed from: d, reason: collision with root package name */
        int f40372d;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40370b = obj;
            this.f40372d |= Integer.MIN_VALUE;
            return j.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.RoomTokenStorage", f = "RoomTokenStorage.kt", l = {131, 132, 141}, m = "replace")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f40373a;

        /* renamed from: b, reason: collision with root package name */
        Object f40374b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f40375c;

        /* renamed from: e, reason: collision with root package name */
        int f40377e;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40375c = obj;
            this.f40377e |= Integer.MIN_VALUE;
            return j.this.e(null, this);
        }
    }

    public j(TokenDatabase tokenDatabase, q tokenEncryptionHandler) {
        Intrinsics.j(tokenDatabase, "tokenDatabase");
        Intrinsics.j(tokenEncryptionHandler, "tokenEncryptionHandler");
        this.tokenEncryptionHandler = tokenEncryptionHandler;
        this.tokenDao = tokenDatabase.g();
    }

    private final Integer j(b.c cVar) {
        if (cVar instanceof b.a) {
            return Integer.valueOf(((b.a) cVar).getUserAuthenticationTimeout());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (r13 == r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.okta.authfoundation.credential.storage.TokenEntity r11, androidx.biometric.e.d r12, kotlin.coroutines.Continuation<? super Vs.p> r13) throws android.security.keystore.KeyPermanentlyInvalidatedException {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.j.k(com.okta.authfoundation.credential.storage.TokenEntity, androidx.biometric.e$d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Vs.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r6, androidx.biometric.e.d r7, kotlin.coroutines.Continuation<? super Vs.p> r8) throws android.security.keystore.KeyPermanentlyInvalidatedException {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Vs.j.c
            if (r0 == 0) goto L13
            r0 = r8
            Vs.j$c r0 = (Vs.j.c) r0
            int r1 = r0.f40358e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40358e = r1
            goto L18
        L13:
            Vs.j$c r0 = new Vs.j$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f40356c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f40358e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f40355b
            r7 = r6
            androidx.biometric.e$d r7 = (androidx.biometric.e.d) r7
            java.lang.Object r6 = r0.f40354a
            Vs.j r6 = (Vs.j) r6
            kotlin.ResultKt.b(r8)
            goto L54
        L41:
            kotlin.ResultKt.b(r8)
            Xs.a r8 = r5.tokenDao
            r0.f40354a = r5
            r0.f40355b = r7
            r0.f40358e = r4
            java.lang.Object r8 = r8.e(r6, r0)
            if (r8 != r1) goto L53
            goto L65
        L53:
            r6 = r5
        L54:
            com.okta.authfoundation.credential.storage.TokenEntity r8 = (com.okta.authfoundation.credential.storage.TokenEntity) r8
            if (r8 == 0) goto L67
            r2 = 0
            r0.f40354a = r2
            r0.f40355b = r2
            r0.f40358e = r3
            java.lang.Object r6 = r6.k(r8, r7, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            return r6
        L67:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.j.a(java.lang.String, androidx.biometric.e$d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        if (r8.b(r9, r3) == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // Vs.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(Vs.p r19, Vs.p.Metadata r20, Vs.b.c r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof Vs.j.b
            if (r3 == 0) goto L19
            r3 = r2
            Vs.j$b r3 = (Vs.j.b) r3
            int r4 = r3.f40353f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f40353f = r4
            goto L1e
        L19:
            Vs.j$b r3 = new Vs.j$b
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.f40351d
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.f40353f
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4b
            if (r5 == r7) goto L3b
            if (r5 != r6) goto L33
            kotlin.ResultKt.b(r2)
            goto Lb2
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            java.lang.Object r1 = r3.f40350c
            Vs.b$c r1 = (Vs.b.c) r1
            java.lang.Object r5 = r3.f40349b
            Vs.p$c r5 = (Vs.p.Metadata) r5
            java.lang.Object r7 = r3.f40348a
            Vs.j r7 = (Vs.j) r7
            kotlin.ResultKt.b(r2)
            goto L77
        L4b:
            kotlin.ResultKt.b(r2)
            java.lang.String r2 = r19.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
            java.lang.String r5 = r20.getId()
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r5)
            if (r2 == 0) goto Lb5
            Vs.q r2 = r0.tokenEncryptionHandler
            r2.b(r1)
            Vs.q r2 = r0.tokenEncryptionHandler
            r3.f40348a = r0
            r5 = r20
            r3.f40349b = r5
            r3.f40350c = r1
            r3.f40353f = r7
            r7 = r19
            java.lang.Object r2 = r2.a(r7, r1, r3)
            if (r2 != r4) goto L76
            goto Lb1
        L76:
            r7 = r0
        L77:
            Vs.q$b r2 = (Vs.q.b) r2
            Xs.a r8 = r7.tokenDao
            com.okta.authfoundation.credential.storage.TokenEntity r9 = new com.okta.authfoundation.credential.storage.TokenEntity
            java.lang.String r10 = r5.getId()
            byte[] r11 = r2.getEncryptedToken()
            java.util.Map r12 = r5.c()
            Ev.C r13 = r5.getPayloadData()
            java.lang.String r14 = r1.getKeyAlias()
            com.okta.authfoundation.credential.storage.TokenEntity$a$a r5 = com.okta.authfoundation.credential.storage.TokenEntity.a.INSTANCE
            com.okta.authfoundation.credential.storage.TokenEntity$a r15 = r5.a(r1)
            java.lang.Integer r16 = r7.j(r1)
            java.util.Map r17 = r2.b()
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = 0
            r3.f40348a = r1
            r3.f40349b = r1
            r3.f40350c = r1
            r3.f40353f = r6
            java.lang.Object r1 = r8.b(r9, r3)
            if (r1 != r4) goto Lb2
        Lb1:
            return r4
        Lb2:
            kotlin.Unit r1 = kotlin.Unit.f143329a
            return r1
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "TokenStorage.add called with different token.id and metadata.id"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.j.b(Vs.p, Vs.p$c, Vs.b$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r6.a(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Vs.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Vs.j.f
            if (r0 == 0) goto L13
            r0 = r7
            Vs.j$f r0 = (Vs.j.f) r0
            int r1 = r0.f40372d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40372d = r1
            goto L18
        L13:
            Vs.j$f r0 = new Vs.j$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f40370b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f40372d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r7)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f40369a
            Vs.j r6 = (Vs.j) r6
            kotlin.ResultKt.b(r7)
            goto L4d
        L3c:
            kotlin.ResultKt.b(r7)
            Xs.a r7 = r5.tokenDao
            r0.f40369a = r5
            r0.f40372d = r4
            java.lang.Object r7 = r7.e(r6, r0)
            if (r7 != r1) goto L4c
            goto L5e
        L4c:
            r6 = r5
        L4d:
            com.okta.authfoundation.credential.storage.TokenEntity r7 = (com.okta.authfoundation.credential.storage.TokenEntity) r7
            if (r7 == 0) goto L5f
            Xs.a r6 = r6.tokenDao
            r2 = 0
            r0.f40369a = r2
            r0.f40372d = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.j.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Vs.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r5, kotlin.coroutines.Continuation<? super Vs.p.Metadata> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Vs.j.e
            if (r0 == 0) goto L13
            r0 = r6
            Vs.j$e r0 = (Vs.j.e) r0
            int r1 = r0.f40368c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40368c = r1
            goto L18
        L13:
            Vs.j$e r0 = new Vs.j$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f40366a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f40368c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            Xs.a r6 = r4.tokenDao
            r0.f40368c = r3
            java.lang.Object r6 = r6.e(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.okta.authfoundation.credential.storage.TokenEntity r6 = (com.okta.authfoundation.credential.storage.TokenEntity) r6
            if (r6 == 0) goto L55
            Vs.p$c r5 = new Vs.p$c
            java.lang.String r0 = r6.getId()
            java.util.Map r1 = r6.j()
            Ev.C r6 = r6.getPayloadData()
            r5.<init>(r0, r1, r6)
            return r5
        L55:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.j.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (r4.tokenDao.c(new com.okta.authfoundation.credential.storage.TokenEntity[]{r1}, r2) != r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // Vs.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(Vs.p r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof Vs.j.g
            if (r2 == 0) goto L17
            r2 = r1
            Vs.j$g r2 = (Vs.j.g) r2
            int r3 = r2.f40377e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f40377e = r3
            goto L1c
        L17:
            Vs.j$g r2 = new Vs.j$g
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f40375c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f40377e
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L59
            if (r4 == r7) goto L4d
            if (r4 == r6) goto L3c
            if (r4 != r5) goto L34
            kotlin.ResultKt.b(r1)
            goto Lb9
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            java.lang.Object r4 = r2.f40374b
            com.okta.authfoundation.credential.storage.TokenEntity r4 = (com.okta.authfoundation.credential.storage.TokenEntity) r4
            java.lang.Object r6 = r2.f40373a
            Vs.j r6 = (Vs.j) r6
            kotlin.ResultKt.b(r1)
            r17 = r6
            r6 = r4
            r4 = r17
            goto L8d
        L4d:
            java.lang.Object r4 = r2.f40374b
            Vs.p r4 = (Vs.p) r4
            java.lang.Object r7 = r2.f40373a
            Vs.j r7 = (Vs.j) r7
            kotlin.ResultKt.b(r1)
            goto L73
        L59:
            kotlin.ResultKt.b(r1)
            Xs.a r1 = r0.tokenDao
            java.lang.String r4 = r19.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
            r2.f40373a = r0
            r8 = r19
            r2.f40374b = r8
            r2.f40377e = r7
            java.lang.Object r1 = r1.e(r4, r2)
            if (r1 != r3) goto L71
            goto Lb8
        L71:
            r7 = r0
            r4 = r8
        L73:
            com.okta.authfoundation.credential.storage.TokenEntity r1 = (com.okta.authfoundation.credential.storage.TokenEntity) r1
            if (r1 == 0) goto Lbc
            Vs.q r8 = r7.tokenEncryptionHandler
            Vs.b$c r9 = r1.i()
            r2.f40373a = r7
            r2.f40374b = r1
            r2.f40377e = r6
            java.lang.Object r4 = r8.a(r4, r9, r2)
            if (r4 != r3) goto L8a
            goto Lb8
        L8a:
            r6 = r1
            r1 = r4
            r4 = r7
        L8d:
            Vs.q$b r1 = (Vs.q.b) r1
            byte[] r8 = r1.getEncryptedToken()
            java.util.Map r14 = r1.b()
            r15 = 125(0x7d, float:1.75E-43)
            r16 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.okta.authfoundation.credential.storage.TokenEntity r1 = com.okta.authfoundation.credential.storage.TokenEntity.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            Xs.a r4 = r4.tokenDao
            com.okta.authfoundation.credential.storage.TokenEntity[] r1 = new com.okta.authfoundation.credential.storage.TokenEntity[]{r1}
            r6 = 0
            r2.f40373a = r6
            r2.f40374b = r6
            r2.f40377e = r5
            java.lang.Object r1 = r4.c(r1, r2)
            if (r1 != r3) goto Lb9
        Lb8:
            return r3
        Lb9:
            kotlin.Unit r1 = kotlin.Unit.f143329a
            return r1
        Lbc:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.j.e(Vs.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
