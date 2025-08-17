package hd;

import Td.C5233k;
import Z.C5503a;
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
import com.google.android.gms.common.internal.C6535q;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import gd.C14243b;
import gd.C14244c;
import hd.C14409j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import ld.C15402e;

/* loaded from: classes4.dex */
public final class H implements e.a, e.b {

    /* renamed from: b, reason: collision with root package name */
    private final a.f f134561b;

    /* renamed from: c, reason: collision with root package name */
    private final C14401b f134562c;

    /* renamed from: d, reason: collision with root package name */
    private final C14422x f134563d;

    /* renamed from: g, reason: collision with root package name */
    private final int f134566g;

    /* renamed from: h, reason: collision with root package name */
    private final g0 f134567h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f134568i;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ C14404e f134572m;

    /* renamed from: a, reason: collision with root package name */
    private final Queue f134560a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f134564e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map f134565f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final List f134569j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private C14243b f134570k = null;

    /* renamed from: l, reason: collision with root package name */
    private int f134571l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    private final C14244c c(C14244c[] c14244cArr) {
        if (c14244cArr != null && c14244cArr.length != 0) {
            C14244c[] availableFeatures = this.f134561b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C14244c[0];
            }
            C5503a c5503a = new C5503a(availableFeatures.length);
            for (C14244c c14244c : availableFeatures) {
                c5503a.put(c14244c.getName(), Long.valueOf(c14244c.B()));
            }
            for (C14244c c14244c2 : c14244cArr) {
                Long l10 = (Long) c5503a.get(c14244c2.getName());
                if (l10 == null || l10.longValue() < c14244c2.B()) {
                    return c14244c2;
                }
            }
        }
        return null;
    }

    @ResultIgnorabilityUnspecified
    public final boolean b() {
        return o(true);
    }

    @Override // hd.InterfaceC14412m
    public final void onConnectionFailed(C14243b c14243b) {
        F(c14243b, null);
    }

    public H(C14404e c14404e, com.google.android.gms.common.api.d dVar) {
        this.f134572m = c14404e;
        a.f fVarZab = dVar.zab(c14404e.f134636n.getLooper(), this);
        this.f134561b = fVarZab;
        this.f134562c = dVar.getApiKey();
        this.f134563d = new C14422x();
        this.f134566g = dVar.zaa();
        if (fVarZab.requiresSignIn()) {
            this.f134567h = dVar.zac(c14404e.f134627e, c14404e.f134636n);
        } else {
            this.f134567h = null;
        }
    }

    static /* bridge */ /* synthetic */ void A(H h10, J j10) {
        C14244c[] c14244cArrG;
        if (h10.f134569j.remove(j10)) {
            h10.f134572m.f134636n.removeMessages(15, j10);
            h10.f134572m.f134636n.removeMessages(16, j10);
            C14244c c14244c = j10.f134574b;
            ArrayList arrayList = new ArrayList(h10.f134560a.size());
            for (o0 o0Var : h10.f134560a) {
                if ((o0Var instanceof P) && (c14244cArrG = ((P) o0Var).g(h10)) != null && com.google.android.gms.common.util.b.b(c14244cArrG, c14244c)) {
                    arrayList.add(o0Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                o0 o0Var2 = (o0) arrayList.get(i10);
                h10.f134560a.remove(o0Var2);
                o0Var2.b(new UnsupportedApiCallException(c14244c));
            }
        }
    }

    private final void d(C14243b c14243b) {
        Iterator it = this.f134564e.iterator();
        while (it.hasNext()) {
            ((p0) it.next()).b(this.f134562c, c14243b, C6535q.a(c14243b, C14243b.f133305e) ? this.f134561b.getEndpointPackageName() : null);
        }
        this.f134564e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Status status) {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z10) {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f134560a.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            if (!z10 || o0Var.f134688a == 2) {
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
        ArrayList arrayList = new ArrayList(this.f134560a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = (o0) arrayList.get(i10);
            if (!this.f134561b.isConnected()) {
                return;
            }
            if (m(o0Var)) {
                this.f134560a.remove(o0Var);
            }
        }
    }

    private final void j() {
        this.f134572m.f134636n.removeMessages(12, this.f134562c);
        C14401b c14401b = this.f134562c;
        C14404e c14404e = this.f134572m;
        c14404e.f134636n.sendMessageDelayed(c14404e.f134636n.obtainMessage(12, c14401b), this.f134572m.f134623a);
    }

    private final void k(o0 o0Var) {
        o0Var.d(this.f134563d, a());
        try {
            o0Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f134561b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l() {
        if (this.f134568i) {
            C14404e c14404e = this.f134572m;
            c14404e.f134636n.removeMessages(11, this.f134562c);
            C14404e c14404e2 = this.f134572m;
            c14404e2.f134636n.removeMessages(9, this.f134562c);
            this.f134568i = false;
        }
    }

    private final boolean m(o0 o0Var) throws Resources.NotFoundException {
        if (!(o0Var instanceof P)) {
            k(o0Var);
            return true;
        }
        P p10 = (P) o0Var;
        C14244c c14244cC = c(p10.g(this));
        if (c14244cC == null) {
            k(o0Var);
            return true;
        }
        FS.log_w("GoogleApiManager", this.f134561b.getClass().getName() + " could not execute call because it requires feature (" + c14244cC.getName() + ", " + c14244cC.B() + ").");
        if (!this.f134572m.f134637o || !p10.f(this)) {
            p10.b(new UnsupportedApiCallException(c14244cC));
            return true;
        }
        J j10 = new J(this.f134562c, c14244cC, null);
        int iIndexOf = this.f134569j.indexOf(j10);
        if (iIndexOf >= 0) {
            J j11 = (J) this.f134569j.get(iIndexOf);
            this.f134572m.f134636n.removeMessages(15, j11);
            C14404e c14404e = this.f134572m;
            c14404e.f134636n.sendMessageDelayed(Message.obtain(c14404e.f134636n, 15, j11), 5000L);
            return false;
        }
        this.f134569j.add(j10);
        C14404e c14404e2 = this.f134572m;
        c14404e2.f134636n.sendMessageDelayed(Message.obtain(c14404e2.f134636n, 15, j10), 5000L);
        C14404e c14404e3 = this.f134572m;
        c14404e3.f134636n.sendMessageDelayed(Message.obtain(c14404e3.f134636n, 16, j10), 120000L);
        C14243b c14243b = new C14243b(2, null);
        if (n(c14243b)) {
            return false;
        }
        this.f134572m.e(c14243b, this.f134566g);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(boolean z10) {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        if (!this.f134561b.isConnected() || !this.f134565f.isEmpty()) {
            return false;
        }
        if (!this.f134563d.g()) {
            this.f134561b.disconnect("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        j();
        return false;
    }

    static /* bridge */ /* synthetic */ void z(H h10, J j10) {
        if (h10.f134569j.contains(j10) && !h10.f134568i) {
            if (h10.f134561b.isConnected()) {
                h10.g();
            } else {
                h10.C();
            }
        }
    }

    public final void B() {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        this.f134570k = null;
    }

    public final void C() {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        if (this.f134561b.isConnected() || this.f134561b.isConnecting()) {
            return;
        }
        try {
            C14404e c14404e = this.f134572m;
            int iB = c14404e.f134629g.b(c14404e.f134627e, this.f134561b);
            if (iB == 0) {
                C14404e c14404e2 = this.f134572m;
                a.f fVar = this.f134561b;
                L l10 = new L(c14404e2, fVar, this.f134562c);
                if (fVar.requiresSignIn()) {
                    ((g0) com.google.android.gms.common.internal.r.l(this.f134567h)).F2(l10);
                }
                try {
                    this.f134561b.connect(l10);
                    return;
                } catch (SecurityException e10) {
                    F(new C14243b(10), e10);
                    return;
                }
            }
            C14243b c14243b = new C14243b(iB, null);
            FS.log_w("GoogleApiManager", "The service for " + this.f134561b.getClass().getName() + " is not available: " + c14243b.toString());
            F(c14243b, null);
        } catch (IllegalStateException e11) {
            F(new C14243b(10), e11);
        }
    }

    public final void D(o0 o0Var) {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        if (this.f134561b.isConnected()) {
            if (m(o0Var)) {
                j();
                return;
            } else {
                this.f134560a.add(o0Var);
                return;
            }
        }
        this.f134560a.add(o0Var);
        C14243b c14243b = this.f134570k;
        if (c14243b == null || !c14243b.q0()) {
            C();
        } else {
            F(this.f134570k, null);
        }
    }

    final void E() {
        this.f134571l++;
    }

    public final void F(C14243b c14243b, Exception exc) {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        g0 g0Var = this.f134567h;
        if (g0Var != null) {
            g0Var.N3();
        }
        B();
        this.f134572m.f134629g.c();
        d(c14243b);
        if ((this.f134561b instanceof C15402e) && c14243b.B() != 24) {
            this.f134572m.f134624b = true;
            C14404e c14404e = this.f134572m;
            c14404e.f134636n.sendMessageDelayed(c14404e.f134636n.obtainMessage(19), 300000L);
        }
        if (c14243b.B() == 4) {
            e(C14404e.f134620q);
            return;
        }
        if (this.f134560a.isEmpty()) {
            this.f134570k = c14243b;
            return;
        }
        if (exc != null) {
            com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
            f(null, exc, false);
            return;
        }
        if (!this.f134572m.f134637o) {
            e(C14404e.f(this.f134562c, c14243b));
            return;
        }
        f(C14404e.f(this.f134562c, c14243b), null, true);
        if (this.f134560a.isEmpty() || n(c14243b) || this.f134572m.e(c14243b, this.f134566g)) {
            return;
        }
        if (c14243b.B() == 18) {
            this.f134568i = true;
        }
        if (!this.f134568i) {
            e(C14404e.f(this.f134562c, c14243b));
            return;
        }
        C14404e c14404e2 = this.f134572m;
        c14404e2.f134636n.sendMessageDelayed(Message.obtain(c14404e2.f134636n, 9, this.f134562c), 5000L);
    }

    public final void G(C14243b c14243b) {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        a.f fVar = this.f134561b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c14243b));
        F(c14243b, null);
    }

    public final void H(p0 p0Var) {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        this.f134564e.add(p0Var);
    }

    public final void I() {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        if (this.f134568i) {
            C();
        }
    }

    public final void J() {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        e(C14404e.f134619p);
        this.f134563d.f();
        for (C14409j.a aVar : (C14409j.a[]) this.f134565f.keySet().toArray(new C14409j.a[0])) {
            D(new n0(aVar, new C5233k()));
        }
        d(new C14243b(4));
        if (this.f134561b.isConnected()) {
            this.f134561b.onUserSignOut(new G(this));
        }
    }

    public final void K() {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        if (this.f134568i) {
            l();
            C14404e c14404e = this.f134572m;
            e(c14404e.f134628f.g(c14404e.f134627e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f134561b.disconnect("Timing out connection while resuming.");
        }
    }

    final boolean N() {
        return this.f134561b.isConnected();
    }

    public final boolean a() {
        return this.f134561b.requiresSignIn();
    }

    @Override // hd.InterfaceC14403d
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f134572m.f134636n.getLooper()) {
            h();
        } else {
            this.f134572m.f134636n.post(new D(this));
        }
    }

    @Override // hd.InterfaceC14403d
    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f134572m.f134636n.getLooper()) {
            i(i10);
        } else {
            this.f134572m.f134636n.post(new E(this, i10));
        }
    }

    public final int p() {
        return this.f134566g;
    }

    final int q() {
        return this.f134571l;
    }

    public final C14243b r() {
        com.google.android.gms.common.internal.r.d(this.f134572m.f134636n);
        return this.f134570k;
    }

    public final a.f t() {
        return this.f134561b;
    }

    public final Map v() {
        return this.f134565f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        B();
        d(C14243b.f133305e);
        l();
        Iterator it = this.f134565f.values().iterator();
        while (it.hasNext()) {
            X x10 = (X) it.next();
            if (c(x10.f134603a.c()) != null) {
                it.remove();
            } else {
                try {
                    x10.f134603a.d(this.f134561b, new C5233k<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f134561b.disconnect("DeadObjectException thrown while calling register listener method.");
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
        this.f134568i = true;
        this.f134563d.e(i10, this.f134561b.getLastDisconnectMessage());
        C14401b c14401b = this.f134562c;
        C14404e c14404e = this.f134572m;
        c14404e.f134636n.sendMessageDelayed(Message.obtain(c14404e.f134636n, 9, c14401b), 5000L);
        C14401b c14401b2 = this.f134562c;
        C14404e c14404e2 = this.f134572m;
        c14404e2.f134636n.sendMessageDelayed(Message.obtain(c14404e2.f134636n, 11, c14401b2), 120000L);
        this.f134572m.f134629g.c();
        Iterator it = this.f134565f.values().iterator();
        while (it.hasNext()) {
            ((X) it.next()).f134605c.run();
        }
    }

    private final boolean n(C14243b c14243b) {
        synchronized (C14404e.f134621r) {
            try {
                C14404e c14404e = this.f134572m;
                if (c14404e.f134633k != null && c14404e.f134634l.contains(this.f134562c)) {
                    this.f134572m.f134633k.s(c14243b, this.f134566g);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
