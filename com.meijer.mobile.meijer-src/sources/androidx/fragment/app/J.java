package androidx.fragment.app;

import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class J extends androidx.view.c0 {

    /* renamed from: h, reason: collision with root package name */
    private static final f0.c f55082h = new a();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f55086d;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, Fragment> f55083a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, J> f55084b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, g0> f55085c = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f55087e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f55088f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f55089g = false;

    class a implements f0.c {
        @Override // androidx.lifecycle.f0.c
        public <T extends androidx.view.c0> T create(Class<T> cls) {
            return new J(true);
        }

        a() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J.class == obj.getClass()) {
            J j10 = (J) obj;
            if (this.f55083a.equals(j10.f55083a) && this.f55084b.equals(j10.f55084b) && this.f55085c.equals(j10.f55085c)) {
                return true;
            }
        }
        return false;
    }

    void n(Fragment fragment, boolean z10) {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "Clearing non-config state for " + fragment);
        }
        p(fragment.mWho, z10);
    }

    void o(String str, boolean z10) {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "Clearing non-config state for saved state of Fragment " + str);
        }
        p(str, z10);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "onCleared called for " + this);
        }
        this.f55087e = true;
    }

    private void p(String str, boolean z10) {
        J j10 = this.f55084b.get(str);
        if (j10 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(j10.f55084b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j10.o((String) it.next(), true);
                }
            }
            j10.onCleared();
            this.f55084b.remove(str);
        }
        g0 g0Var = this.f55085c.get(str);
        if (g0Var != null) {
            g0Var.a();
            this.f55085c.remove(str);
        }
    }

    static J s(g0 g0Var) {
        return (J) new f0(g0Var, f55082h).a(J.class);
    }

    void A(boolean z10) {
        this.f55089g = z10;
    }

    boolean B(Fragment fragment) {
        if (this.f55083a.containsKey(fragment.mWho)) {
            return this.f55086d ? this.f55087e : !this.f55088f;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f55083a.hashCode() * 31) + this.f55084b.hashCode()) * 31) + this.f55085c.hashCode();
    }

    void m(Fragment fragment) {
        if (this.f55089g) {
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f55083a.containsKey(fragment.mWho)) {
                return;
            }
            this.f55083a.put(fragment.mWho, fragment);
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    Fragment q(String str) {
        return this.f55083a.get(str);
    }

    J r(Fragment fragment) {
        J j10 = this.f55084b.get(fragment.mWho);
        if (j10 != null) {
            return j10;
        }
        J j11 = new J(this.f55086d);
        this.f55084b.put(fragment.mWho, j11);
        return j11;
    }

    Collection<Fragment> t() {
        return new ArrayList(this.f55083a.values());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f55083a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f55084b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f55085c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Deprecated
    H u() {
        if (this.f55083a.isEmpty() && this.f55084b.isEmpty() && this.f55085c.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, J> entry : this.f55084b.entrySet()) {
            H hU = entry.getValue().u();
            if (hU != null) {
                map.put(entry.getKey(), hU);
            }
        }
        this.f55088f = true;
        if (this.f55083a.isEmpty() && map.isEmpty() && this.f55085c.isEmpty()) {
            return null;
        }
        return new H(new ArrayList(this.f55083a.values()), map, new HashMap(this.f55085c));
    }

    g0 v(Fragment fragment) {
        g0 g0Var = this.f55085c.get(fragment.mWho);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0();
        this.f55085c.put(fragment.mWho, g0Var2);
        return g0Var2;
    }

    boolean w() {
        return this.f55087e;
    }

    void x(Fragment fragment) {
        if (this.f55089g) {
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f55083a.remove(fragment.mWho) == null || !FragmentManager.isLoggingEnabled(2)) {
                return;
            }
            FS.log_v(FragmentManager.TAG, "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Deprecated
    void y(H h10) {
        this.f55083a.clear();
        this.f55084b.clear();
        this.f55085c.clear();
        if (h10 != null) {
            Collection<Fragment> collectionB = h10.b();
            if (collectionB != null) {
                for (Fragment fragment : collectionB) {
                    if (fragment != null) {
                        this.f55083a.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, H> mapA = h10.a();
            if (mapA != null) {
                for (Map.Entry<String, H> entry : mapA.entrySet()) {
                    J j10 = new J(this.f55086d);
                    j10.y(entry.getValue());
                    this.f55084b.put(entry.getKey(), j10);
                }
            }
            Map<String, g0> mapC = h10.c();
            if (mapC != null) {
                this.f55085c.putAll(mapC);
            }
        }
        this.f55088f = false;
    }

    J(boolean z10) {
        this.f55086d = z10;
    }
}
