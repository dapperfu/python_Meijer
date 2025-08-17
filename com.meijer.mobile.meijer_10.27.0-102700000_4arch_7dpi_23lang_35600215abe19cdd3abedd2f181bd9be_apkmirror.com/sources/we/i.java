package we;

import Td.C5233k;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes4.dex */
final class i extends xe.j {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5233k f166047b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f166048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(l lVar, C5233k c5233k, C5233k c5233k2) {
        super(c5233k);
        this.f166048c = lVar;
        this.f166047b = c5233k2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, xe.f] */
    @Override // xe.j
    protected final void a() {
        try {
            ?? E10 = this.f166048c.f166054a.e();
            String str = this.f166048c.f166055b;
            Bundle bundleA = m.a();
            l lVar = this.f166048c;
            E10.j5(str, bundleA, new k(lVar, this.f166047b, lVar.f166055b));
        } catch (RemoteException e10) {
            l.f166053c.c(e10, "error requesting in-app review for %s", this.f166048c.f166055b);
            this.f166047b.d(new RuntimeException(e10));
        }
    }
}
