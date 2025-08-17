package f1;

import H1.y;
import U0.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lf1/a;", "", "LU0/f;", "available", "Lf1/e;", "source", "E1", "(JI)J", "consumed", "L0", "(JJI)J", "LH1/y;", "M1", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b0", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC13828a {
    static /* synthetic */ Object R0(InterfaceC13828a interfaceC13828a, long j10, Continuation<? super y> continuation) {
        return y.b(y.INSTANCE.a());
    }

    static /* synthetic */ Object y0(InterfaceC13828a interfaceC13828a, long j10, long j11, Continuation<? super y> continuation) {
        return y.b(y.INSTANCE.a());
    }

    default long E1(long available, int source) {
        return f.INSTANCE.c();
    }

    default long L0(long consumed, long available, int source) {
        return f.INSTANCE.c();
    }

    default Object M1(long j10, Continuation<? super y> continuation) {
        return R0(this, j10, continuation);
    }

    default Object b0(long j10, long j11, Continuation<? super y> continuation) {
        return y0(this, j10, j11, continuation);
    }
}
