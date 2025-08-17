package j$.nio.file;

import j$.nio.file.attribute.BasicFileAttributes;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.FileSystemLoopException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f138663a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkOption[] f138664b;

    /* renamed from: c, reason: collision with root package name */
    public final int f138665c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f138666d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public boolean f138667e;

    public o(Collection collection, int i10) {
        LinkOption[] linkOptionArr;
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (AbstractC14779k.f138651a[((FileVisitOption) it.next()).ordinal()] != 1) {
                throw new AssertionError("Should not get here");
            }
            z10 = true;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("'maxDepth' is negative");
        }
        this.f138663a = z10;
        if (z10) {
            linkOptionArr = new LinkOption[0];
        } else {
            linkOptionArr = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
        }
        this.f138664b = linkOptionArr;
        this.f138665c = i10;
    }

    public final BasicFileAttributes a(Path path) throws IOException {
        try {
            return Files.readAttributes(path, BasicFileAttributes.class, this.f138664b);
        } catch (IOException e10) {
            if (this.f138663a) {
                return Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            }
            throw e10;
        }
    }

    public final C14781m c(Path path, boolean z10) {
        try {
            BasicFileAttributes basicFileAttributesA = a(path);
            if (this.f138666d.size() >= this.f138665c || !basicFileAttributesA.isDirectory()) {
                return new C14781m(n.ENTRY, path, basicFileAttributesA, (IOException) null);
            }
            if (this.f138663a) {
                Object objFileKey = basicFileAttributesA.fileKey();
                Iterator it = this.f138666d.iterator();
                while (it.hasNext()) {
                    C14780l c14780l = (C14780l) it.next();
                    Object obj = c14780l.f138653b;
                    if (objFileKey != null && obj != null) {
                        if (objFileKey.equals(obj)) {
                            return new C14781m(n.ENTRY, path, (BasicFileAttributes) null, new FileSystemLoopException(path.toString()));
                        }
                    } else {
                        try {
                        } catch (IOException | SecurityException unused) {
                            continue;
                        }
                        if (Files.isSameFile(path, c14780l.f138652a)) {
                            return new C14781m(n.ENTRY, path, (BasicFileAttributes) null, new FileSystemLoopException(path.toString()));
                        }
                    }
                }
            }
            try {
                this.f138666d.push(new C14780l(path, basicFileAttributesA.fileKey(), Files.b(path).r(path, q.f138669a)));
                return new C14781m(n.START_DIRECTORY, path, basicFileAttributesA, (IOException) null);
            } catch (IOException e10) {
                return new C14781m(n.ENTRY, path, (BasicFileAttributes) null, e10);
            } catch (SecurityException e11) {
                if (!z10) {
                    throw e11;
                }
                return null;
            }
        } catch (IOException e12) {
            return new C14781m(n.ENTRY, path, (BasicFileAttributes) null, e12);
        } catch (SecurityException e13) {
            if (!z10) {
                throw e13;
            }
        }
    }

    public final C14781m b() throws IOException {
        Path path;
        IOException cause;
        C14781m c14781mC;
        C14780l c14780l = (C14780l) this.f138666d.peek();
        if (c14780l == null) {
            return null;
        }
        do {
            if (c14780l.f138656e) {
                path = null;
                cause = null;
            } else {
                Iterator it = c14780l.f138655d;
                try {
                    path = it.hasNext() ? (Path) it.next() : null;
                    cause = null;
                } catch (DirectoryIteratorException e10) {
                    cause = e10.getCause();
                    path = null;
                }
            }
            if (path == null) {
                try {
                    c14780l.f138654c.close();
                } catch (IOException e11) {
                    if (cause == null) {
                        cause = e11;
                    } else {
                        cause.addSuppressed(e11);
                    }
                }
                this.f138666d.pop();
                return new C14781m(n.END_DIRECTORY, c14780l.f138652a, (BasicFileAttributes) null, cause);
            }
            c14781mC = c(path, true);
        } while (c14781mC == null);
        return c14781mC;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f138667e) {
            return;
        }
        while (!this.f138666d.isEmpty()) {
            if (!this.f138666d.isEmpty()) {
                try {
                    ((C14780l) this.f138666d.pop()).f138654c.close();
                } catch (IOException unused) {
                }
            }
        }
        this.f138667e = true;
    }
}
