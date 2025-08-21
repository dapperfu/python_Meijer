package fn;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsListItem;
import com.meijer.mobile.meijer.activity.orderoptions.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aA\u0010\u000b\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/orderoptions/s;", "orderOptionsListItem", "", "deliveryMode", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "", "onClick", "d", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/orderoptions/s;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class w {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, final com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsListItem r28, final java.lang.String r29, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.orderoptions.y.e, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.w.d(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.orderoptions.s, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, OrderOptionsListItem orderOptionsListItem, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, orderOptionsListItem, str, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1, OrderOptionsListItem orderOptionsListItem, boolean z10) {
        function1.invoke(orderOptionsListItem.getAction());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1, OrderOptionsListItem orderOptionsListItem, String str) {
        function1.invoke(orderOptionsListItem.getAction());
        if (Intrinsics.e(str, "delivery")) {
            function1.invoke(new y.e.NavigateListItemToAddressDetail(orderOptionsListItem));
        } else {
            function1.invoke(new y.e.NavigateListItemToStoreDetail(orderOptionsListItem));
        }
        return Unit.f143329a;
    }
}
