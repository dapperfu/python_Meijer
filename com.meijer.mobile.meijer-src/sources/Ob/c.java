package Ob;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class c implements Pb.a {

    /* renamed from: d, reason: collision with root package name */
    private static s f23261d = new s();

    /* renamed from: a, reason: collision with root package name */
    protected String f23262a;

    /* renamed from: b, reason: collision with root package name */
    protected long f23263b;

    /* renamed from: c, reason: collision with root package name */
    protected Long f23264c;

    public c() {
        this.f23262a = b(getClass());
        this.f23263b = System.currentTimeMillis();
    }

    abstract List<? extends g> f();

    public long c() {
        return this.f23263b;
    }

    public long d() {
        if (this.f23264c == null) {
            a();
        }
        return this.f23264c.longValue();
    }

    public String e() {
        return this.f23262a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return e().equals(((c) obj).e());
        }
        return false;
    }

    public void a() {
        Iterator<? extends g> it = f().iterator();
        long jE = 0;
        while (it.hasNext()) {
            jE += it.next().e();
        }
        this.f23264c = Long.valueOf(jE);
    }

    protected String b(Class<?> cls) {
        return UUID.randomUUID().toString();
    }

    public double g() {
        return h(System.currentTimeMillis());
    }

    public double h(long j10) {
        double d10;
        Iterator<? extends g> it = f().iterator();
        double dE = 0.0d;
        while (it.hasNext()) {
            long jMax = Math.max(0L, j10 - it.next().d().longValue());
            if (jMax < 604800000) {
                d10 = 1.0d;
            } else if (jMax < 1814400000) {
                d10 = 0.5d;
            } else {
                d10 = 0.2d;
            }
            dE += ((r3.e() / 1000.0d) / 60.0d) * d10;
        }
        return dE + (Math.max(0, f().size() - 1) * 60);
    }

    public c(c cVar) {
        this.f23262a = cVar.f23262a;
        this.f23263b = cVar.f23263b;
    }
}
