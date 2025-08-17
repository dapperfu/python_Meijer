package fsimpl;

import android.view.View;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import com.fullstory.instrumentation.FSOuterThis;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes14.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f131366a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f131367b;

    /* renamed from: c, reason: collision with root package name */
    private static final Class f131368c;

    static {
        Class clsA = fT.a("com.google.android.material.tabs.TabLayout");
        f131366a = clsA;
        f131367b = fT.a(clsA, "selectedListeners");
        f131368c = fT.a("com.google.android.material.tabs.TabLayout$TabView");
    }

    static boolean a(View view) {
        if (view.hasOnClickListeners() || b(view)) {
            return true;
        }
        ViewParent parent = view.getParent();
        return a(parent) || a(parent, view);
    }

    private static boolean a(ViewParent viewParent) {
        return (viewParent instanceof AdapterView) && ((AdapterView) viewParent).getOnItemClickListener() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(ViewParent viewParent, View view) {
        Class cls;
        Field field;
        Class cls2 = f131366a;
        if (cls2 == null || (cls = f131368c) == null || (field = f131367b) == null || !(view instanceof FSOuterThis) || !cls.isInstance(view)) {
            return false;
        }
        Object obj_fsGetOuterThis = ((FSOuterThis) view)._fsGetOuterThis();
        if (!cls2.isInstance(obj_fsGetOuterThis)) {
            return false;
        }
        try {
            Object obj = field.get(obj_fsGetOuterThis);
            if ((obj instanceof List ? (List) obj : null) == null) {
                return false;
            }
            return !r4.isEmpty();
        } catch (Throwable th2) {
            return false;
        }
    }

    public static boolean b(View view) {
        return (view instanceof CompoundButton) && AbstractC14113k.b((CompoundButton) view) != null;
    }
}
