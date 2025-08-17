package mb;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;
import lb.C15392a;

/* renamed from: mb.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15591l {

    /* renamed from: a, reason: collision with root package name */
    Collection<Lb.l<Notification.Builder>> f150042a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private C15392a f150043b;

    public final Lb.l<Notification.Builder> a() {
        Lb.l<Notification.Builder> lVar = new Lb.l<>();
        this.f150042a.add(lVar);
        return lVar;
    }

    public final C15584e b() throws InterruptedException, TimeoutException {
        Iterator<Lb.l<Notification.Builder>> it = this.f150042a.iterator();
        Notification.Builder builder = null;
        while (it.hasNext() && (builder = it.next().get()) == null) {
        }
        return new C15584e(this.f150043b, builder);
    }

    public C15591l(C15392a c15392a) {
        this.f150043b = c15392a;
    }
}
