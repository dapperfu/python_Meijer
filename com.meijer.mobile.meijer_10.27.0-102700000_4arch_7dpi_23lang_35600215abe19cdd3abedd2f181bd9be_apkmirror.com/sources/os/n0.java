package os;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001ai\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LJi/M;", "", "expiringPoints", "Lak/a;", "expirationDate", "daysLeftForPointsToExpire", "Landroidx/compose/ui/Modifier;", "modifier", "Ld0/V;", "scrollState", "Lkotlin/Function0;", "", "onRedeemPointNowClick", "Lkotlin/Function1;", "", "onDismiss", "g", "(LJi/M;ILak/a;Lak/a;Landroidx/compose/ui/Modifier;Ld0/V;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class n0 {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r63, final int r64, ak.AbstractC5607a r65, final ak.AbstractC5607a r66, androidx.compose.ui.Modifier r67, d0.V r68, kotlin.jvm.functions.Function0<kotlin.Unit> r69, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r70, androidx.compose.runtime.Composer r71, final int r72, final int r73) {
        /*
            Method dump skipped, instructions count: 2220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.n0.g(Ji.M, int, ak.a, ak.a, androidx.compose.ui.Modifier, d0.V, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, int i10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Modifier modifier, d0.V v10, Function0 function0, Function1 function1, int i11, int i12, Composer composer, int i13) {
        g(localThemeScope, i10, abstractC5607a, abstractC5607a2, modifier, v10, function0, function1, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
