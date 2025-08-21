package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Nb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7113Nb0 implements InterfaceC8991nb0 {

    /* renamed from: i, reason: collision with root package name */
    private static final C7113Nb0 f69756i = new C7113Nb0();

    /* renamed from: j, reason: collision with root package name */
    private static final Handler f69757j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f69758k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f69759l = new RunnableC6978Jb0();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f69760m = new RunnableC7012Kb0();

    /* renamed from: b, reason: collision with root package name */
    private int f69762b;

    /* renamed from: h, reason: collision with root package name */
    private long f69768h;

    /* renamed from: a, reason: collision with root package name */
    private final List f69761a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f69763c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List f69764d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final C6876Gb0 f69766f = new C6876Gb0();

    /* renamed from: e, reason: collision with root package name */
    private final C9205pb0 f69765e = new C9205pb0();

    /* renamed from: g, reason: collision with root package name */
    private final C6910Hb0 f69767g = new C6910Hb0(new C7215Qb0());

    public static C7113Nb0 d() {
        return f69756i;
    }

    static /* bridge */ /* synthetic */ void g(C7113Nb0 c7113Nb0) throws JSONException {
        C7113Nb0 c7113Nb02;
        c7113Nb0.f69762b = 0;
        c7113Nb0.f69764d.clear();
        c7113Nb0.f69763c = false;
        for (C7010Ka0 c7010Ka0 : C7817cb0.a().b()) {
        }
        c7113Nb0.f69768h = System.nanoTime();
        c7113Nb0.f69766f.i();
        long jNanoTime = System.nanoTime();
        InterfaceC9098ob0 interfaceC9098ob0A = c7113Nb0.f69765e.a();
        if (c7113Nb0.f69766f.e().size() > 0) {
            Iterator it = c7113Nb0.f69766f.e().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectZza = interfaceC9098ob0A.zza(null);
                View viewA = c7113Nb0.f69766f.a(str);
                InterfaceC9098ob0 interfaceC9098ob0B = c7113Nb0.f69765e.b();
                String strC = c7113Nb0.f69766f.c(str);
                if (strC != null) {
                    JSONObject jSONObjectZza2 = interfaceC9098ob0B.zza(viewA);
                    C10274zb0.b(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strC);
                    } catch (JSONException e10) {
                        C6672Ab0.a("Error with setting not visible reason", e10);
                    }
                    C10274zb0.c(jSONObjectZza, jSONObjectZza2);
                }
                C10274zb0.f(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                c7113Nb0.f69767g.c(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (c7113Nb0.f69766f.f().size() > 0) {
            JSONObject jSONObjectZza3 = interfaceC9098ob0A.zza(null);
            c7113Nb02 = c7113Nb0;
            c7113Nb02.k(null, interfaceC9098ob0A, jSONObjectZza3, 1, false);
            C10274zb0.f(jSONObjectZza3);
            c7113Nb02.f69767g.d(jSONObjectZza3, c7113Nb02.f69766f.f(), jNanoTime);
        } else {
            c7113Nb02 = c7113Nb0;
            c7113Nb02.f69767g.b();
        }
        c7113Nb02.f69766f.g();
        long jNanoTime2 = System.nanoTime() - c7113Nb02.f69768h;
        if (c7113Nb02.f69761a.size() > 0) {
            for (InterfaceC7079Mb0 interfaceC7079Mb0 : c7113Nb02.f69761a) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                interfaceC7079Mb0.zzb();
                if (interfaceC7079Mb0 instanceof InterfaceC7046Lb0) {
                    ((InterfaceC7046Lb0) interfaceC7079Mb0).zza();
                }
            }
        }
        C8884mb0.a().c();
    }

    private final void k(View view, InterfaceC9098ob0 interfaceC9098ob0, JSONObject jSONObject, int i10, boolean z10) {
        interfaceC9098ob0.a(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void l() {
        Handler handler = f69758k;
        if (handler != null) {
            handler.removeCallbacks(f69760m);
            f69758k = null;
        }
    }

    public final void i() {
        if (f69758k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f69758k = handler;
            handler.post(f69759l);
            f69758k.postDelayed(f69760m, 200L);
        }
    }

    C7113Nb0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8991nb0
    public final void a(View view, InterfaceC9098ob0 interfaceC9098ob0, JSONObject jSONObject, boolean z10) throws JSONException {
        int iL;
        boolean z11;
        C7113Nb0 c7113Nb0;
        View view2;
        InterfaceC9098ob0 interfaceC9098ob02;
        boolean z12;
        if (C6808Eb0.a(view) == null && (iL = this.f69766f.l(view)) != 3) {
            JSONObject jSONObjectZza = interfaceC9098ob0.zza(view);
            C10274zb0.c(jSONObject, jSONObjectZza);
            String strD = this.f69766f.d(view);
            if (strD != null) {
                C10274zb0.b(jSONObjectZza, strD);
                try {
                    jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.f69766f.k(view)));
                } catch (JSONException e10) {
                    C6672Ab0.a("Error with setting has window focus", e10);
                }
                boolean zJ = this.f69766f.j(strD);
                Boolean boolValueOf = Boolean.valueOf(zJ);
                if (zJ) {
                    try {
                        jSONObjectZza.put("isPipActive", boolValueOf);
                    } catch (JSONException e11) {
                        C6672Ab0.a("Error with setting is picture-in-picture active", e11);
                    }
                }
                this.f69766f.h();
                c7113Nb0 = this;
            } else {
                C6842Fb0 c6842Fb0B = this.f69766f.b(view);
                if (c6842Fb0B != null) {
                    C8137fb0 c8137fb0A = c6842Fb0B.a();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayListB = c6842Fb0B.b();
                    int size = arrayListB.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        jSONArray.put((String) arrayListB.get(i10));
                    }
                    try {
                        jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                        jSONObjectZza.put("friendlyObstructionClass", c8137fb0A.d());
                        jSONObjectZza.put("friendlyObstructionPurpose", c8137fb0A.a());
                        jSONObjectZza.put("friendlyObstructionReason", c8137fb0A.c());
                    } catch (JSONException e12) {
                        C6672Ab0.a("Error with setting friendly obstruction", e12);
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 || z11) {
                    c7113Nb0 = this;
                    view2 = view;
                    interfaceC9098ob02 = interfaceC9098ob0;
                    z12 = true;
                } else {
                    view2 = view;
                    interfaceC9098ob02 = interfaceC9098ob0;
                    z12 = false;
                    c7113Nb0 = this;
                }
                c7113Nb0.k(view2, interfaceC9098ob02, jSONObjectZza, iL, z12);
            }
            c7113Nb0.f69762b++;
        }
    }

    public final void h() {
        l();
    }

    public final void j() {
        l();
        this.f69761a.clear();
        f69757j.post(new RunnableC6944Ib0(this));
    }
}
