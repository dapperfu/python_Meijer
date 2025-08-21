package w4;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.G;
import java.io.File;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"w4/c", "w4/d"}, d2 = {}, k = 4, mv = {2, 0, 0}, xi = 48)
/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17824b {
    @Deprecated
    public static final CancellationSignal a() {
        return C17826d.a();
    }

    public static final void b(A4.b bVar) {
        C17825c.a(bVar);
    }

    @Deprecated
    public static final void c(B4.c cVar) {
        C17826d.b(cVar);
    }

    public static final Object d(G g10, boolean z10, Continuation<? super CoroutineContext> continuation) {
        return C17826d.c(g10, z10, continuation);
    }

    public static final <R> R e(G g10, boolean z10, boolean z11, Function1<? super A4.b, ? extends R> function1) {
        return (R) C17826d.d(g10, z10, z11, function1);
    }

    public static final <R> Object f(G g10, boolean z10, boolean z11, Function1<? super A4.b, ? extends R> function1, Continuation<? super R> continuation) {
        return C17826d.e(g10, z10, z11, function1, continuation);
    }

    public static final Cursor g(G g10, B4.f fVar, boolean z10, CancellationSignal cancellationSignal) {
        return C17826d.f(g10, fVar, z10, cancellationSignal);
    }

    public static final int h(File file) throws IOException {
        return C17826d.g(file);
    }
}
