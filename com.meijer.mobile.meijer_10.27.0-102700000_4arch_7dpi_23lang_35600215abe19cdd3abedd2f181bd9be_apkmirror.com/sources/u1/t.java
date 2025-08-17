package u1;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import u1.t;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lu1/t;", "", "Landroidx/compose/ui/geometry/Rect;", "textBounds", "rect", "", "a", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)Z", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f162623a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lu1/t$a;", "", "<init>", "()V", "Lu1/t;", "b", "Lu1/t;", "g", "()Lu1/t;", "AnyOverlap", "c", "getContainsAll", "ContainsAll", "d", "h", "ContainsCenter", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u1.t$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f162623a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final t AnyOverlap = new t() { // from class: u1.q
            @Override // u1.t
            public final boolean a(Rect rect, Rect rect2) {
                return t.Companion.d(rect, rect2);
            }
        };

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final t ContainsAll = new t() { // from class: u1.r
            @Override // u1.t
            public final boolean a(Rect rect, Rect rect2) {
                return t.Companion.e(rect, rect2);
            }
        };

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final t ContainsCenter = new t() { // from class: u1.s
            @Override // u1.t
            public final boolean a(Rect rect, Rect rect2) {
                return t.Companion.f(rect, rect2);
            }
        };

        public final t g() {
            return AnyOverlap;
        }

        public final t h() {
            return ContainsCenter;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(Rect rect, Rect rect2) {
            return rect.r(rect2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(Rect rect, Rect rect2) {
            if (!rect2.q() && rect.getLeft() >= rect2.getLeft() && rect.l() <= rect2.l() && rect.getTop() >= rect2.getTop() && rect.i() <= rect2.i()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(Rect rect, Rect rect2) {
            return rect2.f(rect.k());
        }
    }

    boolean a(Rect textBounds, Rect rect);
}
