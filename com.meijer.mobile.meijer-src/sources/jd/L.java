package jd;

import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC6646c;
import com.google.android.gms.common.internal.InterfaceC6654k;
import id.C14719b;
import java.util.Set;

/* loaded from: classes4.dex */
final class L implements AbstractC6646c.InterfaceC1269c, f0 {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f140266a;

    /* renamed from: b, reason: collision with root package name */
    private final C14979b f140267b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6654k f140268c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f140269d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f140270e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C14982e f140271f;

    public L(C14982e c14982e, a.f fVar, C14979b c14979b) {
        this.f140271f = c14982e;
        this.f140266a = fVar;
        this.f140267b = c14979b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        InterfaceC6654k interfaceC6654k;
        if (!this.f140270e || (interfaceC6654k = this.f140268c) == null) {
            return;
        }
        this.f140266a.getRemoteService(interfaceC6654k, this.f140269d);
    }

    @Override // jd.f0
    public final void a(InterfaceC6654k interfaceC6654k, Set set) {
        if (interfaceC6654k == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new C14719b(4));
        } else {
            this.f140268c = interfaceC6654k;
            this.f140269d = set;
            i();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.InterfaceC1269c
    public final void b(C14719b c14719b) {
        this.f140271f.f140325n.post(new K(this, c14719b));
    }

    @Override // jd.f0
    public final void c(C14719b c14719b) {
        H h10 = (H) this.f140271f.f140321j.get(this.f140267b);
        if (h10 != null) {
            h10.G(c14719b);
        }
    }

    @Override // jd.f0
    public final void d(int i10) {
        H h10 = (H) this.f140271f.f140321j.get(this.f140267b);
        if (h10 != null) {
            if (h10.f140257i) {
                h10.G(new C14719b(17));
            } else {
                h10.onConnectionSuspended(i10);
            }
        }
    }
}
