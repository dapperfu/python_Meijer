package rv;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\t"}, d2 = {"Lrv/j;", "E", "", "holder", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "element", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* renamed from: rv.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16973j<E> {
    public static <E> Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e10) {
        if (obj == null) {
            return a(e10);
        }
        if (obj instanceof ArrayList) {
            Intrinsics.h(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(e10);
            return a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e10);
        return a(arrayList);
    }
}
