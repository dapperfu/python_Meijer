package wv;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15787T;
import mv.C15819p;
import mv.C15823r;
import mv.InterfaceC15815n;
import mv.h1;
import rv.AbstractC16947B;
import wv.f;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u007f\u0010#\u001am\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u00180\u0018j\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010&\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¨\u0006("}, d2 = {"Lwv/f;", "Lwv/j;", "Lwv/a;", "", "locked", "<init>", "(Z)V", "", "owner", "", "A", "(Ljava/lang/Object;)I", "", "C", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "F", "g", "b", "(Ljava/lang/Object;)Z", "h", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function3;", "Lvv/k;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "Lkotlin/jvm/functions/Function3;", "onSelectCancellationUnlockConstructor", "c", "()Z", "isLocked", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class f extends j implements InterfaceC17929a {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f167646i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Function3<vv.k<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ|\u0010\u0015\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062M\u0010\u0014\u001aI\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jp\u0010\u0017\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002M\u0010\u0014\u001aI\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b \u0010!J9\u0010%\u001a\u00020\u00022'\u0010$\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00020\"j\u0002`#H\u0096\u0001¢\u0006\u0004\b%\u0010&J$\u0010+\u001a\u00020\u00022\n\u0010(\u001a\u0006\u0012\u0002\b\u00030'2\u0006\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b+\u0010,J\u001c\u0010.\u001a\u00020\u0002*\u00020-2\u0006\u0010\u000b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b.\u0010/J=\u00100\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022#\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"H\u0097\u0001¢\u0006\u0004\b0\u00101J\u001e\u00104\u001a\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000202H\u0096\u0001¢\u0006\u0004\b4\u0010\u001eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u00107R\u0014\u00109\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00108R\u0014\u0010;\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lwv/f$a;", "Lmv/n;", "", "Lmv/h1;", "Lmv/p;", "cont", "", "owner", "<init>", "(Lwv/f;Lmv/p;Ljava/lang/Object;)V", "R", "value", "idempotent", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "onCancellation", "i", "(Lkotlin/Unit;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "f", "(Lkotlin/Unit;Lkotlin/jvm/functions/Function3;)V", "exception", "I", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "X", "(Ljava/lang/Object;)V", "", "N", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "F", "(Lkotlin/jvm/functions/Function1;)V", "Lrv/B;", "segment", "", "index", "b", "(Lrv/B;I)V", "Lmv/K;", "h", "(Lmv/K;Lkotlin/Unit;)V", "e", "(Lkotlin/Unit;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Result;", "result", "resumeWith", "a", "Lmv/p;", "Ljava/lang/Object;", "()Z", "isActive", "A", "isCompleted", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    final class a implements InterfaceC15815n<Unit>, h1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final C15819p<Unit> cont;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public a(C15819p<? super Unit> c15819p, Object obj) {
            this.cont = c15819p;
            this.owner = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(f fVar, a aVar, Throwable th2) {
            fVar.h(aVar.owner);
            return Unit.f143329a;
        }

        @Override // mv.InterfaceC15815n
        public boolean A() {
            return this.cont.A();
        }

        @Override // mv.InterfaceC15815n
        public void F(Function1<? super Throwable, Unit> handler) {
            this.cont.F(handler);
        }

        @Override // mv.InterfaceC15815n
        public Object I(Throwable exception) {
            return this.cont.I(exception);
        }

        @Override // mv.InterfaceC15815n
        public boolean N(Throwable cause) {
            return this.cont.N(cause);
        }

        @Override // mv.InterfaceC15815n
        public void X(Object token) {
            this.cont.X(token);
        }

        @Override // mv.InterfaceC15815n
        public boolean a() {
            return this.cont.a();
        }

        @Override // mv.h1
        public void b(AbstractC16947B<?> segment, int index) {
            this.cont.b(segment, index);
        }

        @Override // mv.InterfaceC15815n
        @Deprecated
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void M(Unit value, Function1<? super Throwable, Unit> onCancellation) {
            this.cont.M(value, onCancellation);
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.cont.getContext();
        }

        @Override // mv.InterfaceC15815n
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void B(AbstractC15779K abstractC15779K, Unit unit) {
            this.cont.B(abstractC15779K, unit);
        }

        @Override // mv.InterfaceC15815n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> Object W(R value, Object idempotent, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            final f fVar = f.this;
            Object objW = this.cont.W(value, idempotent, new Function3() { // from class: wv.d
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return f.a.j(fVar, this, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                }
            });
            if (objW != null) {
                f.z().set(f.this, this.owner);
            }
            return objW;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            this.cont.resumeWith(result);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit j(f fVar, a aVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
            f.z().set(fVar, aVar.owner);
            fVar.h(aVar.owner);
            return Unit.f143329a;
        }

        @Override // mv.InterfaceC15815n
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> void U(R value, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            f.z().set(f.this, this.owner);
            C15819p<Unit> c15819p = this.cont;
            final f fVar = f.this;
            c15819p.M(value, new Function1() { // from class: wv.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.a.g(fVar, this, (Throwable) obj);
                }
            });
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f167651a;
        this.onSelectCancellationUnlockConstructor = new Function3() { // from class: wv.b
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return f.D(this.f167639a, (vv.k) obj, obj2, obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 D(final f fVar, vv.k kVar, final Object obj, Object obj2) {
        return new Function3() { // from class: wv.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return f.E(this.f167640a, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater z() {
        return f167646i;
    }

    public String toString() {
        return "Mutex@" + C15787T.b(this) + "[isLocked=" + c() + ",owner=" + f167646i.get(this) + ']';
    }

    private final int A(Object owner) {
        while (c()) {
            Object obj = f167646i.get(this);
            if (obj != g.f167651a) {
                if (obj == owner) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object B(f fVar, Object obj, Continuation<? super Unit> continuation) {
        if (fVar.b(obj)) {
            return Unit.f143329a;
        }
        Object objC = fVar.C(obj, continuation);
        if (objC == IntrinsicsKt.f()) {
            return objC;
        }
        return Unit.f143329a;
    }

    private final Object C(Object obj, Continuation<? super Unit> continuation) {
        C15819p c15819pB = C15823r.b(IntrinsicsKt.c(continuation));
        try {
            i(new a(c15819pB, obj));
            Object objU = c15819pB.u();
            if (objU == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            if (objU == IntrinsicsKt.f()) {
                return objU;
            }
            return Unit.f143329a;
        } catch (Throwable th2) {
            c15819pB.O();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(f fVar, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        fVar.h(obj);
        return Unit.f143329a;
    }

    private final int F(Object owner) {
        while (!t()) {
            if (owner == null) {
                return 1;
            }
            int iA = A(owner);
            if (iA == 1) {
                return 2;
            }
            if (iA == 2) {
                return 1;
            }
        }
        f167646i.set(this, owner);
        return 0;
    }

    @Override // wv.InterfaceC17929a
    public boolean b(Object owner) {
        int iF = F(owner);
        if (iF == 0) {
            return true;
        }
        if (iF != 1) {
            if (iF != 2) {
                throw new IllegalStateException("unexpected");
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
        }
        return false;
    }

    @Override // wv.InterfaceC17929a
    public boolean c() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    @Override // wv.InterfaceC17929a
    public Object g(Object obj, Continuation<? super Unit> continuation) {
        return B(this, obj, continuation);
    }

    @Override // wv.InterfaceC17929a
    public void h(Object owner) {
        while (c()) {
            Object obj = f167646i.get(this);
            if (obj != g.f167651a) {
                if (obj != owner && owner != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f167646i, this, obj, g.f167651a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
