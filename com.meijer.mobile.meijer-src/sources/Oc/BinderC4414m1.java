package Oc;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC7161Oj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Oc.m1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class BinderC4414m1 extends AbstractBinderC7161Oj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4420o1 f23498a;

    /* synthetic */ BinderC4414m1(C4420o1 c4420o1, C4417n1 c4417n1) {
        this.f23498a = c4420o1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7195Pj
    public final void v4(List list) throws RemoteException {
        int i10;
        ArrayList arrayList;
        synchronized (this.f23498a.f23510a) {
            this.f23498a.f23513d = false;
            this.f23498a.f23514e = true;
            arrayList = new ArrayList(this.f23498a.f23512c);
            this.f23498a.f23512c.clear();
        }
        Mc.b bVarA = C4420o1.a(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((Mc.c) arrayList.get(i10)).a(bVarA);
        }
    }
}
