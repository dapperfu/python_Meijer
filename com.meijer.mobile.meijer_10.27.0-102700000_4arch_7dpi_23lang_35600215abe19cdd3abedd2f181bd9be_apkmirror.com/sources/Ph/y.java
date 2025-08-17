package Ph;

import Ji.LocalThemeScope;
import Xh.MperksInformationDecorator;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.accounts.ux.profile.a;
import com.meijer.mobile.accounts.ux.profile.p;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import j0.C14802K;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aO\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0007*\u00020\u0000H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e²\u0006\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LXh/d;", "decorator", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/profile/a;", "", "onResourceAction", "r", "(LJi/M;LXh/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isQuickIDEnabled", "Lak/a;", "errorMessage", "p", "(LJi/M;ZLak/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "title", "LJi/C;", BarcodePickDeserializer.FIELD_ICON, "subtitle", "l", "(LJi/M;Ljava/lang/String;LJi/C;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "j", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "t", "(LJi/M;Lak/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lastAction", "showQuickID", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class y {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f25620a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MperksInformationDecorator f25621b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f25622c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, MperksInformationDecorator mperksInformationDecorator, Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
            this.f25620a = localThemeScope;
            this.f25621b = mperksInformationDecorator;
            this.f25622c = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1884054255, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.MperksInfoCard.<anonymous> (MperksInfoCard.kt:68)");
            }
            y.p(this.f25620a, this.f25621b.getIsQuickIDEnabled(), this.f25621b.getLoadingErrorMessage(), null, this.f25622c, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 6), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    private static final void j(LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(-339293527);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-339293527, i11, -1, "com.meijer.mobile.accounts.ux.composables.profile.ChooseHowYouIDHeader (MperksInfoCard.kt:167)");
            }
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 383, null);
            String strC = C16193g.c(Fh.h.f10550L, composerStartRestartGroup, 0);
            int i12 = LocalThemeScope.f15770g;
            int i13 = i11 & 14;
            int i14 = q1.Label.f140080j;
            ri.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, (i14 << 3) | i12 | i13, 4);
            C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getTwo().getDp()), composerStartRestartGroup, 0);
            localThemeScope2 = localThemeScope;
            ri.j.h(localThemeScope2, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), C16193g.c(Fh.h.f10543K, composerStartRestartGroup, 0), null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ph.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y.k(localThemeScope2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        j(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void l(final Ji.LocalThemeScope r35, final java.lang.String r36, final Ji.C r37, androidx.compose.ui.Modifier r38, java.lang.String r39, kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ph.y.l(Ji.M, java.lang.String, Ji.C, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, String str, Ji.C c10, Modifier modifier, String str2, Function1 function1, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, str, c10, modifier, str2, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(com.meijer.mobile.accounts.ux.profile.a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1) {
        function1.invoke(a.l.f94728a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ji.LocalThemeScope r22, final boolean r23, final ak.AbstractC5607a r24, androidx.compose.ui.Modifier r25, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ph.y.p(Ji.M, boolean, ak.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, boolean z10, AbstractC5607a abstractC5607a, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, z10, abstractC5607a, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final Ji.LocalThemeScope r19, final Xh.MperksInformationDecorator r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ph.y.r(Ji.M, Xh.d, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, MperksInformationDecorator mperksInformationDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, mperksInformationDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void t(final Ji.LocalThemeScope r32, final ak.AbstractC5607a r33, androidx.compose.ui.Modifier r34, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ph.y.t(Ji.M, ak.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1) {
        function1.invoke(new a.OnEditClick(p.c.f94983a));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, abstractC5607a, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
