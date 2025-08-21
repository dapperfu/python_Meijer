package ki;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lki/g;", "Lki/f;", "Lki/g$b;", "o", "()Lki/g$b;", "badges", "b", "a", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC15169g extends InterfaceC15167f {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lki/g$a;", "Lki/w1;", "Lki/P;", "<init>", "()V", "LKi/M;", "themeScope", "a", "(LKi/M;Landroidx/compose/runtime/Composer;I)Lki/P;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.g$a */
    public static final class a implements w1<InterfaceC15147P> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f142062a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f142063b = 0;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ki/g$a$a", "Lki/P;", "Lki/g$b;", "a", "Lki/g$b;", "o", "()Lki/g$b;", "badges", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ki.g$a$a, reason: collision with other inner class name */
        public static final class C2249a implements InterfaceC15147P {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final DefaultBadge badges;

            @Override // ki.InterfaceC15169g
            /* renamed from: o, reason: from getter */
            public DefaultBadge getBadges() {
                return this.badges;
            }

            /* JADX WARN: Multi-variable type inference failed */
            C2249a(LocalThemeScope localThemeScope) {
                Modifier modifier = null;
                Object[] objArr = 0 == true ? 1 : 0;
                q1.Badge badge = new q1.Badge(modifier, localThemeScope.getAdsColors().getAdsColorBrandSecondary(), new q1.Label(null, localThemeScope.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 381, null), objArr, 9, 0 == true ? 1 : 0);
                Object[] objArr2 = 0 == true ? 1 : 0;
                Object[] objArr3 = 0 == true ? 1 : 0;
                Object[] objArr4 = 0 == true ? 1 : 0;
                Modifier modifier2 = null;
                Object[] objArr5 = 0 == true ? 1 : 0;
                Object[] objArr6 = 0 == true ? 1 : 0;
                Object[] objArr7 = 0 == true ? 1 : 0;
                Object[] objArr8 = 0 == true ? 1 : 0;
                Object[] objArr9 = 0 == true ? 1 : 0;
                Modifier modifier3 = null;
                Object[] objArr10 = 0 == true ? 1 : 0;
                Object[] objArr11 = 0 == true ? 1 : 0;
                this.badges = new DefaultBadge(badge, new q1.Badge(modifier2, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), new q1.Label(null, localThemeScope.getAdsColors().getAdsColorInverse(), objArr2, null, objArr3, objArr4, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 381, null), objArr6, 9, objArr5), new q1.Badge(modifier3, localThemeScope.getAdsColors().getAdsColorInverse(), new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), objArr8, null, objArr7, objArr9, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 381, null), objArr11, 9, objArr10));
            }
        }

        @Override // ki.w1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC15147P q(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(996482297);
            if (ComposerKt.M()) {
                ComposerKt.U(996482297, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Badges.Default.generateAssembly (Badges.kt:27)");
            }
            C2249a c2249a = new C2249a(themeScope);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return c2249a;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, d2 = {"Lki/g$b;", "", "Lki/g;", "Lki/q1$b;", "primary", "secondary", "inverse", "<init>", "(Lki/q1$b;Lki/q1$b;Lki/q1$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$b;", "b", "()Lki/q1$b;", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.g$b, reason: from toString */
    public static final /* data */ class DefaultBadge {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Badge primary;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Badge secondary;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Badge inverse;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultBadge)) {
                return false;
            }
            DefaultBadge defaultBadge = (DefaultBadge) other;
            return Intrinsics.e(this.primary, defaultBadge.primary) && Intrinsics.e(this.secondary, defaultBadge.secondary) && Intrinsics.e(this.inverse, defaultBadge.inverse);
        }

        public DefaultBadge(q1.Badge primary, q1.Badge secondary, q1.Badge inverse) {
            Intrinsics.j(primary, "primary");
            Intrinsics.j(secondary, "secondary");
            Intrinsics.j(inverse, "inverse");
            this.primary = primary;
            this.secondary = secondary;
            this.inverse = inverse;
        }

        /* renamed from: a, reason: from getter */
        public final q1.Badge getInverse() {
            return this.inverse;
        }

        /* renamed from: b, reason: from getter */
        public final q1.Badge getPrimary() {
            return this.primary;
        }

        /* renamed from: c, reason: from getter */
        public final q1.Badge getSecondary() {
            return this.secondary;
        }

        public int hashCode() {
            return (((this.primary.hashCode() * 31) + this.secondary.hashCode()) * 31) + this.inverse.hashCode();
        }

        public String toString() {
            return "DefaultBadge(primary=" + this.primary + ", secondary=" + this.secondary + ", inverse=" + this.inverse + ')';
        }
    }

    /* renamed from: o */
    DefaultBadge getBadges();
}
