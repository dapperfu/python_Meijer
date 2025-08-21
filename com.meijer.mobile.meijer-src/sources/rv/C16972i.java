package rv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DispatchException;
import mv.AbstractC15779K;
import mv.AbstractC15812l0;
import mv.a1;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u001a"}, d2 = {"Lmv/K;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runnable", "", "c", "(Lmv/K;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "d", "(Lmv/K;Lkotlin/coroutines/CoroutineContext;)Z", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "result", "b", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "Lrv/h;", "e", "(Lrv/h;)Z", "Lrv/E;", "a", "Lrv/E;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16972i {

    /* renamed from: a, reason: collision with root package name */
    private static final C16950E f159648a = new C16950E("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final C16950E f159649b = new C16950E("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x003e, B:13:0x004c, B:15:0x0052, B:28:0x0091, B:18:0x0069, B:20:0x0079, B:25:0x0088, B:27:0x008e, B:33:0x009e, B:36:0x00a7, B:35:0x00a4, B:23:0x007f), top: B:45:0x003e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void b(kotlin.coroutines.Continuation<? super T> r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof rv.C16971h
            if (r0 == 0) goto Lb2
            rv.h r6 = (rv.C16971h) r6
            java.lang.Object r0 = mv.C15772D.b(r7)
            mv.K r1 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r2 = r6.getF143270a()
            boolean r1 = d(r1, r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6._state = r0
            r6.resumeMode = r2
            mv.K r7 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r0 = r6.getF143270a()
            c(r7, r0, r6)
            goto Lac
        L26:
            mv.a1 r1 = mv.a1.f151702a
            mv.l0 r1 = r1.b()
            boolean r3 = r1.d1()
            if (r3 == 0) goto L3b
            r6._state = r0
            r6.resumeMode = r2
            r1.Y0(r6)
            goto Lac
        L3b:
            r1.a1(r2)
            kotlin.coroutines.CoroutineContext r3 = r6.getF143270a()     // Catch: java.lang.Throwable -> L67
            mv.C0$b r4 = mv.C0.INSTANCE     // Catch: java.lang.Throwable -> L67
            kotlin.coroutines.CoroutineContext$Element r3 = r3.g(r4)     // Catch: java.lang.Throwable -> L67
            mv.C0 r3 = (mv.C0) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.a()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.D()     // Catch: java.lang.Throwable -> L67
            r6.c(r0, r7)     // Catch: java.lang.Throwable -> L67
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = kotlin.ResultKt.a(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L67
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
            goto L91
        L67:
            r7 = move-exception
            goto La8
        L69:
            kotlin.coroutines.Continuation<T> r0 = r6.continuation     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> L67
            kotlin.coroutines.CoroutineContext r4 = r0.getF143270a()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = rv.C16957L.i(r4, r3)     // Catch: java.lang.Throwable -> L67
            rv.E r5 = rv.C16957L.f159623a     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            mv.f1 r0 = mv.C15777I.m(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L9b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9b
            kotlin.Unit r7 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
            boolean r7 = r0.k1()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L91
        L8e:
            rv.C16957L.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        L91:
            boolean r7 = r1.h1()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L91
        L97:
            r1.U0(r2)
            goto Lac
        L9b:
            r7 = move-exception
            if (r0 == 0) goto La4
            boolean r0 = r0.k1()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La7
        La4:
            rv.C16957L.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        La7:
            throw r7     // Catch: java.lang.Throwable -> L67
        La8:
            r6.h(r7)     // Catch: java.lang.Throwable -> Lad
            goto L97
        Lac:
            return
        Lad:
            r6 = move-exception
            r1.U0(r2)
            throw r6
        Lb2:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.C16972i.b(kotlin.coroutines.Continuation, java.lang.Object):void");
    }

    public static final boolean e(C16971h<? super Unit> c16971h) {
        Unit unit = Unit.f143329a;
        AbstractC15812l0 abstractC15812l0B = a1.f151702a.b();
        if (abstractC15812l0B.e1()) {
            return false;
        }
        if (abstractC15812l0B.d1()) {
            c16971h._state = unit;
            c16971h.resumeMode = 1;
            abstractC15812l0B.Y0(c16971h);
            return true;
        }
        abstractC15812l0B.a1(true);
        try {
            c16971h.run();
            do {
            } while (abstractC15812l0B.h1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }

    public static final void c(AbstractC15779K abstractC15779K, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            abstractC15779K.J0(coroutineContext, runnable);
        } catch (Throwable th2) {
            throw new DispatchException(th2, abstractC15779K, coroutineContext);
        }
    }

    public static final boolean d(AbstractC15779K abstractC15779K, CoroutineContext coroutineContext) throws DispatchException {
        try {
            return abstractC15779K.P0(coroutineContext);
        } catch (Throwable th2) {
            throw new DispatchException(th2, abstractC15779K, coroutineContext);
        }
    }
}
