package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements UserPrincipal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f138643a;

    public /* synthetic */ z(A a10) {
        this.f138643a = a10;
    }

    public static /* synthetic */ UserPrincipal a(A a10) {
        if (a10 == null) {
            return null;
        }
        return a10 instanceof y ? ((y) a10).f138642a : a10 instanceof t ? ((t) a10).f138637a : new z(a10);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        A a10 = this.f138643a;
        if (obj instanceof z) {
            obj = ((z) obj).f138643a;
        }
        return a10.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f138643a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f138643a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f138643a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f138643a.toString();
    }
}
