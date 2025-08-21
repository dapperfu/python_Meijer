package fq;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import hq.ShopAndScanRestrictionDecorator;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aµ\u0001\u0010\u0018\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0016\u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0015\u0012\u0004\u0012\u00020\u00120\u00142\u0016\u0010\u0017\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0015\u0012\u0004\u0012\u00020\u00120\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", PreferencesHelper.PREF_ID, "Lbk/a;", "topText", "primaryText", "primarySupportingText", "bottomText", "bottomSupportingText", "", "showPrimarySupportingText", "isItemSyncing", "showItemActionButtons", "Lhq/i;", "restriction", "Lkotlin/Function0;", "", "onUnfocusedQuantityStepper", "Lkotlin/Function1;", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", "onSyncItem", "onRemoveItem", "d", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;ZZZLhq/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:182:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0546 A[PHI: r43
      0x0546: PHI (r43v1 bk.a) = (r43v0 bk.a), (r43v4 bk.a) binds: [B:239:0x04ec, B:242:0x04f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r59, final androidx.compose.ui.Modifier r60, java.lang.String r61, final bk.AbstractC6392a r62, final bk.AbstractC6392a r63, bk.AbstractC6392a r64, final bk.AbstractC6392a r65, bk.AbstractC6392a r66, final boolean r67, final boolean r68, final boolean r69, hq.ShopAndScanRestrictionDecorator r70, final kotlin.jvm.functions.Function0<kotlin.Unit> r71, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r72, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r73, androidx.compose.runtime.Composer r74, final int r75, final int r76, final int r77) {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fq.h.d(Ki.M, androidx.compose.ui.Modifier, java.lang.String, bk.a, bk.a, bk.a, bk.a, bk.a, boolean, boolean, boolean, hq.i, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, String str, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, AbstractC6392a abstractC6392a5, boolean z10, boolean z11, boolean z12, ShopAndScanRestrictionDecorator shopAndScanRestrictionDecorator, Function0 function0, Function1 function1, Function1 function12, int i10, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, modifier, str, abstractC6392a, abstractC6392a2, abstractC6392a3, abstractC6392a4, abstractC6392a5, z10, z11, z12, shopAndScanRestrictionDecorator, function0, function1, function12, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.f143329a;
    }
}
