package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutCoordinates;
import com.fullstory.instrumentation.frameworks.compose.FSComposeRect;
import j1.C14920a;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005J\"\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0010H&¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006(À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "", "LU0/f;", "relativeToScreen", "q", "(J)J", "relativeToLocal", "s", "relativeToWindow", "N", "X", "r0", "sourceCoordinates", "relativeToSource", "J", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "", "includeMotionFrameOfReference", "F", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "b0", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "LV0/k1;", "matrix", "", "O", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "a0", "([F)V", "LH1/r;", "c", "()J", "size", "n0", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "isAttached", "()Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LayoutCoordinates extends FSComposeLayoutCoordinates {
    long J(LayoutCoordinates sourceCoordinates, long relativeToSource);

    long N(long relativeToWindow);

    long X(long relativeToLocal);

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutCoordinates
    default FSComposeRect _fsGetBoundsInParent() {
        Rect rectBoundsInParent = LayoutCoordinatesKt.boundsInParent(this);
        if (rectBoundsInParent instanceof FSComposeRect) {
            return rectBoundsInParent;
        }
        return null;
    }

    Rect b0(LayoutCoordinates sourceCoordinates, boolean clipBounds);

    long c();

    boolean isAttached();

    LayoutCoordinates n0();

    long r0(long relativeToLocal);

    static /* synthetic */ Rect I(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return layoutCoordinates.b0(layoutCoordinates2, z10);
    }

    default long F(LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    default void O(LayoutCoordinates sourceCoordinates, float[] matrix) {
        C14920a.e("transformFrom is not implemented on this LayoutCoordinates");
    }

    default void a0(float[] matrix) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    default long q(long relativeToScreen) {
        return U0.f.INSTANCE.b();
    }

    default long s(long relativeToLocal) {
        return U0.f.INSTANCE.b();
    }
}
