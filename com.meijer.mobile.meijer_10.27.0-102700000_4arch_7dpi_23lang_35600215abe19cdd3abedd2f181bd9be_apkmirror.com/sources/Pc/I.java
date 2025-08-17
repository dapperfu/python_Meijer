package Pc;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f25101a;

    /* renamed from: b, reason: collision with root package name */
    private final double[] f25102b;

    /* renamed from: c, reason: collision with root package name */
    private final double[] f25103c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f25104d;

    /* renamed from: e, reason: collision with root package name */
    private int f25105e;

    public final List a() {
        ArrayList arrayList = new ArrayList(this.f25101a.length);
        int i10 = 0;
        while (true) {
            String[] strArr = this.f25101a;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i10];
            double[] dArr = this.f25103c;
            double[] dArr2 = this.f25102b;
            int[] iArr = this.f25104d;
            double d10 = dArr[i10];
            double d11 = dArr2[i10];
            int i11 = iArr[i10];
            arrayList.add(new F(str, d10, d11, i11 / this.f25105e, i11));
            i10++;
        }
    }

    public final void b(double d10) {
        this.f25105e++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f25103c;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.f25102b[i10]) {
                int[] iArr = this.f25104d;
                iArr[i10] = iArr[i10] + 1;
            }
            if (d10 < d11) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* synthetic */ I(G g10, H h10) {
        int size = g10.f25099b.size();
        this.f25101a = (String[]) g10.f25098a.toArray(new String[size]);
        this.f25102b = c(g10.f25099b);
        this.f25103c = c(g10.f25100c);
        this.f25104d = new int[size];
        this.f25105e = 0;
    }

    private static final double[] c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }
}
