package ps;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import dk.C13698b;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b#\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001a\u0010&R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b\n\u0010&¨\u0006("}, d2 = {"Lps/c;", "Lps/s;", "", "intentCode", BarcodePickDeserializer.FIELD_ICON, "Lbk/a;", "label", "cartItemCount", "", "isSelected", "isVisible", "<init>", "(IILbk/a;IZZ)V", "LKi/M;", "", "d", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "getIcon", "c", "Lbk/a;", "j", "()Lbk/a;", "getCartItemCount", "e", "Z", "()Z", "f", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ps.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class CartDrawerItem implements InterfaceC16533s {

    /* renamed from: g, reason: collision with root package name */
    public static final int f157214g = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int intentCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cartItemCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVisible;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartDrawerItem)) {
            return false;
        }
        CartDrawerItem cartDrawerItem = (CartDrawerItem) other;
        return this.intentCode == cartDrawerItem.intentCode && this.icon == cartDrawerItem.icon && Intrinsics.e(this.label, cartDrawerItem.label) && this.cartItemCount == cartDrawerItem.cartItemCount && this.isSelected == cartDrawerItem.isSelected && this.isVisible == cartDrawerItem.isVisible;
    }

    public CartDrawerItem(int i10, int i11, AbstractC6392a label, int i12, boolean z10, boolean z11) {
        Intrinsics.j(label, "label");
        this.intentCode = i10;
        this.icon = i11;
        this.label = label;
        this.cartItemCount = i12;
        this.isSelected = z10;
        this.isVisible = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(CartDrawerItem cartDrawerItem, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        cartDrawerItem.d(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // ps.InterfaceC16533s
    /* renamed from: a, reason: from getter */
    public boolean getIsSelected() {
        return this.isSelected;
    }

    @Override // ps.InterfaceC16533s
    public void d(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-892112621);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(this) : composerStartRestartGroup.D(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-892112621, i11, -1, "com.meijer.mobile.ui.navigation.CartDrawerItem.SecondaryContent (ComposeDrawerItems.kt:66)");
            }
            si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 383, null), C13698b.a(AbstractC6392a.INSTANCE.b(i0.f157322a, this.cartItemCount, new Object[0]), composerStartRestartGroup, AbstractC6392a.f60445b), null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ps.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CartDrawerItem.i(this.f157211a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // ps.InterfaceC16533s
    /* renamed from: g, reason: from getter */
    public int getIntentCode() {
        return this.intentCode;
    }

    @Override // ps.InterfaceC16533s
    public int getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.intentCode) * 31) + Integer.hashCode(this.icon)) * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.cartItemCount)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isVisible);
    }

    @Override // ps.InterfaceC16533s
    /* renamed from: isVisible, reason: from getter */
    public boolean getIsVisible() {
        return this.isVisible;
    }

    @Override // ps.InterfaceC16533s
    /* renamed from: j, reason: from getter */
    public AbstractC6392a getLabel() {
        return this.label;
    }

    public String toString() {
        return "CartDrawerItem(intentCode=" + this.intentCode + ", icon=" + this.icon + ", label=" + this.label + ", cartItemCount=" + this.cartItemCount + ", isSelected=" + this.isSelected + ", isVisible=" + this.isVisible + ')';
    }
}
