package Pj;

import Pj.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"", "LPj/a;", "a", "(Ljava/util/List;)LPj/a;", "", "key", "b", "(Ljava/util/List;Ljava/lang/String;)LPj/a;", "", "d", "(Ljava/util/List;Ljava/lang/String;)Z", "c", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class b {
    public static final a a(List<? extends a> list) {
        Object next;
        Intrinsics.j(list, "<this>");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((a) next) instanceof a.NotLoading)) {
                break;
            }
        }
        a aVar = (a) next;
        return aVar == null ? new a.NotLoading(null, 1, null) : aVar;
    }

    public static final a b(List<? extends a> list, String str) {
        Object next;
        Intrinsics.j(list, "<this>");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((a) next).getKey(), str)) {
                break;
            }
        }
        a aVar = (a) next;
        return aVar == null ? new a.NotLoading(null, 1, null) : aVar;
    }

    public static final boolean c(List<? extends a> list, String key) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(key, "key");
        return b(list, key) instanceof a.Failed;
    }

    public static final boolean d(List<? extends a> list, String key) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(key, "key");
        return b(list, key).getIsLoading();
    }
}
