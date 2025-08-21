package ki;

import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"Lki/S0;", "", "Lki/q1$d$c;", "dismiss", "Lki/q1$h$b;", "dismissIcon", "mainCTA", "cancel", "Lki/q1$j;", "mainCTAText", "cancelText", "<init>", "(Lki/q1$d$c;Lki/q1$h$b;Lki/q1$d$c;Lki/q1$d$c;Lki/q1$j;Lki/q1$j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$d$c;", "c", "()Lki/q1$d$c;", "b", "Lki/q1$h$b;", "d", "()Lki/q1$h$b;", "e", "Lki/q1$j;", "f", "()Lki/q1$j;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.S0, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class ModalButtons {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.d.ModalButton dismiss;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon dismissIcon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.d.ModalButton mainCTA;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.d.ModalButton cancel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label mainCTAText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label cancelText;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalButtons)) {
            return false;
        }
        ModalButtons modalButtons = (ModalButtons) other;
        return Intrinsics.e(this.dismiss, modalButtons.dismiss) && Intrinsics.e(this.dismissIcon, modalButtons.dismissIcon) && Intrinsics.e(this.mainCTA, modalButtons.mainCTA) && Intrinsics.e(this.cancel, modalButtons.cancel) && Intrinsics.e(this.mainCTAText, modalButtons.mainCTAText) && Intrinsics.e(this.cancelText, modalButtons.cancelText);
    }

    public ModalButtons(q1.d.ModalButton dismiss, q1.h.DrawableIcon dismissIcon, q1.d.ModalButton mainCTA, q1.d.ModalButton cancel, q1.Label mainCTAText, q1.Label cancelText) {
        Intrinsics.j(dismiss, "dismiss");
        Intrinsics.j(dismissIcon, "dismissIcon");
        Intrinsics.j(mainCTA, "mainCTA");
        Intrinsics.j(cancel, "cancel");
        Intrinsics.j(mainCTAText, "mainCTAText");
        Intrinsics.j(cancelText, "cancelText");
        this.dismiss = dismiss;
        this.dismissIcon = dismissIcon;
        this.mainCTA = mainCTA;
        this.cancel = cancel;
        this.mainCTAText = mainCTAText;
        this.cancelText = cancelText;
    }

    /* renamed from: a, reason: from getter */
    public final q1.d.ModalButton getCancel() {
        return this.cancel;
    }

    /* renamed from: b, reason: from getter */
    public final q1.Label getCancelText() {
        return this.cancelText;
    }

    /* renamed from: c, reason: from getter */
    public final q1.d.ModalButton getDismiss() {
        return this.dismiss;
    }

    /* renamed from: d, reason: from getter */
    public final q1.h.DrawableIcon getDismissIcon() {
        return this.dismissIcon;
    }

    /* renamed from: e, reason: from getter */
    public final q1.d.ModalButton getMainCTA() {
        return this.mainCTA;
    }

    /* renamed from: f, reason: from getter */
    public final q1.Label getMainCTAText() {
        return this.mainCTAText;
    }

    public int hashCode() {
        return (((((((((this.dismiss.hashCode() * 31) + this.dismissIcon.hashCode()) * 31) + this.mainCTA.hashCode()) * 31) + this.cancel.hashCode()) * 31) + this.mainCTAText.hashCode()) * 31) + this.cancelText.hashCode();
    }

    public String toString() {
        return "ModalButtons(dismiss=" + this.dismiss + ", dismissIcon=" + this.dismissIcon + ", mainCTA=" + this.mainCTA + ", cancel=" + this.cancel + ", mainCTAText=" + this.mainCTAText + ", cancelText=" + this.cancelText + ')';
    }
}
