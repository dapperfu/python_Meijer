package com.meijer.mobile.singlepagecheckout;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001az\u0010\u0011\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2#\u0010\u000f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isShowTimer", "", "ebtTimerData", "isWebPageLoading", "Lkotlin/Function0;", "", "closeLoadingIndicator", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "results", "handleEbtBalanceResults", "acculynkPostBody", "d", "(LKi/M;Landroidx/compose/ui/Modifier;ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class K {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r31, androidx.compose.ui.Modifier r32, boolean r33, java.lang.String r34, boolean r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r37, java.lang.String r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.K.d(Ki.M, androidx.compose.ui.Modifier, boolean, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, String str, boolean z11, Function0 function0, Function1 function1, String str2, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, z10, str, z11, function0, function1, str2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.f143329a;
    }
}
