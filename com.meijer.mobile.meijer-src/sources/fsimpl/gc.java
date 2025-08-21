package fsimpl;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes15.dex */
public class gc {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f133567d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f133568e = true;

    /* renamed from: a, reason: collision with root package name */
    static final Method f133564a = fT.a(28, 30, ViewGroup.class, "buildOrderedChildList", new Class[0]);

    /* renamed from: b, reason: collision with root package name */
    static final Method f133565b = fT.a(28, 30, ViewGroup.class, "isChildrenDrawingOrderEnabled", new Class[0]);

    /* renamed from: c, reason: collision with root package name */
    static final Method f133566c = fT.a(28, 30, ViewGroup.class, "getChildDrawingOrder", Integer.TYPE, Integer.TYPE);

    public static int a(ViewGroup viewGroup, int i10, int i11) {
        if (C14228fu.f133537a) {
            C14228fu.a("The getChildDrawingOrder method should always be called from the UI thread", new Object[0]);
        }
        Method method = f133566c;
        if (method == null || !f133568e) {
            return i11;
        }
        try {
            return ((Integer) method.invoke(viewGroup, Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
        } catch (Throwable th2) {
            f133568e = false;
            return i11;
        }
    }

    public static List a(ViewGroup viewGroup) {
        Method method = f133564a;
        if (method == null || !f133567d) {
            return null;
        }
        if (C14228fu.f133537a) {
            C14228fu.a("The buildOrderedChildList method call should always be on the UI thread", new Object[0]);
        }
        try {
            Object objInvoke = method.invoke(viewGroup, new Object[0]);
            if (objInvoke instanceof List) {
                List list = (List) objInvoke;
                if (!list.isEmpty() && (list.get(0) instanceof View)) {
                    return list;
                }
                list.clear();
            }
            return null;
        } catch (Throwable th2) {
            f133567d = false;
            return null;
        }
    }

    public static boolean b(ViewGroup viewGroup) {
        if (C14228fu.f133537a) {
            C14228fu.a("The isChildrenDrawingOrderEnabled method should always be called from the UI thread", new Object[0]);
        }
        Method method = f133565b;
        if (method == null || !f133568e) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(viewGroup, new Object[0])).booleanValue();
        } catch (Throwable th2) {
            f133568e = false;
            return false;
        }
    }
}
