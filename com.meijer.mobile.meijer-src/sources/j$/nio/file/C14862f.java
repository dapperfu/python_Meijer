package j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14862f extends AbstractC14864h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileSystem f139237a;

    public static /* synthetic */ AbstractC14864h k(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C14863g ? ((C14863g) fileSystem).f139238a : new C14862f(fileSystem);
    }

    @Override // j$.nio.file.AbstractC14864h
    public final /* synthetic */ Iterable a() {
        return this.f139237a.getFileStores();
    }

    @Override // j$.nio.file.AbstractC14864h
    public final /* synthetic */ Path b(String str, String[] strArr) {
        return v.C(this.f139237a.getPath(str, strArr));
    }

    @Override // j$.nio.file.AbstractC14864h
    public final /* synthetic */ D c(String str) {
        PathMatcher pathMatcher = this.f139237a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C ? ((C) pathMatcher).f139187a : new B(pathMatcher);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f139237a.close();
    }

    @Override // j$.nio.file.AbstractC14864h
    public final /* synthetic */ String e() {
        return this.f139237a.getSeparator();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.f139237a;
        if (obj instanceof C14862f) {
            obj = ((C14862f) obj).f139237a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.AbstractC14864h
    public final /* synthetic */ j$.nio.file.attribute.B f() {
        UserPrincipalLookupService userPrincipalLookupService = this.f139237a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return new j$.nio.file.attribute.B(userPrincipalLookupService);
    }

    @Override // j$.nio.file.AbstractC14864h
    public final /* synthetic */ boolean g() {
        return this.f139237a.isReadOnly();
    }

    @Override // j$.nio.file.AbstractC14864h
    public final /* synthetic */ M h() {
        return M.a(this.f139237a.newWatchService());
    }

    public final /* synthetic */ int hashCode() {
        return this.f139237a.hashCode();
    }

    @Override // j$.nio.file.AbstractC14864h
    public final /* synthetic */ j$.nio.file.spi.c i() {
        FileSystemProvider fileSystemProviderProvider = this.f139237a.provider();
        int i10 = j$.nio.file.spi.a.f139261c;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).f139264a : new j$.nio.file.spi.a(fileSystemProviderProvider);
    }

    @Override // j$.nio.file.AbstractC14864h
    public final /* synthetic */ boolean isOpen() {
        return this.f139237a.isOpen();
    }

    @Override // j$.nio.file.AbstractC14864h
    public final /* synthetic */ Set j() {
        return this.f139237a.supportedFileAttributeViews();
    }

    @Override // j$.nio.file.AbstractC14864h
    public final Iterable d() {
        return new z(this.f139237a.getRootDirectories());
    }

    public C14862f(FileSystem fileSystem) {
        this.f139237a = fileSystem;
    }
}
