package kotlin;

import android.annotation.SuppressLint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC14656B;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00040\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Li4/C;", "", "<init>", "()V", "Li4/B;", "T", "Ljava/lang/Class;", "navigatorClass", "d", "(Ljava/lang/Class;)Li4/B;", "", "name", "e", "(Ljava/lang/String;)Li4/B;", "Li4/p;", "navigator", "b", "(Li4/B;)Li4/B;", "c", "(Ljava/lang/String;Li4/B;)Li4/B;", "", "a", "Ljava/util/Map;", "_navigators", "", "f", "()Ljava/util/Map;", "navigators", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"TypeParameterUnusedInFormals"})
@SourceDebugExtension
/* renamed from: i4.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14657C {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, String> f136958c = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, AbstractC14656B<? extends C14675p>> _navigators = new LinkedHashMap();

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0001¢\u0006\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li4/C$a;", "", "<init>", "()V", "", "name", "", "b", "(Ljava/lang/String;)Z", "Ljava/lang/Class;", "Li4/B;", "navigatorClass", "a", "(Ljava/lang/Class;)Ljava/lang/String;", "", "annotationNames", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.C$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final String a(Class<? extends AbstractC14656B<?>> navigatorClass) {
            Intrinsics.j(navigatorClass, "navigatorClass");
            String strValue = (String) C14657C.f136958c.get(navigatorClass);
            if (strValue == null) {
                AbstractC14656B.b bVar = (AbstractC14656B.b) navigatorClass.getAnnotation(AbstractC14656B.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (!b(strValue)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
                C14657C.f136958c.put(navigatorClass, strValue);
            }
            Intrinsics.g(strValue);
            return strValue;
        }

        public final boolean b(String name) {
            return name != null && name.length() > 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC14656B<? extends C14675p> b(AbstractC14656B<? extends C14675p> navigator) {
        Intrinsics.j(navigator, "navigator");
        return c(INSTANCE.a(navigator.getClass()), navigator);
    }

    public AbstractC14656B<? extends C14675p> c(String name, AbstractC14656B<? extends C14675p> navigator) {
        Intrinsics.j(name, "name");
        Intrinsics.j(navigator, "navigator");
        if (!INSTANCE.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC14656B<? extends C14675p> abstractC14656B = this._navigators.get(name);
        if (Intrinsics.e(abstractC14656B, navigator)) {
            return navigator;
        }
        boolean z10 = false;
        if (abstractC14656B != null && abstractC14656B.getIsAttached()) {
            z10 = true;
        }
        if (z10) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + abstractC14656B).toString());
        }
        if (!navigator.getIsAttached()) {
            return this._navigators.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final <T extends AbstractC14656B<?>> T d(Class<T> navigatorClass) {
        Intrinsics.j(navigatorClass, "navigatorClass");
        return (T) e(INSTANCE.a(navigatorClass));
    }

    public <T extends AbstractC14656B<?>> T e(String name) {
        Intrinsics.j(name, "name");
        if (!INSTANCE.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC14656B<? extends C14675p> abstractC14656B = this._navigators.get(name);
        if (abstractC14656B != null) {
            return abstractC14656B;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final Map<String, AbstractC14656B<? extends C14675p>> f() {
        return MapsKt.A(this._navigators);
    }
}
