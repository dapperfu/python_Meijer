package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GroupPrincipal f139226a;

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        GroupPrincipal groupPrincipal = this.f139226a;
        if (obj instanceof t) {
            obj = ((t) obj).f139226a;
        }
        return groupPrincipal.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f139226a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f139226a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f139226a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f139226a.toString();
    }
}
