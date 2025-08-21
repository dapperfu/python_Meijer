package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;

/* renamed from: j$.nio.file.attribute.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14857c implements BasicFileAttributeView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f139213a;

    public /* synthetic */ C14857c(d dVar) {
        this.f139213a = dVar;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        d dVar = this.f139213a;
        if (obj instanceof C14857c) {
            obj = ((C14857c) obj).f139213a;
        }
        return dVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139213a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f139213a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return f.a(this.f139213a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(java.nio.file.attribute.FileTime fileTime, java.nio.file.attribute.FileTime fileTime2, java.nio.file.attribute.FileTime fileTime3) {
        this.f139213a.a(j$.desugar.sun.nio.fs.g.c(fileTime), j$.desugar.sun.nio.fs.g.c(fileTime2), j$.desugar.sun.nio.fs.g.c(fileTime3));
    }
}
