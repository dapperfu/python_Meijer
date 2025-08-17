package ji;

import Ji.LocalThemeScope;
import androidx.compose.ui.Modifier;
import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lji/i0;", "", "LJi/M;", "themeScope", "Lji/k0;", "labels", "Lji/j0;", "infoBlocks", "<init>", "(LJi/M;Lji/k0;Lji/j0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJi/M;", "getThemeScope", "()LJi/M;", "b", "Lji/k0;", "q", "()Lji/k0;", "c", "Lji/j0;", "f", "()Lji/j0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.i0, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class Default implements InterfaceC14933f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalThemeScope themeScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DefaultLabel labels;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DefaultInfoBlocks infoBlocks;

    public Default(LocalThemeScope themeScope, DefaultLabel labels, DefaultInfoBlocks infoBlocks) {
        Intrinsics.j(themeScope, "themeScope");
        Intrinsics.j(labels, "labels");
        Intrinsics.j(infoBlocks, "infoBlocks");
        this.themeScope = themeScope;
        this.labels = labels;
        this.infoBlocks = infoBlocks;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Default)) {
            return false;
        }
        Default r52 = (Default) other;
        return Intrinsics.e(this.themeScope, r52.themeScope) && Intrinsics.e(this.labels, r52.labels) && Intrinsics.e(this.infoBlocks, r52.infoBlocks);
    }

    /* renamed from: f, reason: from getter */
    public DefaultInfoBlocks getInfoBlocks() {
        return this.infoBlocks;
    }

    public int hashCode() {
        return (((this.themeScope.hashCode() * 31) + this.labels.hashCode()) * 31) + this.infoBlocks.hashCode();
    }

    /* renamed from: q, reason: from getter */
    public DefaultLabel getLabels() {
        return this.labels;
    }

    public String toString() {
        return "Default(themeScope=" + this.themeScope + ", labels=" + this.labels + ", infoBlocks=" + this.infoBlocks + ')';
    }

    public /* synthetic */ Default(LocalThemeScope localThemeScope, DefaultLabel defaultLabel, DefaultInfoBlocks defaultInfoBlocks, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        DefaultInfoBlocks defaultInfoBlocks2;
        defaultLabel = (i10 & 2) != 0 ? new DefaultLabel(new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null)) : defaultLabel;
        if ((i10 & 4) != 0) {
            Modifier.Companion companion = Modifier.INSTANCE;
            defaultInfoBlocks2 = new DefaultInfoBlocks(new q1.InfoBlock(companion, localThemeScope.getAdsColors().getAdsColorSupportErrorBg()), new q1.InfoBlock(companion, localThemeScope.getAdsColors().getAdsColorSupportWarningBg()), new q1.InfoBlock(companion, localThemeScope.getAdsColors().getAdsColorSupportSuccessBg()), new q1.InfoBlock(companion, localThemeScope.getAdsColors().getAdsColorSupportInformationalBg()));
        } else {
            defaultInfoBlocks2 = defaultInfoBlocks;
        }
        this(localThemeScope, defaultLabel, defaultInfoBlocks2);
    }
}
