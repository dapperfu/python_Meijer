package rt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kt.C15319h;
import pt.InterfaceC16416b;

/* renamed from: rt.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16833a implements InterfaceC16416b {

    /* renamed from: a, reason: collision with root package name */
    private final List<InterfaceC16416b> f159786a = new ArrayList();

    @Override // pt.InterfaceC16416b
    public final void a(List<C15319h> list) {
        Iterator<InterfaceC16416b> it = this.f159786a.iterator();
        while (it.hasNext()) {
            it.next().a(list);
        }
    }

    public C16833a(InterfaceC16416b... interfaceC16416bArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f159786a.add(interfaceC16416bArr[i10]);
        }
    }
}
