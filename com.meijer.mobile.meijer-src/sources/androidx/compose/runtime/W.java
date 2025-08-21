package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15819p;
import mv.InterfaceC15815n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/W;", "", "<init>", "()V", "", "d", "f", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "lock", "", "Lkotlin/coroutines/Continuation;", "b", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", "e", "()Z", "isOpen", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<Continuation<Unit>> awaiters = new ArrayList();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<Continuation<Unit>> spareList = new ArrayList();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean _isOpen = true;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC15815n<Unit> f50395g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC15815n<? super Unit> interfaceC15815n) {
            super(1);
            this.f50395g = interfaceC15815n;
        }

        public final void a(Throwable th2) {
            Object obj = W.this.lock;
            W w10 = W.this;
            InterfaceC15815n<Unit> interfaceC15815n = this.f50395g;
            synchronized (obj) {
                w10.awaiters.remove(interfaceC15815n);
                Unit unit = Unit.f143329a;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    public final void d() {
        synchronized (this.lock) {
            this._isOpen = false;
            Unit unit = Unit.f143329a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this._isOpen;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.lock) {
            try {
                if (e()) {
                    return;
                }
                List<Continuation<Unit>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Continuation<Unit> continuation = list.get(i10);
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.b(Unit.f143329a));
                }
                list.clear();
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object c(Continuation<? super Unit> continuation) {
        if (e()) {
            return Unit.f143329a;
        }
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        synchronized (this.lock) {
            this.awaiters.add(c15819p);
        }
        c15819p.F(new a(c15819p));
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        if (objU == IntrinsicsKt.f()) {
            return objU;
        }
        return Unit.f143329a;
    }
}
