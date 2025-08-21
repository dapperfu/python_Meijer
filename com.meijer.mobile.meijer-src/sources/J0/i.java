package J0;

import Z.J;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\t\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "", "", "a", "b", "", "d", "(Ljava/util/List;II)V", "LZ/J;", "c", "(LZ/J;II)V", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(J j10, int i10, int i11) {
        int iE = j10.e(i10);
        j10.p(i10, j10.e(i11));
        j10.p(i11, iE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void d(List<T> list, int i10, int i11) {
        T t10 = list.get(i10);
        list.set(i10, list.get(i11));
        list.set(i11, t10);
    }
}
