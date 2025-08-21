package xr;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import dk.C13698b;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import qi.C16671b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lxr/a;", "chip", "Lkotlin/Function1;", "", "onChipClicked", "Landroidx/compose/ui/Modifier;", "modifier", "c", "(LKi/M;Lxr/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "chip_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: xr.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18217d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xr.d$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170962a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC18214a f170963b;

        a(LocalThemeScope localThemeScope, InterfaceC18214a interfaceC18214a) {
            this.f170962a = localThemeScope;
            this.f170963b = interfaceC18214a;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1698525732, i10, -1, "com.meijer.mobile.ui.chip.ChipItem.<anonymous>.<anonymous> (ChipItem.kt:61)");
            }
            C16671b.b(this.f170962a, new q1.h.DrawableIcon(this.f170963b.getCom.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer.FIELD_ICON java.lang.String(), null, null, null, 0.0f, this.f170962a.getAdsColors().getAdsColorBrandPrimary(), D.i(Modifier.INSTANCE, this.f170962a.getAdsSpacing().getFour().getDp()), 30, null), null, C13698b.a(this.f170963b.getContentDescription(), composer, AbstractC6392a.f60445b), composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r26, final xr.InterfaceC18214a r27, final kotlin.jvm.functions.Function1<? super xr.InterfaceC18214a, kotlin.Unit> r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.C18217d.c(Ki.M, xr.a, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, InterfaceC18214a interfaceC18214a, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, interfaceC18214a, function1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, InterfaceC18214a interfaceC18214a) {
        function1.invoke(interfaceC18214a);
        return Unit.f143329a;
    }
}
