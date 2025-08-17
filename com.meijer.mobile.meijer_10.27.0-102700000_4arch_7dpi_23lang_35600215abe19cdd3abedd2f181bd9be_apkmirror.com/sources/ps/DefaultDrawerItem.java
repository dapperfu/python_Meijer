package ps;

import ak.AbstractC5607a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\t\u0010!¨\u0006#"}, d2 = {"Lps/h;", "Lps/s;", "", "intentCode", BarcodePickDeserializer.FIELD_ICON, "Lak/a;", "label", "", "isSelected", "isVisible", "<init>", "(IILak/a;ZZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "q", "b", "getIcon", "c", "Lak/a;", "j", "()Lak/a;", "d", "Z", "k", "()Z", "e", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ps.h, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class DefaultDrawerItem implements InterfaceC16407s {

    /* renamed from: f, reason: collision with root package name */
    public static final int f156538f = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int intentCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVisible;

    public DefaultDrawerItem(int i10, int i11, AbstractC5607a label, boolean z10, boolean z11) {
        Intrinsics.j(label, "label");
        this.intentCode = i10;
        this.icon = i11;
        this.label = label;
        this.isSelected = z10;
        this.isVisible = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultDrawerItem)) {
            return false;
        }
        DefaultDrawerItem defaultDrawerItem = (DefaultDrawerItem) other;
        return this.intentCode == defaultDrawerItem.intentCode && this.icon == defaultDrawerItem.icon && Intrinsics.e(this.label, defaultDrawerItem.label) && this.isSelected == defaultDrawerItem.isSelected && this.isVisible == defaultDrawerItem.isVisible;
    }

    @Override // ps.InterfaceC16407s
    public int getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.intentCode) * 31) + Integer.hashCode(this.icon)) * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isVisible);
    }

    @Override // ps.InterfaceC16407s
    /* renamed from: isVisible, reason: from getter */
    public boolean getIsVisible() {
        return this.isVisible;
    }

    @Override // ps.InterfaceC16407s
    /* renamed from: j, reason: from getter */
    public AbstractC5607a getLabel() {
        return this.label;
    }

    @Override // ps.InterfaceC16407s
    /* renamed from: k, reason: from getter */
    public boolean getIsSelected() {
        return this.isSelected;
    }

    @Override // ps.InterfaceC16407s
    /* renamed from: q, reason: from getter */
    public int getIntentCode() {
        return this.intentCode;
    }

    public String toString() {
        return "DefaultDrawerItem(intentCode=" + this.intentCode + ", icon=" + this.icon + ", label=" + this.label + ", isSelected=" + this.isSelected + ", isVisible=" + this.isVisible + ')';
    }

    public /* synthetic */ DefaultDrawerItem(int i10, int i11, AbstractC5607a abstractC5607a, boolean z10, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, abstractC5607a, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? true : z11);
    }
}
