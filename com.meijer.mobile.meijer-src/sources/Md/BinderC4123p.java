package Md;

import Md.C4110c;
import Nd.j0;

/* renamed from: Md.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC4123p extends j0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4110c.a f19799a;

    @Override // Nd.n0
    public final void zzb() {
        this.f19799a.onCancel();
    }

    @Override // Nd.n0
    public final void zzc() {
        this.f19799a.onFinish();
    }

    BinderC4123p(C4110c.a aVar) {
        this.f19799a = aVar;
    }
}
