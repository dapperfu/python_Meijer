package Vd;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: Vd.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C5521o implements InterfaceC5509c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f39869a;

    C5521o(Collection collection) {
        this.f39869a = collection;
    }

    @Override // Vd.InterfaceC5509c
    public final /* bridge */ /* synthetic */ Object then(AbstractC5516j abstractC5516j) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f39869a);
        return C5519m.f(arrayList);
    }
}
