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
    private static final f0.c f54858h = new a();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f54862d;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, Fragment> f54859a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, J> f54860b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, g0> f54861c = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f54863e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f54864f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f54865g = false;

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
            if (this.f54859a.equals(j10.f54859a) && this.f54860b.equals(j10.f54860b) && this.f54861c.equals(j10.f54861c)) {
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
        this.f54863e = true;
    }

    private void p(String str, boolean z10) {
        J j10 = this.f54860b.get(str);
        if (j10 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(j10.f54860b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j10.o((String) it.next(), true);
                }
            }
            j10.onCleared();
            this.f54860b.remove(str);
        }
        g0 g0Var = this.f54861c.get(str);
        if (g0Var != null) {
            g0Var.a();
            this.f54861c.remove(str);
        }
    }

    static J s(g0 g0Var) {
        return (J) new f0(g0Var, f54858h).a(J.class);
    }

    void A(boolean z10) {
        this.f54865g = z10;
    }

    boolean B(Fragment fragment) {
        if (this.f54859a.containsKey(fragment.mWho)) {
            return this.f54862d ? this.f54863e : !this.f54864f;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f54859a.hashCode() * 31) + this.f54860b.hashCode()) * 31) + this.f54861c.hashCode();
    }

    void m(Fragment fragment) {
        if (this.f54865g) {
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f54859a.containsKey(fragment.mWho)) {
                return;
            }
            this.f54859a.put(fragment.mWho, fragment);
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    Fragment q(String str) {
        return this.f54859a.get(str);
    }

    J r(Fragment fragment) {
        J j10 = this.f54860b.get(fragment.mWho);
        if (j10 != null) {
            return j10;
        }
        J j11 = new J(this.f54862d);
        this.f54860b.put(fragment.mWho, j11);
        return j11;
    }

    Collection<Fragment> t() {
        return new ArrayList(this.f54859a.values());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f54859a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f54860b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f54861c.keySet().iterator();
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
        if (this.f54859a.isEmpty() && this.f54860b.isEmpty() && this.f54861c.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, J> entry : this.f54860b.entrySet()) {
            H hU = entry.getValue().u();
            if (hU != null) {
                map.put(entry.getKey(), hU);
            }
        }
        this.f54864f = true;
        if (this.f54859a.isEmpty() && map.isEmpty() && this.f54861c.isEmpty()) {
            return null;
        }
        return new H(new ArrayList(this.f54859a.values()), map, new HashMap(this.f54861c));
    }

    g0 v(Fragment fragment) {
        g0 g0Var = this.f54861c.get(fragment.mWho);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0();
        this.f54861c.put(fragment.mWho, g0Var2);
        return g0Var2;
    }

    boolean w() {
        return this.f54863e;
    }

    void x(Fragment fragment) {
        if (this.f54865g) {
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f54859a.remove(fragment.mWho) == null || !FragmentManager.isLoggingEnabled(2)) {
                return;
            }
            FS.log_v(FragmentManager.TAG, "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Deprecated
    void y(H h10) {
        this.f54859a.clear();
        this.f54860b.clear();
        this.f54861c.clear();
        if (h10 != null) {
            Collection<Fragment> collectionB = h10.b();
            if (collectionB != null) {
                for (Fragment fragment : collectionB) {
                    if (fragment != null) {
                        this.f54859a.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, H> mapA = h10.a();
            if (mapA != null) {
                for (Map.Entry<String, H> entry : mapA.entrySet()) {
                    J j10 = new J(this.f54862d);
                    j10.y(entry.getValue());
                    this.f54860b.put(entry.getKey(), j10);
                }
            }
            Map<String, g0> mapC = h10.c();
            if (mapC != null) {
                this.f54861c.putAll(mapC);
            }
        }
        this.f54864f = false;
    }

    J(boolean z10) {
        this.f54862d = z10;
    }
}
