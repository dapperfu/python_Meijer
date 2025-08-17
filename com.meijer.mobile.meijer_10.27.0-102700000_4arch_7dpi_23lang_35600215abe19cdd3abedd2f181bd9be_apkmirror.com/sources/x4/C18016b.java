package x4;

import android.os.Bundle;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC6027p;
import androidx.view.InterfaceC6030s;
import j2.C14835c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import x4.f;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Lx4/b;", "Landroidx/lifecycle/p;", "Lx4/i;", "owner", "<init>", "(Lx4/i;)V", "", "className", "", "a", "(Ljava/lang/String;)V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/l$a;", "event", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "Lx4/i;", "b", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18016b implements InterfaceC6027p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i owner;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"Lx4/b$b;", "Lx4/f$b;", "Lx4/f;", "registry", "<init>", "(Lx4/f;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "saveState", "()Landroid/os/Bundle;", "", "className", "", "a", "(Ljava/lang/String;)V", "", "Ljava/util/Set;", "classes", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: x4.b$b, reason: collision with other inner class name */
    public static final class C2711b implements f.b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Set<String> classes;

        public C2711b(f registry) {
            Intrinsics.j(registry, "registry");
            this.classes = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        public final void a(String className) {
            Intrinsics.j(className, "className");
            this.classes.add(className);
        }

        @Override // x4.f.b
        public Bundle saveState() {
            Pair[] pairArr;
            Map mapK = MapsKt.k();
            if (mapK.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapK.size());
                for (Map.Entry entry : mapK.entrySet()) {
                    arrayList.add(TuplesKt.a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            Bundle bundleB = C14835c.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            j.d(j.a(bundleB), "classes_to_restore", CollectionsKt.j1(this.classes));
            return bundleB;
        }
    }

    public C18016b(i owner) {
        Intrinsics.j(owner, "owner");
        this.owner = owner;
    }

    private final void a(String className) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(className, false, C18016b.class.getClassLoader()).asSubclass(f.a.class);
            Intrinsics.g(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Intrinsics.g(objNewInstance);
                    ((f.a) objNewInstance).a(this.owner);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + className, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + className + " wasn't found", e12);
        }
    }

    @Override // androidx.view.InterfaceC6027p
    public void onStateChanged(InterfaceC6030s source, AbstractC6023l.a event) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(source, "source");
        Intrinsics.j(event, "event");
        if (event != AbstractC6023l.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().d(this);
        Bundle bundleA = this.owner.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        List<String> listE = C18017c.e(C18017c.a(bundleA), "classes_to_restore");
        if (listE == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = listE.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
