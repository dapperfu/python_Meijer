package Th;

import Fh.h;
import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"LTh/a;", "", "Lak/a;", "title", "", "isBackIconShown", "isImportantForAccessibility", "<init>", "(Lak/a;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "()Lak/a;", "b", "Z", "()Z", "c", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Th.a, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class CreateAccountAppBarDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBackIconShown;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isImportantForAccessibility;

    public CreateAccountAppBarDecorator() {
        this(null, false, false, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAccountAppBarDecorator)) {
            return false;
        }
        CreateAccountAppBarDecorator createAccountAppBarDecorator = (CreateAccountAppBarDecorator) other;
        return Intrinsics.e(this.title, createAccountAppBarDecorator.title) && this.isBackIconShown == createAccountAppBarDecorator.isBackIconShown && this.isImportantForAccessibility == createAccountAppBarDecorator.isImportantForAccessibility;
    }

    public CreateAccountAppBarDecorator(AbstractC5607a title, boolean z10, boolean z11) {
        Intrinsics.j(title, "title");
        this.title = title;
        this.isBackIconShown = z10;
        this.isImportantForAccessibility = z11;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsBackIconShown() {
        return this.isBackIconShown;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsImportantForAccessibility() {
        return this.isImportantForAccessibility;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + Boolean.hashCode(this.isBackIconShown)) * 31) + Boolean.hashCode(this.isImportantForAccessibility);
    }

    public String toString() {
        return "CreateAccountAppBarDecorator(title=" + this.title + ", isBackIconShown=" + this.isBackIconShown + ", isImportantForAccessibility=" + this.isImportantForAccessibility + ')';
    }

    public /* synthetic */ CreateAccountAppBarDecorator(AbstractC5607a abstractC5607a, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC5607a.INSTANCE.d(h.f10606T, new Object[0]) : abstractC5607a, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? true : z11);
    }
}
