package jd;

import com.fullstory.FS;
import id.C14719b;

/* loaded from: classes4.dex */
final class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14719b f140264a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f140265b;

    K(L l10, C14719b c14719b) {
        this.f140265b = l10;
        this.f140264a = c14719b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L l10 = this.f140265b;
        H h10 = (H) l10.f140271f.f140321j.get(l10.f140267b);
        if (h10 == null) {
            return;
        }
        if (!this.f140264a.I0()) {
            h10.F(this.f140264a, null);
            return;
        }
        this.f140265b.f140270e = true;
        if (this.f140265b.f140266a.requiresSignIn()) {
            this.f140265b.i();
            return;
        }
        try {
            L l11 = this.f140265b;
            l11.f140266a.getRemoteService(null, l11.f140266a.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e10) {
            FS.log_e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.f140265b.f140266a.disconnect("Failed to get service from broker.");
            h10.F(new C14719b(10), null);
        }
    }
}
