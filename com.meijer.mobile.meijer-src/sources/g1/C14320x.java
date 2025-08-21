package g1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lg1/w;", BarcodePickDeserializer.FIELD_ICON, "", "overrideDescendants", "a", "(Landroidx/compose/ui/Modifier;Lg1/w;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/node/s;", "touchBoundsExpansion", "c", "(Landroidx/compose/ui/Modifier;Lg1/w;ZLandroidx/compose/ui/node/s;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: g1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14320x {
    public static final Modifier a(Modifier modifier, InterfaceC14319w interfaceC14319w, boolean z10) {
        return modifier.then(new PointerHoverIconModifierElement(interfaceC14319w, z10));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, InterfaceC14319w interfaceC14319w, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(modifier, interfaceC14319w, z10);
    }

    public static final Modifier c(Modifier modifier, InterfaceC14319w interfaceC14319w, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return modifier.then(new StylusHoverIconModifierElement(interfaceC14319w, z10, dpTouchBoundsExpansion));
    }
}
