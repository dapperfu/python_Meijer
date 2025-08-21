package d0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.InterfaceC5956j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J6\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Ld0/J;", "", "LU0/f;", "delta", "Lf1/e;", "source", "Lkotlin/Function1;", "performScroll", "b", "(JILkotlin/jvm/functions/Function1;)J", "LH1/y;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "performFling", "", "c", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "()Z", "isInProgress", "Landroidx/compose/ui/node/j;", "A", "()Landroidx/compose/ui/node/j;", "node", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface J {
    boolean a();

    long b(long delta, int source, Function1<? super U0.f, U0.f> performScroll);

    Object c(long j10, Function2<? super H1.y, ? super Continuation<? super H1.y>, ? extends Object> function2, Continuation<? super Unit> continuation);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"d0/J$a", "Landroidx/compose/ui/Modifier$c;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Modifier.c {
        a() {
        }
    }

    default InterfaceC5956j A() {
        return new a();
    }
}
