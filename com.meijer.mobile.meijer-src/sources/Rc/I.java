package Rc;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f32315a;

    /* renamed from: b, reason: collision with root package name */
    private final double[] f32316b;

    /* renamed from: c, reason: collision with root package name */
    private final double[] f32317c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f32318d;

    /* renamed from: e, reason: collision with root package name */
    private int f32319e;

    public final List a() {
        ArrayList arrayList = new ArrayList(this.f32315a.length);
        int i10 = 0;
        while (true) {
            String[] strArr = this.f32315a;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i10];
            double[] dArr = this.f32317c;
            double[] dArr2 = this.f32316b;
            int[] iArr = this.f32318d;
            double d10 = dArr[i10];
            double d11 = dArr2[i10];
            int i11 = iArr[i10];
            arrayList.add(new F(str, d10, d11, i11 / this.f32319e, i11));
            i10++;
        }
    }

    public final void b(double d10) {
        this.f32319e++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f32317c;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.f32316b[i10]) {
                int[] iArr = this.f32318d;
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
        int size = g10.f32313b.size();
        this.f32315a = (String[]) g10.f32312a.toArray(new String[size]);
        this.f32316b = c(g10.f32313b);
        this.f32317c = c(g10.f32314c);
        this.f32318d = new int[size];
        this.f32319e = 0;
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
