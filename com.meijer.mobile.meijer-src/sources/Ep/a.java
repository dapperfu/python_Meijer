package Ep;

import j$.time.Year;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import zp.CustomerSavings;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"LEp/a;", "", "", "year", "Lzp/a;", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {
    Object b(int i10, Continuation<? super CustomerSavings> continuation);

    static /* synthetic */ Object c(a aVar, int i10, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSavingsForYear");
        }
        if ((i11 & 1) != 0) {
            i10 = Year.now().getValue();
        }
        return aVar.b(i10, continuation);
    }
}
