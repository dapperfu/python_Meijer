package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* loaded from: classes3.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {
    Path J(Path path);

    boolean equals(Object obj);

    Path getFileName();

    AbstractC14776h getFileSystem();

    Path getName(int i10);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    Path normalize();

    L p(M m10, J[] jArr, K... kArr);

    Path r(Path path);

    Path s(LinkOption... linkOptionArr);

    Path subpath(int i10, int i11);

    Path toAbsolutePath();

    String toString();

    URI toUri();

    @Override // java.lang.Comparable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    int compareTo(Path path);

    boolean w(Path path);

    boolean z(Path path);

    default boolean startsWith(String str) {
        return w(getFileSystem().b(str, new String[0]));
    }

    default boolean endsWith(String str) {
        return z(getFileSystem().b(str, new String[0]));
    }

    default Path resolve(String str) {
        return r(getFileSystem().b(str, new String[0]));
    }

    default Path B(Path path) {
        path.getClass();
        Path parent = getParent();
        return parent == null ? path : parent.r(path);
    }

    default Path resolveSibling(String str) {
        return B(getFileSystem().b(str, new String[0]));
    }

    default File toFile() {
        if (getFileSystem() == AbstractC14778j.f138650a) {
            return new File(toString());
        }
        throw new UnsupportedOperationException("Path not associated with default file system.");
    }

    default L X(M m10, J... jArr) {
        return p(m10, jArr, new K[0]);
    }

    default Iterator iterator() {
        return new u(this);
    }
}
