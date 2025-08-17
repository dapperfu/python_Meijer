package hd;

import com.google.android.gms.common.internal.C6535q;
import gd.C14244c;

/* loaded from: classes4.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    private final C14401b f134573a;

    /* renamed from: b, reason: collision with root package name */
    private final C14244c f134574b;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof J)) {
            J j10 = (J) obj;
            if (C6535q.a(this.f134573a, j10.f134573a) && C6535q.a(this.f134574b, j10.f134574b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6535q.b(this.f134573a, this.f134574b);
    }

    /* synthetic */ J(C14401b c14401b, C14244c c14244c, I i10) {
        this.f134573a = c14401b;
        this.f134574b = c14244c;
    }

    public final String toString() {
        return C6535q.c(this).a("key", this.f134573a).a("feature", this.f134574b).toString();
    }
}
