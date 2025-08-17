package u1;

import androidx.compose.ui.text.TextLayoutInput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu1/c;", "", "Landroidx/compose/ui/text/v;", "textLayoutInput", "<init>", "(Landroidx/compose/ui/text/v;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/v;", "getTextLayoutInput", "()Landroidx/compose/ui/text/v;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17211c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutInput textLayoutInput;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17211c)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        C17211c c17211c = (C17211c) other;
        return Intrinsics.e(textLayoutInput.getText(), c17211c.textLayoutInput.getText()) && textLayoutInput.getStyle().G(c17211c.textLayoutInput.getStyle()) && Intrinsics.e(textLayoutInput.g(), c17211c.textLayoutInput.g()) && textLayoutInput.getMaxLines() == c17211c.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == c17211c.textLayoutInput.getSoftWrap() && F1.t.g(textLayoutInput.getOverflow(), c17211c.textLayoutInput.getOverflow()) && Intrinsics.e(textLayoutInput.getDensity(), c17211c.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == c17211c.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == c17211c.textLayoutInput.getFontFamilyResolver() && H1.b.f(textLayoutInput.getConstraints(), c17211c.textLayoutInput.getConstraints());
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        return (((((((((((((((((textLayoutInput.getText().hashCode() * 31) + textLayoutInput.getStyle().H()) * 31) + textLayoutInput.g().hashCode()) * 31) + textLayoutInput.getMaxLines()) * 31) + Boolean.hashCode(textLayoutInput.getSoftWrap())) * 31) + F1.t.h(textLayoutInput.getOverflow())) * 31) + textLayoutInput.getDensity().hashCode()) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + H1.b.o(textLayoutInput.getConstraints());
    }

    public C17211c(TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }
}
