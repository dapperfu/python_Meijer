package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Files {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f138604a = 0;

    public static j$.nio.file.spi.c b(Path path) {
        return path.getFileSystem().i();
    }

    static {
        j$.desugar.sun.nio.fs.g.p(new Object[]{E.CREATE_NEW, E.WRITE});
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        j$.nio.file.spi.c cVarB = b(path);
        if (b(path2).equals(cVarB)) {
            cVarB.o(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i10 = length + 2;
        CopyOption[] copyOptionArr2 = new CopyOption[i10];
        for (int i11 = 0; i11 < length; i11++) {
            CopyOption copyOption = copyOptionArr[i11];
            if (copyOption == StandardCopyOption.ATOMIC_MOVE) {
                throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i11] = copyOption;
        }
        copyOptionArr2[length] = LinkOption.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            CopyOption copyOption2 = copyOptionArr2[i12];
            if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                z11 = true;
            } else if (copyOption2 == LinkOption.NOFOLLOW_LINKS) {
                z10 = false;
            } else {
                if (copyOption2 != StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException("'" + copyOption2 + "' is not a recognized copy option");
                }
                z12 = true;
            }
        }
        BasicFileAttributes attributes = readAttributes(path, BasicFileAttributes.class, z10 ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        if (attributes.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z11) {
            path2.getFileSystem().i().g(path2);
        } else if (exists(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (attributes.isDirectory()) {
            path2.getFileSystem().i().c(path2, new j$.nio.file.attribute.k[0]);
        } else {
            InputStream inputStreamV = path.getFileSystem().i().v(path, new t[0]);
            try {
                a(inputStreamV, path2, new CopyOption[0]);
                inputStreamV.close();
            } catch (Throwable th2) {
                if (inputStreamV != null) {
                    try {
                        inputStreamV.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        if (z12) {
            try {
                ((j$.nio.file.attribute.d) path2.getFileSystem().i().h(path2, j$.nio.file.attribute.d.class, new LinkOption[0])).a(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
            } catch (Throwable th4) {
                try {
                    path2.getFileSystem().i().f(path2);
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        path.getFileSystem().i().f(path);
        return path2;
    }

    public static Path readSymbolicLink(Path path) {
        return b(path).z(path);
    }

    public static boolean isSameFile(Path path, Path path2) {
        return b(path).n(path, path2);
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        return (A) b(path).x(path, cls, linkOptionArr);
    }

    public static boolean isDirectory(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            b(path);
        }
        try {
            return readAttributes(path, BasicFileAttributes.class, linkOptionArr).isDirectory();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean exists(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            b(path);
        }
        try {
            int length = linkOptionArr.length;
            int i10 = 0;
            boolean z10 = true;
            while (i10 < length) {
                LinkOption linkOption = linkOptionArr[i10];
                if (linkOption != LinkOption.NOFOLLOW_LINKS) {
                    linkOption.getClass();
                    throw new AssertionError("Should not get here");
                }
                i10++;
                z10 = false;
            }
            if (z10) {
                b(path).a(path, new EnumC14766a[0]);
            } else {
                readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static Path walkFileTree(Path path, Set<FileVisitOption> set, int i10, FileVisitor<? super Path> fileVisitor) {
        FileVisitResult fileVisitResultVisitFile;
        o oVar = new o(set, i10);
        try {
            if (oVar.f138667e) {
                throw new IllegalStateException("Closed");
            }
            C14781m c14781mC = oVar.c(path, false);
            do {
                int[] iArr = p.f138668a;
                n nVar = (n) c14781mC.f138658b;
                BasicFileAttributes basicFileAttributes = (BasicFileAttributes) c14781mC.f138660d;
                Path path2 = (Path) c14781mC.f138659c;
                int i11 = iArr[nVar.ordinal()];
                if (i11 == 1) {
                    IOException iOException = (IOException) c14781mC.f138661e;
                    if (iOException == null) {
                        fileVisitResultVisitFile = fileVisitor.visitFile(path2, basicFileAttributes);
                    } else {
                        fileVisitor.b(path2, iOException);
                        throw null;
                    }
                } else if (i11 == 2) {
                    fileVisitResultVisitFile = fileVisitor.preVisitDirectory(path2, basicFileAttributes);
                    if ((fileVisitResultVisitFile == FileVisitResult.SKIP_SUBTREE || fileVisitResultVisitFile == FileVisitResult.SKIP_SIBLINGS) && !oVar.f138666d.isEmpty()) {
                        try {
                            ((C14780l) oVar.f138666d.pop()).f138654c.close();
                        } catch (IOException unused) {
                        }
                    }
                } else if (i11 == 3) {
                    fileVisitResultVisitFile = fileVisitor.a(path2, (IOException) c14781mC.f138661e);
                    if (fileVisitResultVisitFile == FileVisitResult.SKIP_SIBLINGS) {
                        fileVisitResultVisitFile = FileVisitResult.CONTINUE;
                    }
                } else {
                    throw new AssertionError("Should not get here");
                }
                Objects.requireNonNull(fileVisitResultVisitFile);
                if (fileVisitResultVisitFile != FileVisitResult.CONTINUE) {
                    if (fileVisitResultVisitFile == FileVisitResult.TERMINATE) {
                        break;
                    }
                    if (fileVisitResultVisitFile == FileVisitResult.SKIP_SIBLINGS && !oVar.f138666d.isEmpty()) {
                        ((C14780l) oVar.f138666d.peek()).f138656e = true;
                    }
                    c14781mC = oVar.b();
                } else {
                    c14781mC = oVar.b();
                }
            } while (c14781mC != null);
            oVar.close();
            return path;
        } catch (Throwable th2) {
            try {
                oVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, Path path, CopyOption... copyOptionArr) throws IOException {
        Objects.requireNonNull(inputStream);
        int length = copyOptionArr.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            CopyOption copyOption = copyOptionArr[i10];
            if (copyOption != StandardCopyOption.REPLACE_EXISTING) {
                if (copyOption == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(copyOption + " not supported");
            }
            i10++;
            z10 = true;
        }
        if (z10) {
            try {
                path.getFileSystem().i().g(path);
                e = null;
            } catch (SecurityException e10) {
                e = e10;
            }
        } else {
            e = null;
        }
        try {
            OutputStream outputStreamW = path.getFileSystem().i().w(path, E.CREATE_NEW, E.WRITE);
            try {
                if (inputStream instanceof InputStreamRetargetInterface) {
                    ((InputStreamRetargetInterface) inputStream).transferTo(outputStreamW);
                } else {
                    DesugarInputStream.transferTo(inputStream, outputStreamW);
                }
                if (outputStreamW != null) {
                    outputStreamW.close();
                }
            } catch (Throwable th2) {
                if (outputStreamW != null) {
                    try {
                        outputStreamW.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (FileAlreadyExistsException e11) {
            if (e == null) {
                throw e11;
            }
            throw e;
        }
    }
}
