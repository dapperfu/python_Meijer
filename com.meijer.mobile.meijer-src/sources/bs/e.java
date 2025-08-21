package bs;

import Ki.LocalThemeScope;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import c5.C6484c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u001aG\u0010\f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0095\u0001\u0010\u0017\u001a\u00020\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b²\u0006\u000e\u0010\u0019\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "title", "Landroidx/compose/ui/Modifier;", "modifier", "", "isShowViewAllButton", "Lbk/a;", "viewAllTitle", "Lkotlin/Function0;", "", "onViewAllClicked", "e", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLbk/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "carouselTitle", "LPj/a;", "loadingState", "bannerResource", "", "bannerErrorImageResource", "onRetryClicked", "onBannerClicked", "content", "h", "(LKi/M;Ljava/lang/String;LPj/a;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lbk/a;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "lastAction", "showViewAllButton", "homescreen_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f60515a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f60516b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f60517c;

        a(String str, Integer num, String str2) {
            this.f60515a = str;
            this.f60516b = num;
            this.f60517c = str2;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2000731473, i10, -1, "com.meijer.mobile.ui.homescreen.carousel.HomeCarouselSection.<anonymous>.<anonymous>.<anonymous> (HomeCarouselSection.kt:121)");
            }
            C15669h.a aVarF = new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(this.f60515a);
            Integer num = this.f60516b;
            C6484c.e(aVarF.j(num != null ? num.intValue() : 0).c(), this.f60517c, a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), null, null, null, null, InterfaceC5926k.INSTANCE.d(), 0.0f, null, 0, false, null, composer, 12582912, 0, 8056);
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

    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r34, final java.lang.String r35, final Pj.a r36, androidx.compose.ui.Modifier r37, boolean r38, java.lang.String r39, bk.AbstractC6392a r40, java.lang.Integer r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.e.h(Ki.M, java.lang.String, Pj.a, androidx.compose.ui.Modifier, boolean, java.lang.String, bk.a, java.lang.Integer, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r34, final java.lang.String r35, androidx.compose.ui.Modifier r36, boolean r37, bk.AbstractC6392a r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.e.e(Ki.M, java.lang.String, androidx.compose.ui.Modifier, boolean, bk.a, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, String str, Modifier modifier, boolean z10, AbstractC6392a abstractC6392a, Function0 function0, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, str, modifier, z10, abstractC6392a, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, String str, Pj.a aVar, Modifier modifier, boolean z10, String str2, AbstractC6392a abstractC6392a, Integer num, Function0 function0, Function0 function02, Function0 function03, Function2 function2, int i10, int i11, int i12, Composer composer, int i13) {
        h(localThemeScope, str, aVar, modifier, z10, str2, abstractC6392a, num, function0, function02, function03, function2, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }
}
