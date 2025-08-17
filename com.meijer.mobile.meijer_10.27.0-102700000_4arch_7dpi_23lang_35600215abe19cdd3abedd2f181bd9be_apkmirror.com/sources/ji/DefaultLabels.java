package ji;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lji/A0;", "", "Lji/q1$j;", "description", "infoBlockMessage", "label", "placeholder", "<init>", "(Lji/q1$j;Lji/q1$j;Lji/q1$j;Lji/q1$j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$j;", "()Lji/q1$j;", "b", "c", "d", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.A0, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class DefaultLabels {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label description;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label infoBlockMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label placeholder;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultLabels)) {
            return false;
        }
        DefaultLabels defaultLabels = (DefaultLabels) other;
        return Intrinsics.e(this.description, defaultLabels.description) && Intrinsics.e(this.infoBlockMessage, defaultLabels.infoBlockMessage) && Intrinsics.e(this.label, defaultLabels.label) && Intrinsics.e(this.placeholder, defaultLabels.placeholder);
    }

    public DefaultLabels(q1.Label description, q1.Label infoBlockMessage, q1.Label label, q1.Label placeholder) {
        Intrinsics.j(description, "description");
        Intrinsics.j(infoBlockMessage, "infoBlockMessage");
        Intrinsics.j(label, "label");
        Intrinsics.j(placeholder, "placeholder");
        this.description = description;
        this.infoBlockMessage = infoBlockMessage;
        this.label = label;
        this.placeholder = placeholder;
    }

    /* renamed from: a, reason: from getter */
    public final q1.Label getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final q1.Label getInfoBlockMessage() {
        return this.infoBlockMessage;
    }

    /* renamed from: c, reason: from getter */
    public final q1.Label getLabel() {
        return this.label;
    }

    /* renamed from: d, reason: from getter */
    public final q1.Label getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        return (((((this.description.hashCode() * 31) + this.infoBlockMessage.hashCode()) * 31) + this.label.hashCode()) * 31) + this.placeholder.hashCode();
    }

    public String toString() {
        return "DefaultLabels(description=" + this.description + ", infoBlockMessage=" + this.infoBlockMessage + ", label=" + this.label + ", placeholder=" + this.placeholder + ')';
    }
}
