package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements BasicFileAttributes {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DosFileAttributes f139217a;

    public /* synthetic */ h(DosFileAttributes dosFileAttributes) {
        this.f139217a = dosFileAttributes;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return j$.desugar.sun.nio.fs.g.c(this.f139217a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributes dosFileAttributes = this.f139217a;
        if (obj instanceof h) {
            obj = ((h) obj).f139217a;
        }
        return dosFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f139217a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f139217a.hashCode();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f139217a.isDirectory();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f139217a.isOther();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f139217a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f139217a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return j$.desugar.sun.nio.fs.g.c(this.f139217a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return j$.desugar.sun.nio.fs.g.c(this.f139217a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f139217a.size();
    }
}
