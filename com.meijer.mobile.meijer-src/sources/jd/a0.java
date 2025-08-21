package jd;

import Vd.C5517k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import jd.C14987j;
import jd.C14992o;

/* loaded from: classes4.dex */
final class a0 extends AbstractC14997u {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C14992o.a f140297b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(C14992o.a aVar, C14987j.a aVar2) {
        super(aVar2);
        this.f140297b = aVar;
    }

    @Override // jd.AbstractC14997u
    protected final void b(a.b bVar, C5517k<Boolean> c5517k) throws RemoteException {
        this.f140297b.f140371b.accept(bVar, c5517k);
    }
}
