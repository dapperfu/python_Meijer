package g8;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static final String f133012d = x.f133195a + "CalloutTable";

    /* renamed from: a, reason: collision with root package name */
    private long f133013a;

    /* renamed from: c, reason: collision with root package name */
    private List<a> f133015c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private long f133014b = 0;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        private String f133016a;

        /* renamed from: b, reason: collision with root package name */
        private long f133017b;

        public a(p pVar, long j10) {
            this.f133016a = pVar.h() + pVar.hashCode();
            this.f133017b = j10;
        }

        static /* synthetic */ long b(a aVar) {
            long j10 = aVar.f133017b - 1;
            aVar.f133017b = j10;
            return j10;
        }

        static /* synthetic */ long c(a aVar, long j10) {
            long j11 = aVar.f133017b + j10;
            aVar.f133017b = j11;
            return j11;
        }

        static /* synthetic */ long d(a aVar, long j10) {
            long j11 = aVar.f133017b - j10;
            aVar.f133017b = j11;
            return j11;
        }
    }

    public boolean f(p pVar) {
        if (pVar == null) {
            return false;
        }
        String str = pVar.h() + pVar.hashCode();
        synchronized (this.f133015c) {
            for (int i10 = 0; i10 < this.f133015c.size(); i10++) {
                try {
                    if (this.f133015c.get(i10).f133016a.equals(str)) {
                        int i11 = i10 + 1;
                        if (i11 < this.f133015c.size()) {
                            a.c(this.f133015c.get(i11), this.f133015c.get(i10).f133017b);
                        } else if (this.f133014b == 0) {
                            this.f133014b = this.f133015c.get(i10).f133017b;
                        }
                        return this.f133015c.remove(i10) != null;
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
        if (x.f133196b) {
            x8.f.u(f133012d, String.format("Add segment %s (id=%d pid=%d) currTimeout=%s", pVar.h() + pVar.hashCode(), Long.valueOf(pVar.o()), Long.valueOf(pVar.j()), Long.valueOf(this.f133014b)));
        }
        synchronized (this.f133015c) {
            try {
                long j10 = this.f133013a - this.f133014b;
                for (int i10 = 0; i10 < this.f133015c.size(); i10++) {
                    if (this.f133015c.get(i10).f133017b >= j10) {
                        a.d(this.f133015c.get(i10), j10);
                        this.f133015c.add(i10, new a(pVar, j10));
                        return;
                    }
                    j10 -= this.f133015c.get(i10).f133017b;
                }
                this.f133015c.add(new a(pVar, j10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        synchronized (this.f133015c) {
            try {
                if (this.f133015c.size() > 0) {
                    return;
                }
                if (this.f133014b == 0) {
                    this.f133014b = this.f133013a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(long j10) {
        synchronized (this.f133015c) {
            try {
                if (j10 == this.f133013a) {
                    return;
                }
                this.f133013a = j10;
                if (this.f133014b > j10) {
                    if (this.f133015c.size() > 0) {
                        a.c(this.f133015c.get(0), this.f133014b - j10);
                    }
                    this.f133014b = j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d() {
        synchronized (this.f133015c) {
            try {
                long j10 = this.f133014b;
                boolean z10 = true;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    this.f133014b = j11;
                    if (j11 != 0) {
                        z10 = false;
                    }
                    return z10;
                }
                if (this.f133015c.size() <= 0 || a.b(this.f133015c.get(0)) != 0) {
                    return false;
                }
                do {
                    this.f133015c.remove(0);
                    if (this.f133015c.size() <= 0) {
                        break;
                    }
                } while (this.f133015c.get(0).f133017b == 0);
                return true;
            } finally {
            }
        }
    }

    public void e() {
        synchronized (this.f133015c) {
            this.f133015c.clear();
            this.f133014b = 0L;
        }
    }

    public String toString() {
        String str = this.f133014b + ";";
        for (int i10 = 0; i10 < this.f133015c.size(); i10++) {
            str = str + this.f133015c.get(i10).f133017b + ";";
        }
        return str;
    }

    public f(int i10) {
        this.f133013a = i10;
    }
}
