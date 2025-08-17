package Td;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: Td.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C5237o implements InterfaceC5225c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f34936a;

    C5237o(Collection collection) {
        this.f34936a = collection;
    }

    @Override // Td.InterfaceC5225c
    public final /* bridge */ /* synthetic */ Object then(AbstractC5232j abstractC5232j) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f34936a);
        return C5235m.f(arrayList);
    }
}
