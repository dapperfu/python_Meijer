package Jr;

import Ki.C;
import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LJr/a;", "", "LKi/C;", BarcodePickDeserializer.FIELD_ICON, "Lbk/a;", "contentDescription", "<init>", "(LKi/C;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKi/C;", "b", "()LKi/C;", "Lbk/a;", "()Lbk/a;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Jr.a, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class IndicatorIcon {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C icon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a contentDescription;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorIcon)) {
            return false;
        }
        IndicatorIcon indicatorIcon = (IndicatorIcon) other;
        return Intrinsics.e(this.icon, indicatorIcon.icon) && Intrinsics.e(this.contentDescription, indicatorIcon.contentDescription);
    }

    public IndicatorIcon(C icon, AbstractC6392a contentDescription) {
        Intrinsics.j(icon, "icon");
        Intrinsics.j(contentDescription, "contentDescription");
        this.icon = icon;
        this.contentDescription = contentDescription;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: b, reason: from getter */
    public final C getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return (this.icon.hashCode() * 31) + this.contentDescription.hashCode();
    }

    public String toString() {
        return "IndicatorIcon(icon=" + this.icon + ", contentDescription=" + this.contentDescription + ')';
    }
}
