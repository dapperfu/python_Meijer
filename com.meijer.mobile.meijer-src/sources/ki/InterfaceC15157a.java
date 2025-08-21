package ki;

import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\u0007\rR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lki/a;", "", "Lki/a$b;", "m", "()Lki/a$b;", "accordions", "Lki/a$d;", "a", "()Lki/a$d;", "labels", "b", "d", "c", "e", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC15157a extends InterfaceC15167f {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lki/a$a;", "Lki/w1;", "Lki/O;", "<init>", "()V", "LKi/M;", "themeScope", "b", "(LKi/M;Landroidx/compose/runtime/Composer;I)Lki/O;", "Lki/q1$a;", "a", "(LKi/M;)Lki/q1$a;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.a$a, reason: collision with other inner class name */
    public static final class C2247a implements w1<InterfaceC15146O> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2247a f141997a = new C2247a();

        /* JADX WARN: Multi-variable type inference failed */
        public final q1.Accordion a(LocalThemeScope themeScope) {
            Intrinsics.j(themeScope, "themeScope");
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, themeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null);
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            q1.Label label2 = new q1.Label(objArr, objArr2, objArr3, null, objArr4, objArr5, 0, themeScope.getAdsTypography().getBodyCompact().getOne(), null, 383, null);
            C.f.a aVar = C.f.a.f17048e;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, themeScope.getAdsSpacing().getFive().getDp(), themeScope.getAdsSpacing().getFour().getDp());
            Object[] objArr6 = 0 == true ? 1 : 0;
            return new q1.Accordion(null, label, label2, new q1.h.DrawableIcon(aVar, null, objArr6, null, 0.0f, themeScope.getAdsColors().getAdsColorIconSubtle(), modifierJ, 30, null), true, new DefaultContainer(new q1.Row(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.D.j(companion, themeScope.getAdsSpacing().getFive().getDp(), themeScope.getAdsSpacing().getFour().getDp()), themeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), null, P0.e.INSTANCE.i(), 2, null), new q1.Row(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.D.m(companion, themeScope.getAdsSpacing().getFive().getDp(), themeScope.getAdsSpacing().getThree().getDp(), 0.0f, themeScope.getAdsSpacing().getSeven().getDp(), 4, null), themeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), null, null, 6, null)), 1, 0 == true ? 1 : 0);
        }

        @Override // ki.w1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC15146O q(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(-1631175852);
            if (ComposerKt.M()) {
                ComposerKt.U(-1631175852, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Accordions.Default.generateAssembly (Accordions.kt:43)");
            }
            InterfaceC15146O interfaceC15146OQ = e.f142005a.q(themeScope, composer, (i10 & 14) | 48);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC15146OQ;
        }

        private C2247a() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lki/a$b;", "", "Lki/a;", "Lki/q1$a;", "default", "disabled", "<init>", "(Lki/q1$a;Lki/q1$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$a;", "()Lki/q1$a;", "b", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.a$b, reason: from toString */
    public static final /* data */ class DefaultAccordion {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1.Accordion default;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Accordion disabled;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultAccordion)) {
                return false;
            }
            DefaultAccordion defaultAccordion = (DefaultAccordion) other;
            return Intrinsics.e(this.default, defaultAccordion.default) && Intrinsics.e(this.disabled, defaultAccordion.disabled);
        }

        public DefaultAccordion(q1.Accordion accordion, q1.Accordion disabled) {
            Intrinsics.j(accordion, "default");
            Intrinsics.j(disabled, "disabled");
            this.default = accordion;
            this.disabled = disabled;
        }

        /* renamed from: a, reason: from getter */
        public final q1.Accordion getDefault() {
            return this.default;
        }

        /* renamed from: b, reason: from getter */
        public final q1.Accordion getDisabled() {
            return this.disabled;
        }

        public int hashCode() {
            return (this.default.hashCode() * 31) + this.disabled.hashCode();
        }

        public String toString() {
            return "DefaultAccordion(default=" + this.default + ", disabled=" + this.disabled + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lki/a$c;", "", "Lki/q1$n;", "titleContainer", "descriptionContainer", "<init>", "(Lki/q1$n;Lki/q1$n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$n;", "b", "()Lki/q1$n;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.a$c, reason: from toString */
    public static final /* data */ class DefaultContainer {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Row titleContainer;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Row descriptionContainer;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultContainer)) {
                return false;
            }
            DefaultContainer defaultContainer = (DefaultContainer) other;
            return Intrinsics.e(this.titleContainer, defaultContainer.titleContainer) && Intrinsics.e(this.descriptionContainer, defaultContainer.descriptionContainer);
        }

        public DefaultContainer(q1.Row titleContainer, q1.Row descriptionContainer) {
            Intrinsics.j(titleContainer, "titleContainer");
            Intrinsics.j(descriptionContainer, "descriptionContainer");
            this.titleContainer = titleContainer;
            this.descriptionContainer = descriptionContainer;
        }

        /* renamed from: a, reason: from getter */
        public final q1.Row getDescriptionContainer() {
            return this.descriptionContainer;
        }

        /* renamed from: b, reason: from getter */
        public final q1.Row getTitleContainer() {
            return this.titleContainer;
        }

        public int hashCode() {
            return (this.titleContainer.hashCode() * 31) + this.descriptionContainer.hashCode();
        }

        public String toString() {
            return "DefaultContainer(titleContainer=" + this.titleContainer + ", descriptionContainer=" + this.descriptionContainer + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lki/a$d;", "", "Lki/q1$j;", "titleLabel", "descriptionLabel", "disabledLabel", "<init>", "(Lki/q1$j;Lki/q1$j;Lki/q1$j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$j;", "c", "()Lki/q1$j;", "b", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.a$d, reason: from toString */
    public static final /* data */ class DefaultLabel {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Label titleLabel;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Label descriptionLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Label disabledLabel;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultLabel)) {
                return false;
            }
            DefaultLabel defaultLabel = (DefaultLabel) other;
            return Intrinsics.e(this.titleLabel, defaultLabel.titleLabel) && Intrinsics.e(this.descriptionLabel, defaultLabel.descriptionLabel) && Intrinsics.e(this.disabledLabel, defaultLabel.disabledLabel);
        }

        public DefaultLabel(q1.Label titleLabel, q1.Label descriptionLabel, q1.Label disabledLabel) {
            Intrinsics.j(titleLabel, "titleLabel");
            Intrinsics.j(descriptionLabel, "descriptionLabel");
            Intrinsics.j(disabledLabel, "disabledLabel");
            this.titleLabel = titleLabel;
            this.descriptionLabel = descriptionLabel;
            this.disabledLabel = disabledLabel;
        }

        /* renamed from: a, reason: from getter */
        public final q1.Label getDescriptionLabel() {
            return this.descriptionLabel;
        }

        /* renamed from: b, reason: from getter */
        public final q1.Label getDisabledLabel() {
            return this.disabledLabel;
        }

        /* renamed from: c, reason: from getter */
        public final q1.Label getTitleLabel() {
            return this.titleLabel;
        }

        public int hashCode() {
            return (((this.titleLabel.hashCode() * 31) + this.descriptionLabel.hashCode()) * 31) + this.disabledLabel.hashCode();
        }

        public String toString() {
            return "DefaultLabel(titleLabel=" + this.titleLabel + ", descriptionLabel=" + this.descriptionLabel + ", disabledLabel=" + this.disabledLabel + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lki/a$e;", "Lki/w1;", "Lki/O;", "<init>", "()V", "LKi/M;", "themeScope", "a", "(LKi/M;Landroidx/compose/runtime/Composer;I)Lki/O;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.a$e */
    private static final class e implements w1<InterfaceC15146O> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f142005a = new e();

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"ki/a$e$a", "Lki/O;", "Lki/a$b;", "a", "Lki/a$b;", "m", "()Lki/a$b;", "accordions", "Lki/a$d;", "b", "Lki/a$d;", "()Lki/a$d;", "labels", "Lki/a$c;", "c", "Lki/a$c;", "getContainers", "()Lki/a$c;", "containers", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ki.a$e$a, reason: collision with other inner class name */
        public static final class C2248a implements InterfaceC15146O {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final DefaultAccordion accordions;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final DefaultLabel labels;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final DefaultContainer containers;

            /* JADX WARN: Multi-variable type inference failed */
            C2248a(LocalThemeScope localThemeScope) {
                q1.Accordion accordionA = C2247a.f141997a.a(localThemeScope);
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven().d(localThemeScope.getAdsColors().getAdsColorsDisabled()), null, 383, null);
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                Object[] objArr3 = 0 == true ? 1 : 0;
                q1.Label label2 = new q1.Label(null, null, objArr, null, objArr2, objArr3, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne().d(localThemeScope.getAdsColors().getAdsColorsDisabled()), null, 383, null);
                C.f.a aVar = C.f.a.f17048e;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp());
                C5800d.e eVar = null;
                e.c cVar = null;
                Modifier modifier = null;
                boolean z10 = false;
                this.accordions = new DefaultAccordion(accordionA, new q1.Accordion(modifier, label, label2, new q1.h.DrawableIcon(aVar, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorsDisabled(), modifierJ, 30, null), z10, new DefaultContainer(new q1.Row(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.D.j(companion, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp()), localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), null, null, 6, null), new q1.Row(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), 4, null), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), eVar, cVar, 6, null)), 1, null));
                Object[] objArr4 = 0 == true ? 1 : 0;
                Object[] objArr5 = 0 == true ? 1 : 0;
                q1.Label label3 = new q1.Label(modifier, null, null, null, objArr5, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), objArr4, 383, null);
                Object[] objArr6 = 0 == true ? 1 : 0;
                Object[] objArr7 = 0 == true ? 1 : 0;
                Object[] objArr8 = 0 == true ? 1 : 0;
                Object[] objArr9 = 0 == true ? 1 : 0;
                Object[] objArr10 = 0 == true ? 1 : 0;
                Object[] objArr11 = 0 == true ? 1 : 0;
                Object[] objArr12 = 0 == true ? 1 : 0;
                Object[] objArr13 = 0 == true ? 1 : 0;
                Object[] objArr14 = 0 == true ? 1 : 0;
                this.labels = new DefaultLabel(label3, new q1.Label(objArr6, objArr7, objArr8, null, objArr9, objArr10, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 383, null), new q1.Label(null, objArr11, objArr13, null, objArr12, objArr14, 0, localThemeScope.getAdsTypography().getHeadings().getSeven().d(localThemeScope.getAdsColors().getAdsColorsDisabled()), null, 383, null));
                Object[] objArr15 = 0 == true ? 1 : 0;
                q1.Row row = new q1.Row(androidx.compose.foundation.layout.D.j(companion, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp()), null, 0 == true ? 1 : 0, 6, objArr15);
                float dp2 = localThemeScope.getAdsSpacing().getThree().getDp();
                float dp3 = localThemeScope.getAdsSpacing().getSeven().getDp();
                Object[] objArr16 = 0 == true ? 1 : 0;
                this.containers = new DefaultContainer(row, new q1.Row(androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getFive().getDp(), dp2, 0.0f, dp3, 4, null), objArr16, null, 6, null));
            }

            @Override // ki.InterfaceC15157a
            /* renamed from: a, reason: from getter */
            public DefaultLabel getLabels() {
                return this.labels;
            }

            @Override // ki.InterfaceC15157a
            /* renamed from: m, reason: from getter */
            public DefaultAccordion getAccordions() {
                return this.accordions;
            }
        }

        @Override // ki.w1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC15146O q(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(-1975136350);
            if (ComposerKt.M()) {
                ComposerKt.U(-1975136350, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Accordions.DefaultPlain.generateAssembly (Accordions.kt:87)");
            }
            C2248a c2248a = new C2248a(themeScope);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return c2248a;
        }

        private e() {
        }
    }

    /* renamed from: a */
    DefaultLabel getLabels();

    /* renamed from: m */
    DefaultAccordion getAccordions();
}
