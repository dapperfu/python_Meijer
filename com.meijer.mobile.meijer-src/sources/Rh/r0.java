package Rh;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u0091\u0001\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018²\u0006\u0010\u0010\u0014\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isPrimaryButtonEnabled", "isDestructiveButtonEnabled", "LKi/C;", "primaryButtonIcon", "secondaryButtonIcon", "", "primaryButtonText", "secondaryButtonText", "primaryButtonViewId", "secondaryButtonViewId", "Lkotlin/Function0;", "", "onPrimaryButtonClick", "onSecondaryButtonClick", "b", "(LKi/M;Landroidx/compose/ui/Modifier;ZZLKi/C;LKi/C;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "lastAction", "isDestructionButtonEnabled", "isPrimaryButtonIconEnabled", "isSecondaryButtonIconEnabled", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class r0 {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3 A[PHI: r21
      0x00c3: PHI (r21v10 int) = (r21v0 int), (r21v6 int), (r21v7 int) binds: [B:63:0x00c1, B:73:0x00de, B:72:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r39, androidx.compose.ui.Modifier r40, boolean r41, boolean r42, Ki.C r43, Ki.C r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, final kotlin.jvm.functions.Function0<kotlin.Unit> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rh.r0.b(Ki.M, androidx.compose.ui.Modifier, boolean, boolean, Ki.C, Ki.C, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, Ki.C c10, Ki.C c11, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, int i10, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, z10, z11, c10, c11, str, str2, str3, str4, function0, function02, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }
}
