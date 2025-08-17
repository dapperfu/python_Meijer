package L2;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import com.fullstory.FS;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003;\u0007/B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010\u0016J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\u0018J\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010\u0011J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J7\u0010-\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00062\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040*2\u000e\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0*H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104R\"\u0010:\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006<"}, d2 = {"LL2/b;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "LL2/b$c;", "b", "(Landroidx/fragment/app/Fragment;)LL2/b$c;", "", "previousFragmentId", "", "f", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "container", "g", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "expectedParentFragment", "", "containerId", "o", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "k", "(Landroidx/fragment/app/Fragment;)V", "h", "", "isVisibleToUser", "m", "(Landroidx/fragment/app/Fragment;Z)V", "violatingFragment", "targetFragment", "requestCode", "l", "j", "i", "n", "Landroidx/fragment/app/strictmode/Violation;", "violation", "e", "(Landroidx/fragment/app/strictmode/Violation;)V", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "q", "(LL2/b$c;Ljava/lang/Class;Ljava/lang/Class;)Z", "c", "(LL2/b$c;Landroidx/fragment/app/strictmode/Violation;)V", "Ljava/lang/Runnable;", "runnable", "p", "(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V", "LL2/b$c;", "getDefaultPolicy", "()LL2/b$c;", "setDefaultPolicy", "(LL2/b$c;)V", "defaultPolicy", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f17810a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static c defaultPolicy = c.f17823d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LL2/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"LL2/b$b;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0302b {
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fBC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R4\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"LL2/b$c;", "", "", "LL2/b$a;", "flags", "LL2/b$b;", "listener", "", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "allowedViolations", "<init>", "(Ljava/util/Set;LL2/b$b;Ljava/util/Map;)V", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "mAllowedViolations", "LL2/b$b;", "()LL2/b$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: d, reason: collision with root package name */
        @JvmField
        public static final c f17823d = new c(SetsKt.e(), null, MapsKt.k());

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Set<a> flags;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations;

        public final InterfaceC0302b b() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends a> flags, InterfaceC0302b interfaceC0302b, Map<String, ? extends Set<Class<? extends Violation>>> allowedViolations) {
            Intrinsics.j(flags, "flags");
            Intrinsics.j(allowedViolations, "allowedViolations");
            this.flags = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        public final Set<a> a() {
            return this.flags;
        }

        public final Map<String, Set<Class<? extends Violation>>> c() {
            return this.mAllowedViolations;
        }
    }

    private final void e(Violation violation) {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "StrictMode violation in " + violation.getFragment().getClass().getName(), violation);
        }
    }

    private final c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.i(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.getStrictModePolicy() != null) {
                    c strictModePolicy = parentFragmentManager.getStrictModePolicy();
                    Intrinsics.g(strictModePolicy);
                    return strictModePolicy;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return defaultPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, Violation violation) {
        Intrinsics.j(violation, "$violation");
        FS.log_e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void f(Fragment fragment, String previousFragmentId) {
        Intrinsics.j(fragment, "fragment");
        Intrinsics.j(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        b bVar = f17810a;
        bVar.e(fragmentReuseViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_REUSE) && bVar.q(cVarB, fragment.getClass(), fragmentReuseViolation.getClass())) {
            bVar.c(cVarB, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void g(Fragment fragment, ViewGroup container) {
        Intrinsics.j(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, container);
        b bVar = f17810a;
        bVar.e(fragmentTagUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && bVar.q(cVarB, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            bVar.c(cVarB, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void h(Fragment fragment) {
        Intrinsics.j(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        b bVar = f17810a;
        bVar.e(getRetainInstanceUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && bVar.q(cVarB, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            bVar.c(cVarB, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void i(Fragment fragment) {
        Intrinsics.j(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        b bVar = f17810a;
        bVar.e(getTargetFragmentRequestCodeUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(cVarB, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            bVar.c(cVarB, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void j(Fragment fragment) {
        Intrinsics.j(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        b bVar = f17810a;
        bVar.e(getTargetFragmentUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(cVarB, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            bVar.c(cVarB, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void k(Fragment fragment) {
        Intrinsics.j(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        b bVar = f17810a;
        bVar.e(setRetainInstanceUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && bVar.q(cVarB, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            bVar.c(cVarB, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void l(Fragment violatingFragment, Fragment targetFragment, int requestCode) {
        Intrinsics.j(violatingFragment, "violatingFragment");
        Intrinsics.j(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, requestCode);
        b bVar = f17810a;
        bVar.e(setTargetFragmentUsageViolation);
        c cVarB = bVar.b(violatingFragment);
        if (cVarB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(cVarB, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            bVar.c(cVarB, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void m(Fragment fragment, boolean isVisibleToUser) {
        Intrinsics.j(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, isVisibleToUser);
        b bVar = f17810a;
        bVar.e(setUserVisibleHintViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && bVar.q(cVarB, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            bVar.c(cVarB, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void n(Fragment fragment, ViewGroup container) {
        Intrinsics.j(fragment, "fragment");
        Intrinsics.j(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        b bVar = f17810a;
        bVar.e(wrongFragmentContainerViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && bVar.q(cVarB, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            bVar.c(cVarB, wrongFragmentContainerViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void o(Fragment fragment, Fragment expectedParentFragment, int containerId) {
        Intrinsics.j(fragment, "fragment");
        Intrinsics.j(expectedParentFragment, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, expectedParentFragment, containerId);
        b bVar = f17810a;
        bVar.e(wrongNestedHierarchyViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && bVar.q(cVarB, fragment.getClass(), wrongNestedHierarchyViolation.getClass())) {
            bVar.c(cVarB, wrongNestedHierarchyViolation);
        }
    }

    private b() {
    }

    private final void c(c policy, final Violation violation) {
        Fragment fragmentA = violation.getFragment();
        final String name = fragmentA.getClass().getName();
        if (policy.a().contains(a.PENALTY_LOG)) {
            FS.log_d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        policy.b();
        if (policy.a().contains(a.PENALTY_DEATH)) {
            p(fragmentA, new Runnable() { // from class: L2.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.d(name, violation);
                }
            });
        }
    }

    private final void p(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler handler = fragment.getParentFragmentManager().getHost().getHandler();
            if (Intrinsics.e(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                handler.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean q(c policy, Class<? extends Fragment> fragmentClass, Class<? extends Violation> violationClass) {
        Set<Class<? extends Violation>> set = policy.c().get(fragmentClass.getName());
        if (set == null) {
            return true;
        }
        if (!Intrinsics.e(violationClass.getSuperclass(), Violation.class) && CollectionsKt.h0(set, violationClass.getSuperclass())) {
            return false;
        }
        return !set.contains(violationClass);
    }
}
