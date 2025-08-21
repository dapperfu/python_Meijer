package J0;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nR4\u0010\u0010\u001a\"\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bj\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"LJ0/j;", "T", "", "<init>", "()V", "a", "()Ljava/lang/Object;", "value", "", "b", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "LJ0/l;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/internal/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "map", "Ljava/lang/Object;", "writeMutex", "c", "mainThreadValue", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class j<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<l> map = new AtomicReference<>(k.f15372a);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object writeMutex = new Object();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private T mainThreadValue;

    public final T a() {
        long jA = n.a();
        if (jA == m.a()) {
            return this.mainThreadValue;
        }
        return (T) this.map.get().b(jA);
    }

    public final void b(T value) {
        long jA = n.a();
        if (jA == m.a()) {
            this.mainThreadValue = value;
            return;
        }
        synchronized (this.writeMutex) {
            l lVar = this.map.get();
            if (lVar.d(jA, value)) {
                return;
            }
            this.map.set(lVar.c(jA, value));
            Unit unit = Unit.f143329a;
        }
    }
}
