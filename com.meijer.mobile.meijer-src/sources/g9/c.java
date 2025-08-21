package g9;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0004\b\r\u0010\u0007J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lg9/c;", "T", "S", "", "item", "", "add", "(Ljava/lang/Object;)V", "Lg9/d;", "specification", "", "a", "(Ljava/lang/Object;Lg9/d;)I", "remove", "", "b", "(Ljava/lang/Object;)Ljava/util/List;", "", "isEmpty", "()Z", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c<T, S> {
    int a(T item, d specification);

    void add(T item);

    List<T> b(S specification);

    boolean isEmpty();

    void remove(S specification);
}
