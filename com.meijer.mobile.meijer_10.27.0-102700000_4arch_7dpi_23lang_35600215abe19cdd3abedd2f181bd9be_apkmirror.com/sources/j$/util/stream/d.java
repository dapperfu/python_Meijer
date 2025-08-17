package j$.util.stream;

import j$.desugar.sun.nio.fs.g;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return g.o(((List) obj).toArray());
    }
}
