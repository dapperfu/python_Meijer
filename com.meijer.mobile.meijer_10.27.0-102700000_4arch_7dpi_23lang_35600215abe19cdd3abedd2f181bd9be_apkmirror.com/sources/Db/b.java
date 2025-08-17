package Db;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class b implements Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private Long f5099a;

    /* renamed from: b, reason: collision with root package name */
    private String f5100b;

    /* renamed from: c, reason: collision with root package name */
    private String f5101c;

    /* renamed from: d, reason: collision with root package name */
    private List<a> f5102d;

    /* renamed from: e, reason: collision with root package name */
    private long f5103e;

    /* renamed from: f, reason: collision with root package name */
    private long f5104f;

    /* renamed from: g, reason: collision with root package name */
    private String f5105g;

    /* renamed from: h, reason: collision with root package name */
    private String f5106h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Long> f5107i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private Set<Long> f5108j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private Set<String> f5109k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    private Set<Long> f5110l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    private int f5111m;

    public synchronized Set<String> A() {
        d();
        return this.f5107i.keySet();
    }

    public synchronized void a(String str) {
        try {
            if (this.f5107i == null) {
                this.f5107i = new HashMap();
            }
            this.f5107i.put(str, Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void b(String str) {
        if (this.f5109k == null) {
            this.f5109k = new HashSet();
        }
        this.f5109k.add(str);
    }

    public void c(Long l10) {
        if (this.f5108j == null) {
            this.f5108j = new HashSet();
        }
        this.f5108j.add(l10);
    }

    void d() {
        HashSet hashSet = null;
        for (Map.Entry<String, Long> entry : this.f5107i.entrySet()) {
            if (entry.getValue().longValue() < System.currentTimeMillis() - 259200000) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                hashSet.add(entry.getKey());
            }
        }
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f5107i.remove((String) it.next());
            }
        }
    }

    public List<a> e() {
        return this.f5102d;
    }

    public String f() {
        return this.f5106h;
    }

    public int g() {
        return this.f5111m;
    }

    public long h() {
        return this.f5103e;
    }

    public long i() {
        return this.f5104f;
    }

    public Long j() {
        return this.f5099a;
    }

    public String k() {
        return this.f5101c;
    }

    public String l() {
        return this.f5100b;
    }

    public String m() {
        return this.f5105g;
    }

    public boolean n() {
        Set<String> set = this.f5109k;
        if (set != null && set.size() > 0) {
            return true;
        }
        Set<Long> set2 = this.f5110l;
        return set2 != null && set2.size() > 0;
    }

    public boolean o(String str) {
        Set<String> set = this.f5109k;
        if (set == null) {
            return false;
        }
        return set.contains(str);
    }

    public void p(String str) {
        Set<String> set = this.f5109k;
        if (set != null) {
            set.remove(str);
        }
    }

    public void q(List<a> list) {
        this.f5102d = list;
    }

    public void r(String str) {
        this.f5106h = str;
    }

    public void s(int i10) {
        this.f5111m = i10;
    }

    public void t(long j10) {
        this.f5103e = j10;
    }

    public void u(long j10) {
        this.f5104f = j10;
    }

    public void v(Long l10) {
        this.f5099a = l10;
    }

    public void w(String str) {
        this.f5101c = str;
    }

    public void x(String str) {
        this.f5100b = str;
    }

    public void y(String str) {
        this.f5105g = str;
    }

    public String z() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f5109k.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(", ");
        }
        Iterator<Long> it2 = this.f5110l.iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            sb2.append(", ");
        }
        if (sb2.length() <= 0) {
            return "--NONE--";
        }
        sb2.setLength(sb2.length() - 2);
        return sb2.toString();
    }
}
