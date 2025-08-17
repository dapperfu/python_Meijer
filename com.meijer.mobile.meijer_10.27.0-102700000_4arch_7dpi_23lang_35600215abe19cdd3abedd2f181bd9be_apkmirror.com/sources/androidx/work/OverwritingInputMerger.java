package androidx.work;

import N4.AbstractC4324l;
import androidx.work.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "LN4/l;", "<init>", "()V", "", "Landroidx/work/b;", "inputs", "a", "(Ljava/util/List;)Landroidx/work/b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverwritingInputMerger extends AbstractC4324l {
    @Override // N4.AbstractC4324l
    public b a(List<b> inputs) {
        Intrinsics.j(inputs, "inputs");
        b.a aVar = new b.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<b> it = inputs.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(it.next().d());
        }
        aVar.d(linkedHashMap);
        return aVar.a();
    }
}
