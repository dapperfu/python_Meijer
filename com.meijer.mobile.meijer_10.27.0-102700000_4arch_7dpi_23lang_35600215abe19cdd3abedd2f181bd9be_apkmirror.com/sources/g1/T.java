package g1;

import androidx.compose.ui.node.DpTouchBoundsExpansion;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import g1.O;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lg1/T;", "Lg1/f;", "Lg1/w;", BarcodePickDeserializer.FIELD_ICON, "", "overrideDescendants", "Landroidx/compose/ui/node/s;", "touchBoundsExpansion", "<init>", "(Lg1/w;ZLandroidx/compose/ui/node/s;)V", "Lg1/O;", "pointerType", "U2", "(I)Z", "", "M2", "(Lg1/w;)V", "", "s", "Ljava/lang/String;", "a3", "()Ljava/lang/String;", "traverseKey", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T extends AbstractC14174f {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final String traverseKey;

    @Override // g1.AbstractC14174f
    public boolean U2(int pointerType) {
        O.Companion companion = O.INSTANCE;
        return O.g(pointerType, companion.c()) || O.g(pointerType, companion.a());
    }

    @Override // androidx.compose.ui.node.B0
    /* renamed from: a3, reason: from getter */
    public String getTraverseKey() {
        return this.traverseKey;
    }

    public T(InterfaceC14190w interfaceC14190w, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        super(interfaceC14190w, z10, dpTouchBoundsExpansion);
        this.traverseKey = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // g1.AbstractC14174f
    public void M2(InterfaceC14190w icon) {
        y yVarT2 = T2();
        if (yVarT2 != null) {
            yVarT2.a(icon);
        }
    }
}
