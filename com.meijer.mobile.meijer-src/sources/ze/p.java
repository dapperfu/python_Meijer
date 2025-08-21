package ze;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class p extends j {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f172719b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f172720c;

    p(s sVar, IBinder iBinder) {
        this.f172720c = sVar;
        this.f172719b = iBinder;
    }

    @Override // ze.j
    public final void a() throws RemoteException {
        this.f172720c.f172722a.f172736m = e.a2(this.f172719b);
        t.n(this.f172720c.f172722a);
        this.f172720c.f172722a.f172730g = false;
        Iterator it = this.f172720c.f172722a.f172727d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f172720c.f172722a.f172727d.clear();
    }
}
