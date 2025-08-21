package cr;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcr/f;", "", "", "imageRes", "Lbk/a;", "title", "description", "<init>", "(ILbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lbk/a;", "c", "()Lbk/a;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cr.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class HowSubscriptionWorksDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imageRes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a description;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HowSubscriptionWorksDetails)) {
            return false;
        }
        HowSubscriptionWorksDetails howSubscriptionWorksDetails = (HowSubscriptionWorksDetails) other;
        return this.imageRes == howSubscriptionWorksDetails.imageRes && Intrinsics.e(this.title, howSubscriptionWorksDetails.title) && Intrinsics.e(this.description, howSubscriptionWorksDetails.description);
    }

    public HowSubscriptionWorksDetails(int i10, AbstractC6392a title, AbstractC6392a description) {
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        this.imageRes = i10;
        this.title = title;
        this.description = description;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final int getImageRes() {
        return this.imageRes;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.imageRes) * 31) + this.title.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "HowSubscriptionWorksDetails(imageRes=" + this.imageRes + ", title=" + this.title + ", description=" + this.description + ')';
    }
}
