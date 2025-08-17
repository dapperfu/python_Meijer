package cr;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcr/e;", "", "Lak/a;", "question", "answer", "<init>", "(Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "b", "()Lak/a;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cr.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class FaqList {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a question;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a answer;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaqList)) {
            return false;
        }
        FaqList faqList = (FaqList) other;
        return Intrinsics.e(this.question, faqList.question) && Intrinsics.e(this.answer, faqList.answer);
    }

    public FaqList(AbstractC5607a question, AbstractC5607a answer) {
        Intrinsics.j(question, "question");
        Intrinsics.j(answer, "answer");
        this.question = question;
        this.answer = answer;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getAnswer() {
        return this.answer;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return (this.question.hashCode() * 31) + this.answer.hashCode();
    }

    public String toString() {
        return "FaqList(question=" + this.question + ", answer=" + this.answer + ')';
    }
}
