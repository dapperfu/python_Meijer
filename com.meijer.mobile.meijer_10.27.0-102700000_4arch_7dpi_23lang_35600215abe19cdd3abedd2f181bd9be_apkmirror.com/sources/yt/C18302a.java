package yt;

import xt.InterfaceC18093a;

/* renamed from: yt.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18302a {

    /* renamed from: a, reason: collision with root package name */
    private final Za.e f171296a;

    /* renamed from: b, reason: collision with root package name */
    private final c f171297b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC18093a f171298c;

    /* renamed from: d, reason: collision with root package name */
    private double f171299d = 0.0d;

    /* renamed from: e, reason: collision with root package name */
    private double f171300e = 0.0d;

    /* renamed from: f, reason: collision with root package name */
    public Bb.b f171301f;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized double a() {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 0
            r13.f171299d = r0     // Catch: java.lang.Throwable -> L84
            r13.f171300e = r0     // Catch: java.lang.Throwable -> L84
            yt.c r2 = r13.f171297b     // Catch: java.lang.Throwable -> L84
            java.util.List r2 = r2.c()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L84
            ut.a r3 = (ut.C17315a) r3     // Catch: java.lang.Throwable -> L84
        L17:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L88
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L84
            ut.a r4 = (ut.C17315a) r4     // Catch: java.lang.Throwable -> L84
            long r5 = r4.f163455e     // Catch: java.lang.Throwable -> L84
            long r7 = r3.f163455e     // Catch: java.lang.Throwable -> L84
            long r5 = r5 - r7
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L86
            xt.a r7 = r13.f171298c     // Catch: java.lang.Throwable -> L84
            float r3 = r7.a(r4, r3)     // Catch: java.lang.Throwable -> L84
            double r7 = (double) r3     // Catch: java.lang.Throwable -> L84
            Za.e r3 = r13.f171296a     // Catch: java.lang.Throwable -> L84
            long r9 = r3.a()     // Catch: java.lang.Throwable -> L84
            long r11 = r4.f163455e     // Catch: java.lang.Throwable -> L84
            long r9 = r9 - r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            r11 = 60
            long r9 = r9 / r11
            double r11 = (double) r5     // Catch: java.lang.Throwable -> L84
            double r7 = r7 / r11
            r11 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r7 = r7 * r11
            r11 = 4629418941960159232(0x403f000000000000, double:31.0)
            double r9 = (double) r9     // Catch: java.lang.Throwable -> L84
            double r11 = r11 - r9
            double r9 = java.lang.Math.max(r11, r0)     // Catch: java.lang.Throwable -> L84
            r11 = 4629137466983448576(0x403e000000000000, double:30.0)
            double r9 = r9 / r11
            r11 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r11 = b(r11)     // Catch: java.lang.Throwable -> L84
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 > 0) goto L75
            r11 = 300000(0x493e0, double:1.482197E-318)
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 >= 0) goto L6b
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            goto L77
        L6b:
            r11 = 900000(0xdbba0, double:4.44659E-318)
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 <= 0) goto L75
            r5 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            goto L77
        L75:
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L77:
            double r9 = r9 * r5
            double r5 = r13.f171299d     // Catch: java.lang.Throwable -> L84
            double r7 = r7 * r9
            double r5 = r5 + r7
            r13.f171299d = r5     // Catch: java.lang.Throwable -> L84
            double r5 = r13.f171300e     // Catch: java.lang.Throwable -> L84
            double r5 = r5 + r9
            r13.f171300e = r5     // Catch: java.lang.Throwable -> L84
            goto L86
        L84:
            r0 = move-exception
            goto La0
        L86:
            r3 = r4
            goto L17
        L88:
            double r0 = r13.f171300e     // Catch: java.lang.Throwable -> L84
            r2 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L9b
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r0 = b(r0)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r13)
            return r0
        L9b:
            double r2 = r13.f171299d     // Catch: java.lang.Throwable -> L84
            double r2 = r2 / r0
            monitor-exit(r13)
            return r2
        La0:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L84
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.C18302a.a():double");
    }

    public C18302a(Za.e eVar, c cVar, InterfaceC18093a interfaceC18093a, Bb.b bVar) {
        this.f171296a = eVar;
        this.f171297b = cVar;
        this.f171298c = interfaceC18093a;
        this.f171301f = bVar;
    }

    public static double b(double d10) {
        return (d10 * 1620.0d) / 3600.0d;
    }
}
