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
public final class C6554Af {

    /* renamed from: a, reason: collision with root package name */
    private final List f65152a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Map f65153b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f65154c;

    public final C10156zf a() {
        C10156zf c10156zf;
        boolean zBooleanValue = ((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f65154c) {
            try {
                for (C9942xf c9942xf : this.f65152a) {
                    long jA = c9942xf.a();
                    String strC = c9942xf.c();
                    C9942xf c9942xfB = c9942xf.b();
                    if (c9942xfB != null && jA > 0) {
                        long jA2 = jA - c9942xfB.a();
                        sb2.append(strC);
                        sb2.append('.');
                        sb2.append(jA2);
                        sb2.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(c9942xfB.a()))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(c9942xfB.a()));
                                sb3.append('+');
                                sb3.append(strC);
                            } else {
                                map.put(Long.valueOf(c9942xfB.a()), new StringBuilder(strC));
                            }
                        }
                    }
                }
                this.f65152a.clear();
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
                        sb4.append(Lc.v.c().a() + (((Long) entry.getKey()).longValue() - Lc.v.c().c()));
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                c10156zf = new C10156zf(sb2.toString(), string);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10156zf;
    }

    public final Map b() {
        Map map;
        synchronized (this.f65154c) {
            Lc.v.s().h();
            map = this.f65153b;
        }
        return map;
    }

    public final void c(C6554Af c6554Af) {
        synchronized (this.f65154c) {
        }
    }

    public final boolean e(C9942xf c9942xf, long j10, String... strArr) {
        synchronized (this.f65154c) {
            this.f65152a.add(new C9942xf(j10, strArr[0], c9942xf));
        }
        return true;
    }

    public C6554Af(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f65153b = linkedHashMap;
        this.f65154c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final C9942xf f() {
        return new C9942xf(Lc.v.c().c(), null, null);
    }

    public final void d(String str, String str2) {
        C9194qf c9194qfH;
        if (!TextUtils.isEmpty(str2) && (c9194qfH = Lc.v.s().h()) != null) {
            synchronized (this.f65154c) {
                AbstractC9835wf abstractC9835wfA = c9194qfH.a(str);
                Map map = this.f65153b;
                map.put(str, abstractC9835wfA.a((String) map.get(str), str2));
            }
        }
    }
}
