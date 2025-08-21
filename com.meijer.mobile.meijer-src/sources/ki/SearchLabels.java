package ki;

import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001e"}, d2 = {"Lki/P0;", "", "Lki/q1$j;", "description", "label", "inverseLabel", "placeholder", "inversePlaceholder", "<init>", "(Lki/q1$j;Lki/q1$j;Lki/q1$j;Lki/q1$j;Lki/q1$j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$j;", "getDescription", "()Lki/q1$j;", "b", "getLabel", "c", "getInverseLabel", "d", "e", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.P0, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class SearchLabels {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label description;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label label;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label inverseLabel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label placeholder;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label inversePlaceholder;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchLabels)) {
            return false;
        }
        SearchLabels searchLabels = (SearchLabels) other;
        return Intrinsics.e(this.description, searchLabels.description) && Intrinsics.e(this.label, searchLabels.label) && Intrinsics.e(this.inverseLabel, searchLabels.inverseLabel) && Intrinsics.e(this.placeholder, searchLabels.placeholder) && Intrinsics.e(this.inversePlaceholder, searchLabels.inversePlaceholder);
    }

    public SearchLabels(q1.Label description, q1.Label label, q1.Label inverseLabel, q1.Label placeholder, q1.Label inversePlaceholder) {
        Intrinsics.j(description, "description");
        Intrinsics.j(label, "label");
        Intrinsics.j(inverseLabel, "inverseLabel");
        Intrinsics.j(placeholder, "placeholder");
        Intrinsics.j(inversePlaceholder, "inversePlaceholder");
        this.description = description;
        this.label = label;
        this.inverseLabel = inverseLabel;
        this.placeholder = placeholder;
        this.inversePlaceholder = inversePlaceholder;
    }

    /* renamed from: a, reason: from getter */
    public final q1.Label getInversePlaceholder() {
        return this.inversePlaceholder;
    }

    /* renamed from: b, reason: from getter */
    public final q1.Label getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        return (((((((this.description.hashCode() * 31) + this.label.hashCode()) * 31) + this.inverseLabel.hashCode()) * 31) + this.placeholder.hashCode()) * 31) + this.inversePlaceholder.hashCode();
    }

    public String toString() {
        return "SearchLabels(description=" + this.description + ", label=" + this.label + ", inverseLabel=" + this.inverseLabel + ", placeholder=" + this.placeholder + ", inversePlaceholder=" + this.inversePlaceholder + ')';
    }
}
