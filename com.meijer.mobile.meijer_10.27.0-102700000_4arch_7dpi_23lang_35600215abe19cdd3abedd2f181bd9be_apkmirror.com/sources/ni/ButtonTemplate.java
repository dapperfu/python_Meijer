package ni;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.medallia.digital.mobilesdk.l3;
import d0.BorderStroke;
import j0.InterfaceC14794C;
import kotlin.C17979v;
import kotlin.InterfaceC17981w;
import kotlin.Metadata;
import kotlin.RippleConfiguration;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16692i;
import r0.RoundedCornerShape;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b\u001d\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b!\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b+\u0010/¨\u00060"}, d2 = {"Lni/G0;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lx0/w;", "elevation", "LV0/D1;", "shape", "Ld0/h;", "border", "Lni/a;", "colors", "Lj0/C;", "contentPadding", "Lx0/W0;", "rippleConfiguration", "<init>", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ld0/h;Lni/a;Lj0/C;Lx0/W0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "e", "()Landroidx/compose/ui/Modifier;", "b", "Lkotlin/jvm/functions/Function2;", "d", "()Lkotlin/jvm/functions/Function2;", "c", "g", "Ld0/h;", "()Ld0/h;", "Lni/a;", "()Lni/a;", "f", "Lj0/C;", "()Lj0/C;", "Lx0/W0;", "()Lx0/W0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ni.G0, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class ButtonTemplate {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Modifier modifier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function2<Composer, Integer, InterfaceC17981w> elevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function2<Composer, Integer, V0.D1> shape;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BorderStroke border;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AcresButtonColors colors;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC14794C contentPadding;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final RippleConfiguration rippleConfiguration;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ni.G0$a */
    static final class a implements Function2<Composer, Integer, InterfaceC17981w> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f151448a = new a();

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ InterfaceC17981w invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }

        a() {
        }

        public final InterfaceC17981w a(Composer composer, int i10) {
            composer.startReplaceGroup(-2041146646);
            if (ComposerKt.M()) {
                ComposerKt.U(-2041146646, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.ButtonTemplate.<init>.<anonymous> (Buttons.kt:243)");
            }
            InterfaceC17981w interfaceC17981wB = C17979v.f168713a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, C17979v.f168724l << 15, 31);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC17981wB;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ni.G0$b */
    static final class b implements Function2<Composer, Integer, RoundedCornerShape> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f151449a = new b();

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ RoundedCornerShape invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }

        b() {
        }

        public final RoundedCornerShape a(Composer composer, int i10) {
            composer.startReplaceGroup(1350997686);
            if (ComposerKt.M()) {
                ComposerKt.U(1350997686, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.ButtonTemplate.<init>.<anonymous> (Buttons.kt:244)");
            }
            RoundedCornerShape roundedCornerShapeC = C16692i.c(H1.h.p(12));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return roundedCornerShapeC;
        }
    }

    public ButtonTemplate() {
        this(null, null, null, null, null, null, null, l3.f92485d, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonTemplate)) {
            return false;
        }
        ButtonTemplate buttonTemplate = (ButtonTemplate) other;
        return Intrinsics.e(this.modifier, buttonTemplate.modifier) && Intrinsics.e(this.elevation, buttonTemplate.elevation) && Intrinsics.e(this.shape, buttonTemplate.shape) && Intrinsics.e(this.border, buttonTemplate.border) && Intrinsics.e(this.colors, buttonTemplate.colors) && Intrinsics.e(this.contentPadding, buttonTemplate.contentPadding) && Intrinsics.e(this.rippleConfiguration, buttonTemplate.rippleConfiguration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonTemplate(Modifier modifier, Function2<? super Composer, ? super Integer, ? extends InterfaceC17981w> elevation, Function2<? super Composer, ? super Integer, ? extends V0.D1> shape, BorderStroke borderStroke, AcresButtonColors colors, InterfaceC14794C contentPadding, RippleConfiguration rippleConfiguration) {
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(elevation, "elevation");
        Intrinsics.j(shape, "shape");
        Intrinsics.j(colors, "colors");
        Intrinsics.j(contentPadding, "contentPadding");
        Intrinsics.j(rippleConfiguration, "rippleConfiguration");
        this.modifier = modifier;
        this.elevation = elevation;
        this.shape = shape;
        this.border = borderStroke;
        this.colors = colors;
        this.contentPadding = contentPadding;
        this.rippleConfiguration = rippleConfiguration;
    }

    /* renamed from: a, reason: from getter */
    public final BorderStroke getBorder() {
        return this.border;
    }

    /* renamed from: b, reason: from getter */
    public final AcresButtonColors getColors() {
        return this.colors;
    }

    /* renamed from: c, reason: from getter */
    public final InterfaceC14794C getContentPadding() {
        return this.contentPadding;
    }

    public final Function2<Composer, Integer, InterfaceC17981w> d() {
        return this.elevation;
    }

    /* renamed from: e, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    /* renamed from: f, reason: from getter */
    public final RippleConfiguration getRippleConfiguration() {
        return this.rippleConfiguration;
    }

    public final Function2<Composer, Integer, V0.D1> g() {
        return this.shape;
    }

    public int hashCode() {
        int iHashCode = ((((this.modifier.hashCode() * 31) + this.elevation.hashCode()) * 31) + this.shape.hashCode()) * 31;
        BorderStroke borderStroke = this.border;
        return ((((((iHashCode + (borderStroke == null ? 0 : borderStroke.hashCode())) * 31) + this.colors.hashCode()) * 31) + this.contentPadding.hashCode()) * 31) + this.rippleConfiguration.hashCode();
    }

    public String toString() {
        return "ButtonTemplate(modifier=" + this.modifier + ", elevation=" + this.elevation + ", shape=" + this.shape + ", border=" + this.border + ", colors=" + this.colors + ", contentPadding=" + this.contentPadding + ", rippleConfiguration=" + this.rippleConfiguration + ')';
    }

    public /* synthetic */ ButtonTemplate(Modifier modifier, Function2 function2, Function2 function22, BorderStroke borderStroke, AcresButtonColors acresButtonColors, InterfaceC14794C interfaceC14794C, RippleConfiguration rippleConfiguration, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, (i10 & 2) != 0 ? a.f151448a : function2, (i10 & 4) != 0 ? b.f151449a : function22, (i10 & 8) != 0 ? null : borderStroke, (i10 & 16) != 0 ? new AcresButtonColors(0L, 0L, 3, null) : acresButtonColors, (i10 & 32) != 0 ? C17979v.f168713a.c() : interfaceC14794C, (i10 & 64) != 0 ? new RippleConfiguration(0L, null, 3, null) : rippleConfiguration);
    }
}
