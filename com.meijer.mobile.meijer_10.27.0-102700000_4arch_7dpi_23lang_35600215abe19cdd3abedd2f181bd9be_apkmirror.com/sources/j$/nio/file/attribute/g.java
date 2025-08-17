package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DosFileAttributeView f138627a;

    public /* synthetic */ g(DosFileAttributeView dosFileAttributeView) {
        this.f138627a = dosFileAttributeView;
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.f138627a.setTimes(j$.desugar.sun.nio.fs.g.e(fileTime), j$.desugar.sun.nio.fs.g.e(fileTime2), j$.desugar.sun.nio.fs.g.e(fileTime3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.f138627a;
        if (obj instanceof g) {
            obj = ((g) obj).f138627a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138627a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.f138627a.name();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return e.a(this.f138627a.readAttributes());
    }
}
