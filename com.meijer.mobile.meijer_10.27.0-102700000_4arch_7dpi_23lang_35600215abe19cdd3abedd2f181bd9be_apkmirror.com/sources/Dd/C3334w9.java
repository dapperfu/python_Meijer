package Dd;

import com.google.android.gms.common.internal.C6535q;

/* renamed from: Dd.w9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3334w9 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3178j0 f6322a;

    @Q0(zza = 1)
    public final AbstractC3178j0 a() {
        return this.f6322a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3334w9) {
            return C6535q.a(this.f6322a, ((C3334w9) obj).f6322a);
        }
        return false;
    }

    public final int hashCode() {
        return C6535q.b(this.f6322a);
    }

    /* synthetic */ C3334w9(C3312u9 c3312u9, C3323v9 c3323v9) {
        this.f6322a = c3312u9.f6303a;
    }
}
