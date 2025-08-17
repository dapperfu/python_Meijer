package hd;

import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC6521c;
import com.google.android.gms.common.internal.InterfaceC6529k;
import gd.C14243b;
import java.util.Set;

/* loaded from: classes4.dex */
final class L implements AbstractC6521c.InterfaceC1260c, f0 {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f134577a;

    /* renamed from: b, reason: collision with root package name */
    private final C14401b f134578b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6529k f134579c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f134580d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f134581e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C14404e f134582f;

    public L(C14404e c14404e, a.f fVar, C14401b c14401b) {
        this.f134582f = c14404e;
        this.f134577a = fVar;
        this.f134578b = c14401b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        InterfaceC6529k interfaceC6529k;
        if (!this.f134581e || (interfaceC6529k = this.f134579c) == null) {
            return;
        }
        this.f134577a.getRemoteService(interfaceC6529k, this.f134580d);
    }

    @Override // hd.f0
    public final void a(C14243b c14243b) {
        H h10 = (H) this.f134582f.f134632j.get(this.f134578b);
        if (h10 != null) {
            h10.G(c14243b);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.InterfaceC1260c
    public final void b(C14243b c14243b) {
        this.f134582f.f134636n.post(new K(this, c14243b));
    }

    @Override // hd.f0
    public final void c(InterfaceC6529k interfaceC6529k, Set set) {
        if (interfaceC6529k == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new C14243b(4));
        } else {
            this.f134579c = interfaceC6529k;
            this.f134580d = set;
            i();
        }
    }

    @Override // hd.f0
    public final void d(int i10) {
        H h10 = (H) this.f134582f.f134632j.get(this.f134578b);
        if (h10 != null) {
            if (h10.f134568i) {
                h10.G(new C14243b(17));
            } else {
                h10.onConnectionSuspended(i10);
            }
        }
    }
}
