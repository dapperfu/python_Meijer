package qf;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import Vd.InterfaceC5515i;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.fullstory.FS;
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
import kg.C15123a;
import nf.InterfaceC15938a;
import of.InterfaceC16119a;
import qf.D;
import rf.C16898b;
import sf.EventMetadata;
import tf.AbstractC17251F;
import tf.AbstractC17252G;
import yf.C18311d;

/* renamed from: qf.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C16656p {

    /* renamed from: t, reason: collision with root package name */
    static final FilenameFilter f158382t = new FilenameFilter() { // from class: qf.o
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private static final Charset f158383u = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Context f158384a;

    /* renamed from: b, reason: collision with root package name */
    private final F f158385b;

    /* renamed from: c, reason: collision with root package name */
    private final C16640A f158386c;

    /* renamed from: d, reason: collision with root package name */
    private final sf.p f158387d;

    /* renamed from: e, reason: collision with root package name */
    private final rf.i f158388e;

    /* renamed from: f, reason: collision with root package name */
    private final K f158389f;

    /* renamed from: g, reason: collision with root package name */
    private final wf.g f158390g;

    /* renamed from: h, reason: collision with root package name */
    private final C16641a f158391h;

    /* renamed from: i, reason: collision with root package name */
    private final sf.f f158392i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC15938a f158393j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC16119a f158394k;

    /* renamed from: l, reason: collision with root package name */
    private final C16653m f158395l;

    /* renamed from: m, reason: collision with root package name */
    private final a0 f158396m;

    /* renamed from: n, reason: collision with root package name */
    private D f158397n;

    /* renamed from: o, reason: collision with root package name */
    private yf.j f158398o = null;

    /* renamed from: p, reason: collision with root package name */
    final C5517k<Boolean> f158399p = new C5517k<>();

    /* renamed from: q, reason: collision with root package name */
    final C5517k<Boolean> f158400q = new C5517k<>();

    /* renamed from: r, reason: collision with root package name */
    final C5517k<Void> f158401r = new C5517k<>();

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f158402s = new AtomicBoolean(false);

    /* renamed from: qf.p$a */
    class a implements D.a {
        a() {
        }

        @Override // qf.D.a
        public void a(yf.j jVar, Thread thread, Throwable th2) throws Throwable {
            C16656p.this.G(jVar, thread, th2);
        }
    }

    /* renamed from: qf.p$b */
    class b implements Callable<AbstractC5516j<Void>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f158404a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f158405b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f158406c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ yf.j f158407d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f158408e;

        /* renamed from: qf.p$b$a */
        class a implements InterfaceC5515i<C18311d, Void> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f158410a;

            @Override // Vd.InterfaceC5515i
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC5516j<Void> then(C18311d c18311d) throws Exception {
                if (c18311d != null) {
                    return C5519m.h(C16656p.this.L(), C16656p.this.f158396m.z(C16656p.this.f158388e.common, b.this.f158408e ? this.f158410a : null));
                }
                nf.g.f().k("Received null app settings, cannot send reports at crash time.");
                return C5519m.f(null);
            }

            a(String str) {
                this.f158410a = str;
            }
        }

        b(long j10, Throwable th2, Thread thread, yf.j jVar, boolean z10) {
            this.f158404a = j10;
            this.f158405b = th2;
            this.f158406c = thread;
            this.f158407d = jVar;
            this.f158408e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC5516j<Void> call() throws Exception {
            long jE = C16656p.E(this.f158404a);
            String strA = C16656p.this.A();
            if (strA == null) {
                nf.g.f().d("Tried to write a fatal exception while no session was open.");
                return C5519m.f(null);
            }
            C16656p.this.f158386c.a();
            C16656p.this.f158396m.u(this.f158405b, this.f158406c, strA, jE);
            C16656p.this.v(this.f158404a);
            C16656p.this.s(this.f158407d);
            C16656p.this.u(new C16648h().c(), Boolean.valueOf(this.f158408e));
            return !C16656p.this.f158385b.d() ? C5519m.f(null) : this.f158407d.a().t(C16656p.this.f158388e.common, new a(strA));
        }
    }

    /* renamed from: qf.p$c */
    class c implements InterfaceC5515i<Void, Boolean> {
        c() {
        }

        @Override // Vd.InterfaceC5515i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC5516j<Boolean> then(Void r12) throws Exception {
            return C5519m.f(Boolean.TRUE);
        }
    }

    /* renamed from: qf.p$d */
    class d implements InterfaceC5515i<Boolean, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5516j f158413a;

        /* renamed from: qf.p$d$a */
        class a implements InterfaceC5515i<C18311d, Void> {
            @Override // Vd.InterfaceC5515i
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC5516j<Void> then(C18311d c18311d) throws Exception {
                if (c18311d == null) {
                    nf.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return C5519m.f(null);
                }
                C16656p.this.L();
                C16656p.this.f158396m.y(C16656p.this.f158388e.common);
                C16656p.this.f158401r.e(null);
                return C5519m.f(null);
            }

            a() {
            }
        }

        d(AbstractC5516j abstractC5516j) {
            this.f158413a = abstractC5516j;
        }

        @Override // Vd.InterfaceC5515i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC5516j<Void> then(Boolean bool) throws Exception {
            if (!bool.booleanValue()) {
                nf.g.f().i("Deleting cached crash reports...");
                C16656p.q(C16656p.this.J());
                C16656p.this.f158396m.x();
                C16656p.this.f158401r.e(null);
                return C5519m.f(null);
            }
            nf.g.f().b("Sending cached crash reports...");
            C16656p.this.f158385b.c(bool.booleanValue());
            return this.f158413a.t(C16656p.this.f158388e.common, new a());
        }
    }

    /* renamed from: qf.p$e */
    class e implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f158416a;

        e(long j10) {
            this.f158416a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f158416a);
            C16656p.this.f158394k.a("_ae", bundle);
            return null;
        }
    }

    void G(yf.j jVar, Thread thread, Throwable th2) throws Throwable {
        H(jVar, thread, th2, false);
    }

    synchronized void H(yf.j jVar, Thread thread, Throwable th2, boolean z10) throws Throwable {
        Throwable th3;
        try {
            try {
                nf.g.f().b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
                if (!z10) {
                    try {
                        C15123a.b();
                    } catch (Throwable th4) {
                        th3 = th4;
                        throw th3;
                    }
                }
                AbstractC5516j abstractC5516jE = this.f158388e.common.e(new b(System.currentTimeMillis(), th2, thread, jVar, z10));
                if (!z10) {
                    try {
                        d0.b(abstractC5516jE);
                    } catch (TimeoutException unused) {
                        nf.g.f().d("Cannot send reports. Timed out while fetching settings.");
                    } catch (Exception e10) {
                        nf.g.f().e("Error handling uncaught exception", e10);
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

    void s(yf.j jVar) throws IOException {
        t(false, jVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A() {
        SortedSet<String> sortedSetQ = this.f158396m.q();
        if (sortedSetQ.isEmpty()) {
            return null;
        }
        return sortedSetQ.first();
    }

    static List<N> C(nf.h hVar, String str, wf.g gVar, byte[] bArr) {
        File fileQ = gVar.q(str, "user-data");
        File fileQ2 = gVar.q(str, "keys");
        File fileQ3 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C16647g("logs_file", "logs", bArr));
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
    public AbstractC5516j<Void> L() {
        ArrayList arrayList = new ArrayList();
        for (File file : J()) {
            try {
                arrayList.add(K(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                nf.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return C5519m.g(arrayList);
    }

    private static boolean M(String str, File file, AbstractC17251F.a aVar) {
        if (file == null || !file.exists()) {
            nf.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            nf.g.f().g("No Tombstones data found for session " + str);
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

    private AbstractC5516j<Boolean> V() {
        if (this.f158385b.d()) {
            nf.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f158399p.e(Boolean.FALSE);
            return C5519m.f(Boolean.TRUE);
        }
        nf.g.f().b("Automatic data collection is disabled.");
        nf.g.f().i("Notifying that unsent reports are available.");
        this.f158399p.e(Boolean.TRUE);
        AbstractC5516j<TContinuationResult> abstractC5516jS = this.f158385b.j().s(new c());
        nf.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return C16898b.b(abstractC5516jS, this.f158400q.a());
    }

    private void W(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            nf.g.f().i("ANR feature enabled, but device is API " + i10);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f158384a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f158396m.w(str, historicalProcessExitReasons, new sf.f(this.f158390g, str), sf.p.k(str, this.f158390g, this.f158388e));
        } else {
            nf.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static AbstractC17252G.b o(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC17252G.b.c(C16649i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C16649i.b(context), statFs.getBlockCount() * statFs.getBlockSize(), C16649i.x(), C16649i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static AbstractC17252G.c p() {
        return AbstractC17252G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C16649i.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(long j10) throws IOException {
        try {
            if (this.f158390g.g(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            nf.g.f().l("Could not create app exception marker file.", e10);
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
        String strR = C16649i.r(this.f158384a);
        if (strR != null) {
            nf.g.f().b("Read version control info from string resource");
            return Base64.encodeToString(strR.getBytes(f158383u), 0);
        }
        InputStream inputStreamD = D("META-INF/version-control-info.textproto");
        if (inputStreamD == null) {
            if (inputStreamD != null) {
                inputStreamD.close();
            }
            nf.g.f().g("No version control information found");
            return null;
        }
        try {
            nf.g.f().b("Read version control info from file");
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
        D d10 = this.f158397n;
        return d10 != null && d10.a();
    }

    List<File> J() {
        return this.f158390g.h(f158382t);
    }

    void O(final String str) {
        this.f158388e.common.d(new Runnable() { // from class: qf.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f158380a.u(str, Boolean.FALSE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(String str, String str2) {
        try {
            this.f158387d.n(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f158384a;
            if (context != null && C16649i.v(context)) {
                throw e10;
            }
            nf.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void S(String str, String str2) {
        try {
            this.f158387d.o(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f158384a;
            if (context != null && C16649i.v(context)) {
                throw e10;
            }
            nf.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(String str) {
        this.f158387d.q(str);
    }

    void U(AbstractC5516j<C18311d> abstractC5516j) {
        if (this.f158396m.p()) {
            nf.g.f().i("Crash reports are available to be sent.");
            V().t(this.f158388e.common, new d(abstractC5516j));
        } else {
            nf.g.f().i("No crash reports are available to be sent.");
            this.f158399p.e(Boolean.FALSE);
        }
    }

    void w(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, yf.j jVar) {
        this.f158398o = jVar;
        O(str);
        D d10 = new D(new a(), jVar, uncaughtExceptionHandler, this.f158393j);
        this.f158397n = d10;
        FS.setDefaultUncaughtExceptionHandler(d10);
    }

    C16656p(Context context, K k10, F f10, wf.g gVar, C16640A c16640a, C16641a c16641a, sf.p pVar, sf.f fVar, a0 a0Var, InterfaceC15938a interfaceC15938a, InterfaceC16119a interfaceC16119a, C16653m c16653m, rf.i iVar) {
        this.f158384a = context;
        this.f158389f = k10;
        this.f158385b = f10;
        this.f158390g = gVar;
        this.f158386c = c16640a;
        this.f158391h = c16641a;
        this.f158387d = pVar;
        this.f158392i = fVar;
        this.f158393j = interfaceC15938a;
        this.f158394k = interfaceC16119a;
        this.f158395l = c16653m;
        this.f158396m = a0Var;
        this.f158388e = iVar;
    }

    private static long B() {
        return E(System.currentTimeMillis());
    }

    private InputStream D(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            nf.g.f().k("Couldn't get Class Loader");
            return null;
        }
        return classLoader.getResourceAsStream(str);
    }

    private AbstractC5516j<Void> K(long j10) {
        if (z()) {
            nf.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C5519m.f(null);
        }
        nf.g.f().b("Logging app exception event to Firebase Analytics");
        return C5519m.c(new ScheduledThreadPoolExecutor(1), new e(j10));
    }

    private static N N(nf.h hVar) {
        File fileC = hVar.c();
        if (fileC != null && fileC.exists()) {
            return new I("minidump_file", "minidump", fileC);
        }
        return new C16647g("minidump_file", "minidump", new byte[]{0});
    }

    private static AbstractC17252G.a n(K k10, C16641a c16641a) {
        return AbstractC17252G.a.b(k10.f(), c16641a.f158331f, c16641a.f158332g, k10.a().c(), G.b(c16641a.f158329d).e(), c16641a.f158333h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(boolean z10, yf.j jVar, boolean z11) throws IOException {
        String str;
        rf.i.c();
        ArrayList arrayList = new ArrayList(this.f158396m.q());
        if (arrayList.size() <= z10) {
            nf.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (z11 && jVar.b().f171386b.f171394b) {
            W(str2);
        } else {
            nf.g.f().i("ANR feature disabled.");
        }
        if (z11 && this.f158393j.d(str2)) {
            x(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f158395l.e(null);
            str = null;
        }
        this.f158396m.m(B(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str, Boolean bool) {
        long jB = B();
        nf.g.f().b("Opening a new session with ID " + str);
        this.f158393j.c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C16665z.n()), jB, AbstractC17252G.b(n(this.f158389f, this.f158391h), p(), o(this.f158384a)));
        if (bool.booleanValue() && str != null) {
            this.f158387d.p(str);
        }
        this.f158392i.e(str);
        this.f158395l.e(str);
        this.f158396m.r(str, jB);
    }

    private void x(String str) throws IOException {
        nf.g.f().i("Finalizing native report for session " + str);
        nf.h hVarA = this.f158393j.a(str);
        File fileC = hVarA.c();
        AbstractC17251F.a aVarB = hVarA.b();
        if (M(str, fileC, aVarB)) {
            nf.g.f().k("No native core present");
            return;
        }
        long jLastModified = fileC.lastModified();
        sf.f fVar = new sf.f(this.f158390g, str);
        File fileK = this.f158390g.k(str);
        if (!fileK.isDirectory()) {
            nf.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        v(jLastModified);
        List<N> listC = C(hVarA, str, this.f158390g, fVar.b());
        O.b(fileK, listC);
        nf.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f158396m.l(str, listC, aVarB);
        fVar.a();
    }

    void Q() {
        try {
            String strF = F();
            if (strF != null) {
                S("com.crashlytics.version-control-info", strF);
                nf.g.f().g("Saved version control info");
            }
        } catch (IOException e10) {
            nf.g.f().l("Unable to save version control info", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(Thread thread, Throwable th2, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!I()) {
            long jE = E(jCurrentTimeMillis);
            String strA = A();
            if (strA == null) {
                nf.g.f().k("Tried to write a non-fatal exception while no session was open.");
            } else {
                this.f158396m.v(th2, thread, new EventMetadata(strA, jE, map));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(long j10, String str) {
        if (!I()) {
            this.f158392i.g(j10, str);
        }
    }

    boolean r() {
        rf.i.c();
        if (!this.f158386c.c()) {
            String strA = A();
            if (strA != null && this.f158393j.d(strA)) {
                return true;
            }
            return false;
        }
        nf.g.f().i("Found previous crash marker.");
        this.f158386c.d();
        return true;
    }

    boolean y(yf.j jVar) {
        rf.i.c();
        if (I()) {
            nf.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        nf.g.f().i("Finalizing previously open sessions.");
        try {
            t(true, jVar, true);
            nf.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            nf.g.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }
}
