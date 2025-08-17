package eq;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import b5.C6200f;
import fq.C13927b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16692i;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "imageUrl", "contentDescription", "", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function4<b5.B, C6200f.b.Loading, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129503a;

        a(LocalThemeScope localThemeScope) {
            this.f129503a = localThemeScope;
        }

        public final void a(b5.B SubcomposeAsyncImage, C6200f.b.Loading it, Composer composer, int i10) {
            Intrinsics.j(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
            Intrinsics.j(it, "it");
            if ((i10 & 129) == 128 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1722898354, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ImageUrlComponent.<anonymous> (ImageUrlComponent.kt:35)");
            }
            C13927b.b(this.f129503a, T0.e.a(Modifier.INSTANCE, C16692i.c(H1.h.p(5))), true, composer, LocalThemeScope.f15770g | 384, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(b5.B b10, C6200f.b.Loading loading, Composer composer, Integer num) {
            a(b10, loading, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function4<b5.B, C6200f.b.Error, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129504a;

        b(LocalThemeScope localThemeScope) {
            this.f129504a = localThemeScope;
        }

        public final void a(b5.B SubcomposeAsyncImage, C6200f.b.Error it, Composer composer, int i10) {
            Intrinsics.j(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
            Intrinsics.j(it, "it");
            if ((i10 & 129) == 128 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1441598396, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ImageUrlComponent.<anonymous> (ImageUrlComponent.kt:41)");
            }
            C13927b.b(this.f129504a, T0.e.a(Modifier.INSTANCE, C16692i.c(H1.h.p(5))), false, composer, LocalThemeScope.f15770g | 384, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(b5.B b10, C6200f.b.Error error, Composer composer, Integer num) {
            a(b10, error, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r27, androidx.compose.ui.Modifier r28, final java.lang.String r29, java.lang.String r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.M.b(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, str2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
