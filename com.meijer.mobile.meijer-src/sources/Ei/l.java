package Ei;

import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b!\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u000e\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"LEi/l;", "LEi/b;", "", "LKi/M;", "localThemeScope", "", "value", "LKi/C;", BarcodePickDeserializer.FIELD_ICON, "", "description", "maxValue", "", "isLogScale", "isQuantity", "showFraction", "Lkotlin/Function0;", "", "imageComposable", "<init>", "(LKi/M;DLKi/C;Ljava/lang/String;DZZZLkotlin/jvm/functions/Function2;)V", "b", "LKi/M;", "c", "()LKi/M;", "D", "getValue", "()D", "d", "LKi/C;", "getIcon", "()LKi/C;", "e", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "f", "u0", "g", "Z", "q", "()Z", "h", "H", "i", "f0", "j", "Lkotlin/jvm/functions/Function2;", "j0", "()Lkotlin/jvm/functions/Function2;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class l implements b, Ji.h {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final double value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C icon;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final double maxValue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isLogScale;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isQuantity;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean showFraction;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Function2<Composer, Integer, Unit> imageComposable;

    /* JADX WARN: Multi-variable type inference failed */
    public l(LocalThemeScope localThemeScope, double d10, C icon, String description, double d11, boolean z10, boolean z11, boolean z12, Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(icon, "icon");
        Intrinsics.j(description, "description");
        this.localThemeScope = localThemeScope;
        this.value = d10;
        this.icon = icon;
        this.description = description;
        this.maxValue = d11;
        this.isLogScale = z10;
        this.isQuantity = z11;
        this.showFraction = z12;
        this.imageComposable = function2;
    }

    @Override // Ei.b
    /* renamed from: H, reason: from getter */
    public boolean getIsQuantity() {
        return this.isQuantity;
    }

    @Override // Ei.b, Ji.h, Ai.InterfaceC2817g1
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    @Override // Ei.b
    /* renamed from: f0, reason: from getter */
    public boolean getShowFraction() {
        return this.showFraction;
    }

    @Override // Ei.b
    public String getDescription() {
        return this.description;
    }

    @Override // Ei.b
    public C getIcon() {
        return this.icon;
    }

    @Override // Ei.b
    public double getValue() {
        return this.value;
    }

    @Override // Ei.b
    public Function2<Composer, Integer, Unit> j0() {
        return this.imageComposable;
    }

    @Override // Ei.b
    /* renamed from: q, reason: from getter */
    public boolean getIsLogScale() {
        return this.isLogScale;
    }

    @Override // Ei.b
    /* renamed from: u0, reason: from getter */
    public double getMaxValue() {
        return this.maxValue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(LocalThemeScope localThemeScope, double d10, C c10, String str, double d11, boolean z10, boolean z11, boolean z12, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Function2 function22;
        boolean z13;
        z10 = (i10 & 32) != 0 ? false : z10;
        if ((i10 & 128) != 0) {
            function22 = function2;
            z13 = false;
        } else {
            function22 = function2;
            z13 = z12;
        }
        this(localThemeScope, d10, c10, str, d11, z10, z11, z13, function22);
    }
}
