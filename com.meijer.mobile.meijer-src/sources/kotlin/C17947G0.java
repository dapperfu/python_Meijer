package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "", "content", "a", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.G0, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17947G0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.G0$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167991f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f167992g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f167991f = function2;
            this.f167992g = i10;
        }

        public final void a(Composer composer, int i10) {
            C17947G0.a(this.f167991f, composer, J0.a(this.f167992g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        boolean z10;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1322912246);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1322912246, i11, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new a(function2, i10));
        }
    }
}
