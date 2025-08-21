package cr;

import bk.AbstractC6392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcr/d;", "", "Lbk/a;", "title", "", "Lcr/e;", "questions", "<init>", "(Lbk/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "b", "()Lbk/a;", "Ljava/util/List;", "()Ljava/util/List;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cr.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class FaqDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FaqList> questions;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaqDetails)) {
            return false;
        }
        FaqDetails faqDetails = (FaqDetails) other;
        return Intrinsics.e(this.title, faqDetails.title) && Intrinsics.e(this.questions, faqDetails.questions);
    }

    public FaqDetails(AbstractC6392a title, List<FaqList> questions) {
        Intrinsics.j(title, "title");
        Intrinsics.j(questions, "questions");
        this.title = title;
        this.questions = questions;
    }

    public final List<FaqList> a() {
        return this.questions;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.questions.hashCode();
    }

    public String toString() {
        return "FaqDetails(title=" + this.title + ", questions=" + this.questions + ')';
    }
}
