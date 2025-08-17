package Dh;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "LDh/o;", "LDh/p;", "preferenceKey", "", "b", "(Ljava/util/List;LDh/p;)Z", "a", "(Ljava/util/List;LDh/p;)LDh/o;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class q {
    public static final Preference a(List<Preference> list, p preferenceKey) {
        Object next;
        Intrinsics.j(list, "<this>");
        Intrinsics.j(preferenceKey, "preferenceKey");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Preference) next).getPreferenceKey() == preferenceKey) {
                break;
            }
        }
        return (Preference) next;
    }

    public static final boolean b(List<Preference> list, p preferenceKey) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(preferenceKey, "preferenceKey");
        Preference preferenceA = a(list, preferenceKey);
        if (preferenceA != null) {
            return preferenceA.getIsEnabled();
        }
        return false;
    }
}
