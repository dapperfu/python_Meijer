package mv;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lmv/x;", "Lkotlin/Result;", "result", "", "c", "(Lmv/x;Ljava/lang/Object;)Z", "Lmv/C0;", "parent", "a", "(Lmv/C0;)Lmv/x;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mv.z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15839z {
    public static final <T> InterfaceC15835x<T> a(C0 c02) {
        return new C15837y(c02);
    }

    public static /* synthetic */ InterfaceC15835x b(C0 c02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c02 = null;
        }
        return a(c02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean c(InterfaceC15835x<T> interfaceC15835x, Object obj) {
        Throwable thE = Result.e(obj);
        if (thE == null) {
            return interfaceC15835x.b0(obj);
        }
        return interfaceC15835x.c(thE);
    }
}
