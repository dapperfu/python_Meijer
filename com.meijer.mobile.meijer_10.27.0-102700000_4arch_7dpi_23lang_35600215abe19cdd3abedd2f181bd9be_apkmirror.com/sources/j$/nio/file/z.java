package j$.nio.file;

import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class z implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f138684a;

    public z(Iterable iterable) {
        this.f138684a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new A(this.f138684a.iterator());
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.f138684a.forEach(new x(consumer, 1));
    }
}
