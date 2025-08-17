package kw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010#J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lkw/u;", "Lkw/l;", "<init>", "()V", "Lkw/B;", "dir", "", "throwOnFailure", "", "H", "(Lkw/B;Z)Ljava/util/List;", "", "K", "(Lkw/B;)V", "J", "path", "Lkw/k;", "w", "(Lkw/B;)Lkw/k;", "p", "(Lkw/B;)Ljava/util/List;", "file", "Lkw/j;", "z", "(Lkw/B;)Lkw/j;", "Lkw/J;", "D", "(Lkw/B;)Lkw/J;", "mustCreate", "Lkw/I;", "B", "(Lkw/B;Z)Lkw/I;", "mustExist", "b", "h", "(Lkw/B;Z)V", "source", "target", "c", "(Lkw/B;Lkw/B;)V", "l", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public class u extends AbstractC15335l {
    @Override // kw.AbstractC15335l
    public I B(B file, boolean mustCreate) throws IOException {
        Intrinsics.j(file, "file");
        if (mustCreate) {
            J(file);
        }
        return x.f(file.toFile(), false, 1, null);
    }

    @Override // kw.AbstractC15335l
    public J D(B file) {
        Intrinsics.j(file, "file");
        return w.j(file.toFile());
    }

    @Override // kw.AbstractC15335l
    public I b(B file, boolean mustExist) throws IOException {
        Intrinsics.j(file, "file");
        if (mustExist) {
            K(file);
        }
        return w.f(file.toFile(), true);
    }

    @Override // kw.AbstractC15335l
    public void c(B source, B target) throws IOException {
        Intrinsics.j(source, "source");
        Intrinsics.j(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // kw.AbstractC15335l
    public void h(B dir, boolean mustCreate) throws IOException {
        Intrinsics.j(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        C15334k c15334kW = w(dir);
        if (c15334kW == null || !c15334kW.getIsDirectory()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (mustCreate) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // kw.AbstractC15335l
    public void l(B path, boolean mustExist) throws IOException {
        Intrinsics.j(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (mustExist) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // kw.AbstractC15335l
    public List<B> p(B dir) throws IOException {
        Intrinsics.j(dir, "dir");
        List<B> listH = H(dir, true);
        Intrinsics.g(listH);
        return listH;
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // kw.AbstractC15335l
    public C15334k w(B path) {
        Intrinsics.j(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new C15334k(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // kw.AbstractC15335l
    public AbstractC15333j z(B file) {
        Intrinsics.j(file, "file");
        return new t(false, new RandomAccessFile(file.toFile(), "r"));
    }

    private final List<B> H(B dir, boolean throwOnFailure) throws IOException {
        File file = dir.toFile();
        String[] list = file.list();
        if (list == null) {
            if (throwOnFailure) {
                if (!file.exists()) {
                    throw new FileNotFoundException("no such file: " + dir);
                }
                throw new IOException("failed to list " + dir);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.g(str);
            arrayList.add(dir.u(str));
        }
        CollectionsKt.A(arrayList);
        return arrayList;
    }

    private final void J(B b10) throws IOException {
        if (!m(b10)) {
            return;
        }
        throw new IOException(b10 + " already exists.");
    }

    private final void K(B b10) throws IOException {
        if (m(b10)) {
            return;
        }
        throw new IOException(b10 + " doesn't exist.");
    }
}
