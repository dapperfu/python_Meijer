package hd;

import Td.C5233k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import gd.C14244c;
import hd.C14414o;

/* loaded from: classes4.dex */
final class Z extends AbstractC14413n {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C14414o.a f134607e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(C14414o.a aVar, C14409j c14409j, C14244c[] c14244cArr, boolean z10, int i10) {
        super(c14409j, c14244cArr, z10, i10);
        this.f134607e = aVar;
    }

    @Override // hd.AbstractC14413n
    protected final void d(a.b bVar, C5233k<Void> c5233k) throws RemoteException {
        this.f134607e.f134681a.accept(bVar, c5233k);
    }
}
