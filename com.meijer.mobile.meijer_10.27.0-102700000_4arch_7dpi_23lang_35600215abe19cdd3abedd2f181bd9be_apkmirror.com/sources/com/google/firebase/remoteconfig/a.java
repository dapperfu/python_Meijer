package com.google.firebase.remoteconfig;

import Jf.e;
import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5225c;
import Td.InterfaceC5231i;
import android.content.Context;
import cf.j;
import com.fullstory.FS;
import com.google.firebase.abt.AbtException;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import dg.h;
import eg.C13660e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f89153n = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final Context f89154a;

    /* renamed from: b, reason: collision with root package name */
    private final f f89155b;

    /* renamed from: c, reason: collision with root package name */
    private final Xe.b f89156c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f89157d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f89158e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f89159f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f89160g;

    /* renamed from: h, reason: collision with root package name */
    private final m f89161h;

    /* renamed from: i, reason: collision with root package name */
    private final o f89162i;

    /* renamed from: j, reason: collision with root package name */
    private final t f89163j;

    /* renamed from: k, reason: collision with root package name */
    private final e f89164k;

    /* renamed from: l, reason: collision with root package name */
    private final p f89165l;

    /* renamed from: m, reason: collision with root package name */
    private final C13660e f89166m;

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

    public AbstractC5232j<Boolean> e() {
        final AbstractC5232j<g> abstractC5232jE = this.f89158e.e();
        final AbstractC5232j<g> abstractC5232jE2 = this.f89159f.e();
        return C5235m.k(abstractC5232jE, abstractC5232jE2).l(this.f89157d, new InterfaceC5225c() { // from class: dg.e
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                return com.google.firebase.remoteconfig.a.d(this.f127379a, abstractC5232jE, abstractC5232jE2, abstractC5232j);
            }
        });
    }

    public AbstractC5232j<Void> f() {
        return this.f89161h.i().t(j.a(), new InterfaceC5231i() { // from class: dg.f
            @Override // Td.InterfaceC5231i
            public final AbstractC5232j then(Object obj) {
                return C5235m.f(null);
            }
        });
    }

    public Map<String, dg.j> h() {
        return this.f89162i.d();
    }

    public h i() {
        return this.f89163j.d();
    }

    C13660e j() {
        return this.f89166m;
    }

    void m(boolean z10) {
        this.f89165l.b(z10);
    }

    void n() {
        this.f89159f.e();
        this.f89160g.e();
        this.f89158e.e();
    }

    void p(JSONArray jSONArray) {
        if (this.f89156c == null) {
            return;
        }
        try {
            this.f89156c.m(o(jSONArray));
        } catch (AbtException e10) {
            FS.log_w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            FS.log_e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
        }
    }

    a(Context context, f fVar, e eVar, Xe.b bVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, t tVar, p pVar, C13660e c13660e) {
        this.f89154a = context;
        this.f89155b = fVar;
        this.f89164k = eVar;
        this.f89156c = bVar;
        this.f89157d = executor;
        this.f89158e = fVar2;
        this.f89159f = fVar3;
        this.f89160g = fVar4;
        this.f89161h = mVar;
        this.f89162i = oVar;
        this.f89163j = tVar;
        this.f89165l = pVar;
        this.f89166m = c13660e;
    }

    public static /* synthetic */ AbstractC5232j d(final a aVar, AbstractC5232j abstractC5232j, AbstractC5232j abstractC5232j2, AbstractC5232j abstractC5232j3) {
        aVar.getClass();
        if (abstractC5232j.r() && abstractC5232j.n() != null) {
            g gVar = (g) abstractC5232j.n();
            if (abstractC5232j2.r() && !k(gVar, (g) abstractC5232j2.n())) {
                return C5235m.f(Boolean.FALSE);
            }
            return aVar.f89159f.i(gVar).j(aVar.f89157d, new InterfaceC5225c() { // from class: dg.g
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j4) {
                    return Boolean.valueOf(this.f127382a.l(abstractC5232j4));
                }
            });
        }
        return C5235m.f(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(AbstractC5232j<g> abstractC5232j) {
        if (abstractC5232j.r()) {
            this.f89158e.d();
            g gVarN = abstractC5232j.n();
            if (gVarN != null) {
                p(gVarN.e());
                this.f89166m.d(gVarN);
                return true;
            }
            FS.log_e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    public AbstractC5232j<Boolean> g() {
        return f().t(this.f89157d, new InterfaceC5231i() { // from class: dg.d
            @Override // Td.InterfaceC5231i
            public final AbstractC5232j then(Object obj) {
                return this.f127378a.e();
            }
        });
    }
}
