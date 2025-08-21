package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0088\u0001\u0005\u0092\u0001\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/y1;", "T", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "backing", "b", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "value", "", "j", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "i", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "g", "", "index", "h", "(Ljava/util/ArrayList;I)Ljava/lang/Object;", "e", "(Ljava/util/ArrayList;)Z", "f", "", "a", "(Ljava/util/ArrayList;)V", "", "k", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "d", "(Ljava/util/ArrayList;)I", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class y1<T> {
    public static <T> ArrayList<T> b(ArrayList<T> arrayList) {
        return arrayList;
    }

    public static /* synthetic */ ArrayList c(ArrayList arrayList, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return b(arrayList);
    }

    public static final void a(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    public static final int d(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    public static final boolean e(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    public static final boolean f(ArrayList<T> arrayList) {
        return !e(arrayList);
    }

    public static final T g(ArrayList<T> arrayList) {
        return arrayList.get(d(arrayList) - 1);
    }

    public static final T h(ArrayList<T> arrayList, int i10) {
        return arrayList.get(i10);
    }

    public static final T i(ArrayList<T> arrayList) {
        return arrayList.remove(d(arrayList) - 1);
    }

    public static final boolean j(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }

    public static final T[] k(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = arrayList.get(i10);
        }
        return tArr;
    }
}
