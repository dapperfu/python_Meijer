package Qi;

import Ki.LocalThemeScope;
import Oi.l;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LQi/cb;", "LOi/c;", "LOi/l$x;", "state", "<init>", "(LOi/l$x;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "a", "LOi/l$x;", "k", "()LOi/l$x;", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qi.cb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4794cb implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.x state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    public C4794cb(l.x state) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.name = "Switch";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(C4794cb c4794cb, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4794cb.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(C4794cb c4794cb, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4794cb.b(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-945691297);
        if ((i10 & 1) == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-945691297, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchShowcase.Controls (SwitchShowcase.kt:32)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.ab
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4794cb.j(this.f30028a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1292839416);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1292839416, i11, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchShowcase.Content (SwitchShowcase.kt:27)");
            }
            C4886jb.c(localThemeScope, composerStartRestartGroup, i11 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.bb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4794cb.i(this.f30125a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return this.name;
    }

    @Override // Oi.c
    /* renamed from: k, reason: from getter */
    public l.x getState() {
        return this.state;
    }
}
