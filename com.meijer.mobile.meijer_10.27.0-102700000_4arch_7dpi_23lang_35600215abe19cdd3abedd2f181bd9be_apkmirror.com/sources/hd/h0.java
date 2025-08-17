package hd;

import Td.C5233k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import gd.C14244c;
import hd.AbstractC14417s;

/* loaded from: classes4.dex */
final class h0 extends AbstractC14417s {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC14417s.a f134650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h0(AbstractC14417s.a aVar, C14244c[] c14244cArr, boolean z10, int i10) {
        super(c14244cArr, z10, i10);
        this.f134650d = aVar;
    }

    @Override // hd.AbstractC14417s
    protected final void b(a.b bVar, C5233k c5233k) throws RemoteException {
        this.f134650d.f134701a.accept(bVar, c5233k);
    }
}
