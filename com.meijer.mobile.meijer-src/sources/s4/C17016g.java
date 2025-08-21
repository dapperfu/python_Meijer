package s4;

import android.database.SQLException;
import androidx.room.X;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import mv.InterfaceC15783O;
import r4.C16836d;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00112\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R$\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\f0(j\b\u0012\u0004\u0012\u00020\f`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010?\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u0015R\u0014\u0010@\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010=¨\u0006A"}, d2 = {"Ls4/g;", "Ls4/b;", "LA4/c;", "driver", "", "fileName", "<init>", "(LA4/c;Ljava/lang/String;)V", "", "maxNumOfReaders", "maxNumOfWriters", "(LA4/c;Ljava/lang/String;II)V", "Ls4/l;", "connection", "Lkotlin/coroutines/CoroutineContext;", "j", "(Ls4/l;)Lkotlin/coroutines/CoroutineContext;", "", "isReadOnly", "", "l", "(Z)V", "R", "Lkotlin/Function2;", "Landroidx/room/X;", "Lkotlin/coroutines/Continuation;", "", "block", "p0", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "a", "LA4/c;", "Ls4/k;", "b", "Ls4/k;", "readers", "c", "writers", "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/ThreadLocal;", "d", "Ljava/lang/ThreadLocal;", "threadLocal", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isClosed", "Lkotlin/time/Duration;", "f", "J", "getTimeout-UwyO8pc$room_runtime_release", "()J", "setTimeout-LRDsOJo$room_runtime_release", "(J)V", "timeout", "g", "Z", "getThrowOnTimeout$room_runtime_release", "()Z", "setThrowOnTimeout$room_runtime_release", "throwOnTimeout", "isClosed", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: s4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17016g implements InterfaceC17011b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final A4.c driver;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k readers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k writers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal<l> threadLocal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean _isClosed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long timeout;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean throwOnTimeout;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {116, BinsView.TOTE_HEIGHT_DP, 138, 143}, m = "useConnection")
    /* renamed from: s4.g$a */
    static final class a<R> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f159957a;

        /* renamed from: b, reason: collision with root package name */
        Object f159958b;

        /* renamed from: c, reason: collision with root package name */
        Object f159959c;

        /* renamed from: d, reason: collision with root package name */
        Object f159960d;

        /* renamed from: e, reason: collision with root package name */
        Object f159961e;

        /* renamed from: f, reason: collision with root package name */
        Object f159962f;

        /* renamed from: g, reason: collision with root package name */
        boolean f159963g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f159964h;

        /* renamed from: j, reason: collision with root package name */
        int f159966j;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f159964h = obj;
            this.f159966j |= Integer.MIN_VALUE;
            return C17016g.this.p0(false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lmv/O;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", l = {117}, m = "invokeSuspend")
    /* renamed from: s4.g$b */
    static final class b<R> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f159967a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<X, Continuation<? super R>, Object> f159968b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f159969c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super X, ? super Continuation<? super R>, ? extends Object> function2, l lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f159968b = function2;
            this.f159969c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f159968b, this.f159969c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super R> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f159967a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Function2<X, Continuation<? super R>, Object> function2 = this.f159968b;
            l lVar = this.f159969c;
            this.f159967a = 1;
            Object objInvoke = function2.invoke(lVar, this);
            if (objInvoke == objF) {
                return objF;
            }
            return objInvoke;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lmv/O;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {143}, m = "invokeSuspend")
    /* renamed from: s4.g$c */
    static final class c<R> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f159970a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<X, Continuation<? super R>, Object> f159971b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<l> f159972c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super X, ? super Continuation<? super R>, ? extends Object> function2, Ref.ObjectRef<l> objectRef, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f159971b = function2;
            this.f159972c = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f159971b, this.f159972c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super R> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f159970a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Function2<X, Continuation<? super R>, Object> function2 = this.f159971b;
            l lVar = this.f159972c.f143742a;
            this.f159970a = 1;
            Object objInvoke = function2.invoke(lVar, this);
            if (objInvoke == objF) {
                return objF;
            }
            return objInvoke;
        }
    }

    public C17016g(final A4.c driver, final String fileName) {
        Intrinsics.j(driver, "driver");
        Intrinsics.j(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.INSTANCE;
        this.timeout = DurationKt.s(30, DurationUnit.f148417e);
        this.driver = driver;
        k kVar = new k(1, new Function0() { // from class: s4.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C17016g.g(driver, fileName);
            }
        });
        this.readers = kVar;
        this.writers = kVar;
    }

    private final boolean isClosed() {
        return this._isClosed.get();
    }

    private final CoroutineContext j(l connection) {
        return new C17010a(connection).n0(C16836d.a(this.threadLocal, connection));
    }

    private final void l(boolean isReadOnly) {
        String str = isReadOnly ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append('\n');
        sb2.append('\n');
        sb2.append("Writer pool:");
        sb2.append('\n');
        this.writers.d(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.readers.d(sb2);
        try {
            A4.a.b(5, sb2.toString());
            throw new KotlinNothingValueException();
        } catch (SQLException e10) {
            if (this.throwOnTimeout) {
                throw e10;
            }
            e10.printStackTrace();
        }
    }

    @Override // s4.InterfaceC17011b, java.lang.AutoCloseable
    public void close() {
        if (this._isClosed.compareAndSet(false, true)) {
            this.readers.c();
            this.writers.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012c A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #2 {all -> 0x0167, blocks: (B:63:0x0111, B:68:0x0121, B:70:0x012c, B:80:0x016c, B:81:0x0173, B:59:0x00ec), top: B:98:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155 A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #1 {all -> 0x0166, blocks: (B:74:0x014f, B:76:0x0155), top: B:96:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016c A[Catch: all -> 0x0167, TRY_ENTER, TryCatch #2 {all -> 0x0167, blocks: (B:63:0x0111, B:68:0x0121, B:70:0x012c, B:80:0x016c, B:81:0x0173, B:59:0x00ec), top: B:98:0x00ec }] */
    /* JADX WARN: Type inference failed for: r13v14, types: [T, s4.l] */
    @Override // s4.InterfaceC17011b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object p0(final boolean r13, kotlin.jvm.functions.Function2<? super androidx.room.X, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r14, kotlin.coroutines.Continuation<? super R> r15) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C17016g.p0(boolean, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A4.b g(A4.c cVar, String str) {
        return cVar.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A4.b h(A4.c cVar, String str) {
        A4.b bVarA = cVar.a(str);
        A4.a.a(bVarA, "PRAGMA query_only = 1");
        return bVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A4.b i(A4.c cVar, String str) {
        return cVar.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(C17016g c17016g, boolean z10) {
        c17016g.l(z10);
        return Unit.f143329a;
    }

    public C17016g(final A4.c driver, final String fileName, int i10, int i11) {
        Intrinsics.j(driver, "driver");
        Intrinsics.j(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.INSTANCE;
        this.timeout = DurationKt.s(30, DurationUnit.f148417e);
        if (i10 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i11 > 0) {
            this.driver = driver;
            this.readers = new k(i10, new Function0() { // from class: s4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C17016g.h(driver, fileName);
                }
            });
            this.writers = new k(i11, new Function0() { // from class: s4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C17016g.i(driver, fileName);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
