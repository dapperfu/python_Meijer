package yv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.InterfaceC15804h0;
import mv.InterfaceC15815n;
import mv.L0;
import mv.V;
import mv.Y;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002/0B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0014\u0010*\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Lyv/c;", "Lmv/L0;", "Lmv/Y;", "Lkotlin/Function0;", "Lmv/K;", "createInnerMain", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "J0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "P0", "(Lkotlin/coroutines/CoroutineContext;)Z", "K0", "", "timeMillis", "Lmv/n;", "continuation", "H0", "(JLmv/n;)V", "Lmv/h0;", "w", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lmv/h0;", "c", "Lkotlin/Lazy;", "Z0", "()Lmv/K;", "mainDispatcher", "Lyv/c$b;", "d", "Lyv/c$b;", "delegate", "Y0", "dispatcher", "X0", "()Lmv/Y;", "delay", "U0", "()Lmv/L0;", "immediate", "e", "a", "b", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yv.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C18377c extends L0 implements Y {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy mainDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private b<AbstractC15779K> delegate = new b<>(null, "Dispatchers.Main");

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR$\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0002X\u0082\u0004R\u000b\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004R\u0013\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0002X\u0082\u0004R\u0013\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0002X\u0082\u0004R\u0011\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¨\u0006\u0019"}, d2 = {"Lyv/c$b;", "T", "", "initialValue", "", "name", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "", "location", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "a", "(Ljava/lang/Throwable;)Ljava/lang/IllegalStateException;", "Ljava/lang/String;", "value", "e", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "reader", "readers", "writer", "exceptionWhenReading", "_value", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: yv.c$b */
    private static final class b<T> {

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f172156b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "reader$volatile");

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f172157c = AtomicIntegerFieldUpdater.newUpdater(b.class, "readers$volatile");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f172158d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "writer$volatile");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f172159e = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "exceptionWhenReading$volatile");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f172160f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_value$volatile");
        private volatile /* synthetic */ Object _value$volatile;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;
        private volatile /* synthetic */ Object exceptionWhenReading$volatile;
        private volatile /* synthetic */ Object reader$volatile;
        private volatile /* synthetic */ int readers$volatile;
        private volatile /* synthetic */ Object writer$volatile;

        private final IllegalStateException a(Throwable location) {
            return new IllegalStateException(this.name + " is used concurrently with setting it", location);
        }

        public b(T t10, String str) {
            this.name = str;
            this._value$volatile = t10;
        }

        public final T e() {
            f172156b.set(this, new Throwable("reader location"));
            f172157c.incrementAndGet(this);
            Throwable th2 = (Throwable) f172158d.get(this);
            if (th2 != null) {
                f172159e.set(this, a(th2));
            }
            T t10 = (T) f172160f.get(this);
            f172157c.decrementAndGet(this);
            return t10;
        }
    }

    private final AbstractC15779K Y0() {
        AbstractC15779K abstractC15779KE = this.delegate.e();
        return abstractC15779KE == null ? Z0() : abstractC15779KE;
    }

    private final AbstractC15779K Z0() {
        return (AbstractC15779K) this.mainDispatcher.getValue();
    }

    public C18377c(Function0<? extends AbstractC15779K> function0) {
        this.mainDispatcher = LazyKt.b(function0);
    }

    private final Y X0() {
        Y y10;
        ContinuationInterceptor continuationInterceptorY0 = Y0();
        if (continuationInterceptorY0 instanceof Y) {
            y10 = (Y) continuationInterceptorY0;
        } else {
            y10 = null;
        }
        if (y10 == null) {
            return V.a();
        }
        return y10;
    }

    @Override // mv.Y
    public void H0(long timeMillis, InterfaceC15815n<? super Unit> continuation) {
        X0().H0(timeMillis, continuation);
    }

    @Override // mv.AbstractC15779K
    public void J0(CoroutineContext context, Runnable block) {
        Y0().J0(context, block);
    }

    @Override // mv.AbstractC15779K
    public void K0(CoroutineContext context, Runnable block) {
        Y0().K0(context, block);
    }

    @Override // mv.AbstractC15779K
    public boolean P0(CoroutineContext context) {
        return Y0().P0(context);
    }

    @Override // mv.L0
    /* renamed from: U0 */
    public L0 X0() {
        L0 l02;
        L0 l0X0;
        AbstractC15779K abstractC15779KY0 = Y0();
        if (abstractC15779KY0 instanceof L0) {
            l02 = (L0) abstractC15779KY0;
        } else {
            l02 = null;
        }
        if (l02 != null && (l0X0 = l02.X0()) != null) {
            return l0X0;
        }
        return this;
    }

    @Override // mv.Y
    public InterfaceC15804h0 w(long timeMillis, Runnable block, CoroutineContext context) {
        return X0().w(timeMillis, block, context);
    }
}
