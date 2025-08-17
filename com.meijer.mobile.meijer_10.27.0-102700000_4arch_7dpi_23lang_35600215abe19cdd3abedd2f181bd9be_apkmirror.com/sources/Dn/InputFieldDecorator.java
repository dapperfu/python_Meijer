package Dn;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LDn/H;", "", "Lak/a;", "label", "", "value", "errorMessage", "", "shouldShowError", "<init>", "(Lak/a;Ljava/lang/String;Lak/a;Z)V", "a", "(Lak/a;Ljava/lang/String;Lak/a;Z)LDn/H;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lak/a;", "d", "()Lak/a;", "b", "Ljava/lang/String;", "e", "c", "Z", "getShouldShowError", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dn.H, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class InputFieldDecorator {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6795e = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a label;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a errorMessage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowError;

    public InputFieldDecorator(AbstractC5607a label, String str, AbstractC5607a abstractC5607a, boolean z10) {
        Intrinsics.j(label, "label");
        this.label = label;
        this.value = str;
        this.errorMessage = abstractC5607a;
        this.shouldShowError = z10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFieldDecorator)) {
            return false;
        }
        InputFieldDecorator inputFieldDecorator = (InputFieldDecorator) other;
        return Intrinsics.e(this.label, inputFieldDecorator.label) && Intrinsics.e(this.value, inputFieldDecorator.value) && Intrinsics.e(this.errorMessage, inputFieldDecorator.errorMessage) && this.shouldShowError == inputFieldDecorator.shouldShowError;
    }

    public static /* synthetic */ InputFieldDecorator b(InputFieldDecorator inputFieldDecorator, AbstractC5607a abstractC5607a, String str, AbstractC5607a abstractC5607a2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC5607a = inputFieldDecorator.label;
        }
        if ((i10 & 2) != 0) {
            str = inputFieldDecorator.value;
        }
        if ((i10 & 4) != 0) {
            abstractC5607a2 = inputFieldDecorator.errorMessage;
        }
        if ((i10 & 8) != 0) {
            z10 = inputFieldDecorator.shouldShowError;
        }
        return inputFieldDecorator.a(abstractC5607a, str, abstractC5607a2, z10);
    }

    public final InputFieldDecorator a(AbstractC5607a label, String value, AbstractC5607a errorMessage, boolean shouldShowError) {
        Intrinsics.j(label, "label");
        return new InputFieldDecorator(label, value, errorMessage, shouldShowError);
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getLabel() {
        return this.label;
    }

    /* renamed from: e, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AbstractC5607a abstractC5607a = this.errorMessage;
        return ((iHashCode2 + (abstractC5607a != null ? abstractC5607a.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShowError);
    }

    public String toString() {
        return "InputFieldDecorator(label=" + this.label + ", value=" + this.value + ", errorMessage=" + this.errorMessage + ", shouldShowError=" + this.shouldShowError + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InputFieldDecorator(AbstractC5607a abstractC5607a, String str, AbstractC5607a abstractC5607a2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 2) != 0 ? null : str;
        abstractC5607a2 = (i10 & 4) != 0 ? null : abstractC5607a2;
        this(abstractC5607a, str, abstractC5607a2, (i10 & 8) != 0 ? abstractC5607a2 != null : z10);
    }
}
