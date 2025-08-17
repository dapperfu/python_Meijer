package qv;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lqv/x;", "Lkotlin/Result;", "result", "", "c", "(Lqv/x;Ljava/lang/Object;)Z", "Lqv/C0;", "parent", "a", "(Lqv/C0;)Lqv/x;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C16678z {
    public static final <T> InterfaceC16674x<T> a(C0 c02) {
        return new C16676y(c02);
    }

    public static /* synthetic */ InterfaceC16674x b(C0 c02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c02 = null;
        }
        return a(c02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean c(InterfaceC16674x<T> interfaceC16674x, Object obj) {
        Throwable thE = Result.e(obj);
        if (thE == null) {
            return interfaceC16674x.Z(obj);
        }
        return interfaceC16674x.c(thE);
    }
}
