package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;

/* renamed from: j$.nio.file.attribute.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14769c implements BasicFileAttributeView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f138624a;

    public /* synthetic */ C14769c(d dVar) {
        this.f138624a = dVar;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        d dVar = this.f138624a;
        if (obj instanceof C14769c) {
            obj = ((C14769c) obj).f138624a;
        }
        return dVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138624a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f138624a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return f.a(this.f138624a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(java.nio.file.attribute.FileTime fileTime, java.nio.file.attribute.FileTime fileTime2, java.nio.file.attribute.FileTime fileTime3) {
        this.f138624a.a(j$.desugar.sun.nio.fs.g.c(fileTime), j$.desugar.sun.nio.fs.g.c(fileTime2), j$.desugar.sun.nio.fs.g.c(fileTime3));
    }
}
