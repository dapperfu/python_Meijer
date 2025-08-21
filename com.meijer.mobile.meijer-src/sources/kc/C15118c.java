package kc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: kc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15118c {

    /* renamed from: b, reason: collision with root package name */
    private Integer f141780b;

    /* renamed from: e, reason: collision with root package name */
    private bb.e f141783e;

    /* renamed from: f, reason: collision with root package name */
    private Db.b f141784f;

    /* renamed from: a, reason: collision with root package name */
    private int f141779a = 0;

    /* renamed from: c, reason: collision with root package name */
    private List<a> f141781c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private List<Integer> f141782d = new ArrayList();

    /* renamed from: kc.c$a */
    protected class a {

        /* renamed from: a, reason: collision with root package name */
        public int f141785a;

        /* renamed from: b, reason: collision with root package name */
        public long f141786b;

        public a(int i10, long j10) {
            this.f141785a = i10;
            this.f141786b = j10;
        }
    }

    public final synchronized Integer a(int i10) {
        int i11 = i10 * 1000;
        if (i11 >= -25000) {
            Integer numValueOf = this.f141780b;
            if (numValueOf != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() / 1000);
            }
            return numValueOf;
        }
        long jA = this.f141783e.a();
        int iIntValue = 0;
        if (this.f141781c.size() > 0) {
            List<a> list = this.f141781c;
            if (this.f141783e.a() - list.get(list.size() - 1).f141786b >= 2000) {
                this.f141780b = null;
                this.f141782d.clear();
                this.f141781c.clear();
                this.f141779a = 0;
            } else {
                if (this.f141781c.size() >= this.f141784f.m()) {
                    this.f141781c.remove(0);
                }
                if (this.f141782d.size() >= this.f141784f.m()) {
                    this.f141782d.remove(0);
                }
            }
        }
        this.f141781c.add(new a(i11, jA));
        if (this.f141781c.size() == 1) {
            this.f141782d.add(Integer.valueOf(i11));
            this.f141780b = Integer.valueOf(i11);
            return Integer.valueOf(i11 / 1000);
        }
        if (Math.abs(this.f141780b.intValue() - i11) < 5000) {
            this.f141782d.add(Integer.valueOf(i11));
            this.f141780b = Integer.valueOf(i11);
            this.f141779a = 0;
        } else {
            int i12 = this.f141779a + 1;
            this.f141779a = i12;
            if (i12 >= 3) {
                this.f141779a = 0;
                this.f141780b = Integer.valueOf(i11);
                this.f141782d.add(Integer.valueOf(i11));
                int size = this.f141781c.size();
                int i13 = size - 1;
                int i14 = size - 4;
                if (i14 < 0) {
                    i14 = 0;
                }
                while (i14 <= i13) {
                    this.f141782d.set(i14, Integer.valueOf(this.f141781c.get(i14).f141785a));
                    i14++;
                }
            } else {
                this.f141782d.add(this.f141780b);
            }
        }
        Iterator<Integer> it = this.f141782d.iterator();
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return Integer.valueOf((iIntValue / this.f141782d.size()) / 1000);
    }

    public C15118c(bb.e eVar, Db.b bVar) {
        this.f141783e = eVar;
        this.f141784f = bVar;
    }
}
