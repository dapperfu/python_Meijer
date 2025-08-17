package Am;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16088n;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "header", "itemValue", "", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class E {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f744a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f745b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f746c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Am.E$a$a, reason: collision with other inner class name */
        static final class C0016a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f747a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f748b;

            C0016a(LocalThemeScope localThemeScope, String str) {
                this.f747a = localThemeScope;
                this.f748b = str;
            }

            public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(988529117, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.ContactInfoUserInfoItem.<anonymous>.<anonymous> (ContactInfoUserInfoItem.kt:44)");
                }
                LocalThemeScope localThemeScope = this.f747a;
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.H(Modifier.INSTANCE, null, false, 3, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null), this.f748b, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                a(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f749a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f750b;

            b(LocalThemeScope localThemeScope, String str) {
                this.f749a = localThemeScope;
                this.f750b = str;
            }

            public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-450048684, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.ContactInfoUserInfoItem.<anonymous>.<anonymous> (ContactInfoUserInfoItem.kt:62)");
                }
                LocalThemeScope localThemeScope = this.f749a;
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.H(Modifier.INSTANCE, null, false, 3, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), this.f750b, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                a(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, String str, String str2) {
            this.f744a = localThemeScope;
            this.f745b = str;
            this.f746c = str2;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(AdsRow) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-322230637, i11, -1, "com.meijer.mobile.meijer.activity.checkout.composables.ContactInfoUserInfoItem.<anonymous> (ContactInfoUserInfoItem.kt:37)");
            }
            LocalThemeScope localThemeScope = this.f744a;
            Modifier.Companion companion = Modifier.INSTANCE;
            q1.Column column = new q1.Column(InterfaceC14800I.b(AdsRow, androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), 1.0f, false, 2, null), null, null, 6, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(988529117, true, new C0016a(this.f744a, this.f745b), composer, 54);
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Column.f139985d;
            C16088n.e(localThemeScope, column, composableLambdaC, composer, i12 | 384 | (i13 << 3));
            C16088n.e(this.f744a, new q1.Column(InterfaceC14800I.b(AdsRow, androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), 4.0f, false, 2, null), null, null, 6, null), ComposableLambdaKt.c(-450048684, true, new b(this.f744a, this.f746c), composer, 54), composer, i12 | 384 | (i13 << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final java.lang.String r21, java.lang.String r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Am.E.b(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, str2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
