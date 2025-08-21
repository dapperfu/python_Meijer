package Fb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class b implements Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private Long f9132a;

    /* renamed from: b, reason: collision with root package name */
    private String f9133b;

    /* renamed from: c, reason: collision with root package name */
    private String f9134c;

    /* renamed from: d, reason: collision with root package name */
    private List<a> f9135d;

    /* renamed from: e, reason: collision with root package name */
    private long f9136e;

    /* renamed from: f, reason: collision with root package name */
    private long f9137f;

    /* renamed from: g, reason: collision with root package name */
    private String f9138g;

    /* renamed from: h, reason: collision with root package name */
    private String f9139h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Long> f9140i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private Set<Long> f9141j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private Set<String> f9142k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    private Set<Long> f9143l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    private int f9144m;

    public synchronized Set<String> A() {
        d();
        return this.f9140i.keySet();
    }

    public synchronized void a(String str) {
        try {
            if (this.f9140i == null) {
                this.f9140i = new HashMap();
            }
            this.f9140i.put(str, Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void b(String str) {
        if (this.f9142k == null) {
            this.f9142k = new HashSet();
        }
        this.f9142k.add(str);
    }

    public void c(Long l10) {
        if (this.f9141j == null) {
            this.f9141j = new HashSet();
        }
        this.f9141j.add(l10);
    }

    void d() {
        HashSet hashSet = null;
        for (Map.Entry<String, Long> entry : this.f9140i.entrySet()) {
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
                this.f9140i.remove((String) it.next());
            }
        }
    }

    public List<a> e() {
        return this.f9135d;
    }

    public String f() {
        return this.f9139h;
    }

    public int g() {
        return this.f9144m;
    }

    public long h() {
        return this.f9136e;
    }

    public long i() {
        return this.f9137f;
    }

    public Long j() {
        return this.f9132a;
    }

    public String k() {
        return this.f9134c;
    }

    public String l() {
        return this.f9133b;
    }

    public String m() {
        return this.f9138g;
    }

    public boolean n() {
        Set<String> set = this.f9142k;
        if (set != null && set.size() > 0) {
            return true;
        }
        Set<Long> set2 = this.f9143l;
        return set2 != null && set2.size() > 0;
    }

    public boolean o(String str) {
        Set<String> set = this.f9142k;
        if (set == null) {
            return false;
        }
        return set.contains(str);
    }

    public void p(String str) {
        Set<String> set = this.f9142k;
        if (set != null) {
            set.remove(str);
        }
    }

    public void q(List<a> list) {
        this.f9135d = list;
    }

    public void r(String str) {
        this.f9139h = str;
    }

    public void s(int i10) {
        this.f9144m = i10;
    }

    public void t(long j10) {
        this.f9136e = j10;
    }

    public void u(long j10) {
        this.f9137f = j10;
    }

    public void v(Long l10) {
        this.f9132a = l10;
    }

    public void w(String str) {
        this.f9134c = str;
    }

    public void x(String str) {
        this.f9133b = str;
    }

    public void y(String str) {
        this.f9138g = str;
    }

    public String z() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f9142k.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(", ");
        }
        Iterator<Long> it2 = this.f9143l.iterator();
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
