package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Path {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.nio.file.Path f138679a;

    public /* synthetic */ v(java.nio.file.Path path) {
        this.f138679a = path;
    }

    public static /* synthetic */ Path C(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof w ? ((w) path).f138680a : new v(path);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path B(Path path) {
        return C(this.f138679a.resolveSibling(w.C(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path J(Path path) {
        return C(this.f138679a.relativize(w.C(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ L X(M m10, J[] jArr) {
        return L.a(this.f138679a.register(m10 == null ? null : m10.f138614a, j$.desugar.sun.nio.fs.g.v(jArr)));
    }

    @Override // j$.nio.file.Path, java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.f138679a.compareTo((java.nio.file.Path) j$.desugar.sun.nio.fs.g.f(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f138679a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.f138679a;
        if (obj instanceof v) {
            obj = ((v) obj).f138679a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super Path> consumer) {
        this.f138679a.forEach(consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return C(this.f138679a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ AbstractC14776h getFileSystem() {
        return C14774f.k(this.f138679a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i10) {
        return C(this.f138679a.getName(i10));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.f138679a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return C(this.f138679a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return C(this.f138679a.getRoot());
    }

    public final /* synthetic */ int hashCode() {
        return this.f138679a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.f138679a.isAbsolute();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return C(this.f138679a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ L p(M m10, J[] jArr, K[] kArr) {
        java.nio.file.Path path = this.f138679a;
        WatchEvent.Modifier[] modifierArr = null;
        WatchService watchService = m10 == null ? null : m10.f138614a;
        WatchEvent.Kind<?>[] kindArrV = j$.desugar.sun.nio.fs.g.v(jArr);
        if (kArr != null) {
            int length = kArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i10 = 0; i10 < length; i10++) {
                K k10 = kArr[i10];
                modifierArr2[i10] = k10 == null ? null : k10.f138611a;
            }
            modifierArr = modifierArr2;
        }
        return L.a(path.register(watchService, kindArrV, modifierArr));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path r(Path path) {
        return C(this.f138679a.resolve(w.C(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return C(this.f138679a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return C(this.f138679a.resolveSibling(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path s(LinkOption[] linkOptionArr) {
        return C(this.f138679a.toRealPath(j$.desugar.sun.nio.fs.g.u(linkOptionArr)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<Path> spliterator() {
        return this.f138679a.spliterator();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f138679a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i10, int i11) {
        return C(this.f138679a.subpath(i10, i11));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return C(this.f138679a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.f138679a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.f138679a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.f138679a.toUri();
    }

    @Override // j$.nio.file.Path
    /* renamed from: u */
    public final /* synthetic */ int compareTo(Path path) {
        return this.f138679a.compareTo(w.C(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean w(Path path) {
        return this.f138679a.startsWith(w.C(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean z(Path path) {
        return this.f138679a.endsWith(w.C(path));
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new A(this.f138679a.iterator());
    }
}
