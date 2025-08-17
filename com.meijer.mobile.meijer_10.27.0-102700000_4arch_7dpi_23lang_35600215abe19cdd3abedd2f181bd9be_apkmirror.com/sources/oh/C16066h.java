package oh;

import com.launchdarkly.sdk.LDValue;
import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import oh.C16064f;

/* renamed from: oh.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16066h {

    /* renamed from: a, reason: collision with root package name */
    private final C16065g f153725a;

    /* renamed from: b, reason: collision with root package name */
    private final long f153726b;

    /* renamed from: c, reason: collision with root package name */
    private final a f153727c;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f153728d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f153729e = new AtomicInteger(0);

    /* renamed from: f, reason: collision with root package name */
    private final Object f153730f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<C16064f.a> f153731g = new ArrayList<>();

    /* renamed from: oh.h$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final String f153732a;

        /* renamed from: b, reason: collision with root package name */
        final String f153733b;

        /* renamed from: c, reason: collision with root package name */
        final String f153734c;

        /* renamed from: d, reason: collision with root package name */
        final String f153735d;

        /* renamed from: e, reason: collision with root package name */
        final LDValue f153736e;

        /* renamed from: f, reason: collision with root package name */
        final Map<String, String> f153737f;

        /* renamed from: g, reason: collision with root package name */
        final List<LDValue> f153738g;

        public a(String str, String str2, String str3, String str4, LDValue lDValue, Map<String, String> map, List<LDValue> list) {
            Map<String, String> map2;
            List<LDValue> arrayList;
            this.f153732a = str;
            this.f153733b = str2;
            this.f153734c = str3;
            this.f153735d = str4;
            this.f153736e = lDValue;
            if (map == null) {
                map2 = Collections.EMPTY_MAP;
            } else {
                map2 = new HashMap<>(map);
            }
            this.f153737f = map2;
            if (list == null) {
                arrayList = Collections.EMPTY_LIST;
            } else {
                arrayList = new ArrayList<>(list);
            }
            this.f153738g = arrayList;
        }
    }

    public C16064f b() {
        return C16064f.b(this.f153726b, this.f153725a, e(), c(), d());
    }

    public void f(int i10) {
        this.f153729e.set(i10);
    }

    public void g(long j10, long j11, boolean z10) {
        synchronized (this.f153730f) {
            this.f153731g.add(new C16064f.a(j10, j11, z10));
        }
    }

    public C16066h(a aVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f153728d = jCurrentTimeMillis;
        this.f153726b = jCurrentTimeMillis;
        this.f153725a = new C16065g(aVar.f153732a);
        this.f153727c = aVar;
    }

    private LDValue c() {
        com.launchdarkly.sdk.j jVarC = LDValue.c();
        for (LDValue lDValue : this.f153727c.f153738g) {
            if (lDValue != null && lDValue.h() == com.launchdarkly.sdk.i.OBJECT) {
                for (String str : lDValue.m()) {
                    EnumC16063e[] enumC16063eArrValues = EnumC16063e.values();
                    int length = enumC16063eArrValues.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            EnumC16063e enumC16063e = enumC16063eArrValues[i10];
                            if (enumC16063e.f153716a.equals(str)) {
                                LDValue lDValueG = lDValue.g(str);
                                if (lDValueG.h() == enumC16063e.f153717b) {
                                    jVarC.d(str, lDValueG);
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            }
        }
        return jVarC.a();
    }

    private LDValue d() {
        com.launchdarkly.sdk.j jVarE = LDValue.c().e("name", this.f153727c.f153735d).e("osArch", System.getProperty("os.arch")).e("osVersion", System.getProperty("os.version"));
        LDValue lDValue = this.f153727c.f153736e;
        if (lDValue != null) {
            for (String str : lDValue.m()) {
                jVarE.d(str, this.f153727c.f153736e.g(str));
            }
        }
        return jVarE.a();
    }

    private LDValue e() {
        com.launchdarkly.sdk.j jVarE = LDValue.c().e("name", this.f153727c.f153733b).e("version", this.f153727c.f153734c);
        for (Map.Entry<String, String> entry : this.f153727c.f153737f.entrySet()) {
            if (entry.getKey().equalsIgnoreCase("x-launchdarkly-wrapper")) {
                if (entry.getValue().contains(q2.f92724c)) {
                    jVarE.e("wrapperName", entry.getValue().substring(0, entry.getValue().indexOf(q2.f92724c)));
                    jVarE.e("wrapperVersion", entry.getValue().substring(entry.getValue().indexOf(q2.f92724c) + 1));
                } else {
                    jVarE.e("wrapperName", entry.getValue());
                }
            }
        }
        return jVarE.a();
    }

    public C16064f a(long j10, long j11) {
        ArrayList<C16064f.a> arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f153730f) {
            arrayList = this.f153731g;
            this.f153731g = new ArrayList<>();
        }
        C16064f c16064fC = C16064f.c(jCurrentTimeMillis, this.f153725a, this.f153728d, j10, j11, this.f153729e.getAndSet(0), arrayList);
        this.f153728d = jCurrentTimeMillis;
        return c16064fC;
    }
}
