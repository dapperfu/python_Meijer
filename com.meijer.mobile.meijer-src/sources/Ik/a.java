package Ik;

import Ik.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R$\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"LIk/a;", "T", "", "", "LIk/b;", "a", "()Ljava/util/List;", "validations", "LIk/c;", "d", "errors", "", "isValid", "()Z", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public interface a<T> {
    List<Validation<? extends Object>> a();

    default List<c> d() {
        d.Failures failures;
        List<Validation<? extends Object>> listA = a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            d result = ((Validation) it.next()).getResult();
            if (result instanceof d.Failures) {
                failures = (d.Failures) result;
            } else {
                failures = null;
            }
            if (failures != null) {
                arrayList.add(failures);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CollectionsKt.C(arrayList2, ((d.Failures) it2.next()).a());
        }
        return arrayList2;
    }

    default boolean isValid() {
        List<Validation<? extends Object>> listA = a();
        if ((listA instanceof Collection) && listA.isEmpty()) {
            return true;
        }
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            if (!(((Validation) it.next()).getResult() instanceof d.c)) {
                return false;
            }
        }
        return true;
    }
}
