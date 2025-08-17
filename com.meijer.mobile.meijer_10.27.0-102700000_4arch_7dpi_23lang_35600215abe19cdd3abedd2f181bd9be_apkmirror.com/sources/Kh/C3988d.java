package Kh;

import Dh.AccountChip;
import Dh.x;
import Fh.a;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import ji.q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16307b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aC\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0015²\u0006\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LDh/c;", "chip", "Landroidx/compose/ui/Modifier;", "modifier", "", "isAccountOverviewChip", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "d", "(LJi/M;LDh/c;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LH1/h;", "a", "F", "COMMUNICATIONS_TITLE_WIDTH", "b", "CHIP_TITLE_WIDTH", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Kh.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3988d {

    /* renamed from: a, reason: collision with root package name */
    private static final float f16769a = H1.h.p(98);

    /* renamed from: b, reason: collision with root package name */
    private static final float f16770b = H1.h.p(80);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Kh.d$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16771a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AccountChip f16772b;

        a(LocalThemeScope localThemeScope, AccountChip accountChip) {
            this.f16771a = localThemeScope;
            this.f16772b = accountChip;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-718543601, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.AccountChipItem.<anonymous>.<anonymous> (AccountChipItem.kt:94)");
            }
            C16307b.b(this.f16771a, new q1.h.DrawableIcon(this.f16772b.getIcon(), null, null, null, 0.0f, this.f16771a.getAdsColors().getAdsColorLink(), androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(12)), 30, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r26, final Dh.AccountChip r27, androidx.compose.ui.Modifier r28, boolean r29, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.C3988d.d(Ji.M, Dh.c, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, AccountChip accountChip, Modifier modifier, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, accountChip, modifier, z10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1, AccountChip accountChip) {
        Fh.a addresses;
        Dh.x sectionId = accountChip.getSectionId();
        if (Intrinsics.e(sectionId, x.c.f6601b)) {
            addresses = a.q.f10430a;
        } else if (Intrinsics.e(sectionId, x.f.f6604b)) {
            addresses = new a.Profile(true, false, 2, null);
        } else if (Intrinsics.e(sectionId, x.e.f6603b)) {
            addresses = new a.Preferences(true);
        } else if (Intrinsics.e(sectionId, x.b.f6600b)) {
            addresses = new a.Orders(true);
        } else if (Intrinsics.e(sectionId, x.g.f6605b)) {
            addresses = new a.Savings(true);
        } else if (Intrinsics.e(sectionId, x.d.f6602b)) {
            addresses = new a.Payments(true);
        } else if (Intrinsics.e(sectionId, x.a.f6599b)) {
            addresses = new a.Addresses(true);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        function1.invoke(addresses);
        return Unit.f142422a;
    }
}
