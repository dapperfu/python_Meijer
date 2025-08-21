package Im;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0088\u0001\u0010\u0012\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2#\u0010\u000f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isShowTimer", "", "ebtTimerData", "isWebPageLoading", "Lkotlin/Function0;", "", "closeLoadingIndicator", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "results", "handleEbtBalanceResults", "acculynkPostBody", "onClose", "e", "(LKi/M;Landroidx/compose/ui/Modifier;ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r32, androidx.compose.ui.Modifier r33, boolean r34, java.lang.String r35, boolean r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r38, java.lang.String r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Im.h.e(Ki.M, androidx.compose.ui.Modifier, boolean, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, String str, boolean z11, Function0 function0, Function1 function1, String str2, Function0 function02, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, z10, str, z11, function0, function1, str2, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.f143329a;
    }
}
