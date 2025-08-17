package fsimpl;

import android.content.Context;
import com.fullstory.FSRuntimeConfigEditor;
import com.fullstory.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* renamed from: fsimpl.ck, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14013ck {

    /* renamed from: a, reason: collision with root package name */
    private static C14013ck f131930a;

    /* renamed from: b, reason: collision with root package name */
    private static C14015cm f131931b;

    /* renamed from: c, reason: collision with root package name */
    private String f131962c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f131963d = null;

    /* renamed from: e, reason: collision with root package name */
    private String f131964e = null;

    /* renamed from: f, reason: collision with root package name */
    private String f131965f = null;

    /* renamed from: g, reason: collision with root package name */
    private String f131966g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f131967h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f131968i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f131969j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f131970k = false;

    /* renamed from: l, reason: collision with root package name */
    private String f131971l = null;

    /* renamed from: m, reason: collision with root package name */
    private int f131972m = 24;

    /* renamed from: n, reason: collision with root package name */
    private int f131973n = 36;

    /* renamed from: o, reason: collision with root package name */
    private int f131974o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f131975p = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f131976q = 10;

    /* renamed from: r, reason: collision with root package name */
    private boolean f131977r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f131978s = false;

    /* renamed from: t, reason: collision with root package name */
    private String f131979t = null;

    /* renamed from: u, reason: collision with root package name */
    private String f131980u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f131981v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f131982w = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f131983x = true;

    /* renamed from: y, reason: collision with root package name */
    private boolean f131984y = false;

    /* renamed from: z, reason: collision with root package name */
    private String f131985z = null;

    /* renamed from: A, reason: collision with root package name */
    private boolean f131932A = true;

    /* renamed from: B, reason: collision with root package name */
    private boolean f131933B = false;

    /* renamed from: C, reason: collision with root package name */
    private boolean f131934C = false;

    /* renamed from: D, reason: collision with root package name */
    private boolean f131935D = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f131936E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f131937F = false;

    /* renamed from: G, reason: collision with root package name */
    private boolean f131938G = false;

    /* renamed from: H, reason: collision with root package name */
    private boolean f131939H = false;

    /* renamed from: I, reason: collision with root package name */
    private boolean f131940I = false;

    /* renamed from: J, reason: collision with root package name */
    private boolean f131941J = false;

    /* renamed from: K, reason: collision with root package name */
    private String f131942K = "FS";

    /* renamed from: L, reason: collision with root package name */
    private int f131943L = 0;

    /* renamed from: M, reason: collision with root package name */
    private boolean f131944M = false;

    /* renamed from: N, reason: collision with root package name */
    private C14101fs f131945N = null;

    /* renamed from: O, reason: collision with root package name */
    private boolean f131946O = false;

    /* renamed from: P, reason: collision with root package name */
    private boolean f131947P = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f131948Q = false;

    /* renamed from: R, reason: collision with root package name */
    private boolean f131949R = false;

    /* renamed from: S, reason: collision with root package name */
    private byte f131950S = 0;

    /* renamed from: T, reason: collision with root package name */
    private long f131951T = C14100fr.f132281a;

    /* renamed from: U, reason: collision with root package name */
    private boolean f131952U = true;

    /* renamed from: V, reason: collision with root package name */
    private boolean f131953V = false;

    /* renamed from: W, reason: collision with root package name */
    private boolean f131954W = false;

    /* renamed from: X, reason: collision with root package name */
    private boolean f131955X = false;

    /* renamed from: Y, reason: collision with root package name */
    private String f131956Y = null;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f131957Z = false;

    /* renamed from: aa, reason: collision with root package name */
    private Map f131958aa = new HashMap();

    /* renamed from: ab, reason: collision with root package name */
    private Map f131959ab = new HashMap();

    /* renamed from: ac, reason: collision with root package name */
    private Map f131960ac = new HashMap();

    /* renamed from: ad, reason: collision with root package name */
    private Map f131961ad = new HashMap();

    private C14013ck() {
    }

    private static byte a(Properties properties, byte b10) {
        return !properties.containsKey("com.fullstory.ASYNC_ENABLED") ? b10 : Boolean.parseBoolean(properties.getProperty("com.fullstory.ASYNC_ENABLED", Boolean.toString(false))) ? (byte) 2 : (byte) 1;
    }

    public static synchronized C14013ck a(Context context) {
        if (f131930a == null) {
            f131930a = new C14013ck().c(context);
            f131931b = new C14015cm(context);
        }
        return f131930a;
    }

    private C14013ck a(InputStream inputStream) throws IOException {
        String str;
        Properties properties = new Properties();
        properties.load(inputStream);
        this.f131962c = properties.getProperty("com.fullstory.BUILD_ID", this.f131962c);
        this.f131979t = properties.getProperty("com.fullstory.LOG_LEVEL", this.f131979t);
        this.f131980u = properties.getProperty("com.fullstory.LOGCAT_LEVEL", this.f131980u);
        this.f131968i = Boolean.parseBoolean(properties.getProperty("com.fullstory.HANS", Boolean.toString(this.f131968i)));
        this.f131963d = properties.getProperty("com.fullstory.SERVER", this.f131963d);
        this.f131965f = properties.getProperty("com.fullstory.APP_SERVER", this.f131965f);
        this.f131964e = properties.getProperty("com.fullstory.APP_SCHEME", this.f131964e);
        String property = properties.getProperty("com.fullstory.RECORDER", this.f131966g);
        this.f131966g = property;
        this.f131970k = property.startsWith("http://localhost");
        this.f131971l = properties.getProperty("com.fullstory.ORG", this.f131971l);
        this.f131972m = Integer.parseInt(properties.getProperty("com.fullstory.MIN_API", Integer.toString(this.f131972m)));
        this.f131973n = Integer.parseInt(properties.getProperty("com.fullstory.MAX_API", Integer.toString(this.f131973n)));
        this.f131977r = Boolean.parseBoolean(properties.getProperty("com.fullstory.VERBOSE_LOGGING", Boolean.toString(this.f131977r)));
        this.f131978s = Boolean.parseBoolean(properties.getProperty("com.fullstory.API_TRACE_ENABLED", Boolean.toString(this.f131978s)));
        this.f131974o = Integer.parseInt(properties.getProperty("com.fullstory.SESSION_SETUP_DELAY_MS", Integer.toString(this.f131974o)));
        this.f131975p = Integer.parseInt(properties.getProperty("com.fullstory.SESSION_TIME_LIMIT", Integer.toString(this.f131975p)));
        this.f131981v = Boolean.parseBoolean(properties.getProperty("com.fullstory.ENHANCED_REACT_NATIVE_SUPPORT", Boolean.toString(this.f131981v)));
        this.f131937F = Boolean.parseBoolean(properties.getProperty("com.fullstory.IS_REACT_NATIVE", Boolean.toString(this.f131937F)));
        this.f131938G = Boolean.parseBoolean(properties.getProperty("com.fullstory.IS_CORDOVA", Boolean.toString(this.f131938G)));
        this.f131939H = Boolean.parseBoolean(properties.getProperty("com.fullstory.IS_IONIC", Boolean.toString(this.f131939H)));
        this.f131940I = Boolean.parseBoolean(properties.getProperty("com.fullstory.IS_CAPACITOR", Boolean.toString(this.f131940I)));
        this.f131941J = Boolean.parseBoolean(properties.getProperty("com.fullstory.IS_FLUTTER", Boolean.toString(this.f131941J)));
        this.f131982w = Boolean.parseBoolean(properties.getProperty("com.fullstory.RECORD_ON_START", Boolean.toString(this.f131982w)));
        this.f131976q = Integer.parseInt(properties.getProperty("com.fullstory.LOW_MEMORY_PERCENT", Integer.toString(this.f131976q)));
        this.f131984y = Boolean.parseBoolean(properties.getProperty("com.fullstory.MASK_ASSETS", Boolean.toString(this.f131984y)));
        this.f131932A = Boolean.parseBoolean(properties.getProperty("com.fullstory.BUG_REPORTING_ENABLED", Boolean.toString(this.f131932A)));
        this.f131933B = Boolean.parseBoolean(properties.getProperty("com.fullstory.COMPOSE_SUPPORT", Boolean.toString(this.f131933B)));
        this.f131934C = Boolean.parseBoolean(properties.getProperty("com.fullstory.FRAGMENT_SUPPORT", Boolean.toString(this.f131934C)));
        this.f131935D = Boolean.parseBoolean(properties.getProperty("com.fullstory.OKHTTP_SUPPORT", Boolean.toString(this.f131935D)));
        this.f131936E = Boolean.parseBoolean(properties.getProperty("com.fullstory.URLCONNECTION_SUPPORT", Boolean.toString(this.f131936E)));
        this.f131943L = Integer.parseInt(properties.getProperty("com.fullstory.COMPOSE_SELECTOR_VERSION", Integer.toString(this.f131943L)));
        this.f131944M = Boolean.parseBoolean(properties.getProperty("com.fullstory.COMPOSE_AUTO_SELECTORS", Boolean.toString(this.f131944M)));
        this.f131945N = C14101fs.a(properties.getProperty("com.fullstory.COMPOSE_UI_VERSION"));
        this.f131953V = Boolean.parseBoolean(properties.getProperty("com.fullstory.LOG_PRIVACY_RULES", Boolean.toString(this.f131953V)));
        this.f131985z = properties.getProperty("com.fullstory.USER_ID", this.f131985z);
        this.f131952U = Boolean.parseBoolean(properties.getProperty("com.fullstory.WEBVIEW_INJECTION", Boolean.toString(this.f131952U)));
        this.f131949R = Boolean.parseBoolean(properties.getProperty("com.fullstory.PREVIEW_MODE_ENABLED", Boolean.toString(this.f131949R)));
        this.f131950S = a(properties, this.f131950S);
        this.f131951T = Integer.parseInt(properties.getProperty("com.fullstory.ASYNC_SLICE_NS", Long.toString(this.f131951T)));
        this.f131967h = Boolean.parseBoolean(properties.getProperty("com.fullstory.USE_PROXY_SERVER", Boolean.toString(this.f131967h)));
        this.f131942K = properties.getProperty("com.fullstory.WEBVIEW_NAMESPACE", this.f131942K);
        this.f131954W = Boolean.parseBoolean(properties.getProperty("com.fullstory.IGNORE_PROCESS_CHECK", Boolean.toString(this.f131954W)));
        this.f131956Y = properties.getProperty("com.fullstory.PROCESS_NAME", this.f131956Y);
        this.f131955X = Boolean.parseBoolean(properties.getProperty("com.fullstory.DISABLE_FORCED_ACCESSIBILITY", Boolean.toString(this.f131955X)));
        int i10 = this.f131976q;
        if (i10 < 1 || i10 > 100) {
            this.f131976q = 10;
        }
        C14101fs c14101fs = this.f131945N;
        if (c14101fs != null) {
            this.f131946O = c14101fs.a(1, 4);
            this.f131947P = this.f131945N.a(1, 5);
            this.f131948Q = this.f131945N.a(1, 7);
        } else {
            this.f131946O = false;
            this.f131947P = false;
            this.f131948Q = false;
        }
        for (String str2 : properties.getProperty("com.fullstory.INTERNAL_FLAGS", "").split(",")) {
            if (!str2.isEmpty()) {
                if (str2.equalsIgnoreCase("unmasked")) {
                    if (this.f131968i) {
                        this.f131983x = false;
                    }
                } else if (str2.equalsIgnoreCase("enableAssertions")) {
                    if (!C14103fu.f132287a) {
                        C14103fu.f132287a = true;
                        str = "Enabling assertions due to internal flag...";
                        Log.e(str);
                    }
                } else if (str2.equalsIgnoreCase("disableAssertions")) {
                    if (C14103fu.f132287a) {
                        C14103fu.f132287a = false;
                        str = "Disabling assertions due to internal flag...";
                        Log.e(str);
                    }
                } else if (str2.equalsIgnoreCase("enablePrivacyAssertions")) {
                    if (!C14103fu.f132288b) {
                        C14103fu.f132288b = true;
                        str = "Enabling privacy assertions due to internal flag...";
                        Log.e(str);
                    }
                } else if (str2.equalsIgnoreCase("disablePrivacyAssertions")) {
                    if (C14103fu.f132288b) {
                        C14103fu.f132288b = false;
                        str = "Disabling privacy assertions due to internal flag...";
                        Log.e(str);
                    }
                } else if (str2.equalsIgnoreCase("useLocalProps")) {
                    this.f131969j = true;
                } else {
                    str = "Unknown internal flag, ignored: " + str2;
                    Log.e(str);
                }
            }
        }
        if (C14103fu.f132288b && !C14103fu.f132287a) {
            C14103fu.f132287a = true;
            Log.e("Enabling assertions due to privacy assertions being enabled...");
        }
        return this;
    }

    private static void a(String str, Comparable comparable, Comparable comparable2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("  ").append(str).append(" = ").append(comparable);
        if (ck$$ExternalSyntheticBackport0.m(comparable, comparable2, new Comparator() { // from class: fsimpl.ck$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        }) != 0) {
            sb2.append(" (override; original value: ").append(comparable2).append(")");
        }
        Log.i(sb2.toString());
    }

    private static int b(String str) {
        return Integer.parseInt(str, 16);
    }

    private C14013ck c(Context context) {
        try {
            InputStream inputStreamOpen = context.getAssets().open("fs-config.properties");
            try {
                C14013ck c14013ckA = a(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                if (c14013ckA.f131969j) {
                    try {
                        File externalFilesDir = context.getExternalFilesDir(null);
                        if (externalFilesDir != null && externalFilesDir.exists()) {
                            File file = new File(externalFilesDir, "fs-config.properties");
                            if (file.exists()) {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                try {
                                    C14013ck c14013ckA2 = a(fileInputStream);
                                    fileInputStream.close();
                                    c14013ckA = c14013ckA2;
                                } finally {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        dI.a(-32763, "Error initializing configuration", th2);
                        return null;
                    }
                }
                if (c14013ckA.f131985z != null) {
                    new X(context).a("FullStoryUserId", c14013ckA.f131985z);
                }
                return c14013ckA;
            } finally {
            }
        } catch (Throwable th3) {
            dI.a(-32763, "Error initializing configuration", th3);
            return null;
        }
    }

    public boolean A() {
        return this.f131947P;
    }

    public boolean B() {
        return this.f131948Q;
    }

    public boolean C() {
        return this.f131935D;
    }

    public boolean D() {
        return this.f131936E;
    }

    public boolean E() {
        return this.f131934C;
    }

    public Map F() {
        return this.f131958aa;
    }

    public Map G() {
        return this.f131960ac;
    }

    public Map H() {
        return this.f131959ab;
    }

    public Map I() {
        return this.f131961ad;
    }

    public boolean J() {
        return this.f131937F;
    }

    public boolean K() {
        return this.f131938G;
    }

    public boolean L() {
        return this.f131939H;
    }

    public boolean M() {
        return this.f131940I;
    }

    public boolean N() {
        return this.f131941J;
    }

    public boolean O() {
        return a(false);
    }

    public byte P() {
        return this.f131950S;
    }

    public long Q() {
        return this.f131951T;
    }

    public boolean R() {
        return this.f131952U;
    }

    public boolean S() {
        return this.f131953V;
    }

    public boolean T() {
        return this.f131967h;
    }

    public String U() {
        return this.f131942K;
    }

    public boolean V() {
        return this.f131954W;
    }

    public String W() {
        return this.f131956Y;
    }

    public boolean X() {
        return this.f131955X;
    }

    public String a(String str) {
        return (str == null || this.f131970k || T()) ? this.f131966g : str;
    }

    public List a(Context context, FSRuntimeConfigEditor.Applier applier) {
        C14014cl c14014cl = new C14014cl(this);
        applier.apply(c14014cl);
        return c14014cl.a(context);
    }

    public void a() {
        Log.i("*** Configuration:");
        Log.i("  buildId = " + this.f131962c);
        Log.i("  serverRoot = " + this.f131963d);
        Log.i("  appServerRoot = " + this.f131965f);
        Log.i("  recorderRoot = " + this.f131966g);
        Log.i("  isRecorderLocal = " + this.f131970k);
        Log.i("  orgId = " + this.f131971l);
        Log.i("  minApi = " + this.f131972m);
        Log.i("  maxApi = " + this.f131973n);
        Log.i("  verboseLogging = " + this.f131977r);
        Log.i("  apiTraceEnabled = " + this.f131978s);
        Log.i("  sessionSetupDelayMs = " + this.f131974o);
        Log.i("  sessionTimeLimit (sec.) = " + this.f131975p);
        Log.i("  masked = " + this.f131983x);
        Log.i("  mask assets = " + this.f131984y);
        Log.i("  appScheme = " + this.f131964e);
        Log.i("  isFromHans = " + this.f131968i);
        Log.i("  enhancedReactNativeSupport = " + this.f131981v);
        Log.i("  logLevel = " + this.f131979t);
        Log.i("  parsed logLevel = " + Log.getLevel());
        Log.i("  logcatLevel = " + this.f131980u);
        Log.i("  parsed logcatLevel = " + Log.getLogcatLevel());
        Log.i("  low mem % = " + this.f131976q);
        Log.i("  bugReportingEnabled = " + this.f131932A);
        Log.i("  composeSupport = " + this.f131933B);
        Log.i("  fragmentSupport = " + this.f131934C);
        Log.i("  okHttpSupport = " + this.f131935D);
        Log.i("  urlConnectionSupport = " + this.f131936E);
        Log.i("  composeSelectorVersion = " + this.f131943L);
        Log.i("  composeAutoSelectorsEnabled = " + this.f131944M);
        Log.i("  composeUiVersion = " + this.f131945N);
        Log.i("  webViewInjectionEnabled = " + this.f131952U);
        Log.i("  isLogPrivacyRules = " + this.f131953V);
        a("previewModeEnabled", Boolean.valueOf(O()), Boolean.valueOf(this.f131949R));
        Log.i("  viewScanType = " + dC.a(this.f131950S));
        Log.i("  useProxyServer = " + this.f131967h);
        Log.i("  webViewNamespace = " + this.f131942K);
        Log.i("  ignoreProcessCheck = " + this.f131954W);
        Log.i("  processName = " + this.f131956Y);
        Log.i("  disableForcedAccessibility = " + this.f131955X);
    }

    public boolean a(boolean z10) {
        Boolean boolA = z10 ? null : f131931b.a();
        return boolA != null ? boolA.booleanValue() : this.f131949R;
    }

    public boolean b() {
        return this.f131968i;
    }

    public synchronized boolean b(Context context) {
        if (this.f131957Z) {
            return true;
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open("fs-mapping.properties");
            try {
                Properties properties = new Properties();
                properties.load(inputStreamOpen);
                for (Map.Entry entry : properties.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str.startsWith("mapping-fsclass:")) {
                        this.f131961ad.put(Integer.valueOf(b(str.substring("mapping-fsclass:".length()))), str2);
                    }
                    if (str.startsWith("mapping-name:")) {
                        this.f131958aa.put(str2, Integer.valueOf(b(str.substring("mapping-name:".length()))));
                    }
                    if (str.startsWith("mapping-sha256:")) {
                        this.f131960ac.put(Integer.valueOf(b(str.substring("mapping-sha256:".length()))), str2);
                    }
                    if (str.startsWith("asset:")) {
                        this.f131959ab.put(str.substring("asset:".length()), Integer.valueOf(b(str2)));
                    }
                }
                Log.d("Loaded mappings: " + this.f131962c + ", " + this.f131963d);
                this.f131957Z = true;
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                return true;
            } finally {
            }
        } catch (Throwable th2) {
            dI.a(-32763, "Error initializing configuration", th2);
            return false;
        }
    }

    public boolean c() {
        return this.f131983x;
    }

    public boolean d() {
        return this.f131984y;
    }

    public int e() {
        return this.f131974o;
    }

    public int f() {
        return this.f131975p;
    }

    public String g() {
        return this.f131962c;
    }

    public String h() {
        String str = this.f131964e;
        return str != null ? str : "";
    }

    public String i() {
        return this.f131963d;
    }

    public String j() {
        return this.f131965f;
    }

    public String k() {
        return this.f131966g;
    }

    public String l() {
        return this.f131971l;
    }

    public int m() {
        return this.f131972m;
    }

    public int n() {
        return this.f131973n;
    }

    public boolean o() {
        return this.f131977r;
    }

    public boolean p() {
        return this.f131978s;
    }

    public boolean q() {
        return this.f131981v;
    }

    public String r() {
        return this.f131979t;
    }

    public String s() {
        return this.f131980u;
    }

    public boolean t() {
        return this.f131982w;
    }

    public int u() {
        return this.f131976q;
    }

    public boolean v() {
        return this.f131932A;
    }

    public boolean w() {
        return this.f131933B;
    }

    public int x() {
        return this.f131943L;
    }

    public boolean y() {
        return this.f131944M;
    }

    public boolean z() {
        return this.f131946O;
    }
}
