package j$.desugar.sun.nio.fs;

import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k implements DirectoryStream {

    /* renamed from: a, reason: collision with root package name */
    public l f139162a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return this.f139162a;
    }
}
