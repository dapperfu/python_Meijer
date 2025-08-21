package ps;

import Ki.LocalThemeScope;
import V0.C5489q0;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import dk.C13698b;
import j0.C14889J;
import ki.q1;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16338g;
import p1.C16339h;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b\t\u0010&¨\u0006("}, d2 = {"Lps/E;", "Lps/s;", "", "intentCode", BarcodePickDeserializer.FIELD_ICON, "Lbk/a;", "label", "", "isSelected", "isVisible", "<init>", "(IILbk/a;ZZ)V", "LKi/M;", "title", "Landroidx/compose/ui/Modifier;", "modifier", "", "b", "(LKi/M;ILbk/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "getIcon", "c", "Lbk/a;", "j", "()Lbk/a;", "d", "Z", "()Z", "e", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ps.E, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class FulfillmentDrawerItem implements InterfaceC16533s {

    /* renamed from: f, reason: collision with root package name */
    public static final int f157107f = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int intentCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVisible;

    public FulfillmentDrawerItem(int i10, int i11, AbstractC6392a label, boolean z10, boolean z11) {
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
        if (!(other instanceof FulfillmentDrawerItem)) {
            return false;
        }
        FulfillmentDrawerItem fulfillmentDrawerItem = (FulfillmentDrawerItem) other;
        return this.intentCode == fulfillmentDrawerItem.intentCode && this.icon == fulfillmentDrawerItem.icon && Intrinsics.e(this.label, fulfillmentDrawerItem.label) && this.isSelected == fulfillmentDrawerItem.isSelected && this.isVisible == fulfillmentDrawerItem.isVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(FulfillmentDrawerItem fulfillmentDrawerItem, LocalThemeScope localThemeScope, int i10, AbstractC6392a abstractC6392a, Modifier modifier, int i11, Composer composer, int i12) throws XmlPullParserException, Resources.NotFoundException {
        fulfillmentDrawerItem.b(localThemeScope, i10, abstractC6392a, modifier, composer, J0.a(i11 | 1));
        return Unit.f143329a;
    }

    @Override // ps.InterfaceC16533s
    /* renamed from: a, reason: from getter */
    public boolean getIsSelected() {
        return this.isSelected;
    }

    @Override // ps.InterfaceC16533s
    public void b(final LocalThemeScope localThemeScope, final int i10, final AbstractC6392a title, final Modifier modifier, Composer composer, final int i11) throws XmlPullParserException, Resources.NotFoundException {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(title, "title");
        Intrinsics.j(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-696316290);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & 512) == 0 ? composerStartRestartGroup.V(title) : composerStartRestartGroup.D(title) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-696316290, i12, -1, "com.meijer.mobile.ui.navigation.FulfillmentDrawerItem.PrimaryContent (ComposeDrawerItems.kt:95)");
            }
            Modifier modifierK = androidx.compose.foundation.layout.D.k(modifier, 0.0f, H1.h.p(4), 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.i(), composerStartRestartGroup, 48);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            a1.d dVarB = C16339h.b(a1.d.INSTANCE, i10, composerStartRestartGroup, (i12 & 112) | 6);
            String strC = C16338g.c(j0.f157325b, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            C18054z0.b(dVarB, strC, androidx.compose.foundation.layout.J.v(companion2, H1.h.p(24)), C5489q0.INSTANCE.j(), composerStartRestartGroup, 3456, 0);
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(16), 0.0f, 0.0f, 0.0f, 14, null), localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 380, null), C13698b.a(title, composerStartRestartGroup, AbstractC6392a.f60445b | ((i12 >> 6) & 14)), null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | (q1.Label.f142335j << 3), 4);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ps.D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FulfillmentDrawerItem.i(this.f157101a, localThemeScope, i10, title, modifier, i11, (Composer) obj, ((Integer) obj2).intValue());
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
        return (((((((Integer.hashCode(this.intentCode) * 31) + Integer.hashCode(this.icon)) * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isVisible);
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
        return "FulfillmentDrawerItem(intentCode=" + this.intentCode + ", icon=" + this.icon + ", label=" + this.label + ", isSelected=" + this.isSelected + ", isVisible=" + this.isVisible + ')';
    }

    public /* synthetic */ FulfillmentDrawerItem(int i10, int i11, AbstractC6392a abstractC6392a, boolean z10, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, abstractC6392a, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? true : z11);
    }
}
