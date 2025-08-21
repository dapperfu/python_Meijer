package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.f0;
import com.medallia.digital.mobilesdk.o6;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class j6 implements LifeCycle.h {

    /* renamed from: q, reason: collision with root package name */
    private static final int f93196q = 401;

    /* renamed from: r, reason: collision with root package name */
    private static final int f93197r = 403;

    /* renamed from: s, reason: collision with root package name */
    private static final double f93198s = 2.0d;

    /* renamed from: a, reason: collision with root package name */
    private o6.a f93199a;

    /* renamed from: b, reason: collision with root package name */
    private f0.d f93200b;

    /* renamed from: c, reason: collision with root package name */
    private String f93201c;

    /* renamed from: d, reason: collision with root package name */
    private int f93202d;

    /* renamed from: e, reason: collision with root package name */
    private int f93203e;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorService f93204f;

    /* renamed from: g, reason: collision with root package name */
    private HashMap<String, String> f93205g;

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f93206h;

    /* renamed from: i, reason: collision with root package name */
    private o6.b f93207i;

    /* renamed from: j, reason: collision with root package name */
    private f0 f93208j;

    /* renamed from: k, reason: collision with root package name */
    private int f93209k;

    /* renamed from: l, reason: collision with root package name */
    private long f93210l;

    /* renamed from: m, reason: collision with root package name */
    private long f93211m;

    /* renamed from: n, reason: collision with root package name */
    private Handler f93212n;

    /* renamed from: o, reason: collision with root package name */
    private String f93213o;

    /* renamed from: p, reason: collision with root package name */
    private final v4 f93214p;

    class a extends v4 {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            j6.this.a();
        }
    }

    class b implements o6.a {
        b() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            j6.this.a(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            j6.this.a(k6Var);
        }
    }

    class c implements o6.a {
        c() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            j6.this.a(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            j6.this.a(k6Var);
        }
    }

    class d implements o6.a {
        d() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            j6.this.a(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            j6.this.a(k6Var);
        }
    }

    j6() {
        this.f93209k = 0;
        this.f93212n = new Handler(Looper.getMainLooper());
        this.f93214p = new a();
        LifeCycle.b().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        a4.b("Retrying: " + this.f93209k + q2.f93563c + this.f93202d + " (" + this.f93208j.i() + ")");
        try {
            this.f93204f.submit(this.f93208j);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    private boolean c() {
        return System.currentTimeMillis() - this.f93210l < this.f93211m;
    }

    private boolean d() {
        return c() && this.f93209k > 0;
    }

    protected void b() {
        f0 i0Var;
        a4.b("Rest call started = " + this.f93201c);
        this.f93210l = System.currentTimeMillis();
        o6.b bVar = this.f93207i;
        if (bVar == o6.b.String) {
            String str = this.f93213o;
            if (str != null) {
                i0Var = new e7(this.f93200b, this.f93201c, this.f93205g, this.f93206h, str, this.f93203e, new b());
                this.f93208j = i0Var;
            } else {
                this.f93208j = new e7(this.f93200b, this.f93201c, this.f93205g, this.f93206h, this.f93203e, new c());
            }
        } else if (bVar == o6.b.BYTES) {
            i0Var = new i0(this.f93200b, this.f93201c, this.f93205g, this.f93203e, new d());
            this.f93208j = i0Var;
        }
        this.f93204f.submit(this.f93208j);
    }

    protected void e() {
        if (LifeCycle.b().f()) {
            return;
        }
        long jPow = ((long) Math.pow(f93198s, this.f93209k)) * 1000;
        f();
        if (this.f93212n == null) {
            this.f93212n = new Handler(Looper.getMainLooper());
        }
        this.f93212n.postDelayed(this.f93214p, jPow);
    }

    protected void f() {
        this.f93212n.removeCallbacks(this.f93214p);
        this.f93212n.removeCallbacksAndMessages(null);
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        f();
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
        if (d()) {
            e();
            return;
        }
        if (c()) {
            return;
        }
        a4.b("Request = " + this.f93208j.i() + " was paused because of refresh session");
    }

    j6(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, int i10, int i11, o6.a aVar, long j10) {
        this();
        a(executorService, bVar, dVar, str, map, jSONObject, i10, i11, aVar, j10);
        b();
    }

    protected void a(i6 i6Var) {
        if (i6Var.b() == 401 || i6Var.b() == 403) {
            LifeCycle.b().b(this);
            a4.b("Rest call error = " + this.f93201c);
            o6.a aVar = this.f93199a;
            if (aVar != null) {
                aVar.a(i6Var);
                return;
            }
            return;
        }
        int i10 = this.f93209k;
        if (i10 != this.f93202d) {
            this.f93209k = i10 + 1;
            e();
            return;
        }
        LifeCycle.b().b(this);
        o6.a aVar2 = this.f93199a;
        if (aVar2 != null) {
            aVar2.a(i6Var);
        }
        AnalyticsBridge.getInstance().reportRestClientEvent(this.f93210l, System.currentTimeMillis(), this.f93201c, i6Var.b(), this.f93209k, this.f93200b == f0.d.GET ? Double.valueOf(0.0d) : null);
    }

    j6(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, String str2, int i10, int i11, o6.a aVar, long j10) {
        this();
        a(executorService, bVar, dVar, str, map, jSONObject, str2, i10, i11, aVar, j10);
        b();
    }

    protected void a(k6 k6Var) {
        Double dValueOf;
        int length;
        if (this.f93200b == f0.d.GET) {
            dValueOf = Double.valueOf(0.0d);
            if (k6Var != null) {
                if (k6Var.b() != null && k6Var.b().getBytes() != null) {
                    length = k6Var.b().getBytes().length;
                } else if (k6Var.a() != null) {
                    length = k6Var.a().length;
                }
                dValueOf = Double.valueOf(length / 1024.0d);
            }
        } else {
            dValueOf = null;
        }
        AnalyticsBridge.getInstance().reportRestClientEvent(this.f93210l, System.currentTimeMillis(), this.f93201c, k6Var != null ? k6Var.c() : -1, this.f93209k, dValueOf);
        LifeCycle.b().b(this);
        a4.b("Rest call success = " + this.f93201c);
        o6.a aVar = this.f93199a;
        if (aVar != null) {
            aVar.a(k6Var);
        }
    }

    protected void a(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, int i10, int i11, o6.a aVar, long j10) {
        a(executorService, bVar, dVar, str, map, jSONObject, null, i10, i11, aVar, j10);
    }

    protected void a(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, String str2, int i10, int i11, o6.a aVar, long j10) {
        this.f93207i = bVar;
        this.f93200b = dVar;
        this.f93201c = str;
        this.f93205g = map;
        this.f93206h = jSONObject;
        this.f93202d = i10;
        this.f93203e = i11;
        this.f93199a = aVar;
        this.f93204f = executorService;
        this.f93211m = j10;
        this.f93213o = str2;
    }
}
