package mi;

import H1.h;
import Ji.LocalThemeScope;
import X0.f;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13443j;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mi.C15634c;
import ri.j;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aA\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJi/M;", "Lji/q1$j;", "label", "", "text", "LH1/h;", "startMargin", "endMargin", "LV0/q0;", "bulletColor", "", "b", "(LJi/M;Lji/q1$j;Ljava/lang/String;FFJLandroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: mi.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C15634c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: mi.c$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f150114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f150115b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f150116c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150117d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q1.Label f150118e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f150119f;

        a(float f10, float f11, long j10, LocalThemeScope localThemeScope, q1.Label label, String str) {
            this.f150114a = f10;
            this.f150115b = f11;
            this.f150116c = j10;
            this.f150117d = localThemeScope;
            this.f150118e = label;
            this.f150119f = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(long j10, f Canvas) {
            Intrinsics.j(Canvas, "$this$Canvas");
            f.f1(Canvas, j10, 0.0f, 0L, 0.0f, null, null, 0, 126, null);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2093237137, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.bullet.BulletText.<anonymous> (Bullet.kt:43)");
            }
            Modifier modifierV = J.v(D.m(Modifier.INSTANCE, this.f150114a, 0.0f, this.f150115b, 0.0f, 10, null), h.p(4));
            composer.startReplaceGroup(5004770);
            boolean zE = composer.e(this.f150116c);
            final long j10 = this.f150116c;
            Object objB = composer.B();
            if (zE || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: mi.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15634c.a.c(j10, (f) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13443j.a(modifierV, (Function1) objB, composer, 0);
            j.h(this.f150117d, q1.Label.y(this.f150118e, null, null, null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null), this.f150119f, null, composer, 0, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r15, final ji.q1.Label r16, final java.lang.String r17, float r18, float r19, long r20, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.C15634c.b(Ji.M, ji.q1$j, java.lang.String, float, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, q1.Label label, String str, float f10, float f11, long j10, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, label, str, f10, f11, j10, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
