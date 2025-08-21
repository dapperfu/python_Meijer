package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.AbstractC14861e;
import j$.nio.file.C14858b;
import j$.nio.file.C14860d;
import j$.nio.file.C14863g;
import j$.nio.file.EnumC14854a;
import j$.nio.file.attribute.C14855a;
import j$.nio.file.attribute.C14856b;
import j$.nio.file.attribute.C14857c;
import j$.nio.file.attribute.d;
import j$.nio.file.attribute.f;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.n;
import j$.nio.file.attribute.o;
import j$.nio.file.attribute.p;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.u;
import j$.nio.file.attribute.x;
import j$.nio.file.t;
import j$.nio.file.v;
import j$.nio.file.w;
import j$.nio.file.y;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final /* synthetic */ class b extends FileSystemProvider {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f139263b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f139264a;

    public /* synthetic */ b(c cVar) {
        this.f139264a = cVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        c cVar = this.f139264a;
        j$.nio.file.Path pathC = v.C(path);
        EnumC14854a[] enumC14854aArr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC14854a[] enumC14854aArr2 = new EnumC14854a[length];
            for (int i10 = 0; i10 < length; i10++) {
                AccessMode accessMode = accessModeArr[i10];
                enumC14854aArr2[i10] = accessMode == null ? null : accessMode == AccessMode.READ ? EnumC14854a.READ : accessMode == AccessMode.WRITE ? EnumC14854a.WRITE : EnumC14854a.EXECUTE;
            }
            enumC14854aArr = enumC14854aArr2;
        }
        cVar.a(pathC, enumC14854aArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.f139264a;
        j$.nio.file.Path pathC = v.C(path);
        j$.nio.file.Path pathC2 = v.C(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i10 = 0; i10 < length; i10++) {
                copyOptionArr3[i10] = C14858b.a(copyOptionArr[i10]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.b(pathC, pathC2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.f139264a.c(v.C(path), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.f139264a.d(v.C(path), v.C(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.f139264a.e(v.C(path), v.C(path2), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.f139264a.f(v.C(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.f139264a.g(v.C(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c cVar = this.f139264a;
        if (obj instanceof b) {
            obj = ((b) obj).f139264a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        o oVarH = this.f139264a.h(v.C(path), g.g(cls), g.q(linkOptionArr));
        if (oVarH == null) {
            return null;
        }
        if (oVarH instanceof m) {
            return ((m) oVarH).f139221a;
        }
        if (oVarH instanceof d) {
            d dVar = (d) oVarH;
            return dVar instanceof C14856b ? ((C14856b) dVar).f139212a : dVar instanceof j$.nio.file.attribute.g ? ((j$.nio.file.attribute.g) dVar).f139216a : dVar instanceof u ? ((u) dVar).f139227a : new C14857c(dVar);
        }
        if (!(oVarH instanceof r)) {
            return oVarH instanceof x ? ((x) oVarH).f139230a : new n(oVarH);
        }
        r rVar = (r) oVarH;
        return rVar instanceof p ? ((p) rVar).f139223a : rVar instanceof C14855a ? ((C14855a) rVar).f139211a : rVar instanceof u ? ((u) rVar).f139227a : new q(rVar);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        C14860d c14860dI = this.f139264a.i(v.C(path));
        int i10 = AbstractC14861e.f139236a;
        if (c14860dI == null) {
            return null;
        }
        return c14860dI.f139235a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C14863g.a(this.f139264a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return w.C(this.f139264a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.f139264a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.f139264a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.f139264a.m(v.C(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.f139264a.n(v.C(path), v.C(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.f139264a;
        j$.nio.file.Path pathC = v.C(path);
        j$.nio.file.Path pathC2 = v.C(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i10 = 0; i10 < length; i10++) {
                copyOptionArr3[i10] = C14858b.a(copyOptionArr[i10]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.o(pathC, pathC2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.a aVarP = this.f139264a.p(v.C(path), g.k(set), executorService, g.s(fileAttributeArr));
        int i10 = j$.nio.channels.b.f139184a;
        if (aVarP == null) {
            return null;
        }
        return aVarP.f139183a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f139264a.q(v.C(path), g.k(set), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f139264a.s(v.C(path), g.k(set), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C14863g.a(this.f139264a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C14863g.a(this.f139264a.t(v.C(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        t[] tVarArr;
        c cVar = this.f139264a;
        j$.nio.file.Path pathC = v.C(path);
        if (openOptionArr == null) {
            tVarArr = null;
        } else {
            int length = openOptionArr.length;
            t[] tVarArr2 = new t[length];
            for (int i10 = 0; i10 < length; i10++) {
                tVarArr2[i10] = j$.nio.file.r.a(openOptionArr[i10]);
            }
            tVarArr = tVarArr2;
        }
        return cVar.v(pathC, tVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        t[] tVarArr;
        c cVar = this.f139264a;
        j$.nio.file.Path pathC = v.C(path);
        if (openOptionArr == null) {
            tVarArr = null;
        } else {
            int length = openOptionArr.length;
            t[] tVarArr2 = new t[length];
            for (int i10 = 0; i10 < length; i10++) {
                tVarArr2[i10] = j$.nio.file.r.a(openOptionArr[i10]);
            }
            tVarArr = tVarArr2;
        }
        return cVar.w(pathC, tVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return f.a(this.f139264a.x(v.C(path), g.h(cls), g.q(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return g.i(this.f139264a.y(v.C(path), str, g.q(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return w.C(this.f139264a.z(v.C(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.f139264a.A(v.C(path), str, g.j(obj), g.q(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new y(this.f139264a.r(v.C(path), new h(filter)));
    }
}
