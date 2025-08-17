package Bv;

import Td.AbstractC5232j;
import Td.C5224b;
import Td.InterfaceC5227e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a(\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"T", "LTd/j;", "b", "(LTd/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LTd/b;", "cancellationTokenSource", "a", "(LTd/j;LTd/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "kotlinx-coroutines-play-services"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<TResult> implements InterfaceC5227e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<T> f3272a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC16654n<? super T> interfaceC16654n) {
            this.f3272a = interfaceC16654n;
        }

        @Override // Td.InterfaceC5227e
        public final void onComplete(AbstractC5232j<T> abstractC5232j) {
            Exception excM = abstractC5232j.m();
            if (excM == null) {
                if (abstractC5232j.p()) {
                    InterfaceC16654n.a.a(this.f3272a, null, 1, null);
                    return;
                }
                Continuation continuation = this.f3272a;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.b(abstractC5232j.n()));
                return;
            }
            Continuation continuation2 = this.f3272a;
            Result.Companion companion2 = Result.INSTANCE;
            continuation2.resumeWith(Result.b(ResultKt.a(excM)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bv.b$b, reason: collision with other inner class name */
    static final class C0058b implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5224b f3273a;

        C0058b(C5224b c5224b) {
            this.f3273a = c5224b;
        }

        public final void a(Throwable th2) {
            this.f3273a.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    public static final <T> Object b(AbstractC5232j<T> abstractC5232j, Continuation<? super T> continuation) {
        return c(abstractC5232j, null, continuation);
    }

    public static final <T> Object a(AbstractC5232j<T> abstractC5232j, C5224b c5224b, Continuation<? super T> continuation) {
        return c(abstractC5232j, c5224b, continuation);
    }

    private static final <T> Object c(AbstractC5232j<T> abstractC5232j, C5224b c5224b, Continuation<? super T> continuation) throws Exception {
        if (abstractC5232j.q()) {
            Exception excM = abstractC5232j.m();
            if (excM == null) {
                if (!abstractC5232j.p()) {
                    return abstractC5232j.n();
                }
                throw new CancellationException("Task " + abstractC5232j + " was cancelled normally.");
            }
            throw excM;
        }
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        abstractC5232j.d(Bv.a.f3271a, new a(c16658p));
        if (c5224b != null) {
            c16658p.F(new C0058b(c5224b));
        }
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }
}
