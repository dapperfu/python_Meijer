package tv;

import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15789a;
import ov.t;
import ov.w;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\u00020\u001c2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b(\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u000b\u00106\u001a\u00020\u00018\u0002X\u0082\u0004¨\u00067"}, d2 = {"Ltv/i;", "", "T", "Lmv/a;", "", "Lov/t;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lio/reactivex/n;", "subscriber", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lio/reactivex/n;)V", "elem", "", "j1", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "p1", "()V", "cause", "", "handled", "k1", "(Ljava/lang/Throwable;Z)V", "o1", "q", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "", "m1", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "element", "Lov/k;", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "r", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "n1", "(Lkotlin/Unit;)V", "g1", "d", "Lio/reactivex/n;", "Lwv/a;", "e", "Lwv/a;", "mutex", "Lov/w;", "w", "()Lov/w;", "channel", "s", "()Z", "isClosedForSend", "_signal", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
final class i<T> extends AbstractC15789a<Unit> implements t<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f163465f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_signal$volatile");
    private volatile /* synthetic */ int _signal$volatile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final io.reactivex.n<T> subscriber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx2.RxObservableCoroutine", f = "RxObservable.kt", l = {113}, m = "send")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f163468a;

        /* renamed from: b, reason: collision with root package name */
        Object f163469b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f163470c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i<T> f163471d;

        /* renamed from: e, reason: collision with root package name */
        int f163472e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i<T> iVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f163471d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f163470c = obj;
            this.f163472e |= Integer.MIN_VALUE;
            return this.f163471d.r(null, this);
        }
    }

    public i(CoroutineContext coroutineContext, io.reactivex.n<T> nVar) {
        super(coroutineContext, false, true);
        this.subscriber = nVar;
        this.mutex = wv.g.b(false, 1, null);
    }

    private final void k1(Throwable cause, boolean handled) {
        try {
            if (f163465f.get(this) != -2) {
                f163465f.set(this, -2);
                Throwable th2 = cause != null ? cause : null;
                if (th2 == null) {
                    try {
                        this.subscriber.onComplete();
                    } catch (Exception e10) {
                        e.a(e10, getContext());
                    }
                } else if ((th2 instanceof UndeliverableException) && !handled) {
                    e.a(cause, getContext());
                } else if (th2 != D() || !this.subscriber.isDisposed()) {
                    try {
                        this.subscriber.onError(cause);
                    } catch (Exception e11) {
                        ExceptionsKt.a(cause, e11);
                        e.a(cause, getContext());
                    }
                }
            }
        } finally {
            InterfaceC17929a.C2673a.c(this.mutex, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mv.AbstractC15789a
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public void h1(Unit value) {
        o1(null, false);
    }

    @Override // ov.t
    public w<T> w() {
        return this;
    }

    private final void p1() {
        InterfaceC17929a.C2673a.c(this.mutex, null, 1, null);
        if (a() || !InterfaceC17929a.C2673a.b(this.mutex, null, 1, null)) {
            return;
        }
        k1(g0(), h0());
    }

    @Override // ov.w
    public Object k(T element) {
        if (!InterfaceC17929a.C2673a.b(this.mutex, null, 1, null)) {
            return ov.k.INSTANCE.b();
        }
        Throwable thJ1 = j1(element);
        return thJ1 == null ? ov.k.INSTANCE.c(Unit.f143329a) : ov.k.INSTANCE.a(thJ1);
    }

    @Override // ov.w
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public Void f(Function1<? super Throwable, Unit> handler) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ov.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tv.i.a
            if (r0 == 0) goto L13
            r0 = r6
            tv.i$a r0 = (tv.i.a) r0
            int r1 = r0.f163472e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f163472e = r1
            goto L18
        L13:
            tv.i$a r0 = new tv.i$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f163470c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f163472e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f163469b
            java.lang.Object r0 = r0.f163468a
            tv.i r0 = (tv.i) r0
            kotlin.ResultKt.b(r6)
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.b(r6)
            wv.a r6 = r4.mutex
            r0.f163468a = r4
            r0.f163469b = r5
            r0.f163472e = r3
            r2 = 0
            java.lang.Object r6 = wv.InterfaceC17929a.C2673a.a(r6, r2, r0, r3, r2)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r0 = r4
        L4b:
            java.lang.Throwable r5 = r0.j1(r5)
            if (r5 != 0) goto L54
            kotlin.Unit r5 = kotlin.Unit.f143329a
            return r5
        L54:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.i.r(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Throwable j1(T elem) {
        if (!a()) {
            k1(g0(), h0());
            return D();
        }
        try {
            this.subscriber.onNext(elem);
            p1();
            return null;
        } catch (Throwable th2) {
            UndeliverableException undeliverableException = new UndeliverableException(th2);
            boolean zQ = q(undeliverableException);
            p1();
            if (!zQ) {
                e.a(undeliverableException, getContext());
                return D();
            }
            return undeliverableException;
        }
    }

    private final void o1(Throwable cause, boolean handled) {
        if (f163465f.compareAndSet(this, 0, -1) && InterfaceC17929a.C2673a.b(this.mutex, null, 1, null)) {
            k1(cause, handled);
        }
    }

    @Override // mv.AbstractC15789a
    protected void g1(Throwable cause, boolean handled) {
        o1(cause, handled);
    }

    @Override // ov.w
    public boolean q(Throwable cause) {
        return G(cause);
    }

    @Override // ov.w
    public boolean s() {
        return !a();
    }
}
