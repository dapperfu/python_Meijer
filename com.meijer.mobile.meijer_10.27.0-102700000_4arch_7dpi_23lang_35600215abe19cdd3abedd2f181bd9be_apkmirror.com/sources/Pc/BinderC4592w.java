package Pc;

import Mc.W0;
import android.content.Context;

/* renamed from: Pc.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class BinderC4592w extends Mc.G0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f25235a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4595z f25236b;

    BinderC4592w(C4595z c4595z, Context context) {
        this.f25235a = context;
        this.f25236b = c4595z;
    }

    @Override // Mc.H0
    public final void P7(W0 w02) {
        if (w02 == null) {
            return;
        }
        this.f25236b.i(this.f25235a, w02.f19160b, true, true);
    }
}
