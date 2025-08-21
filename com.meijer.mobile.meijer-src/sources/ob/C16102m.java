package ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nb.C15926a;

/* renamed from: ob.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16102m {

    /* renamed from: a, reason: collision with root package name */
    private C16097h f153831a;

    /* renamed from: b, reason: collision with root package name */
    private List<C15926a> f153832b;

    /* renamed from: c, reason: collision with root package name */
    private Cb.a f153833c;

    /* renamed from: d, reason: collision with root package name */
    private Collection<Nb.l<Collection<C15926a>>> f153834d = new ArrayList();

    public final Nb.l<Collection<C15926a>> a() {
        Nb.l<Collection<C15926a>> lVar = new Nb.l<>();
        this.f153834d.add(lVar);
        return lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r12 = this;
            java.util.Collection<Nb.l<java.util.Collection<nb.a>>> r0 = r12.f153834d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            Nb.l r1 = (Nb.l) r1
            r2 = 15000(0x3a98, double:7.411E-320)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r1 = r1.get(r2, r4)
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L6
            java.util.List<nb.a> r2 = r12.f153832b
            java.util.ListIterator r2 = r2.listIterator()
        L24:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6
            java.lang.Object r3 = r2.next()
            nb.a r3 = (nb.C15926a) r3
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L24
            r2.remove()
            goto L24
        L3a:
            ob.h r0 = r12.f153831a
            java.util.List<nb.a> r1 = r12.f153832b
            Cb.a r2 = r12.f153833c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lf4
            java.lang.Object r4 = r1.next()
            nb.a r4 = (nb.C15926a) r4
            if (r4 == 0) goto Lef
            r4.c()
            long r5 = r4.c()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto Lef
            ob.b r5 = new ob.b
            if (r2 == 0) goto L89
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.j()
            r6.append(r7)
            java.lang.String r7 = "_"
            r6.append(r7)
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L91
        L89:
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
        L91:
            r5.<init>(r6)
            java.lang.String r6 = r4.h()
            r5.e(r6)
            r5.f(r2)
            long r6 = r4.c()
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto Lca
            Cb.a$b r10 = r2.c()
            Cb.a$b r11 = Cb.a.b.ARRIVE_EVENT
            if (r10 != r11) goto Lb9
            java.lang.Long r10 = r2.a()
            long r10 = r10.longValue()
        Lb6:
            long r6 = r6 * r8
            long r10 = r10 + r6
            goto Lcf
        Lb9:
            Cb.a$b r10 = r2.c()
            Cb.a$b r11 = Cb.a.b.DEPART_EVENT
            if (r10 != r11) goto Lca
            java.lang.Long r10 = r2.b()
            long r10 = r10.longValue()
            goto Lb6
        Lca:
            long r10 = java.lang.System.currentTimeMillis()
            goto Lb6
        Lcf:
            r5.g(r10)
            ob.k r6 = r0.f153819b     // Catch: java.io.IOException -> Lde
            r6.j(r5)     // Catch: java.io.IOException -> Lde
            ab.d r5 = r0.f153821d     // Catch: java.io.IOException -> Lde
            r5.d()     // Catch: java.io.IOException -> Lde
            goto L49
        Lde:
            eb.c r5 = ob.C16097h.f153817i
            java.lang.String r4 = r4.h()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r6 = "Unable to schedule communication {}"
            r5.g(r6, r4)
            goto L49
        Lef:
            r3.add(r4)
            goto L49
        Lf4:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto Lfd
            r0.d(r3, r2)
        Lfd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.C16102m.b():void");
    }

    public C16102m(C16097h c16097h, List<C15926a> list, Cb.a aVar) {
        this.f153831a = c16097h;
        this.f153832b = list;
        this.f153833c = aVar;
    }
}
