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
/* loaded from: classes15.dex */
public class C14138ck {

    /* renamed from: a, reason: collision with root package name */
    private static C14138ck f133180a;

    /* renamed from: b, reason: collision with root package name */
    private static C14140cm f133181b;

    /* renamed from: c, reason: collision with root package name */
    private String f133212c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f133213d = null;

    /* renamed from: e, reason: collision with root package name */
    private String f133214e = null;

    /* renamed from: f, reason: collision with root package name */
    private String f133215f = null;

    /* renamed from: g, reason: collision with root package name */
    private String f133216g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f133217h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f133218i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f133219j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f133220k = false;

    /* renamed from: l, reason: collision with root package name */
    private String f133221l = null;

    /* renamed from: m, reason: collision with root package name */
    private int f133222m = 24;

    /* renamed from: n, reason: collision with root package name */
    private int f133223n = 36;

    /* renamed from: o, reason: collision with root package name */
    private int f133224o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f133225p = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f133226q = 10;

    /* renamed from: r, reason: collision with root package name */
    private boolean f133227r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f133228s = false;

    /* renamed from: t, reason: collision with root package name */
    private String f133229t = null;

    /* renamed from: u, reason: collision with root package name */
    private String f133230u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f133231v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f133232w = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f133233x = true;

    /* renamed from: y, reason: collision with root package name */
    private boolean f133234y = false;

    /* renamed from: z, reason: collision with root package name */
    private String f133235z = null;

    /* renamed from: A, reason: collision with root package name */
    private boolean f133182A = true;

    /* renamed from: B, reason: collision with root package name */
    private boolean f133183B = false;

    /* renamed from: C, reason: collision with root package name */
    private boolean f133184C = false;

    /* renamed from: D, reason: collision with root package name */
    private boolean f133185D = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f133186E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f133187F = false;

    /* renamed from: G, reason: collision with root package name */
    private boolean f133188G = false;

    /* renamed from: H, reason: collision with root package name */
    private boolean f133189H = false;

    /* renamed from: I, reason: collision with root package name */
    private boolean f133190I = false;

    /* renamed from: J, reason: collision with root package name */
    private boolean f133191J = false;

    /* renamed from: K, reason: collision with root package name */
    private String f133192K = "FS";

    /* renamed from: L, reason: collision with root package name */
    private int f133193L = 0;

    /* renamed from: M, reason: collision with root package name */
    private boolean f133194M = false;

    /* renamed from: N, reason: collision with root package name */
    private C14226fs f133195N = null;

    /* renamed from: O, reason: collision with root package name */
    private boolean f133196O = false;

    /* renamed from: P, reason: collision with root package name */
    private boolean f133197P = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f133198Q = false;

    /* renamed from: R, reason: collision with root package name */
    private boolean f133199R = false;

    /* renamed from: S, reason: collision with root package name */
    private byte f133200S = 0;

    /* renamed from: T, reason: collision with root package name */
    private long f133201T = C14225fr.f133531a;

    /* renamed from: U, reason: collision with root package name */
    private boolean f133202U = true;

    /* renamed from: V, reason: collision with root package name */
    private boolean f133203V = false;

    /* renamed from: W, reason: collision with root package name */
    private boolean f133204W = false;

    /* renamed from: X, reason: collision with root package name */
    private boolean f133205X = false;

    /* renamed from: Y, reason: collision with root package name */
    private String f133206Y = null;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f133207Z = false;

    /* renamed from: aa, reason: collision with root package name */
    private Map f133208aa = new HashMap();

    /* renamed from: ab, reason: collision with root package name */
    private Map f133209ab = new HashMap();

    /* renamed from: ac, reason: collision with root package name */
    private Map f133210ac = new HashMap();

    /* renamed from: ad, reason: collision with root package name */
    private Map f133211ad = new HashMap();

    private C14138ck() {
    }

    private static byte a(Properties properties, byte b10) {
        return !properties.containsKey("com.fullstory.ASYNC_ENABLED") ? b10 : Boolean.parseBoolean(properties.getProperty("com.fullstory.ASYNC_ENABLED", Boolean.toString(false))) ? (byte) 2 : (byte) 1;
    }

    public static synchronized C14138ck a(Context context) {
        if (f133180a == null) {
            f133180a = new C14138ck().c(context);
            f133181b = new C14140cm(context);
        }
        return f133180a;
    }

    private C14138ck a(InputStream inputStream) throws IOException {
        String str;
        Properties properties = new Properties();
        properties.load(inputStream);
        this.f133212c = properties.getProperty("com.fullstory.BUILD_ID", this.f133212c);
        this.f133229t = properties.getProperty("com.fullstory.LOG_LEVEL", this.f133229t);
        this.f133230u = properties.getProperty("com.fullstory.LOGCAT_LEVEL", this.f133230u);
        this.f133218i = Boolean.parseBoolean(properties.getProperty("com.fullstory.HANS", Boolean.toString(this.f133218i)));
        this.f133213d = properties.getProperty("com.fullstory.SERVER", this.f133213d);
        this.f133215f = properties.getProperty("com.fullstory.APP_SERVER", this.f133215f);
        this.f133214e = properties.getProperty("com.fullstory.APP_SCHEME", this.f133214e);
        String property = properties.getProperty("com.fullstory.RECORDER", this.f133216g);
        this.f133216g = property;
        this.f133220k = property.startsWith("http://localhost");
        this.f133221l = properties.getProperty("com.fullstory.ORG", this.f133221l);
        this.f133222m = Integer.parseInt(properties.getProperty("com.fullstory.MIN_API", Integer.toString(this.f133222m)));
        this.f133223n = Integer.parseInt(properties.getProperty("com.fullstory.MAX_API", Integer.toString(this.f133223n)));
        this.f133227r = Boolean.parseBoolean(properties.getProperty("com.fullstory.VERBOSE_LOGGING", Boolean.toString(this.f133227r)));
        this.f133228s = Boolean.parseBoolean(properties.getProperty("com.fullstory.API_TRACE_ENABLED", Boolean.toString(this.f133228s)));
        this.f133224o = Integer.parseInt(properties.getProperty("com.fullstory.SESSION_SETUP_DELAY_MS", Integer.toString(this.f133224o)));
        this.f133225p = Integer.parseInt(properties.getProperty("com.fullstory.SESSION_TIME_LIMIT", Integer.toString(this.f133225p)));
        this.f133231v = Boolean.parseBoolean(properties.getProperty("com.fullstory.ENHANCED_REACT_NATIVE_SUPPORT", Boolean.toString(this.f133231v)));
        this.f133187F = Boolean.parseBoolean(properties.getProperty("com.fullstory.IS_REACT_NATIVE", Boolean.toString(this.f133187F)));
        this.f133188G = Boolean.parseBoolean(properties.getProperty("com.fullstory.IS_CORDOVA", Boolean.toString(this.f133188G)));
        this.f133189H = Boolean.parseBoolean(properties.getProperty("com.fullstory.IS_IONIC", Boolean.toString(this.f133189H)));
        this.f133190I = Boolean.parseBoolean(properties.getProperty("com.fullstory.IS_CAPACITOR", Boolean.toString(this.f133190I)));
        this.f133191J = Boolean.parseBoolean(properties.getProperty("com.fullstory.IS_FLUTTER", Boolean.toString(this.f133191J)));
        this.f133232w = Boolean.parseBoolean(properties.getProperty("com.fullstory.RECORD_ON_START", Boolean.toString(this.f133232w)));
        this.f133226q = Integer.parseInt(properties.getProperty("com.fullstory.LOW_MEMORY_PERCENT", Integer.toString(this.f133226q)));
        this.f133234y = Boolean.parseBoolean(properties.getProperty("com.fullstory.MASK_ASSETS", Boolean.toString(this.f133234y)));
        this.f133182A = Boolean.parseBoolean(properties.getProperty("com.fullstory.BUG_REPORTING_ENABLED", Boolean.toString(this.f133182A)));
        this.f133183B = Boolean.parseBoolean(properties.getProperty("com.fullstory.COMPOSE_SUPPORT", Boolean.toString(this.f133183B)));
        this.f133184C = Boolean.parseBoolean(properties.getProperty("com.fullstory.FRAGMENT_SUPPORT", Boolean.toString(this.f133184C)));
        this.f133185D = Boolean.parseBoolean(properties.getProperty("com.fullstory.OKHTTP_SUPPORT", Boolean.toString(this.f133185D)));
        this.f133186E = Boolean.parseBoolean(properties.getProperty("com.fullstory.URLCONNECTION_SUPPORT", Boolean.toString(this.f133186E)));
        this.f133193L = Integer.parseInt(properties.getProperty("com.fullstory.COMPOSE_SELECTOR_VERSION", Integer.toString(this.f133193L)));
        this.f133194M = Boolean.parseBoolean(properties.getProperty("com.fullstory.COMPOSE_AUTO_SELECTORS", Boolean.toString(this.f133194M)));
        this.f133195N = C14226fs.a(properties.getProperty("com.fullstory.COMPOSE_UI_VERSION"));
        this.f133203V = Boolean.parseBoolean(properties.getProperty("com.fullstory.LOG_PRIVACY_RULES", Boolean.toString(this.f133203V)));
        this.f133235z = properties.getProperty("com.fullstory.USER_ID", this.f133235z);
        this.f133202U = Boolean.parseBoolean(properties.getProperty("com.fullstory.WEBVIEW_INJECTION", Boolean.toString(this.f133202U)));
        this.f133199R = Boolean.parseBoolean(properties.getProperty("com.fullstory.PREVIEW_MODE_ENABLED", Boolean.toString(this.f133199R)));
        this.f133200S = a(properties, this.f133200S);
        this.f133201T = Integer.parseInt(properties.getProperty("com.fullstory.ASYNC_SLICE_NS", Long.toString(this.f133201T)));
        this.f133217h = Boolean.parseBoolean(properties.getProperty("com.fullstory.USE_PROXY_SERVER", Boolean.toString(this.f133217h)));
        this.f133192K = properties.getProperty("com.fullstory.WEBVIEW_NAMESPACE", this.f133192K);
        this.f133204W = Boolean.parseBoolean(properties.getProperty("com.fullstory.IGNORE_PROCESS_CHECK", Boolean.toString(this.f133204W)));
        this.f133206Y = properties.getProperty("com.fullstory.PROCESS_NAME", this.f133206Y);
        this.f133205X = Boolean.parseBoolean(properties.getProperty("com.fullstory.DISABLE_FORCED_ACCESSIBILITY", Boolean.toString(this.f133205X)));
        int i10 = this.f133226q;
        if (i10 < 1 || i10 > 100) {
            this.f133226q = 10;
        }
        C14226fs c14226fs = this.f133195N;
        if (c14226fs != null) {
            this.f133196O = c14226fs.a(1, 4);
            this.f133197P = this.f133195N.a(1, 5);
            this.f133198Q = this.f133195N.a(1, 7);
        } else {
            this.f133196O = false;
            this.f133197P = false;
            this.f133198Q = false;
        }
        for (String str2 : properties.getProperty("com.fullstory.INTERNAL_FLAGS", "").split(",")) {
            if (!str2.isEmpty()) {
                if (str2.equalsIgnoreCase("unmasked")) {
                    if (this.f133218i) {
                        this.f133233x = false;
                    }
                } else if (str2.equalsIgnoreCase("enableAssertions")) {
                    if (!C14228fu.f133537a) {
                        C14228fu.f133537a = true;
                        str = "Enabling assertions due to internal flag...";
                        Log.e(str);
                    }
                } else if (str2.equalsIgnoreCase("disableAssertions")) {
                    if (C14228fu.f133537a) {
                        C14228fu.f133537a = false;
                        str = "Disabling assertions due to internal flag...";
                        Log.e(str);
                    }
                } else if (str2.equalsIgnoreCase("enablePrivacyAssertions")) {
                    if (!C14228fu.f133538b) {
                        C14228fu.f133538b = true;
                        str = "Enabling privacy assertions due to internal flag...";
                        Log.e(str);
                    }
                } else if (str2.equalsIgnoreCase("disablePrivacyAssertions")) {
                    if (C14228fu.f133538b) {
                        C14228fu.f133538b = false;
                        str = "Disabling privacy assertions due to internal flag...";
                        Log.e(str);
                    }
                } else if (str2.equalsIgnoreCase("useLocalProps")) {
                    this.f133219j = true;
                } else {
                    str = "Unknown internal flag, ignored: " + str2;
                    Log.e(str);
                }
            }
        }
        if (C14228fu.f133538b && !C14228fu.f133537a) {
            C14228fu.f133537a = true;
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

    private C14138ck c(Context context) {
        try {
            InputStream inputStreamOpen = context.getAssets().open("fs-config.properties");
            try {
                C14138ck c14138ckA = a(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                if (c14138ckA.f133219j) {
                    try {
                        File externalFilesDir = context.getExternalFilesDir(null);
                        if (externalFilesDir != null && externalFilesDir.exists()) {
                            File file = new File(externalFilesDir, "fs-config.properties");
                            if (file.exists()) {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                try {
                                    C14138ck c14138ckA2 = a(fileInputStream);
                                    fileInputStream.close();
                                    c14138ckA = c14138ckA2;
                                } finally {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        dI.a(-32763, "Error initializing configuration", th2);
                        return null;
                    }
                }
                if (c14138ckA.f133235z != null) {
                    new X(context).a("FullStoryUserId", c14138ckA.f133235z);
                }
                return c14138ckA;
            } finally {
            }
        } catch (Throwable th3) {
            dI.a(-32763, "Error initializing configuration", th3);
            return null;
        }
    }

    public boolean A() {
        return this.f133197P;
    }

    public boolean B() {
        return this.f133198Q;
    }

    public boolean C() {
        return this.f133185D;
    }

    public boolean D() {
        return this.f133186E;
    }

    public boolean E() {
        return this.f133184C;
    }

    public Map F() {
        return this.f133208aa;
    }

    public Map G() {
        return this.f133210ac;
    }

    public Map H() {
        return this.f133209ab;
    }

    public Map I() {
        return this.f133211ad;
    }

    public boolean J() {
        return this.f133187F;
    }

    public boolean K() {
        return this.f133188G;
    }

    public boolean L() {
        return this.f133189H;
    }

    public boolean M() {
        return this.f133190I;
    }

    public boolean N() {
        return this.f133191J;
    }

    public boolean O() {
        return a(false);
    }

    public byte P() {
        return this.f133200S;
    }

    public long Q() {
        return this.f133201T;
    }

    public boolean R() {
        return this.f133202U;
    }

    public boolean S() {
        return this.f133203V;
    }

    public boolean T() {
        return this.f133217h;
    }

    public String U() {
        return this.f133192K;
    }

    public boolean V() {
        return this.f133204W;
    }

    public String W() {
        return this.f133206Y;
    }

    public boolean X() {
        return this.f133205X;
    }

    public String a(String str) {
        return (str == null || this.f133220k || T()) ? this.f133216g : str;
    }

    public List a(Context context, FSRuntimeConfigEditor.Applier applier) {
        C14139cl c14139cl = new C14139cl(this);
        applier.apply(c14139cl);
        return c14139cl.a(context);
    }

    public void a() {
        Log.i("*** Configuration:");
        Log.i("  buildId = " + this.f133212c);
        Log.i("  serverRoot = " + this.f133213d);
        Log.i("  appServerRoot = " + this.f133215f);
        Log.i("  recorderRoot = " + this.f133216g);
        Log.i("  isRecorderLocal = " + this.f133220k);
        Log.i("  orgId = " + this.f133221l);
        Log.i("  minApi = " + this.f133222m);
        Log.i("  maxApi = " + this.f133223n);
        Log.i("  verboseLogging = " + this.f133227r);
        Log.i("  apiTraceEnabled = " + this.f133228s);
        Log.i("  sessionSetupDelayMs = " + this.f133224o);
        Log.i("  sessionTimeLimit (sec.) = " + this.f133225p);
        Log.i("  masked = " + this.f133233x);
        Log.i("  mask assets = " + this.f133234y);
        Log.i("  appScheme = " + this.f133214e);
        Log.i("  isFromHans = " + this.f133218i);
        Log.i("  enhancedReactNativeSupport = " + this.f133231v);
        Log.i("  logLevel = " + this.f133229t);
        Log.i("  parsed logLevel = " + Log.getLevel());
        Log.i("  logcatLevel = " + this.f133230u);
        Log.i("  parsed logcatLevel = " + Log.getLogcatLevel());
        Log.i("  low mem % = " + this.f133226q);
        Log.i("  bugReportingEnabled = " + this.f133182A);
        Log.i("  composeSupport = " + this.f133183B);
        Log.i("  fragmentSupport = " + this.f133184C);
        Log.i("  okHttpSupport = " + this.f133185D);
        Log.i("  urlConnectionSupport = " + this.f133186E);
        Log.i("  composeSelectorVersion = " + this.f133193L);
        Log.i("  composeAutoSelectorsEnabled = " + this.f133194M);
        Log.i("  composeUiVersion = " + this.f133195N);
        Log.i("  webViewInjectionEnabled = " + this.f133202U);
        Log.i("  isLogPrivacyRules = " + this.f133203V);
        a("previewModeEnabled", Boolean.valueOf(O()), Boolean.valueOf(this.f133199R));
        Log.i("  viewScanType = " + dC.a(this.f133200S));
        Log.i("  useProxyServer = " + this.f133217h);
        Log.i("  webViewNamespace = " + this.f133192K);
        Log.i("  ignoreProcessCheck = " + this.f133204W);
        Log.i("  processName = " + this.f133206Y);
        Log.i("  disableForcedAccessibility = " + this.f133205X);
    }

    public boolean a(boolean z10) {
        Boolean boolA = z10 ? null : f133181b.a();
        return boolA != null ? boolA.booleanValue() : this.f133199R;
    }

    public boolean b() {
        return this.f133218i;
    }

    public synchronized boolean b(Context context) {
        if (this.f133207Z) {
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
                        this.f133211ad.put(Integer.valueOf(b(str.substring("mapping-fsclass:".length()))), str2);
                    }
                    if (str.startsWith("mapping-name:")) {
                        this.f133208aa.put(str2, Integer.valueOf(b(str.substring("mapping-name:".length()))));
                    }
                    if (str.startsWith("mapping-sha256:")) {
                        this.f133210ac.put(Integer.valueOf(b(str.substring("mapping-sha256:".length()))), str2);
                    }
                    if (str.startsWith("asset:")) {
                        this.f133209ab.put(str.substring("asset:".length()), Integer.valueOf(b(str2)));
                    }
                }
                Log.d("Loaded mappings: " + this.f133212c + ", " + this.f133213d);
                this.f133207Z = true;
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
        return this.f133233x;
    }

    public boolean d() {
        return this.f133234y;
    }

    public int e() {
        return this.f133224o;
    }

    public int f() {
        return this.f133225p;
    }

    public String g() {
        return this.f133212c;
    }

    public String h() {
        String str = this.f133214e;
        return str != null ? str : "";
    }

    public String i() {
        return this.f133213d;
    }

    public String j() {
        return this.f133215f;
    }

    public String k() {
        return this.f133216g;
    }

    public String l() {
        return this.f133221l;
    }

    public int m() {
        return this.f133222m;
    }

    public int n() {
        return this.f133223n;
    }

    public boolean o() {
        return this.f133227r;
    }

    public boolean p() {
        return this.f133228s;
    }

    public boolean q() {
        return this.f133231v;
    }

    public String r() {
        return this.f133229t;
    }

    public String s() {
        return this.f133230u;
    }

    public boolean t() {
        return this.f133232w;
    }

    public int u() {
        return this.f133226q;
    }

    public boolean v() {
        return this.f133182A;
    }

    public boolean w() {
        return this.f133183B;
    }

    public int x() {
        return this.f133193L;
    }

    public boolean y() {
        return this.f133194M;
    }

    public boolean z() {
        return this.f133196O;
    }
}
