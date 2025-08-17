package fsimpl;

import com.google.android.gms.common.api.a;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes14.dex */
public class gf {

    /* renamed from: a, reason: collision with root package name */
    int f132319a;

    /* renamed from: b, reason: collision with root package name */
    gg[] f132320b;

    /* renamed from: c, reason: collision with root package name */
    volatile int f132321c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f132322d;

    /* renamed from: e, reason: collision with root package name */
    private final int f132323e;

    /* renamed from: f, reason: collision with root package name */
    private int f132324f;

    public gf() {
        this(16);
    }

    public gf(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        this.f132319a = 0;
        this.f132320b = a(i10 == 0 ? 1 : i10);
        this.f132323e = 7500;
        b();
        this.f132322d = new ReferenceQueue();
    }

    private static gg[] a(int i10) {
        return new gg[i10];
    }

    private void b() {
        this.f132324f = (int) ((this.f132320b.length * this.f132323e) / 10000);
    }

    private void c() {
        int length = this.f132320b.length * 2;
        if (length == 0) {
            length = 1;
        }
        gg[] ggVarArrA = a(length);
        int i10 = 0;
        while (true) {
            gg[] ggVarArr = this.f132320b;
            if (i10 >= ggVarArr.length) {
                this.f132320b = ggVarArrA;
                b();
                return;
            }
            gg ggVar = ggVarArr[i10];
            while (ggVar != null) {
                int i11 = ggVar.f132326b ? 0 : (ggVar.f132325a & a.e.API_PRIORITY_OTHER) % length;
                gg ggVar2 = ggVar.f132328d;
                ggVar.f132328d = ggVarArrA[i11];
                ggVarArrA[i11] = ggVar;
                ggVar = ggVar2;
            }
            i10++;
        }
    }

    public int a(Object obj, int i10) {
        gg ggVar;
        int iHashCode;
        a();
        if (obj != null) {
            int iHashCode2 = obj.hashCode() & a.e.API_PRIORITY_OTHER;
            gg[] ggVarArr = this.f132320b;
            iHashCode = iHashCode2 % ggVarArr.length;
            ggVar = ggVarArr[iHashCode];
            while (ggVar != null && !obj.equals(ggVar.get())) {
                ggVar = ggVar.f132328d;
            }
        } else {
            ggVar = this.f132320b[0];
            while (ggVar != null && !ggVar.f132326b) {
                ggVar = ggVar.f132328d;
            }
            iHashCode = 0;
        }
        if (ggVar != null) {
            int i11 = ggVar.f132327c;
            ggVar.f132327c = i10;
            return i11;
        }
        this.f132321c++;
        int i12 = this.f132319a + 1;
        this.f132319a = i12;
        if (i12 > this.f132324f) {
            c();
            iHashCode = obj == null ? 0 : (Integer.MAX_VALUE & obj.hashCode()) % this.f132320b.length;
        }
        gg ggVar2 = new gg(obj, i10, this.f132322d);
        ggVar2.f132328d = this.f132320b[iHashCode];
        this.f132320b[iHashCode] = ggVar2;
        return 0;
    }

    void a() {
        while (true) {
            gg ggVar = (gg) this.f132322d.poll();
            if (ggVar == null) {
                return;
            } else {
                a(ggVar);
            }
        }
    }

    void a(gg ggVar) {
        int i10 = ggVar.f132325a & a.e.API_PRIORITY_OTHER;
        gg[] ggVarArr = this.f132320b;
        int length = i10 % ggVarArr.length;
        gg ggVar2 = null;
        for (gg ggVar3 = ggVarArr[length]; ggVar3 != null; ggVar3 = ggVar3.f132328d) {
            if (ggVar == ggVar3) {
                this.f132321c++;
                if (ggVar2 == null) {
                    this.f132320b[length] = ggVar3.f132328d;
                } else {
                    ggVar2.f132328d = ggVar3.f132328d;
                }
                this.f132319a--;
                return;
            }
            ggVar2 = ggVar3;
        }
    }

    public boolean a(Object obj) {
        return c(obj) != null;
    }

    public int b(Object obj) {
        a();
        if (obj == null) {
            for (gg ggVar = this.f132320b[0]; ggVar != null; ggVar = ggVar.f132328d) {
                if (ggVar.f132326b) {
                    return ggVar.f132327c;
                }
            }
            return 0;
        }
        int iHashCode = obj.hashCode() & a.e.API_PRIORITY_OTHER;
        gg[] ggVarArr = this.f132320b;
        for (gg ggVar2 = ggVarArr[iHashCode % ggVarArr.length]; ggVar2 != null; ggVar2 = ggVar2.f132328d) {
            if (obj.equals(ggVar2.get())) {
                return ggVar2.f132327c;
            }
        }
        return 0;
    }

    gg c(Object obj) {
        a();
        if (obj == null) {
            for (gg ggVar = this.f132320b[0]; ggVar != null; ggVar = ggVar.f132328d) {
                if (ggVar.f132326b) {
                    return ggVar;
                }
            }
            return null;
        }
        int iHashCode = obj.hashCode() & a.e.API_PRIORITY_OTHER;
        gg[] ggVarArr = this.f132320b;
        for (gg ggVar2 = ggVarArr[iHashCode % ggVarArr.length]; ggVar2 != null; ggVar2 = ggVar2.f132328d) {
            if (obj.equals(ggVar2.get())) {
                return ggVar2;
            }
        }
        return null;
    }

    public int d(Object obj) {
        gg ggVar;
        gg ggVar2;
        int length;
        a();
        gg ggVar3 = null;
        if (obj != null) {
            int iHashCode = obj.hashCode() & a.e.API_PRIORITY_OTHER;
            gg[] ggVarArr = this.f132320b;
            length = iHashCode % ggVarArr.length;
            gg ggVar4 = ggVarArr[length];
            while (true) {
                gg ggVar5 = ggVar4;
                ggVar2 = ggVar3;
                ggVar3 = ggVar5;
                if (ggVar3 == null || obj.equals(ggVar3.get())) {
                    break;
                }
                ggVar4 = ggVar3.f132328d;
            }
        } else {
            gg ggVar6 = this.f132320b[0];
            while (true) {
                ggVar = ggVar3;
                ggVar3 = ggVar6;
                if (ggVar3 == null || ggVar3.f132326b) {
                    break;
                }
                ggVar6 = ggVar3.f132328d;
            }
            ggVar2 = ggVar;
            length = 0;
        }
        if (ggVar3 == null) {
            return 0;
        }
        this.f132321c++;
        if (ggVar2 == null) {
            this.f132320b[length] = ggVar3.f132328d;
        } else {
            ggVar2.f132328d = ggVar3.f132328d;
        }
        this.f132319a--;
        return ggVar3.f132327c;
    }
}
