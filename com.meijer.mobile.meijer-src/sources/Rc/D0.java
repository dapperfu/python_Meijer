package Rc;

import Oc.C4447y;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.formats.zzj;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.AbstractC7718bf;
import com.google.android.gms.internal.ads.AbstractC9106of0;
import com.google.android.gms.internal.ads.C10320zy0;
import com.google.android.gms.internal.ads.C6895Go;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C7086Mf;
import com.google.android.gms.internal.ads.C7325Tf0;
import com.google.android.gms.internal.ads.C7392Vf0;
import com.google.android.gms.internal.ads.C7773c60;
import com.google.android.gms.internal.ads.C8388hu;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C9830vN;
import com.google.android.gms.internal.ads.C9855vg;
import com.google.android.gms.internal.ads.C9937wN;
import com.google.android.gms.internal.ads.HandlerC6982Jd0;
import com.google.android.gms.internal.ads.InterfaceC7273Rt;
import com.google.android.gms.internal.ads.InterfaceC8065et;
import com.google.android.gms.internal.ads.Mj0;
import com.google.android.gms.internal.ads.Z50;
import com.google.android.gms.internal.ads.zzdoz;
import com.google.maps.internal.HttpHeaders;
import id.C14726i;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sd.C17067f;

/* loaded from: classes4.dex */
public final class D0 {

    /* renamed from: l, reason: collision with root package name */
    public static final HandlerC6982Jd0 f32295l = new q0(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    private String f32302g;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f32303h;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f32296a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f32297b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f32298c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f32299d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private boolean f32300e = true;

    /* renamed from: f, reason: collision with root package name */
    private final Object f32301f = new Object();

    /* renamed from: i, reason: collision with root package name */
    private boolean f32304i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f32305j = false;

    /* renamed from: k, reason: collision with root package name */
    private final Executor f32306k = Executors.newSingleThreadExecutor();

    public static final T a(Context context) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                Sc.p.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof T ? (T) iInterfaceQueryLocalInterface : new Q(iBinder);
        } catch (Exception e10) {
            Nc.v.s().x(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    protected static final int[] a0() {
        return new int[]{0, 0};
    }

    public static final boolean e(Context context) {
        KeyguardManager keyguardManagerY;
        return (context == null || (keyguardManagerY = y(context)) == null || !keyguardManagerY.isKeyguardLocked()) ? false : true;
    }

    public static final boolean f(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th2) {
            Sc.p.e("Error loading class.", th2);
            Nc.v.s().x(th2, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean h(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean i(Context context) {
        try {
            Bundle bundleZ = z(context);
            String string = bundleZ.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(B(bundleZ))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static int A(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        Sc.p.g("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    private static String B(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    private static final void D(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private static final String F(final Context context, String str) {
        String strW;
        String str2;
        if (str == null) {
            return W();
        }
        try {
            C5196j0 c5196j0A = C5196j0.a();
            if (TextUtils.isEmpty(c5196j0A.f32363a)) {
                if (com.google.android.gms.common.util.e.a()) {
                    str2 = (String) C5190g0.a(context, new Callable() { // from class: Rc.h0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                p0.k("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            p0.k("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            com.google.android.gms.common.util.q.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context contextC = C14726i.c(context);
                    str2 = (String) C5190g0.a(context, new Callable() { // from class: Rc.i0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = contextC;
                            Context context3 = context;
                            boolean z10 = false;
                            if (context2 != null) {
                                p0.k("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                p0.k("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z10 = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                return string;
                            }
                            p0.k("Reading user agent from WebSettings");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                            if (z10) {
                                sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                                p0.k("Persisting user agent.");
                            }
                            return defaultUserAgent;
                        }
                    });
                }
                c5196j0A.f32363a = str2;
            }
            strW = c5196j0A.f32363a;
        } catch (Exception unused) {
            strW = null;
        }
        if (TextUtils.isEmpty(strW)) {
            strW = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strW)) {
            strW = W();
        }
        String str3 = strW + " (Mobile; " + str;
        try {
            if (C17067f.a(context).g()) {
                str3 = str3 + ";aia";
            }
        } catch (Exception e10) {
            Nc.v.s().x(e10, "AdUtil.getUserAgent");
        }
        return str3.concat(")");
    }

    public static List I() {
        AbstractC7718bf abstractC7718bf = C8784lf.f77089a;
        List listB = Oc.A.a().b();
        ArrayList arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            Iterator it2 = C7325Tf0.b(AbstractC9106of0.b(',')).d((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    p0.k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static final void U(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    static final String W() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String X() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final Integer Y(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics Z(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final Map b0(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e10) {
            Nc.v.s().x(e10, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final WebResourceResponse d0(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put(HttpHeaders.USER_AGENT, Nc.v.t().H(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new P(context).b(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            Sc.p.h("Could not fetch MRAID JS.", e10);
        }
        return null;
    }

    public static final boolean j(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void k(View view, int i10, MotionEvent motionEvent) {
        String strA;
        int i11;
        int iHeight;
        int iWidth;
        String str;
        Z50 z50E;
        C7773c60 c7773c60F;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzdoz) {
                childAt = ((zzdoz) childAt).getChildAt(0);
            }
            if ((childAt instanceof zzj) || (childAt instanceof NativeAdView)) {
                strA = "NATIVE";
                i11 = 1;
            } else {
                strA = "UNKNOWN";
                i11 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            Nc.v.t();
            long jC0 = c0(childAt);
            childAt.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof InterfaceC7273Rt) || (c7773c60F = ((InterfaceC7273Rt) childAt).f()) == null) {
                str = "none";
            } else {
                str = c7773c60F.f73943b;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof InterfaceC8065et) && (z50E = ((InterfaceC8065et) childAt).e()) != null) {
                strA = Z50.a(z50E.f72863b);
                i11 = z50E.f72869e;
                str2 = z50E.f72839E;
            }
            Sc.p.f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(childAt.hashCode()), packageName, str2, str, strA, Integer.valueOf(i11), childAt.getClass().getName(), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Long.valueOf(jC0), Integer.toString(i10, 2)));
        } catch (Exception e10) {
            Sc.p.e("Failure getting view location.", e10);
        }
    }

    public static final AlertDialog.Builder l(Context context) {
        Nc.v.u();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void m(Context context, String str, String str2) {
        new Y(context, str, str2, null, null).b();
    }

    public static final void n(Context context, Throwable th2) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) C9855vg.f79944b.e()).booleanValue()) {
                com.google.android.gms.common.util.h.a(context, th2);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final Map p(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f77299p)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i10 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i10);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i10);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i10, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i10 = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final void t(Context context, Intent intent) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77003Ta)).booleanValue()) {
            E(context, intent);
            return;
        }
        try {
            E(context, intent);
        } catch (SecurityException e10) {
            Sc.p.h("", e10);
            Nc.v.s().x(e10, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void u(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            U(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            Sc.p.b("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e10) {
            Sc.p.e("No browser is found.", e10);
        }
    }

    public static final void x(Context context, Intent intent, C9937wN c9937wN, String str) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77033Vc)).booleanValue() || !(context instanceof C8388hu)) {
            t(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) Oc.A.c().a(C8784lf.f77061Xc))) {
                    ((C8388hu) context).c(intent, 236);
                    if (!((Boolean) Oc.A.c().a(C8784lf.f77047Wc)).booleanValue() || c9937wN == null) {
                        return;
                    }
                    C9830vN c9830vNA = c9937wN.a();
                    c9830vNA.b("action", "hila");
                    c9830vNA.b("gqi", C7392Vf0.c(str));
                    c9830vNA.f();
                    return;
                }
            }
            t(context, intent);
        } catch (ActivityNotFoundException e10) {
            e = e10;
            Sc.p.e("Error occurred while starting activity for result", e);
            Nc.v.s().x(e, "AdUtil.startActivityForResult");
            t(context, intent);
        } catch (SecurityException e11) {
            e = e11;
            Sc.p.e("Error occurred while starting activity for result", e);
            Nc.v.s().x(e, "AdUtil.startActivityForResult");
            t(context, intent);
        } catch (Exception e12) {
            Sc.p.e("Error occurred while starting activity for result", e12);
            Nc.v.s().x(e12, "AdUtil.startActivityForResult");
            t(context, intent);
        }
    }

    private static KeyguardManager y(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    public final com.google.common.util.concurrent.q G(final Uri uri) {
        return Mj0.j(new Callable() { // from class: Rc.y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HandlerC6982Jd0 handlerC6982Jd0 = D0.f32295l;
                Nc.v.t();
                return D0.p(uri);
            }
        }, this.f32306k);
    }

    public final String H(Context context, String str) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77171fb)).booleanValue()) {
            if (this.f32303h != null) {
                return this.f32303h;
            }
            this.f32303h = F(context, str);
            return this.f32303h;
        }
        synchronized (this.f32301f) {
            try {
                String str2 = this.f32302g;
                if (str2 != null) {
                    return str2;
                }
                String strF = F(context, str);
                this.f32302g = strF;
                return strF;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void L(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.f32298c.set(C5185e.b(context, str));
    }

    public final boolean O(String str) {
        return C(str, this.f32296a, (String) Oc.A.c().a(C8784lf.f77286o0));
    }

    public final boolean P(String str) {
        return C(str, this.f32297b, (String) Oc.A.c().a(C8784lf.f77300p0));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean Q(Context context) {
        if (this.f32305j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        C8784lf.a(context);
        C0 c02 = null;
        if (!((Boolean) Oc.A.c().a(C8784lf.f76989Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new A0(this, c02), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new A0(this, c02), intentFilter, 4);
        }
        this.f32305j = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean R(Context context) {
        if (this.f32304i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        C8784lf.a(context);
        C0 c02 = null;
        if (!((Boolean) Oc.A.c().a(C8784lf.f76989Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new B0(this, c02), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new B0(this, c02), intentFilter, 4);
        }
        this.f32304i = true;
        return true;
    }

    public final int S(Context context, Uri uri) {
        if (context == null) {
            p0.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            D(context, uri);
            return 2;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76815G4)).booleanValue()) {
            androidx.browser.customtabs.d dVarA = new d.C0978d(Nc.v.i().c()).a();
            dVarA.f47405a.setPackage(C10320zy0.a(context));
            dVarA.a(context, uri);
            return 5;
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f76787E4)).booleanValue()) {
            D(context, uri);
            return 9;
        }
        C7086Mf c7086Mf = new C7086Mf();
        c7086Mf.e(new z0(this, c7086Mf, context, uri));
        c7086Mf.b((Activity) context);
        return 5;
    }

    private static boolean C(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void E(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static void M(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            C7033Kq.f69014a.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean T(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Rc.D0.T(android.view.View):boolean");
    }

    public static final String V(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return B(z(context));
    }

    public static final boolean b(Context context, String str) {
        Context contextA = C6895Go.a(context);
        if (C17067f.a(contextA).b(str, contextA.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean c(Context context) {
        try {
            return com.google.android.gms.common.util.j.b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long c0(View view) {
        float f10;
        float fMin = Float.MAX_VALUE;
        do {
            f10 = 0.0f;
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        if (fMin >= 0.0f) {
            f10 = fMin;
        }
        return Math.round(f10 * 100.0f);
    }

    public static final boolean d(String str) {
        if (!Sc.m.k()) {
            return false;
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f77067Y4)).booleanValue()) {
            return false;
        }
        String str2 = (String) Oc.A.c().a(C8784lf.f77095a5);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) Oc.A.c().a(C8784lf.f77081Z4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final String e0() {
        Resources resourcesF = Nc.v.s().f();
        if (resourcesF != null) {
            return resourcesF.getString(Lc.d.f18112t);
        }
        return "Test Ad";
    }

    public static final boolean g() {
        int iMyUid = Process.myUid();
        if (iMyUid != 0 && iMyUid != 1000) {
            return false;
        }
        return true;
    }

    public static final int o(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            Sc.p.g("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    public static final int[] q(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        if (window != null && (viewFindViewById = window.findViewById(R.id.content)) != null) {
            return new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
        }
        return a0();
    }

    public static final int[] r(Activity activity) {
        int[] iArrA0;
        View viewFindViewById;
        Window window = activity.getWindow();
        if (window != null && (viewFindViewById = window.findViewById(R.id.content)) != null) {
            iArrA0 = new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        } else {
            iArrA0 = a0();
        }
        return new int[]{C4447y.b().e(activity, iArrA0[0]), C4447y.b().e(activity, iArrA0[1])};
    }

    public static final boolean s(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10;
        if (Nc.v.t().f32300e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || T(view)) {
            z10 = true;
        } else {
            z10 = false;
        }
        long jC0 = c0(view);
        if (view.getVisibility() != 0 || !view.isShown() || ((powerManager != null && !powerManager.isScreenOn()) || !z10)) {
            return false;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77371u1)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77408wa)).booleanValue()) {
            if (jC0 < ((Integer) Oc.A.c().a(C8784lf.f77436ya)).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static final int[] v(Activity activity) {
        int[] iArrQ = q(activity);
        return new int[]{C4447y.b().e(activity, iArrQ[0]), C4447y.b().e(activity, iArrQ[1])};
    }

    public static final boolean w(View view, Context context) {
        PowerManager powerManager;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            powerManager = (PowerManager) applicationContext.getSystemService("power");
        } else {
            powerManager = null;
        }
        return s(view, powerManager, y(context));
    }

    private static Bundle z(Context context) throws RemoteException {
        try {
            return C17067f.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            p0.l("Error getting metadata", e10);
            return null;
        }
    }

    public final void K(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int iA = A(i10);
        Sc.p.f("HTTP timeout: " + iA + " milliseconds.");
        httpURLConnection.setConnectTimeout(iA);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iA);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty(HttpHeaders.USER_AGENT))) {
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, H(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void N(final Context context, final String str, String str2, Bundle bundle, boolean z10) {
        Nc.v.t();
        bundle.putString("device", X());
        AbstractC7718bf abstractC7718bf = C8784lf.f77089a;
        bundle.putString("eids", TextUtils.join(",", Oc.A.a().a()));
        if (bundle.isEmpty()) {
            Sc.p.b("Empty or null bundle.");
        } else {
            final String str3 = (String) Oc.A.c().a(C8784lf.f77380ua);
            if (!this.f32299d.getAndSet(true)) {
                this.f32298c.set(C5185e.a(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: Rc.x0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.f32454a.L(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.f32298c.get());
        }
        C4447y.b();
        Sc.g.y(context, str, "gmob-apps", bundle, true, new Sc.f() { // from class: Rc.w0
            @Override // Sc.f
            public final Sc.t zza(String str4) {
                HandlerC6982Jd0 handlerC6982Jd0 = D0.f32295l;
                Nc.v.t();
                D0.m(context, str, str4);
                return Sc.t.SUCCESS;
            }
        });
    }
}
