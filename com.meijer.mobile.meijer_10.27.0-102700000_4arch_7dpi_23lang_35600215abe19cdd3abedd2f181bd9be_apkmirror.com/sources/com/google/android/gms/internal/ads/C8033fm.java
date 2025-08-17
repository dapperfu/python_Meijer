package com.google.android.gms.internal.ads;

import Hc.d;
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
public final class C8033fm implements Sc.p {

    /* renamed from: a, reason: collision with root package name */
    private final Date f74164a;

    /* renamed from: b, reason: collision with root package name */
    private final int f74165b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f74166c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f74167d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f74168e;

    /* renamed from: f, reason: collision with root package name */
    private final int f74169f;

    /* renamed from: g, reason: collision with root package name */
    private final C6963Mg f74170g;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f74172i;

    /* renamed from: h, reason: collision with root package name */
    private final List f74171h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final Map f74173j = new HashMap();

    @Override // Sc.e
    public final int b() {
        return this.f74169f;
    }

    @Override // Sc.e
    @Deprecated
    public final boolean c() {
        return this.f74172i;
    }

    @Override // Sc.e
    public final boolean d() {
        return this.f74167d;
    }

    @Override // Sc.e
    public final Set<String> g() {
        return this.f74166c;
    }

    @Override // Sc.p
    public final Map zza() {
        return this.f74173j;
    }

    @Override // Sc.p
    public final com.google.android.gms.ads.nativead.a a() {
        return C6963Mg.B(this.f74170g);
    }

    @Override // Sc.p
    public final Hc.d e() {
        d.a aVar = new d.a();
        C6963Mg c6963Mg = this.f74170g;
        if (c6963Mg == null) {
            return aVar.a();
        }
        int i10 = c6963Mg.f68682a;
        if (i10 == 2) {
            aVar.b(c6963Mg.f68686e);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    aVar.e(c6963Mg.f68688g);
                    aVar.d(c6963Mg.f68689h);
                }
            }
            Mc.R1 r12 = c6963Mg.f68687f;
            if (r12 != null) {
                aVar.h(new Ec.s(r12));
            }
            aVar.b(c6963Mg.f68686e);
        }
        aVar.g(c6963Mg.f68683b);
        aVar.c(c6963Mg.f68684c);
        aVar.f(c6963Mg.f68685d);
        return aVar.a();
    }

    @Override // Sc.p
    public final boolean f() {
        return this.f74171h.contains("6");
    }

    @Override // Sc.p
    public final boolean zzb() {
        return this.f74171h.contains("3");
    }

    public C8033fm(Date date, int i10, Set set, Location location, boolean z10, int i11, C6963Mg c6963Mg, List list, boolean z11, int i12, String str) {
        this.f74164a = date;
        this.f74165b = i10;
        this.f74166c = set;
        this.f74168e = location;
        this.f74167d = z10;
        this.f74169f = i11;
        this.f74170g = c6963Mg;
        this.f74172i = z11;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.f74173j.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.f74173j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f74171h.add(str2);
                }
            }
        }
    }
}
