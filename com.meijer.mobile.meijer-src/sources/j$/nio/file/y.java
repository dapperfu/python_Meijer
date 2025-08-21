package j$.nio.file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class y implements DirectoryStream {

    /* renamed from: a, reason: collision with root package name */
    public final DirectoryStream f139272a;

    public y(DirectoryStream directoryStream) {
        this.f139272a = directoryStream;
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new A(this.f139272a.iterator());
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.f139272a.forEach(new x(consumer, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f139272a.close();
    }
}
