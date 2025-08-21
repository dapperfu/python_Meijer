package jg;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\f"}, d2 = {"Ljg/t;", "", "", "fid", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: jg.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15025t {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String fid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String authToken;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljg/t$a;", "", "<init>", "()V", "LLf/e;", "firebaseInstallations", "Ljg/t;", "a", "(LLf/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: jg.t$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {31, 39}, m = "create")
        /* renamed from: jg.t$a$a, reason: collision with other inner class name */
        static final class C2225a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f140626a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f140627b;

            /* renamed from: d, reason: collision with root package name */
            int f140629d;

            C2225a(Continuation<? super C2225a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f140627b = obj;
                this.f140629d |= Integer.MIN_VALUE;
                return Companion.this.a(null, this);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(Lf.e r9, kotlin.coroutines.Continuation<? super jg.C15025t> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof jg.C15025t.Companion.C2225a
                if (r0 == 0) goto L13
                r0 = r10
                jg.t$a$a r0 = (jg.C15025t.Companion.C2225a) r0
                int r1 = r0.f140629d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f140629d = r1
                goto L18
            L13:
                jg.t$a$a r0 = new jg.t$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f140627b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f140629d
                java.lang.String r3 = "FirebaseSessions"
                r4 = 2
                r5 = 1
                java.lang.String r6 = ""
                if (r2 == 0) goto L48
                if (r2 == r5) goto L3e
                if (r2 != r4) goto L36
                java.lang.Object r9 = r0.f140626a
                java.lang.String r9 = (java.lang.String) r9
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L34
                goto L85
            L34:
                r10 = move-exception
                goto L8c
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f140626a
                Lf.e r9 = (Lf.e) r9
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L46
                goto L60
            L46:
                r10 = move-exception
                goto L6a
            L48:
                kotlin.ResultKt.b(r10)
                r10 = 0
                Vd.j r10 = r9.a(r10)     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "getToken(...)"
                kotlin.jvm.internal.Intrinsics.i(r10, r2)     // Catch: java.lang.Exception -> L46
                r0.f140626a = r9     // Catch: java.lang.Exception -> L46
                r0.f140629d = r5     // Catch: java.lang.Exception -> L46
                java.lang.Object r10 = xv.C18230b.b(r10, r0)     // Catch: java.lang.Exception -> L46
                if (r10 != r1) goto L60
                goto L84
            L60:
                com.google.firebase.installations.f r10 = (com.google.firebase.installations.f) r10     // Catch: java.lang.Exception -> L46
                java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> L46
                r7 = r10
                r10 = r9
                r9 = r7
                goto L71
            L6a:
                java.lang.String r2 = "Error getting authentication token."
                com.fullstory.FS.log_w(r3, r2, r10)
                r10 = r9
                r9 = r6
            L71:
                Vd.j r10 = r10.getId()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "getId(...)"
                kotlin.jvm.internal.Intrinsics.i(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.f140626a = r9     // Catch: java.lang.Exception -> L34
                r0.f140629d = r4     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = xv.C18230b.b(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L85
            L84:
                return r1
            L85:
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                if (r10 != 0) goto L8a
                goto L91
            L8a:
                r6 = r10
                goto L91
            L8c:
                java.lang.String r0 = "Error getting Firebase installation id ."
                com.fullstory.FS.log_w(r3, r0, r10)
            L91:
                jg.t r10 = new jg.t
                r0 = 0
                r10.<init>(r6, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: jg.C15025t.Companion.a(Lf.e, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public /* synthetic */ C15025t(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private C15025t(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    /* renamed from: b, reason: from getter */
    public final String getFid() {
        return this.fid;
    }
}
