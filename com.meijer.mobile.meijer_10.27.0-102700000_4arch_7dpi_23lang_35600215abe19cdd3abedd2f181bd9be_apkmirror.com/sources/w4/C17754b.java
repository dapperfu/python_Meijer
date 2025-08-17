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
import z4.InterfaceC18380b;

@Metadata(d1 = {"w4/c", "w4/d"}, d2 = {}, k = 4, mv = {2, 0, 0}, xi = 48)
/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17754b {
    @Deprecated
    public static final CancellationSignal a() {
        return C17756d.a();
    }

    @Deprecated
    public static final void b(A4.c cVar) {
        C17756d.b(cVar);
    }

    public static final void c(InterfaceC18380b interfaceC18380b) {
        C17755c.a(interfaceC18380b);
    }

    public static final Object d(G g10, boolean z10, Continuation<? super CoroutineContext> continuation) {
        return C17756d.c(g10, z10, continuation);
    }

    public static final <R> R e(G g10, boolean z10, boolean z11, Function1<? super InterfaceC18380b, ? extends R> function1) {
        return (R) C17756d.d(g10, z10, z11, function1);
    }

    public static final <R> Object f(G g10, boolean z10, boolean z11, Function1<? super InterfaceC18380b, ? extends R> function1, Continuation<? super R> continuation) {
        return C17756d.e(g10, z10, z11, function1, continuation);
    }

    public static final Cursor g(G g10, A4.f fVar, boolean z10, CancellationSignal cancellationSignal) {
        return C17756d.f(g10, fVar, z10, cancellationSignal);
    }

    public static final int h(File file) throws IOException {
        return C17756d.g(file);
    }
}
