package Yu;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: Yu.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5466k {
    public static <T> void a(io.reactivex.q<? extends T> qVar) {
        ev.f fVar = new ev.f();
        Tu.q qVar2 = new Tu.q(Ru.a.g(), fVar, fVar, Ru.a.g());
        qVar.subscribe(qVar2);
        ev.e.a(fVar, qVar2);
        Throwable th2 = fVar.f130065a;
        if (th2 != null) {
            throw ev.j.d(th2);
        }
    }

    public static <T> void b(io.reactivex.q<? extends T> qVar, Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2, Pu.a aVar) {
        Ru.b.e(gVar, "onNext is null");
        Ru.b.e(gVar2, "onError is null");
        Ru.b.e(aVar, "onComplete is null");
        c(qVar, new Tu.q(gVar, gVar2, aVar, Ru.a.g()));
    }

    public static <T> void c(io.reactivex.q<? extends T> qVar, io.reactivex.s<? super T> sVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Tu.h hVar = new Tu.h(linkedBlockingQueue);
        sVar.onSubscribe(hVar);
        qVar.subscribe(hVar);
        while (!hVar.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e10) {
                    hVar.dispose();
                    sVar.onError(e10);
                    return;
                }
            }
            if (hVar.isDisposed() || objPoll == Tu.h.f35459b || ev.m.b(objPoll, sVar)) {
                return;
            }
        }
    }
}
