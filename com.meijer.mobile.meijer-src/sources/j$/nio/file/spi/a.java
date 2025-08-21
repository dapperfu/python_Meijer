package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.AbstractC14864h;
import j$.nio.file.C14860d;
import j$.nio.file.C14862f;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC14854a;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.C14855a;
import j$.nio.file.attribute.C14856b;
import j$.nio.file.attribute.C14857c;
import j$.nio.file.attribute.e;
import j$.nio.file.attribute.k;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.n;
import j$.nio.file.attribute.o;
import j$.nio.file.attribute.p;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.u;
import j$.nio.file.attribute.x;
import j$.nio.file.s;
import j$.nio.file.t;
import j$.nio.file.v;
import j$.nio.file.w;
import j$.nio.file.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.OpenOption;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final /* synthetic */ class a extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f139261c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FileSystemProvider f139262b;

    public /* synthetic */ a(FileSystemProvider fileSystemProvider) {
        this.f139262b = fileSystemProvider;
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void A(Path path, String str, Object obj, LinkOption[] linkOptionArr) throws IOException {
        this.f139262b.setAttribute(w.C(path), str, g.j(obj), g.u(linkOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void a(Path path, EnumC14854a[] enumC14854aArr) throws IOException {
        FileSystemProvider fileSystemProvider = this.f139262b;
        java.nio.file.Path pathC = w.C(path);
        AccessMode[] accessModeArr = null;
        if (enumC14854aArr != null) {
            int length = enumC14854aArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i10 = 0; i10 < length; i10++) {
                EnumC14854a enumC14854a = enumC14854aArr[i10];
                accessModeArr2[i10] = enumC14854a == null ? null : enumC14854a == EnumC14854a.READ ? AccessMode.READ : enumC14854a == EnumC14854a.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathC, accessModeArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.f139262b.copy(w.C(path), w.C(path2), g.t(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void c(Path path, k[] kVarArr) throws IOException {
        this.f139262b.createDirectory(w.C(path), g.w(kVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void d(Path path, Path path2) throws IOException {
        this.f139262b.createLink(w.C(path), w.C(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void e(Path path, Path path2, k[] kVarArr) throws IOException {
        this.f139262b.createSymbolicLink(w.C(path), w.C(path2), g.w(kVarArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.f139262b;
        if (obj instanceof a) {
            obj = ((a) obj).f139262b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void f(Path path) throws IOException {
        this.f139262b.delete(w.C(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean g(Path path) {
        return this.f139262b.deleteIfExists(w.C(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ o h(Path path, Class cls, LinkOption[] linkOptionArr) {
        FileAttributeView fileAttributeView = this.f139262b.getFileAttributeView(w.C(path), g.g(cls), g.u(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof n) {
            return ((n) fileAttributeView).f139222a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            return basicFileAttributeView instanceof C14857c ? ((C14857c) basicFileAttributeView).f139213a : basicFileAttributeView instanceof DosFileAttributeView ? new j$.nio.file.attribute.g((DosFileAttributeView) basicFileAttributeView) : basicFileAttributeView instanceof PosixFileAttributeView ? new u((PosixFileAttributeView) basicFileAttributeView) : new C14856b(basicFileAttributeView);
        }
        if (!(fileAttributeView instanceof FileOwnerAttributeView)) {
            return fileAttributeView instanceof UserDefinedFileAttributeView ? new x((UserDefinedFileAttributeView) fileAttributeView) : new m(fileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
        return fileOwnerAttributeView instanceof q ? ((q) fileOwnerAttributeView).f139224a : fileOwnerAttributeView instanceof AclFileAttributeView ? new C14855a((AclFileAttributeView) fileOwnerAttributeView) : fileOwnerAttributeView instanceof PosixFileAttributeView ? new u((PosixFileAttributeView) fileOwnerAttributeView) : new p(fileOwnerAttributeView);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139262b.hashCode();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ C14860d i(Path path) throws IOException {
        FileStore fileStore = this.f139262b.getFileStore(w.C(path));
        if (fileStore == null) {
            return null;
        }
        return new C14860d(fileStore);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ AbstractC14864h j(URI uri) {
        return C14862f.k(this.f139262b.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path k(URI uri) {
        return v.C(this.f139262b.getPath(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ String l() {
        return this.f139262b.getScheme();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean m(Path path) {
        return this.f139262b.isHidden(w.C(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean n(Path path, Path path2) {
        return this.f139262b.isSameFile(w.C(path), w.C(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.f139262b.move(w.C(path), w.C(path2), g.t(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, k[] kVarArr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.f139262b.newAsynchronousFileChannel(w.C(path), g.k(set), executorService, g.w(kVarArr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return new j$.nio.channels.a(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, k[] kVarArr) {
        return this.f139262b.newByteChannel(w.C(path), g.k(set), g.w(kVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileChannel s(Path path, Set set, k[] kVarArr) {
        return this.f139262b.newFileChannel(w.C(path), g.k(set), g.w(kVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ AbstractC14864h t(Path path, Map map) {
        return C14862f.k(this.f139262b.newFileSystem(w.C(path), (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ AbstractC14864h u(URI uri, Map map) {
        return C14862f.k(this.f139262b.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ InputStream v(Path path, t[] tVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.f139262b;
        java.nio.file.Path pathC = w.C(path);
        if (tVarArr == null) {
            openOptionArr = null;
        } else {
            int length = tVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i10 = 0; i10 < length; i10++) {
                openOptionArr2[i10] = s.a(tVarArr[i10]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathC, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ OutputStream w(Path path, t[] tVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.f139262b;
        java.nio.file.Path pathC = w.C(path);
        if (tVarArr == null) {
            openOptionArr = null;
        } else {
            int length = tVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i10 = 0; i10 < length; i10++) {
                openOptionArr2[i10] = s.a(tVarArr[i10]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathC, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ BasicFileAttributes x(Path path, Class cls, LinkOption[] linkOptionArr) {
        return e.a(this.f139262b.readAttributes(w.C(path), g.h(cls), g.u(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Map y(Path path, String str, LinkOption[] linkOptionArr) {
        return g.i(this.f139262b.readAttributes(w.C(path), str, g.u(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path z(Path path) {
        return v.C(this.f139262b.readSymbolicLink(w.C(path)));
    }

    @Override // j$.nio.file.spi.c
    public final DirectoryStream r(Path path, DirectoryStream.Filter filter) {
        return new y(this.f139262b.newDirectoryStream(w.C(path), new h(filter)));
    }
}
