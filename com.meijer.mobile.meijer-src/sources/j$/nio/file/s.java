package j$.nio.file;

import java.nio.file.OpenOption;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements OpenOption {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f139260a;

    public /* synthetic */ s(t tVar) {
        this.f139260a = tVar;
    }

    public static /* synthetic */ OpenOption a(t tVar) {
        if (tVar == null) {
            return null;
        }
        if (tVar instanceof r) {
            return ((r) tVar).f139259a;
        }
        if (!(tVar instanceof LinkOption)) {
            return tVar instanceof E ? j$.desugar.sun.nio.fs.g.d((E) tVar) : new s(tVar);
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        t tVar = this.f139260a;
        if (obj instanceof s) {
            obj = ((s) obj).f139260a;
        }
        return tVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139260a.hashCode();
    }
}
