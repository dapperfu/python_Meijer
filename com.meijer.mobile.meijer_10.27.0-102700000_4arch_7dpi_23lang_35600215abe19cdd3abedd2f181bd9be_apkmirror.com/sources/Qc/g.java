package Qc;

import Mc.A;
import Mc.d2;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C9730vg;
import com.google.android.gms.internal.ads.HandlerC6857Jd0;
import gd.C14248g;
import io.constructor.BuildConfig;
import io.constructor.data.local.PreferencesHelper;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f29940b = new HandlerC6857Jd0(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static final String f29941c = AdView.class.getName();

    /* renamed from: d, reason: collision with root package name */
    private static final String f29942d = Rc.a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    private static final String f29943e = AdManagerAdView.class.getName();

    /* renamed from: f, reason: collision with root package name */
    private static final String f29944f = Fc.b.class.getName();

    /* renamed from: g, reason: collision with root package name */
    private static final String f29945g = SearchAdView.class.getName();

    /* renamed from: h, reason: collision with root package name */
    private static final String f29946h = com.google.android.gms.ads.b.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private float f29947a = -1.0f;

    private static String B(String str, String str2) throws NoSuchAlgorithmException {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static ActivityManager.MemoryInfo f(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            p.g("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    public static final int r(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, i10, displayMetrics);
    }

    public static final String s(StackTraceElement[] stackTraceElementArr, String str) {
        int i10;
        String className;
        int i11 = 0;
        while (true) {
            i10 = i11 + 1;
            if (i10 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f29941c.equalsIgnoreCase(className2) || f29942d.equalsIgnoreCase(className2) || f29943e.equalsIgnoreCase(className2) || f29944f.equalsIgnoreCase(className2) || f29945g.equalsIgnoreCase(className2) || f29946h.equalsIgnoreCase(className2))) {
                break;
            }
            i11 = i10;
        }
        className = stackTraceElementArr[i10].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb2 = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb2.append(stringTokenizer.nextToken());
                for (int i12 = 2; i12 > 0 && stringTokenizer.hasMoreElements(); i12--) {
                    sb2.append(".");
                    sb2.append(stringTokenizer.nextToken());
                }
                str = sb2.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final int x(DisplayMetrics displayMetrics, int i10) {
        return Math.round(i10 / displayMetrics.density);
    }

    public final JSONObject m(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return k(bundle);
            } catch (JSONException e10) {
                p.e("Error converting Bundle to JSON", e10);
            }
        }
        return null;
    }

    private final JSONArray a(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void b(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(k((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(l((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(j((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void c(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) A.c().a(C8659lf.f76445o)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, k((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, l((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), a((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, a(Arrays.asList((Object[]) obj)));
            return;
        }
        int i10 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i10 < length) {
                    numArr2[i10] = Integer.valueOf(iArr[i10]);
                    i10++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, j(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i10 < length2) {
                    dArr3[i10] = Double.valueOf(dArr2[i10]);
                    i10++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, j(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i10 < length3) {
                    lArr2[i10] = Long.valueOf(jArr[i10]);
                    i10++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, j(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new Boolean[0];
        } else {
            int length4 = zArr.length;
            Boolean[] boolArr2 = new Boolean[length4];
            while (i10 < length4) {
                boolArr2[i10] = Boolean.valueOf(zArr[i10]);
                i10++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, j(boolArr));
    }

    public static String h(String str) {
        return B(str, "MD5");
    }

    public static String i(String str) {
        return B(str, "SHA-256");
    }

    public static final boolean t() {
        boolean zBooleanValue = ((Boolean) A.c().a(C8659lf.f76443nb)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    public final int e(Context context, int i10) {
        if (this.f29947a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f29947a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f29947a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i10 / this.f29947a);
    }

    final JSONArray j(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            b(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject k(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            c(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject l(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                c(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e10) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    public final void n(ViewGroup viewGroup, d2 d2Var, String str, String str2) {
        if (str2 != null) {
            p.g(str2);
        }
        d(viewGroup, d2Var, str, -65536, -16777216);
    }

    public final void o(ViewGroup viewGroup, d2 d2Var, String str) {
        d(viewGroup, d2Var, "Ads by Google", -16777216, -1);
    }

    public final void p(Context context, String str, String str2, Bundle bundle, boolean z10) {
        y(context, str, "gmob-apps", bundle, true, new f() { // from class: Qc.d
            @Override // Qc.f
            public final t zza(String str3) {
                new e(this.f29938a, str3).start();
                return t.SUCCESS;
            }
        });
    }

    public static final String A(Context context) {
        String string;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (string == null || t()) {
            string = "emulator";
        }
        return B(string, "MD5");
    }

    private static final void d(ViewGroup viewGroup, d2 d2Var, String str, int i10, int i11) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i10);
        textView.setBackgroundColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i10);
        int iZ = z(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(d2Var.f19218f - iZ, d2Var.f19215c - iZ, 17));
        viewGroup.addView(frameLayout, d2Var.f19218f, d2Var.f19215c);
    }

    public static String g() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public static boolean q(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) C9730vg.f79106d.e());
    }

    public static final boolean u(Context context, int i10) {
        if (C14248g.f().h(context, i10) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean v(Context context) {
        int iH = C14248g.f().h(context, 12451000);
        if (iH != 0 && iH != 2) {
            return false;
        }
        return true;
    }

    public static final boolean w() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static final void y(Context context, String str, String str2, Bundle bundle, boolean z10, f fVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = C14248g.f().a(context) + ".244410000";
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(BuildConfig.SERVICE_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(PreferencesHelper.PREF_ID, "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        fVar.zza(builderAppendQueryParameter.toString());
    }

    public static final int z(Context context, int i10) {
        return r(context.getResources().getDisplayMetrics(), i10);
    }
}
