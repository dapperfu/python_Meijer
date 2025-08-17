package hd;

import com.fullstory.FS;
import gd.C14243b;

/* loaded from: classes4.dex */
final class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14243b f134575a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f134576b;

    K(L l10, C14243b c14243b) {
        this.f134576b = l10;
        this.f134575a = c14243b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L l10 = this.f134576b;
        H h10 = (H) l10.f134582f.f134632j.get(l10.f134578b);
        if (h10 == null) {
            return;
        }
        if (!this.f134575a.K0()) {
            h10.F(this.f134575a, null);
            return;
        }
        this.f134576b.f134581e = true;
        if (this.f134576b.f134577a.requiresSignIn()) {
            this.f134576b.i();
            return;
        }
        try {
            L l11 = this.f134576b;
            l11.f134577a.getRemoteService(null, l11.f134577a.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e10) {
            FS.log_e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.f134576b.f134577a.disconnect("Failed to get service from broker.");
            h10.F(new C14243b(10), null);
        }
    }
}
