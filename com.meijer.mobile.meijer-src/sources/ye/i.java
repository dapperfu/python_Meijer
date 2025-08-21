package ye;

import Vd.C5517k;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes4.dex */
final class i extends ze.j {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5517k f171369b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f171370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(l lVar, C5517k c5517k, C5517k c5517k2) {
        super(c5517k);
        this.f171370c = lVar;
        this.f171369b = c5517k2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, ze.f] */
    @Override // ze.j
    protected final void a() {
        try {
            ?? E10 = this.f171370c.f171376a.e();
            String str = this.f171370c.f171377b;
            Bundle bundleA = m.a();
            l lVar = this.f171370c;
            E10.Y0(str, bundleA, new k(lVar, this.f171369b, lVar.f171377b));
        } catch (RemoteException e10) {
            l.f171375c.c(e10, "error requesting in-app review for %s", this.f171370c.f171377b);
            this.f171369b.d(new RuntimeException(e10));
        }
    }
}
