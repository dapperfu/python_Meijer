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
    public final boolean f139252a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkOption[] f139253b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139254c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f139255d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public boolean f139256e;

    public o(Collection collection, int i10) {
        LinkOption[] linkOptionArr;
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (AbstractC14867k.f139240a[((FileVisitOption) it.next()).ordinal()] != 1) {
                throw new AssertionError("Should not get here");
            }
            z10 = true;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("'maxDepth' is negative");
        }
        this.f139252a = z10;
        if (z10) {
            linkOptionArr = new LinkOption[0];
        } else {
            linkOptionArr = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
        }
        this.f139253b = linkOptionArr;
        this.f139254c = i10;
    }

    public final BasicFileAttributes a(Path path) throws IOException {
        try {
            return Files.readAttributes(path, BasicFileAttributes.class, this.f139253b);
        } catch (IOException e10) {
            if (this.f139252a) {
                return Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            }
            throw e10;
        }
    }

    public final C14869m c(Path path, boolean z10) {
        try {
            BasicFileAttributes basicFileAttributesA = a(path);
            if (this.f139255d.size() >= this.f139254c || !basicFileAttributesA.isDirectory()) {
                return new C14869m(n.ENTRY, path, basicFileAttributesA, (IOException) null);
            }
            if (this.f139252a) {
                Object objFileKey = basicFileAttributesA.fileKey();
                Iterator it = this.f139255d.iterator();
                while (it.hasNext()) {
                    C14868l c14868l = (C14868l) it.next();
                    Object obj = c14868l.f139242b;
                    if (objFileKey != null && obj != null) {
                        if (objFileKey.equals(obj)) {
                            return new C14869m(n.ENTRY, path, (BasicFileAttributes) null, new FileSystemLoopException(path.toString()));
                        }
                    } else {
                        try {
                        } catch (IOException | SecurityException unused) {
                            continue;
                        }
                        if (Files.isSameFile(path, c14868l.f139241a)) {
                            return new C14869m(n.ENTRY, path, (BasicFileAttributes) null, new FileSystemLoopException(path.toString()));
                        }
                    }
                }
            }
            try {
                this.f139255d.push(new C14868l(path, basicFileAttributesA.fileKey(), Files.b(path).r(path, q.f139258a)));
                return new C14869m(n.START_DIRECTORY, path, basicFileAttributesA, (IOException) null);
            } catch (IOException e10) {
                return new C14869m(n.ENTRY, path, (BasicFileAttributes) null, e10);
            } catch (SecurityException e11) {
                if (!z10) {
                    throw e11;
                }
                return null;
            }
        } catch (IOException e12) {
            return new C14869m(n.ENTRY, path, (BasicFileAttributes) null, e12);
        } catch (SecurityException e13) {
            if (!z10) {
                throw e13;
            }
        }
    }

    public final C14869m b() throws IOException {
        Path path;
        IOException cause;
        C14869m c14869mC;
        C14868l c14868l = (C14868l) this.f139255d.peek();
        if (c14868l == null) {
            return null;
        }
        do {
            if (c14868l.f139245e) {
                path = null;
                cause = null;
            } else {
                Iterator it = c14868l.f139244d;
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
                    c14868l.f139243c.close();
                } catch (IOException e11) {
                    if (cause == null) {
                        cause = e11;
                    } else {
                        cause.addSuppressed(e11);
                    }
                }
                this.f139255d.pop();
                return new C14869m(n.END_DIRECTORY, c14868l.f139241a, (BasicFileAttributes) null, cause);
            }
            c14869mC = c(path, true);
        } while (c14869mC == null);
        return c14869mC;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f139256e) {
            return;
        }
        while (!this.f139255d.isEmpty()) {
            if (!this.f139255d.isEmpty()) {
                try {
                    ((C14868l) this.f139255d.pop()).f139243c.close();
                } catch (IOException unused) {
                }
            }
        }
        this.f139256e = true;
    }
}
