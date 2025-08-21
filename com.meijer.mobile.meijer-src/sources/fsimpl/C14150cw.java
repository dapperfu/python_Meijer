package fsimpl;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: fsimpl.cw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14150cw {

    /* renamed from: a, reason: collision with root package name */
    private static final Field f133254a = fT.a(C14233fz.f133552l, "mPopup");

    /* renamed from: b, reason: collision with root package name */
    private static final Field f133255b = fT.a(C14233fz.f133553m, "mPopup");

    /* renamed from: c, reason: collision with root package name */
    private static final Method f133256c = fT.a(C14233fz.f133554n, "getListView", new Class[0]);

    public static Object a(Object obj) {
        return fT.a(f133254a, obj);
    }

    public static Object b(Object obj) {
        return fT.a(f133255b, obj);
    }

    public static View c(Object obj) {
        return (View) fT.a(f133256c, obj, new Object[0]);
    }
}
