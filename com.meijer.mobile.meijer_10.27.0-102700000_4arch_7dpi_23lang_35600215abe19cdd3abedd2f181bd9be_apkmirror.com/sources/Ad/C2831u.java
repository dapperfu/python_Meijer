package Ad;

import Jd.C3775i;
import Jd.InterfaceC3773g;
import Td.AbstractC5232j;
import Td.C5233k;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import hd.AbstractC14417s;
import hd.InterfaceC14415p;
import java.util.List;

/* renamed from: Ad.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2831u extends com.google.android.gms.common.api.d implements InterfaceC3773g {
    public C2831u(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) C2819i.f260b, a.d.f64750a, d.a.f64751c);
    }

    @Override // Jd.InterfaceC3773g
    public final AbstractC5232j<Void> a(final List<String> list) {
        return doWrite(AbstractC14417s.a().b(new InterfaceC14415p() { // from class: Ad.v
            @Override // hd.InterfaceC14415p
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((P) obj).d(C2812e0.B(list), (C5233k) obj2);
            }
        }).e(2425).a());
    }

    @Override // Jd.InterfaceC3773g
    public final AbstractC5232j<Void> k(final C3775i c3775i, final PendingIntent pendingIntent) {
        return doWrite(AbstractC14417s.a().b(new InterfaceC14415p() { // from class: Ad.w
            @Override // hd.InterfaceC14415p
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((P) obj).c(c3775i, pendingIntent, (C5233k) obj2);
            }
        }).e(2424).a());
    }
}
