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
    public final /* synthetic */ java.nio.file.Path f139268a;

    public /* synthetic */ v(java.nio.file.Path path) {
        this.f139268a = path;
    }

    public static /* synthetic */ Path C(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof w ? ((w) path).f139269a : new v(path);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path B(Path path) {
        return C(this.f139268a.resolveSibling(w.C(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path J(Path path) {
        return C(this.f139268a.relativize(w.C(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ L X(M m10, J[] jArr) {
        return L.a(this.f139268a.register(m10 == null ? null : m10.f139203a, j$.desugar.sun.nio.fs.g.v(jArr)));
    }

    @Override // j$.nio.file.Path, java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.f139268a.compareTo((java.nio.file.Path) j$.desugar.sun.nio.fs.g.f(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f139268a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.f139268a;
        if (obj instanceof v) {
            obj = ((v) obj).f139268a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super Path> consumer) {
        this.f139268a.forEach(consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return C(this.f139268a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ AbstractC14864h getFileSystem() {
        return C14862f.k(this.f139268a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i10) {
        return C(this.f139268a.getName(i10));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.f139268a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return C(this.f139268a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return C(this.f139268a.getRoot());
    }

    public final /* synthetic */ int hashCode() {
        return this.f139268a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.f139268a.isAbsolute();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return C(this.f139268a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ L p(M m10, J[] jArr, K[] kArr) {
        java.nio.file.Path path = this.f139268a;
        WatchEvent.Modifier[] modifierArr = null;
        WatchService watchService = m10 == null ? null : m10.f139203a;
        WatchEvent.Kind<?>[] kindArrV = j$.desugar.sun.nio.fs.g.v(jArr);
        if (kArr != null) {
            int length = kArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i10 = 0; i10 < length; i10++) {
                K k10 = kArr[i10];
                modifierArr2[i10] = k10 == null ? null : k10.f139200a;
            }
            modifierArr = modifierArr2;
        }
        return L.a(path.register(watchService, kindArrV, modifierArr));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path r(Path path) {
        return C(this.f139268a.resolve(w.C(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return C(this.f139268a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return C(this.f139268a.resolveSibling(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path s(LinkOption[] linkOptionArr) {
        return C(this.f139268a.toRealPath(j$.desugar.sun.nio.fs.g.u(linkOptionArr)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<Path> spliterator() {
        return this.f139268a.spliterator();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f139268a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i10, int i11) {
        return C(this.f139268a.subpath(i10, i11));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return C(this.f139268a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.f139268a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.f139268a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.f139268a.toUri();
    }

    @Override // j$.nio.file.Path
    /* renamed from: u */
    public final /* synthetic */ int compareTo(Path path) {
        return this.f139268a.compareTo(w.C(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean w(Path path) {
        return this.f139268a.startsWith(w.C(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean z(Path path) {
        return this.f139268a.endsWith(w.C(path));
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new A(this.f139268a.iterator());
    }
}
