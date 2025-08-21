package Fd;

import com.google.android.gms.common.internal.C6660q;

/* renamed from: Fd.w9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3556w9 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3400j0 f10355a;

    @Q0(zza = 1)
    public final AbstractC3400j0 a() {
        return this.f10355a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3556w9) {
            return C6660q.a(this.f10355a, ((C3556w9) obj).f10355a);
        }
        return false;
    }

    public final int hashCode() {
        return C6660q.b(this.f10355a);
    }

    /* synthetic */ C3556w9(C3534u9 c3534u9, C3545v9 c3545v9) {
        this.f10355a = c3534u9.f10336a;
    }
}
