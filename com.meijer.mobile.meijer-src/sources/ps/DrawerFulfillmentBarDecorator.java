package ps;

import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lps/i;", "", "", BarcodePickDeserializer.FIELD_ICON, "Lbk/a;", "label", "<init>", "(ILbk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lbk/a;", "()Lbk/a;", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ps.i, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class DrawerFulfillmentBarDecorator {

    /* renamed from: c, reason: collision with root package name */
    public static final int f157319c = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a label;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawerFulfillmentBarDecorator)) {
            return false;
        }
        DrawerFulfillmentBarDecorator drawerFulfillmentBarDecorator = (DrawerFulfillmentBarDecorator) other;
        return this.icon == drawerFulfillmentBarDecorator.icon && Intrinsics.e(this.label, drawerFulfillmentBarDecorator.label);
    }

    public DrawerFulfillmentBarDecorator(int i10, AbstractC6392a label) {
        Intrinsics.j(label, "label");
        this.icon = i10;
        this.label = label;
    }

    /* renamed from: a, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (Integer.hashCode(this.icon) * 31) + this.label.hashCode();
    }

    public String toString() {
        return "DrawerFulfillmentBarDecorator(icon=" + this.icon + ", label=" + this.label + ')';
    }
}
