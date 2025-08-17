package Pc;

import Mc.C4169y;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.AbstractC8981of0;
import com.google.android.gms.internal.ads.C7200Tf0;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.Z50;
import com.medallia.digital.mobilesdk.q2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class X {
    public static JSONObject c(String str, Context context, Point point, Point point2) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e10) {
            e = e10;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("x", C4169y.b().e(context, point2.x));
                jSONObject3.put("y", C4169y.b().e(context, point2.y));
                jSONObject3.put("start_x", C4169y.b().e(context, point.x));
                jSONObject3.put("start_y", C4169y.b().e(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e11) {
                Qc.p.e("Error occurred while putting signals into JSON object.", e11);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e12) {
            e = e12;
            jSONObject2 = jSONObject;
            Qc.p.e("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static JSONObject d(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        Iterator it;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] iArrJ = j(view);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArrJ2 = j(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    int[] iArr = iArrJ;
                    try {
                        it = it2;
                        try {
                            jSONObject4.put("width", C4169y.b().e(context, view2.getMeasuredWidth()));
                            jSONObject4.put("height", C4169y.b().e(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", C4169y.b().e(context, iArrJ2[0] - iArr[0]));
                            jSONObject4.put("y", C4169y.b().e(context, iArrJ2[1] - iArr[1]));
                            jSONObject4.put(str4, str3);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = k(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", C4169y.b().e(context, iArrJ2[0] - iArr[0]));
                                jSONObject.put("y", C4169y.b().e(context, iArrJ2[1] - iArr[1]));
                                jSONObject.put(str4, str3);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) Mc.A.c().a(C8659lf.f76090O7)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) Mc.A.c().a(C8659lf.f76104P7)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", l(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", l(layoutParams.height) - 1);
                                }
                                if (((Boolean) Mc.A.c().a(C8659lf.f76118Q7)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join(q2.f92724c, arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    Qc.p.g("Unable to get asset views information");
                                    it2 = it;
                                    iArrJ = iArr;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        it = it2;
                    }
                    it2 = it;
                    iArrJ = iArr;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static int[] j(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static int l(int i10) {
        if (i10 != -2) {
            return i10 != -1 ? 2 : 3;
        }
        return 4;
    }

    public static WindowManager.LayoutParams b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) Mc.A.c().a(C8659lf.f76174U7)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject e(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                Lc.v.t();
                jSONObject.put("can_show_on_lock_screen", D0.T(view));
                Lc.v.t();
                jSONObject.put("is_keyguard_locked", D0.e(context));
                return jSONObject;
            } catch (JSONException unused) {
                Qc.p.g("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject f(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) Mc.A.c().a(C8659lf.f76076N7)).booleanValue()) {
                    Lc.v.t();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                Lc.v.t();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    z = false;
                }
                jSONObject.put("contained_in_scroll_view", z);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:73|22)|31|69|32|33|(7:35|(1:40)(1:44)|45|(2:47|(1:49)(1:52))(1:53)|68|56|(2:64|58))(7:41|(1:43)(0)|45|(0)(0)|68|56|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016b, code lost:
    
        Qc.p.e("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0165 A[Catch: JSONException -> 0x015e, TRY_LEAVE, TryCatch #6 {JSONException -> 0x015e, blocks: (B:32:0x012d, B:49:0x015a, B:52:0x0160, B:53:0x0165), top: B:69:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject g(android.content.Context r17, android.view.View r18) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pc.X.g(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean h(Context context, Z50 z50) {
        if (!z50.f72008N) {
            return false;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76132R7)).booleanValue()) {
            return ((Boolean) Mc.A.c().a(C8659lf.f76188V7)).booleanValue();
        }
        String str = (String) Mc.A.c().a(C8659lf.f76146S7);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = C7200Tf0.b(AbstractC8981of0.b(';')).d(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(int i10) {
        if (((Boolean) Mc.A.c().a(C8659lf.f75904B3)).booleanValue()) {
            return ((Boolean) Mc.A.c().a(C8659lf.f75918C3)).booleanValue() || i10 <= 15299999;
        }
        return true;
    }

    private static JSONObject k(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", C4169y.b().e(context, rect.right - rect.left));
        jSONObject.put("height", C4169y.b().e(context, rect.bottom - rect.top));
        jSONObject.put("x", C4169y.b().e(context, rect.left));
        jSONObject.put("y", C4169y.b().e(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static Point a(MotionEvent motionEvent, View view) {
        int[] iArrJ = j(view);
        return new Point(((int) motionEvent.getRawX()) - iArrJ[0], ((int) motionEvent.getRawY()) - iArrJ[1]);
    }
}
