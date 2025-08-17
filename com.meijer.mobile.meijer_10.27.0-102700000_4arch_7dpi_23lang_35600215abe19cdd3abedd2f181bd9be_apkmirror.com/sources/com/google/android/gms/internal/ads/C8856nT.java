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
public final class C8856nT {

    /* renamed from: c, reason: collision with root package name */
    private final String f77052c;

    /* renamed from: d, reason: collision with root package name */
    private C7648c60 f77053d = null;

    /* renamed from: e, reason: collision with root package name */
    private Z50 f77054e = null;

    /* renamed from: f, reason: collision with root package name */
    private Mc.h2 f77055f = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f77051b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final List f77050a = Collections.synchronizedList(new ArrayList());

    private final synchronized void k(Z50 z50, int i10) {
        Map map = this.f77051b;
        String strJ = j(z50);
        if (map.containsKey(strJ)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = z50.f72063v.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, z50.f72063v.getString(next));
            } catch (JSONException unused) {
            }
        }
        Mc.h2 h2Var = new Mc.h2(z50.f71999E, 0L, null, bundle, z50.f72000F, z50.f72001G, z50.f72002H, z50.f72003I);
        try {
            this.f77050a.add(i10, h2Var);
        } catch (IndexOutOfBoundsException e10) {
            Lc.v.s().x(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.f77051b.put(strJ, h2Var);
    }

    public final List c() {
        return this.f77050a;
    }

    public final void f(Z50 z50, long j10, Mc.W0 w02) {
        l(z50, j10, w02, false);
    }

    public final void g(Z50 z50, long j10, Mc.W0 w02) {
        l(z50, j10, null, true);
    }

    public final synchronized void h(String str, List list) {
        if (this.f77051b.containsKey(str)) {
            int iIndexOf = this.f77050a.indexOf((Mc.h2) this.f77051b.get(str));
            try {
                this.f77050a.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e10) {
                Lc.v.s().x(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.f77051b.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k((Z50) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void i(C7648c60 c7648c60) {
        this.f77053d = c7648c60;
    }

    private static String j(Z50 z50) {
        return ((Boolean) Mc.A.c().a(C8659lf.f75988H3)).booleanValue() ? z50.f72052p0 : z50.f72065w;
    }

    private final void l(Z50 z50, long j10, Mc.W0 w02, boolean z10) {
        Map map = this.f77051b;
        String strJ = j(z50);
        if (map.containsKey(strJ)) {
            if (this.f77054e == null) {
                this.f77054e = z50;
            }
            Mc.h2 h2Var = (Mc.h2) this.f77051b.get(strJ);
            h2Var.f19269b = j10;
            h2Var.f19270c = w02;
            if (((Boolean) Mc.A.c().a(C8659lf.f75935D6)).booleanValue() && z10) {
                this.f77055f = h2Var;
            }
        }
    }

    public final Mc.h2 a() {
        return this.f77055f;
    }

    public final SB b() {
        return new SB(this.f77054e, "", this, this.f77053d, this.f77052c);
    }

    public final void d(Z50 z50) {
        k(z50, this.f77050a.size());
    }

    public final void e(Z50 z50) {
        int iIndexOf = this.f77050a.indexOf(this.f77051b.get(j(z50)));
        if (iIndexOf < 0 || iIndexOf >= this.f77051b.size()) {
            iIndexOf = this.f77050a.indexOf(this.f77055f);
        }
        if (iIndexOf < 0 || iIndexOf >= this.f77051b.size()) {
            return;
        }
        this.f77055f = (Mc.h2) this.f77050a.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f77050a.size()) {
                return;
            }
            Mc.h2 h2Var = (Mc.h2) this.f77050a.get(iIndexOf);
            h2Var.f19269b = 0L;
            h2Var.f19270c = null;
        }
    }

    public C8856nT(String str) {
        this.f77052c = str;
    }
}
