package Vs;

import Vs.p;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ8\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"RT\u0010(\u001aB\u0012\f\u0012\n %*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n %*\u0004\u0018\u00010\u00110\u0011 %* \u0012\f\u0012\n %*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n %*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\r0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"LVs/c;", "", "LVs/s;", PlaceTypes.STORAGE, "<init>", "(LVs/s;)V", "", PreferencesHelper.PREF_ID, "LVs/p$c;", "f", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVs/p;", "token", "", "tags", "LVs/b$c;", "security", "LVs/b;", "d", "(LVs/p;Ljava/util/Map;LVs/b$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "h", "(LVs/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/biometric/e$d;", "promptInfo", "e", "(Ljava/lang/String;Landroidx/biometric/e$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "credential", "g", "(LVs/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LVs/s;", "Lbt/d;", "b", "Lbt/d;", "jwtParser", "", "kotlin.jvm.PlatformType", "c", "Ljava/util/Map;", "credentialsCache", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    private static c f37832e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s storage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bt.d jwtParser;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Vs.b> credentialsCache;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Av.a f37833f = Av.g.b(false, 1, null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LVs/c$a;", "", "<init>", "()V", "LVs/c;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instance", "LVs/c;", "LAv/a;", "instanceMutex", "LAv/a;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Vs.c$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.okta.authfoundation.credential.CredentialDataSource$Companion", f = "CredentialDataSource.kt", l = {128, 39}, m = "getInstance")
        /* renamed from: Vs.c$a$a, reason: collision with other inner class name */
        static final class C0817a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f37837a;

            /* renamed from: b, reason: collision with root package name */
            Object f37838b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37839c;

            /* renamed from: e, reason: collision with root package name */
            int f37841e;

            C0817a(Continuation<? super C0817a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f37839c = obj;
                this.f37841e |= Integer.MIN_VALUE;
                return Companion.this.a(this);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(kotlin.coroutines.Continuation<? super Vs.c> r8) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r8 instanceof Vs.c.Companion.C0817a
                if (r0 == 0) goto L13
                r0 = r8
                Vs.c$a$a r0 = (Vs.c.Companion.C0817a) r0
                int r1 = r0.f37841e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37841e = r1
                goto L18
            L13:
                Vs.c$a$a r0 = new Vs.c$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f37839c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f37841e
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L48
                if (r2 == r4) goto L3f
                if (r2 != r3) goto L37
                java.lang.Object r1 = r0.f37838b
                Vs.c$a r1 = (Vs.c.Companion) r1
                java.lang.Object r0 = r0.f37837a
                Av.a r0 = (Av.a) r0
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L35
                goto L78
            L35:
                r8 = move-exception
                goto L8d
            L37:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L3f:
                java.lang.Object r2 = r0.f37837a
                Av.a r2 = (Av.a) r2
                kotlin.ResultKt.b(r8)
                r8 = r2
                goto L5a
            L48:
                kotlin.ResultKt.b(r8)
                Av.a r8 = Vs.c.b()
                r0.f37837a = r8
                r0.f37841e = r4
                java.lang.Object r2 = r8.g(r5, r0)
                if (r2 != r1) goto L5a
                goto L74
            L5a:
                Vs.c r2 = Vs.c.a()     // Catch: java.lang.Throwable -> L84
                if (r2 != 0) goto L89
                Vs.c$a r2 = Vs.c.INSTANCE     // Catch: java.lang.Throwable -> L84
                Qs.p r4 = Qs.p.f31384a     // Catch: java.lang.Throwable -> L84
                kotlin.jvm.functions.Function1 r4 = r4.G()     // Catch: java.lang.Throwable -> L84
                r0.f37837a = r8     // Catch: java.lang.Throwable -> L84
                r0.f37838b = r2     // Catch: java.lang.Throwable -> L84
                r0.f37841e = r3     // Catch: java.lang.Throwable -> L84
                java.lang.Object r0 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L84
                if (r0 != r1) goto L75
            L74:
                return r1
            L75:
                r6 = r0
                r0 = r8
                r8 = r6
            L78:
                Vs.s r8 = (Vs.s) r8     // Catch: java.lang.Throwable -> L35
                Vs.c r2 = new Vs.c     // Catch: java.lang.Throwable -> L35
                r2.<init>(r8)     // Catch: java.lang.Throwable -> L35
                Vs.c.c(r2)     // Catch: java.lang.Throwable -> L35
                r8 = r0
                goto L89
            L84:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
                goto L8d
            L89:
                r8.h(r5)
                return r2
            L8d:
                r0.h(r5)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Vs.c.Companion.a(kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.CredentialDataSource", f = "CredentialDataSource.kt", l = {70}, m = "createCredential")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f37842a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37843b;

        /* renamed from: d, reason: collision with root package name */
        int f37845d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37843b = obj;
            this.f37845d |= Integer.MIN_VALUE;
            return c.this.d(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.CredentialDataSource", f = "CredentialDataSource.kt", l = {92, 94}, m = "getCredential")
    /* renamed from: Vs.c$c, reason: collision with other inner class name */
    static final class C0818c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f37846a;

        /* renamed from: b, reason: collision with root package name */
        Object f37847b;

        /* renamed from: c, reason: collision with root package name */
        Object f37848c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f37849d;

        /* renamed from: f, reason: collision with root package name */
        int f37851f;

        C0818c(Continuation<? super C0818c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37849d = obj;
            this.f37851f |= Integer.MIN_VALUE;
            return c.this.e(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.CredentialDataSource", f = "CredentialDataSource.kt", l = {84, 86}, m = "replaceToken")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f37852a;

        /* renamed from: b, reason: collision with root package name */
        Object f37853b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37854c;

        /* renamed from: e, reason: collision with root package name */
        int f37856e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37854c = obj;
            this.f37856e |= Integer.MIN_VALUE;
            return c.this.h(null, this);
        }
    }

    public c(s storage) {
        Intrinsics.j(storage, "storage");
        this.storage = storage;
        this.jwtParser = bt.d.INSTANCE.a();
        this.credentialsCache = Collections.synchronizedMap(new LinkedHashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(Vs.p r11, java.util.Map<java.lang.String, java.lang.String> r12, Vs.b.c r13, kotlin.coroutines.Continuation<? super Vs.b> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof Vs.c.b
            if (r0 == 0) goto L13
            r0 = r14
            Vs.c$b r0 = (Vs.c.b) r0
            int r1 = r0.f37845d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37845d = r1
            goto L18
        L13:
            Vs.c$b r0 = new Vs.c$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f37843b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f37845d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.f37842a
            Vs.b r11 = (Vs.b) r11
            kotlin.ResultKt.b(r14)
            goto L75
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.ResultKt.b(r14)
            java.lang.String r14 = r11.getIdToken()
            if (r14 == 0) goto L45
            bt.d r2 = r10.jwtParser
            bt.b r14 = r2.a(r14)
            goto L46
        L45:
            r14 = 0
        L46:
            Vs.b r4 = new Vs.b
            r8 = 2
            r9 = 0
            r6 = 0
            r5 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            java.util.Map<java.lang.String, Vs.b> r11 = r10.credentialsCache
            java.lang.String r12 = "credentialsCache"
            kotlin.jvm.internal.Intrinsics.i(r11, r12)
            java.lang.String r12 = r5.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
            r11.put(r12, r4)
            Vs.s r11 = r10.storage
            Vs.p$c r12 = new Vs.p$c
            java.lang.String r2 = r5.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
            r12.<init>(r2, r7, r14)
            r0.f37842a = r4
            r0.f37845d = r3
            java.lang.Object r11 = r11.b(r5, r12, r13, r0)
            if (r11 != r1) goto L74
            return r1
        L74:
            r11 = r4
        L75:
            Qs.p r12 = Qs.p.f31384a
            at.b r12 = r12.A()
            Ws.c r13 = new Ws.c
            r13.<init>(r11)
            r12.a(r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.c.d(Vs.p, java.util.Map, Vs.b$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r12, androidx.biometric.e.d r13, kotlin.coroutines.Continuation<? super Vs.b> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof Vs.c.C0818c
            if (r0 == 0) goto L13
            r0 = r14
            Vs.c$c r0 = (Vs.c.C0818c) r0
            int r1 = r0.f37851f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37851f = r1
            goto L18
        L13:
            Vs.c$c r0 = new Vs.c$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f37849d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f37851f
            r3 = 0
            java.lang.String r4 = "credentialsCache"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L54
            if (r2 == r6) goto L43
            if (r2 != r5) goto L3b
            java.lang.Object r12 = r0.f37848c
            Vs.p$c r12 = (Vs.p.Metadata) r12
            java.lang.Object r13 = r0.f37847b
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r0 = r0.f37846a
            Vs.c r0 = (Vs.c) r0
            kotlin.ResultKt.b(r14)     // Catch: android.security.keystore.KeyPermanentlyInvalidatedException -> Lb4
            goto L96
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            java.lang.Object r12 = r0.f37848c
            r13 = r12
            androidx.biometric.e$d r13 = (androidx.biometric.e.d) r13
            java.lang.Object r12 = r0.f37847b
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r0.f37846a
            Vs.c r2 = (Vs.c) r2
            kotlin.ResultKt.b(r14)
            goto L7b
        L54:
            kotlin.ResultKt.b(r14)
            java.util.Map<java.lang.String, Vs.b> r14 = r11.credentialsCache
            kotlin.jvm.internal.Intrinsics.i(r14, r4)
            boolean r14 = r14.containsKey(r12)
            if (r14 == 0) goto L6b
            java.util.Map<java.lang.String, Vs.b> r13 = r11.credentialsCache
            java.lang.Object r12 = r13.get(r12)
            Vs.b r12 = (Vs.b) r12
            return r12
        L6b:
            r0.f37846a = r11
            r0.f37847b = r12
            r0.f37848c = r13
            r0.f37851f = r6
            java.lang.Object r14 = r11.f(r12, r0)
            if (r14 != r1) goto L7a
            goto L90
        L7a:
            r2 = r11
        L7b:
            Vs.p$c r14 = (Vs.p.Metadata) r14
            if (r14 != 0) goto L80
            return r3
        L80:
            Vs.s r6 = r2.storage     // Catch: android.security.keystore.KeyPermanentlyInvalidatedException -> Lb4
            r0.f37846a = r2     // Catch: android.security.keystore.KeyPermanentlyInvalidatedException -> Lb4
            r0.f37847b = r12     // Catch: android.security.keystore.KeyPermanentlyInvalidatedException -> Lb4
            r0.f37848c = r14     // Catch: android.security.keystore.KeyPermanentlyInvalidatedException -> Lb4
            r0.f37851f = r5     // Catch: android.security.keystore.KeyPermanentlyInvalidatedException -> Lb4
            java.lang.Object r13 = r6.a(r12, r13, r0)     // Catch: android.security.keystore.KeyPermanentlyInvalidatedException -> Lb4
            if (r13 != r1) goto L91
        L90:
            return r1
        L91:
            r0 = r13
            r13 = r12
            r12 = r14
            r14 = r0
            r0 = r2
        L96:
            r6 = r14
            Vs.p r6 = (Vs.p) r6     // Catch: android.security.keystore.KeyPermanentlyInvalidatedException -> Lb4
            java.util.Map<java.lang.String, Vs.b> r14 = r0.credentialsCache
            kotlin.jvm.internal.Intrinsics.i(r14, r4)
            Vs.b r5 = new Vs.b
            java.util.Map r8 = r12.c()
            r9 = 2
            r10 = 0
            r7 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.put(r13, r5)
            java.util.Map<java.lang.String, Vs.b> r12 = r0.credentialsCache
            java.lang.Object r12 = r12.get(r13)
            return r12
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.c.e(java.lang.String, androidx.biometric.e$d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object f(String str, Continuation<? super p.Metadata> continuation) {
        return this.storage.d(str, continuation);
    }

    public final Object g(Vs.b bVar, Continuation<? super Unit> continuation) {
        this.credentialsCache.remove(bVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        Object objC = this.storage.c(bVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), continuation);
        return objC == IntrinsicsKt.f() ? objC : Unit.f142422a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r7.m(r6, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(Vs.p r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Vs.c.d
            if (r0 == 0) goto L13
            r0 = r7
            Vs.c$d r0 = (Vs.c.d) r0
            int r1 = r0.f37856e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37856e = r1
            goto L18
        L13:
            Vs.c$d r0 = new Vs.c$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f37854c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f37856e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r7)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f37853b
            Vs.p r6 = (Vs.p) r6
            java.lang.Object r2 = r0.f37852a
            Vs.c r2 = (Vs.c) r2
            kotlin.ResultKt.b(r7)
            goto L53
        L40:
            kotlin.ResultKt.b(r7)
            Vs.s r7 = r5.storage
            r0.f37852a = r5
            r0.f37853b = r6
            r0.f37856e = r4
            java.lang.Object r7 = r7.e(r6, r0)
            if (r7 != r1) goto L52
            goto L6e
        L52:
            r2 = r5
        L53:
            java.util.Map<java.lang.String, Vs.b> r7 = r2.credentialsCache
            java.lang.String r2 = r6.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
            java.lang.Object r7 = r7.get(r2)
            Vs.b r7 = (Vs.b) r7
            if (r7 == 0) goto L72
            r2 = 0
            r0.f37852a = r2
            r0.f37853b = r2
            r0.f37856e = r3
            java.lang.Object r6 = r7.m(r6, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        L72:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Attempted replacing a non-existent Token"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.c.h(Vs.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
