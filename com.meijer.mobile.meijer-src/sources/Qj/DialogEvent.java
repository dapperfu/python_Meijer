package Qj;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"LQj/b;", "", "Lbk/a;", "title", "message", "positiveButtonText", "negativeButtonText", "neutralButtonText", "<init>", "(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "d", "()Lbk/a;", "b", "c", "e", "getNeutralButtonText", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qj.b, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class DialogEvent {

    /* renamed from: f, reason: collision with root package name */
    public static final int f30991f = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a message;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a positiveButtonText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a negativeButtonText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a neutralButtonText;

    public DialogEvent(AbstractC6392a title, AbstractC6392a message, AbstractC6392a positiveButtonText, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2) {
        Intrinsics.j(title, "title");
        Intrinsics.j(message, "message");
        Intrinsics.j(positiveButtonText, "positiveButtonText");
        this.title = title;
        this.message = message;
        this.positiveButtonText = positiveButtonText;
        this.negativeButtonText = abstractC6392a;
        this.neutralButtonText = abstractC6392a2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogEvent)) {
            return false;
        }
        DialogEvent dialogEvent = (DialogEvent) other;
        return Intrinsics.e(this.title, dialogEvent.title) && Intrinsics.e(this.message, dialogEvent.message) && Intrinsics.e(this.positiveButtonText, dialogEvent.positiveButtonText) && Intrinsics.e(this.negativeButtonText, dialogEvent.negativeButtonText) && Intrinsics.e(this.neutralButtonText, dialogEvent.neutralButtonText);
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getMessage() {
        return this.message;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getNegativeButtonText() {
        return this.negativeButtonText;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getPositiveButtonText() {
        return this.positiveButtonText;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.positiveButtonText.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.negativeButtonText;
        int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
        AbstractC6392a abstractC6392a2 = this.neutralButtonText;
        return iHashCode2 + (abstractC6392a2 != null ? abstractC6392a2.hashCode() : 0);
    }

    public String toString() {
        return "DialogEvent(title=" + this.title + ", message=" + this.message + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ", neutralButtonText=" + this.neutralButtonText + ')';
    }

    public /* synthetic */ DialogEvent(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, AbstractC6392a abstractC6392a5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6392a, abstractC6392a2, abstractC6392a3, (i10 & 8) != 0 ? null : abstractC6392a4, (i10 & 16) != 0 ? null : abstractC6392a5);
    }
}
