package hd;

import Td.C5233k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import hd.C14409j;
import hd.C14414o;

/* loaded from: classes4.dex */
final class a0 extends AbstractC14419u {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C14414o.a f134608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(C14414o.a aVar, C14409j.a aVar2) {
        super(aVar2);
        this.f134608b = aVar;
    }

    @Override // hd.AbstractC14419u
    protected final void b(a.b bVar, C5233k<Boolean> c5233k) throws RemoteException {
        this.f134608b.f134682b.accept(bVar, c5233k);
    }
}
