package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements UserPrincipal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f139232a;

    public /* synthetic */ z(A a10) {
        this.f139232a = a10;
    }

    public static /* synthetic */ UserPrincipal a(A a10) {
        if (a10 == null) {
            return null;
        }
        return a10 instanceof y ? ((y) a10).f139231a : a10 instanceof t ? ((t) a10).f139226a : new z(a10);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        A a10 = this.f139232a;
        if (obj instanceof z) {
            obj = ((z) obj).f139232a;
        }
        return a10.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f139232a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f139232a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f139232a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f139232a.toString();
    }
}
