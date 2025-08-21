package eq;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import iq.ShopAndScanCartViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0082\u0003\u0010\"\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000526\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00060\f2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u00132\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\u0010\u001a\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\u00060\u00132 \u0010\u001d\u001a\u001c\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\u00060\f2\u001c\u0010\u001e\u001a\u0018\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f2\u0016\u0010\u001f\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\u00060\u00132\u0016\u0010 \u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Liq/E;", "viewState", "Lkotlin/Function0;", "", "onCloseUnclippedCouponDialog", "onCloseCheckoutConfirmationDialog", "onCheckout", "onNavigateToCheckout", "onNavigateToScanner", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "index", "offset", "onSaveScrollPosition", "Lkotlin/Function1;", "listSize", "onSavePreviousItemCount", "", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", "onFocusQuantityStepper", "onUnfocusedQuantityStepper", "onDismissRestriction", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "onCouponAction", "onUpdateItemQuantity", "onRemoveItem", "onSyncItem", "onSyncCart", "f", "(LKi/M;Landroidx/compose/ui/Modifier;Liq/E;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: eq.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13846l {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ki.LocalThemeScope r39, androidx.compose.ui.Modifier r40, final iq.ShopAndScanCartViewState r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43, final kotlin.jvm.functions.Function0<kotlin.Unit> r44, final kotlin.jvm.functions.Function0<kotlin.Unit> r45, final kotlin.jvm.functions.Function0<kotlin.Unit> r46, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r47, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r48, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r49, final kotlin.jvm.functions.Function0<kotlin.Unit> r50, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r51, final kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.String, kotlin.Unit> r52, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r53, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r54, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r55, final kotlin.jvm.functions.Function0<kotlin.Unit> r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.C13846l.f(Ki.M, androidx.compose.ui.Modifier, iq.E, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanCartViewState shopAndScanCartViewState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function2 function2, Function1 function1, Function1 function12, Function0 function06, Function1 function13, Function2 function22, Function2 function23, Function1 function14, Function1 function15, Function0 function07, int i10, int i11, int i12, Composer composer, int i13) {
        f(localThemeScope, modifier, shopAndScanCartViewState, function0, function02, function03, function04, function05, function2, function1, function12, function06, function13, function22, function23, function14, function15, function07, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
