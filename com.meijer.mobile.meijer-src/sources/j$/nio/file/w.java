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
    public final /* synthetic */ Path f139269a;

    public /* synthetic */ w(Path path) {
        this.f139269a = path;
    }

    public static /* synthetic */ java.nio.file.Path C(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof v ? ((v) path).f139268a : new w(path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.nio.file.Path path) {
        return this.f139269a.compareTo(j$.desugar.sun.nio.fs.g.f(path));
    }

    @Override // java.nio.file.Path
    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(java.nio.file.Path path) {
        return this.f139269a.compareTo(v.C(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f139269a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.nio.file.Path path) {
        return this.f139269a.z(v.C(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.f139269a;
        if (obj instanceof w) {
            obj = ((w) obj).f139269a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super java.nio.file.Path> consumer) {
        this.f139269a.forEach(consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getFileName() {
        return C(this.f139269a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return C14863g.a(this.f139269a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getName(int i10) {
        return C(this.f139269a.getName(i10));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.f139269a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getParent() {
        return C(this.f139269a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getRoot() {
        return C(this.f139269a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.f139269a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.f139269a.isAbsolute();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path normalize() {
        return C(this.f139269a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        L lX = this.f139269a.X(M.a(watchService), j$.desugar.sun.nio.fs.g.r(kindArr));
        if (lX == null) {
            return null;
        }
        return lX.f139201a;
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        K[] kArr;
        Path path = this.f139269a;
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
        return lP.f139201a;
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path relativize(java.nio.file.Path path) {
        return C(this.f139269a.J(v.C(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(String str) {
        return C(this.f139269a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(java.nio.file.Path path) {
        return C(this.f139269a.r(v.C(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(String str) {
        return C(this.f139269a.resolveSibling(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(java.nio.file.Path path) {
        return C(this.f139269a.B(v.C(path)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<java.nio.file.Path> spliterator() {
        return this.f139269a.spliterator();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f139269a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.nio.file.Path path) {
        return this.f139269a.w(v.C(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path subpath(int i10, int i11) {
        return C(this.f139269a.subpath(i10, i11));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toAbsolutePath() {
        return C(this.f139269a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.f139269a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toRealPath(java.nio.file.LinkOption[] linkOptionArr) {
        return C(this.f139269a.s(j$.desugar.sun.nio.fs.g.q(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.f139269a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.f139269a.toUri();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new A(this.f139269a.iterator());
    }
}
