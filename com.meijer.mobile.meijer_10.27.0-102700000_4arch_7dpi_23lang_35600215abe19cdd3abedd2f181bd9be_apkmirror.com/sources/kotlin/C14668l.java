package kotlin;

import androidx.view.c0;
import androidx.view.f0;
import androidx.view.g0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0014"}, d2 = {"Li4/l;", "Landroidx/lifecycle/c0;", "Li4/A;", "<init>", "()V", "", "backStackEntryId", "", "n", "(Ljava/lang/String;)V", "onCleared", "Landroidx/lifecycle/g0;", "a", "(Ljava/lang/String;)Landroidx/lifecycle/g0;", "toString", "()Ljava/lang/String;", "", "Ljava/util/Map;", "viewModelStores", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14668l extends c0 implements InterfaceC14652A {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final f0.c f137323c = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, g0> viewModelStores = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"i4/l$a", "Landroidx/lifecycle/f0$c;", "Landroidx/lifecycle/c0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c0;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.l$a */
    public static final class a implements f0.c {
        @Override // androidx.lifecycle.f0.c
        public <T extends c0> T create(Class<T> modelClass) {
            Intrinsics.j(modelClass, "modelClass");
            return new C14668l();
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li4/l$b;", "", "<init>", "()V", "Landroidx/lifecycle/g0;", "viewModelStore", "Li4/l;", "a", "(Landroidx/lifecycle/g0;)Li4/l;", "Landroidx/lifecycle/f0$c;", "FACTORY", "Landroidx/lifecycle/f0$c;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: i4.l$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C14668l a(g0 viewModelStore) {
            Intrinsics.j(viewModelStore, "viewModelStore");
            return (C14668l) new f0(viewModelStore, C14668l.f137323c, null, 4, null).a(C14668l.class);
        }
    }

    @Override // kotlin.InterfaceC14652A
    public g0 a(String backStackEntryId) {
        Intrinsics.j(backStackEntryId, "backStackEntryId");
        g0 g0Var = this.viewModelStores.get(backStackEntryId);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0();
        this.viewModelStores.put(backStackEntryId, g0Var2);
        return g0Var2;
    }

    public final void n(String backStackEntryId) {
        Intrinsics.j(backStackEntryId, "backStackEntryId");
        g0 g0VarRemove = this.viewModelStores.remove(backStackEntryId);
        if (g0VarRemove != null) {
            g0VarRemove.a();
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        Iterator<g0> it = this.viewModelStores.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.viewModelStores.clear();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.i(string, "sb.toString()");
        return string;
    }
}
