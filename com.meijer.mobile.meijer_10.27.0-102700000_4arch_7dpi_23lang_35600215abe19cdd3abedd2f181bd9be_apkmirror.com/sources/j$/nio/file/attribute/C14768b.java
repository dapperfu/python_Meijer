package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* renamed from: j$.nio.file.attribute.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14768b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasicFileAttributeView f138623a;

    public /* synthetic */ C14768b(BasicFileAttributeView basicFileAttributeView) {
        this.f138623a = basicFileAttributeView;
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.f138623a.setTimes(j$.desugar.sun.nio.fs.g.e(fileTime), j$.desugar.sun.nio.fs.g.e(fileTime2), j$.desugar.sun.nio.fs.g.e(fileTime3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.f138623a;
        if (obj instanceof C14768b) {
            obj = ((C14768b) obj).f138623a;
        }
        return basicFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138623a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.f138623a.name();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return e.a(this.f138623a.readAttributes());
    }
}
