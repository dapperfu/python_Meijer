package x6;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: x6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18114i {

    /* renamed from: y, reason: collision with root package name */
    private static final Locale f170543y = Locale.US;

    /* renamed from: z, reason: collision with root package name */
    private static final C18114i f170544z = new C18114i();

    /* renamed from: a, reason: collision with root package name */
    String f170545a;

    /* renamed from: e, reason: collision with root package name */
    private String f170549e;

    /* renamed from: f, reason: collision with root package name */
    long f170550f;

    /* renamed from: g, reason: collision with root package name */
    private long f170551g;

    /* renamed from: h, reason: collision with root package name */
    private long f170552h;

    /* renamed from: i, reason: collision with root package name */
    private long f170553i;

    /* renamed from: j, reason: collision with root package name */
    private long f170554j;

    /* renamed from: k, reason: collision with root package name */
    private String f170555k;

    /* renamed from: l, reason: collision with root package name */
    private String f170556l;

    /* renamed from: m, reason: collision with root package name */
    private long f170557m;

    /* renamed from: n, reason: collision with root package name */
    private String f170558n;

    /* renamed from: o, reason: collision with root package name */
    private int f170559o;

    /* renamed from: p, reason: collision with root package name */
    private int f170560p;

    /* renamed from: q, reason: collision with root package name */
    private long f170561q;

    /* renamed from: d, reason: collision with root package name */
    private int f170548d = -1;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<String> f170562r = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    private ArrayList<Long> f170563s = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<Integer> f170564t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    private String f170565u = "";

    /* renamed from: v, reason: collision with root package name */
    String f170566v = "";

    /* renamed from: w, reason: collision with root package name */
    private int f170567w = 0;

    /* renamed from: x, reason: collision with root package name */
    public String f170568x = "";

    /* renamed from: b, reason: collision with root package name */
    public int f170546b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f170547c = 0;

    /* renamed from: x6.i$a */
    final class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f170569a;

        /* renamed from: x6.i$a$a, reason: collision with other inner class name */
        final class RunnableC2739a implements Runnable {
            RunnableC2739a() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                a aVar = a.this;
                C18114i.i(C18114i.this, aVar.f170569a);
            }
        }

        a(int i10) {
            this.f170569a = i10;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            new Thread(new RunnableC2739a()).start();
        }
    }

    /* renamed from: x6.i$b */
    final class b extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f170572a;

        /* renamed from: x6.i$b$a */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() throws NoSuchAlgorithmException {
                b bVar = b.this;
                C18114i.m(C18114i.this, bVar.f170572a);
            }
        }

        b(int i10) {
            this.f170572a = i10;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            new Thread(new a()).start();
        }
    }

    private void c() {
        this.f170559o = 0;
        this.f170560p = 0;
        this.f170562r = new ArrayList<>();
        this.f170563s = new ArrayList<>();
        this.f170564t = new ArrayList<>();
        p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd A[PHI: r2
      0x00cd: PHI (r2v4 java.net.HttpURLConnection) = (r2v3 java.net.HttpURLConnection), (r2v5 java.net.HttpURLConnection) binds: [B:40:0x00cb, B:43:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void i(x6.C18114i r8, int r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.C18114i.i(x6.i, int):void");
    }

    protected void d(int i10) {
    }

    final void k(int i10) {
        synchronized (this) {
            this.f170546b = i10;
        }
    }

    protected void p() {
    }

    final synchronized String r() {
        if (this.f170548d == 0) {
            return "";
        }
        if (this.f170566v.length() != 0) {
            int i10 = this.f170567w + 1;
            this.f170567w = i10;
            if (i10 >= this.f170553i * 0.9d) {
                e(100L, 0);
            }
            return this.f170566v;
        }
        if (this.f170565u.length() != 0) {
            return this.f170565u;
        }
        Context context = C18115j.a().f170576a.get();
        if (context == null) {
            r.d("SensorDataCache", "getPoWResponse: Context is null", new Throwable[0]);
        } else {
            String string = context.getSharedPreferences("com.akamai.botman.preferences", 0).getString("pow_response", null);
            if (string != null) {
                return string;
            }
        }
        return "";
    }

    private static long a(byte[] bArr, long j10) {
        long j11 = 0;
        for (byte b10 : bArr) {
            j11 = ((j11 << 8) | (b10 & 255)) % j10;
        }
        return j11;
    }

    private Boolean b(JSONObject jSONObject, int i10) {
        try {
            this.f170548d = jSONObject.getInt("mode");
            this.f170549e = jSONObject.getString("nonce");
            this.f170550f = jSONObject.getLong("ttl");
            this.f170551g = jSONObject.getLong("difficulty");
            this.f170552h = jSONObject.getLong("timeout");
            if (i10 == 0) {
                this.f170553i = jSONObject.getLong("n");
            }
            this.f170554j = jSONObject.getLong("s_timeout");
            this.f170555k = jSONObject.getString("checksum");
            if (this.f170548d != 0) {
                this.f170568x = "Enabled";
                this.f170547c = 0;
                this.f170557m = SystemClock.uptimeMillis();
                this.f170558n = this.f170556l + this.f170557m + this.f170549e;
                this.f170565u = this.f170556l + ";" + this.f170557m + ";" + this.f170549e + ";" + this.f170551g + ";" + this.f170555k;
                this.f170561q = SystemClock.uptimeMillis();
                this.f170559o = 0;
                if (this.f170546b == 2) {
                    r.d("PoW", "Cancel Get Params", new Throwable[0]);
                    p();
                    return Boolean.TRUE;
                }
                l(100L, i10);
            } else {
                k(0);
                this.f170568x = "Disabled";
            }
            if (i10 == 0) {
                e(this.f170550f * 1000, i10);
            }
            return Boolean.TRUE;
        } catch (Exception e10) {
            r.e("PoW", "Exception:".concat(String.valueOf(e10)), new Throwable[0]);
            e10.printStackTrace();
            return Boolean.FALSE;
        }
    }

    private void j() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f170565u);
        sb2.append(";");
        Iterator<String> it = this.f170562r.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(";");
        Iterator<Long> it2 = this.f170563s.iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(";");
        Iterator<Integer> it3 = this.f170564t.iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        synchronized (this) {
            this.f170566v = sb2.toString();
            this.f170567w = 0;
        }
        r.c("PoW", "PoW Data: " + this.f170566v, new Throwable[0]);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f170557m;
        r.c("PoW", "Time taken to solve PoW challenge: " + jUptimeMillis + "ms", new Throwable[0]);
        this.f170568x = "Solved in " + jUptimeMillis + "ms";
    }

    private void l(long j10, int i10) {
        new Timer().schedule(new b(i10), j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0124, code lost:
    
        if (r13 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0126, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0127, code lost:
    
        r23.f170559o++;
        r23.f170561q = android.os.SystemClock.uptimeMillis();
        r23.d(r23.f170559o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x013c, code lost:
    
        if (r23.f170559o >= 10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013e, code lost:
    
        r23.f170560p = 0;
        r23.l(r23.f170552h + r14, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0147, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0148, code lost:
    
        r23.f170560p = 0;
        r23.j();
        r23.f170562r = new java.util.ArrayList<>();
        r23.f170563s = new java.util.ArrayList<>();
        r23.f170564t = new java.util.ArrayList<>();
        r23.k(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0174, code lost:
    
        if ((android.os.SystemClock.uptimeMillis() - r23.f170557m) <= (r23.f170550f * 1000)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0176, code lost:
    
        if (r24 != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0178, code lost:
    
        r23.e(100, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017d, code lost:
    
        r23.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0180, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void m(x6.C18114i r23, int r24) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.C18114i.m(x6.i, int):void");
    }

    public static C18114i q() {
        return f170544z;
    }

    public final void e(long j10, int i10) {
        new Timer().schedule(new a(i10), j10);
    }

    public final void f(Application application, String str) {
        this.f170545a = str;
        this.f170556l = T.e(application);
    }

    protected void h(String str) {
        r.e("PoW", "Error: ".concat(String.valueOf(str)), new Throwable[0]);
    }

    String n() {
        return this.f170545a + "/_bm/get_params?type=sdk-pow";
    }

    C18114i() {
    }

    public void g(Application application, String str, JSONObject jSONObject) {
        f(application, str);
        if (jSONObject == null) {
            e(1000L, 0);
        } else {
            b(jSONObject, 0);
        }
    }

    protected void o() {
        C18115j.a().c(this.f170566v);
    }
}
