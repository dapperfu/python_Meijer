package ki;

import Ki.LocalThemeScope;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lki/p1;", "", "LKi/M;", "theme", "LKi/I;", "savings", "<init>", "(LKi/M;LKi/I;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKi/M;", "getTheme", "()LKi/M;", "b", "LKi/I;", "()LKi/I;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.p1, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class SpecialTagStyles {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalThemeScope theme;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ki.I savings;

    public SpecialTagStyles(LocalThemeScope theme, Ki.I savings) {
        Intrinsics.j(theme, "theme");
        Intrinsics.j(savings, "savings");
        this.theme = theme;
        this.savings = savings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecialTagStyles)) {
            return false;
        }
        SpecialTagStyles specialTagStyles = (SpecialTagStyles) other;
        return Intrinsics.e(this.theme, specialTagStyles.theme) && Intrinsics.e(this.savings, specialTagStyles.savings);
    }

    /* renamed from: a, reason: from getter */
    public final Ki.I getSavings() {
        return this.savings;
    }

    public int hashCode() {
        return (this.theme.hashCode() * 31) + this.savings.hashCode();
    }

    public String toString() {
        return "SpecialTagStyles(theme=" + this.theme + ", savings=" + this.savings + ')';
    }

    public /* synthetic */ SpecialTagStyles(LocalThemeScope localThemeScope, Ki.I i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(localThemeScope, (i11 & 2) != 0 ? localThemeScope.getAdsTypography().getHeadings().getNine().d(localThemeScope.getAdsColors().getAdsColorSavings()) : i10);
    }
}
