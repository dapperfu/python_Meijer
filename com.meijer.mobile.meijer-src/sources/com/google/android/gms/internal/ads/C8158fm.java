package com.google.android.gms.internal.ads;

import Jc.d;
import android.location.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.fm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8158fm implements Uc.p {

    /* renamed from: a, reason: collision with root package name */
    private final Date f75004a;

    /* renamed from: b, reason: collision with root package name */
    private final int f75005b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f75006c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f75007d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f75008e;

    /* renamed from: f, reason: collision with root package name */
    private final int f75009f;

    /* renamed from: g, reason: collision with root package name */
    private final C7088Mg f75010g;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f75012i;

    /* renamed from: h, reason: collision with root package name */
    private final List f75011h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final Map f75013j = new HashMap();

    @Override // Uc.e
    public final int b() {
        return this.f75009f;
    }

    @Override // Uc.e
    @Deprecated
    public final boolean c() {
        return this.f75012i;
    }

    @Override // Uc.e
    public final boolean d() {
        return this.f75007d;
    }

    @Override // Uc.e
    public final Set<String> g() {
        return this.f75006c;
    }

    @Override // Uc.p
    public final Map zza() {
        return this.f75013j;
    }

    @Override // Uc.p
    public final com.google.android.gms.ads.nativead.a a() {
        return C7088Mg.B(this.f75010g);
    }

    @Override // Uc.p
    public final Jc.d e() {
        d.a aVar = new d.a();
        C7088Mg c7088Mg = this.f75010g;
        if (c7088Mg == null) {
            return aVar.a();
        }
        int i10 = c7088Mg.f69522a;
        if (i10 == 2) {
            aVar.b(c7088Mg.f69526e);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    aVar.e(c7088Mg.f69528g);
                    aVar.d(c7088Mg.f69529h);
                }
            }
            Oc.R1 r12 = c7088Mg.f69527f;
            if (r12 != null) {
                aVar.h(new Gc.s(r12));
            }
            aVar.b(c7088Mg.f69526e);
        }
        aVar.g(c7088Mg.f69523b);
        aVar.c(c7088Mg.f69524c);
        aVar.f(c7088Mg.f69525d);
        return aVar.a();
    }

    @Override // Uc.p
    public final boolean f() {
        return this.f75011h.contains("6");
    }

    @Override // Uc.p
    public final boolean zzb() {
        return this.f75011h.contains("3");
    }

    public C8158fm(Date date, int i10, Set set, Location location, boolean z10, int i11, C7088Mg c7088Mg, List list, boolean z11, int i12, String str) {
        this.f75004a = date;
        this.f75005b = i10;
        this.f75006c = set;
        this.f75008e = location;
        this.f75007d = z10;
        this.f75009f = i11;
        this.f75010g = c7088Mg;
        this.f75012i = z11;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.f75013j.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.f75013j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f75011h.add(str2);
                }
            }
        }
    }
}
