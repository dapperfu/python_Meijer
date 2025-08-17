package j$.nio.file;

import java.nio.file.OpenOption;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OpenOption f138670a;

    public /* synthetic */ r(OpenOption openOption) {
        this.f138670a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.t, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.t, java.nio.file.LinkOption] */
    public static /* synthetic */ t a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof s) {
            return ((s) openOption).f138671a;
        }
        if (!(openOption instanceof LinkOption)) {
            return openOption instanceof E ? j$.desugar.sun.nio.fs.g.d((E) openOption) : new r(openOption);
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.f138670a;
        if (obj instanceof r) {
            obj = ((r) obj).f138670a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138670a.hashCode();
    }
}
