package nv;

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
import mv.C15800f0;
import mv.E0;
import mv.InterfaceC15804h0;
import mv.InterfaceC15815n;
import mv.O0;
import mv.Y;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J%\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lnv/d;", "Lnv/e;", "Lmv/Y;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "c1", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "P0", "(Lkotlin/coroutines/CoroutineContext;)Z", "J0", "", "timeMillis", "Lmv/n;", "continuation", "H0", "(JLmv/n;)V", "Lmv/h0;", "w", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lmv/h0;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "Landroid/os/Handler;", "d", "Ljava/lang/String;", "e", "Z", "f", "Lnv/d;", "d1", "()Lnv/d;", "immediate", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: nv.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16027d extends AbstractC16028e implements Y {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean invokeImmediately;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C16027d immediate;

    private C16027d(Handler handler, String str, boolean z10) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z10;
        this.immediate = z10 ? this : new C16027d(handler, str, true);
    }

    private final void c1(CoroutineContext context, Runnable block) {
        E0.c(context, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C15800f0.b().J0(context, block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e1(C16027d c16027d, Runnable runnable) {
        c16027d.handler.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f1(InterfaceC15815n interfaceC15815n, C16027d c16027d) {
        interfaceC15815n.B(c16027d, Unit.f143329a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h1(C16027d c16027d, Runnable runnable, Throwable th2) {
        c16027d.handler.removeCallbacks(runnable);
        return Unit.f143329a;
    }

    @Override // mv.Y
    public void H0(long timeMillis, final InterfaceC15815n<? super Unit> continuation) {
        final Runnable runnable = new Runnable() { // from class: nv.b
            @Override // java.lang.Runnable
            public final void run() {
                C16027d.f1(continuation, this);
            }
        };
        if (this.handler.postDelayed(runnable, RangesKt.l(timeMillis, 4611686018427387903L))) {
            continuation.F(new Function1() { // from class: nv.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16027d.h1(this.f153268a, runnable, (Throwable) obj);
                }
            });
        } else {
            c1(continuation.getF143270a(), runnable);
        }
    }

    @Override // mv.AbstractC15779K
    public void J0(CoroutineContext context, Runnable block) {
        if (this.handler.post(block)) {
            return;
        }
        c1(context, block);
    }

    @Override // mv.AbstractC15779K
    public boolean P0(CoroutineContext context) {
        return (this.invokeImmediately && Intrinsics.e(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // nv.AbstractC16028e
    /* renamed from: d1, reason: from getter and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C16027d X0() {
        return this.immediate;
    }

    public boolean equals(Object other) {
        if (!(other instanceof C16027d)) {
            return false;
        }
        C16027d c16027d = (C16027d) other;
        return c16027d.handler == this.handler && c16027d.invokeImmediately == this.invokeImmediately;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // nv.AbstractC16028e, mv.Y
    public InterfaceC15804h0 w(long timeMillis, final Runnable block, CoroutineContext context) {
        if (this.handler.postDelayed(block, RangesKt.l(timeMillis, 4611686018427387903L))) {
            return new InterfaceC15804h0() { // from class: nv.a
                @Override // mv.InterfaceC15804h0
                public final void dispose() {
                    C16027d.e1(this.f153264a, block);
                }
            };
        }
        c1(context, block);
        return O0.f151684a;
    }

    @Override // mv.L0, mv.AbstractC15779K
    /* renamed from: toString */
    public String getName() {
        String strW0 = W0();
        if (strW0 == null) {
            String string = this.name;
            if (string == null) {
                string = this.handler.toString();
            }
            if (this.invokeImmediately) {
                return string + ".immediate";
            }
            return string;
        }
        return strW0;
    }

    public /* synthetic */ C16027d(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public C16027d(Handler handler, String str) {
        this(handler, str, false);
    }
}
