package w6;

import F.k0;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.cyberfend.cyfsecurity.SensorDataBuilder;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import w6.C17788j.b;

/* renamed from: w6.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17776C implements InterfaceC17786h {

    /* renamed from: n, reason: collision with root package name */
    private static final ArrayList<Integer> f165737n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    private static boolean f165738o = false;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f165739p = false;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f165740q = false;

    /* renamed from: j, reason: collision with root package name */
    private int f165750j;

    /* renamed from: a, reason: collision with root package name */
    public W f165741a = null;

    /* renamed from: b, reason: collision with root package name */
    public C17778E f165742b = null;

    /* renamed from: c, reason: collision with root package name */
    public J f165743c = null;

    /* renamed from: d, reason: collision with root package name */
    public C17783e f165744d = null;

    /* renamed from: e, reason: collision with root package name */
    private C17799v f165745e = null;

    /* renamed from: f, reason: collision with root package name */
    public y f165746f = null;

    /* renamed from: g, reason: collision with root package name */
    private U f165747g = null;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f165748h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private Handler f165749i = null;

    /* renamed from: k, reason: collision with root package name */
    private Date f165751k = null;

    /* renamed from: l, reason: collision with root package name */
    private boolean f165752l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f165753m = true;

    /* renamed from: w6.C$a */
    final class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            C17776C.this.a();
            C17776C.this.f165748h.compareAndSet(true, false);
        }
    }

    /* renamed from: w6.C$b */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.cyberfend.cyfsecurity.a.n()) {
                C17776C.this.s();
                C17776C.this.p();
                C17776C.this.r();
                C17776C.this.n();
            }
        }
    }

    private synchronized void l(Application application, String str, String str2) {
        if (application != null) {
            try {
                if (this.f165746f != null) {
                    this.f165751k = new Date();
                    y yVar = this.f165746f;
                    try {
                        yVar.f165967b = application;
                        yVar.f165969d = str;
                        yVar.f165970e = str2;
                        yVar.a();
                    } catch (Exception e10) {
                        C17774A.a(e10);
                    }
                }
            } catch (Exception e11) {
                C17774A.a(e11);
            }
        }
    }

    public final synchronized String a() {
        try {
            r.c("CYFManager", "Getting sensor data", new Throwable[0]);
            String strV = "default-mobile";
            try {
            } catch (Exception e10) {
                r.e("CYFManager", "Failed to get sensor data", e10);
                C17774A.a(e10);
            }
            if (this.f165742b != null && this.f165743c != null) {
                strV = v();
                r.c("CYFManager", "Sensor Data: ".concat(String.valueOf(strV)), new Throwable[0]);
                return strV;
            }
            r.e("CYFManager", "AkamaiBMP SDK is not initialized", new Throwable[0]);
            return "default-mobile";
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(int i10) {
        this.f165750j = i10;
    }

    public final synchronized void d(Application application) {
        if (this.f165743c != null) {
            return;
        }
        this.f165743c = new J(application, this);
    }

    public final synchronized void e(Application application, String str, String str2) {
        if (application != null) {
            if (!f165740q) {
                if (this.f165746f != null) {
                    return;
                }
                this.f165751k = new Date();
                this.f165746f = new y(application, str, str2);
                f165740q = true;
                i();
                return;
            }
        }
        if (f165740q) {
            l(application, str, str2);
        }
    }

    public final void f(ViewGroup viewGroup) {
        try {
            ArrayList<View> arrayListA = L.a(viewGroup);
            for (int i10 = 0; i10 < arrayListA.size(); i10++) {
                View view = arrayListA.get(i10);
                if (view instanceof EditText) {
                    if (!this.f165752l) {
                        this.f165741a = new W();
                        this.f165752l = true;
                    }
                    W w10 = this.f165741a;
                    EditText editText = (EditText) view;
                    r.c("TextChangeManager", "Listening on edit text: " + editText.getId(), new Throwable[0]);
                    int iA = S.a(String.valueOf(editText.getId()));
                    if (!z.f165976a.toLowerCase().contains(Integer.toString(iA).toLowerCase())) {
                        z.f165976a += iA + ";";
                    }
                    if ((editText.getInputType() & 129) == 129 || (editText.getInputType() & 18) == 18 || (editText.getInputType() & 145) == 145 || (editText.getInputType() & 225) == 225) {
                        V v10 = new V(iA, true);
                        editText.addTextChangedListener(v10);
                        v10.addObserver(w10.f165853a);
                    } else {
                        V v11 = new V(iA, false);
                        editText.addTextChangedListener(v11);
                        v11.addObserver(w10.f165853a);
                    }
                }
            }
        } catch (Exception e10) {
            r.e("CYFManager", "Exception in creating text listener", e10);
            C17774A.a(e10);
        }
    }

    public final synchronized void k(Application application) {
        if (this.f165742b != null) {
            return;
        }
        this.f165742b = new C17778E(application, this);
    }

    public final void m(Window window) {
        try {
            if (this.f165744d == null) {
                this.f165744d = new C17783e();
            }
            C17783e c17783e = this.f165744d;
            r.c("TouchManager", "Listening on window", new Throwable[0]);
            c17783e.f165876a = SystemClock.uptimeMillis();
            WindowCallbackC17782d windowCallbackC17782d = new WindowCallbackC17782d(window.getCallback());
            window.setCallback(windowCallbackC17782d);
            FS.trackWindow(window);
            windowCallbackC17782d.addObserver(c17783e);
        } catch (Exception e10) {
            r.e("CYFManager", "Exception in creating touch manager", e10);
            C17774A.a(e10);
        }
    }

    public final void n() {
        try {
            J j10 = this.f165743c;
            if (j10.f165833d.size() >= 128 || j10.f165836g.get()) {
                return;
            }
            I i10 = j10.f165830a;
            i10.f165816b = i10.f165815a.getDefaultSensor(1);
            i10.f165817c = i10.f165815a.getDefaultSensor(2);
            HandlerThread handlerThread = new HandlerThread("CYFOrientationListener");
            i10.f165819e = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(i10.f165819e.getLooper());
            i10.f165820f = i10.f165815a.registerListener(i10, i10.f165816b, 1, handler);
            i10.f165821g = i10.f165815a.registerListener(i10, i10.f165817c, 1, handler);
            Sensor defaultSensor = i10.f165815a.getDefaultSensor(9);
            i10.f165818d = defaultSensor;
            boolean zRegisterListener = i10.f165815a.registerListener(i10, defaultSensor, 1, handler);
            i10.f165822h = zRegisterListener;
            if (zRegisterListener) {
                i10.f165815a.unregisterListener(i10, i10.f165816b);
                i10.f165820f = false;
                C17800w.f165958g = 1;
            } else {
                C17800w.f165958g = 0;
            }
            i10.f165829o = true;
            i10.f165826l = SystemClock.uptimeMillis();
            if ((i10.f165820f || i10.f165822h) && i10.f165821g) {
                j10.f165831b = true;
                j10.f165830a.addObserver(j10);
            } else {
                r.e("OrientationListener", "Failed to register orientation listener", new Throwable[0]);
                i10.a();
                r.e("OrientationManager", "Orientation listener registration failed", new Throwable[0]);
            }
        } catch (Exception e10) {
            g(e10.getMessage());
            r.e("CYFManager", "Exception in starting orientation manager", e10);
            C17774A.a(e10);
        }
    }

    public final synchronized void o(Application application) {
        if (!f165739p) {
            C17799v c17799v = new C17799v();
            this.f165745e = c17799v;
            application.registerActivityLifecycleCallbacks(c17799v);
            f165739p = true;
            i();
        }
    }

    public final synchronized void p() {
        try {
            this.f165743c.b();
        } catch (Exception e10) {
            r.e("CYFManager", "Exception in stopping orientation manager", e10);
            C17774A.a(e10);
        }
    }

    public final synchronized void q(Application application) {
        if (!f165738o && application != null) {
            try {
                U u10 = new U();
                this.f165747g = u10;
                long jUptimeMillis = SystemClock.uptimeMillis();
                u10.f165842c = T.c(application);
                u10.f165843d = ((TelephonyManager) application.getSystemService("phone")).getSimOperatorName();
                new Q();
                u10.f165844e = k0.a("+", Q.c(application, application.getPackageName()));
                u10.f165845f = T.g(application);
                u10.f165846g = T.b();
                u10.f165848i = C17781c.a();
                u10.f165847h = C17781c.b(application);
                C17800w.f165957f = SystemClock.uptimeMillis() - jUptimeMillis;
                r.c("CYFSystemInfoManager", "DeviceInfo-Time: " + C17800w.f165957f + "ms", new Throwable[0]);
                f165738o = true;
                i();
            } catch (Exception e10) {
                C17774A.a(e10);
                g(e10.getMessage());
            }
        }
    }

    public final synchronized void r() {
        try {
            C17778E c17778e = this.f165742b;
            if (c17778e.f165782d.size() < 128 && !c17778e.f165784f.get()) {
                C17777D c17777d = c17778e.f165779a;
                c17777d.f165757b = c17777d.f165756a.getDefaultSensor(1);
                c17777d.f165758c = c17777d.f165756a.getDefaultSensor(4);
                HandlerThread handlerThread = new HandlerThread("CYFMotionListener");
                c17777d.f165759d = handlerThread;
                handlerThread.start();
                Handler handler = new Handler(c17777d.f165759d.getLooper());
                c17777d.f165761f = c17777d.f165756a.registerListener(c17777d, c17777d.f165757b, 1, handler);
                c17777d.f165762g = c17777d.f165756a.registerListener(c17777d, c17777d.f165758c, 1, handler);
                r.c("MotionListener", "GyroScope status " + c17777d.f165762g + " and Accelerometer status " + c17777d.f165761f, new Throwable[0]);
                boolean z10 = c17777d.f165761f;
                if (!z10 && !c17777d.f165762g) {
                    r.e("MotionListener", "Failed to register motion listener", new Throwable[0]);
                    c17777d.a();
                    r.e("MotionManager", "Motion listener registration failed", new Throwable[0]);
                    return;
                }
                c17777d.f165764i = !z10;
                c17777d.f165763h = !c17777d.f165762g;
                c17777d.f165760e = SystemClock.uptimeMillis();
                c17777d.f165775t = System.nanoTime();
                c17777d.f165777v = 0;
                c17777d.f165778w = true;
                c17778e.f165780b = true;
                c17778e.f165779a.addObserver(c17778e);
            }
        } catch (Exception e10) {
            g(e10.getMessage());
            r.e("CYFManager", "Exception in starting motion manager", e10);
            C17774A.a(e10);
        }
    }

    public final synchronized void s() {
        try {
            this.f165742b.b();
        } catch (Exception e10) {
            r.e("CYFManager", "Exception in stopping motion manager", e10);
            C17774A.a(e10);
        }
    }

    public final synchronized Boolean t() {
        if (this.f165751k == null) {
            return Boolean.FALSE;
        }
        Date date = new Date();
        date.getTime();
        this.f165751k.getTime();
        if ((date.getTime() - this.f165751k.getTime()) / 1000 > 300) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    final synchronized int u() {
        return this.f165750j;
    }

    private void g(String str) {
        int i10 = com.cyberfend.cyfsecurity.a.f64173g;
    }

    public static synchronized boolean h(Window window) throws Exception {
        int iHashCode = window.hashCode();
        int i10 = 0;
        while (true) {
            ArrayList<Integer> arrayList = f165737n;
            if (i10 >= arrayList.size()) {
                arrayList.add(Integer.valueOf(iHashCode));
                return false;
            }
            if (iHashCode == arrayList.get(i10).intValue()) {
                return true;
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String v() throws Exception {
        String str;
        String str2;
        String strA;
        String str3;
        String str4;
        Object[] objArr;
        String str5;
        C17778E c17778e;
        J j10;
        r.c("CYFManager", "Building sensor data: " + Thread.currentThread(), new Throwable[0]);
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (z.f165978c.equals("default_performance")) {
            z.f165978c = K.a();
        }
        if (this.f165749i == null) {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            this.f165749i = new Handler(looperMyLooper);
        }
        int i10 = com.cyberfend.cyfsecurity.a.f64173g;
        String str6 = "";
        if (this.f165742b.c() < 32 && this.f165743c.c() < 32 && C17788j.a().f165932b != null) {
            String str7 = C17788j.a().f165932b;
            if (this.f165748h.compareAndSet(false, true)) {
                r.e("CYFManager", "Refresh Sensor data", new Throwable[0]);
                new Timer().schedule(new a(), 5000L);
            }
            Context context = C17788j.a().f165931a.get();
            if (context == null) {
                r.d("SensorDataCache", "getServerSignal: Context is null", new Throwable[0]);
            } else {
                String string = context.getSharedPreferences("com.akamai.botman.preferences", 0).getString("ss_signal", null);
                if (string != null) {
                    str6 = string;
                }
            }
            String str8 = str7 + "$" + C17787i.q().r() + "$" + C17785g.s().u() + "$" + str6;
            w();
            return str8;
        }
        U u10 = this.f165747g;
        if (u10 != null) {
            str = u10.f165842c;
            str2 = u10.f165843d + "," + u10.f165844e + "," + u10.f165845f + "," + u10.f165846g + "," + u10.f165847h + "," + u10.f165848i;
            strA = U.a();
        } else {
            str = "-1";
            str2 = "-1";
            strA = "";
        }
        String str9 = str + "," + S.a(str) + "," + String.valueOf(new Random().nextInt()) + "," + String.valueOf(C17800w.f165952a / 2);
        C17796s<Pair<String, String>, Long, Long> c17796sE = this.f165743c.e();
        C17796s<Pair<String, String>, Long, Long> c17796sE2 = this.f165742b.e();
        String strD = this.f165743c.d();
        String strD2 = this.f165742b.d();
        Pair<String, Long> pair = new Pair<>("", 0L);
        C17783e c17783e = this.f165744d;
        Pair<String, Long> pairA = c17783e != null ? c17783e.a() : pair;
        Pair<String, Long> pair2 = new Pair<>("", 0L);
        W w10 = this.f165741a;
        if (w10 != null) {
            pair2 = w10.b();
        }
        String str10 = (String) pair2.first;
        String str11 = (String) pairA.first;
        String str12 = z.f165976a;
        C17799v c17799v = this.f165745e;
        String strA2 = c17799v != null ? c17799v.a() : "";
        String str13 = str2;
        try {
            j10 = this.f165743c;
            str3 = strD2;
        } catch (Exception unused) {
            str3 = strD2;
        }
        String str14 = j10.f165830a.f165825k ? "do_unr" : !j10.f165831b ? "do_dis" : "do_en";
        try {
            c17778e = this.f165742b;
            str4 = strD;
        } catch (Exception unused2) {
            str4 = strD;
        }
        String str15 = c17778e.f165779a.f165765j ? "dm_unr" : !c17778e.f165780b ? "dm_dis" : "dm_en";
        String str16 = str14 + "," + str15 + ",t_en";
        long jUptimeMillis2 = (SystemClock.uptimeMillis() - jUptimeMillis) * 1000;
        int i11 = Looper.myLooper() != Looper.getMainLooper() ? 1 : 0;
        boolean zD = WindowCallbackC17782d.d();
        String str17 = strA;
        String str18 = strA2;
        long jLongValue = ((Long) pair2.second).longValue() + ((Long) pairA.second).longValue() + c17796sE.f165946b.longValue() + c17796sE2.f165946b.longValue();
        long jCurrentTimeMillis = System.currentTimeMillis() - C17800w.f165952a;
        W w11 = this.f165741a;
        long j11 = w11 != null ? w11.f165858f : 0L;
        C17783e c17783e2 = this.f165744d;
        String str19 = pair2.second + "," + pairA.second + "," + c17796sE.f165946b + "," + c17796sE2.f165946b + "," + jLongValue + "," + jCurrentTimeMillis + "," + j11 + "," + (c17783e2 != null ? c17783e2.f165879d : 0L) + "," + c17796sE.f165947c + "," + c17796sE2.f165947c + "," + (C17800w.f165957f * 1000) + "," + jUptimeMillis2 + "," + C17800w.f165958g + "," + C17790l.a((((int) jLongValue) << 32) | (((int) (j11 + r0 + c17796sE.f165947c.longValue() + c17796sE2.f165947c.longValue())) & 4294967295L), (int) jCurrentTimeMillis) + "," + C17800w.f165952a + "," + u();
        String str20 = i11 + "," + (zD ? 1 : 0);
        Pair<String, String> pair3 = c17796sE.f165945a;
        String str21 = (String) pair3.first;
        String str22 = (String) pair3.second;
        Pair<String, String> pair4 = c17796sE2.f165945a;
        String str23 = (String) pair4.first;
        String str24 = (String) pair4.second;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("", "3.3.9"));
        y yVar = this.f165746f;
        if (yVar != null && yVar.d() != null) {
            arrayList.add(new Pair("-90", this.f165746f.d()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("-70", new Pair("-70", ""));
        linkedHashMap.put("-80", new Pair("-80", ""));
        linkedHashMap.put("-121", new Pair("-121", ""));
        linkedHashMap.put("-100", new Pair("-100", str9));
        linkedHashMap.put("-101", new Pair("-101", str16));
        linkedHashMap.put("-102", new Pair("-102", str12));
        linkedHashMap.put("-103", new Pair("-103", str18));
        linkedHashMap.put("-104", new Pair("-104", str17));
        linkedHashMap.put("-108", new Pair("-108", str10));
        linkedHashMap.put("-112", new Pair("-112", z.f165978c));
        linkedHashMap.put("-115", new Pair("-115", str19));
        linkedHashMap.put("-117", new Pair("-117", str11));
        linkedHashMap.put("-120", new Pair("-120", z.f165977b));
        linkedHashMap.put("-144", new Pair("-144", str22));
        linkedHashMap.put("-160", new Pair("-160", str4));
        linkedHashMap.put("-142", new Pair("-142", str21));
        linkedHashMap.put("-145", new Pair("-145", str24));
        linkedHashMap.put("-161", new Pair("-161", str3));
        linkedHashMap.put("-143", new Pair("-143", str23));
        linkedHashMap.put("-150", new Pair("-150", str20));
        linkedHashMap.put("-163", new Pair("-163", str13));
        linkedHashMap.put("-240", new Pair("-240", "0"));
        y yVar2 = this.f165746f;
        if (yVar2 == null || (objArr = yVar2.f165968c.f165960a) == null) {
            objArr = null;
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                if (linkedHashMap.containsKey(obj) && linkedHashMap.get(obj) != null) {
                    arrayList.add(linkedHashMap.get(obj));
                }
            }
        } else {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                arrayList.add((Pair) it.next());
            }
        }
        r.c("CYFManager", "Plain-BuildSensorData-Time: " + (SystemClock.uptimeMillis() - jUptimeMillis) + "ms", new Throwable[0]);
        SensorDataBuilder.a();
        String strBuildN = !SensorDataBuilder.f64165b ? SensorDataBuilder.a().buildN(arrayList) : null;
        y yVar3 = this.f165746f;
        if (yVar3 == null || (str5 = yVar3.f165970e) == null) {
            str5 = "";
        }
        if (c17796sE.f165947c.longValue() >= 32 || c17796sE2.f165947c.longValue() >= 32) {
            C17788j c17788jA = C17788j.a();
            c17788jA.f165932b = strBuildN;
            new Thread(c17788jA.new b()).start();
            C17788j.a().f(str5);
        }
        String str25 = strBuildN + "$" + C17787i.q().r() + "$" + C17785g.s().u() + "$" + str5;
        try {
            C17783e c17783e3 = this.f165744d;
            if (c17783e3 != null) {
                c17783e3.f165877b = 0;
                c17783e3.f165878c = 0;
                c17783e3.f165879d = 0L;
                c17783e3.f165880e = "";
                c17783e3.f165884i = 0L;
                c17783e3.f165876a = SystemClock.uptimeMillis();
                c17783e3.f165881f.clear();
                Future<Pair<String, Long>> future = c17783e3.f165882g;
                if (future != null) {
                    if (!future.isCancelled() && !c17783e3.f165882g.isDone()) {
                        c17783e3.f165882g.cancel(true);
                    }
                    c17783e3.f165882g = null;
                }
            }
            W w12 = this.f165741a;
            if (w12 != null) {
                w12.a();
            }
            z.a();
            C17800w.a();
        } catch (Exception e10) {
            C17774A.a(e10);
        }
        if (c17796sE.f165947c.longValue() >= 128 || c17796sE2.f165947c.longValue() >= 128) {
            try {
                J j12 = this.f165743c;
                j12.f165832c = SystemClock.uptimeMillis();
                j12.f165833d.clear();
                Future<C17796s<Pair<String, String>, Long, Long>> future2 = j12.f165835f;
                if (future2 != null) {
                    if (!future2.isCancelled() && !j12.f165835f.isDone()) {
                        j12.f165835f.cancel(true);
                    }
                    j12.f165835f = null;
                }
                j12.f165834e.clear();
                C17778E c17778e2 = this.f165742b;
                c17778e2.f165781c = SystemClock.uptimeMillis();
                c17778e2.f165782d.clear();
                Future<C17796s<Pair<String, String>, Long, Long>> future3 = c17778e2.f165783e;
                if (future3 != null) {
                    if (!future3.isCancelled() && !c17778e2.f165783e.isDone()) {
                        c17778e2.f165783e.cancel(true);
                    }
                    c17778e2.f165783e = null;
                }
                c17778e2.f165785g.clear();
            } catch (Exception e11) {
                C17774A.a(e11);
            }
        }
        w();
        return str25;
    }

    private void w() {
        this.f165749i.post(new b());
    }

    @Override // w6.InterfaceC17786h
    public final void i() {
        int i10 = com.cyberfend.cyfsecurity.a.f64173g;
    }

    public static void j() {
        WindowCallbackC17782d.a();
    }
}
