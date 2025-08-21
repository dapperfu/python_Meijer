package q8;

import android.content.Context;
import i8.x;
import z8.f;

/* renamed from: q8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16610a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f158052b = x.f137411a + "DataAccessObject";

    /* renamed from: a, reason: collision with root package name */
    private final C16612c f158053a;

    public C16610a(Context context) {
        this(new C16612c(context));
    }

    public synchronized void b(long j10, int i10) {
        try {
            this.f158053a.d(j10, i10);
        } catch (Exception e10) {
            if (x.f137412b) {
                f.v(f158052b, "Database error.", e10);
            }
        }
    }

    public synchronized void c(String str) {
        try {
            this.f158053a.g(str);
        } catch (Exception e10) {
            if (x.f137412b) {
                f.v(f158052b, "Database error.", e10);
            }
        }
    }

    public synchronized void d(int i10) {
        try {
            this.f158053a.c(C16612c.f158065d, i10);
        } catch (Exception e10) {
            if (x.f137412b) {
                f.x(f158052b, "Database error.", e10);
            }
        }
    }

    public synchronized void e(long j10, boolean z10) {
        try {
            this.f158053a.b(j10 - 540000, z10);
        } catch (Exception e10) {
            if (x.f137412b) {
                f.x(f158052b, "Database error.", e10);
            }
        }
    }

    public synchronized void f(C16613d c16613d) {
        try {
            this.f158053a.h(c16613d.f158070a, c16613d.f158071b, c16613d.f158072c, c16613d.f158073d, c16613d.f158074e);
        } catch (Exception e10) {
            if (x.f137412b) {
                f.v(f158052b, "Database error.", e10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r3.f158053a.c(r2, r5.s());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void h(java.util.LinkedList<q8.C16611b.a> r4, m8.q r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            q8.c r0 = r3.f158053a     // Catch: java.lang.Throwable -> L29
            r0.m(r4)     // Catch: java.lang.Throwable -> L29
            boolean r0 = r5.C()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L3b
            r0 = 0
        Ld:
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L29
            if (r0 >= r1) goto L3b
            java.lang.Object r1 = r4.get(r0)     // Catch: java.lang.Throwable -> L29
            q8.b$a r1 = (q8.C16611b.a) r1     // Catch: java.lang.Throwable -> L29
            int r1 = r1.f158061d     // Catch: java.lang.Throwable -> L29
            int r2 = q8.C16612c.f158065d     // Catch: java.lang.Throwable -> L29
            if (r1 != r2) goto L38
            q8.c r4 = r3.f158053a     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            int r5 = r5.s()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r4.c(r2, r5)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            goto L3b
        L29:
            r4 = move-exception
            goto L3d
        L2b:
            r4 = move-exception
            boolean r5 = i8.x.f137412b     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L3b
            java.lang.String r5 = q8.C16610a.f158052b     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "Database error."
            z8.f.v(r5, r0, r4)     // Catch: java.lang.Throwable -> L29
            goto L3b
        L38:
            int r0 = r0 + 1
            goto Ld
        L3b:
            monitor-exit(r3)
            return
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.C16610a.h(java.util.LinkedList, m8.q):void");
    }

    public synchronized boolean i(p8.b bVar) {
        try {
        } catch (Exception e10) {
            if (!x.f137412b) {
                return false;
            }
            f.x(f158052b, "can't update multiplicity", e10);
            return false;
        }
        return this.f158053a.u(bVar);
    }

    public C16610a(C16612c c16612c) {
        this.f158053a = c16612c;
    }

    public boolean a() {
        try {
            return this.f158053a.a();
        } catch (Exception e10) {
            if (!x.f137412b) {
                return false;
            }
            f.x(f158052b, "Database error.", e10);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x013b, code lost:
    
        r41 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q8.C16613d g(long r43, i8.C14698e.a r45, long r46) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.C16610a.g(long, i8.e$a, long):q8.d");
    }
}
