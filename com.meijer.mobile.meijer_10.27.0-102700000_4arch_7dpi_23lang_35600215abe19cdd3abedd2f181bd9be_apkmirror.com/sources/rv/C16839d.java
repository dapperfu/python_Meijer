package rv;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import qv.C16639f0;
import qv.E0;
import qv.InterfaceC16643h0;
import qv.InterfaceC16654n;
import qv.O0;
import qv.Y;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J%\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lrv/d;", "Lrv/e;", "Lqv/Y;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "c1", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "R0", "(Lkotlin/coroutines/CoroutineContext;)Z", "L0", "", "timeMillis", "Lqv/n;", "continuation", "j0", "(JLqv/n;)V", "Lqv/h0;", "w", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lqv/h0;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "Landroid/os/Handler;", "d", "Ljava/lang/String;", "e", "Z", "f", "Lrv/d;", "d1", "()Lrv/d;", "immediate", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C16839d extends AbstractC16840e implements Y {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean invokeImmediately;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C16839d immediate;

    private C16839d(Handler handler, String str, boolean z10) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z10;
        this.immediate = z10 ? this : new C16839d(handler, str, true);
    }

    private final void c1(CoroutineContext context, Runnable block) {
        E0.c(context, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C16639f0.b().L0(context, block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e1(C16839d c16839d, Runnable runnable) {
        c16839d.handler.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f1(InterfaceC16654n interfaceC16654n, C16839d c16839d) {
        interfaceC16654n.R(c16839d, Unit.f142422a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g1(C16839d c16839d, Runnable runnable, Throwable th2) {
        c16839d.handler.removeCallbacks(runnable);
        return Unit.f142422a;
    }

    @Override // qv.AbstractC16618K
    public void L0(CoroutineContext context, Runnable block) {
        if (this.handler.post(block)) {
            return;
        }
        c1(context, block);
    }

    @Override // qv.AbstractC16618K
    public boolean R0(CoroutineContext context) {
        return (this.invokeImmediately && Intrinsics.e(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // rv.AbstractC16840e
    /* renamed from: d1, reason: from getter and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C16839d Y0() {
        return this.immediate;
    }

    public boolean equals(Object other) {
        if (!(other instanceof C16839d)) {
            return false;
        }
        C16839d c16839d = (C16839d) other;
        return c16839d.handler == this.handler && c16839d.invokeImmediately == this.invokeImmediately;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // qv.Y
    public void j0(long timeMillis, final InterfaceC16654n<? super Unit> continuation) {
        final Runnable runnable = new Runnable() { // from class: rv.b
            @Override // java.lang.Runnable
            public final void run() {
                C16839d.f1(continuation, this);
            }
        };
        if (this.handler.postDelayed(runnable, RangesKt.l(timeMillis, 4611686018427387903L))) {
            continuation.F(new Function1() { // from class: rv.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16839d.g1(this.f159792a, runnable, (Throwable) obj);
                }
            });
        } else {
            c1(continuation.getF142363a(), runnable);
        }
    }

    @Override // rv.AbstractC16840e, qv.Y
    public InterfaceC16643h0 w(long timeMillis, final Runnable block, CoroutineContext context) {
        if (this.handler.postDelayed(block, RangesKt.l(timeMillis, 4611686018427387903L))) {
            return new InterfaceC16643h0() { // from class: rv.a
                @Override // qv.InterfaceC16643h0
                public final void dispose() {
                    C16839d.e1(this.f159788a, block);
                }
            };
        }
        c1(context, block);
        return O0.f157610a;
    }

    @Override // qv.L0, qv.AbstractC16618K
    /* renamed from: toString */
    public String getName() {
        String strX0 = X0();
        if (strX0 == null) {
            String string = this.name;
            if (string == null) {
                string = this.handler.toString();
            }
            if (this.invokeImmediately) {
                return string + ".immediate";
            }
            return string;
        }
        return strX0;
    }

    public /* synthetic */ C16839d(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public C16839d(Handler handler, String str) {
        this(handler, str, false);
    }
}
