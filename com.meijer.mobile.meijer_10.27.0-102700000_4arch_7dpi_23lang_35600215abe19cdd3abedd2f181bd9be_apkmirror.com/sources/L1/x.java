package L1;

import L1.k;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"LL1/x;", "", "LL1/k$b;", "anchor", "LH1/h;", "margin", "goneMargin", "", "a", "(LL1/k$b;FF)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface x {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(x xVar, k.HorizontalAnchor horizontalAnchor, float f10, float f11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if ((i10 & 2) != 0) {
                f10 = H1.h.p(0);
            }
            if ((i10 & 4) != 0) {
                f11 = H1.h.p(0);
            }
            xVar.a(horizontalAnchor, f10, f11);
        }
    }

    void a(k.HorizontalAnchor anchor, float margin, float goneMargin);
}
