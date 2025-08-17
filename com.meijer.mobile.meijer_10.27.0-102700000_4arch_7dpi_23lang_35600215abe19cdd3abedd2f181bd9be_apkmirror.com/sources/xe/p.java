package xe;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class p extends j {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f169570b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f169571c;

    p(s sVar, IBinder iBinder) {
        this.f169571c = sVar;
        this.f169570b = iBinder;
    }

    @Override // xe.j
    public final void a() throws RemoteException {
        this.f169571c.f169573a.f169587m = e.a2(this.f169570b);
        t.n(this.f169571c.f169573a);
        this.f169571c.f169573a.f169581g = false;
        Iterator it = this.f169571c.f169573a.f169578d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f169571c.f169573a.f169578d.clear();
    }
}
