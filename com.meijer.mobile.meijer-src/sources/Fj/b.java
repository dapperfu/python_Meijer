package Fj;

import Fj.b;
import V0.C5489q0;
import V0.C5492s0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import kotlin.C17942E;
import kotlin.C17945F0;
import kotlin.Colors;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LFj/b;", "", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Colors f10621b;

    /* renamed from: c, reason: collision with root package name */
    private static final Colors f10622c;

    @Deprecated
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"LFj/b$a;", "", "<init>", "()V", "", "darkTheme", "Lkotlin/Function0;", "", "content", "b", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lx0/D;", "MeijerLightColors", "Lx0/D;", "MeijerDarkColors", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fj.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Companion companion, boolean z10, Function2 function2, int i10, int i11, Composer composer, int i12) {
            companion.b(z10, function2, composer, J0.a(i10 | 1), i11);
            return Unit.f143329a;
        }

        @Deprecated
        public final void b(boolean z10, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10, final int i11) {
            int i12;
            final boolean z11;
            Intrinsics.j(content, "content");
            Composer composerStartRestartGroup = composer.startRestartGroup(-1844344970);
            int i13 = i11 & 1;
            if (i13 != 0) {
                i12 = i10 | 6;
            } else if ((i10 & 6) == 0) {
                i12 = (composerStartRestartGroup.a(z10) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
            if ((i11 & 2) != 0) {
                i12 |= 48;
            } else if ((i10 & 48) == 0) {
                i12 |= composerStartRestartGroup.D(content) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                i12 |= composerStartRestartGroup.V(this) ? 256 : 128;
            }
            if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
                composerStartRestartGroup.K();
                z11 = z10;
            } else {
                boolean z12 = i13 != 0 ? true : z10;
                if (ComposerKt.M()) {
                    ComposerKt.U(-1844344970, i12, -1, "com.meijer.mobile.core.design.compose.themes.Themes.Companion.MeijerPrimaryTheme (Themes.kt:43)");
                }
                C17945F0.a(z12 ? b.f10622c : b.f10621b, c.a(), null, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 48, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                z11 = z12;
            }
            T0 t0L = composerStartRestartGroup.l();
            if (t0L != null) {
                t0L.a(new Function2() { // from class: Fj.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b.Companion.c(this.f10615a, z11, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }

    static {
        long jD = C5492s0.d(4279001253L);
        long jD2 = C5492s0.d(4279001253L);
        C5489q0.Companion companion = C5489q0.INSTANCE;
        f10621b = C17942E.h(jD, jD2, C5492s0.d(4281512676L), C5492s0.d(4281512676L), 0L, 0L, C5492s0.d(4293941079L), companion.k(), companion.k(), 0L, 0L, 0L, 3632, null);
        f10622c = C17942E.d(C5492s0.d(4279059575L), C5492s0.d(4279059575L), C5492s0.d(4280256947L), C5492s0.d(4280256947L), 0L, 0L, C5492s0.d(4289137430L), companion.k(), companion.k(), 0L, 0L, 0L, 3632, null);
    }
}
