package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.Af, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6679Af {

    /* renamed from: a, reason: collision with root package name */
    private final List f65992a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Map f65993b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f65994c;

    public final C10281zf a() {
        C10281zf c10281zf;
        boolean zBooleanValue = ((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f65994c) {
            try {
                for (C10067xf c10067xf : this.f65992a) {
                    long jA = c10067xf.a();
                    String strC = c10067xf.c();
                    C10067xf c10067xfB = c10067xf.b();
                    if (c10067xfB != null && jA > 0) {
                        long jA2 = jA - c10067xfB.a();
                        sb2.append(strC);
                        sb2.append('.');
                        sb2.append(jA2);
                        sb2.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(c10067xfB.a()))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(c10067xfB.a()));
                                sb3.append('+');
                                sb3.append(strC);
                            } else {
                                map.put(Long.valueOf(c10067xfB.a()), new StringBuilder(strC));
                            }
                        }
                    }
                }
                this.f65992a.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        sb4.append(Nc.v.c().a() + (((Long) entry.getKey()).longValue() - Nc.v.c().c()));
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                c10281zf = new C10281zf(sb2.toString(), string);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10281zf;
    }

    public final Map b() {
        Map map;
        synchronized (this.f65994c) {
            Nc.v.s().h();
            map = this.f65993b;
        }
        return map;
    }

    public final void c(C6679Af c6679Af) {
        synchronized (this.f65994c) {
        }
    }

    public final boolean e(C10067xf c10067xf, long j10, String... strArr) {
        synchronized (this.f65994c) {
            this.f65992a.add(new C10067xf(j10, strArr[0], c10067xf));
        }
        return true;
    }

    public C6679Af(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f65993b = linkedHashMap;
        this.f65994c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final C10067xf f() {
        return new C10067xf(Nc.v.c().c(), null, null);
    }

    public final void d(String str, String str2) {
        C9319qf c9319qfH;
        if (!TextUtils.isEmpty(str2) && (c9319qfH = Nc.v.s().h()) != null) {
            synchronized (this.f65994c) {
                AbstractC9960wf abstractC9960wfA = c9319qfH.a(str);
                Map map = this.f65993b;
                map.put(str, abstractC9960wfA.a((String) map.get(str), str2));
            }
        }
    }
}
