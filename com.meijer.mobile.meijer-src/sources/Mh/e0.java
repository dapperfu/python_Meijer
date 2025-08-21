package Mh;

import Ik.Validation;
import Ki.LocalThemeScope;
import Uh.CreateAccountDecorator;
import ai.AbstractC5693c;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.accounts.ux.createaccount.a;
import com.meijer.mobile.accounts.ux.createaccount.b;
import com.meijer.mobile.accounts.ux.createaccount.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001am\u0010\u0010\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LUh/d;", "decorator", "Landroidx/compose/ui/focus/y;", "mPerksFieldFocusRequester", "zipCodeFieldFocusRequester", "weeklyAdTooltipFocusRequester", "textMarketingTooltipFocusRequester", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/createaccount/b;", "", "onAction", "LGh/a;", "onNavigationRequest", "p", "(LKi/M;LUh/d;Landroidx/compose/ui/focus/y;Landroidx/compose/ui/focus/y;Landroidx/compose/ui/focus/y;Landroidx/compose/ui/focus/y;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "state", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class e0 {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r58, final Uh.CreateAccountDecorator r59, final androidx.compose.ui.focus.y r60, final androidx.compose.ui.focus.y r61, final androidx.compose.ui.focus.y r62, final androidx.compose.ui.focus.y r63, androidx.compose.ui.Modifier r64, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.createaccount.b, kotlin.Unit> r65, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r66, androidx.compose.runtime.Composer r67, final int r68, final int r69) {
        /*
            Method dump skipped, instructions count: 2582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mh.e0.p(Ki.M, Uh.d, androidx.compose.ui.focus.y, androidx.compose.ui.focus.y, androidx.compose.ui.focus.y, androidx.compose.ui.focus.y, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function1 function1, String updatedLastName) {
        Intrinsics.j(updatedLastName, "updatedLastName");
        function1.invoke(new b.FormFieldChanged(new AbstractC5693c.LastName(new Validation(updatedLastName, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function1 function1, String updatedPhoneNumber) {
        Intrinsics.j(updatedPhoneNumber, "updatedPhoneNumber");
        function1.invoke(new b.FormFieldChanged(new AbstractC5693c.PhoneNumber(new Validation(updatedPhoneNumber, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Function1 function1, String updatedEmail) {
        Intrinsics.j(updatedEmail, "updatedEmail");
        function1.invoke(new b.FormFieldChanged(new AbstractC5693c.Email(new Validation(updatedEmail, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Function1 function1, String updatedPassword) {
        Intrinsics.j(updatedPassword, "updatedPassword");
        if (Jh.y.f15874a.c(updatedPassword)) {
            function1.invoke(new b.FormFieldChanged(new AbstractC5693c.Password(null, updatedPassword, 1, null)));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, CreateAccountDecorator createAccountDecorator, androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, androidx.compose.ui.focus.y yVar4, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, createAccountDecorator, yVar, yVar2, yVar3, yVar4, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function1 function1, String updatedFirstName) {
        Intrinsics.j(updatedFirstName, "updatedFirstName");
        function1.invoke(new b.FormFieldChanged(new AbstractC5693c.FirstName(new Validation(updatedFirstName, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, String updatedPin) {
        Intrinsics.j(updatedPin, "updatedPin");
        function1.invoke(new b.FormFieldChanged(new AbstractC5693c.MPerksPin(new Validation(updatedPin, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1) {
        function1.invoke(new b.OpenBottomSheet(u.a.f95224a));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1, String updatedZipCode) {
        Intrinsics.j(updatedZipCode, "updatedZipCode");
        function1.invoke(new b.FormFieldChanged(new AbstractC5693c.ZipCode(new Validation(updatedZipCode, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1) {
        function1.invoke(new b.OpenBottomSheet(u.d.f95227a));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1, boolean z10) {
        function1.invoke(new b.OnCheckedChange(new a.WeeklyAd(z10)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(Function1 function1) {
        function1.invoke(new b.OpenBottomSheet(u.c.f95226a));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function1 function1, boolean z10) {
        function1.invoke(new b.OnCheckedChange(new a.TextMarketing(z10)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Function1 function1) {
        function1.invoke(new b.OpenBottomSheet(u.b.f95225a));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(Function1 function1) {
        function1.invoke(b.a.f95171a);
        return Unit.f143329a;
    }
}
