package j6;

import java.util.List;
import v6.C17512a;

/* renamed from: j6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14865e extends AbstractC14867g<p6.d> {

    /* renamed from: i, reason: collision with root package name */
    private final p6.d f139447i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j6.AbstractC14861a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public p6.d i(C17512a<p6.d> c17512a, float f10) {
        this.f139447i.g(c17512a.f164561b, c17512a.f164562c, f10);
        return this.f139447i;
    }

    public C14865e(List<C17512a<p6.d>> list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p6.d dVar = list.get(i10).f164561b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f139447i = new p6.d(new float[iMax], new int[iMax]);
    }
}
