package jd;

import Vd.C5517k;
import Z.C5603a;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.C6660q;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import id.C14719b;
import id.C14720c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import jd.C14987j;
import nd.C15936e;

/* loaded from: classes4.dex */
public final class H implements e.a, e.b {

    /* renamed from: b, reason: collision with root package name */
    private final a.f f140250b;

    /* renamed from: c, reason: collision with root package name */
    private final C14979b f140251c;

    /* renamed from: d, reason: collision with root package name */
    private final C15000x f140252d;

    /* renamed from: g, reason: collision with root package name */
    private final int f140255g;

    /* renamed from: h, reason: collision with root package name */
    private final g0 f140256h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f140257i;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ C14982e f140261m;

    /* renamed from: a, reason: collision with root package name */
    private final Queue f140249a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f140253e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map f140254f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final List f140258j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private C14719b f140259k = null;

    /* renamed from: l, reason: collision with root package name */
    private int f140260l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    private final C14720c c(C14720c[] c14720cArr) {
        if (c14720cArr != null && c14720cArr.length != 0) {
            C14720c[] availableFeatures = this.f140250b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C14720c[0];
            }
            C5603a c5603a = new C5603a(availableFeatures.length);
            for (C14720c c14720c : availableFeatures) {
                c5603a.put(c14720c.getName(), Long.valueOf(c14720c.B()));
            }
            for (C14720c c14720c2 : c14720cArr) {
                Long l10 = (Long) c5603a.get(c14720c2.getName());
                if (l10 == null || l10.longValue() < c14720c2.B()) {
                    return c14720c2;
                }
            }
        }
        return null;
    }

    @ResultIgnorabilityUnspecified
    public final boolean b() {
        return o(true);
    }

    @Override // jd.InterfaceC14990m
    public final void onConnectionFailed(C14719b c14719b) {
        F(c14719b, null);
    }

    public H(C14982e c14982e, com.google.android.gms.common.api.d dVar) {
        this.f140261m = c14982e;
        a.f fVarZab = dVar.zab(c14982e.f140325n.getLooper(), this);
        this.f140250b = fVarZab;
        this.f140251c = dVar.getApiKey();
        this.f140252d = new C15000x();
        this.f140255g = dVar.zaa();
        if (fVarZab.requiresSignIn()) {
            this.f140256h = dVar.zac(c14982e.f140316e, c14982e.f140325n);
        } else {
            this.f140256h = null;
        }
    }

    static /* bridge */ /* synthetic */ void A(H h10, J j10) {
        C14720c[] c14720cArrG;
        if (h10.f140258j.remove(j10)) {
            h10.f140261m.f140325n.removeMessages(15, j10);
            h10.f140261m.f140325n.removeMessages(16, j10);
            C14720c c14720c = j10.f140263b;
            ArrayList arrayList = new ArrayList(h10.f140249a.size());
            for (o0 o0Var : h10.f140249a) {
                if ((o0Var instanceof P) && (c14720cArrG = ((P) o0Var).g(h10)) != null && com.google.android.gms.common.util.b.b(c14720cArrG, c14720c)) {
                    arrayList.add(o0Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                o0 o0Var2 = (o0) arrayList.get(i10);
                h10.f140249a.remove(o0Var2);
                o0Var2.b(new UnsupportedApiCallException(c14720c));
            }
        }
    }

    private final void d(C14719b c14719b) {
        Iterator it = this.f140253e.iterator();
        while (it.hasNext()) {
            ((p0) it.next()).b(this.f140251c, c14719b, C6660q.a(c14719b, C14719b.f137521e) ? this.f140250b.getEndpointPackageName() : null);
        }
        this.f140253e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Status status) {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z10) {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f140249a.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            if (!z10 || o0Var.f140377a == 2) {
                if (status != null) {
                    o0Var.a(status);
                } else {
                    o0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.f140249a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = (o0) arrayList.get(i10);
            if (!this.f140250b.isConnected()) {
                return;
            }
            if (m(o0Var)) {
                this.f140249a.remove(o0Var);
            }
        }
    }

    private final void j() {
        this.f140261m.f140325n.removeMessages(12, this.f140251c);
        C14979b c14979b = this.f140251c;
        C14982e c14982e = this.f140261m;
        c14982e.f140325n.sendMessageDelayed(c14982e.f140325n.obtainMessage(12, c14979b), this.f140261m.f140312a);
    }

    private final void k(o0 o0Var) {
        o0Var.d(this.f140252d, a());
        try {
            o0Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f140250b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l() {
        if (this.f140257i) {
            C14982e c14982e = this.f140261m;
            c14982e.f140325n.removeMessages(11, this.f140251c);
            C14982e c14982e2 = this.f140261m;
            c14982e2.f140325n.removeMessages(9, this.f140251c);
            this.f140257i = false;
        }
    }

    private final boolean m(o0 o0Var) throws Resources.NotFoundException {
        if (!(o0Var instanceof P)) {
            k(o0Var);
            return true;
        }
        P p10 = (P) o0Var;
        C14720c c14720cC = c(p10.g(this));
        if (c14720cC == null) {
            k(o0Var);
            return true;
        }
        FS.log_w("GoogleApiManager", this.f140250b.getClass().getName() + " could not execute call because it requires feature (" + c14720cC.getName() + ", " + c14720cC.B() + ").");
        if (!this.f140261m.f140326o || !p10.f(this)) {
            p10.b(new UnsupportedApiCallException(c14720cC));
            return true;
        }
        J j10 = new J(this.f140251c, c14720cC, null);
        int iIndexOf = this.f140258j.indexOf(j10);
        if (iIndexOf >= 0) {
            J j11 = (J) this.f140258j.get(iIndexOf);
            this.f140261m.f140325n.removeMessages(15, j11);
            C14982e c14982e = this.f140261m;
            c14982e.f140325n.sendMessageDelayed(Message.obtain(c14982e.f140325n, 15, j11), 5000L);
            return false;
        }
        this.f140258j.add(j10);
        C14982e c14982e2 = this.f140261m;
        c14982e2.f140325n.sendMessageDelayed(Message.obtain(c14982e2.f140325n, 15, j10), 5000L);
        C14982e c14982e3 = this.f140261m;
        c14982e3.f140325n.sendMessageDelayed(Message.obtain(c14982e3.f140325n, 16, j10), 120000L);
        C14719b c14719b = new C14719b(2, null);
        if (n(c14719b)) {
            return false;
        }
        this.f140261m.e(c14719b, this.f140255g);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(boolean z10) {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        if (!this.f140250b.isConnected() || !this.f140254f.isEmpty()) {
            return false;
        }
        if (!this.f140252d.g()) {
            this.f140250b.disconnect("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        j();
        return false;
    }

    static /* bridge */ /* synthetic */ void z(H h10, J j10) {
        if (h10.f140258j.contains(j10) && !h10.f140257i) {
            if (h10.f140250b.isConnected()) {
                h10.g();
            } else {
                h10.C();
            }
        }
    }

    public final void B() {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        this.f140259k = null;
    }

    public final void C() {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        if (this.f140250b.isConnected() || this.f140250b.isConnecting()) {
            return;
        }
        try {
            C14982e c14982e = this.f140261m;
            int iB = c14982e.f140318g.b(c14982e.f140316e, this.f140250b);
            if (iB == 0) {
                C14982e c14982e2 = this.f140261m;
                a.f fVar = this.f140250b;
                L l10 = new L(c14982e2, fVar, this.f140251c);
                if (fVar.requiresSignIn()) {
                    ((g0) com.google.android.gms.common.internal.r.l(this.f140256h)).I2(l10);
                }
                try {
                    this.f140250b.connect(l10);
                    return;
                } catch (SecurityException e10) {
                    F(new C14719b(10), e10);
                    return;
                }
            }
            C14719b c14719b = new C14719b(iB, null);
            FS.log_w("GoogleApiManager", "The service for " + this.f140250b.getClass().getName() + " is not available: " + c14719b.toString());
            F(c14719b, null);
        } catch (IllegalStateException e11) {
            F(new C14719b(10), e11);
        }
    }

    public final void D(o0 o0Var) {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        if (this.f140250b.isConnected()) {
            if (m(o0Var)) {
                j();
                return;
            } else {
                this.f140249a.add(o0Var);
                return;
            }
        }
        this.f140249a.add(o0Var);
        C14719b c14719b = this.f140259k;
        if (c14719b == null || !c14719b.r0()) {
            C();
        } else {
            F(this.f140259k, null);
        }
    }

    final void E() {
        this.f140260l++;
    }

    public final void F(C14719b c14719b, Exception exc) {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        g0 g0Var = this.f140256h;
        if (g0Var != null) {
            g0Var.Z3();
        }
        B();
        this.f140261m.f140318g.c();
        d(c14719b);
        if ((this.f140250b instanceof C15936e) && c14719b.B() != 24) {
            this.f140261m.f140313b = true;
            C14982e c14982e = this.f140261m;
            c14982e.f140325n.sendMessageDelayed(c14982e.f140325n.obtainMessage(19), 300000L);
        }
        if (c14719b.B() == 4) {
            e(C14982e.f140309q);
            return;
        }
        if (this.f140249a.isEmpty()) {
            this.f140259k = c14719b;
            return;
        }
        if (exc != null) {
            com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
            f(null, exc, false);
            return;
        }
        if (!this.f140261m.f140326o) {
            e(C14982e.f(this.f140251c, c14719b));
            return;
        }
        f(C14982e.f(this.f140251c, c14719b), null, true);
        if (this.f140249a.isEmpty() || n(c14719b) || this.f140261m.e(c14719b, this.f140255g)) {
            return;
        }
        if (c14719b.B() == 18) {
            this.f140257i = true;
        }
        if (!this.f140257i) {
            e(C14982e.f(this.f140251c, c14719b));
            return;
        }
        C14982e c14982e2 = this.f140261m;
        c14982e2.f140325n.sendMessageDelayed(Message.obtain(c14982e2.f140325n, 9, this.f140251c), 5000L);
    }

    public final void G(C14719b c14719b) {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        a.f fVar = this.f140250b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c14719b));
        F(c14719b, null);
    }

    public final void H(p0 p0Var) {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        this.f140253e.add(p0Var);
    }

    public final void I() {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        if (this.f140257i) {
            C();
        }
    }

    public final void J() {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        e(C14982e.f140308p);
        this.f140252d.f();
        for (C14987j.a aVar : (C14987j.a[]) this.f140254f.keySet().toArray(new C14987j.a[0])) {
            D(new n0(aVar, new C5517k()));
        }
        d(new C14719b(4));
        if (this.f140250b.isConnected()) {
            this.f140250b.onUserSignOut(new G(this));
        }
    }

    public final void K() {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        if (this.f140257i) {
            l();
            C14982e c14982e = this.f140261m;
            e(c14982e.f140317f.g(c14982e.f140316e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f140250b.disconnect("Timing out connection while resuming.");
        }
    }

    final boolean N() {
        return this.f140250b.isConnected();
    }

    public final boolean a() {
        return this.f140250b.requiresSignIn();
    }

    @Override // jd.InterfaceC14981d
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f140261m.f140325n.getLooper()) {
            h();
        } else {
            this.f140261m.f140325n.post(new D(this));
        }
    }

    @Override // jd.InterfaceC14981d
    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f140261m.f140325n.getLooper()) {
            i(i10);
        } else {
            this.f140261m.f140325n.post(new E(this, i10));
        }
    }

    public final int p() {
        return this.f140255g;
    }

    final int q() {
        return this.f140260l;
    }

    public final C14719b r() {
        com.google.android.gms.common.internal.r.d(this.f140261m.f140325n);
        return this.f140259k;
    }

    public final a.f t() {
        return this.f140250b;
    }

    public final Map v() {
        return this.f140254f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        B();
        d(C14719b.f137521e);
        l();
        Iterator it = this.f140254f.values().iterator();
        while (it.hasNext()) {
            X x10 = (X) it.next();
            if (c(x10.f140292a.c()) != null) {
                it.remove();
            } else {
                try {
                    x10.f140292a.d(this.f140250b, new C5517k<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f140250b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i10) {
        B();
        this.f140257i = true;
        this.f140252d.e(i10, this.f140250b.getLastDisconnectMessage());
        C14979b c14979b = this.f140251c;
        C14982e c14982e = this.f140261m;
        c14982e.f140325n.sendMessageDelayed(Message.obtain(c14982e.f140325n, 9, c14979b), 5000L);
        C14979b c14979b2 = this.f140251c;
        C14982e c14982e2 = this.f140261m;
        c14982e2.f140325n.sendMessageDelayed(Message.obtain(c14982e2.f140325n, 11, c14979b2), 120000L);
        this.f140261m.f140318g.c();
        Iterator it = this.f140254f.values().iterator();
        while (it.hasNext()) {
            ((X) it.next()).f140294c.run();
        }
    }

    private final boolean n(C14719b c14719b) {
        synchronized (C14982e.f140310r) {
            try {
                C14982e c14982e = this.f140261m;
                if (c14982e.f140322k != null && c14982e.f140323l.contains(this.f140251c)) {
                    this.f140261m.f140322k.s(c14719b, this.f140255g);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
