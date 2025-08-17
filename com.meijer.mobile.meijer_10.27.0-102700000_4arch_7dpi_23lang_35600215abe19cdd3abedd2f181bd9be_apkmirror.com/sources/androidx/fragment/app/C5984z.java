package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u0013J\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b \u0010\u0013J\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0013J\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b!\u0010\u0013J%\u0010#\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0018J\u001d\u0010$\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0013J\u001d\u0010%\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0013J\u001d\u0010&\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010*¨\u0006,"}, d2 = {"Landroidx/fragment/app/z;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "cb", "", "recursive", "", "o", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "p", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;)V", "Landroidx/fragment/app/Fragment;", "f", "onlyRecursive", "g", "(Landroidx/fragment/app/Fragment;Z)V", "b", "Landroid/os/Bundle;", "savedInstanceState", "h", "(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V", "c", "a", "Landroid/view/View;", "v", "m", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V", "k", "i", "l", "outState", "j", "n", "d", "e", "Landroidx/fragment/app/FragmentManager;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/z$a;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "lifecycleCallbacks", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5984z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FragmentManager fragmentManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<a> lifecycleCallbacks;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/z$a;", "", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "callback", "", "recursive", "<init>", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "a", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "()Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "b", "Z", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.z$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final FragmentManager.FragmentLifecycleCallbacks callback;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean recursive;

        public a(FragmentManager.FragmentLifecycleCallbacks callback, boolean z10) {
            Intrinsics.j(callback, "callback");
            this.callback = callback;
            this.recursive = z10;
        }

        /* renamed from: a, reason: from getter */
        public final FragmentManager.FragmentLifecycleCallbacks getCallback() {
            return this.callback;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public C5984z(FragmentManager fragmentManager) {
        Intrinsics.j(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    public final void a(Fragment f10, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().a(f10, savedInstanceState, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentActivityCreated(this.fragmentManager, f10, savedInstanceState);
            }
        }
    }

    public final void b(Fragment f10, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().b(f10, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentAttached(this.fragmentManager, f10, context);
            }
        }
    }

    public final void c(Fragment f10, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().c(f10, savedInstanceState, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentCreated(this.fragmentManager, f10, savedInstanceState);
            }
        }
    }

    public final void d(Fragment f10, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().d(f10, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentDestroyed(this.fragmentManager, f10);
            }
        }
    }

    public final void e(Fragment f10, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().e(f10, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentDetached(this.fragmentManager, f10);
            }
        }
    }

    public final void f(Fragment f10, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().f(f10, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentPaused(this.fragmentManager, f10);
            }
        }
    }

    public final void g(Fragment f10, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().g(f10, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentPreAttached(this.fragmentManager, f10, context);
            }
        }
    }

    public final void h(Fragment f10, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().h(f10, savedInstanceState, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentPreCreated(this.fragmentManager, f10, savedInstanceState);
            }
        }
    }

    public final void i(Fragment f10, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().i(f10, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentResumed(this.fragmentManager, f10);
            }
        }
    }

    public final void j(Fragment f10, Bundle outState, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Intrinsics.j(outState, "outState");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().j(f10, outState, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentSaveInstanceState(this.fragmentManager, f10, outState);
            }
        }
    }

    public final void k(Fragment f10, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().k(f10, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentStarted(this.fragmentManager, f10);
            }
        }
    }

    public final void l(Fragment f10, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().l(f10, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentStopped(this.fragmentManager, f10);
            }
        }
    }

    public final void m(Fragment f10, View v10, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Intrinsics.j(v10, "v");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().m(f10, v10, savedInstanceState, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentViewCreated(this.fragmentManager, f10, v10, savedInstanceState);
            }
        }
    }

    public final void n(Fragment f10, boolean onlyRecursive) {
        Intrinsics.j(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().n(f10, true);
        }
        Iterator<a> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentViewDestroyed(this.fragmentManager, f10);
            }
        }
    }

    public final void o(FragmentManager.FragmentLifecycleCallbacks cb2, boolean recursive) {
        Intrinsics.j(cb2, "cb");
        this.lifecycleCallbacks.add(new a(cb2, recursive));
    }

    public final void p(FragmentManager.FragmentLifecycleCallbacks cb2) {
        Intrinsics.j(cb2, "cb");
        synchronized (this.lifecycleCallbacks) {
            try {
                int size = this.lifecycleCallbacks.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (this.lifecycleCallbacks.get(i10).getCallback() == cb2) {
                        this.lifecycleCallbacks.remove(i10);
                        break;
                    }
                    i10++;
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
