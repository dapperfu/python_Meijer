package xv;

import io.reactivex.o;
import io.reactivex.q;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import qv.C16639f0;
import qv.C16644i;
import qv.C16671v0;
import qv.EnumC16624Q;
import qv.InterfaceC16622O;
import sv.r;
import sv.t;
import sv.w;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import xv.h;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "T", "Lio/reactivex/q;", "Ltv/f;", "b", "(Lio/reactivex/q;)Ltv/f;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lio/reactivex/l;", "c", "(Ltv/f;Lkotlin/coroutines/CoroutineContext;)Lio/reactivex/l;", "kotlinx-coroutines-rx2"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lsv/t;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", f = "RxConvert.kt", l = {91}, m = "invokeSuspend")
    static final class a<T> extends SuspendLambda implements Function2<t<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169987a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f169988b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<T> f169989c;

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"xv/h$a$a", "Lio/reactivex/s;", "", "onComplete", "()V", "LNu/b;", "d", "onSubscribe", "(LNu/b;)V", "t", "onNext", "(Ljava/lang/Object;)V", "", "e", "onError", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xv.h$a$a, reason: collision with other inner class name */
        public static final class C2737a implements s<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t<T> f169990a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AtomicReference<Nu.b> f169991b;

            /* JADX WARN: Multi-variable type inference failed */
            C2737a(t<? super T> tVar, AtomicReference<Nu.b> atomicReference) {
                this.f169990a = tVar;
                this.f169991b = atomicReference;
            }

            @Override // io.reactivex.s
            public void onComplete() {
                w.a.a(this.f169990a, null, 1, null);
            }

            @Override // io.reactivex.s
            public void onError(Throwable e10) {
                this.f169990a.q(e10);
            }

            @Override // io.reactivex.s
            public void onNext(T t10) {
                try {
                    sv.n.b(this.f169990a, t10);
                } catch (InterruptedException unused) {
                }
            }

            @Override // io.reactivex.s
            public void onSubscribe(Nu.b d10) {
                if (U.d.a(this.f169991b, null, d10)) {
                    return;
                }
                d10.dispose();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q<T> qVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f169989c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f169989c, continuation);
            aVar.f169988b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t<? super T> tVar, Continuation<? super Unit> continuation) {
            return ((a) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(AtomicReference atomicReference) {
            Nu.b bVar = (Nu.b) atomicReference.getAndSet(Nu.c.a());
            if (bVar != null) {
                bVar.dispose();
            }
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169987a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                t tVar = (t) this.f169988b;
                final AtomicReference atomicReference = new AtomicReference();
                this.f169989c.subscribe(new C2737a(tVar, atomicReference));
                Function0 function0 = new Function0() { // from class: xv.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a.g(atomicReference);
                    }
                };
                this.f169987a = 1;
                if (r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", l = {110}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169992a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f169993b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f<T> f169994c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.reactivex.n<T> f169995d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.reactivex.n<T> f169996a;

            a(io.reactivex.n<T> nVar) {
                this.f169996a = nVar;
            }

            @Override // tv.InterfaceC17153g
            public final Object emit(T t10, Continuation<? super Unit> continuation) {
                this.f169996a.onNext(t10);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC17152f<? extends T> interfaceC17152f, io.reactivex.n<T> nVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f169994c = interfaceC17152f;
            this.f169995d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f169994c, this.f169995d, continuation);
            bVar.f169993b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f169992a
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r6.f169993b
                qv.O r0 = (qv.InterfaceC16622O) r0
                kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L13
                goto L39
            L13:
                r7 = move-exception
                goto L43
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f169993b
                qv.O r7 = (qv.InterfaceC16622O) r7
                tv.f<T> r1 = r6.f169994c     // Catch: java.lang.Throwable -> L3f
                xv.h$b$a r3 = new xv.h$b$a     // Catch: java.lang.Throwable -> L3f
                io.reactivex.n<T> r4 = r6.f169995d     // Catch: java.lang.Throwable -> L3f
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f
                r6.f169993b = r7     // Catch: java.lang.Throwable -> L3f
                r6.f169992a = r2     // Catch: java.lang.Throwable -> L3f
                java.lang.Object r1 = r1.collect(r3, r6)     // Catch: java.lang.Throwable -> L3f
                if (r1 != r0) goto L38
                return r0
            L38:
                r0 = r7
            L39:
                io.reactivex.n<T> r7 = r6.f169995d     // Catch: java.lang.Throwable -> L13
                r7.onComplete()     // Catch: java.lang.Throwable -> L13
                goto L5c
            L3f:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L43:
                boolean r1 = r7 instanceof java.util.concurrent.CancellationException
                if (r1 != 0) goto L57
                io.reactivex.n<T> r1 = r6.f169995d
                boolean r1 = r1.a(r7)
                if (r1 != 0) goto L5c
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                xv.e.a(r7, r0)
                goto L5c
            L57:
                io.reactivex.n<T> r7 = r6.f169995d
                r7.onComplete()
            L5c:
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: xv.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> InterfaceC17152f<T> b(q<T> qVar) {
        return C17154h.f(new a(qVar, null));
    }

    public static final <T> io.reactivex.l<T> c(final InterfaceC17152f<? extends T> interfaceC17152f, final CoroutineContext coroutineContext) {
        return io.reactivex.l.create(new o() { // from class: xv.f
            @Override // io.reactivex.o
            public final void a(io.reactivex.n nVar) {
                h.e(coroutineContext, interfaceC17152f, nVar);
            }
        });
    }

    public static /* synthetic */ io.reactivex.l d(InterfaceC17152f interfaceC17152f, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f142646a;
        }
        return c(interfaceC17152f, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CoroutineContext coroutineContext, InterfaceC17152f interfaceC17152f, io.reactivex.n nVar) {
        nVar.b(new d(C16644i.c(C16671v0.f157699a, C16639f0.d().m0(coroutineContext), EnumC16624Q.f157613c, new b(interfaceC17152f, nVar, null))));
    }
}
