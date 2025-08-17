package fsimpl;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: fsimpl.cw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14025cw {

    /* renamed from: a, reason: collision with root package name */
    private static final Field f132004a = fT.a(C14108fz.f132302l, "mPopup");

    /* renamed from: b, reason: collision with root package name */
    private static final Field f132005b = fT.a(C14108fz.f132303m, "mPopup");

    /* renamed from: c, reason: collision with root package name */
    private static final Method f132006c = fT.a(C14108fz.f132304n, "getListView", new Class[0]);

    public static Object a(Object obj) {
        return fT.a(f132004a, obj);
    }

    public static Object b(Object obj) {
        return fT.a(f132005b, obj);
    }

    public static View c(Object obj) {
        return (View) fT.a(f132006c, obj, new Object[0]);
    }
}
