package qv;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lqv/R0;", "T", "Lqv/G0;", "Lqv/p;", "continuation", "<init>", "(Lqv/p;)V", "", "cause", "", "w", "(Ljava/lang/Throwable;)V", "e", "Lqv/p;", "", "v", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class R0<T> extends G0 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C16658p<T> continuation;

    @Override // qv.G0
    public boolean v() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public R0(C16658p<? super T> c16658p) {
        this.continuation = c16658p;
    }

    @Override // qv.G0
    public void w(Throwable cause) {
        Object objU0 = u().u0();
        if (objU0 instanceof C16610C) {
            C16658p<T> c16658p = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            c16658p.resumeWith(Result.b(ResultKt.a(((C16610C) objU0).cause)));
        } else {
            C16658p<T> c16658p2 = this.continuation;
            Result.Companion companion2 = Result.INSTANCE;
            c16658p2.resumeWith(Result.b(I0.h(objU0)));
        }
    }
}
