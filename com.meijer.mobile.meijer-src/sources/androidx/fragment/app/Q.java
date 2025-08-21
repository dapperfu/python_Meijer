package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.fullstory.FS;
import com.google.maps.android.BuildConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class Q {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Fragment> f55125a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, O> f55126b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, Bundle> f55127c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private J f55128d;

    ArrayList<String> A() {
        synchronized (this.f55125a) {
            try {
                if (this.f55125a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f55125a.size());
                Iterator<Fragment> it = this.f55125a.iterator();
                while (it.hasNext()) {
                    Fragment next = it.next();
                    arrayList.add(next.mWho);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "saveAllState: adding fragment (" + next.mWho + "): " + next);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void B(J j10) {
        this.f55128d = j10;
    }

    Bundle C(String str, Bundle bundle) {
        return bundle != null ? this.f55127c.put(str, bundle) : this.f55127c.remove(str);
    }

    void a(Fragment fragment) {
        if (this.f55125a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f55125a) {
            this.f55125a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f55126b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f55126b.get(str) != null;
    }

    void d(int i10) {
        for (O o10 : this.f55126b.values()) {
            if (o10 != null) {
                o10.t(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f55126b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o10 : this.f55126b.values()) {
                printWriter.print(str);
                if (o10 != null) {
                    Fragment fragmentK = o10.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(BuildConfig.TRAVIS);
                }
            }
        }
        int size = this.f55125a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f55125a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        O o10 = this.f55126b.get(str);
        if (o10 != null) {
            return o10.k();
        }
        return null;
    }

    Fragment g(int i10) {
        for (int size = this.f55125a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f55125a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (O o10 : this.f55126b.values()) {
            if (o10 != null) {
                Fragment fragmentK = o10.k();
                if (fragmentK.mFragmentId == i10) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f55125a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f55125a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (O o10 : this.f55126b.values()) {
            if (o10 != null) {
                Fragment fragmentK = o10.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (O o10 : this.f55126b.values()) {
            if (o10 != null && (fragmentFindFragmentByWho = o10.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f55125a.indexOf(fragment);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f55125a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f55125a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f55125a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    int k() {
        return this.f55126b.size();
    }

    List<O> l() {
        ArrayList arrayList = new ArrayList();
        for (O o10 : this.f55126b.values()) {
            if (o10 != null) {
                arrayList.add(o10);
            }
        }
        return arrayList;
    }

    List<Fragment> m() {
        ArrayList arrayList = new ArrayList();
        for (O o10 : this.f55126b.values()) {
            if (o10 != null) {
                arrayList.add(o10.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    HashMap<String, Bundle> n() {
        return this.f55127c;
    }

    O o(String str) {
        return this.f55126b.get(str);
    }

    List<Fragment> p() {
        ArrayList arrayList;
        if (this.f55125a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f55125a) {
            arrayList = new ArrayList(this.f55125a);
        }
        return arrayList;
    }

    J q() {
        return this.f55128d;
    }

    Bundle r(String str) {
        return this.f55127c.get(str);
    }

    void u() {
        Iterator<Fragment> it = this.f55125a.iterator();
        while (it.hasNext()) {
            O o10 = this.f55126b.get(it.next().mWho);
            if (o10 != null) {
                o10.m();
            }
        }
        for (O o11 : this.f55126b.values()) {
            if (o11 != null) {
                o11.m();
                Fragment fragmentK = o11.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    if (fragmentK.mBeingSaved && !this.f55127c.containsKey(fragmentK.mWho)) {
                        C(fragmentK.mWho, o11.r());
                    }
                    t(o11);
                }
            }
        }
    }

    void v(Fragment fragment) {
        synchronized (this.f55125a) {
            this.f55125a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void w() {
        this.f55126b.clear();
    }

    void x(List<String> list) {
        this.f55125a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    void y(HashMap<String, Bundle> map) {
        this.f55127c.clear();
        this.f55127c.putAll(map);
    }

    ArrayList<String> z() {
        ArrayList<String> arrayList = new ArrayList<>(this.f55126b.size());
        for (O o10 : this.f55126b.values()) {
            if (o10 != null) {
                Fragment fragmentK = o10.k();
                C(fragmentK.mWho, o10.r());
                arrayList.add(fragmentK.mWho);
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "Saved state of " + fragmentK + ": " + fragmentK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    Q() {
    }

    void s(O o10) {
        Fragment fragmentK = o10.k();
        if (!c(fragmentK.mWho)) {
            this.f55126b.put(fragmentK.mWho, o10);
            if (fragmentK.mRetainInstanceChangedWhileDetached) {
                if (fragmentK.mRetainInstance) {
                    this.f55128d.m(fragmentK);
                } else {
                    this.f55128d.x(fragmentK);
                }
                fragmentK.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Added fragment to active set " + fragmentK);
            }
        }
    }

    void t(O o10) {
        Fragment fragmentK = o10.k();
        if (fragmentK.mRetainInstance) {
            this.f55128d.x(fragmentK);
        }
        if (this.f55126b.get(fragmentK.mWho) == o10 && this.f55126b.put(fragmentK.mWho, null) != null && FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "Removed fragment from active set " + fragmentK);
        }
    }
}
