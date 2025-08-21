package ki;

import Ki.B;
import Ki.C;
import Ki.LocalThemeScope;
import com.medallia.digital.mobilesdk.l3;
import ji.C15042c;
import ki.m1;
import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lki/n1;", "", "LKi/M;", "themeScope", "Lki/m1$a;", "tags", "<init>", "(LKi/M;Lki/m1$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKi/M;", "getThemeScope", "()LKi/M;", "b", "Lki/m1$a;", "q", "()Lki/m1$a;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.n1, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class ClippableCouponTags implements InterfaceC15167f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalThemeScope themeScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final m1.ClippableCouponTagTemplates tags;

    public ClippableCouponTags(LocalThemeScope themeScope, m1.ClippableCouponTagTemplates tags) {
        Intrinsics.j(themeScope, "themeScope");
        Intrinsics.j(tags, "tags");
        this.themeScope = themeScope;
        this.tags = tags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClippableCouponTags)) {
            return false;
        }
        ClippableCouponTags clippableCouponTags = (ClippableCouponTags) other;
        return Intrinsics.e(this.themeScope, clippableCouponTags.themeScope) && Intrinsics.e(this.tags, clippableCouponTags.tags);
    }

    public int hashCode() {
        return (this.themeScope.hashCode() * 31) + this.tags.hashCode();
    }

    /* renamed from: q, reason: from getter */
    public m1.ClippableCouponTagTemplates getTags() {
        return this.tags;
    }

    public String toString() {
        return "ClippableCouponTags(themeScope=" + this.themeScope + ", tags=" + this.tags + ')';
    }

    public /* synthetic */ ClippableCouponTags(LocalThemeScope localThemeScope, m1.ClippableCouponTagTemplates clippableCouponTagTemplates, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(localThemeScope, (i10 & 2) != 0 ? new m1.ClippableCouponTagTemplates(new q1.Tag(localThemeScope.getAdsColors().getAdsColorUIBackground01(), new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight().d(localThemeScope.getAdsColors().getAdsColorEnabled01()), Integer.valueOf(C15042c.f140905b), l3.f93324d, null), new q1.h.DrawableIcon(C.b.g.a.f16996e, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorIcon01(), null, 94, null), null, 8, null), new q1.Tag(localThemeScope.getAdsColors().getAdsColorUIBackground01(), new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight().d(localThemeScope.getAdsColors().getAdsColorEnabled01()), Integer.valueOf(C15042c.f140906c), l3.f93324d, null), new q1.h.DrawableIcon(C.b.g.c.f16998e, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorIcon01(), null, 94, null), null, 8, null), new q1.Tag(localThemeScope.getAdsColors().getAdsColorTransparent(), new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo().d(localThemeScope.getAdsColors().getAdsColorText01()), Integer.valueOf(C15042c.f140910g), l3.f93324d, null), new q1.h.AnimatedIcon(B.a.f16858a, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, 94, null), null, 8, null), new q1.Tag(localThemeScope.getAdsColors().getAdsColorTransparent(), new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo().d(localThemeScope.getAdsColors().getAdsColorText01()), Integer.valueOf(C15042c.f140917n), l3.f93324d, null), new q1.h.DrawableIcon(C.i.b.f17093d, null, null, null, 0.0f, null, null, 126, null), null, 8, null), new q1.Tag(localThemeScope.getAdsColors().getAdsColorTransparent(), new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo().d(localThemeScope.getAdsColors().getAdsColorText01()), Integer.valueOf(C15042c.f140908e), l3.f93324d, null), new q1.h.DrawableIcon(C.i.e.f17096d, null, null, null, 0.0f, null, null, 126, null), null, 8, null)).c() : clippableCouponTagTemplates);
    }
}
