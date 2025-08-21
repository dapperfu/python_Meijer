package Ob;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class d extends i {

    /* renamed from: c, reason: collision with root package name */
    private double f23265c;

    private void u(double d10) {
        this.f23265c = d10;
    }

    public double o() {
        return this.f23265c;
    }

    @Override // Ob.i
    public String toString() {
        return "{" + a() + "," + b() + "#" + o() + "}";
    }

    public d(List<? extends i> list) {
        if (list.size() != 0) {
            Iterator<? extends i> it = list.iterator();
            i next = it.next();
            double dB = next.b();
            double dA = next.a();
            int i10 = 1;
            while (it.hasNext()) {
                i next2 = it.next();
                dB += next2.b();
                dA += next2.a();
                i10++;
            }
            double d10 = i10;
            m(dB / d10);
            l(dA / d10);
            Iterator<? extends i> it2 = list.iterator();
            double dMax = 0.0d;
            while (it2.hasNext()) {
                dMax = Math.max(dMax, e(it2.next()));
            }
            u(dMax);
            return;
        }
        throw new IllegalArgumentException("No points");
    }

    public boolean p(d dVar, double d10, double d11) {
        double dE = e(dVar);
        if (dE <= o() + dVar.o() + d10 && dE <= d11) {
            return true;
        }
        return false;
    }

    public boolean t(i iVar, double d10) {
        if (e(iVar) <= this.f23265c + d10) {
            return true;
        }
        return false;
    }
}
