package e0;

import H1.n;
import H1.t;
import androidx.compose.ui.window.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Le0/e;", "Landroidx/compose/ui/window/p;", "LH1/n;", "localPosition", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LH1/p;", "anchorBounds", "LH1/r;", "windowSize", "LH1/t;", "layoutDirection", "popupContentSize", "a", "(LH1/p;JLH1/t;J)J", "J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13598e implements p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long localPosition;

    public /* synthetic */ C13598e(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    private C13598e(long j10) {
        this.localPosition = j10;
    }

    @Override // androidx.compose.ui.window.p
    public long a(H1.p anchorBounds, long windowSize, t layoutDirection, long popupContentSize) {
        boolean z10;
        int left = anchorBounds.getLeft() + n.k(this.localPosition);
        int i10 = (int) (popupContentSize >> 32);
        int i11 = (int) (windowSize >> 32);
        if (layoutDirection == t.f12006a) {
            z10 = true;
        } else {
            z10 = false;
        }
        return n.f((C13599f.b(left, i10, i11, z10) << 32) | (C13599f.c(anchorBounds.getTop() + n.l(this.localPosition), (int) (popupContentSize & 4294967295L), (int) (windowSize & 4294967295L), false, 8, null) & 4294967295L));
    }
}
