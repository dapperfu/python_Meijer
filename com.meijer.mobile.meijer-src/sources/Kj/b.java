package Kj;

import H1.h;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import ki.AdsRadioButtonColors;
import ki.InterfaceC15164d0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wi.s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aG\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LKi/M;", "", "isChecked", "Landroidx/compose/ui/Modifier;", "modifier", "isEnabled", "Lkotlin/Function1;", "", "onCheckedChange", "b", "(LKi/M;ZLandroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15164d0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f17533a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f17534b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f17535c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f17536d;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, boolean z10, boolean z11, Function1<? super Boolean, Unit> function1) {
            this.f17533a = localThemeScope;
            this.f17534b = z10;
            this.f17535c = z11;
            this.f17536d = function1;
        }

        public final void a(InterfaceC15164d0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-227110449, i10, -1, "com.meijer.mobile.core.design.compose.widget.radiobutton.RadioButton.<anonymous>.<anonymous> (RadioButton.kt:31)");
            }
            s.b(this.f17533a, new q1.s.RadioButton(J.v(Modifier.INSTANCE, h.p(20)), this.f17534b, null, new AdsRadioButtonColors(this.f17533a.getAdsColors().getAdsColorEnabled01(), this.f17533a.getAdsColors().getAdsColorUIBorder01(), this.f17533a.getAdsColors().getAdsColorInverse(), this.f17533a.getAdsColors().getAdsColorsDisabled()), 4, null), this.f17535c, this.f17534b, false, this.f17536d, composer, LocalThemeScope.f17314g | (q1.s.RadioButton.f142433e << 3), 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15164d0 interfaceC15164d0, Composer composer, Integer num) {
            a(interfaceC15164d0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r16, final boolean r17, androidx.compose.ui.Modifier r18, boolean r19, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kj.b.b(Ki.M, boolean, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, boolean z11, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, z10, modifier, z11, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
