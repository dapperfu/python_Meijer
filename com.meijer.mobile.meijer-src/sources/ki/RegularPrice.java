package ki;

import Ki.LocalThemeScope;
import androidx.compose.ui.Modifier;
import ki.m1;
import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lki/h1;", "", "LKi/M;", "themeScope", "Lki/e1;", "labels", "Lki/m1$b;", "tags", "Lki/d1;", "containers", "<init>", "(LKi/M;Lki/e1;Lki/m1$b;Lki/d1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKi/M;", "getThemeScope", "()LKi/M;", "b", "Lki/e1;", "r", "()Lki/e1;", "c", "Lki/m1$b;", "s", "()Lki/m1$b;", "d", "Lki/d1;", "q", "()Lki/d1;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ki.h1, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class RegularPrice implements InterfaceC15167f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalThemeScope themeScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Labels labels;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final m1.ProductCardTags tags;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DefaultContainers containers;

    public RegularPrice(LocalThemeScope themeScope, Labels labels, m1.ProductCardTags tags, DefaultContainers containers) {
        Intrinsics.j(themeScope, "themeScope");
        Intrinsics.j(labels, "labels");
        Intrinsics.j(tags, "tags");
        Intrinsics.j(containers, "containers");
        this.themeScope = themeScope;
        this.labels = labels;
        this.tags = tags;
        this.containers = containers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegularPrice)) {
            return false;
        }
        RegularPrice regularPrice = (RegularPrice) other;
        return Intrinsics.e(this.themeScope, regularPrice.themeScope) && Intrinsics.e(this.labels, regularPrice.labels) && Intrinsics.e(this.tags, regularPrice.tags) && Intrinsics.e(this.containers, regularPrice.containers);
    }

    public int hashCode() {
        return (((((this.themeScope.hashCode() * 31) + this.labels.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.containers.hashCode();
    }

    /* renamed from: q, reason: from getter */
    public DefaultContainers getContainers() {
        return this.containers;
    }

    /* renamed from: r, reason: from getter */
    public Labels getLabels() {
        return this.labels;
    }

    /* renamed from: s, reason: from getter */
    public m1.ProductCardTags getTags() {
        return this.tags;
    }

    public String toString() {
        return "RegularPrice(themeScope=" + this.themeScope + ", labels=" + this.labels + ", tags=" + this.tags + ", containers=" + this.containers + ')';
    }

    public /* synthetic */ RegularPrice(LocalThemeScope localThemeScope, Labels labels, m1.ProductCardTags productCardTags, DefaultContainers defaultContainers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Labels labels2;
        if ((i10 & 2) != 0) {
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree().d(localThemeScope.getAdsColors().getAdsColorText01()), null, 383, null);
            q1.Label label2 = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo().d(localThemeScope.getAdsColors().getAdsColorText01()), null, 383, null);
            q1.Label label3 = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo().d(localThemeScope.getAdsColors().getAdsColorText01()), null, 383, null);
            Ki.I iD = localThemeScope.getAdsTypography().getBodyCompact().getOne().d(localThemeScope.getAdsColors().getAdsColorText01());
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 2;
            labels2 = new Labels(label, label2, label3, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(4), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, iD, null, 382, null), new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne().d(localThemeScope.getAdsColors().getAdsColorText02()), null, 382, null));
        } else {
            labels2 = labels;
        }
        this(localThemeScope, labels2, (i10 & 4) != 0 ? new ProductCardTags(localThemeScope, null, 2, null).getTags() : productCardTags, (i10 & 8) != 0 ? c1.f142026a.a() : defaultContainers);
    }
}
