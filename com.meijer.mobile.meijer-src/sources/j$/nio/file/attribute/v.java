package j$.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributes;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements BasicFileAttributes {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PosixFileAttributes f139228a;

    public /* synthetic */ v(PosixFileAttributes posixFileAttributes) {
        this.f139228a = posixFileAttributes;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return j$.desugar.sun.nio.fs.g.c(this.f139228a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.f139228a;
        if (obj instanceof v) {
            obj = ((v) obj).f139228a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f139228a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f139228a.hashCode();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f139228a.isDirectory();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f139228a.isOther();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f139228a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f139228a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return j$.desugar.sun.nio.fs.g.c(this.f139228a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return j$.desugar.sun.nio.fs.g.c(this.f139228a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f139228a.size();
    }
}
