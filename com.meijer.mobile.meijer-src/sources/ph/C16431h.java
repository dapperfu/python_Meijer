package ph;

import com.launchdarkly.sdk.LDValue;
import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import ph.C16429f;

/* renamed from: ph.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16431h {

    /* renamed from: a, reason: collision with root package name */
    private final C16430g f156485a;

    /* renamed from: b, reason: collision with root package name */
    private final long f156486b;

    /* renamed from: c, reason: collision with root package name */
    private final a f156487c;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f156488d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f156489e = new AtomicInteger(0);

    /* renamed from: f, reason: collision with root package name */
    private final Object f156490f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<C16429f.a> f156491g = new ArrayList<>();

    /* renamed from: ph.h$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final String f156492a;

        /* renamed from: b, reason: collision with root package name */
        final String f156493b;

        /* renamed from: c, reason: collision with root package name */
        final String f156494c;

        /* renamed from: d, reason: collision with root package name */
        final String f156495d;

        /* renamed from: e, reason: collision with root package name */
        final LDValue f156496e;

        /* renamed from: f, reason: collision with root package name */
        final Map<String, String> f156497f;

        /* renamed from: g, reason: collision with root package name */
        final List<LDValue> f156498g;

        public a(String str, String str2, String str3, String str4, LDValue lDValue, Map<String, String> map, List<LDValue> list) {
            Map<String, String> map2;
            List<LDValue> arrayList;
            this.f156492a = str;
            this.f156493b = str2;
            this.f156494c = str3;
            this.f156495d = str4;
            this.f156496e = lDValue;
            if (map == null) {
                map2 = Collections.EMPTY_MAP;
            } else {
                map2 = new HashMap<>(map);
            }
            this.f156497f = map2;
            if (list == null) {
                arrayList = Collections.EMPTY_LIST;
            } else {
                arrayList = new ArrayList<>(list);
            }
            this.f156498g = arrayList;
        }
    }

    public C16429f b() {
        return C16429f.b(this.f156486b, this.f156485a, e(), c(), d());
    }

    public void f(int i10) {
        this.f156489e.set(i10);
    }

    public void g(long j10, long j11, boolean z10) {
        synchronized (this.f156490f) {
            this.f156491g.add(new C16429f.a(j10, j11, z10));
        }
    }

    public C16431h(a aVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f156488d = jCurrentTimeMillis;
        this.f156486b = jCurrentTimeMillis;
        this.f156485a = new C16430g(aVar.f156492a);
        this.f156487c = aVar;
    }

    private LDValue c() {
        com.launchdarkly.sdk.j jVarC = LDValue.c();
        for (LDValue lDValue : this.f156487c.f156498g) {
            if (lDValue != null && lDValue.h() == com.launchdarkly.sdk.i.OBJECT) {
                for (String str : lDValue.m()) {
                    EnumC16428e[] enumC16428eArrValues = EnumC16428e.values();
                    int length = enumC16428eArrValues.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            EnumC16428e enumC16428e = enumC16428eArrValues[i10];
                            if (enumC16428e.f156476a.equals(str)) {
                                LDValue lDValueG = lDValue.g(str);
                                if (lDValueG.h() == enumC16428e.f156477b) {
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
        com.launchdarkly.sdk.j jVarE = LDValue.c().e("name", this.f156487c.f156495d).e("osArch", System.getProperty("os.arch")).e("osVersion", System.getProperty("os.version"));
        LDValue lDValue = this.f156487c.f156496e;
        if (lDValue != null) {
            for (String str : lDValue.m()) {
                jVarE.d(str, this.f156487c.f156496e.g(str));
            }
        }
        return jVarE.a();
    }

    private LDValue e() {
        com.launchdarkly.sdk.j jVarE = LDValue.c().e("name", this.f156487c.f156493b).e("version", this.f156487c.f156494c);
        for (Map.Entry<String, String> entry : this.f156487c.f156497f.entrySet()) {
            if (entry.getKey().equalsIgnoreCase("x-launchdarkly-wrapper")) {
                if (entry.getValue().contains(q2.f93563c)) {
                    jVarE.e("wrapperName", entry.getValue().substring(0, entry.getValue().indexOf(q2.f93563c)));
                    jVarE.e("wrapperVersion", entry.getValue().substring(entry.getValue().indexOf(q2.f93563c) + 1));
                } else {
                    jVarE.e("wrapperName", entry.getValue());
                }
            }
        }
        return jVarE.a();
    }

    public C16429f a(long j10, long j11) {
        ArrayList<C16429f.a> arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f156490f) {
            arrayList = this.f156491g;
            this.f156491g = new ArrayList<>();
        }
        C16429f c16429fC = C16429f.c(jCurrentTimeMillis, this.f156485a, this.f156488d, j10, j11, this.f156489e.getAndSet(0), arrayList);
        this.f156488d = jCurrentTimeMillis;
        return c16429fC;
    }
}
