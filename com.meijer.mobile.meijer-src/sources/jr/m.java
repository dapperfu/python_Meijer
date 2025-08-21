package jr;

import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a`\u0010\u0010\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "titleText", "Lbk/a;", "contentDescriptionText", "LKi/C;", "navigationIcon", "Lkotlin/Function0;", "", "onBackPressed", "Lkotlin/Function1;", "Lj0/I;", "Lkotlin/ExtensionFunctionType;", "actions", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lbk/a;LKi/C;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f141255a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f141256b;

        a(LocalThemeScope localThemeScope, String str) {
            this.f141255a = localThemeScope;
            this.f141256b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2096867834, i10, -1, "com.meijer.mobile.subscription.ui.SubscriptionToolbar.<anonymous> (SubscriptionToolbar.kt:32)");
            }
            Dr.g.g(this.f141255a, this.f141256b, null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final java.lang.String r18, final bk.AbstractC6392a r19, Ki.C r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, kotlin.jvm.functions.Function3<? super j0.InterfaceC14888I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jr.m.c(Ki.M, androidx.compose.ui.Modifier, java.lang.String, bk.a, Ki.C, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, String str, AbstractC6392a abstractC6392a, C c10, Function0 function0, Function3 function3, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, str, abstractC6392a, c10, function0, function3, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
