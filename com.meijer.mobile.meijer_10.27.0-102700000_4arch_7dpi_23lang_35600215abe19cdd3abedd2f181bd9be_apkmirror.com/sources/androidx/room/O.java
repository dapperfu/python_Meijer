package androidx.room;

import androidx.room.C6131q;
import androidx.room.O;
import androidx.view.AbstractC5985A;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C15957c;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000H¦@¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010)\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+\u0082\u0001\u0001-¨\u0006."}, d2 = {"Landroidx/room/O;", "T", "Landroidx/lifecycle/A;", "Landroidx/room/G;", "database", "Landroidx/room/m;", "container", "", "inTransaction", "", "", "tableNames", "<init>", "(Landroidx/room/G;Landroidx/room/m;Z[Ljava/lang/String;)V", "", "t", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "()V", "r", "k", "l", "Landroidx/room/G;", "getDatabase", "()Landroidx/room/G;", "m", "Landroidx/room/m;", "n", "Z", "getInTransaction", "()Z", "Landroidx/room/q$b;", "o", "Landroidx/room/q$b;", "observer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "p", "Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "q", "computing", "registeredObserver", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "launchContext", "Landroidx/room/x;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class O<T> extends AbstractC5985A<T> {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final G database;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C6127m container;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean inTransaction;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final C6131q.b observer;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean invalid;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean computing;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean registeredObserver;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext launchContext;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.RoomTrackingLiveData$invalidated$1", f = "RoomTrackingLiveData.android.kt", l = {113}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f58416a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O<T> f58417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O<T> o10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f58417b = o10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f58417b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f58416a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                O<T> o10 = this.f58417b;
                this.f58416a = 1;
                if (o10.t(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/O$b", "Landroidx/room/q$b;", "", "", "tables", "", "c", "(Ljava/util/Set;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends C6131q.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O<T> f58418b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String[] strArr, O<T> o10) {
            super(strArr);
            this.f58418b = o10;
        }

        @Override // androidx.room.C6131q.b
        public void c(Set<String> tables) {
            Intrinsics.j(tables, "tables");
            C15957c c15957cH = C15957c.h();
            final O<T> o10 = this.f58418b;
            c15957cH.b(new Runnable() { // from class: androidx.room.P
                @Override // java.lang.Runnable
                public final void run() {
                    O.b.e(o10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(O o10) {
            o10.s();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.RoomTrackingLiveData$onActive$1", f = "RoomTrackingLiveData.android.kt", l = {123}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f58419a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O<T> f58420b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(O<T> o10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f58420b = o10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f58420b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f58419a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                O<T> o10 = this.f58420b;
                this.f58419a = 1;
                if (o10.t(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomTrackingLiveData", f = "RoomTrackingLiveData.android.kt", l = {82}, m = "refresh")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f58421a;

        /* renamed from: b, reason: collision with root package name */
        int f58422b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f58423c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O<T> f58424d;

        /* renamed from: e, reason: collision with root package name */
        int f58425e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(O<T> o10, Continuation<? super d> continuation) {
            super(continuation);
            this.f58424d = o10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58423c = obj;
            this.f58425e |= Integer.MIN_VALUE;
            return this.f58424d.t(this);
        }
    }

    public /* synthetic */ O(G g10, C6127m c6127m, boolean z10, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(g10, c6127m, z10, strArr);
    }

    public abstract Object r(Continuation<? super T> continuation);

    private O(G g10, C6127m c6127m, boolean z10, String[] strArr) {
        this.database = g10;
        this.container = c6127m;
        this.inTransaction = z10;
        this.observer = new b(strArr, this);
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.launchContext = g10.inCompatibilityMode$room_runtime_release() ? z10 ? g10.getTransactionContext$room_runtime_release() : g10.getQueryContext() : EmptyCoroutineContext.f142646a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x0033, Exception -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x002c, B:29:0x0069), top: B:49:0x002c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002c, B:27:0x0061, B:29:0x0069, B:36:0x0083, B:33:0x0079, B:34:0x0080), top: B:48:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005e -> B:27:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0092 -> B:41:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.room.O.d
            if (r0 == 0) goto L13
            r0 = r9
            androidx.room.O$d r0 = (androidx.room.O.d) r0
            int r1 = r0.f58425e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58425e = r1
            goto L18
        L13:
            androidx.room.O$d r0 = new androidx.room.O$d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f58423c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f58425e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            int r2 = r0.f58422b
            java.lang.Object r5 = r0.f58421a
            androidx.room.O r5 = (androidx.room.O) r5
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r7 = r2
            r2 = r9
            r9 = r7
            goto L61
        L33:
            r9 = move-exception
            goto L8c
        L35:
            r9 = move-exception
            goto L79
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3f:
            kotlin.ResultKt.b(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.registeredObserver
            boolean r9 = r9.compareAndSet(r3, r4)
            if (r9 == 0) goto L55
            androidx.room.G r9 = r8.database
            androidx.room.q r9 = r9.getInvalidationTracker()
            androidx.room.q$b r2 = r8.observer
            r9.k(r2)
        L55:
            r9 = r8
        L56:
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.computing
            boolean r2 = r2.compareAndSet(r3, r4)
            if (r2 == 0) goto L92
            r2 = 0
            r5 = r9
            r9 = r3
        L61:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.invalid     // Catch: java.lang.Throwable -> L33
            boolean r6 = r6.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L81
            r0.f58421a = r5     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.f58422b = r4     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.f58425e = r4     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.lang.Object r9 = r5.r(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            if (r9 != r1) goto L76
            return r1
        L76:
            r2 = r9
            r9 = r4
            goto L61
        L79:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "Exception while computing database live data."
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> L33
            throw r0     // Catch: java.lang.Throwable -> L33
        L81:
            if (r9 == 0) goto L86
            r5.m(r2)     // Catch: java.lang.Throwable -> L33
        L86:
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.computing
            r2.set(r3)
            goto L94
        L8c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.computing
            r0.set(r3)
            throw r9
        L92:
            r5 = r9
            r9 = r3
        L94:
            if (r9 == 0) goto La1
            java.util.concurrent.atomic.AtomicBoolean r9 = r5.invalid
            boolean r9 = r9.get()
            if (r9 != 0) goto L9f
            goto La1
        L9f:
            r9 = r5
            goto L56
        La1:
            kotlin.Unit r9 = kotlin.Unit.f142422a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.O.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        boolean zG = g();
        if (this.invalid.compareAndSet(false, true) && zG) {
            C16648k.d(this.database.getCoroutineScope(), this.launchContext, null, new a(this, null), 2, null);
        }
    }

    @Override // androidx.view.AbstractC5985A
    protected void k() {
        super.k();
        this.container.b(this);
        C16648k.d(this.database.getCoroutineScope(), this.launchContext, null, new c(this, null), 2, null);
    }

    @Override // androidx.view.AbstractC5985A
    protected void l() {
        super.l();
        this.container.c(this);
    }
}
