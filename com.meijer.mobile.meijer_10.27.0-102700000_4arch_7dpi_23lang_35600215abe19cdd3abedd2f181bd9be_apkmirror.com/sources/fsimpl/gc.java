package fsimpl;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes14.dex */
public class gc {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f132317d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f132318e = true;

    /* renamed from: a, reason: collision with root package name */
    static final Method f132314a = fT.a(28, 30, ViewGroup.class, "buildOrderedChildList", new Class[0]);

    /* renamed from: b, reason: collision with root package name */
    static final Method f132315b = fT.a(28, 30, ViewGroup.class, "isChildrenDrawingOrderEnabled", new Class[0]);

    /* renamed from: c, reason: collision with root package name */
    static final Method f132316c = fT.a(28, 30, ViewGroup.class, "getChildDrawingOrder", Integer.TYPE, Integer.TYPE);

    public static int a(ViewGroup viewGroup, int i10, int i11) {
        if (C14103fu.f132287a) {
            C14103fu.a("The getChildDrawingOrder method should always be called from the UI thread", new Object[0]);
        }
        Method method = f132316c;
        if (method == null || !f132318e) {
            return i11;
        }
        try {
            return ((Integer) method.invoke(viewGroup, Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
        } catch (Throwable th2) {
            f132318e = false;
            return i11;
        }
    }

    public static List a(ViewGroup viewGroup) {
        Method method = f132314a;
        if (method == null || !f132317d) {
            return null;
        }
        if (C14103fu.f132287a) {
            C14103fu.a("The buildOrderedChildList method call should always be on the UI thread", new Object[0]);
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
            f132317d = false;
            return null;
        }
    }

    public static boolean b(ViewGroup viewGroup) {
        if (C14103fu.f132287a) {
            C14103fu.a("The isChildrenDrawingOrderEnabled method should always be called from the UI thread", new Object[0]);
        }
        Method method = f132315b;
        if (method == null || !f132318e) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(viewGroup, new Object[0])).booleanValue();
        } catch (Throwable th2) {
            f132318e = false;
            return false;
        }
    }
}
