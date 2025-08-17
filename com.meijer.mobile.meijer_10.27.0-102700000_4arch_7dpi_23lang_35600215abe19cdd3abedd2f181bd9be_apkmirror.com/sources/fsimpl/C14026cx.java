package fsimpl;

import android.view.View;
import android.widget.PopupMenu;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: fsimpl.cx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14026cx {

    /* renamed from: a, reason: collision with root package name */
    static final Field f132007a = fT.a(PopupMenu.class, "mPopup");

    /* renamed from: b, reason: collision with root package name */
    static final Field f132008b = fT.a(28, 29, C14108fz.f132300j, "mPopup");

    /* renamed from: c, reason: collision with root package name */
    static final Method f132009c = fT.a(28, 29, C14108fz.f132301k, "getListView", new Class[0]);

    public static Object a(PopupMenu popupMenu) {
        return fT.a(f132007a, popupMenu);
    }

    public static Object a(Object obj) {
        return fT.a(f132008b, obj);
    }

    public static View b(Object obj) {
        return (View) fT.a(f132009c, obj, new Object[0]);
    }
}
