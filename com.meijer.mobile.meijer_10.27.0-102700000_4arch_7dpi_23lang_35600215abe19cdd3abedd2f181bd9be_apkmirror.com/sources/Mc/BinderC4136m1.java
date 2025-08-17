package Mc;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC7036Oj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Mc.m1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class BinderC4136m1 extends AbstractBinderC7036Oj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4142o1 f19311a;

    /* synthetic */ BinderC4136m1(C4142o1 c4142o1, C4139n1 c4139n1) {
        this.f19311a = c4142o1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7070Pj
    public final void f4(List list) throws RemoteException {
        int i10;
        ArrayList arrayList;
        synchronized (this.f19311a.f19323a) {
            this.f19311a.f19326d = false;
            this.f19311a.f19327e = true;
            arrayList = new ArrayList(this.f19311a.f19325c);
            this.f19311a.f19325c.clear();
        }
        Kc.b bVarA = C4142o1.a(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((Kc.c) arrayList.get(i10)).a(bVarA);
        }
    }
}
