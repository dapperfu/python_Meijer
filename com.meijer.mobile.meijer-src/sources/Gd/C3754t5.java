package Gd;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Gd.t5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3754t5 implements InterfaceC3734q5 {

    /* renamed from: a, reason: collision with root package name */
    final List f12275a;

    @Override // Gd.InterfaceC3734q5
    public final void a(InterfaceC3727p5 interfaceC3727p5) {
        Iterator it = this.f12275a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3734q5) it.next()).a(interfaceC3727p5);
        }
    }

    public C3754t5(Context context, AbstractC3747s5 abstractC3747s5) {
        ArrayList arrayList = new ArrayList();
        this.f12275a = arrayList;
        if (abstractC3747s5.c()) {
            arrayList.add(new D5(context, abstractC3747s5));
        }
    }
}
