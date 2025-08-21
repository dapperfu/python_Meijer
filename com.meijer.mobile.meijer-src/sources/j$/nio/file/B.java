package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes3.dex */
public final /* synthetic */ class B implements D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PathMatcher f139186a;

    public /* synthetic */ B(PathMatcher pathMatcher) {
        this.f139186a = pathMatcher;
    }

    @Override // j$.nio.file.D
    public final /* synthetic */ boolean a(Path path) {
        return this.f139186a.matches(w.C(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.f139186a;
        if (obj instanceof B) {
            obj = ((B) obj).f139186a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139186a.hashCode();
    }
}
