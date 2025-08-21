package k6;

import java.util.List;
import w6.C17845a;

/* renamed from: k6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15097e extends AbstractC15099g<q6.d> {

    /* renamed from: i, reason: collision with root package name */
    private final q6.d f141645i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k6.AbstractC15093a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public q6.d i(C17845a<q6.d> c17845a, float f10) {
        this.f141645i.g(c17845a.f166945b, c17845a.f166946c, f10);
        return this.f141645i;
    }

    public C15097e(List<C17845a<q6.d>> list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            q6.d dVar = list.get(i10).f166945b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f141645i = new q6.d(new float[iMax], new int[iMax]);
    }
}
