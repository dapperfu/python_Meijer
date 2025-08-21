package j$.nio.file;

import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class z implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f139273a;

    public z(Iterable iterable) {
        this.f139273a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new A(this.f139273a.iterator());
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.f139273a.forEach(new x(consumer, 1));
    }
}
