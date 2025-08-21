package Cd;

import Ld.C4023m;
import Ld.C4024n;
import Vd.AbstractC5516j;
import Vd.C5517k;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import jd.AbstractC14995s;
import jd.InterfaceC14993p;

/* renamed from: Cd.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3074z extends com.google.android.gms.common.api.d implements Ld.r {
    public C3074z(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) C3057i.f4256b, a.d.f65590a, d.a.f65591c);
    }

    @Override // Ld.r
    public final AbstractC5516j<C4024n> g(final C4023m c4023m) {
        return doRead(AbstractC14995s.a().b(new InterfaceC14993p() { // from class: Cd.A
            @Override // jd.InterfaceC14993p
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                C5517k c5517k = (C5517k) obj2;
                P p10 = (P) obj;
                C4023m c4023m2 = c4023m;
                com.google.android.gms.common.internal.r.b(c4023m2 != null, "locationSettingsRequest can't be null");
                ((E0) p10.getService()).S0(c4023m2, new C(c5517k), null);
            }
        }).e(2426).a());
    }
}
