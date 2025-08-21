package B2;

import B2.E;
import com.medallia.digital.mobilesdk.l8;
import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15805i;
import mv.InterfaceC15783O;
import pv.InterfaceC16561f;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ4\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J:\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R \u0010'\u001a\b\u0012\u0004\u0012\u00020\f0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010(R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00104\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\"R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102R\u001b\u0010=\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b9\u0010:*\u0004\b;\u0010<¨\u0006?"}, d2 = {"LB2/w;", "LB2/s;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/io/File;", "file", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "", "suffix", "p", "(Ljava/lang/String;)Ljava/io/File;", "", "n", "(Ljava/io/File;)V", "o", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "b", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "d", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "Lpv/f;", "c", "Lpv/f;", "()Lpv/f;", "updateNotifications", "Ljava/lang/String;", "LOCK_SUFFIX", "VERSION_SUFFIX", "f", "LOCK_ERROR_MESSAGE", "Lwv/a;", "g", "Lwv/a;", "inMemoryMutex", "h", "Lkotlin/Lazy;", "q", "lockFile", "Lkotlin/Lazy;", "LB2/E;", "i", "lazySharedCounter", "r", "()LB2/E;", "getSharedCounter$delegate", "(LB2/w;)Ljava/lang/Object;", "sharedCounter", "j", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class w implements s {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: k, reason: collision with root package name */
    private static final String f2462k = "Resource deadlock would occur";

    /* renamed from: l, reason: collision with root package name */
    private static final long f2463l = 10;

    /* renamed from: m, reason: collision with root package name */
    private static final long f2464m = l8.b.f93364b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16561f<Unit> updateNotifications;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String LOCK_SUFFIX;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String VERSION_SUFFIX;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String LOCK_ERROR_MESSAGE;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a inMemoryMutex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy lockFile;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy<E> lazySharedCounter;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LB2/w$a;", "", "<init>", "()V", "Ljava/io/FileOutputStream;", "lockFileStream", "Ljava/nio/channels/FileLock;", "b", "(Ljava/io/FileOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "DEADLOCK_ERROR_MESSAGE", "Ljava/lang/String;", "", "INITIAL_WAIT_MILLIS", "J", "MAX_WAIT_MILLIS", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B2.w$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$Companion", f = "MultiProcessCoordinator.android.kt", l = {182}, m = "getExclusiveFileLockWithRetryIfDeadlock")
        /* renamed from: B2.w$a$a, reason: collision with other inner class name */
        static final class C0050a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f2474a;

            /* renamed from: b, reason: collision with root package name */
            long f2475b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f2476c;

            /* renamed from: e, reason: collision with root package name */
            int f2478e;

            C0050a(Continuation<? super C0050a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f2476c = obj;
                this.f2478e |= Integer.MIN_VALUE;
                return Companion.this.b(null, this);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(java.io.FileOutputStream r14, kotlin.coroutines.Continuation<? super java.nio.channels.FileLock> r15) throws java.io.IOException {
            /*
                r13 = this;
                boolean r0 = r15 instanceof B2.w.Companion.C0050a
                if (r0 == 0) goto L13
                r0 = r15
                B2.w$a$a r0 = (B2.w.Companion.C0050a) r0
                int r1 = r0.f2478e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2478e = r1
                goto L18
            L13:
                B2.w$a$a r0 = new B2.w$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f2476c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f2478e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L39
                if (r2 != r4) goto L31
                long r5 = r0.f2475b
                java.lang.Object r14 = r0.f2474a
                java.io.FileOutputStream r14 = (java.io.FileOutputStream) r14
                kotlin.ResultKt.b(r15)
                r15 = r0
                goto L7f
            L31:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L39:
                kotlin.ResultKt.b(r15)
                long r5 = B2.w.i()
                r15 = r0
            L41:
                long r7 = B2.w.k()
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            */
            //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                if (r0 > 0) goto L83
                java.nio.channels.FileChannel r7 = r14.getChannel()     // Catch: java.io.IOException -> L5f
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r0 = r7.lock(r8, r10, r12)     // Catch: java.io.IOException -> L5f
                kotlin.jvm.internal.Intrinsics.i(r0, r2)     // Catch: java.io.IOException -> L5f
                return r0
            L5f:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                if (r2 == 0) goto L82
                java.lang.String r7 = B2.w.h()
                r8 = 0
                r9 = 0
                boolean r2 = kotlin.text.StringsKt.d0(r2, r7, r8, r3, r9)
                if (r2 != r4) goto L82
                r15.f2474a = r14
                r15.f2475b = r5
                r15.f2478e = r4
                java.lang.Object r0 = mv.Z.b(r5, r15)
                if (r0 != r1) goto L7f
                return r1
            L7f:
                long r7 = (long) r3
                long r5 = r5 * r7
                goto L41
            L82:
                throw r0
            L83:
                java.nio.channels.FileChannel r7 = r14.getChannel()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r14 = r7.lock(r8, r10, r12)
                kotlin.jvm.internal.Intrinsics.i(r14, r2)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.w.Companion.b(java.io.FileOutputStream, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lmv/O;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    public static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Integer>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2479a;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Integer> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f2479a == 0) {
                ResultKt.b(obj);
                return Boxing.d(w.this.r().b());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lmv/O;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    public static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Integer>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2481a;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Integer> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f2481a == 0) {
                ResultKt.b(obj);
                return Boxing.d(w.this.r().c());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LB2/E;", "c", "()LB2/E;"}, k = 3, mv = {1, 8, 0})
    static final class d extends Lambda implements Function0<E> {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "c", "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
        static final class a extends Lambda implements Function0<File> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f2484f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar) {
                super(0);
                this.f2484f = wVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final File invoke() throws IOException {
                w wVar = this.f2484f;
                File fileP = wVar.p(wVar.VERSION_SUFFIX);
                this.f2484f.n(fileP);
                return fileP;
            }
        }

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final E invoke() {
            E.Companion companion = E.INSTANCE;
            companion.d();
            return companion.a(new a(w.this));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {211, 47, 48}, m = "lock")
    static final class e<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2485a;

        /* renamed from: b, reason: collision with root package name */
        Object f2486b;

        /* renamed from: c, reason: collision with root package name */
        Object f2487c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f2488d;

        /* renamed from: f, reason: collision with root package name */
        int f2490f;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2488d = obj;
            this.f2490f |= Integer.MIN_VALUE;
            return w.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "c", "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
    static final class f extends Lambda implements Function0<File> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File invoke() throws IOException {
            w wVar = w.this;
            File fileP = wVar.p(wVar.LOCK_SUFFIX);
            w.this.n(fileP);
            return fileP;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {62, 87}, m = "tryLock")
    static final class g<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2492a;

        /* renamed from: b, reason: collision with root package name */
        Object f2493b;

        /* renamed from: c, reason: collision with root package name */
        Object f2494c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2495d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2496e;

        /* renamed from: g, reason: collision with root package name */
        int f2498g;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2496e = obj;
            this.f2498g |= Integer.MIN_VALUE;
            return w.this.d(null, this);
        }
    }

    public w(CoroutineContext context, File file) {
        Intrinsics.j(context, "context");
        Intrinsics.j(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = z.INSTANCE.e(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = wv.g.b(false, 1, null);
        this.lockFile = LazyKt.b(new f());
        this.lazySharedCounter = LazyKt.b(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File p(String suffix) {
        return new File(this.file.getAbsolutePath() + suffix);
    }

    private final File q() {
        return (File) this.lockFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E r() {
        return this.lazySharedCounter.getValue();
    }

    @Override // B2.s
    public Object a(Continuation<? super Integer> continuation) {
        return this.lazySharedCounter.a() ? Boxing.d(r().b()) : C15805i.g(this.context, new b(null), continuation);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [wv.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    @Override // B2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object b(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super T> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.w.b(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // B2.s
    public InterfaceC16561f<Unit> c() {
        return this.updateNotifications;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6 A[Catch: all -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Type inference failed for: r3v2, types: [B2.w$g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v5, types: [wv.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // B2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object d(kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r19, kotlin.coroutines.Continuation<? super T> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.w.d(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // B2.s
    public Object e(Continuation<? super Integer> continuation) {
        return this.lazySharedCounter.a() ? Boxing.d(r().c()) : C15805i.g(this.context, new c(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(File file) throws IOException {
        o(file);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    private final void o(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }
}
