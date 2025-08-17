package Md;

import android.os.RemoteException;

/* loaded from: classes6.dex */
final class P implements H {

    /* renamed from: b, reason: collision with root package name */
    private final Bd.q f19406b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G f19407c;

    P(G g10) {
        this.f19407c = g10;
        this.f19406b = g10.f19394a;
    }

    @Override // Md.H
    public final E getTile(int i10, int i11, int i12) {
        try {
            return this.f19406b.K3(i10, i11, i12);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
