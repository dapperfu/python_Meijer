package jd;

import Vd.C5517k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import id.C14720c;
import jd.AbstractC14995s;

/* loaded from: classes4.dex */
final class h0 extends AbstractC14995s {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC14995s.a f140339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h0(AbstractC14995s.a aVar, C14720c[] c14720cArr, boolean z10, int i10) {
        super(c14720cArr, z10, i10);
        this.f140339d = aVar;
    }

    @Override // jd.AbstractC14995s
    protected final void b(a.b bVar, C5517k c5517k) throws RemoteException {
        this.f140339d.f140390a.accept(bVar, c5517k);
    }
}
