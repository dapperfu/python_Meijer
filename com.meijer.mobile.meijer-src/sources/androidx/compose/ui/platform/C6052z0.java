package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import io.constructor.data.local.PreferencesHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import x4.C18086f;
import x4.InterfaceC18089i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u0011*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "view", "Lx4/i;", "owner", "Landroidx/compose/ui/platform/x0;", "b", "(Landroid/view/View;Lx4/i;)Landroidx/compose/ui/platform/x0;", "", PreferencesHelper.PREF_ID, "savedStateRegistryOwner", "c", "(Ljava/lang/String;Lx4/i;)Landroidx/compose/ui/platform/x0;", "", "value", "", "f", "(Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "", "", "h", "(Landroid/os/Bundle;)Ljava/util/Map;", "g", "(Ljava/util/Map;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "a", "[Ljava/lang/Class;", "AcceptableClasses", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6052z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<? extends Object>[] f52515a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.z0$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f52516f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C18086f f52517g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f52518h;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, C18086f c18086f, String str) {
            super(0);
            this.f52516f = z10;
            this.f52517g = c18086f;
            this.f52518h = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f52516f) {
                this.f52517g.e(this.f52518h);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.z0$b */
    static final class b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f52519f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(C6052z0.f(obj));
        }
    }

    public static final C6046x0 c(String str, InterfaceC18089i interfaceC18089i) {
        boolean z10;
        String str2 = L0.h.class.getSimpleName() + ':' + str;
        C18086f savedStateRegistry = interfaceC18089i.getSavedStateRegistry();
        Bundle bundleA = savedStateRegistry.a(str2);
        final L0.h hVarA = L0.j.a(bundleA != null ? h(bundleA) : null, b.f52519f);
        try {
            savedStateRegistry.c(str2, new C18086f.b() { // from class: androidx.compose.ui.platform.y0
                @Override // x4.C18086f.b
                public final Bundle saveState() {
                    return C6052z0.d(hVarA);
                }
            });
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new C6046x0(hVarA, new a(z10, savedStateRegistry, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof M0.l) {
            M0.l lVar = (M0.l) obj;
            if (lVar.e() != androidx.compose.runtime.o1.k() && lVar.e() != androidx.compose.runtime.o1.r() && lVar.e() != androidx.compose.runtime.o1.o()) {
                return false;
            }
            T value = lVar.getValue();
            if (value == 0) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof Function) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : f52515a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            Intrinsics.h(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    public static final C6046x0 b(View view, InterfaceC18089i interfaceC18089i) {
        String strValueOf;
        Object parent = view.getParent();
        Intrinsics.h(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(P0.k.f25222H);
        if (tag instanceof String) {
            strValueOf = (String) tag;
        } else {
            strValueOf = null;
        }
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, interfaceC18089i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(L0.h hVar) {
        return g(hVar.e());
    }
}
