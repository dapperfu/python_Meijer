package mv;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000e\u000bB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u000f"}, d2 = {"Lmv/e;", "T", "", "", "Lmv/W;", "deferreds", "<init>", "([Lmv/W;)V", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "[Lmv/W;", "notCompletedCount", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mv.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C15797e<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f151716b = AtomicIntegerFieldUpdater.newUpdater(C15797e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final W<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010\u001d\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0018\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00170\"8\u0002X\u0082\u0004¨\u0006$"}, d2 = {"Lmv/e$a;", "Lmv/G0;", "Lmv/n;", "", "continuation", "<init>", "(Lmv/e;Lmv/n;)V", "", "cause", "", "w", "(Ljava/lang/Throwable;)V", "e", "Lmv/n;", "Lmv/h0;", "f", "Lmv/h0;", "z", "()Lmv/h0;", "C", "(Lmv/h0;)V", "handle", "Lmv/e$b;", "Lmv/e;", "value", "y", "()Lmv/e$b;", "B", "(Lmv/e$b;)V", "disposer", "", "v", "()Z", "onCancelling", "", "_disposer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: mv.e$a */
    private final class a extends G0 {

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f151718h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC15815n<List<? extends T>> continuation;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public InterfaceC15804h0 handle;

        @Override // mv.G0
        public boolean v() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC15815n<? super List<? extends T>> interfaceC15815n) {
            this.continuation = interfaceC15815n;
        }

        public final void C(InterfaceC15804h0 interfaceC15804h0) {
            this.handle = interfaceC15804h0;
        }

        @Override // mv.G0
        public void w(Throwable cause) {
            if (cause != null) {
                Object objI = this.continuation.I(cause);
                if (objI != null) {
                    this.continuation.X(objI);
                    C15797e<T>.b bVarY = y();
                    if (bVarY != null) {
                        bVarY.a();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C15797e.d().decrementAndGet(C15797e.this) == 0) {
                InterfaceC15815n<List<? extends T>> interfaceC15815n = this.continuation;
                W[] wArr = ((C15797e) C15797e.this).deferreds;
                ArrayList arrayList = new ArrayList(wArr.length);
                for (W w10 : wArr) {
                    arrayList.add(w10.i());
                }
                interfaceC15815n.resumeWith(Result.b(arrayList));
            }
        }

        public final InterfaceC15804h0 z() {
            InterfaceC15804h0 interfaceC15804h0 = this.handle;
            if (interfaceC15804h0 != null) {
                return interfaceC15804h0;
            }
            Intrinsics.x("handle");
            return null;
        }

        public final void B(C15797e<T>.b bVar) {
            f151718h.set(this, bVar);
        }

        public final C15797e<T>.b y() {
            return (b) f151718h.get(this);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmv/e$b;", "Lmv/m;", "", "Lmv/e$a;", "Lmv/e;", "nodes", "<init>", "(Lmv/e;[Lmv/e$a;)V", "", "a", "()V", "", "cause", "c", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "[Lmv/e$a;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: mv.e$b */
    private final class b implements InterfaceC15813m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C15797e<T>.a[] nodes;

        public b(C15797e<T>.a[] aVarArr) {
            this.nodes = aVarArr;
        }

        public final void a() {
            for (C15797e<T>.a aVar : this.nodes) {
                aVar.z().dispose();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }

        @Override // mv.InterfaceC15813m
        public void c(Throwable cause) {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f151716b;
    }

    public final Object c(Continuation<? super List<? extends T>> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        int length = this.deferreds.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            W w10 = this.deferreds[i10];
            w10.start();
            a aVar = new a(c15819p);
            aVar.C(F0.m(w10, false, aVar, 1, null));
            Unit unit = Unit.f143329a;
            aVarArr[i10] = aVar;
        }
        C15797e<T>.b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].B(bVar);
        }
        if (c15819p.A()) {
            bVar.a();
        } else {
            C15823r.c(c15819p, bVar);
        }
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15797e(W<? extends T>[] wArr) {
        this.deferreds = wArr;
        this.notCompletedCount$volatile = wArr.length;
    }
}
