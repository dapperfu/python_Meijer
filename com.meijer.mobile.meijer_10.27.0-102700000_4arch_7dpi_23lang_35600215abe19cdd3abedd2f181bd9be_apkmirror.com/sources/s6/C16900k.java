package s6;

import g6.C14209i;
import java.io.IOException;
import o6.C15997a;
import o6.C15998b;
import t6.AbstractC17067c;

/* renamed from: s6.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16900k {

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC17067c.a f160247f = AbstractC17067c.a.a("ef");

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC17067c.a f160248g = AbstractC17067c.a.a("nm", "v");

    /* renamed from: a, reason: collision with root package name */
    private C15997a f160249a;

    /* renamed from: b, reason: collision with root package name */
    private C15998b f160250b;

    /* renamed from: c, reason: collision with root package name */
    private C15998b f160251c;

    /* renamed from: d, reason: collision with root package name */
    private C15998b f160252d;

    /* renamed from: e, reason: collision with root package name */
    private C15998b f160253e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(t6.AbstractC17067c r6, g6.C14209i r7) throws java.io.IOException {
        /*
            r5 = this;
            r6.c()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L90
            t6.c$a r1 = s6.C16900k.f160248g
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
            o6.b r1 = s6.C16893d.e(r6, r7)
            r5.f160253e = r1
            goto L5
        L6d:
            o6.a r1 = s6.C16893d.c(r6, r7)
            r5.f160249a = r1
            goto L5
        L74:
            o6.b r1 = s6.C16893d.f(r6, r7, r3)
            r5.f160251c = r1
            goto L5
        L7b:
            o6.b r1 = s6.C16893d.f(r6, r7, r3)
            r5.f160250b = r1
            goto L5
        L82:
            o6.b r1 = s6.C16893d.e(r6, r7)
            r5.f160252d = r1
            goto L5
        L8a:
            java.lang.String r0 = r6.nextString()
            goto L5
        L90:
            r6.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.C16900k.a(t6.c, g6.i):void");
    }

    C16899j b(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        C15998b c15998b;
        C15998b c15998b2;
        C15998b c15998b3;
        C15998b c15998b4;
        while (abstractC17067c.hasNext()) {
            if (abstractC17067c.l(f160247f) != 0) {
                abstractC17067c.m();
                abstractC17067c.skipValue();
            } else {
                abstractC17067c.b();
                while (abstractC17067c.hasNext()) {
                    a(abstractC17067c, c14209i);
                }
                abstractC17067c.d();
            }
        }
        C15997a c15997a = this.f160249a;
        if (c15997a != null && (c15998b = this.f160250b) != null && (c15998b2 = this.f160251c) != null && (c15998b3 = this.f160252d) != null && (c15998b4 = this.f160253e) != null) {
            return new C16899j(c15997a, c15998b, c15998b2, c15998b3, c15998b4);
        }
        return null;
    }
}
