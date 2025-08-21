package rv;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.L0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lrv/r;", "", "factories", "Lmv/L0;", "e", "(Lrv/r;Ljava/util/List;)Lmv/L0;", "", "c", "(Lmv/L0;)Z", "", "cause", "", "errorHint", "Lrv/u;", "a", "(Ljava/lang/Throwable;Ljava/lang/String;)Lrv/u;", "", "d", "()Ljava/lang/Void;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16983t {
    private static final C16984u a(Throwable th2, String str) throws Throwable {
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ C16984u b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final boolean c(L0 l02) {
        return l02.U0() instanceof C16984u;
    }

    public static final L0 e(InterfaceC16981r interfaceC16981r, List<? extends InterfaceC16981r> list) {
        try {
            return interfaceC16981r.b(list);
        } catch (Throwable th2) {
            return a(th2, interfaceC16981r.a());
        }
    }
}
