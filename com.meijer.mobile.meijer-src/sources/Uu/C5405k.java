package Uu;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: Uu.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5405k {
    public static <T> void a(io.reactivex.q<? extends T> qVar) {
        av.f fVar = new av.f();
        Pu.q qVar2 = new Pu.q(Nu.a.g(), fVar, fVar, Nu.a.g());
        qVar.subscribe(qVar2);
        av.e.a(fVar, qVar2);
        Throwable th2 = fVar.f59687a;
        if (th2 != null) {
            throw av.j.d(th2);
        }
    }

    public static <T> void b(io.reactivex.q<? extends T> qVar, Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2, Lu.a aVar) {
        Nu.b.e(gVar, "onNext is null");
        Nu.b.e(gVar2, "onError is null");
        Nu.b.e(aVar, "onComplete is null");
        c(qVar, new Pu.q(gVar, gVar2, aVar, Nu.a.g()));
    }

    public static <T> void c(io.reactivex.q<? extends T> qVar, io.reactivex.s<? super T> sVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Pu.h hVar = new Pu.h(linkedBlockingQueue);
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
            if (hVar.isDisposed() || objPoll == Pu.h.f27231b || av.m.b(objPoll, sVar)) {
                return;
            }
        }
    }
}
