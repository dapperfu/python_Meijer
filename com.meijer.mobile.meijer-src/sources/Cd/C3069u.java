package Cd;

import Ld.C4019i;
import Ld.InterfaceC4017g;
import Vd.AbstractC5516j;
import Vd.C5517k;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import java.util.List;
import jd.AbstractC14995s;
import jd.InterfaceC14993p;

/* renamed from: Cd.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3069u extends com.google.android.gms.common.api.d implements InterfaceC4017g {
    public C3069u(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) C3057i.f4256b, a.d.f65590a, d.a.f65591c);
    }

    @Override // Ld.InterfaceC4017g
    public final AbstractC5516j<Void> b(final List<String> list) {
        return doWrite(AbstractC14995s.a().b(new InterfaceC14993p() { // from class: Cd.v
            @Override // jd.InterfaceC14993p
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((P) obj).d(C3050e0.B(list), (C5517k) obj2);
            }
        }).e(2425).a());
    }

    @Override // Ld.InterfaceC4017g
    public final AbstractC5516j<Void> l(final C4019i c4019i, final PendingIntent pendingIntent) {
        return doWrite(AbstractC14995s.a().b(new InterfaceC14993p() { // from class: Cd.w
            @Override // jd.InterfaceC14993p
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((P) obj).c(c4019i, pendingIntent, (C5517k) obj2);
            }
        }).e(2424).a());
    }
}
