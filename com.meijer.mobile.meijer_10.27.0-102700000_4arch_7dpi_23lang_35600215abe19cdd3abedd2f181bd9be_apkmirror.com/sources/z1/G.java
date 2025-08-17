package z1;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lz1/G;", "Lz1/W;", "", "mask", "<init>", "(C)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Lz1/U;", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Lz1/U;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "C", "getMask", "()C", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class G implements W {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final char mask;

    public G() {
        this((char) 0, 1, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof G) && this.mask == ((G) other).mask;
    }

    public G(char c10) {
        this.mask = c10;
    }

    @Override // z1.W
    public TransformedText a(AnnotatedString text) {
        return new TransformedText(new AnnotatedString(StringsKt.M(String.valueOf(this.mask), text.getText().length()), null, 2, null), InterfaceC18354E.INSTANCE.a());
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }

    public /* synthetic */ G(char c10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? (char) 8226 : c10);
    }
}
