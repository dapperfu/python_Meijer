package ji;

import Ji.C;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import ji.m1;
import ji.q1;
import kotlin.C17979v;
import kotlin.InterfaceC17977u;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0003*\r\nB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lji/M;", "", "Lji/w1;", "<init>", "()V", "LJi/M;", "themeScope", "w", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/M;", "Lji/m1$a;", "b", "Lji/m1$a;", "_tags", "c", "Lkotlin/Lazy;", "A", "()Lji/m1$a;", "tags", "Lji/M$a;", "d", "Lji/M$a;", "_buttons", "e", "x", "()Lji/M$a;", "buttons", "Lji/M$c;", "f", "Lji/M$c;", "_labels", "g", "z", "()Lji/M$c;", "labels", "Lji/M$b;", "h", "Lji/M$b;", "_icons", "i", "y", "()Lji/M$b;", "icons", "a", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ji.M, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14910M implements InterfaceC14933f, w1<C14910M> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static m1.ClippableCouponTagTemplates _tags;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static ClippableCouponButtonTemplates _buttons;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static ClippableCouponLabelTemplates _labels;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static ClippableCouponIconTemplates _icons;

    /* renamed from: a, reason: collision with root package name */
    public static final C14910M f139677a = new C14910M();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Lazy tags = LazyKt.b(new Function0() { // from class: ji.I
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C14910M.D();
        }
    });

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final Lazy buttons = LazyKt.b(new Function0() { // from class: ji.J
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C14910M.v();
        }
    });

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final Lazy labels = LazyKt.b(new Function0() { // from class: ji.K
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C14910M.C();
        }
    });

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final Lazy icons = LazyKt.b(new Function0() { // from class: ji.L
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C14910M.B();
        }
    });

    /* renamed from: j, reason: collision with root package name */
    public static final int f139686j = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lji/M$a;", "", "Lji/q1$d$b;", "unclipped", "<init>", "(Lji/q1$d$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$d$b;", "()Lji/q1$d$b;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.M$a, reason: from toString */
    public static final /* data */ class ClippableCouponButtonTemplates {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.d.ClippableCouponButton unclipped;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClippableCouponButtonTemplates) && Intrinsics.e(this.unclipped, ((ClippableCouponButtonTemplates) other).unclipped);
        }

        public ClippableCouponButtonTemplates(q1.d.ClippableCouponButton unclipped) {
            Intrinsics.j(unclipped, "unclipped");
            this.unclipped = unclipped;
        }

        /* renamed from: a, reason: from getter */
        public final q1.d.ClippableCouponButton getUnclipped() {
            return this.unclipped;
        }

        public int hashCode() {
            return this.unclipped.hashCode();
        }

        public String toString() {
            return "ClippableCouponButtonTemplates(unclipped=" + this.unclipped + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lji/M$b;", "", "Lji/q1$h$b;", "unclipped", "<init>", "(Lji/q1$h$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$h$b;", "()Lji/q1$h$b;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.M$b, reason: from toString */
    public static final /* data */ class ClippableCouponIconTemplates {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.h.DrawableIcon unclipped;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClippableCouponIconTemplates) && Intrinsics.e(this.unclipped, ((ClippableCouponIconTemplates) other).unclipped);
        }

        public ClippableCouponIconTemplates(q1.h.DrawableIcon unclipped) {
            Intrinsics.j(unclipped, "unclipped");
            this.unclipped = unclipped;
        }

        /* renamed from: a, reason: from getter */
        public final q1.h.DrawableIcon getUnclipped() {
            return this.unclipped;
        }

        public int hashCode() {
            return this.unclipped.hashCode();
        }

        public String toString() {
            return "ClippableCouponIconTemplates(unclipped=" + this.unclipped + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lji/M$c;", "", "Lji/q1$j;", "buttonLabel", "<init>", "(Lji/q1$j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$j;", "()Lji/q1$j;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.M$c, reason: from toString */
    public static final /* data */ class ClippableCouponLabelTemplates {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Label buttonLabel;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClippableCouponLabelTemplates) && Intrinsics.e(this.buttonLabel, ((ClippableCouponLabelTemplates) other).buttonLabel);
        }

        public ClippableCouponLabelTemplates(q1.Label buttonLabel) {
            Intrinsics.j(buttonLabel, "buttonLabel");
            this.buttonLabel = buttonLabel;
        }

        /* renamed from: a, reason: from getter */
        public final q1.Label getButtonLabel() {
            return this.buttonLabel;
        }

        public int hashCode() {
            return this.buttonLabel.hashCode();
        }

        public String toString() {
            return "ClippableCouponLabelTemplates(buttonLabel=" + this.buttonLabel + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClippableCouponIconTemplates B() {
        ClippableCouponIconTemplates clippableCouponIconTemplates = _icons;
        if (clippableCouponIconTemplates != null) {
            return clippableCouponIconTemplates;
        }
        Intrinsics.y("_icons");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClippableCouponLabelTemplates C() {
        ClippableCouponLabelTemplates clippableCouponLabelTemplates = _labels;
        if (clippableCouponLabelTemplates != null) {
            return clippableCouponLabelTemplates;
        }
        Intrinsics.y("_labels");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m1.ClippableCouponTagTemplates D() {
        m1.ClippableCouponTagTemplates clippableCouponTagTemplates = _tags;
        if (clippableCouponTagTemplates != null) {
            return clippableCouponTagTemplates;
        }
        Intrinsics.y("_tags");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClippableCouponButtonTemplates v() {
        ClippableCouponButtonTemplates clippableCouponButtonTemplates = _buttons;
        if (clippableCouponButtonTemplates != null) {
            return clippableCouponButtonTemplates;
        }
        Intrinsics.y("_buttons");
        return null;
    }

    public m1.ClippableCouponTagTemplates A() {
        return (m1.ClippableCouponTagTemplates) tags.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ji.w1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C14910M q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-621133608);
        if (ComposerKt.M()) {
            ComposerKt.U(-621133608, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ClippableCoupon.generateAssembly (ClippableCoupon.kt:52)");
        }
        _tags = new ClippableCouponTags(themeScope, null, 2, 0 == true ? 1 : 0).getTags();
        C17979v c17979v = C17979v.f168713a;
        long color = themeScope.getAdsColors().getAdsColorUIBackground01().getColor();
        int i11 = C17979v.f168724l;
        InterfaceC17977u interfaceC17977uA = c17979v.a(color, 0L, 0L, 0L, composer, i11 << 12, 14);
        float f10 = 0;
        _buttons = new ClippableCouponButtonTemplates(new q1.d.ClippableCouponButton(false, null, c17979v.b(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 0.0f, composer, (i11 << 15) | 54, 28), null, null, interfaceC17977uA, null, null, false, 0, null, 1755, null));
        _labels = new ClippableCouponLabelTemplates(new q1.Label(null, null, null, null, 0, false, 0, themeScope.getAdsTypography().getHeadings().getEight().d(themeScope.getAdsColors().getAdsColorEnabled01()), null, 383, null));
        float f11 = 24;
        _icons = new ClippableCouponIconTemplates(new q1.h.DrawableIcon(C.a.C3838j.f15346e, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.p(Modifier.INSTANCE, H1.h.p(f11), H1.h.p(f11)), 62, null));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return this;
    }

    public ClippableCouponButtonTemplates x() {
        return (ClippableCouponButtonTemplates) buttons.getValue();
    }

    public ClippableCouponIconTemplates y() {
        return (ClippableCouponIconTemplates) icons.getValue();
    }

    public ClippableCouponLabelTemplates z() {
        return (ClippableCouponLabelTemplates) labels.getValue();
    }

    private C14910M() {
    }
}
