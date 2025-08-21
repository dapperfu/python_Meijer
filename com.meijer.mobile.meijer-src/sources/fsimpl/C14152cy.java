package fsimpl;

import android.view.View;
import android.widget.PopupMenu;
import com.fullstory.util.Log;
import com.google.maps.android.BuildConfig;

/* renamed from: fsimpl.cy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14152cy {

    /* renamed from: a, reason: collision with root package name */
    private final aL f133260a;

    public C14152cy(aL aLVar) {
        this.f133260a = aLVar;
    }

    private View a(PopupMenu popupMenu, String str, boolean z10) {
        Object objA = C14151cx.a(popupMenu);
        if (objA == null) {
            a(str, z10);
            return null;
        }
        Object objA2 = C14151cx.a(objA);
        if (objA2 == null) {
            b(str, z10);
            return null;
        }
        View viewB = C14151cx.b(objA2);
        if (viewB != null) {
            return viewB;
        }
        a(str, z10);
        return null;
    }

    private View a(Object obj, String str, boolean z10) {
        if (obj == null) {
            a((Class) null, str, z10);
            return null;
        }
        Class<?> cls = obj.getClass();
        if (PopupMenu.class.isAssignableFrom(cls)) {
            return a((PopupMenu) obj, str, z10);
        }
        if (C14233fz.f133552l != null && C14233fz.f133552l.isAssignableFrom(cls)) {
            return b(obj, str, z10);
        }
        a((Class) cls, str, z10);
        return null;
    }

    private static void a(Class cls, String str, boolean z10) {
        Log.e(String.format("Expected a PopupMenu but received %s when attempting to %s class %s. Supported classes are android.widget.PopupMenu and androidx.appcompat.widget.PopupMenu.", cls == null ? BuildConfig.TRAVIS : cls.getName(), z10 ? "add" : "remove", str));
    }

    private static void a(String str, boolean z10) {
        Log.e(String.format("Unknown issue encountered while trying to access PopupMenu view. Class %s will not be %s PopupMenu.", str, z10 ? "added to" : "removed from"));
    }

    private View b(Object obj, String str, boolean z10) {
        Object objA = C14150cw.a(obj);
        if (objA == null) {
            a(str, z10);
            return null;
        }
        Object objB = C14150cw.b(objA);
        if (objB == null) {
            b(str, z10);
            return null;
        }
        View viewC = C14150cw.c(objB);
        if (viewC != null) {
            return viewC;
        }
        a(str, z10);
        return null;
    }

    private static void b(String str, boolean z10) {
        Log.e(String.format("PopupMenu is not currently showing. Class %s will not be %s.", str, z10 ? "added" : "removed"));
    }

    public void a(Object obj, String str) {
        View viewA = a(obj, str, true);
        if (viewA != null) {
            this.f133260a.c(viewA, str);
        }
    }

    public void b(Object obj, String str) {
        View viewA = a(obj, str, false);
        if (viewA != null) {
            this.f133260a.d(viewA, str);
        }
    }
}
