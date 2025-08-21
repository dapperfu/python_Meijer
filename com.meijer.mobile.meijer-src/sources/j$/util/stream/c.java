package j$.util.stream;

import java.util.List;
import java.util.function.BinaryOperator;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        list.addAll((List) obj2);
        return list;
    }
}
