package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes3.dex */
public final /* synthetic */ class C implements PathMatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f138598a;

    public /* synthetic */ C(D d10) {
        this.f138598a = d10;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        D d10 = this.f138598a;
        if (obj instanceof C) {
            obj = ((C) obj).f138598a;
        }
        return d10.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138598a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.f138598a.a(v.C(path));
    }
}
