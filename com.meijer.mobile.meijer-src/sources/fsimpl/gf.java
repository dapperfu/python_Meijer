package fsimpl;

import com.google.android.gms.common.api.a;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes15.dex */
public class gf {

    /* renamed from: a, reason: collision with root package name */
    int f133569a;

    /* renamed from: b, reason: collision with root package name */
    gg[] f133570b;

    /* renamed from: c, reason: collision with root package name */
    volatile int f133571c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f133572d;

    /* renamed from: e, reason: collision with root package name */
    private final int f133573e;

    /* renamed from: f, reason: collision with root package name */
    private int f133574f;

    public gf() {
        this(16);
    }

    public gf(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        this.f133569a = 0;
        this.f133570b = a(i10 == 0 ? 1 : i10);
        this.f133573e = 7500;
        b();
        this.f133572d = new ReferenceQueue();
    }

    private static gg[] a(int i10) {
        return new gg[i10];
    }

    private void b() {
        this.f133574f = (int) ((this.f133570b.length * this.f133573e) / 10000);
    }

    private void c() {
        int length = this.f133570b.length * 2;
        if (length == 0) {
            length = 1;
        }
        gg[] ggVarArrA = a(length);
        int i10 = 0;
        while (true) {
            gg[] ggVarArr = this.f133570b;
            if (i10 >= ggVarArr.length) {
                this.f133570b = ggVarArrA;
                b();
                return;
            }
            gg ggVar = ggVarArr[i10];
            while (ggVar != null) {
                int i11 = ggVar.f133576b ? 0 : (ggVar.f133575a & a.e.API_PRIORITY_OTHER) % length;
                gg ggVar2 = ggVar.f133578d;
                ggVar.f133578d = ggVarArrA[i11];
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
            gg[] ggVarArr = this.f133570b;
            iHashCode = iHashCode2 % ggVarArr.length;
            ggVar = ggVarArr[iHashCode];
            while (ggVar != null && !obj.equals(ggVar.get())) {
                ggVar = ggVar.f133578d;
            }
        } else {
            ggVar = this.f133570b[0];
            while (ggVar != null && !ggVar.f133576b) {
                ggVar = ggVar.f133578d;
            }
            iHashCode = 0;
        }
        if (ggVar != null) {
            int i11 = ggVar.f133577c;
            ggVar.f133577c = i10;
            return i11;
        }
        this.f133571c++;
        int i12 = this.f133569a + 1;
        this.f133569a = i12;
        if (i12 > this.f133574f) {
            c();
            iHashCode = obj == null ? 0 : (Integer.MAX_VALUE & obj.hashCode()) % this.f133570b.length;
        }
        gg ggVar2 = new gg(obj, i10, this.f133572d);
        ggVar2.f133578d = this.f133570b[iHashCode];
        this.f133570b[iHashCode] = ggVar2;
        return 0;
    }

    void a() {
        while (true) {
            gg ggVar = (gg) this.f133572d.poll();
            if (ggVar == null) {
                return;
            } else {
                a(ggVar);
            }
        }
    }

    void a(gg ggVar) {
        int i10 = ggVar.f133575a & a.e.API_PRIORITY_OTHER;
        gg[] ggVarArr = this.f133570b;
        int length = i10 % ggVarArr.length;
        gg ggVar2 = null;
        for (gg ggVar3 = ggVarArr[length]; ggVar3 != null; ggVar3 = ggVar3.f133578d) {
            if (ggVar == ggVar3) {
                this.f133571c++;
                if (ggVar2 == null) {
                    this.f133570b[length] = ggVar3.f133578d;
                } else {
                    ggVar2.f133578d = ggVar3.f133578d;
                }
                this.f133569a--;
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
            for (gg ggVar = this.f133570b[0]; ggVar != null; ggVar = ggVar.f133578d) {
                if (ggVar.f133576b) {
                    return ggVar.f133577c;
                }
            }
            return 0;
        }
        int iHashCode = obj.hashCode() & a.e.API_PRIORITY_OTHER;
        gg[] ggVarArr = this.f133570b;
        for (gg ggVar2 = ggVarArr[iHashCode % ggVarArr.length]; ggVar2 != null; ggVar2 = ggVar2.f133578d) {
            if (obj.equals(ggVar2.get())) {
                return ggVar2.f133577c;
            }
        }
        return 0;
    }

    gg c(Object obj) {
        a();
        if (obj == null) {
            for (gg ggVar = this.f133570b[0]; ggVar != null; ggVar = ggVar.f133578d) {
                if (ggVar.f133576b) {
                    return ggVar;
                }
            }
            return null;
        }
        int iHashCode = obj.hashCode() & a.e.API_PRIORITY_OTHER;
        gg[] ggVarArr = this.f133570b;
        for (gg ggVar2 = ggVarArr[iHashCode % ggVarArr.length]; ggVar2 != null; ggVar2 = ggVar2.f133578d) {
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
            gg[] ggVarArr = this.f133570b;
            length = iHashCode % ggVarArr.length;
            gg ggVar4 = ggVarArr[length];
            while (true) {
                gg ggVar5 = ggVar4;
                ggVar2 = ggVar3;
                ggVar3 = ggVar5;
                if (ggVar3 == null || obj.equals(ggVar3.get())) {
                    break;
                }
                ggVar4 = ggVar3.f133578d;
            }
        } else {
            gg ggVar6 = this.f133570b[0];
            while (true) {
                ggVar = ggVar3;
                ggVar3 = ggVar6;
                if (ggVar3 == null || ggVar3.f133576b) {
                    break;
                }
                ggVar6 = ggVar3.f133578d;
            }
            ggVar2 = ggVar;
            length = 0;
        }
        if (ggVar3 == null) {
            return 0;
        }
        this.f133571c++;
        if (ggVar2 == null) {
            this.f133570b[length] = ggVar3.f133578d;
        } else {
            ggVar2.f133578d = ggVar3.f133578d;
        }
        this.f133569a--;
        return ggVar3.f133577c;
    }
}
