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
public final class C6988Nb0 implements InterfaceC8866nb0 {

    /* renamed from: i, reason: collision with root package name */
    private static final C6988Nb0 f68916i = new C6988Nb0();

    /* renamed from: j, reason: collision with root package name */
    private static final Handler f68917j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f68918k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f68919l = new RunnableC6853Jb0();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f68920m = new RunnableC6887Kb0();

    /* renamed from: b, reason: collision with root package name */
    private int f68922b;

    /* renamed from: h, reason: collision with root package name */
    private long f68928h;

    /* renamed from: a, reason: collision with root package name */
    private final List f68921a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f68923c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List f68924d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final C6751Gb0 f68926f = new C6751Gb0();

    /* renamed from: e, reason: collision with root package name */
    private final C9080pb0 f68925e = new C9080pb0();

    /* renamed from: g, reason: collision with root package name */
    private final C6785Hb0 f68927g = new C6785Hb0(new C7090Qb0());

    public static C6988Nb0 d() {
        return f68916i;
    }

    static /* bridge */ /* synthetic */ void g(C6988Nb0 c6988Nb0) throws JSONException {
        C6988Nb0 c6988Nb02;
        c6988Nb0.f68922b = 0;
        c6988Nb0.f68924d.clear();
        c6988Nb0.f68923c = false;
        for (C6885Ka0 c6885Ka0 : C7692cb0.a().b()) {
        }
        c6988Nb0.f68928h = System.nanoTime();
        c6988Nb0.f68926f.i();
        long jNanoTime = System.nanoTime();
        InterfaceC8973ob0 interfaceC8973ob0A = c6988Nb0.f68925e.a();
        if (c6988Nb0.f68926f.e().size() > 0) {
            Iterator it = c6988Nb0.f68926f.e().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectZza = interfaceC8973ob0A.zza(null);
                View viewA = c6988Nb0.f68926f.a(str);
                InterfaceC8973ob0 interfaceC8973ob0B = c6988Nb0.f68925e.b();
                String strC = c6988Nb0.f68926f.c(str);
                if (strC != null) {
                    JSONObject jSONObjectZza2 = interfaceC8973ob0B.zza(viewA);
                    C10149zb0.b(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strC);
                    } catch (JSONException e10) {
                        C6547Ab0.a("Error with setting not visible reason", e10);
                    }
                    C10149zb0.c(jSONObjectZza, jSONObjectZza2);
                }
                C10149zb0.f(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                c6988Nb0.f68927g.c(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (c6988Nb0.f68926f.f().size() > 0) {
            JSONObject jSONObjectZza3 = interfaceC8973ob0A.zza(null);
            c6988Nb02 = c6988Nb0;
            c6988Nb02.k(null, interfaceC8973ob0A, jSONObjectZza3, 1, false);
            C10149zb0.f(jSONObjectZza3);
            c6988Nb02.f68927g.d(jSONObjectZza3, c6988Nb02.f68926f.f(), jNanoTime);
        } else {
            c6988Nb02 = c6988Nb0;
            c6988Nb02.f68927g.b();
        }
        c6988Nb02.f68926f.g();
        long jNanoTime2 = System.nanoTime() - c6988Nb02.f68928h;
        if (c6988Nb02.f68921a.size() > 0) {
            for (InterfaceC6954Mb0 interfaceC6954Mb0 : c6988Nb02.f68921a) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                interfaceC6954Mb0.zzb();
                if (interfaceC6954Mb0 instanceof InterfaceC6921Lb0) {
                    ((InterfaceC6921Lb0) interfaceC6954Mb0).zza();
                }
            }
        }
        C8759mb0.a().c();
    }

    private final void k(View view, InterfaceC8973ob0 interfaceC8973ob0, JSONObject jSONObject, int i10, boolean z10) {
        interfaceC8973ob0.a(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void l() {
        Handler handler = f68918k;
        if (handler != null) {
            handler.removeCallbacks(f68920m);
            f68918k = null;
        }
    }

    public final void i() {
        if (f68918k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f68918k = handler;
            handler.post(f68919l);
            f68918k.postDelayed(f68920m, 200L);
        }
    }

    C6988Nb0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8866nb0
    public final void a(View view, InterfaceC8973ob0 interfaceC8973ob0, JSONObject jSONObject, boolean z10) throws JSONException {
        int iL;
        boolean z11;
        C6988Nb0 c6988Nb0;
        View view2;
        InterfaceC8973ob0 interfaceC8973ob02;
        boolean z12;
        if (C6683Eb0.a(view) == null && (iL = this.f68926f.l(view)) != 3) {
            JSONObject jSONObjectZza = interfaceC8973ob0.zza(view);
            C10149zb0.c(jSONObject, jSONObjectZza);
            String strD = this.f68926f.d(view);
            if (strD != null) {
                C10149zb0.b(jSONObjectZza, strD);
                try {
                    jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.f68926f.k(view)));
                } catch (JSONException e10) {
                    C6547Ab0.a("Error with setting has window focus", e10);
                }
                boolean zJ = this.f68926f.j(strD);
                Boolean boolValueOf = Boolean.valueOf(zJ);
                if (zJ) {
                    try {
                        jSONObjectZza.put("isPipActive", boolValueOf);
                    } catch (JSONException e11) {
                        C6547Ab0.a("Error with setting is picture-in-picture active", e11);
                    }
                }
                this.f68926f.h();
                c6988Nb0 = this;
            } else {
                C6717Fb0 c6717Fb0B = this.f68926f.b(view);
                if (c6717Fb0B != null) {
                    C8012fb0 c8012fb0A = c6717Fb0B.a();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayListB = c6717Fb0B.b();
                    int size = arrayListB.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        jSONArray.put((String) arrayListB.get(i10));
                    }
                    try {
                        jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                        jSONObjectZza.put("friendlyObstructionClass", c8012fb0A.d());
                        jSONObjectZza.put("friendlyObstructionPurpose", c8012fb0A.a());
                        jSONObjectZza.put("friendlyObstructionReason", c8012fb0A.c());
                    } catch (JSONException e12) {
                        C6547Ab0.a("Error with setting friendly obstruction", e12);
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 || z11) {
                    c6988Nb0 = this;
                    view2 = view;
                    interfaceC8973ob02 = interfaceC8973ob0;
                    z12 = true;
                } else {
                    view2 = view;
                    interfaceC8973ob02 = interfaceC8973ob0;
                    z12 = false;
                    c6988Nb0 = this;
                }
                c6988Nb0.k(view2, interfaceC8973ob02, jSONObjectZza, iL, z12);
            }
            c6988Nb0.f68922b++;
        }
    }

    public final void h() {
        l();
    }

    public final void j() {
        l();
        this.f68921a.clear();
        f68917j.post(new RunnableC6819Ib0(this));
    }
}
