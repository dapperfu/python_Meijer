package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class w implements java.nio.file.Path {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Path f138680a;

    public /* synthetic */ w(Path path) {
        this.f138680a = path;
    }

    public static /* synthetic */ java.nio.file.Path C(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof v ? ((v) path).f138679a : new w(path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.nio.file.Path path) {
        return this.f138680a.compareTo(j$.desugar.sun.nio.fs.g.f(path));
    }

    @Override // java.nio.file.Path
    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(java.nio.file.Path path) {
        return this.f138680a.compareTo(v.C(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f138680a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.nio.file.Path path) {
        return this.f138680a.z(v.C(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.f138680a;
        if (obj instanceof w) {
            obj = ((w) obj).f138680a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super java.nio.file.Path> consumer) {
        this.f138680a.forEach(consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getFileName() {
        return C(this.f138680a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return C14775g.a(this.f138680a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getName(int i10) {
        return C(this.f138680a.getName(i10));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.f138680a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getParent() {
        return C(this.f138680a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getRoot() {
        return C(this.f138680a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.f138680a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.f138680a.isAbsolute();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path normalize() {
        return C(this.f138680a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        L lX = this.f138680a.X(M.a(watchService), j$.desugar.sun.nio.fs.g.r(kindArr));
        if (lX == null) {
            return null;
        }
        return lX.f138612a;
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        K[] kArr;
        Path path = this.f138680a;
        M mA = M.a(watchService);
        J[] jArrR = j$.desugar.sun.nio.fs.g.r(kindArr);
        if (modifierArr == null) {
            kArr = null;
        } else {
            int length = modifierArr.length;
            kArr = new K[length];
            for (int i10 = 0; i10 < length; i10++) {
                WatchEvent.Modifier modifier = modifierArr[i10];
                kArr[i10] = modifier == null ? null : new K(modifier);
            }
        }
        L lP = path.p(mA, jArrR, kArr);
        if (lP == null) {
            return null;
        }
        return lP.f138612a;
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path relativize(java.nio.file.Path path) {
        return C(this.f138680a.J(v.C(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(String str) {
        return C(this.f138680a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(java.nio.file.Path path) {
        return C(this.f138680a.r(v.C(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(String str) {
        return C(this.f138680a.resolveSibling(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(java.nio.file.Path path) {
        return C(this.f138680a.B(v.C(path)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<java.nio.file.Path> spliterator() {
        return this.f138680a.spliterator();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f138680a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.nio.file.Path path) {
        return this.f138680a.w(v.C(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path subpath(int i10, int i11) {
        return C(this.f138680a.subpath(i10, i11));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toAbsolutePath() {
        return C(this.f138680a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.f138680a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toRealPath(java.nio.file.LinkOption[] linkOptionArr) {
        return C(this.f138680a.s(j$.desugar.sun.nio.fs.g.q(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.f138680a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.f138680a.toUri();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new A(this.f138680a.iterator());
    }
}
