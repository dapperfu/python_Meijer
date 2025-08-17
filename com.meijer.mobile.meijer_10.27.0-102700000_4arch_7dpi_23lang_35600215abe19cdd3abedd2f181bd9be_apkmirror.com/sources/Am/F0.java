package Am;

import Am.F0;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import j0.C14802K;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16307b;
import r1.C16705m;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aE\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LJi/M;", "", "title", "Landroidx/compose/ui/Modifier;", "modifier", "LJi/C;", BarcodePickDeserializer.FIELD_ICON, "LJi/I;", "style", "", "isHeading", "", "b", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;LJi/C;LJi/I;ZLandroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class F0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ji.C f760a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f761b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f762c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ji.I f763d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f764e;

        a(Ji.C c10, LocalThemeScope localThemeScope, boolean z10, Ji.I i10, String str) {
            this.f760a = c10;
            this.f761b = localThemeScope;
            this.f762c = z10;
            this.f763d = i10;
            this.f764e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f142422a;
        }

        public final void b(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Modifier modifierD;
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2023877583, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.SubHeader.<anonymous> (SubHeader.kt:48)");
            }
            Ji.C c10 = this.f760a;
            composer.startReplaceGroup(673828604);
            if (c10 != null) {
                LocalThemeScope localThemeScope = this.f761b;
                C16307b.b(localThemeScope, new q1.h.DrawableIcon(this.f760a, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, 94, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
                C14802K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(8)), composer, 6);
                Unit unit = Unit.f142422a;
            }
            composer.P();
            LocalThemeScope localThemeScope2 = this.f761b;
            composer.startReplaceGroup(673840766);
            if (this.f762c) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Am.E0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return F0.a.c((r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                modifierD = C16705m.d(companion, false, (Function1) objB, 1, null);
            } else {
                modifierD = Modifier.INSTANCE;
            }
            Modifier modifier = modifierD;
            composer.P();
            ri.j.h(localThemeScope2, new q1.Label(modifier, null, null, null, 0, false, 0, this.f763d, null, 382, null), this.f764e, null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            b(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(Ji.LocalThemeScope r23, final java.lang.String r24, androidx.compose.ui.Modifier r25, Ji.C r26, Ji.I r27, boolean r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Am.F0.b(Ji.M, java.lang.String, androidx.compose.ui.Modifier, Ji.C, Ji.I, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, Modifier modifier, Ji.C c10, Ji.I i10, boolean z10, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, str, modifier, c10, i10, z10, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }
}
