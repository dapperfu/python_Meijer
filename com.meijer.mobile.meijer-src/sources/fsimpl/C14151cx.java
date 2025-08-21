package fsimpl;

import android.view.View;
import android.widget.PopupMenu;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: fsimpl.cx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14151cx {

    /* renamed from: a, reason: collision with root package name */
    static final Field f133257a = fT.a(PopupMenu.class, "mPopup");

    /* renamed from: b, reason: collision with root package name */
    static final Field f133258b = fT.a(28, 29, C14233fz.f133550j, "mPopup");

    /* renamed from: c, reason: collision with root package name */
    static final Method f133259c = fT.a(28, 29, C14233fz.f133551k, "getListView", new Class[0]);

    public static Object a(PopupMenu popupMenu) {
        return fT.a(f133257a, popupMenu);
    }

    public static Object a(Object obj) {
        return fT.a(f133258b, obj);
    }

    public static View b(Object obj) {
        return (View) fT.a(f133259c, obj, new Object[0]);
    }
}
