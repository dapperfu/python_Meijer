package Vs;

import Vs.b;
import androidx.biometric.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0002\u0005\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H¦@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LVs/q;", "", "LVs/b$c;", "security", "", "b", "(LVs/b$c;)V", "LVs/p;", "token", "LVs/q$b;", "a", "(LVs/p;LVs/b$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "encryptedToken", "", "", "encryptionExtras", "Landroidx/biometric/e$d;", "promptInfo", "c", "([BLjava/util/Map;LVs/b$c;Landroidx/biometric/e$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f40429a;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u0080@¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u0080@¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LVs/q$a;", "", "<init>", "()V", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "action", "c", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lwv/a;", "Lwv/a;", "accessMutex", "", "value", "Z", "a", "()Z", "isSyncDecryptionContext", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Vs.q$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f40429a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC17929a accessMutex = wv.g.b(false, 1, null);

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static boolean isSyncDecryptionContext;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.okta.authfoundation.credential.TokenEncryptionHandler$Companion", f = "TokenEncryptionHandler.kt", l = {352, 125}, m = "withAsyncDecryptionContext$auth_foundation_release")
        /* renamed from: Vs.q$a$a, reason: collision with other inner class name */
        static final class C0869a<T> extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f40432a;

            /* renamed from: b, reason: collision with root package name */
            Object f40433b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f40434c;

            /* renamed from: e, reason: collision with root package name */
            int f40436e;

            C0869a(Continuation<? super C0869a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f40434c = obj;
                this.f40436e |= Integer.MIN_VALUE;
                return Companion.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.okta.authfoundation.credential.TokenEncryptionHandler$Companion", f = "TokenEncryptionHandler.kt", l = {352, 118}, m = "withSyncDecryptionContext$auth_foundation_release")
        /* renamed from: Vs.q$a$b */
        static final class b<T> extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f40437a;

            /* renamed from: b, reason: collision with root package name */
            Object f40438b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f40439c;

            /* renamed from: e, reason: collision with root package name */
            int f40441e;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f40439c = obj;
                this.f40441e |= Integer.MIN_VALUE;
                return Companion.this.c(null, this);
            }
        }

        public final boolean a() {
            return isSyncDecryptionContext;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object b(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super T> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof Vs.q.Companion.C0869a
                if (r0 == 0) goto L13
                r0 = r9
                Vs.q$a$a r0 = (Vs.q.Companion.C0869a) r0
                int r1 = r0.f40436e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40436e = r1
                goto L18
            L13:
                Vs.q$a$a r0 = new Vs.q$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f40434c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f40436e
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L49
                if (r2 == r4) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r8 = r0.f40432a
                wv.a r8 = (wv.InterfaceC17929a) r8
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L31
                goto L6e
            L31:
                r9 = move-exception
                goto L76
            L33:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3b:
                java.lang.Object r8 = r0.f40433b
                wv.a r8 = (wv.InterfaceC17929a) r8
                java.lang.Object r2 = r0.f40432a
                kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                kotlin.ResultKt.b(r9)
                r9 = r8
                r8 = r2
                goto L5b
            L49:
                kotlin.ResultKt.b(r9)
                wv.a r9 = Vs.q.Companion.accessMutex
                r0.f40432a = r8
                r0.f40433b = r9
                r0.f40436e = r4
                java.lang.Object r2 = r9.g(r5, r0)
                if (r2 != r1) goto L5b
                goto L6a
            L5b:
                r2 = 0
                Vs.q.Companion.isSyncDecryptionContext = r2     // Catch: java.lang.Throwable -> L72
                r0.f40432a = r9     // Catch: java.lang.Throwable -> L72
                r0.f40433b = r5     // Catch: java.lang.Throwable -> L72
                r0.f40436e = r3     // Catch: java.lang.Throwable -> L72
                java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L72
                if (r8 != r1) goto L6b
            L6a:
                return r1
            L6b:
                r6 = r9
                r9 = r8
                r8 = r6
            L6e:
                r8.h(r5)
                return r9
            L72:
                r8 = move-exception
                r6 = r9
                r9 = r8
                r8 = r6
            L76:
                r8.h(r5)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Vs.q.Companion.b(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object c(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super T> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof Vs.q.Companion.b
                if (r0 == 0) goto L13
                r0 = r9
                Vs.q$a$b r0 = (Vs.q.Companion.b) r0
                int r1 = r0.f40441e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40441e = r1
                goto L18
            L13:
                Vs.q$a$b r0 = new Vs.q$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f40439c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f40441e
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L49
                if (r2 == r4) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r8 = r0.f40437a
                wv.a r8 = (wv.InterfaceC17929a) r8
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L31
                goto L6d
            L31:
                r9 = move-exception
                goto L75
            L33:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3b:
                java.lang.Object r8 = r0.f40438b
                wv.a r8 = (wv.InterfaceC17929a) r8
                java.lang.Object r2 = r0.f40437a
                kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                kotlin.ResultKt.b(r9)
                r9 = r8
                r8 = r2
                goto L5b
            L49:
                kotlin.ResultKt.b(r9)
                wv.a r9 = Vs.q.Companion.accessMutex
                r0.f40437a = r8
                r0.f40438b = r9
                r0.f40441e = r4
                java.lang.Object r2 = r9.g(r5, r0)
                if (r2 != r1) goto L5b
                goto L69
            L5b:
                Vs.q.Companion.isSyncDecryptionContext = r4     // Catch: java.lang.Throwable -> L71
                r0.f40437a = r9     // Catch: java.lang.Throwable -> L71
                r0.f40438b = r5     // Catch: java.lang.Throwable -> L71
                r0.f40441e = r3     // Catch: java.lang.Throwable -> L71
                java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L71
                if (r8 != r1) goto L6a
            L69:
                return r1
            L6a:
                r6 = r9
                r9 = r8
                r8 = r6
            L6d:
                r8.h(r5)
                return r9
            L71:
                r8 = move-exception
                r6 = r9
                r9 = r8
                r8 = r6
            L75:
                r8.h(r5)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Vs.q.Companion.c(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LVs/q$b;", "", "", "encryptedToken", "", "", "encryptionExtras", "<init>", "([BLjava/util/Map;)V", "a", "[B", "()[B", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final byte[] encryptedToken;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, String> encryptionExtras;

        public b(byte[] encryptedToken, Map<String, String> encryptionExtras) {
            Intrinsics.j(encryptedToken, "encryptedToken");
            Intrinsics.j(encryptionExtras, "encryptionExtras");
            this.encryptedToken = encryptedToken;
            this.encryptionExtras = encryptionExtras;
        }

        /* renamed from: a, reason: from getter */
        public final byte[] getEncryptedToken() {
            return this.encryptedToken;
        }

        public final Map<String, String> b() {
            return this.encryptionExtras;
        }
    }

    Object a(p pVar, b.c cVar, Continuation<? super b> continuation);

    void b(b.c security);

    Object c(byte[] bArr, Map<String, String> map, b.c cVar, e.d dVar, Continuation<? super p> continuation);
}
