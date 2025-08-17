package l0;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll0/n;", "", "a", "(Ll0/n;)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class o {
    public static final int a(n nVar) {
        List<InterfaceC15349i> listH = nVar.h();
        int size = listH.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            size2 += listH.get(i10).getSize();
        }
        return (size2 / listH.size()) + nVar.g();
    }
}
