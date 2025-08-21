package Rc;

import Oc.W0;
import android.content.Context;

/* renamed from: Rc.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class BinderC5213w extends Oc.G0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f32449a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5216z f32450b;

    BinderC5213w(C5216z c5216z, Context context) {
        this.f32449a = context;
        this.f32450b = c5216z;
    }

    @Override // Oc.H0
    public final void x1(W0 w02) {
        if (w02 == null) {
            return;
        }
        this.f32450b.i(this.f32449a, w02.f23347b, true, true);
    }
}
