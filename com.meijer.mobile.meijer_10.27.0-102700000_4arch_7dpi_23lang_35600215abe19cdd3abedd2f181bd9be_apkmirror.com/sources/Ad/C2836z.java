package Ad;

import Jd.C3779m;
import Jd.C3780n;
import Td.AbstractC5232j;
import Td.C5233k;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import hd.AbstractC14417s;
import hd.InterfaceC14415p;

/* renamed from: Ad.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2836z extends com.google.android.gms.common.api.d implements Jd.r {
    public C2836z(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) C2819i.f260b, a.d.f64750a, d.a.f64751c);
    }

    @Override // Jd.r
    public final AbstractC5232j<C3780n> i(final C3779m c3779m) {
        return doRead(AbstractC14417s.a().b(new InterfaceC14415p() { // from class: Ad.A
            @Override // hd.InterfaceC14415p
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                C5233k c5233k = (C5233k) obj2;
                P p10 = (P) obj;
                C3779m c3779m2 = c3779m;
                com.google.android.gms.common.internal.r.b(c3779m2 != null, "locationSettingsRequest can't be null");
                ((E0) p10.getService()).Z7(c3779m2, new C(c5233k), null);
            }
        }).e(2426).a());
    }
}
