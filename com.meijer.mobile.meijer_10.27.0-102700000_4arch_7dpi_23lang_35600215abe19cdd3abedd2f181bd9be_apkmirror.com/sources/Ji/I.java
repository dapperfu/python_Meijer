package Ji;

import androidx.compose.ui.text.TextStyle;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"LJi/I;", "", "Landroidx/compose/ui/text/z;", "getStyle", "()Landroidx/compose/ui/text/z;", "LJi/T;", "colorOverride", "d", "(LJi/T;)LJi/I;", "Ly1/B;", "weightOverride", "f", "(Ly1/B;)LJi/I;", "LH1/v;", "sizeOverride", "e", "(J)LJi/I;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface I {
    TextStyle getStyle();

    default I d(final T colorOverride) {
        Intrinsics.j(colorOverride, "colorOverride");
        return new I() { // from class: Ji.F
            @Override // Ji.I
            public final TextStyle getStyle() {
                return I.g(this.f15679a, colorOverride);
            }
        };
    }

    default I e(final long sizeOverride) {
        return new I() { // from class: Ji.G
            @Override // Ji.I
            public final TextStyle getStyle() {
                return I.h(this.f15681a, sizeOverride);
            }
        };
    }

    default I f(final FontWeight weightOverride) {
        Intrinsics.j(weightOverride, "weightOverride");
        return new I() { // from class: Ji.H
            @Override // Ji.I
            public final TextStyle getStyle() {
                return I.i(this.f15683a, weightOverride);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static TextStyle g(I i10, T t10) {
        return TextStyle.c(i10.getStyle(), t10.getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static TextStyle h(I i10, long j10) {
        return TextStyle.c(i10.getStyle(), 0L, j10, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static TextStyle i(I i10, FontWeight fontWeight) {
        return TextStyle.c(i10.getStyle(), 0L, 0L, fontWeight, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
    }
}
