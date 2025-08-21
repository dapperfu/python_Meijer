package j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class u implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f139266a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Path f139267b;

    public u(Path path) {
        this.f139267b = path;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f139266a < this.f139267b.getNameCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f139266a < this.f139267b.getNameCount()) {
            Path name = this.f139267b.getName(this.f139266a);
            this.f139266a++;
            return name;
        }
        throw new NoSuchElementException();
    }
}
