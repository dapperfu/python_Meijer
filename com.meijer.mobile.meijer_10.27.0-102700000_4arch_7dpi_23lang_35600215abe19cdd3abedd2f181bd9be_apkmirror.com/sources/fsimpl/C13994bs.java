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
/* loaded from: classes14.dex */
class C13994bs extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final RustInterface f131886a;

    /* renamed from: b, reason: collision with root package name */
    private final aL f131887b;

    /* renamed from: d, reason: collision with root package name */
    private final Set f131889d = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c, reason: collision with root package name */
    private final Set f131888c = new HashSet();

    C13994bs(RustInterface rustInterface, aL aLVar) {
        this.f131886a = rustInterface;
        this.f131887b = aLVar;
    }

    private void a(Fragment fragment, short s10) {
        String name = fragment.getClass().getName();
        this.f131886a.a((short) 0, s10, name);
        if (Log.isLogcatLoggable(FS.LogLevel.DEBUG)) {
            Log.d("[fragment] onFragmentChangeEvent: " + name + " - " + cL.a(s10));
        }
    }

    private boolean a(Class cls) {
        return C14108fz.f132305o != null && C14108fz.f132305o.isAssignableFrom(cls);
    }

    public Collection getCreatedFragments() {
        return this.f131889d;
    }

    public Collection getResumedFragmentViewIds() {
        return this.f131888c;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        a(fragment, (short) 0);
        View view = fragment.getView();
        if (view != null) {
            this.f131888c.remove(Long.valueOf(gd.c(view)));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        a(fragment, (short) 1);
        View view = fragment.getView();
        if (view == null || a(fragment.getClass())) {
            return;
        }
        this.f131887b.a(view, "fragment", fragment.getClass().getSimpleName());
        this.f131888c.add(Long.valueOf(gd.c(view)));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (fragment instanceof FSAndroidXFragment) {
            this.f131889d.add(fragment);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        if (fragment instanceof FSAndroidXFragment) {
            this.f131889d.remove(fragment);
        }
    }
}
