package Ed;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Ed.t5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3562t5 implements InterfaceC3542q5 {

    /* renamed from: a, reason: collision with root package name */
    final List f8723a;

    @Override // Ed.InterfaceC3542q5
    public final void a(InterfaceC3535p5 interfaceC3535p5) {
        Iterator it = this.f8723a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3542q5) it.next()).a(interfaceC3535p5);
        }
    }

    public C3562t5(Context context, AbstractC3555s5 abstractC3555s5) {
        ArrayList arrayList = new ArrayList();
        this.f8723a = arrayList;
        if (abstractC3555s5.c()) {
            arrayList.add(new D5(context, abstractC3555s5));
        }
    }
}
