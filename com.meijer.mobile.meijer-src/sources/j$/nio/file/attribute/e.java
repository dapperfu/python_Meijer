package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements BasicFileAttributes {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes f139214a;

    public /* synthetic */ e(java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        this.f139214a = basicFileAttributes;
    }

    public static /* synthetic */ BasicFileAttributes a(java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        return basicFileAttributes instanceof f ? ((f) basicFileAttributes).f139215a : basicFileAttributes instanceof DosFileAttributes ? new h((DosFileAttributes) basicFileAttributes) : basicFileAttributes instanceof PosixFileAttributes ? new v((PosixFileAttributes) basicFileAttributes) : new e(basicFileAttributes);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return j$.desugar.sun.nio.fs.g.c(this.f139214a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.attribute.BasicFileAttributes basicFileAttributes = this.f139214a;
        if (obj instanceof e) {
            obj = ((e) obj).f139214a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f139214a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f139214a.hashCode();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f139214a.isDirectory();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f139214a.isOther();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f139214a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f139214a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return j$.desugar.sun.nio.fs.g.c(this.f139214a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return j$.desugar.sun.nio.fs.g.c(this.f139214a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f139214a.size();
    }
}
