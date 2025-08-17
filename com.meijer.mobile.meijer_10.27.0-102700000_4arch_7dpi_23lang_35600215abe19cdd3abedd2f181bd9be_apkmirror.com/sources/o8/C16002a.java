package o8;

import android.content.Context;
import g8.x;
import x8.f;

/* renamed from: o8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16002a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f153200b = x.f133195a + "DataAccessObject";

    /* renamed from: a, reason: collision with root package name */
    private final C16004c f153201a;

    public C16002a(Context context) {
        this(new C16004c(context));
    }

    public synchronized void b(long j10, int i10) {
        try {
            this.f153201a.d(j10, i10);
        } catch (Exception e10) {
            if (x.f133196b) {
                f.v(f153200b, "Database error.", e10);
            }
        }
    }

    public synchronized void c(String str) {
        try {
            this.f153201a.g(str);
        } catch (Exception e10) {
            if (x.f133196b) {
                f.v(f153200b, "Database error.", e10);
            }
        }
    }

    public synchronized void d(int i10) {
        try {
            this.f153201a.c(C16004c.f153213d, i10);
        } catch (Exception e10) {
            if (x.f133196b) {
                f.x(f153200b, "Database error.", e10);
            }
        }
    }

    public synchronized void e(long j10, boolean z10) {
        try {
            this.f153201a.b(j10 - 540000, z10);
        } catch (Exception e10) {
            if (x.f133196b) {
                f.x(f153200b, "Database error.", e10);
            }
        }
    }

    public synchronized void f(C16005d c16005d) {
        try {
            this.f153201a.h(c16005d.f153218a, c16005d.f153219b, c16005d.f153220c, c16005d.f153221d, c16005d.f153222e);
        } catch (Exception e10) {
            if (x.f133196b) {
                f.v(f153200b, "Database error.", e10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r3.f153201a.c(r2, r5.s());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void h(java.util.LinkedList<o8.C16003b.a> r4, k8.q r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            o8.c r0 = r3.f153201a     // Catch: java.lang.Throwable -> L29
            r0.m(r4)     // Catch: java.lang.Throwable -> L29
            boolean r0 = r5.C()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L3b
            r0 = 0
        Ld:
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L29
            if (r0 >= r1) goto L3b
            java.lang.Object r1 = r4.get(r0)     // Catch: java.lang.Throwable -> L29
            o8.b$a r1 = (o8.C16003b.a) r1     // Catch: java.lang.Throwable -> L29
            int r1 = r1.f153209d     // Catch: java.lang.Throwable -> L29
            int r2 = o8.C16004c.f153213d     // Catch: java.lang.Throwable -> L29
            if (r1 != r2) goto L38
            o8.c r4 = r3.f153201a     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            int r5 = r5.s()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r4.c(r2, r5)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            goto L3b
        L29:
            r4 = move-exception
            goto L3d
        L2b:
            r4 = move-exception
            boolean r5 = g8.x.f133196b     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L3b
            java.lang.String r5 = o8.C16002a.f153200b     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "Database error."
            x8.f.v(r5, r0, r4)     // Catch: java.lang.Throwable -> L29
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
        throw new UnsupportedOperationException("Method not decompiled: o8.C16002a.h(java.util.LinkedList, k8.q):void");
    }

    public synchronized boolean i(n8.b bVar) {
        try {
        } catch (Exception e10) {
            if (!x.f133196b) {
                return false;
            }
            f.x(f153200b, "can't update multiplicity", e10);
            return false;
        }
        return this.f153201a.u(bVar);
    }

    public C16002a(C16004c c16004c) {
        this.f153201a = c16004c;
    }

    public boolean a() {
        try {
            return this.f153201a.a();
        } catch (Exception e10) {
            if (!x.f133196b) {
                return false;
            }
            f.x(f153200b, "Database error.", e10);
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
    public o8.C16005d g(long r43, g8.C14222e.a r45, long r46) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.C16002a.g(long, g8.e$a, long):o8.d");
    }
}
