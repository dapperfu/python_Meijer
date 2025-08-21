package R1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    static int f31620g;

    /* renamed from: b, reason: collision with root package name */
    int f31622b;

    /* renamed from: d, reason: collision with root package name */
    int f31624d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<Q1.e> f31621a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    boolean f31623c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<a> f31625e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f31626f = -1;

    class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<Q1.e> f31627a;

        /* renamed from: b, reason: collision with root package name */
        int f31628b;

        /* renamed from: c, reason: collision with root package name */
        int f31629c;

        /* renamed from: d, reason: collision with root package name */
        int f31630d;

        /* renamed from: e, reason: collision with root package name */
        int f31631e;

        /* renamed from: f, reason: collision with root package name */
        int f31632f;

        /* renamed from: g, reason: collision with root package name */
        int f31633g;

        public a(Q1.e eVar, M1.d dVar, int i10) {
            this.f31627a = new WeakReference<>(eVar);
            this.f31628b = dVar.x(eVar.f27579N);
            this.f31629c = dVar.x(eVar.f27580O);
            this.f31630d = dVar.x(eVar.f27581P);
            this.f31631e = dVar.x(eVar.f27582Q);
            this.f31632f = dVar.x(eVar.f27583R);
            this.f31633g = i10;
        }
    }

    private int j(M1.d dVar, ArrayList<Q1.e> arrayList, int i10) {
        int iX;
        int iX2;
        Q1.f fVar = (Q1.f) arrayList.get(0).D();
        dVar.D();
        fVar.d(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).d(dVar, false);
        }
        if (i10 == 0 && fVar.f27661V0 > 0) {
            Q1.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.f27662W0 > 0) {
            Q1.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f31625e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f31625e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iX = dVar.x(fVar.f27579N);
            iX2 = dVar.x(fVar.f27581P);
            dVar.D();
        } else {
            iX = dVar.x(fVar.f27580O);
            iX2 = dVar.x(fVar.f27582Q);
            dVar.D();
        }
        return iX2 - iX;
    }

    private String e() {
        int i10 = this.f31624d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    public boolean a(Q1.e eVar) {
        if (this.f31621a.contains(eVar)) {
            return false;
        }
        this.f31621a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f31621a.size();
        if (this.f31626f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f31626f == oVar.f31622b) {
                    g(this.f31624d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f31622b;
    }

    public int d() {
        return this.f31624d;
    }

    public int f(M1.d dVar, int i10) {
        if (this.f31621a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f31621a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator<Q1.e> it = this.f31621a.iterator();
        while (it.hasNext()) {
            Q1.e next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.f27572H0 = oVar.c();
            } else {
                next.f27574I0 = oVar.c();
            }
        }
        this.f31626f = oVar.f31622b;
    }

    public void h(boolean z10) {
        this.f31623c = z10;
    }

    public void i(int i10) {
        this.f31624d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f31622b + "] <";
        Iterator<Q1.e> it = this.f31621a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().o();
        }
        return str + " >";
    }

    public o(int i10) {
        int i11 = f31620g;
        f31620g = i11 + 1;
        this.f31622b = i11;
        this.f31624d = i10;
    }
}
