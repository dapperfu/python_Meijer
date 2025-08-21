package Rq;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import j0.C14890K;
import j0.InterfaceC14888I;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p1.C16338g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isPrimary", "isExpired", "", "c", "(LKi/M;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "", "statusText", "e", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Rq.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5312o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.o$a */
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33934a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33935b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f33936c;

        a(boolean z10, LocalThemeScope localThemeScope, boolean z11) {
            this.f33934a = z10;
            this.f33935b = localThemeScope;
            this.f33936c = z11;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Composer composer2;
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-525403527, i10, -1, "com.meijer.mobile.singlepagecheckout.payment.CardStatusSection.<anonymous> (CardStatusSection.kt:48)");
            }
            composer.startReplaceGroup(1893352071);
            if (this.f33934a) {
                LocalThemeScope localThemeScope = this.f33935b;
                composer2 = composer;
                C5312o.e(localThemeScope, androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null), C16338g.c(com.meijer.mobile.meijer.Y.f100443Gc, composer, 0), composer2, LocalThemeScope.f17314g, 0);
            } else {
                composer2 = composer;
            }
            composer2.P();
            Modifier.Companion companion = Modifier.INSTANCE;
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, this.f33935b.getAdsSpacing().getTwo().getDp()), composer2, 0);
            if (this.f33936c) {
                LocalThemeScope localThemeScope2 = this.f33935b;
                C5312o.e(localThemeScope2, androidx.compose.foundation.b.d(companion, localThemeScope2.getAdsColors().getAdsColorBrandSecondary().getColor(), null, 2, null), C16338g.c(com.meijer.mobile.meijer.Y.f101310z0, composer2, 0), composer2, LocalThemeScope.f17314g, 0);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rq.o$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33937a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f33938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33939c;

        b(LocalThemeScope localThemeScope, Modifier modifier, String str) {
            this.f33937a = localThemeScope;
            this.f33938b = modifier;
            this.f33939c = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2076407799, i10, -1, "com.meijer.mobile.singlepagecheckout.payment.StatusView.<anonymous> (CardStatusSection.kt:77)");
            }
            LocalThemeScope localThemeScope = this.f33937a;
            Ki.I nine = localThemeScope.getAdsTypography().getHeadings().getNine();
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.k(this.f33938b, this.f33937a.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null), this.f33937a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, nine, null, 380, null), this.f33939c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, boolean r28, boolean r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rq.C5312o.c(Ki.M, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, z10, z11, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final java.lang.String r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rq.C5312o.e(Ki.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, str, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
