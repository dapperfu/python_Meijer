package Ki;

import androidx.compose.ui.text.TextStyle;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"LKi/I;", "", "Landroidx/compose/ui/text/z;", "getStyle", "()Landroidx/compose/ui/text/z;", "LKi/T;", "colorOverride", "d", "(LKi/T;)LKi/I;", "Ly1/B;", "weightOverride", "g", "(Ly1/B;)LKi/I;", "LH1/v;", "sizeOverride", "c", "(J)LKi/I;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface I {
    TextStyle getStyle();

    default I c(final long sizeOverride) {
        return new I() { // from class: Ki.G
            @Override // Ki.I
            public final TextStyle getStyle() {
                return I.f(this.f17225a, sizeOverride);
            }
        };
    }

    default I d(final T colorOverride) {
        Intrinsics.j(colorOverride, "colorOverride");
        return new I() { // from class: Ki.F
            @Override // Ki.I
            public final TextStyle getStyle() {
                return I.b(this.f17223a, colorOverride);
            }
        };
    }

    default I g(final FontWeight weightOverride) {
        Intrinsics.j(weightOverride, "weightOverride");
        return new I() { // from class: Ki.H
            @Override // Ki.I
            public final TextStyle getStyle() {
                return I.a(this.f17227a, weightOverride);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static TextStyle a(I i10, FontWeight fontWeight) {
        return TextStyle.c(i10.getStyle(), 0L, 0L, fontWeight, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static TextStyle b(I i10, T t10) {
        return TextStyle.c(i10.getStyle(), t10.getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static TextStyle f(I i10, long j10) {
        return TextStyle.c(i10.getStyle(), 0L, j10, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
    }
}
