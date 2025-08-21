package fsimpl;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.fullstory.FS;
import com.fullstory.instrumentation.frameworks.androidx.FSAndroidXFragment;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: fsimpl.bs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14119bs extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final RustInterface f133136a;

    /* renamed from: b, reason: collision with root package name */
    private final aL f133137b;

    /* renamed from: d, reason: collision with root package name */
    private final Set f133139d = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c, reason: collision with root package name */
    private final Set f133138c = new HashSet();

    C14119bs(RustInterface rustInterface, aL aLVar) {
        this.f133136a = rustInterface;
        this.f133137b = aLVar;
    }

    private void a(Fragment fragment, short s10) {
        String name = fragment.getClass().getName();
        this.f133136a.a((short) 0, s10, name);
        if (Log.isLogcatLoggable(FS.LogLevel.DEBUG)) {
            Log.d("[fragment] onFragmentChangeEvent: " + name + " - " + cL.a(s10));
        }
    }

    private boolean a(Class cls) {
        return C14233fz.f133555o != null && C14233fz.f133555o.isAssignableFrom(cls);
    }

    public Collection getCreatedFragments() {
        return this.f133139d;
    }

    public Collection getResumedFragmentViewIds() {
        return this.f133138c;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        a(fragment, (short) 0);
        View view = fragment.getView();
        if (view != null) {
            this.f133138c.remove(Long.valueOf(gd.c(view)));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        a(fragment, (short) 1);
        View view = fragment.getView();
        if (view == null || a(fragment.getClass())) {
            return;
        }
        this.f133137b.a(view, "fragment", fragment.getClass().getSimpleName());
        this.f133138c.add(Long.valueOf(gd.c(view)));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (fragment instanceof FSAndroidXFragment) {
            this.f133139d.add(fragment);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        if (fragment instanceof FSAndroidXFragment) {
            this.f133139d.remove(fragment);
        }
    }
}
