package fsimpl;

import android.content.Context;
import android.view.View;
import com.fullstory.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes14.dex */
public class bQ {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f131772a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f131773b = false;

    /* renamed from: c, reason: collision with root package name */
    private static final Class f131774c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f131775d;

    /* renamed from: e, reason: collision with root package name */
    private static final Field f131776e;

    /* renamed from: f, reason: collision with root package name */
    private static final Field f131777f;

    /* renamed from: g, reason: collision with root package name */
    private static final Field f131778g;

    /* renamed from: h, reason: collision with root package name */
    private static final Field f131779h;

    /* renamed from: i, reason: collision with root package name */
    private static final Field f131780i;

    static {
        boolean z10 = false;
        Class clsA = fT.a("com.facebook.react.uimanager.UIManagerHelper");
        Class clsA2 = fT.a("com.facebook.react.bridge.ReactContext");
        f131774c = clsA2;
        Class clsA3 = fT.a("com.facebook.react.bridge.BaseJavaModule");
        Class clsA4 = fT.a("com.facebook.react.bridge.ReactContextBaseJavaModule");
        Class clsA5 = fT.a("com.facebook.react.fabric.FabricUIManager");
        Class clsA6 = fT.a("com.facebook.react.fabric.mounting.SurfaceMountingManager");
        Class clsA7 = fT.a("com.facebook.react.fabric.mounting.MountingManager");
        Class clsA8 = fT.a("com.facebook.react.fabric.mounting.SurfaceMountingManager$ViewState");
        Method methodA = fT.a(clsA, "getUIManager", clsA2, Integer.TYPE);
        f131775d = methodA;
        Field fieldA = fT.a(clsA3, "mReactApplicationContext");
        if (fieldA == null) {
            fieldA = fT.a(clsA4, "mReactApplicationContext");
        }
        f131776e = fieldA;
        Field fieldA2 = fT.a(clsA5, "mMountingManager");
        f131778g = fieldA2;
        Field fieldA3 = fT.a(clsA7, "mMostRecentSurfaceMountingManager");
        f131777f = fieldA3;
        Field fieldA4 = fT.a(clsA6, "mTagToViewState");
        f131779h = fieldA4;
        Field fieldA5 = fT.a(clsA8, "mView");
        f131780i = fieldA5;
        if (clsA2 != null && methodA != null && fieldA != null && fieldA2 != null && fieldA3 != null && fieldA4 != null && fieldA5 != null) {
            z10 = true;
        }
        f131772a = z10;
        if (z10) {
            return;
        }
        C14107fy.a(new ReflectiveOperationException("Unable to initialize click handling for React Native Fabric. REACT_CONTEXT_CLASS=" + clsA2 + ". GET_UI_MANAGER_METHOD=" + methodA + ". M_REACT_APPLICATION_CONTEXT_FIELD=" + fieldA + ". M_MOUNTING_MANAGER_FIELD=" + fieldA2 + ". M_MOST_RECENT_SURFACE_MOUNTING_MANAGER_FIELD=" + fieldA3 + ". M_TAG_TO_VIEW_STATE_FIELD=" + fieldA4 + ". M_VIEW_FIELD=" + fieldA5 + "."));
    }

    public static View a(Context context, int i10) {
        if (!f131772a || f131773b || context == null || !f131774c.isAssignableFrom(context.getClass())) {
            return null;
        }
        try {
            Object obj = ((Map) f131779h.get(f131777f.get(f131778g.get(f131775d.invoke(null, context, 2))))).get(Integer.valueOf(i10));
            if (obj != null) {
                return (View) f131780i.get(obj);
            }
            return null;
        } catch (Throwable th2) {
            f131773b = true;
            Log.e("Unexpected error getting Fabric view for click handling", th2);
            C14107fy.a(th2);
            return null;
        }
    }

    public static View a(Object obj, int i10) {
        if (!f131772a || f131773b || obj == null) {
            return null;
        }
        try {
            Object obj2 = f131776e.get(obj);
            if (obj2 instanceof Context) {
                return a((Context) obj2, i10);
            }
        } catch (Throwable th2) {
            f131773b = true;
            Log.e("Unexpected error getting Fabric view for click handling", th2);
            C14107fy.a(th2);
        }
        return null;
    }
}
