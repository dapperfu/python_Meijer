package xv;

import Vd.AbstractC5516j;
import Vd.C5508b;
import Vd.InterfaceC5511e;
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
import mv.C15819p;
import mv.InterfaceC15815n;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a(\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"T", "LVd/j;", "b", "(LVd/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVd/b;", "cancellationTokenSource", "a", "(LVd/j;LVd/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "kotlinx-coroutines-play-services"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: xv.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C18230b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xv.b$a */
    static final class a<TResult> implements InterfaceC5511e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15815n<T> f171036a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC15815n<? super T> interfaceC15815n) {
            this.f171036a = interfaceC15815n;
        }

        @Override // Vd.InterfaceC5511e
        public final void onComplete(AbstractC5516j<T> abstractC5516j) {
            Exception excM = abstractC5516j.m();
            if (excM == null) {
                if (abstractC5516j.p()) {
                    InterfaceC15815n.a.a(this.f171036a, null, 1, null);
                    return;
                }
                Continuation continuation = this.f171036a;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.b(abstractC5516j.n()));
                return;
            }
            Continuation continuation2 = this.f171036a;
            Result.Companion companion2 = Result.INSTANCE;
            continuation2.resumeWith(Result.b(ResultKt.a(excM)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xv.b$b, reason: collision with other inner class name */
    static final class C2751b implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5508b f171037a;

        C2751b(C5508b c5508b) {
            this.f171037a = c5508b;
        }

        public final void a(Throwable th2) {
            this.f171037a.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    public static final <T> Object b(AbstractC5516j<T> abstractC5516j, Continuation<? super T> continuation) {
        return c(abstractC5516j, null, continuation);
    }

    public static final <T> Object a(AbstractC5516j<T> abstractC5516j, C5508b c5508b, Continuation<? super T> continuation) {
        return c(abstractC5516j, c5508b, continuation);
    }

    private static final <T> Object c(AbstractC5516j<T> abstractC5516j, C5508b c5508b, Continuation<? super T> continuation) throws Exception {
        if (abstractC5516j.q()) {
            Exception excM = abstractC5516j.m();
            if (excM == null) {
                if (!abstractC5516j.p()) {
                    return abstractC5516j.n();
                }
                throw new CancellationException("Task " + abstractC5516j + " was cancelled normally.");
            }
            throw excM;
        }
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        abstractC5516j.d(ExecutorC18229a.f171035a, new a(c15819p));
        if (c5508b != null) {
            c15819p.F(new C2751b(c5508b));
        }
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }
}
