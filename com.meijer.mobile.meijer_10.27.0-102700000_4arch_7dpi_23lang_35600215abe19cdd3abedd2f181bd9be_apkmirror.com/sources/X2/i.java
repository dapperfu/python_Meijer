package X2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\r\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0016\u0010\u0010J%\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0017*\u00060\bj\u0002`\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u00060\bj\u0002`\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\n\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010&¨\u0006("}, d2 = {"LX2/i;", "", "<init>", "()V", "Lqv/O;", "viewModelScope", "(Lqv/O;)V", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Lqv/O;[Ljava/lang/AutoCloseable;)V", "closeable", "", "g", "(Ljava/lang/AutoCloseable;)V", "f", "", "key", "e", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "d", "T", "h", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "LX2/e;", "a", "LX2/e;", "lock", "", "b", "Ljava/util/Map;", "keyToCloseables", "", "c", "Ljava/util/Set;", "", "Z", "isCleared", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e lock;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, AutoCloseable> keyToCloseables;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<AutoCloseable> closeables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isCleared;

    public i() {
        this.lock = new e();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(AutoCloseable closeable) {
        if (closeable != null) {
            try {
                f.a(closeable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(AutoCloseable closeable) {
        Intrinsics.j(closeable, "closeable");
        if (this.isCleared) {
            g(closeable);
            return;
        }
        synchronized (this.lock) {
            this.closeables.add(closeable);
            Unit unit = Unit.f142422a;
        }
    }

    public final void e(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.j(key, "key");
        Intrinsics.j(closeable, "closeable");
        if (this.isCleared) {
            g(closeable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(key, closeable);
        }
        g(autoCloseable);
    }

    public final void f() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            try {
                Iterator it = this.keyToCloseables.values().iterator();
                while (it.hasNext()) {
                    g((AutoCloseable) it.next());
                }
                Iterator it2 = this.closeables.iterator();
                while (it2.hasNext()) {
                    g((AutoCloseable) it2.next());
                }
                this.closeables.clear();
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <T extends AutoCloseable> T h(String key) {
        T t10;
        Intrinsics.j(key, "key");
        synchronized (this.lock) {
            t10 = (T) this.keyToCloseables.get(key);
        }
        return t10;
    }

    public i(InterfaceC16622O viewModelScope) {
        Intrinsics.j(viewModelScope, "viewModelScope");
        this.lock = new e();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", b.a(viewModelScope));
    }

    public i(AutoCloseable... closeables) {
        Intrinsics.j(closeables, "closeables");
        this.lock = new e();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        CollectionsKt.D(linkedHashSet, closeables);
    }

    public i(InterfaceC16622O viewModelScope, AutoCloseable... closeables) {
        Intrinsics.j(viewModelScope, "viewModelScope");
        Intrinsics.j(closeables, "closeables");
        this.lock = new e();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", b.a(viewModelScope));
        CollectionsKt.D(linkedHashSet, closeables);
    }
}
