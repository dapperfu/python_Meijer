package i8;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static final String f137228d = x.f137411a + "CalloutTable";

    /* renamed from: a, reason: collision with root package name */
    private long f137229a;

    /* renamed from: c, reason: collision with root package name */
    private List<a> f137231c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private long f137230b = 0;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        private String f137232a;

        /* renamed from: b, reason: collision with root package name */
        private long f137233b;

        public a(p pVar, long j10) {
            this.f137232a = pVar.h() + pVar.hashCode();
            this.f137233b = j10;
        }

        static /* synthetic */ long b(a aVar) {
            long j10 = aVar.f137233b - 1;
            aVar.f137233b = j10;
            return j10;
        }

        static /* synthetic */ long c(a aVar, long j10) {
            long j11 = aVar.f137233b + j10;
            aVar.f137233b = j11;
            return j11;
        }

        static /* synthetic */ long d(a aVar, long j10) {
            long j11 = aVar.f137233b - j10;
            aVar.f137233b = j11;
            return j11;
        }
    }

    public boolean f(p pVar) {
        if (pVar == null) {
            return false;
        }
        String str = pVar.h() + pVar.hashCode();
        synchronized (this.f137231c) {
            for (int i10 = 0; i10 < this.f137231c.size(); i10++) {
                try {
                    if (this.f137231c.get(i10).f137232a.equals(str)) {
                        int i11 = i10 + 1;
                        if (i11 < this.f137231c.size()) {
                            a.c(this.f137231c.get(i11), this.f137231c.get(i10).f137233b);
                        } else if (this.f137230b == 0) {
                            this.f137230b = this.f137231c.get(i10).f137233b;
                        }
                        return this.f137231c.remove(i10) != null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return false;
        }
    }

    public void a(p pVar) {
        if (pVar == null) {
            return;
        }
        if (x.f137412b) {
            z8.f.u(f137228d, String.format("Add segment %s (id=%d pid=%d) currTimeout=%s", pVar.h() + pVar.hashCode(), Long.valueOf(pVar.o()), Long.valueOf(pVar.j()), Long.valueOf(this.f137230b)));
        }
        synchronized (this.f137231c) {
            try {
                long j10 = this.f137229a - this.f137230b;
                for (int i10 = 0; i10 < this.f137231c.size(); i10++) {
                    if (this.f137231c.get(i10).f137233b >= j10) {
                        a.d(this.f137231c.get(i10), j10);
                        this.f137231c.add(i10, new a(pVar, j10));
                        return;
                    }
                    j10 -= this.f137231c.get(i10).f137233b;
                }
                this.f137231c.add(new a(pVar, j10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        synchronized (this.f137231c) {
            try {
                if (this.f137231c.size() > 0) {
                    return;
                }
                if (this.f137230b == 0) {
                    this.f137230b = this.f137229a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(long j10) {
        synchronized (this.f137231c) {
            try {
                if (j10 == this.f137229a) {
                    return;
                }
                this.f137229a = j10;
                if (this.f137230b > j10) {
                    if (this.f137231c.size() > 0) {
                        a.c(this.f137231c.get(0), this.f137230b - j10);
                    }
                    this.f137230b = j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d() {
        synchronized (this.f137231c) {
            try {
                long j10 = this.f137230b;
                boolean z10 = true;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    this.f137230b = j11;
                    if (j11 != 0) {
                        z10 = false;
                    }
                    return z10;
                }
                if (this.f137231c.size() <= 0 || a.b(this.f137231c.get(0)) != 0) {
                    return false;
                }
                do {
                    this.f137231c.remove(0);
                    if (this.f137231c.size() <= 0) {
                        break;
                    }
                } while (this.f137231c.get(0).f137233b == 0);
                return true;
            } finally {
            }
        }
    }

    public void e() {
        synchronized (this.f137231c) {
            this.f137231c.clear();
            this.f137230b = 0L;
        }
    }

    public String toString() {
        String str = this.f137230b + ";";
        for (int i10 = 0; i10 < this.f137231c.size(); i10++) {
            str = str + this.f137231c.get(i10).f137233b + ";";
        }
        return str;
    }

    public f(int i10) {
        this.f137229a = i10;
    }
}
