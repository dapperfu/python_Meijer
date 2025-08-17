package w6;

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

/* renamed from: w6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17787i {

    /* renamed from: y, reason: collision with root package name */
    private static final Locale f165898y = Locale.US;

    /* renamed from: z, reason: collision with root package name */
    private static final C17787i f165899z = new C17787i();

    /* renamed from: a, reason: collision with root package name */
    String f165900a;

    /* renamed from: e, reason: collision with root package name */
    private String f165904e;

    /* renamed from: f, reason: collision with root package name */
    long f165905f;

    /* renamed from: g, reason: collision with root package name */
    private long f165906g;

    /* renamed from: h, reason: collision with root package name */
    private long f165907h;

    /* renamed from: i, reason: collision with root package name */
    private long f165908i;

    /* renamed from: j, reason: collision with root package name */
    private long f165909j;

    /* renamed from: k, reason: collision with root package name */
    private String f165910k;

    /* renamed from: l, reason: collision with root package name */
    private String f165911l;

    /* renamed from: m, reason: collision with root package name */
    private long f165912m;

    /* renamed from: n, reason: collision with root package name */
    private String f165913n;

    /* renamed from: o, reason: collision with root package name */
    private int f165914o;

    /* renamed from: p, reason: collision with root package name */
    private int f165915p;

    /* renamed from: q, reason: collision with root package name */
    private long f165916q;

    /* renamed from: d, reason: collision with root package name */
    private int f165903d = -1;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<String> f165917r = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    private ArrayList<Long> f165918s = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<Integer> f165919t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    private String f165920u = "";

    /* renamed from: v, reason: collision with root package name */
    String f165921v = "";

    /* renamed from: w, reason: collision with root package name */
    private int f165922w = 0;

    /* renamed from: x, reason: collision with root package name */
    public String f165923x = "";

    /* renamed from: b, reason: collision with root package name */
    public int f165901b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f165902c = 0;

    /* renamed from: w6.i$a */
    final class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f165924a;

        /* renamed from: w6.i$a$a, reason: collision with other inner class name */
        final class RunnableC2633a implements Runnable {
            RunnableC2633a() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                a aVar = a.this;
                C17787i.i(C17787i.this, aVar.f165924a);
            }
        }

        a(int i10) {
            this.f165924a = i10;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            new Thread(new RunnableC2633a()).start();
        }
    }

    /* renamed from: w6.i$b */
    final class b extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f165927a;

        /* renamed from: w6.i$b$a */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() throws NoSuchAlgorithmException {
                b bVar = b.this;
                C17787i.m(C17787i.this, bVar.f165927a);
            }
        }

        b(int i10) {
            this.f165927a = i10;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            new Thread(new a()).start();
        }
    }

    private void c() {
        this.f165914o = 0;
        this.f165915p = 0;
        this.f165917r = new ArrayList<>();
        this.f165918s = new ArrayList<>();
        this.f165919t = new ArrayList<>();
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
    static /* synthetic */ void i(w6.C17787i r8, int r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.C17787i.i(w6.i, int):void");
    }

    protected void d(int i10) {
    }

    final void k(int i10) {
        synchronized (this) {
            this.f165901b = i10;
        }
    }

    protected void p() {
    }

    final synchronized String r() {
        if (this.f165903d == 0) {
            return "";
        }
        if (this.f165921v.length() != 0) {
            int i10 = this.f165922w + 1;
            this.f165922w = i10;
            if (i10 >= this.f165908i * 0.9d) {
                e(100L, 0);
            }
            return this.f165921v;
        }
        if (this.f165920u.length() != 0) {
            return this.f165920u;
        }
        Context context = C17788j.a().f165931a.get();
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
            this.f165903d = jSONObject.getInt("mode");
            this.f165904e = jSONObject.getString("nonce");
            this.f165905f = jSONObject.getLong("ttl");
            this.f165906g = jSONObject.getLong("difficulty");
            this.f165907h = jSONObject.getLong("timeout");
            if (i10 == 0) {
                this.f165908i = jSONObject.getLong("n");
            }
            this.f165909j = jSONObject.getLong("s_timeout");
            this.f165910k = jSONObject.getString("checksum");
            if (this.f165903d != 0) {
                this.f165923x = "Enabled";
                this.f165902c = 0;
                this.f165912m = SystemClock.uptimeMillis();
                this.f165913n = this.f165911l + this.f165912m + this.f165904e;
                this.f165920u = this.f165911l + ";" + this.f165912m + ";" + this.f165904e + ";" + this.f165906g + ";" + this.f165910k;
                this.f165916q = SystemClock.uptimeMillis();
                this.f165914o = 0;
                if (this.f165901b == 2) {
                    r.d("PoW", "Cancel Get Params", new Throwable[0]);
                    p();
                    return Boolean.TRUE;
                }
                l(100L, i10);
            } else {
                k(0);
                this.f165923x = "Disabled";
            }
            if (i10 == 0) {
                e(this.f165905f * 1000, i10);
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
        sb2.append(this.f165920u);
        sb2.append(";");
        Iterator<String> it = this.f165917r.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(";");
        Iterator<Long> it2 = this.f165918s.iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(";");
        Iterator<Integer> it3 = this.f165919t.iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        synchronized (this) {
            this.f165921v = sb2.toString();
            this.f165922w = 0;
        }
        r.c("PoW", "PoW Data: " + this.f165921v, new Throwable[0]);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f165912m;
        r.c("PoW", "Time taken to solve PoW challenge: " + jUptimeMillis + "ms", new Throwable[0]);
        this.f165923x = "Solved in " + jUptimeMillis + "ms";
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
    
        r23.f165914o++;
        r23.f165916q = android.os.SystemClock.uptimeMillis();
        r23.d(r23.f165914o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x013c, code lost:
    
        if (r23.f165914o >= 10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013e, code lost:
    
        r23.f165915p = 0;
        r23.l(r23.f165907h + r14, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0147, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0148, code lost:
    
        r23.f165915p = 0;
        r23.j();
        r23.f165917r = new java.util.ArrayList<>();
        r23.f165918s = new java.util.ArrayList<>();
        r23.f165919t = new java.util.ArrayList<>();
        r23.k(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0174, code lost:
    
        if ((android.os.SystemClock.uptimeMillis() - r23.f165912m) <= (r23.f165905f * 1000)) goto L37;
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
    static /* synthetic */ void m(w6.C17787i r23, int r24) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.C17787i.m(w6.i, int):void");
    }

    public static C17787i q() {
        return f165899z;
    }

    public final void e(long j10, int i10) {
        new Timer().schedule(new a(i10), j10);
    }

    public final void f(Application application, String str) {
        this.f165900a = str;
        this.f165911l = T.e(application);
    }

    protected void h(String str) {
        r.e("PoW", "Error: ".concat(String.valueOf(str)), new Throwable[0]);
    }

    String n() {
        return this.f165900a + "/_bm/get_params?type=sdk-pow";
    }

    C17787i() {
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
        C17788j.a().c(this.f165921v);
    }
}
