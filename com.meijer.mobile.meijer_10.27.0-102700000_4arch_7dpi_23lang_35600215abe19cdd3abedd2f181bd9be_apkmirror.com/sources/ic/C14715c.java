package ic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ic.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14715c {

    /* renamed from: b, reason: collision with root package name */
    private Integer f137691b;

    /* renamed from: e, reason: collision with root package name */
    private Za.e f137694e;

    /* renamed from: f, reason: collision with root package name */
    private Bb.b f137695f;

    /* renamed from: a, reason: collision with root package name */
    private int f137690a = 0;

    /* renamed from: c, reason: collision with root package name */
    private List<a> f137692c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private List<Integer> f137693d = new ArrayList();

    /* renamed from: ic.c$a */
    protected class a {

        /* renamed from: a, reason: collision with root package name */
        public int f137696a;

        /* renamed from: b, reason: collision with root package name */
        public long f137697b;

        public a(int i10, long j10) {
            this.f137696a = i10;
            this.f137697b = j10;
        }
    }

    public final synchronized Integer a(int i10) {
        int i11 = i10 * 1000;
        if (i11 >= -25000) {
            Integer numValueOf = this.f137691b;
            if (numValueOf != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() / 1000);
            }
            return numValueOf;
        }
        long jA = this.f137694e.a();
        int iIntValue = 0;
        if (this.f137692c.size() > 0) {
            List<a> list = this.f137692c;
            if (this.f137694e.a() - list.get(list.size() - 1).f137697b >= 2000) {
                this.f137691b = null;
                this.f137693d.clear();
                this.f137692c.clear();
                this.f137690a = 0;
            } else {
                if (this.f137692c.size() >= this.f137695f.m()) {
                    this.f137692c.remove(0);
                }
                if (this.f137693d.size() >= this.f137695f.m()) {
                    this.f137693d.remove(0);
                }
            }
        }
        this.f137692c.add(new a(i11, jA));
        if (this.f137692c.size() == 1) {
            this.f137693d.add(Integer.valueOf(i11));
            this.f137691b = Integer.valueOf(i11);
            return Integer.valueOf(i11 / 1000);
        }
        if (Math.abs(this.f137691b.intValue() - i11) < 5000) {
            this.f137693d.add(Integer.valueOf(i11));
            this.f137691b = Integer.valueOf(i11);
            this.f137690a = 0;
        } else {
            int i12 = this.f137690a + 1;
            this.f137690a = i12;
            if (i12 >= 3) {
                this.f137690a = 0;
                this.f137691b = Integer.valueOf(i11);
                this.f137693d.add(Integer.valueOf(i11));
                int size = this.f137692c.size();
                int i13 = size - 1;
                int i14 = size - 4;
                if (i14 < 0) {
                    i14 = 0;
                }
                while (i14 <= i13) {
                    this.f137693d.set(i14, Integer.valueOf(this.f137692c.get(i14).f137696a));
                    i14++;
                }
            } else {
                this.f137693d.add(this.f137691b);
            }
        }
        Iterator<Integer> it = this.f137693d.iterator();
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return Integer.valueOf((iIntValue / this.f137693d.size()) / 1000);
    }

    public C14715c(Za.e eVar, Bb.b bVar) {
        this.f137694e = eVar;
        this.f137695f = bVar;
    }
}
