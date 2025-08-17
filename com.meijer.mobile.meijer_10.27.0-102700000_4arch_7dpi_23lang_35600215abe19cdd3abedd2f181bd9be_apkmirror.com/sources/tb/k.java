package tb;

import ac.InterfaceC5594a;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import ec.InterfaceC13640a;
import gc.C14232a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: i, reason: collision with root package name */
    private static final C6380a f161562i = C6381b.a(k.class.getName());

    /* renamed from: j, reason: collision with root package name */
    private static final C6382c f161563j = C6383d.a(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    Bb.b f161564a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC5594a f161565b;

    /* renamed from: e, reason: collision with root package name */
    public j f161568e;

    /* renamed from: f, reason: collision with root package name */
    private Bb.e f161569f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC13640a f161570g;

    /* renamed from: h, reason: collision with root package name */
    i f161571h;

    /* renamed from: d, reason: collision with root package name */
    Zb.e<tb.b> f161567d = new Zb.e<>(new Za.b());

    /* renamed from: c, reason: collision with root package name */
    ExecutorService f161566c = Wb.a.a("ThirdPartySightings");

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ tb.b f161572a;

        a(tb.b bVar) {
            this.f161572a = bVar;
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
                tb.k r0 = tb.k.this
                tb.b r1 = r8.f161572a
                tb.i r2 = r0.f161571h
                java.lang.String r3 = tb.i.a(r1)
                java.util.Map<java.lang.String, tb.b> r4 = r2.f161557a
                java.lang.Object r4 = r4.get(r3)
                tb.b r4 = (tb.b) r4
                if (r4 == 0) goto L6a
                java.util.Date r3 = r4.c()
                if (r3 == 0) goto L47
                java.util.Date r3 = r4.c()
                long r3 = r3.getTime()
                Bb.b r5 = r2.f161558b
                Ob.b r5 = r5.e()
                java.lang.Long r5 = r5.M()
                java.lang.Long r6 = Bb.b.f2119d
                long r6 = r6.longValue()
                long r5 = Bb.b.c(r5, r6)
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
                java.util.Map<java.lang.String, tb.b> r2 = r2.f161557a
                java.lang.String r3 = tb.i.a(r1)
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
                java.util.Map<java.lang.String, tb.b> r2 = r2.f161557a
                r2.put(r3, r1)
            L79:
                r2 = r1
            L7a:
                if (r2 == 0) goto L96
                Zb.e<tb.b> r2 = r0.f161567d
                r2.b(r1)
                Zb.e<tb.b> r2 = r0.f161567d
                r2.a()
                tb.j r0 = r0.f161568e
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
            throw new UnsupportedOperationException("Method not decompiled: tb.k.a.run():void");
        }
    }

    final class b implements Rb.a<C14232a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f161574a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Yb.a f161575b;

        @Override // Rb.a
        public final void a(int i10, String str) {
            C6380a unused = k.f161562i;
            this.f161575b.a(i10, str);
        }

        b(List list, Yb.a aVar) {
            this.f161574a = list;
            this.f161575b = aVar;
        }

        @Override // Rb.a
        public final /* synthetic */ void a(C14232a c14232a) {
            k.this.f161567d.e();
            C6380a unused = k.f161562i;
            this.f161575b.a(null);
        }
    }

    final C17076a c(List<tb.b> list) {
        C17076a c17076a = new C17076a();
        ArrayList arrayList = new ArrayList();
        Iterator<tb.b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((tb.b) it.next().clone());
        }
        c17076a.a(arrayList);
        c17076a.b(this.f161569f.x().e());
        return c17076a;
    }

    public k(InterfaceC13640a interfaceC13640a, Bb.e eVar, Bb.b bVar, InterfaceC5594a interfaceC5594a, i iVar) {
        this.f161570g = interfaceC13640a;
        this.f161569f = eVar;
        this.f161564a = bVar;
        this.f161565b = interfaceC5594a;
        this.f161571h = iVar;
    }
}
