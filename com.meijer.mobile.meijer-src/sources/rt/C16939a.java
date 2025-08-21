package rt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kt.C15422h;
import pt.InterfaceC16542b;

/* renamed from: rt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16939a implements InterfaceC16542b {

    /* renamed from: a, reason: collision with root package name */
    private final List<InterfaceC16542b> f159614a = new ArrayList();

    @Override // pt.InterfaceC16542b
    public final void a(List<C15422h> list) {
        Iterator<InterfaceC16542b> it = this.f159614a.iterator();
        while (it.hasNext()) {
            it.next().a(list);
        }
    }

    public C16939a(InterfaceC16542b... interfaceC16542bArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f159614a.add(interfaceC16542bArr[i10]);
        }
    }
}
