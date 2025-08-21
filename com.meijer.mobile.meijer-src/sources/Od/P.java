package Od;

import android.os.RemoteException;

/* loaded from: classes6.dex */
final class P implements H {

    /* renamed from: b, reason: collision with root package name */
    private final Dd.q f23593b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G f23594c;

    P(G g10) {
        this.f23594c = g10;
        this.f23593b = g10.f23581a;
    }

    @Override // Od.H
    public final E getTile(int i10, int i11, int i12) {
        try {
            return this.f23593b.W3(i10, i11, i12);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
