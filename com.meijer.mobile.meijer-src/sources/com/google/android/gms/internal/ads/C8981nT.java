package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.nT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8981nT {

    /* renamed from: c, reason: collision with root package name */
    private final String f77892c;

    /* renamed from: d, reason: collision with root package name */
    private C7773c60 f77893d = null;

    /* renamed from: e, reason: collision with root package name */
    private Z50 f77894e = null;

    /* renamed from: f, reason: collision with root package name */
    private Oc.h2 f77895f = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f77891b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final List f77890a = Collections.synchronizedList(new ArrayList());

    private final synchronized void k(Z50 z50, int i10) {
        Map map = this.f77891b;
        String strJ = j(z50);
        if (map.containsKey(strJ)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = z50.f72903v.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, z50.f72903v.getString(next));
            } catch (JSONException unused) {
            }
        }
        Oc.h2 h2Var = new Oc.h2(z50.f72839E, 0L, null, bundle, z50.f72840F, z50.f72841G, z50.f72842H, z50.f72843I);
        try {
            this.f77890a.add(i10, h2Var);
        } catch (IndexOutOfBoundsException e10) {
            Nc.v.s().x(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.f77891b.put(strJ, h2Var);
    }

    public final List c() {
        return this.f77890a;
    }

    public final void f(Z50 z50, long j10, Oc.W0 w02) {
        l(z50, j10, w02, false);
    }

    public final void g(Z50 z50, long j10, Oc.W0 w02) {
        l(z50, j10, null, true);
    }

    public final synchronized void h(String str, List list) {
        if (this.f77891b.containsKey(str)) {
            int iIndexOf = this.f77890a.indexOf((Oc.h2) this.f77891b.get(str));
            try {
                this.f77890a.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e10) {
                Nc.v.s().x(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.f77891b.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k((Z50) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void i(C7773c60 c7773c60) {
        this.f77893d = c7773c60;
    }

    private static String j(Z50 z50) {
        return ((Boolean) Oc.A.c().a(C8784lf.f76828H3)).booleanValue() ? z50.f72892p0 : z50.f72905w;
    }

    private final void l(Z50 z50, long j10, Oc.W0 w02, boolean z10) {
        Map map = this.f77891b;
        String strJ = j(z50);
        if (map.containsKey(strJ)) {
            if (this.f77894e == null) {
                this.f77894e = z50;
            }
            Oc.h2 h2Var = (Oc.h2) this.f77891b.get(strJ);
            h2Var.f23456b = j10;
            h2Var.f23457c = w02;
            if (((Boolean) Oc.A.c().a(C8784lf.f76775D6)).booleanValue() && z10) {
                this.f77895f = h2Var;
            }
        }
    }

    public final Oc.h2 a() {
        return this.f77895f;
    }

    public final SB b() {
        return new SB(this.f77894e, "", this, this.f77893d, this.f77892c);
    }

    public final void d(Z50 z50) {
        k(z50, this.f77890a.size());
    }

    public final void e(Z50 z50) {
        int iIndexOf = this.f77890a.indexOf(this.f77891b.get(j(z50)));
        if (iIndexOf < 0 || iIndexOf >= this.f77891b.size()) {
            iIndexOf = this.f77890a.indexOf(this.f77895f);
        }
        if (iIndexOf < 0 || iIndexOf >= this.f77891b.size()) {
            return;
        }
        this.f77895f = (Oc.h2) this.f77890a.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f77890a.size()) {
                return;
            }
            Oc.h2 h2Var = (Oc.h2) this.f77890a.get(iIndexOf);
            h2Var.f23456b = 0L;
            h2Var.f23457c = null;
        }
    }

    public C8981nT(String str) {
        this.f77892c = str;
    }
}
