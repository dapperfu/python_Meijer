package x6;

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
import x6.C18115j.b;

/* renamed from: x6.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18097C implements InterfaceC18113h {

    /* renamed from: n, reason: collision with root package name */
    private static final ArrayList<Integer> f170382n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    private static boolean f170383o = false;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f170384p = false;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f170385q = false;

    /* renamed from: j, reason: collision with root package name */
    private int f170395j;

    /* renamed from: a, reason: collision with root package name */
    public W f170386a = null;

    /* renamed from: b, reason: collision with root package name */
    public C18099E f170387b = null;

    /* renamed from: c, reason: collision with root package name */
    public C18104J f170388c = null;

    /* renamed from: d, reason: collision with root package name */
    public C18110e f170389d = null;

    /* renamed from: e, reason: collision with root package name */
    private C18126v f170390e = null;

    /* renamed from: f, reason: collision with root package name */
    public y f170391f = null;

    /* renamed from: g, reason: collision with root package name */
    private U f170392g = null;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f170393h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private Handler f170394i = null;

    /* renamed from: k, reason: collision with root package name */
    private Date f170396k = null;

    /* renamed from: l, reason: collision with root package name */
    private boolean f170397l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f170398m = true;

    /* renamed from: x6.C$a */
    final class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            C18097C.this.a();
            C18097C.this.f170393h.compareAndSet(true, false);
        }
    }

    /* renamed from: x6.C$b */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.cyberfend.cyfsecurity.a.n()) {
                C18097C.this.s();
                C18097C.this.p();
                C18097C.this.r();
                C18097C.this.n();
            }
        }
    }

    private synchronized void l(Application application, String str, String str2) {
        if (application != null) {
            try {
                if (this.f170391f != null) {
                    this.f170396k = new Date();
                    y yVar = this.f170391f;
                    try {
                        yVar.f170612b = application;
                        yVar.f170614d = str;
                        yVar.f170615e = str2;
                        yVar.a();
                    } catch (Exception e10) {
                        C18095A.a(e10);
                    }
                }
            } catch (Exception e11) {
                C18095A.a(e11);
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
                C18095A.a(e10);
            }
            if (this.f170387b != null && this.f170388c != null) {
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
        this.f170395j = i10;
    }

    public final synchronized void d(Application application) {
        if (this.f170388c != null) {
            return;
        }
        this.f170388c = new C18104J(application, this);
    }

    public final synchronized void e(Application application, String str, String str2) {
        if (application != null) {
            if (!f170385q) {
                if (this.f170391f != null) {
                    return;
                }
                this.f170396k = new Date();
                this.f170391f = new y(application, str, str2);
                f170385q = true;
                i();
                return;
            }
        }
        if (f170385q) {
            l(application, str, str2);
        }
    }

    public final void f(ViewGroup viewGroup) {
        try {
            ArrayList<View> arrayListA = L.a(viewGroup);
            for (int i10 = 0; i10 < arrayListA.size(); i10++) {
                View view = arrayListA.get(i10);
                if (view instanceof EditText) {
                    if (!this.f170397l) {
                        this.f170386a = new W();
                        this.f170397l = true;
                    }
                    W w10 = this.f170386a;
                    EditText editText = (EditText) view;
                    r.c("TextChangeManager", "Listening on edit text: " + editText.getId(), new Throwable[0]);
                    int iA = S.a(String.valueOf(editText.getId()));
                    if (!z.f170621a.toLowerCase().contains(Integer.toString(iA).toLowerCase())) {
                        z.f170621a += iA + ";";
                    }
                    if ((editText.getInputType() & 129) == 129 || (editText.getInputType() & 18) == 18 || (editText.getInputType() & 145) == 145 || (editText.getInputType() & 225) == 225) {
                        V v10 = new V(iA, true);
                        editText.addTextChangedListener(v10);
                        v10.addObserver(w10.f170498a);
                    } else {
                        V v11 = new V(iA, false);
                        editText.addTextChangedListener(v11);
                        v11.addObserver(w10.f170498a);
                    }
                }
            }
        } catch (Exception e10) {
            r.e("CYFManager", "Exception in creating text listener", e10);
            C18095A.a(e10);
        }
    }

    public final synchronized void k(Application application) {
        if (this.f170387b != null) {
            return;
        }
        this.f170387b = new C18099E(application, this);
    }

    public final void m(Window window) {
        try {
            if (this.f170389d == null) {
                this.f170389d = new C18110e();
            }
            C18110e c18110e = this.f170389d;
            r.c("TouchManager", "Listening on window", new Throwable[0]);
            c18110e.f170521a = SystemClock.uptimeMillis();
            WindowCallbackC18109d windowCallbackC18109d = new WindowCallbackC18109d(FS.getWindowCallback(window));
            FS.setWindowCallback(window, windowCallbackC18109d);
            windowCallbackC18109d.addObserver(c18110e);
        } catch (Exception e10) {
            r.e("CYFManager", "Exception in creating touch manager", e10);
            C18095A.a(e10);
        }
    }

    public final void n() {
        try {
            C18104J c18104j = this.f170388c;
            if (c18104j.f170478d.size() >= 128 || c18104j.f170481g.get()) {
                return;
            }
            C18103I c18103i = c18104j.f170475a;
            c18103i.f170461b = c18103i.f170460a.getDefaultSensor(1);
            c18103i.f170462c = c18103i.f170460a.getDefaultSensor(2);
            HandlerThread handlerThread = new HandlerThread("CYFOrientationListener");
            c18103i.f170464e = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(c18103i.f170464e.getLooper());
            c18103i.f170465f = c18103i.f170460a.registerListener(c18103i, c18103i.f170461b, 1, handler);
            c18103i.f170466g = c18103i.f170460a.registerListener(c18103i, c18103i.f170462c, 1, handler);
            Sensor defaultSensor = c18103i.f170460a.getDefaultSensor(9);
            c18103i.f170463d = defaultSensor;
            boolean zRegisterListener = c18103i.f170460a.registerListener(c18103i, defaultSensor, 1, handler);
            c18103i.f170467h = zRegisterListener;
            if (zRegisterListener) {
                c18103i.f170460a.unregisterListener(c18103i, c18103i.f170461b);
                c18103i.f170465f = false;
                C18127w.f170603g = 1;
            } else {
                C18127w.f170603g = 0;
            }
            c18103i.f170474o = true;
            c18103i.f170471l = SystemClock.uptimeMillis();
            if ((c18103i.f170465f || c18103i.f170467h) && c18103i.f170466g) {
                c18104j.f170476b = true;
                c18104j.f170475a.addObserver(c18104j);
            } else {
                r.e("OrientationListener", "Failed to register orientation listener", new Throwable[0]);
                c18103i.a();
                r.e("OrientationManager", "Orientation listener registration failed", new Throwable[0]);
            }
        } catch (Exception e10) {
            g(e10.getMessage());
            r.e("CYFManager", "Exception in starting orientation manager", e10);
            C18095A.a(e10);
        }
    }

    public final synchronized void o(Application application) {
        if (!f170384p) {
            C18126v c18126v = new C18126v();
            this.f170390e = c18126v;
            application.registerActivityLifecycleCallbacks(c18126v);
            f170384p = true;
            i();
        }
    }

    public final synchronized void p() {
        try {
            this.f170388c.b();
        } catch (Exception e10) {
            r.e("CYFManager", "Exception in stopping orientation manager", e10);
            C18095A.a(e10);
        }
    }

    public final synchronized void q(Application application) {
        if (!f170383o && application != null) {
            try {
                U u10 = new U();
                this.f170392g = u10;
                long jUptimeMillis = SystemClock.uptimeMillis();
                u10.f170487c = T.c(application);
                u10.f170488d = ((TelephonyManager) application.getSystemService("phone")).getSimOperatorName();
                new Q();
                u10.f170489e = k0.a("+", Q.c(application, application.getPackageName()));
                u10.f170490f = T.g(application);
                u10.f170491g = T.b();
                u10.f170493i = C18108c.a();
                u10.f170492h = C18108c.b(application);
                C18127w.f170602f = SystemClock.uptimeMillis() - jUptimeMillis;
                r.c("CYFSystemInfoManager", "DeviceInfo-Time: " + C18127w.f170602f + "ms", new Throwable[0]);
                f170383o = true;
                i();
            } catch (Exception e10) {
                C18095A.a(e10);
                g(e10.getMessage());
            }
        }
    }

    public final synchronized void r() {
        try {
            C18099E c18099e = this.f170387b;
            if (c18099e.f170427d.size() < 128 && !c18099e.f170429f.get()) {
                C18098D c18098d = c18099e.f170424a;
                c18098d.f170402b = c18098d.f170401a.getDefaultSensor(1);
                c18098d.f170403c = c18098d.f170401a.getDefaultSensor(4);
                HandlerThread handlerThread = new HandlerThread("CYFMotionListener");
                c18098d.f170404d = handlerThread;
                handlerThread.start();
                Handler handler = new Handler(c18098d.f170404d.getLooper());
                c18098d.f170406f = c18098d.f170401a.registerListener(c18098d, c18098d.f170402b, 1, handler);
                c18098d.f170407g = c18098d.f170401a.registerListener(c18098d, c18098d.f170403c, 1, handler);
                r.c("MotionListener", "GyroScope status " + c18098d.f170407g + " and Accelerometer status " + c18098d.f170406f, new Throwable[0]);
                boolean z10 = c18098d.f170406f;
                if (!z10 && !c18098d.f170407g) {
                    r.e("MotionListener", "Failed to register motion listener", new Throwable[0]);
                    c18098d.a();
                    r.e("MotionManager", "Motion listener registration failed", new Throwable[0]);
                    return;
                }
                c18098d.f170409i = !z10;
                c18098d.f170408h = !c18098d.f170407g;
                c18098d.f170405e = SystemClock.uptimeMillis();
                c18098d.f170420t = System.nanoTime();
                c18098d.f170422v = 0;
                c18098d.f170423w = true;
                c18099e.f170425b = true;
                c18099e.f170424a.addObserver(c18099e);
            }
        } catch (Exception e10) {
            g(e10.getMessage());
            r.e("CYFManager", "Exception in starting motion manager", e10);
            C18095A.a(e10);
        }
    }

    public final synchronized void s() {
        try {
            this.f170387b.b();
        } catch (Exception e10) {
            r.e("CYFManager", "Exception in stopping motion manager", e10);
            C18095A.a(e10);
        }
    }

    public final synchronized Boolean t() {
        if (this.f170396k == null) {
            return Boolean.FALSE;
        }
        Date date = new Date();
        date.getTime();
        this.f170396k.getTime();
        if ((date.getTime() - this.f170396k.getTime()) / 1000 > 300) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    final synchronized int u() {
        return this.f170395j;
    }

    private void g(String str) {
        int i10 = com.cyberfend.cyfsecurity.a.f65013g;
    }

    public static synchronized boolean h(Window window) throws Exception {
        int iHashCode = window.hashCode();
        int i10 = 0;
        while (true) {
            ArrayList<Integer> arrayList = f170382n;
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
        C18099E c18099e;
        C18104J c18104j;
        r.c("CYFManager", "Building sensor data: " + Thread.currentThread(), new Throwable[0]);
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (z.f170623c.equals("default_performance")) {
            z.f170623c = C18105K.a();
        }
        if (this.f170394i == null) {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            this.f170394i = new Handler(looperMyLooper);
        }
        int i10 = com.cyberfend.cyfsecurity.a.f65013g;
        String str6 = "";
        if (this.f170387b.c() < 32 && this.f170388c.c() < 32 && C18115j.a().f170577b != null) {
            String str7 = C18115j.a().f170577b;
            if (this.f170393h.compareAndSet(false, true)) {
                r.e("CYFManager", "Refresh Sensor data", new Throwable[0]);
                new Timer().schedule(new a(), 5000L);
            }
            Context context = C18115j.a().f170576a.get();
            if (context == null) {
                r.d("SensorDataCache", "getServerSignal: Context is null", new Throwable[0]);
            } else {
                String string = context.getSharedPreferences("com.akamai.botman.preferences", 0).getString("ss_signal", null);
                if (string != null) {
                    str6 = string;
                }
            }
            String str8 = str7 + "$" + C18114i.q().r() + "$" + C18112g.s().u() + "$" + str6;
            w();
            return str8;
        }
        U u10 = this.f170392g;
        if (u10 != null) {
            str = u10.f170487c;
            str2 = u10.f170488d + "," + u10.f170489e + "," + u10.f170490f + "," + u10.f170491g + "," + u10.f170492h + "," + u10.f170493i;
            strA = U.a();
        } else {
            str = "-1";
            str2 = "-1";
            strA = "";
        }
        String str9 = str + "," + S.a(str) + "," + String.valueOf(new Random().nextInt()) + "," + String.valueOf(C18127w.f170597a / 2);
        C18123s<Pair<String, String>, Long, Long> c18123sE = this.f170388c.e();
        C18123s<Pair<String, String>, Long, Long> c18123sE2 = this.f170387b.e();
        String strD = this.f170388c.d();
        String strD2 = this.f170387b.d();
        Pair<String, Long> pair = new Pair<>("", 0L);
        C18110e c18110e = this.f170389d;
        Pair<String, Long> pairA = c18110e != null ? c18110e.a() : pair;
        Pair<String, Long> pair2 = new Pair<>("", 0L);
        W w10 = this.f170386a;
        if (w10 != null) {
            pair2 = w10.b();
        }
        String str10 = (String) pair2.first;
        String str11 = (String) pairA.first;
        String str12 = z.f170621a;
        C18126v c18126v = this.f170390e;
        String strA2 = c18126v != null ? c18126v.a() : "";
        String str13 = str2;
        try {
            c18104j = this.f170388c;
            str3 = strD2;
        } catch (Exception unused) {
            str3 = strD2;
        }
        String str14 = c18104j.f170475a.f170470k ? "do_unr" : !c18104j.f170476b ? "do_dis" : "do_en";
        try {
            c18099e = this.f170387b;
            str4 = strD;
        } catch (Exception unused2) {
            str4 = strD;
        }
        String str15 = c18099e.f170424a.f170410j ? "dm_unr" : !c18099e.f170425b ? "dm_dis" : "dm_en";
        String str16 = str14 + "," + str15 + ",t_en";
        long jUptimeMillis2 = (SystemClock.uptimeMillis() - jUptimeMillis) * 1000;
        int i11 = Looper.myLooper() != Looper.getMainLooper() ? 1 : 0;
        boolean zD = WindowCallbackC18109d.d();
        String str17 = strA;
        String str18 = strA2;
        long jLongValue = ((Long) pair2.second).longValue() + ((Long) pairA.second).longValue() + c18123sE.f170591b.longValue() + c18123sE2.f170591b.longValue();
        long jCurrentTimeMillis = System.currentTimeMillis() - C18127w.f170597a;
        W w11 = this.f170386a;
        long j10 = w11 != null ? w11.f170503f : 0L;
        C18110e c18110e2 = this.f170389d;
        String str19 = pair2.second + "," + pairA.second + "," + c18123sE.f170591b + "," + c18123sE2.f170591b + "," + jLongValue + "," + jCurrentTimeMillis + "," + j10 + "," + (c18110e2 != null ? c18110e2.f170524d : 0L) + "," + c18123sE.f170592c + "," + c18123sE2.f170592c + "," + (C18127w.f170602f * 1000) + "," + jUptimeMillis2 + "," + C18127w.f170603g + "," + C18117l.a((((int) jLongValue) << 32) | (((int) (j10 + r0 + c18123sE.f170592c.longValue() + c18123sE2.f170592c.longValue())) & 4294967295L), (int) jCurrentTimeMillis) + "," + C18127w.f170597a + "," + u();
        String str20 = i11 + "," + (zD ? 1 : 0);
        Pair<String, String> pair3 = c18123sE.f170590a;
        String str21 = (String) pair3.first;
        String str22 = (String) pair3.second;
        Pair<String, String> pair4 = c18123sE2.f170590a;
        String str23 = (String) pair4.first;
        String str24 = (String) pair4.second;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("", "3.3.9"));
        y yVar = this.f170391f;
        if (yVar != null && yVar.d() != null) {
            arrayList.add(new Pair("-90", this.f170391f.d()));
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
        linkedHashMap.put("-112", new Pair("-112", z.f170623c));
        linkedHashMap.put("-115", new Pair("-115", str19));
        linkedHashMap.put("-117", new Pair("-117", str11));
        linkedHashMap.put("-120", new Pair("-120", z.f170622b));
        linkedHashMap.put("-144", new Pair("-144", str22));
        linkedHashMap.put("-160", new Pair("-160", str4));
        linkedHashMap.put("-142", new Pair("-142", str21));
        linkedHashMap.put("-145", new Pair("-145", str24));
        linkedHashMap.put("-161", new Pair("-161", str3));
        linkedHashMap.put("-143", new Pair("-143", str23));
        linkedHashMap.put("-150", new Pair("-150", str20));
        linkedHashMap.put("-163", new Pair("-163", str13));
        linkedHashMap.put("-240", new Pair("-240", "0"));
        y yVar2 = this.f170391f;
        if (yVar2 == null || (objArr = yVar2.f170613c.f170605a) == null) {
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
        String strBuildN = !SensorDataBuilder.f65005b ? SensorDataBuilder.a().buildN(arrayList) : null;
        y yVar3 = this.f170391f;
        if (yVar3 == null || (str5 = yVar3.f170615e) == null) {
            str5 = "";
        }
        if (c18123sE.f170592c.longValue() >= 32 || c18123sE2.f170592c.longValue() >= 32) {
            C18115j c18115jA = C18115j.a();
            c18115jA.f170577b = strBuildN;
            new Thread(c18115jA.new b()).start();
            C18115j.a().f(str5);
        }
        String str25 = strBuildN + "$" + C18114i.q().r() + "$" + C18112g.s().u() + "$" + str5;
        try {
            C18110e c18110e3 = this.f170389d;
            if (c18110e3 != null) {
                c18110e3.f170522b = 0;
                c18110e3.f170523c = 0;
                c18110e3.f170524d = 0L;
                c18110e3.f170525e = "";
                c18110e3.f170529i = 0L;
                c18110e3.f170521a = SystemClock.uptimeMillis();
                c18110e3.f170526f.clear();
                Future<Pair<String, Long>> future = c18110e3.f170527g;
                if (future != null) {
                    if (!future.isCancelled() && !c18110e3.f170527g.isDone()) {
                        c18110e3.f170527g.cancel(true);
                    }
                    c18110e3.f170527g = null;
                }
            }
            W w12 = this.f170386a;
            if (w12 != null) {
                w12.a();
            }
            z.a();
            C18127w.a();
        } catch (Exception e10) {
            C18095A.a(e10);
        }
        if (c18123sE.f170592c.longValue() >= 128 || c18123sE2.f170592c.longValue() >= 128) {
            try {
                C18104J c18104j2 = this.f170388c;
                c18104j2.f170477c = SystemClock.uptimeMillis();
                c18104j2.f170478d.clear();
                Future<C18123s<Pair<String, String>, Long, Long>> future2 = c18104j2.f170480f;
                if (future2 != null) {
                    if (!future2.isCancelled() && !c18104j2.f170480f.isDone()) {
                        c18104j2.f170480f.cancel(true);
                    }
                    c18104j2.f170480f = null;
                }
                c18104j2.f170479e.clear();
                C18099E c18099e2 = this.f170387b;
                c18099e2.f170426c = SystemClock.uptimeMillis();
                c18099e2.f170427d.clear();
                Future<C18123s<Pair<String, String>, Long, Long>> future3 = c18099e2.f170428e;
                if (future3 != null) {
                    if (!future3.isCancelled() && !c18099e2.f170428e.isDone()) {
                        c18099e2.f170428e.cancel(true);
                    }
                    c18099e2.f170428e = null;
                }
                c18099e2.f170430g.clear();
            } catch (Exception e11) {
                C18095A.a(e11);
            }
        }
        w();
        return str25;
    }

    private void w() {
        this.f170394i.post(new b());
    }

    @Override // x6.InterfaceC18113h
    public final void i() {
        int i10 = com.cyberfend.cyfsecurity.a.f65013g;
    }

    public static void j() {
        WindowCallbackC18109d.a();
    }
}
