package ji;

import Ji.C;
import Ji.LocalThemeScope;
import Ji.T;
import androidx.compose.ui.Modifier;
import ii.C14732c;
import ji.m1;
import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lji/o1;", "", "LJi/M;", "themeScope", "Lji/m1$b;", "tags", "<init>", "(LJi/M;Lji/m1$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJi/M;", "getThemeScope", "()LJi/M;", "b", "Lji/m1$b;", "q", "()Lji/m1$b;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ji.o1, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class ProductCardTags implements InterfaceC14933f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalThemeScope themeScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final m1.ProductCardTags tags;

    public ProductCardTags(LocalThemeScope themeScope, m1.ProductCardTags tags) {
        Intrinsics.j(themeScope, "themeScope");
        Intrinsics.j(tags, "tags");
        this.themeScope = themeScope;
        this.tags = tags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCardTags)) {
            return false;
        }
        ProductCardTags productCardTags = (ProductCardTags) other;
        return Intrinsics.e(this.themeScope, productCardTags.themeScope) && Intrinsics.e(this.tags, productCardTags.tags);
    }

    public int hashCode() {
        return (this.themeScope.hashCode() * 31) + this.tags.hashCode();
    }

    /* renamed from: q, reason: from getter */
    public m1.ProductCardTags getTags() {
        return this.tags;
    }

    public String toString() {
        return "ProductCardTags(themeScope=" + this.themeScope + ", tags=" + this.tags + ')';
    }

    public /* synthetic */ ProductCardTags(LocalThemeScope localThemeScope, m1.ProductCardTags productCardTags, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        m1.ProductCardTags productCardTagsC;
        if ((i10 & 2) != 0) {
            T.a.q0 q0Var = T.a.q0.f15859c;
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 4;
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), Integer.valueOf(C14732c.f138025h), 126, null);
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            C.d dVar = C.d.f15495c;
            productCardTagsC = new m1.ProductCardTags(new q1.Tag(q0Var, label, new q1.h.DrawableIcon(dVar, null, null, null, 0.0f, null, modifierI, 62, null), null, 8, null), new q1.Tag(T.a.C3848b.f15828c, new q1.Label(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), Integer.valueOf(C14732c.f138028k), 126, null), new q1.h.DrawableIcon(dVar, null, null, null, 0.0f, null, androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), 62, null), null, 8, null), new q1.Tag(T.a.C3868w.f15870c, new q1.Label(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), Integer.valueOf(C14732c.f138027j), 126, null), q1.h.c.f140075a, null, 8, null), new q1.Tag(localThemeScope.getAdsColors().getAdsColorTransparent(), new q1.Label(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), null, null, null, 0, false, 0, new SpecialTagStyles(localThemeScope, null, 2, null).getSavings(), Integer.valueOf(C14732c.f138021d), 126, null), new q1.h.DrawableIcon(C.b.g.c.f15454e, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorSavings(), androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), 30, null), null, 8, null), new q1.Tag(localThemeScope.getAdsColors().getAdsColorInverse(), new q1.Label(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), Integer.valueOf(C14732c.f138029l), 126, null), new q1.h.DrawableIcon(dVar, null, null, null, 0.0f, null, androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), 62, null), null, 8, null), new q1.Tag(localThemeScope.getAdsColors().getAdsColorUIBackground01(), new q1.Label(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), null, null, null, 0, false, 0, new SpecialTagStyles(localThemeScope, null, 2, null).getSavings(), Integer.valueOf(C14732c.f138026i), 126, null), new q1.h.DrawableIcon(C.b.g.d.f15455e, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorSavings(), androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), 30, null), null, 8, null)).c();
        } else {
            productCardTagsC = productCardTags;
        }
        this(localThemeScope, productCardTagsC);
    }
}
