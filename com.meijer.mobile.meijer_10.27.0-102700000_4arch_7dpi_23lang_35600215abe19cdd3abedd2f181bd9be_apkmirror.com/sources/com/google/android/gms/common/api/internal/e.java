package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import hd.C14407h;

/* loaded from: classes4.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14407h f64775a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f64776b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f64777c;

    e(f fVar, C14407h c14407h, String str) {
        this.f64775a = c14407h;
        this.f64776b = str;
        this.f64777c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        f fVar = this.f64777c;
        if (fVar.f64779b > 0) {
            C14407h c14407h = this.f64775a;
            if (fVar.f64780c != null) {
                bundle = fVar.f64780c.getBundle(this.f64776b);
            } else {
                bundle = null;
            }
            c14407h.f(bundle);
        }
        if (this.f64777c.f64779b >= 2) {
            this.f64775a.j();
        }
        if (this.f64777c.f64779b >= 3) {
            this.f64775a.h();
        }
        if (this.f64777c.f64779b >= 4) {
            this.f64775a.k();
        }
        if (this.f64777c.f64779b >= 5) {
            this.f64775a.g();
        }
    }
}
