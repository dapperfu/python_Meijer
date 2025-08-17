package ji;

import Ji.LocalThemeScope;
import Ji.T;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u00012\u00020\u0001:\t\n\u000b\u0007\f\r\u0003\u000e\u000f\u0010R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lji/s1;", "", "Lji/s1$d;", "i", "()Lji/s1$d;", "containers", "Lji/s1$e;", "a", "()Lji/s1$e;", "labels", "e", "d", "b", "h", "c", "f", "g", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface s1 extends InterfaceC14933f {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\bJ\u0019\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lji/s1$a;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "LJi/M;", "themeScope", "d", "(Landroidx/compose/ui/Modifier;LJi/M;)Landroidx/compose/ui/Modifier;", "c", "Lji/s1$d;", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/s1$d;", "Lji/s1$e;", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/s1$e;", "e", "f", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f140195a = new a();

        /* JADX WARN: Multi-variable type inference failed */
        public final DefaultContainers a(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(453286876);
            if (ComposerKt.M()) {
                ComposerKt.U(453286876, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ToggleButton.Anatomy.defaultContainers (ToggleButton.kt:87)");
            }
            q1.Column column = new q1.Column(null, null, null, 7, null);
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            q1.Column column2 = new q1.Column(objArr, objArr2, null, 7, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = c(companion, themeScope);
            C5658d c5658d = C5658d.f48555a;
            q1.Row row = new q1.Row(modifierC, c5658d.g(), null, 4, null);
            q1.Row row2 = new q1.Row(c(companion, themeScope), c5658d.g(), null, 4, null);
            Modifier modifierD = d(companion, themeScope);
            e.Companion companion2 = P0.e.INSTANCE;
            DefaultContainers defaultContainers = new DefaultContainers(column, column2, new q1.Row(modifierD, c5658d.e(), companion2.l()), row, row2, new q1.Row(d(companion, themeScope), c5658d.e(), companion2.l()));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return defaultContainers;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final DefaultLabel b(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(180118749);
            if (ComposerKt.M()) {
                ComposerKt.U(180118749, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ToggleButton.Anatomy.defaultLabels (ToggleButton.kt:131)");
            }
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, themeScope.getAdsTypography().getBody().getOne(), null, 383, null);
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            DefaultLabel defaultLabel = new DefaultLabel(label, new q1.Label(null, null, objArr, null, objArr2, objArr3, 0, themeScope.getAdsTypography().getBody().getOne().d(themeScope.getAdsColors().getAdsColorsDisabled()), null, 383, null), new q1.Label(null, objArr4, objArr6, null, objArr5, objArr7, 0, themeScope.getAdsTypography().getBodyCompact().getOne().d(themeScope.getAdsColors().getAdsColorText02()), null, 383, null));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return defaultLabel;
        }

        public final Modifier e(Modifier modifier, LocalThemeScope themeScope) {
            Intrinsics.j(modifier, "<this>");
            Intrinsics.j(themeScope, "themeScope");
            return androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(modifier, 0.0f, 0.0f, themeScope.getAdsSpacing().getFive().getDp(), 0.0f, 11, null), H1.h.p(20));
        }

        public final Modifier f(Modifier modifier, LocalThemeScope themeScope) {
            Intrinsics.j(modifier, "<this>");
            Intrinsics.j(themeScope, "themeScope");
            return androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(modifier, 0.0f, 0.0f, themeScope.getAdsSpacing().getFive().getDp(), 0.0f, 11, null), H1.h.p(20));
        }

        private a() {
        }

        private final Modifier c(Modifier modifier, LocalThemeScope localThemeScope) {
            return androidx.compose.foundation.layout.D.l(modifier, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp());
        }

        private final Modifier d(Modifier modifier, LocalThemeScope localThemeScope) {
            return androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.l(modifier, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp()), 0.0f, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lji/s1$b;", "Lji/w1;", "Lji/Q;", "<init>", "()V", "LJi/M;", "themeScope", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/Q;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements w1<InterfaceC14914Q> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f140196a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f140197b = 0;

        @Override // ji.w1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC14914Q q(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(-286222399);
            if (ComposerKt.M()) {
                ComposerKt.U(-286222399, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ToggleButton.Checkbox.generateAssembly (ToggleButton.kt:169)");
            }
            InterfaceC14914Q interfaceC14914QQ = new c(a.f140195a).q(themeScope, composer, i10 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC14914QQ;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lji/s1$c;", "Lji/w1;", "Lji/Q;", "Lji/s1$a;", "anatomy", "<init>", "(Lji/s1$a;)V", "LJi/M;", "themeScope", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/Q;", "a", "Lji/s1$a;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c implements w1<InterfaceC14914Q> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a anatomy;

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"ji/s1$c$a", "Lji/Q;", "LJi/M;", "a", "LJi/M;", "getThemeScope", "()LJi/M;", "themeScope", "Lji/s1$d;", "b", "Lji/s1$d;", "i", "()Lji/s1$d;", "containers", "Lji/s1$e;", "c", "Lji/s1$e;", "()Lji/s1$e;", "labels", "Lji/c;", "d", "Lji/c;", "q", "()Lji/c;", "colors", "Lji/t1;", "e", "Lji/t1;", "()Lji/t1;", "toggleButtons", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements InterfaceC14914Q {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final LocalThemeScope themeScope;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final DefaultContainers containers;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final DefaultLabel labels;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final C14927c colors;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final DefaultCheckboxButtons toggleButtons;

            @Override // ji.s1
            /* renamed from: a, reason: from getter */
            public DefaultLabel getLabels() {
                return this.labels;
            }

            @Override // ji.InterfaceC14914Q
            /* renamed from: e, reason: from getter */
            public DefaultCheckboxButtons getToggleButtons() {
                return this.toggleButtons;
            }

            @Override // ji.s1
            /* renamed from: i, reason: from getter */
            public DefaultContainers getContainers() {
                return this.containers;
            }

            /* renamed from: q, reason: from getter */
            public C14927c getColors() {
                return this.colors;
            }

            a(LocalThemeScope localThemeScope, c cVar, Composer composer, int i10) {
                this.themeScope = localThemeScope;
                int i11 = i10 & 14;
                this.containers = cVar.anatomy.a(localThemeScope, composer, i11);
                this.labels = a.f140195a.b(localThemeScope, composer, i11 | 48);
                this.colors = new C14927c(localThemeScope.getAdsColors().getAdsColorEnabled01(), localThemeScope.getAdsColors().getAdsColorUIBorder01(), localThemeScope.getAdsColors().getAdsColorInverse(), localThemeScope.getAdsColors().getAdsColorsDisabled());
                q1.s.Checkbox checkbox = new q1.s.Checkbox(null, false, null, getColors(), 7, null);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean z10 = false;
                h0.l lVar = null;
                this.toggleButtons = new DefaultCheckboxButtons(new q1.s.Checkbox(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 11, null), false, null, getColors(), 6, null), new q1.s.Checkbox(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 11, null), z10, lVar, getColors(), 6, null), checkbox);
            }
        }

        public c(a anatomy) {
            Intrinsics.j(anatomy, "anatomy");
            this.anatomy = anatomy;
        }

        @Override // ji.w1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC14914Q q(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(1261902744);
            if (ComposerKt.M()) {
                ComposerKt.U(1261902744, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ToggleButton.DefaultCheckbox.generateAssembly (ToggleButton.kt:189)");
            }
            a aVar = new a(themeScope, this, composer, i10);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return aVar;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001d¨\u0006#"}, d2 = {"Lji/s1$d;", "", "Lji/q1$e;", "list", "clickableColumn", "Lji/q1$n;", "fullBleedItem", "item", "itemClickable", "fullBleedItemClickable", "<init>", "(Lji/q1$e;Lji/q1$e;Lji/q1$n;Lji/q1$n;Lji/q1$n;Lji/q1$n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$e;", "c", "()Lji/q1$e;", "b", "getClickableColumn", "Lji/q1$n;", "()Lji/q1$n;", "d", "e", "getItemClickable", "f", "getFullBleedItemClickable", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.s1$d, reason: from toString */
    public static final /* data */ class DefaultContainers {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Column list;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Column clickableColumn;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Row fullBleedItem;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Row item;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Row itemClickable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Row fullBleedItemClickable;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultContainers)) {
                return false;
            }
            DefaultContainers defaultContainers = (DefaultContainers) other;
            return Intrinsics.e(this.list, defaultContainers.list) && Intrinsics.e(this.clickableColumn, defaultContainers.clickableColumn) && Intrinsics.e(this.fullBleedItem, defaultContainers.fullBleedItem) && Intrinsics.e(this.item, defaultContainers.item) && Intrinsics.e(this.itemClickable, defaultContainers.itemClickable) && Intrinsics.e(this.fullBleedItemClickable, defaultContainers.fullBleedItemClickable);
        }

        public DefaultContainers(q1.Column list, q1.Column clickableColumn, q1.Row fullBleedItem, q1.Row item, q1.Row itemClickable, q1.Row fullBleedItemClickable) {
            Intrinsics.j(list, "list");
            Intrinsics.j(clickableColumn, "clickableColumn");
            Intrinsics.j(fullBleedItem, "fullBleedItem");
            Intrinsics.j(item, "item");
            Intrinsics.j(itemClickable, "itemClickable");
            Intrinsics.j(fullBleedItemClickable, "fullBleedItemClickable");
            this.list = list;
            this.clickableColumn = clickableColumn;
            this.fullBleedItem = fullBleedItem;
            this.item = item;
            this.itemClickable = itemClickable;
            this.fullBleedItemClickable = fullBleedItemClickable;
        }

        /* renamed from: a, reason: from getter */
        public final q1.Row getFullBleedItem() {
            return this.fullBleedItem;
        }

        /* renamed from: b, reason: from getter */
        public final q1.Row getItem() {
            return this.item;
        }

        /* renamed from: c, reason: from getter */
        public final q1.Column getList() {
            return this.list;
        }

        public int hashCode() {
            return (((((((((this.list.hashCode() * 31) + this.clickableColumn.hashCode()) * 31) + this.fullBleedItem.hashCode()) * 31) + this.item.hashCode()) * 31) + this.itemClickable.hashCode()) * 31) + this.fullBleedItemClickable.hashCode();
        }

        public String toString() {
            return "DefaultContainers(list=" + this.list + ", clickableColumn=" + this.clickableColumn + ", fullBleedItem=" + this.fullBleedItem + ", item=" + this.item + ", itemClickable=" + this.itemClickable + ", fullBleedItemClickable=" + this.fullBleedItemClickable + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"Lji/s1$e;", "", "Lji/q1$j;", "itemLabelEnabled", "itemLabelDisabled", "itemLabelDescription", "<init>", "(Lji/q1$j;Lji/q1$j;Lji/q1$j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$j;", "c", "()Lji/q1$j;", "b", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.s1$e, reason: from toString */
    public static final /* data */ class DefaultLabel {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Label itemLabelEnabled;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Label itemLabelDisabled;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Label itemLabelDescription;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultLabel)) {
                return false;
            }
            DefaultLabel defaultLabel = (DefaultLabel) other;
            return Intrinsics.e(this.itemLabelEnabled, defaultLabel.itemLabelEnabled) && Intrinsics.e(this.itemLabelDisabled, defaultLabel.itemLabelDisabled) && Intrinsics.e(this.itemLabelDescription, defaultLabel.itemLabelDescription);
        }

        public DefaultLabel(q1.Label itemLabelEnabled, q1.Label itemLabelDisabled, q1.Label itemLabelDescription) {
            Intrinsics.j(itemLabelEnabled, "itemLabelEnabled");
            Intrinsics.j(itemLabelDisabled, "itemLabelDisabled");
            Intrinsics.j(itemLabelDescription, "itemLabelDescription");
            this.itemLabelEnabled = itemLabelEnabled;
            this.itemLabelDisabled = itemLabelDisabled;
            this.itemLabelDescription = itemLabelDescription;
        }

        /* renamed from: a, reason: from getter */
        public final q1.Label getItemLabelDescription() {
            return this.itemLabelDescription;
        }

        /* renamed from: b, reason: from getter */
        public final q1.Label getItemLabelDisabled() {
            return this.itemLabelDisabled;
        }

        /* renamed from: c, reason: from getter */
        public final q1.Label getItemLabelEnabled() {
            return this.itemLabelEnabled;
        }

        public int hashCode() {
            return (((this.itemLabelEnabled.hashCode() * 31) + this.itemLabelDisabled.hashCode()) * 31) + this.itemLabelDescription.hashCode();
        }

        public String toString() {
            return "DefaultLabel(itemLabelEnabled=" + this.itemLabelEnabled + ", itemLabelDisabled=" + this.itemLabelDisabled + ", itemLabelDescription=" + this.itemLabelDescription + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lji/s1$f;", "Lji/w1;", "Lji/d0;", "Lji/s1$a;", "anatomy", "<init>", "(Lji/s1$a;)V", "LJi/M;", "themeScope", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/d0;", "a", "Lji/s1$a;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class f implements w1<InterfaceC14930d0> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a anatomy;

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"ji/s1$f$a", "Lji/d0;", "LJi/M;", "a", "LJi/M;", "getThemeScope", "()LJi/M;", "themeScope", "Lji/s1$d;", "b", "Lji/s1$d;", "i", "()Lji/s1$d;", "containers", "Lji/s1$e;", "c", "Lji/s1$e;", "()Lji/s1$e;", "labels", "Lji/d;", "d", "Lji/d;", "q", "()Lji/d;", "colors", "Lji/u1;", "e", "Lji/u1;", "()Lji/u1;", "toggleButtons", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements InterfaceC14930d0 {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final LocalThemeScope themeScope;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final DefaultContainers containers;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final DefaultLabel labels;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final AdsRadioButtonColors colors;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final DefaultRadioButtons toggleButtons;

            a(LocalThemeScope localThemeScope, f fVar, Composer composer, int i10) {
                this.themeScope = localThemeScope;
                int i11 = i10 & 14;
                this.containers = fVar.anatomy.a(localThemeScope, composer, i11);
                a aVar = a.f140195a;
                this.labels = aVar.b(localThemeScope, composer, i11 | 48);
                this.colors = new AdsRadioButtonColors(localThemeScope.getAdsColors().getAdsColorEnabled01(), localThemeScope.getAdsColors().getAdsColorUIBorder01(), localThemeScope.getAdsColors().getAdsColorInverse(), localThemeScope.getAdsColors().getAdsColorsDisabled());
                Modifier.Companion companion = Modifier.INSTANCE;
                this.toggleButtons = new DefaultRadioButtons(new q1.s.RadioButton(aVar.e(companion, localThemeScope), false, null, getColors(), 6, null), new q1.s.RadioButton(aVar.f(companion, localThemeScope), false, null, getColors(), 6, null), new q1.s.RadioButton(androidx.compose.foundation.layout.J.v(companion, H1.h.p(20)), false, null, getColors(), 6, null));
            }

            @Override // ji.s1
            /* renamed from: a, reason: from getter */
            public DefaultLabel getLabels() {
                return this.labels;
            }

            @Override // ji.InterfaceC14930d0
            /* renamed from: e, reason: from getter */
            public DefaultRadioButtons getToggleButtons() {
                return this.toggleButtons;
            }

            @Override // ji.s1
            /* renamed from: i, reason: from getter */
            public DefaultContainers getContainers() {
                return this.containers;
            }

            /* renamed from: q, reason: from getter */
            public AdsRadioButtonColors getColors() {
                return this.colors;
            }
        }

        public f(a anatomy) {
            Intrinsics.j(anatomy, "anatomy");
            this.anatomy = anatomy;
        }

        @Override // ji.w1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC14930d0 q(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(-1742416604);
            if (ComposerKt.M()) {
                ComposerKt.U(-1742416604, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ToggleButton.DefaultRadioButton.generateAssembly (ToggleButton.kt:222)");
            }
            a aVar = new a(themeScope, this, composer, i10);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lji/s1$g;", "Lji/w1;", "Lji/e0;", "Lji/s1$a;", "anatomy", "<init>", "(Lji/s1$a;)V", "LJi/M;", "themeScope", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/e0;", "a", "Lji/s1$a;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class g implements w1<InterfaceC14932e0> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a anatomy;

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"ji/s1$g$a", "Lji/e0;", "LJi/M;", "a", "LJi/M;", "getThemeScope", "()LJi/M;", "themeScope", "Lji/s1$d;", "b", "Lji/s1$d;", "i", "()Lji/s1$d;", "containers", "Lji/s1$e;", "c", "Lji/s1$e;", "()Lji/s1$e;", "labels", "Lji/e;", "d", "Lji/e;", "q", "()Lji/e;", "colors", "Lji/v1;", "e", "Lji/v1;", "()Lji/v1;", "toggleButtons", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements InterfaceC14932e0 {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final LocalThemeScope themeScope;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final DefaultContainers containers;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final DefaultLabel labels;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final AdsSwitchColors colors;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final DefaultSwitchButtons toggleButtons;

            @Override // ji.s1
            /* renamed from: a, reason: from getter */
            public DefaultLabel getLabels() {
                return this.labels;
            }

            @Override // ji.InterfaceC14932e0
            /* renamed from: e, reason: from getter */
            public DefaultSwitchButtons getToggleButtons() {
                return this.toggleButtons;
            }

            @Override // ji.s1
            /* renamed from: i, reason: from getter */
            public DefaultContainers getContainers() {
                return this.containers;
            }

            /* renamed from: q, reason: from getter */
            public AdsSwitchColors getColors() {
                return this.colors;
            }

            a(LocalThemeScope localThemeScope, g gVar, Composer composer, int i10) {
                this.themeScope = localThemeScope;
                int i11 = i10 & 14;
                this.containers = gVar.anatomy.a(localThemeScope, composer, i11);
                a aVar = a.f140195a;
                this.labels = aVar.b(localThemeScope, composer, i11 | 48);
                Ji.T adsColorEnabled01 = localThemeScope.getAdsColors().getAdsColorEnabled01();
                T.a.C3849c c3849c = T.a.C3849c.f15830c;
                this.colors = new AdsSwitchColors(adsColorEnabled01, localThemeScope.getAdsColors().getAdsColorInverse(), localThemeScope.getAdsColors().getAdsColorInverse(), localThemeScope.getAdsColors().getAdsColorsDisabled(), c3849c, T.a.C3866u.f15866c, c3849c, T.a.C3848b.f15828c, T.a.C3871z.f15875c, localThemeScope.getAdsColors().getAdsColorsDisabled());
                Modifier.Companion companion = Modifier.INSTANCE;
                this.toggleButtons = new DefaultSwitchButtons(new q1.s.Switch(aVar.e(companion, localThemeScope), false, null, getColors(), 6, null), new q1.s.Switch(aVar.f(companion, localThemeScope), false, null, getColors(), 6, null), new q1.s.Switch(androidx.compose.foundation.layout.J.v(companion, H1.h.p(20)), false, null, getColors(), 6, null));
            }
        }

        public g(a anatomy) {
            Intrinsics.j(anatomy, "anatomy");
            this.anatomy = anatomy;
        }

        @Override // ji.w1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC14932e0 q(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(-104678666);
            if (ComposerKt.M()) {
                ComposerKt.U(-104678666, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ToggleButton.DefaultSwitch.generateAssembly (ToggleButton.kt:254)");
            }
            a aVar = new a(themeScope, this, composer, i10);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lji/s1$h;", "Lji/w1;", "Lji/d0;", "<init>", "()V", "LJi/M;", "themeScope", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/d0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements w1<InterfaceC14930d0> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f140225a = new h();

        /* renamed from: b, reason: collision with root package name */
        public static final int f140226b = 0;

        @Override // ji.w1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC14930d0 q(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(1259189827);
            if (ComposerKt.M()) {
                ComposerKt.U(1259189827, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ToggleButton.RadioButton.generateAssembly (ToggleButton.kt:175)");
            }
            InterfaceC14930d0 interfaceC14930d0Q = new f(a.f140195a).q(themeScope, composer, i10 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC14930d0Q;
        }

        private h() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lji/s1$i;", "Lji/w1;", "Lji/e0;", "<init>", "()V", "LJi/M;", "themeScope", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/e0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements w1<InterfaceC14932e0> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f140227a = new i();

        /* renamed from: b, reason: collision with root package name */
        public static final int f140228b = 0;

        @Override // ji.w1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC14932e0 q(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(296349665);
            if (ComposerKt.M()) {
                ComposerKt.U(296349665, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ToggleButton.Switch.generateAssembly (ToggleButton.kt:181)");
            }
            InterfaceC14932e0 interfaceC14932e0Q = new g(a.f140195a).q(themeScope, composer, i10 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC14932e0Q;
        }

        private i() {
        }
    }

    /* renamed from: a */
    DefaultLabel getLabels();

    /* renamed from: i */
    DefaultContainers getContainers();
}
