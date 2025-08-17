package j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14774f extends AbstractC14776h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileSystem f138648a;

    public static /* synthetic */ AbstractC14776h k(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C14775g ? ((C14775g) fileSystem).f138649a : new C14774f(fileSystem);
    }

    @Override // j$.nio.file.AbstractC14776h
    public final /* synthetic */ Iterable a() {
        return this.f138648a.getFileStores();
    }

    @Override // j$.nio.file.AbstractC14776h
    public final /* synthetic */ Path b(String str, String[] strArr) {
        return v.C(this.f138648a.getPath(str, strArr));
    }

    @Override // j$.nio.file.AbstractC14776h
    public final /* synthetic */ D c(String str) {
        PathMatcher pathMatcher = this.f138648a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C ? ((C) pathMatcher).f138598a : new B(pathMatcher);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f138648a.close();
    }

    @Override // j$.nio.file.AbstractC14776h
    public final /* synthetic */ String e() {
        return this.f138648a.getSeparator();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.f138648a;
        if (obj instanceof C14774f) {
            obj = ((C14774f) obj).f138648a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.AbstractC14776h
    public final /* synthetic */ j$.nio.file.attribute.B f() {
        UserPrincipalLookupService userPrincipalLookupService = this.f138648a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return new j$.nio.file.attribute.B(userPrincipalLookupService);
    }

    @Override // j$.nio.file.AbstractC14776h
    public final /* synthetic */ boolean g() {
        return this.f138648a.isReadOnly();
    }

    @Override // j$.nio.file.AbstractC14776h
    public final /* synthetic */ M h() {
        return M.a(this.f138648a.newWatchService());
    }

    public final /* synthetic */ int hashCode() {
        return this.f138648a.hashCode();
    }

    @Override // j$.nio.file.AbstractC14776h
    public final /* synthetic */ j$.nio.file.spi.c i() {
        FileSystemProvider fileSystemProviderProvider = this.f138648a.provider();
        int i10 = j$.nio.file.spi.a.f138672c;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).f138675a : new j$.nio.file.spi.a(fileSystemProviderProvider);
    }

    @Override // j$.nio.file.AbstractC14776h
    public final /* synthetic */ boolean isOpen() {
        return this.f138648a.isOpen();
    }

    @Override // j$.nio.file.AbstractC14776h
    public final /* synthetic */ Set j() {
        return this.f138648a.supportedFileAttributeViews();
    }

    @Override // j$.nio.file.AbstractC14776h
    public final Iterable d() {
        return new z(this.f138648a.getRootDirectories());
    }

    public C14774f(FileSystem fileSystem) {
        this.f138648a = fileSystem;
    }
}
