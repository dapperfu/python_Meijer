package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.f0;
import com.medallia.digital.mobilesdk.o6;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class j6 implements LifeCycle.h {

    /* renamed from: q, reason: collision with root package name */
    private static final int f92357q = 401;

    /* renamed from: r, reason: collision with root package name */
    private static final int f92358r = 403;

    /* renamed from: s, reason: collision with root package name */
    private static final double f92359s = 2.0d;

    /* renamed from: a, reason: collision with root package name */
    private o6.a f92360a;

    /* renamed from: b, reason: collision with root package name */
    private f0.d f92361b;

    /* renamed from: c, reason: collision with root package name */
    private String f92362c;

    /* renamed from: d, reason: collision with root package name */
    private int f92363d;

    /* renamed from: e, reason: collision with root package name */
    private int f92364e;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorService f92365f;

    /* renamed from: g, reason: collision with root package name */
    private HashMap<String, String> f92366g;

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f92367h;

    /* renamed from: i, reason: collision with root package name */
    private o6.b f92368i;

    /* renamed from: j, reason: collision with root package name */
    private f0 f92369j;

    /* renamed from: k, reason: collision with root package name */
    private int f92370k;

    /* renamed from: l, reason: collision with root package name */
    private long f92371l;

    /* renamed from: m, reason: collision with root package name */
    private long f92372m;

    /* renamed from: n, reason: collision with root package name */
    private Handler f92373n;

    /* renamed from: o, reason: collision with root package name */
    private String f92374o;

    /* renamed from: p, reason: collision with root package name */
    private final v4 f92375p;

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
        this.f92370k = 0;
        this.f92373n = new Handler(Looper.getMainLooper());
        this.f92375p = new a();
        LifeCycle.b().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        a4.b("Retrying: " + this.f92370k + q2.f92724c + this.f92363d + " (" + this.f92369j.i() + ")");
        try {
            this.f92365f.submit(this.f92369j);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    private boolean c() {
        return System.currentTimeMillis() - this.f92371l < this.f92372m;
    }

    private boolean d() {
        return c() && this.f92370k > 0;
    }

    protected void b() {
        f0 i0Var;
        a4.b("Rest call started = " + this.f92362c);
        this.f92371l = System.currentTimeMillis();
        o6.b bVar = this.f92368i;
        if (bVar == o6.b.String) {
            String str = this.f92374o;
            if (str != null) {
                i0Var = new e7(this.f92361b, this.f92362c, this.f92366g, this.f92367h, str, this.f92364e, new b());
                this.f92369j = i0Var;
            } else {
                this.f92369j = new e7(this.f92361b, this.f92362c, this.f92366g, this.f92367h, this.f92364e, new c());
            }
        } else if (bVar == o6.b.BYTES) {
            i0Var = new i0(this.f92361b, this.f92362c, this.f92366g, this.f92364e, new d());
            this.f92369j = i0Var;
        }
        this.f92365f.submit(this.f92369j);
    }

    protected void e() {
        if (LifeCycle.b().f()) {
            return;
        }
        long jPow = ((long) Math.pow(f92359s, this.f92370k)) * 1000;
        f();
        if (this.f92373n == null) {
            this.f92373n = new Handler(Looper.getMainLooper());
        }
        this.f92373n.postDelayed(this.f92375p, jPow);
    }

    protected void f() {
        this.f92373n.removeCallbacks(this.f92375p);
        this.f92373n.removeCallbacksAndMessages(null);
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
        a4.b("Request = " + this.f92369j.i() + " was paused because of refresh session");
    }

    j6(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, int i10, int i11, o6.a aVar, long j10) {
        this();
        a(executorService, bVar, dVar, str, map, jSONObject, i10, i11, aVar, j10);
        b();
    }

    protected void a(i6 i6Var) {
        if (i6Var.b() == 401 || i6Var.b() == 403) {
            LifeCycle.b().b(this);
            a4.b("Rest call error = " + this.f92362c);
            o6.a aVar = this.f92360a;
            if (aVar != null) {
                aVar.a(i6Var);
                return;
            }
            return;
        }
        int i10 = this.f92370k;
        if (i10 != this.f92363d) {
            this.f92370k = i10 + 1;
            e();
            return;
        }
        LifeCycle.b().b(this);
        o6.a aVar2 = this.f92360a;
        if (aVar2 != null) {
            aVar2.a(i6Var);
        }
        AnalyticsBridge.getInstance().reportRestClientEvent(this.f92371l, System.currentTimeMillis(), this.f92362c, i6Var.b(), this.f92370k, this.f92361b == f0.d.GET ? Double.valueOf(0.0d) : null);
    }

    j6(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, String str2, int i10, int i11, o6.a aVar, long j10) {
        this();
        a(executorService, bVar, dVar, str, map, jSONObject, str2, i10, i11, aVar, j10);
        b();
    }

    protected void a(k6 k6Var) {
        Double dValueOf;
        int length;
        if (this.f92361b == f0.d.GET) {
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
        AnalyticsBridge.getInstance().reportRestClientEvent(this.f92371l, System.currentTimeMillis(), this.f92362c, k6Var != null ? k6Var.c() : -1, this.f92370k, dValueOf);
        LifeCycle.b().b(this);
        a4.b("Rest call success = " + this.f92362c);
        o6.a aVar = this.f92360a;
        if (aVar != null) {
            aVar.a(k6Var);
        }
    }

    protected void a(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, int i10, int i11, o6.a aVar, long j10) {
        a(executorService, bVar, dVar, str, map, jSONObject, null, i10, i11, aVar, j10);
    }

    protected void a(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, String str2, int i10, int i11, o6.a aVar, long j10) {
        this.f92368i = bVar;
        this.f92361b = dVar;
        this.f92362c = str;
        this.f92366g = map;
        this.f92367h = jSONObject;
        this.f92363d = i10;
        this.f92364e = i11;
        this.f92360a = aVar;
        this.f92365f = executorService;
        this.f92372m = j10;
        this.f92374o = str2;
    }
}
