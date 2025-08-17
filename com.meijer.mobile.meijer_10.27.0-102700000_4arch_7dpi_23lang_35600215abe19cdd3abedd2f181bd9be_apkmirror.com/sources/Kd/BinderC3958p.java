package Kd;

import Kd.C3945c;
import Ld.j0;

/* renamed from: Kd.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC3958p extends j0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3945c.a f16440a;

    @Override // Ld.n0
    public final void zzb() {
        this.f16440a.onCancel();
    }

    @Override // Ld.n0
    public final void zzc() {
        this.f16440a.onFinish();
    }

    BinderC3958p(C3945c.a aVar) {
        this.f16440a = aVar;
    }
}
