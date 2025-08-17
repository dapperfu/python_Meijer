package j$.nio.file.attribute;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements java.nio.file.attribute.BasicFileAttributes {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasicFileAttributes f138626a;

    public /* synthetic */ f(BasicFileAttributes basicFileAttributes) {
        this.f138626a = basicFileAttributes;
    }

    public static /* synthetic */ java.nio.file.attribute.BasicFileAttributes a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        return basicFileAttributes instanceof e ? ((e) basicFileAttributes).f138625a : basicFileAttributes instanceof h ? ((h) basicFileAttributes).f138628a : basicFileAttributes instanceof v ? ((v) basicFileAttributes).f138639a : new f(basicFileAttributes);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime creationTime() {
        return j$.desugar.sun.nio.fs.g.e(this.f138626a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.f138626a;
        if (obj instanceof f) {
            obj = ((f) obj).f138626a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f138626a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f138626a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f138626a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f138626a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f138626a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f138626a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastAccessTime() {
        return j$.desugar.sun.nio.fs.g.e(this.f138626a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastModifiedTime() {
        return j$.desugar.sun.nio.fs.g.e(this.f138626a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f138626a.size();
    }
}
