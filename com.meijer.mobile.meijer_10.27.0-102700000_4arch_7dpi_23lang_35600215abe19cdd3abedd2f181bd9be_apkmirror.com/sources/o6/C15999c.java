package o6;

import j6.AbstractC14861a;
import j6.C14865e;
import java.util.Arrays;
import java.util.List;
import v6.C17512a;

/* renamed from: o6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15999c extends p<p6.d, p6.d> {
    private static List<C17512a<p6.d>> d(List<C17512a<p6.d>> list) {
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

    private static C17512a<p6.d> c(C17512a<p6.d> c17512a) {
        p6.d dVar = c17512a.f164561b;
        p6.d dVar2 = c17512a.f164562c;
        if (dVar == null || dVar2 == null || dVar.e().length == dVar2.e().length) {
            return c17512a;
        }
        float[] fArrE = e(dVar.e(), dVar2.e());
        return c17512a.b(dVar.b(fArrE), dVar2.b(fArrE));
    }

    @Override // o6.o
    public AbstractC14861a<p6.d, p6.d> a() {
        return new C14865e(this.f153194a);
    }

    public C15999c(List<C17512a<p6.d>> list) {
        super(d(list));
    }

    @Override // o6.p, o6.o
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // o6.p, o6.o
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // o6.p
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
