package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import jd.C14985h;

/* loaded from: classes4.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14985h f65615a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f65616b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f65617c;

    e(f fVar, C14985h c14985h, String str) {
        this.f65615a = c14985h;
        this.f65616b = str;
        this.f65617c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        f fVar = this.f65617c;
        if (fVar.f65619b > 0) {
            C14985h c14985h = this.f65615a;
            if (fVar.f65620c != null) {
                bundle = fVar.f65620c.getBundle(this.f65616b);
            } else {
                bundle = null;
            }
            c14985h.f(bundle);
        }
        if (this.f65617c.f65619b >= 2) {
            this.f65615a.j();
        }
        if (this.f65617c.f65619b >= 3) {
            this.f65615a.h();
        }
        if (this.f65617c.f65619b >= 4) {
            this.f65615a.k();
        }
        if (this.f65617c.f65619b >= 5) {
            this.f65615a.g();
        }
    }
}
