package of;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import Td.InterfaceC5231i;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.fullstory.FS;
import ig.C14719a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.InterfaceC15404a;
import mf.InterfaceC15609a;
import of.D;
import pf.C16294b;
import qf.EventMetadata;
import rf.AbstractC16777F;
import rf.AbstractC16778G;
import wf.C17818d;

/* renamed from: of.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C16048p {

    /* renamed from: t, reason: collision with root package name */
    static final FilenameFilter f153530t = new FilenameFilter() { // from class: of.o
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private static final Charset f153531u = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Context f153532a;

    /* renamed from: b, reason: collision with root package name */
    private final F f153533b;

    /* renamed from: c, reason: collision with root package name */
    private final C16032A f153534c;

    /* renamed from: d, reason: collision with root package name */
    private final qf.p f153535d;

    /* renamed from: e, reason: collision with root package name */
    private final pf.i f153536e;

    /* renamed from: f, reason: collision with root package name */
    private final K f153537f;

    /* renamed from: g, reason: collision with root package name */
    private final uf.g f153538g;

    /* renamed from: h, reason: collision with root package name */
    private final C16033a f153539h;

    /* renamed from: i, reason: collision with root package name */
    private final qf.f f153540i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC15404a f153541j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC15609a f153542k;

    /* renamed from: l, reason: collision with root package name */
    private final C16045m f153543l;

    /* renamed from: m, reason: collision with root package name */
    private final a0 f153544m;

    /* renamed from: n, reason: collision with root package name */
    private D f153545n;

    /* renamed from: o, reason: collision with root package name */
    private wf.j f153546o = null;

    /* renamed from: p, reason: collision with root package name */
    final C5233k<Boolean> f153547p = new C5233k<>();

    /* renamed from: q, reason: collision with root package name */
    final C5233k<Boolean> f153548q = new C5233k<>();

    /* renamed from: r, reason: collision with root package name */
    final C5233k<Void> f153549r = new C5233k<>();

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f153550s = new AtomicBoolean(false);

    /* renamed from: of.p$a */
    class a implements D.a {
        a() {
        }

        @Override // of.D.a
        public void a(wf.j jVar, Thread thread, Throwable th2) throws Throwable {
            C16048p.this.G(jVar, thread, th2);
        }
    }

    /* renamed from: of.p$b */
    class b implements Callable<AbstractC5232j<Void>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f153552a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f153553b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f153554c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ wf.j f153555d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f153556e;

        /* renamed from: of.p$b$a */
        class a implements InterfaceC5231i<C17818d, Void> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f153558a;

            @Override // Td.InterfaceC5231i
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC5232j<Void> then(C17818d c17818d) throws Exception {
                if (c17818d != null) {
                    return C5235m.h(C16048p.this.L(), C16048p.this.f153544m.z(C16048p.this.f153536e.common, b.this.f153556e ? this.f153558a : null));
                }
                lf.g.f().k("Received null app settings, cannot send reports at crash time.");
                return C5235m.f(null);
            }

            a(String str) {
                this.f153558a = str;
            }
        }

        b(long j10, Throwable th2, Thread thread, wf.j jVar, boolean z10) {
            this.f153552a = j10;
            this.f153553b = th2;
            this.f153554c = thread;
            this.f153555d = jVar;
            this.f153556e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC5232j<Void> call() throws Exception {
            long jE = C16048p.E(this.f153552a);
            String strA = C16048p.this.A();
            if (strA == null) {
                lf.g.f().d("Tried to write a fatal exception while no session was open.");
                return C5235m.f(null);
            }
            C16048p.this.f153534c.a();
            C16048p.this.f153544m.u(this.f153553b, this.f153554c, strA, jE);
            C16048p.this.v(this.f153552a);
            C16048p.this.s(this.f153555d);
            C16048p.this.u(new C16040h().c(), Boolean.valueOf(this.f153556e));
            return !C16048p.this.f153533b.d() ? C5235m.f(null) : this.f153555d.a().t(C16048p.this.f153536e.common, new a(strA));
        }
    }

    /* renamed from: of.p$c */
    class c implements InterfaceC5231i<Void, Boolean> {
        c() {
        }

        @Override // Td.InterfaceC5231i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC5232j<Boolean> then(Void r12) throws Exception {
            return C5235m.f(Boolean.TRUE);
        }
    }

    /* renamed from: of.p$d */
    class d implements InterfaceC5231i<Boolean, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5232j f153561a;

        /* renamed from: of.p$d$a */
        class a implements InterfaceC5231i<C17818d, Void> {
            @Override // Td.InterfaceC5231i
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC5232j<Void> then(C17818d c17818d) throws Exception {
                if (c17818d == null) {
                    lf.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return C5235m.f(null);
                }
                C16048p.this.L();
                C16048p.this.f153544m.y(C16048p.this.f153536e.common);
                C16048p.this.f153549r.e(null);
                return C5235m.f(null);
            }

            a() {
            }
        }

        d(AbstractC5232j abstractC5232j) {
            this.f153561a = abstractC5232j;
        }

        @Override // Td.InterfaceC5231i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC5232j<Void> then(Boolean bool) throws Exception {
            if (!bool.booleanValue()) {
                lf.g.f().i("Deleting cached crash reports...");
                C16048p.q(C16048p.this.J());
                C16048p.this.f153544m.x();
                C16048p.this.f153549r.e(null);
                return C5235m.f(null);
            }
            lf.g.f().b("Sending cached crash reports...");
            C16048p.this.f153533b.c(bool.booleanValue());
            return this.f153561a.t(C16048p.this.f153536e.common, new a());
        }
    }

    /* renamed from: of.p$e */
    class e implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f153564a;

        e(long j10) {
            this.f153564a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f153564a);
            C16048p.this.f153542k.a("_ae", bundle);
            return null;
        }
    }

    void G(wf.j jVar, Thread thread, Throwable th2) throws Throwable {
        H(jVar, thread, th2, false);
    }

    synchronized void H(wf.j jVar, Thread thread, Throwable th2, boolean z10) throws Throwable {
        Throwable th3;
        try {
            try {
                lf.g.f().b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
                if (!z10) {
                    try {
                        C14719a.b();
                    } catch (Throwable th4) {
                        th3 = th4;
                        throw th3;
                    }
                }
                AbstractC5232j abstractC5232jE = this.f153536e.common.e(new b(System.currentTimeMillis(), th2, thread, jVar, z10));
                if (!z10) {
                    try {
                        d0.b(abstractC5232jE);
                    } catch (TimeoutException unused) {
                        lf.g.f().d("Cannot send reports. Timed out while fetching settings.");
                    } catch (Exception e10) {
                        lf.g.f().e("Error handling uncaught exception", e10);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
                throw th3;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    void s(wf.j jVar) throws IOException {
        t(false, jVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A() {
        SortedSet<String> sortedSetQ = this.f153544m.q();
        if (sortedSetQ.isEmpty()) {
            return null;
        }
        return sortedSetQ.first();
    }

    static List<N> C(lf.h hVar, String str, uf.g gVar, byte[] bArr) {
        File fileQ = gVar.q(str, "user-data");
        File fileQ2 = gVar.q(str, "keys");
        File fileQ3 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C16039g("logs_file", "logs", bArr));
        arrayList.add(new I("crash_meta_file", "metadata", hVar.d()));
        arrayList.add(new I("session_meta_file", "session", hVar.g()));
        arrayList.add(new I("app_meta_file", "app", hVar.e()));
        arrayList.add(new I("device_meta_file", "device", hVar.a()));
        arrayList.add(new I("os_meta_file", "os", hVar.f()));
        arrayList.add(N(hVar));
        arrayList.add(new I("user_meta_file", "user", fileQ));
        arrayList.add(new I("keys_file", "keys", fileQ2));
        arrayList.add(new I("rollouts_file", "rollouts", fileQ3));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long E(long j10) {
        return j10 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC5232j<Void> L() {
        ArrayList arrayList = new ArrayList();
        for (File file : J()) {
            try {
                arrayList.add(K(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                lf.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return C5235m.g(arrayList);
    }

    private static boolean M(String str, File file, AbstractC16777F.a aVar) {
        if (file == null || !file.exists()) {
            lf.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            lf.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static byte[] P(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private AbstractC5232j<Boolean> V() {
        if (this.f153533b.d()) {
            lf.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f153547p.e(Boolean.FALSE);
            return C5235m.f(Boolean.TRUE);
        }
        lf.g.f().b("Automatic data collection is disabled.");
        lf.g.f().i("Notifying that unsent reports are available.");
        this.f153547p.e(Boolean.TRUE);
        AbstractC5232j<TContinuationResult> abstractC5232jS = this.f153533b.j().s(new c());
        lf.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return C16294b.b(abstractC5232jS, this.f153548q.a());
    }

    private void W(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            lf.g.f().i("ANR feature enabled, but device is API " + i10);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f153532a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f153544m.w(str, historicalProcessExitReasons, new qf.f(this.f153538g, str), qf.p.k(str, this.f153538g, this.f153536e));
        } else {
            lf.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static AbstractC16778G.b o(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC16778G.b.c(C16041i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C16041i.b(context), statFs.getBlockCount() * statFs.getBlockSize(), C16041i.x(), C16041i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static AbstractC16778G.c p() {
        return AbstractC16778G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C16041i.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(long j10) throws IOException {
        try {
            if (this.f153538g.g(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            lf.g.f().l("Could not create app exception marker file.", e10);
        }
    }

    private static boolean z() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    String F() throws IOException {
        String strR = C16041i.r(this.f153532a);
        if (strR != null) {
            lf.g.f().b("Read version control info from string resource");
            return Base64.encodeToString(strR.getBytes(f153531u), 0);
        }
        InputStream inputStreamD = D("META-INF/version-control-info.textproto");
        if (inputStreamD == null) {
            if (inputStreamD != null) {
                inputStreamD.close();
            }
            lf.g.f().g("No version control information found");
            return null;
        }
        try {
            lf.g.f().b("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(P(inputStreamD), 0);
            inputStreamD.close();
            return strEncodeToString;
        } catch (Throwable th2) {
            try {
                inputStreamD.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    boolean I() {
        D d10 = this.f153545n;
        return d10 != null && d10.a();
    }

    List<File> J() {
        return this.f153538g.h(f153530t);
    }

    void O(final String str) {
        this.f153536e.common.d(new Runnable() { // from class: of.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f153528a.u(str, Boolean.FALSE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(String str, String str2) {
        try {
            this.f153535d.n(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f153532a;
            if (context != null && C16041i.v(context)) {
                throw e10;
            }
            lf.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void S(String str, String str2) {
        try {
            this.f153535d.o(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f153532a;
            if (context != null && C16041i.v(context)) {
                throw e10;
            }
            lf.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(String str) {
        this.f153535d.q(str);
    }

    void U(AbstractC5232j<C17818d> abstractC5232j) {
        if (this.f153544m.p()) {
            lf.g.f().i("Crash reports are available to be sent.");
            V().t(this.f153536e.common, new d(abstractC5232j));
        } else {
            lf.g.f().i("No crash reports are available to be sent.");
            this.f153547p.e(Boolean.FALSE);
        }
    }

    void w(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, wf.j jVar) {
        this.f153546o = jVar;
        O(str);
        D d10 = new D(new a(), jVar, uncaughtExceptionHandler, this.f153541j);
        this.f153545n = d10;
        FS.setDefaultUncaughtExceptionHandler(d10);
    }

    C16048p(Context context, K k10, F f10, uf.g gVar, C16032A c16032a, C16033a c16033a, qf.p pVar, qf.f fVar, a0 a0Var, InterfaceC15404a interfaceC15404a, InterfaceC15609a interfaceC15609a, C16045m c16045m, pf.i iVar) {
        this.f153532a = context;
        this.f153537f = k10;
        this.f153533b = f10;
        this.f153538g = gVar;
        this.f153534c = c16032a;
        this.f153539h = c16033a;
        this.f153535d = pVar;
        this.f153540i = fVar;
        this.f153541j = interfaceC15404a;
        this.f153542k = interfaceC15609a;
        this.f153543l = c16045m;
        this.f153544m = a0Var;
        this.f153536e = iVar;
    }

    private static long B() {
        return E(System.currentTimeMillis());
    }

    private InputStream D(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            lf.g.f().k("Couldn't get Class Loader");
            return null;
        }
        return classLoader.getResourceAsStream(str);
    }

    private AbstractC5232j<Void> K(long j10) {
        if (z()) {
            lf.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C5235m.f(null);
        }
        lf.g.f().b("Logging app exception event to Firebase Analytics");
        return C5235m.c(new ScheduledThreadPoolExecutor(1), new e(j10));
    }

    private static N N(lf.h hVar) {
        File fileC = hVar.c();
        if (fileC != null && fileC.exists()) {
            return new I("minidump_file", "minidump", fileC);
        }
        return new C16039g("minidump_file", "minidump", new byte[]{0});
    }

    private static AbstractC16778G.a n(K k10, C16033a c16033a) {
        return AbstractC16778G.a.b(k10.f(), c16033a.f153479f, c16033a.f153480g, k10.a().c(), G.b(c16033a.f153477d).e(), c16033a.f153481h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(boolean z10, wf.j jVar, boolean z11) throws IOException {
        String str;
        pf.i.c();
        ArrayList arrayList = new ArrayList(this.f153544m.q());
        if (arrayList.size() <= z10) {
            lf.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (z11 && jVar.b().f166064b.f166072b) {
            W(str2);
        } else {
            lf.g.f().i("ANR feature disabled.");
        }
        if (z11 && this.f153541j.d(str2)) {
            x(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f153543l.e(null);
            str = null;
        }
        this.f153544m.m(B(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str, Boolean bool) {
        long jB = B();
        lf.g.f().b("Opening a new session with ID " + str);
        this.f153541j.c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C16057z.n()), jB, AbstractC16778G.b(n(this.f153537f, this.f153539h), p(), o(this.f153532a)));
        if (bool.booleanValue() && str != null) {
            this.f153535d.p(str);
        }
        this.f153540i.e(str);
        this.f153543l.e(str);
        this.f153544m.r(str, jB);
    }

    private void x(String str) throws IOException {
        lf.g.f().i("Finalizing native report for session " + str);
        lf.h hVarA = this.f153541j.a(str);
        File fileC = hVarA.c();
        AbstractC16777F.a aVarB = hVarA.b();
        if (M(str, fileC, aVarB)) {
            lf.g.f().k("No native core present");
            return;
        }
        long jLastModified = fileC.lastModified();
        qf.f fVar = new qf.f(this.f153538g, str);
        File fileK = this.f153538g.k(str);
        if (!fileK.isDirectory()) {
            lf.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        v(jLastModified);
        List<N> listC = C(hVarA, str, this.f153538g, fVar.b());
        O.b(fileK, listC);
        lf.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f153544m.l(str, listC, aVarB);
        fVar.a();
    }

    void Q() {
        try {
            String strF = F();
            if (strF != null) {
                S("com.crashlytics.version-control-info", strF);
                lf.g.f().g("Saved version control info");
            }
        } catch (IOException e10) {
            lf.g.f().l("Unable to save version control info", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(Thread thread, Throwable th2, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!I()) {
            long jE = E(jCurrentTimeMillis);
            String strA = A();
            if (strA == null) {
                lf.g.f().k("Tried to write a non-fatal exception while no session was open.");
            } else {
                this.f153544m.v(th2, thread, new EventMetadata(strA, jE, map));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(long j10, String str) {
        if (!I()) {
            this.f153540i.g(j10, str);
        }
    }

    boolean r() {
        pf.i.c();
        if (!this.f153534c.c()) {
            String strA = A();
            if (strA != null && this.f153541j.d(strA)) {
                return true;
            }
            return false;
        }
        lf.g.f().i("Found previous crash marker.");
        this.f153534c.d();
        return true;
    }

    boolean y(wf.j jVar) {
        pf.i.c();
        if (I()) {
            lf.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        lf.g.f().i("Finalizing previously open sessions.");
        try {
            t(true, jVar, true);
            lf.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            lf.g.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }
}
