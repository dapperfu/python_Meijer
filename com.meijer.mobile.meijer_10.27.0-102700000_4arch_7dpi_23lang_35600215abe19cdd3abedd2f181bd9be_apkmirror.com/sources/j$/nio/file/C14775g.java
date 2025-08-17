package j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14775g extends FileSystem {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC14776h f138649a;

    public /* synthetic */ C14775g(AbstractC14776h abstractC14776h) {
        this.f138649a = abstractC14776h;
    }

    public static /* synthetic */ FileSystem a(AbstractC14776h abstractC14776h) {
        if (abstractC14776h == null) {
            return null;
        }
        return abstractC14776h instanceof C14774f ? ((C14774f) abstractC14776h).f138648a : new C14775g(abstractC14776h);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f138649a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC14776h abstractC14776h = this.f138649a;
        if (obj instanceof C14775g) {
            obj = ((C14775g) obj).f138649a;
        }
        return abstractC14776h.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.f138649a.a();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return w.C(this.f138649a.b(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        D dC = this.f138649a.c(str);
        if (dC == null) {
            return null;
        }
        return dC instanceof B ? ((B) dC).f138597a : new C(dC);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.f138649a.e();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.nio.file.attribute.B bF = this.f138649a.f();
        int i10 = j$.nio.file.attribute.C.f138618a;
        if (bF == null) {
            return null;
        }
        return bF.f138617a;
    }

    public final /* synthetic */ int hashCode() {
        return this.f138649a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.f138649a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.f138649a.g();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        M mH = this.f138649a.h();
        if (mH == null) {
            return null;
        }
        return mH.f138614a;
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        j$.nio.file.spi.c cVarI = this.f138649a.i();
        int i10 = j$.nio.file.spi.b.f138674b;
        if (cVarI == null) {
            return null;
        }
        return cVarI instanceof j$.nio.file.spi.a ? ((j$.nio.file.spi.a) cVarI).f138673b : new j$.nio.file.spi.b(cVarI);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.f138649a.j();
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new z(this.f138649a.d());
    }
}
