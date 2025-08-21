package t6;

import h6.C14478i;
import java.io.IOException;
import p6.C16406a;
import p6.C16407b;
import u6.AbstractC17353c;

/* renamed from: t6.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17198k {

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC17353c.a f162308f = AbstractC17353c.a.a("ef");

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC17353c.a f162309g = AbstractC17353c.a.a("nm", "v");

    /* renamed from: a, reason: collision with root package name */
    private C16406a f162310a;

    /* renamed from: b, reason: collision with root package name */
    private C16407b f162311b;

    /* renamed from: c, reason: collision with root package name */
    private C16407b f162312c;

    /* renamed from: d, reason: collision with root package name */
    private C16407b f162313d;

    /* renamed from: e, reason: collision with root package name */
    private C16407b f162314e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(u6.AbstractC17353c r6, h6.C14478i r7) throws java.io.IOException {
        /*
            r5 = this;
            r6.c()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L90
            u6.c$a r1 = t6.C17198k.f162309g
            int r1 = r6.l(r1)
            if (r1 == 0) goto L8a
            r2 = 1
            if (r1 == r2) goto L1d
            r6.m()
            r6.skipValue()
            goto L5
        L1d:
            r0.getClass()
            int r1 = r0.hashCode()
            r3 = 0
            r4 = -1
            switch(r1) {
                case 353103893: goto L55;
                case 397447147: goto L4c;
                case 1041377119: goto L41;
                case 1379387491: goto L36;
                case 1383710113: goto L2b;
                default: goto L29;
            }
        L29:
            r2 = r4
            goto L5f
        L2b:
            java.lang.String r1 = "Softness"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L34
            goto L29
        L34:
            r2 = 4
            goto L5f
        L36:
            java.lang.String r1 = "Shadow Color"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3f
            goto L29
        L3f:
            r2 = 3
            goto L5f
        L41:
            java.lang.String r1 = "Direction"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4a
            goto L29
        L4a:
            r2 = 2
            goto L5f
        L4c:
            java.lang.String r1 = "Opacity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r1 = "Distance"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5e
            goto L29
        L5e:
            r2 = r3
        L5f:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L6d;
                case 4: goto L66;
                default: goto L62;
            }
        L62:
            r6.skipValue()
            goto L5
        L66:
            p6.b r1 = t6.C17191d.e(r6, r7)
            r5.f162314e = r1
            goto L5
        L6d:
            p6.a r1 = t6.C17191d.c(r6, r7)
            r5.f162310a = r1
            goto L5
        L74:
            p6.b r1 = t6.C17191d.f(r6, r7, r3)
            r5.f162312c = r1
            goto L5
        L7b:
            p6.b r1 = t6.C17191d.f(r6, r7, r3)
            r5.f162311b = r1
            goto L5
        L82:
            p6.b r1 = t6.C17191d.e(r6, r7)
            r5.f162313d = r1
            goto L5
        L8a:
            java.lang.String r0 = r6.nextString()
            goto L5
        L90:
            r6.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C17198k.a(u6.c, h6.i):void");
    }

    C17197j b(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        C16407b c16407b;
        C16407b c16407b2;
        C16407b c16407b3;
        C16407b c16407b4;
        while (abstractC17353c.hasNext()) {
            if (abstractC17353c.l(f162308f) != 0) {
                abstractC17353c.m();
                abstractC17353c.skipValue();
            } else {
                abstractC17353c.b();
                while (abstractC17353c.hasNext()) {
                    a(abstractC17353c, c14478i);
                }
                abstractC17353c.d();
            }
        }
        C16406a c16406a = this.f162310a;
        if (c16406a != null && (c16407b = this.f162311b) != null && (c16407b2 = this.f162312c) != null && (c16407b3 = this.f162313d) != null && (c16407b4 = this.f162314e) != null) {
            return new C17197j(c16406a, c16407b, c16407b2, c16407b3, c16407b4);
        }
        return null;
    }
}
