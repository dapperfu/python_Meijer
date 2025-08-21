package ki;

import androidx.compose.ui.Modifier;
import f1.InterfaceC13938a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0005\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "disabled", "a", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "ki/r1$a", "Lki/r1$a;", "HorizontalScrollConsumer", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f142446a = new a();

    public static /* synthetic */ Modifier b(Modifier modifier, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return a(modifier, z10);
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"ki/r1$a", "Lf1/a;", "LU0/f;", "available", "Lf1/e;", "source", "E1", "(JI)J", "LH1/y;", "M1", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements InterfaceC13938a {
        @Override // f1.InterfaceC13938a
        public long E1(long available, int source) {
            return U0.f.g(available, 0.0f, 0.0f, 1, null);
        }

        @Override // f1.InterfaceC13938a
        public Object M1(long j10, Continuation<? super H1.y> continuation) {
            return H1.y.b(H1.y.e(j10, 0.0f, 0.0f, 1, null));
        }

        a() {
        }
    }

    public static final Modifier a(Modifier modifier, boolean z10) {
        Intrinsics.j(modifier, "<this>");
        return z10 ? androidx.compose.ui.input.nestedscroll.a.b(modifier, f142446a, null, 2, null) : modifier;
    }
}
