package Jh;

import Ki.LocalThemeScope;
import Sh.ContactUsDecorator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.C14890K;
import ki.q1;
import kotlin.C17808x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import yr.C18370z;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LSh/a;", "contactUsDecorator", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "c", "(LKi/M;LSh/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "e", "(LKi/M;LSh/a;Landroidx/compose/runtime/Composer;I)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Jh.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3863e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Jh.e$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15819a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ContactUsDecorator f15820b;

        a(LocalThemeScope localThemeScope, ContactUsDecorator contactUsDecorator) {
            this.f15819a = localThemeScope;
            this.f15820b = contactUsDecorator;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1189220202, i10, -1, "com.meijer.mobile.accounts.ux.composables.IDAndVersionText.<anonymous> (ContactUsFooter.kt:54)");
            }
            LocalThemeScope localThemeScope = this.f15819a;
            Ki.I one = localThemeScope.getAdsTypography().getDetail().getOne();
            int iA = F1.j.INSTANCE.a();
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f15819a.getAdsColors().getAdsColorPlaceholder(), null, F1.j.h(iA), 0, false, 0, one, null, 372, null), C16338g.d(Gh.h.f12992u5, new Object[]{this.f15820b.getUserId()}, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r15, final Sh.ContactUsDecorator r16, androidx.compose.ui.Modifier r17, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.C3863e.c(Ki.M, Sh.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, ContactUsDecorator contactUsDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, contactUsDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void e(final LocalThemeScope localThemeScope, final ContactUsDecorator contactUsDecorator, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1059429721);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(contactUsDecorator) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1059429721, i11, -1, "com.meijer.mobile.accounts.ux.composables.IDAndVersionText (ContactUsFooter.kt:52)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C17808x.a(C18370z.f(companion, "user_id", null, 2, null), ComposableLambdaKt.c(-1189220202, true, new a(localThemeScope, contactUsDecorator), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(4)), composerStartRestartGroup, 6);
            si.j.h(localThemeScope, new q1.Label(C18370z.f(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), "version", null, 2, null), localThemeScope.getAdsColors().getAdsColorPlaceholder(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 372, null), C16338g.d(yr.Q.f171763c, new Object[]{contactUsDecorator.getVersionName()}, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Jh.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C3863e.f(localThemeScope, contactUsDecorator, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, ContactUsDecorator contactUsDecorator, int i10, Composer composer, int i11) {
        e(localThemeScope, contactUsDecorator, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
