package vb;

import ac.C5679a;
import bb.C6345b;
import bc.C6351e;
import cc.InterfaceC6500a;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import gc.InterfaceC14344a;
import ic.C14708a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: i, reason: collision with root package name */
    private static final C13784a f165740i = C13785b.a(k.class.getName());

    /* renamed from: j, reason: collision with root package name */
    private static final C13786c f165741j = C13787d.a(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    Db.b f165742a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC6500a f165743b;

    /* renamed from: e, reason: collision with root package name */
    public j f165746e;

    /* renamed from: f, reason: collision with root package name */
    private Db.e f165747f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC14344a f165748g;

    /* renamed from: h, reason: collision with root package name */
    i f165749h;

    /* renamed from: d, reason: collision with root package name */
    C6351e<vb.b> f165745d = new C6351e<>(new C6345b());

    /* renamed from: c, reason: collision with root package name */
    ExecutorService f165744c = Yb.a.a("ThirdPartySightings");

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vb.b f165750a;

        a(vb.b bVar) {
            this.f165750a = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r8 = this;
                vb.k r0 = vb.k.this
                vb.b r1 = r8.f165750a
                vb.i r2 = r0.f165749h
                java.lang.String r3 = vb.i.a(r1)
                java.util.Map<java.lang.String, vb.b> r4 = r2.f165735a
                java.lang.Object r4 = r4.get(r3)
                vb.b r4 = (vb.b) r4
                if (r4 == 0) goto L6a
                java.util.Date r3 = r4.c()
                if (r3 == 0) goto L47
                java.util.Date r3 = r4.c()
                long r3 = r3.getTime()
                Db.b r5 = r2.f165736b
                Qb.b r5 = r5.e()
                java.lang.Long r5 = r5.M()
                java.lang.Long r6 = Db.b.f6064d
                long r6 = r6.longValue()
                long r5 = Db.b.c(r5, r6)
                long r3 = r3 + r5
                java.util.Date r5 = new java.util.Date
                r5.<init>(r3)
                java.util.Date r3 = r1.c()
                if (r3 == 0) goto L47
                boolean r3 = r3.after(r5)
                goto L48
            L47:
                r3 = 0
            L48:
                if (r3 == 0) goto L5e
                r1.k()
                java.util.Date r3 = r1.c()
                java.util.Objects.toString(r3)
                java.util.Map<java.lang.String, vb.b> r2 = r2.f165735a
                java.lang.String r3 = vb.i.a(r1)
                r2.put(r3, r1)
                goto L79
            L5e:
                r1.k()
                java.util.Date r2 = r1.c()
                java.util.Objects.toString(r2)
                r2 = 0
                goto L7a
            L6a:
                r1.k()
                java.util.Date r4 = r1.c()
                java.util.Objects.toString(r4)
                java.util.Map<java.lang.String, vb.b> r2 = r2.f165735a
                r2.put(r3, r1)
            L79:
                r2 = r1
            L7a:
                if (r2 == 0) goto L96
                bc.e<vb.b> r2 = r0.f165745d
                r2.b(r1)
                bc.e<vb.b> r2 = r0.f165745d
                r2.a()
                vb.j r0 = r0.f165746e
                r0.a()
                r1.L()
                java.util.Date r0 = r1.c()
                java.util.Objects.toString(r0)
                return
            L96:
                r1.L()
                java.util.Date r0 = r1.c()
                java.util.Objects.toString(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vb.k.a.run():void");
        }
    }

    final class b implements Tb.a<C14708a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f165752a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5679a f165753b;

        @Override // Tb.a
        public final void a(int i10, String str) {
            C13784a unused = k.f165740i;
            this.f165753b.a(i10, str);
        }

        b(List list, C5679a c5679a) {
            this.f165752a = list;
            this.f165753b = c5679a;
        }

        @Override // Tb.a
        public final /* synthetic */ void a(C14708a c14708a) {
            k.this.f165745d.e();
            C13784a unused = k.f165740i;
            this.f165753b.a(null);
        }
    }

    final C17651a c(List<vb.b> list) {
        C17651a c17651a = new C17651a();
        ArrayList arrayList = new ArrayList();
        Iterator<vb.b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((vb.b) it.next().clone());
        }
        c17651a.a(arrayList);
        c17651a.b(this.f165747f.x().e());
        return c17651a;
    }

    public k(InterfaceC14344a interfaceC14344a, Db.e eVar, Db.b bVar, InterfaceC6500a interfaceC6500a, i iVar) {
        this.f165748g = interfaceC14344a;
        this.f165747f = eVar;
        this.f165742a = bVar;
        this.f165743b = interfaceC6500a;
        this.f165749h = iVar;
    }
}
