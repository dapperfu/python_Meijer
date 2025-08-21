package g1;

import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import g1.O;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lg1/v;", "Lg1/f;", "Lg1/w;", BarcodePickDeserializer.FIELD_ICON, "", "overrideDescendants", "<init>", "(Lg1/w;Z)V", "Lg1/O;", "pointerType", "U2", "(I)Z", "", "M2", "(Lg1/w;)V", "", "s", "Ljava/lang/String;", "a3", "()Ljava/lang/String;", "traverseKey", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14318v extends AbstractC14303f {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final String traverseKey;

    public C14318v(InterfaceC14319w interfaceC14319w, boolean z10) {
        super(interfaceC14319w, z10, null, 4, null);
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // g1.AbstractC14303f
    public boolean U2(int pointerType) {
        O.Companion companion = O.INSTANCE;
        return (O.g(pointerType, companion.c()) || O.g(pointerType, companion.a())) ? false : true;
    }

    @Override // androidx.compose.ui.node.B0
    /* renamed from: a3, reason: from getter */
    public String getTraverseKey() {
        return this.traverseKey;
    }

    @Override // g1.AbstractC14303f
    public void M2(InterfaceC14319w icon) {
        y yVarT2 = T2();
        if (yVarT2 != null) {
            yVarT2.c(icon);
        }
    }
}
