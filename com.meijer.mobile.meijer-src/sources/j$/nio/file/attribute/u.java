package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements d, r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PosixFileAttributeView f139227a;

    public /* synthetic */ u(PosixFileAttributeView posixFileAttributeView) {
        this.f139227a = posixFileAttributeView;
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.f139227a.setTimes(j$.desugar.sun.nio.fs.g.e(fileTime), j$.desugar.sun.nio.fs.g.e(fileTime2), j$.desugar.sun.nio.fs.g.e(fileTime3));
    }

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ void b(A a10) throws IOException {
        this.f139227a.setOwner(z.a(a10));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.f139227a;
        if (obj instanceof u) {
            obj = ((u) obj).f139227a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ A getOwner() {
        return y.a(this.f139227a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f139227a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.f139227a.name();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return e.a(this.f139227a.readAttributes());
    }
}
