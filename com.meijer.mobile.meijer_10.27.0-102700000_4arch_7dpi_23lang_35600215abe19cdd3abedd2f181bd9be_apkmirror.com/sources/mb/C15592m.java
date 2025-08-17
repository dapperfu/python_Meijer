package mb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lb.C15392a;

/* renamed from: mb.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15592m {

    /* renamed from: a, reason: collision with root package name */
    private C15587h f150044a;

    /* renamed from: b, reason: collision with root package name */
    private List<C15392a> f150045b;

    /* renamed from: c, reason: collision with root package name */
    private Ab.a f150046c;

    /* renamed from: d, reason: collision with root package name */
    private Collection<Lb.l<Collection<C15392a>>> f150047d = new ArrayList();

    public final Lb.l<Collection<C15392a>> a() {
        Lb.l<Collection<C15392a>> lVar = new Lb.l<>();
        this.f150047d.add(lVar);
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
            java.util.Collection<Lb.l<java.util.Collection<lb.a>>> r0 = r12.f150047d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            Lb.l r1 = (Lb.l) r1
            r2 = 15000(0x3a98, double:7.411E-320)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r1 = r1.get(r2, r4)
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L6
            java.util.List<lb.a> r2 = r12.f150045b
            java.util.ListIterator r2 = r2.listIterator()
        L24:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6
            java.lang.Object r3 = r2.next()
            lb.a r3 = (lb.C15392a) r3
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L24
            r2.remove()
            goto L24
        L3a:
            mb.h r0 = r12.f150044a
            java.util.List<lb.a> r1 = r12.f150045b
            Ab.a r2 = r12.f150046c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lf4
            java.lang.Object r4 = r1.next()
            lb.a r4 = (lb.C15392a) r4
            if (r4 == 0) goto Lef
            r4.c()
            long r5 = r4.c()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto Lef
            mb.b r5 = new mb.b
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
            Ab.a$b r10 = r2.c()
            Ab.a$b r11 = Ab.a.b.ARRIVE_EVENT
            if (r10 != r11) goto Lb9
            java.lang.Long r10 = r2.a()
            long r10 = r10.longValue()
        Lb6:
            long r6 = r6 * r8
            long r10 = r10 + r6
            goto Lcf
        Lb9:
            Ab.a$b r10 = r2.c()
            Ab.a$b r11 = Ab.a.b.DEPART_EVENT
            if (r10 != r11) goto Lca
            java.lang.Long r10 = r2.b()
            long r10 = r10.longValue()
            goto Lb6
        Lca:
            long r10 = java.lang.System.currentTimeMillis()
            goto Lb6
        Lcf:
            r5.g(r10)
            mb.k r6 = r0.f150032b     // Catch: java.io.IOException -> Lde
            r6.j(r5)     // Catch: java.io.IOException -> Lde
            Ya.d r5 = r0.f150034d     // Catch: java.io.IOException -> Lde
            r5.d()     // Catch: java.io.IOException -> Lde
            goto L49
        Lde:
            cb.c r5 = mb.C15587h.f150030i
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
        throw new UnsupportedOperationException("Method not decompiled: mb.C15592m.b():void");
    }

    public C15592m(C15587h c15587h, List<C15392a> list, Ab.a aVar) {
        this.f150044a = c15587h;
        this.f150045b = list;
        this.f150046c = aVar;
    }
}
