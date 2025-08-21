package ob;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;
import nb.C15926a;

/* renamed from: ob.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16101l {

    /* renamed from: a, reason: collision with root package name */
    Collection<Nb.l<Notification.Builder>> f153829a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private C15926a f153830b;

    public final Nb.l<Notification.Builder> a() {
        Nb.l<Notification.Builder> lVar = new Nb.l<>();
        this.f153829a.add(lVar);
        return lVar;
    }

    public final C16094e b() throws InterruptedException, TimeoutException {
        Iterator<Nb.l<Notification.Builder>> it = this.f153829a.iterator();
        Notification.Builder builder = null;
        while (it.hasNext() && (builder = it.next().get()) == null) {
        }
        return new C16094e(this.f153830b, builder);
    }

    public C16101l(C15926a c15926a) {
        this.f153830b = c15926a;
    }
}
