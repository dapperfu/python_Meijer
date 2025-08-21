package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes3.dex */
public final /* synthetic */ class y implements A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserPrincipal f139231a;

    public /* synthetic */ y(UserPrincipal userPrincipal) {
        this.f139231a = userPrincipal;
    }

    public static /* synthetic */ A a(UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        return userPrincipal instanceof z ? ((z) userPrincipal).f139232a : userPrincipal instanceof GroupPrincipal ? new t((GroupPrincipal) userPrincipal) : new y(userPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipal userPrincipal = this.f139231a;
        if (obj instanceof y) {
            obj = ((y) obj).f139231a;
        }
        return userPrincipal.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f139231a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f139231a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f139231a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f139231a.toString();
    }
}
