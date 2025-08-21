package p6;

import java.util.Arrays;
import java.util.List;
import k6.AbstractC15093a;
import k6.C15097e;
import w6.C17845a;

/* renamed from: p6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16408c extends p<q6.d, q6.d> {
    private static List<C17845a<q6.d>> d(List<C17845a<q6.d>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, c(list.get(i10)));
        }
        return list;
    }

    static float[] e(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    private static C17845a<q6.d> c(C17845a<q6.d> c17845a) {
        q6.d dVar = c17845a.f166945b;
        q6.d dVar2 = c17845a.f166946c;
        if (dVar == null || dVar2 == null || dVar.e().length == dVar2.e().length) {
            return c17845a;
        }
        float[] fArrE = e(dVar.e(), dVar2.e());
        return c17845a.b(dVar.b(fArrE), dVar2.b(fArrE));
    }

    @Override // p6.o
    public AbstractC15093a<q6.d, q6.d> a() {
        return new C15097e(this.f156186a);
    }

    public C16408c(List<C17845a<q6.d>> list) {
        super(d(list));
    }

    @Override // p6.p, p6.o
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // p6.p, p6.o
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // p6.p
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
