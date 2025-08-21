package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes3.dex */
public final /* synthetic */ class C implements PathMatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f139187a;

    public /* synthetic */ C(D d10) {
        this.f139187a = d10;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        D d10 = this.f139187a;
        if (obj instanceof C) {
            obj = ((C) obj).f139187a;
        }
        return d10.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139187a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.f139187a.a(v.C(path));
    }
}
