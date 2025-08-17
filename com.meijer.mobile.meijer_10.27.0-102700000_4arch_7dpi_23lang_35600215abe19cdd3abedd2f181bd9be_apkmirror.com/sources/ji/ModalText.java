package ji;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lji/U0;", "", "Lji/q1$j;", "heading", "body", "<init>", "(Lji/q1$j;Lji/q1$j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$j;", "b", "()Lji/q1$j;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.U0, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class ModalText {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label heading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label body;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalText)) {
            return false;
        }
        ModalText modalText = (ModalText) other;
        return Intrinsics.e(this.heading, modalText.heading) && Intrinsics.e(this.body, modalText.body);
    }

    public ModalText(q1.Label heading, q1.Label body) {
        Intrinsics.j(heading, "heading");
        Intrinsics.j(body, "body");
        this.heading = heading;
        this.body = body;
    }

    /* renamed from: a, reason: from getter */
    public final q1.Label getBody() {
        return this.body;
    }

    /* renamed from: b, reason: from getter */
    public final q1.Label getHeading() {
        return this.heading;
    }

    public int hashCode() {
        return (this.heading.hashCode() * 31) + this.body.hashCode();
    }

    public String toString() {
        return "ModalText(heading=" + this.heading + ", body=" + this.body + ')';
    }
}
