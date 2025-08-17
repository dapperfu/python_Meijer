package androidx.compose.runtime;

import androidx.compose.runtime.InterfaceC5698b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/runtime/c;", "Landroidx/compose/runtime/b0;", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "cause", "q", "(Ljava/lang/Throwable;)V", "", "timeNanos", "s", "(J)V", "R", "Lkotlin/Function1;", "onFrame", "J", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/jvm/functions/Function0;", "", "b", "Ljava/lang/Object;", "lock", "c", "Ljava/lang/Throwable;", "failureCause", "", "Landroidx/compose/runtime/c$a;", "d", "Ljava/util/List;", "awaiters", "e", "spareList", "LJ0/a;", "f", "LJ0/a;", "hasAwaitersUnlocked", "", "r", "()Z", "hasAwaiters", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5700c implements InterfaceC5698b0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onNewAwaiters;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Throwable failureCause;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<a<?>> awaiters = new ArrayList();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<a<?>> spareList = new ArrayList();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final J0.a hasAwaitersUnlocked = new J0.a(0);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/c$a;", "R", "", "Lkotlin/Function1;", "", "onFrame", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "timeNanos", "", "b", "(J)V", "a", "Lkotlin/jvm/functions/Function1;", "getOnFrame", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/coroutines/Continuation;", "()Lkotlin/coroutines/Continuation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.c$a */
    private static final class a<R> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<Long, R> onFrame;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Continuation<R> continuation;

        public final Continuation<R> a() {
            return this.continuation;
        }

        public final void b(long timeNanos) {
            Object objB;
            Continuation<R> continuation = this.continuation;
            try {
                Result.Companion companion = Result.INSTANCE;
                objB = Result.b(this.onFrame.invoke(Long.valueOf(timeNanos)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            continuation.resumeWith(objB);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
            this.onFrame = function1;
            this.continuation = continuation;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.c$b */
    static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a<R> f50206g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<R> aVar) {
            super(1);
            this.f50206g = aVar;
        }

        public final void a(Throwable th2) {
            Object obj = C5700c.this.lock;
            C5700c c5700c = C5700c.this;
            Object obj2 = this.f50206g;
            synchronized (obj) {
                try {
                    c5700c.awaiters.remove(obj2);
                    if (c5700c.awaiters.isEmpty()) {
                        c5700c.hasAwaitersUnlocked.set(0);
                    }
                    Unit unit = Unit.f142422a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Throwable cause) {
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = cause;
                List<a<?>> list = this.awaiters;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Continuation<?> continuationA = list.get(i10).a();
                    Result.Companion companion = Result.INSTANCE;
                    continuationA.resumeWith(Result.b(ResultKt.a(cause)));
                }
                this.awaiters.clear();
                this.hasAwaitersUnlocked.set(0);
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5698b0
    public <R> Object J(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        a aVar = new a(function1, c16658p);
        synchronized (this.lock) {
            Throwable th2 = this.failureCause;
            if (th2 != null) {
                Result.Companion companion = Result.INSTANCE;
                c16658p.resumeWith(Result.b(ResultKt.a(th2)));
            } else {
                boolean zIsEmpty = this.awaiters.isEmpty();
                this.awaiters.add(aVar);
                if (zIsEmpty) {
                    this.hasAwaitersUnlocked.set(1);
                }
                c16658p.F(new b(aVar));
                if (zIsEmpty && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th3) {
                        q(th3);
                    }
                }
            }
        }
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    public final boolean r() {
        return this.hasAwaitersUnlocked.get() != 0;
    }

    public final void s(long timeNanos) {
        synchronized (this.lock) {
            try {
                List<a<?>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this.hasAwaitersUnlocked.set(0);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).b(timeNanos);
                }
                list.clear();
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C5700c(Function0<Unit> function0) {
        this.onNewAwaiters = function0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext F0(CoroutineContext.Key<?> key) {
        return InterfaceC5698b0.a.c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R b(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) InterfaceC5698b0.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        return (E) InterfaceC5698b0.a.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext m0(CoroutineContext coroutineContext) {
        return InterfaceC5698b0.a.d(this, coroutineContext);
    }
}
