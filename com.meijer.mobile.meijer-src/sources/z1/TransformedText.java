package z1;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lz1/U;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Lz1/E;", "offsetMapping", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Lz1/E;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "b", "()Landroidx/compose/ui/text/AnnotatedString;", "Lz1/E;", "()Lz1/E;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z1.U, reason: from toString */
/* loaded from: classes2.dex */
public final class TransformedText {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnnotatedString text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC18417E offsetMapping;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) other;
        return Intrinsics.e(this.text, transformedText.text) && Intrinsics.e(this.offsetMapping, transformedText.offsetMapping);
    }

    /* renamed from: a, reason: from getter */
    public final InterfaceC18417E getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: b, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
    }

    public TransformedText(AnnotatedString annotatedString, InterfaceC18417E interfaceC18417E) {
        this.text = annotatedString;
        this.offsetMapping = interfaceC18417E;
    }
}
