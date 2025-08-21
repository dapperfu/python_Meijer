package com.google.firebase.remoteconfig;

import Lf.e;
import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import Vd.InterfaceC5515i;
import android.content.Context;
import com.fullstory.FS;
import com.google.firebase.abt.AbtException;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import ef.j;
import fg.h;
import gg.C14364e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f89995n = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final Context f89996a;

    /* renamed from: b, reason: collision with root package name */
    private final f f89997b;

    /* renamed from: c, reason: collision with root package name */
    private final Ze.b f89998c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f89999d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f90000e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f90001f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f90002g;

    /* renamed from: h, reason: collision with root package name */
    private final m f90003h;

    /* renamed from: i, reason: collision with root package name */
    private final o f90004i;

    /* renamed from: j, reason: collision with root package name */
    private final t f90005j;

    /* renamed from: k, reason: collision with root package name */
    private final e f90006k;

    /* renamed from: l, reason: collision with root package name */
    private final p f90007l;

    /* renamed from: m, reason: collision with root package name */
    private final C14364e f90008m;

    private static boolean k(g gVar, g gVar2) {
        return gVar2 == null || !gVar.h().equals(gVar2.h());
    }

    static List<Map<String, String>> o(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public AbstractC5516j<Boolean> e() {
        final AbstractC5516j<g> abstractC5516jE = this.f90000e.e();
        final AbstractC5516j<g> abstractC5516jE2 = this.f90001f.e();
        return C5519m.k(abstractC5516jE, abstractC5516jE2).l(this.f89999d, new InterfaceC5509c() { // from class: fg.e
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j) {
                return com.google.firebase.remoteconfig.a.d(this.f131708a, abstractC5516jE, abstractC5516jE2, abstractC5516j);
            }
        });
    }

    public AbstractC5516j<Void> f() {
        return this.f90003h.i().t(j.a(), new InterfaceC5515i() { // from class: fg.f
            @Override // Vd.InterfaceC5515i
            public final AbstractC5516j then(Object obj) {
                return C5519m.f(null);
            }
        });
    }

    public Map<String, fg.j> h() {
        return this.f90004i.d();
    }

    public h i() {
        return this.f90005j.d();
    }

    C14364e j() {
        return this.f90008m;
    }

    void m(boolean z10) {
        this.f90007l.b(z10);
    }

    void n() {
        this.f90001f.e();
        this.f90002g.e();
        this.f90000e.e();
    }

    void p(JSONArray jSONArray) {
        if (this.f89998c == null) {
            return;
        }
        try {
            this.f89998c.m(o(jSONArray));
        } catch (AbtException e10) {
            FS.log_w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            FS.log_e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
        }
    }

    a(Context context, f fVar, e eVar, Ze.b bVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, t tVar, p pVar, C14364e c14364e) {
        this.f89996a = context;
        this.f89997b = fVar;
        this.f90006k = eVar;
        this.f89998c = bVar;
        this.f89999d = executor;
        this.f90000e = fVar2;
        this.f90001f = fVar3;
        this.f90002g = fVar4;
        this.f90003h = mVar;
        this.f90004i = oVar;
        this.f90005j = tVar;
        this.f90007l = pVar;
        this.f90008m = c14364e;
    }

    public static /* synthetic */ AbstractC5516j d(final a aVar, AbstractC5516j abstractC5516j, AbstractC5516j abstractC5516j2, AbstractC5516j abstractC5516j3) {
        aVar.getClass();
        if (abstractC5516j.r() && abstractC5516j.n() != null) {
            g gVar = (g) abstractC5516j.n();
            if (abstractC5516j2.r() && !k(gVar, (g) abstractC5516j2.n())) {
                return C5519m.f(Boolean.FALSE);
            }
            return aVar.f90001f.i(gVar).j(aVar.f89999d, new InterfaceC5509c() { // from class: fg.g
                @Override // Vd.InterfaceC5509c
                public final Object then(AbstractC5516j abstractC5516j4) {
                    return Boolean.valueOf(this.f131711a.l(abstractC5516j4));
                }
            });
        }
        return C5519m.f(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(AbstractC5516j<g> abstractC5516j) {
        if (abstractC5516j.r()) {
            this.f90000e.d();
            g gVarN = abstractC5516j.n();
            if (gVarN != null) {
                p(gVarN.e());
                this.f90008m.d(gVarN);
                return true;
            }
            FS.log_e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    public AbstractC5516j<Boolean> g() {
        return f().t(this.f89999d, new InterfaceC5515i() { // from class: fg.d
            @Override // Vd.InterfaceC5515i
            public final AbstractC5516j then(Object obj) {
                return this.f131707a.e();
            }
        });
    }
}
