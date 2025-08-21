package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    public class a implements I.c<List<Surface>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f47649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f47650b;

        a(boolean z10, c.a aVar) {
            this.f47649a = z10;
            this.f47650b = aVar;
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof TimeoutException) {
                this.f47650b.f(th2);
            } else {
                this.f47650b.c(Collections.EMPTY_LIST);
            }
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Surface> list) {
            o2.i.g(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f47649a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f47650b.c(arrayList);
        }
    }

    public static /* synthetic */ Object a(final com.google.common.util.concurrent.q qVar, Executor executor, boolean z10, Collection collection, c.a aVar) {
        aVar.a(new Runnable() { // from class: F.L
            @Override // java.lang.Runnable
            public final void run() {
                qVar.cancel(true);
            }
        }, executor);
        I.n.j(qVar, new a(z10, aVar), executor);
        return "surfaceList[" + collection + "]";
    }

    public static com.google.common.util.concurrent.q<List<Surface>> e(final Collection<DeferrableSurface> collection, final boolean z10, long j10, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(I.n.s(it.next().j()));
        }
        final com.google.common.util.concurrent.q qVarQ = I.n.q(j10, scheduledExecutorService, I.n.w(arrayList));
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: F.M
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return androidx.camera.core.impl.l.a(qVarQ, executor, z10, collection, aVar);
            }
        });
    }

    public static void c(List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public static void d(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (!list.isEmpty()) {
            int i10 = 0;
            do {
                try {
                    list.get(i10).l();
                    i10++;
                } catch (DeferrableSurface.SurfaceClosedException e10) {
                    for (int i11 = i10 - 1; i11 >= 0; i11--) {
                        list.get(i11).e();
                    }
                    throw e10;
                }
            } while (i10 < list.size());
        }
    }
}
