package j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class u implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f138677a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Path f138678b;

    public u(Path path) {
        this.f138678b = path;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f138677a < this.f138678b.getNameCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f138677a < this.f138678b.getNameCount()) {
            Path name = this.f138678b.getName(this.f138677a);
            this.f138677a++;
            return name;
        }
        throw new NoSuchElementException();
    }
}
