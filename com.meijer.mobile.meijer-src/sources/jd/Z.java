package jd;

import Vd.C5517k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import id.C14720c;
import jd.C14992o;

/* loaded from: classes4.dex */
final class Z extends AbstractC14991n {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C14992o.a f140296e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(C14992o.a aVar, C14987j c14987j, C14720c[] c14720cArr, boolean z10, int i10) {
        super(c14987j, c14720cArr, z10, i10);
        this.f140296e = aVar;
    }

    @Override // jd.AbstractC14991n
    protected final void d(a.b bVar, C5517k<Void> c5517k) throws RemoteException {
        this.f140296e.f140370a.accept(bVar, c5517k);
    }
}
