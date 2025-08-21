package jd;

import com.google.android.gms.common.internal.C6660q;
import id.C14720c;

/* loaded from: classes4.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    private final C14979b f140262a;

    /* renamed from: b, reason: collision with root package name */
    private final C14720c f140263b;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof J)) {
            J j10 = (J) obj;
            if (C6660q.a(this.f140262a, j10.f140262a) && C6660q.a(this.f140263b, j10.f140263b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6660q.b(this.f140262a, this.f140263b);
    }

    /* synthetic */ J(C14979b c14979b, C14720c c14720c, I i10) {
        this.f140262a = c14979b;
        this.f140263b = c14720c;
    }

    public final String toString() {
        return C6660q.c(this).a("key", this.f140262a).a("feature", this.f140263b).toString();
    }
}
