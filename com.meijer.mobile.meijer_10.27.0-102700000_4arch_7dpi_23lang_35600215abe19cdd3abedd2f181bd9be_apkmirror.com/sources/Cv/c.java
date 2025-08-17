package Cv;

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
import qv.AbstractC16618K;
import qv.InterfaceC16643h0;
import qv.InterfaceC16654n;
import qv.L0;
import qv.V;
import qv.Y;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002/0B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0014\u0010*\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"LCv/c;", "Lqv/L0;", "Lqv/Y;", "Lkotlin/Function0;", "Lqv/K;", "createInnerMain", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "L0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "R0", "(Lkotlin/coroutines/CoroutineContext;)Z", "N0", "", "timeMillis", "Lqv/n;", "continuation", "j0", "(JLqv/n;)V", "Lqv/h0;", "w", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lqv/h0;", "c", "Lkotlin/Lazy;", "a1", "()Lqv/K;", "mainDispatcher", "LCv/c$b;", "d", "LCv/c$b;", "delegate", "Z0", "dispatcher", "Y0", "()Lqv/Y;", "delay", "W0", "()Lqv/L0;", "immediate", "e", "a", "b", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class c extends L0 implements Y {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy mainDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private b<AbstractC16618K> delegate = new b<>(null, "Dispatchers.Main");

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR$\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0002X\u0082\u0004R\u000b\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004R\u0013\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0002X\u0082\u0004R\u0013\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0002X\u0082\u0004R\u0011\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¨\u0006\u0019"}, d2 = {"LCv/c$b;", "T", "", "initialValue", "", "name", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "", "location", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "a", "(Ljava/lang/Throwable;)Ljava/lang/IllegalStateException;", "Ljava/lang/String;", "value", "e", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "reader", "readers", "writer", "exceptionWhenReading", "_value", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class b<T> {

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f4979b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "reader$volatile");

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f4980c = AtomicIntegerFieldUpdater.newUpdater(b.class, "readers$volatile");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f4981d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "writer$volatile");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f4982e = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "exceptionWhenReading$volatile");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f4983f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_value$volatile");
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
            f4979b.set(this, new Throwable("reader location"));
            f4980c.incrementAndGet(this);
            Throwable th2 = (Throwable) f4981d.get(this);
            if (th2 != null) {
                f4982e.set(this, a(th2));
            }
            T t10 = (T) f4983f.get(this);
            f4980c.decrementAndGet(this);
            return t10;
        }
    }

    private final AbstractC16618K Z0() {
        AbstractC16618K abstractC16618KE = this.delegate.e();
        return abstractC16618KE == null ? a1() : abstractC16618KE;
    }

    private final AbstractC16618K a1() {
        return (AbstractC16618K) this.mainDispatcher.getValue();
    }

    public c(Function0<? extends AbstractC16618K> function0) {
        this.mainDispatcher = LazyKt.b(function0);
    }

    private final Y Y0() {
        Y y10;
        ContinuationInterceptor continuationInterceptorZ0 = Z0();
        if (continuationInterceptorZ0 instanceof Y) {
            y10 = (Y) continuationInterceptorZ0;
        } else {
            y10 = null;
        }
        if (y10 == null) {
            return V.a();
        }
        return y10;
    }

    @Override // qv.AbstractC16618K
    public void L0(CoroutineContext context, Runnable block) {
        Z0().L0(context, block);
    }

    @Override // qv.AbstractC16618K
    public void N0(CoroutineContext context, Runnable block) {
        Z0().N0(context, block);
    }

    @Override // qv.AbstractC16618K
    public boolean R0(CoroutineContext context) {
        return Z0().R0(context);
    }

    @Override // qv.L0
    /* renamed from: W0 */
    public L0 Y0() {
        L0 l02;
        L0 l0Y0;
        AbstractC16618K abstractC16618KZ0 = Z0();
        if (abstractC16618KZ0 instanceof L0) {
            l02 = (L0) abstractC16618KZ0;
        } else {
            l02 = null;
        }
        if (l02 != null && (l0Y0 = l02.Y0()) != null) {
            return l0Y0;
        }
        return this;
    }

    @Override // qv.Y
    public void j0(long timeMillis, InterfaceC16654n<? super Unit> continuation) {
        Y0().j0(timeMillis, continuation);
    }

    @Override // qv.Y
    public InterfaceC16643h0 w(long timeMillis, Runnable block, CoroutineContext context) {
        return Y0().w(timeMillis, block, context);
    }
}
