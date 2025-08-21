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
public final /* synthetic */ class C14863g extends FileSystem {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC14864h f139238a;

    public /* synthetic */ C14863g(AbstractC14864h abstractC14864h) {
        this.f139238a = abstractC14864h;
    }

    public static /* synthetic */ FileSystem a(AbstractC14864h abstractC14864h) {
        if (abstractC14864h == null) {
            return null;
        }
        return abstractC14864h instanceof C14862f ? ((C14862f) abstractC14864h).f139237a : new C14863g(abstractC14864h);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f139238a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC14864h abstractC14864h = this.f139238a;
        if (obj instanceof C14863g) {
            obj = ((C14863g) obj).f139238a;
        }
        return abstractC14864h.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.f139238a.a();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return w.C(this.f139238a.b(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        D dC = this.f139238a.c(str);
        if (dC == null) {
            return null;
        }
        return dC instanceof B ? ((B) dC).f139186a : new C(dC);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.f139238a.e();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.nio.file.attribute.B bF = this.f139238a.f();
        int i10 = j$.nio.file.attribute.C.f139207a;
        if (bF == null) {
            return null;
        }
        return bF.f139206a;
    }

    public final /* synthetic */ int hashCode() {
        return this.f139238a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.f139238a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.f139238a.g();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        M mH = this.f139238a.h();
        if (mH == null) {
            return null;
        }
        return mH.f139203a;
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        j$.nio.file.spi.c cVarI = this.f139238a.i();
        int i10 = j$.nio.file.spi.b.f139263b;
        if (cVarI == null) {
            return null;
        }
        return cVarI instanceof j$.nio.file.spi.a ? ((j$.nio.file.spi.a) cVarI).f139262b : new j$.nio.file.spi.b(cVarI);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.f139238a.j();
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new z(this.f139238a.d());
    }
}
