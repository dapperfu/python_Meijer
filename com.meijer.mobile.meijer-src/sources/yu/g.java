package yu;

import androidx.compose.runtime.Composer;
import kotlin.InterfaceC6452i;
import kotlin.InterfaceC6468y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.y;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052<\u0010\r\u001a8\u0012\u0004\u0012\u00020\u0000\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lyu/h;", "layoutInfo", "Lc0/y;", "", "decayAnimationSpec", "Lc0/i;", "springAnimationSpec", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "snapIndex", "Lyu/e;", "a", "(Lyu/h;Lc0/y;Lc0/i;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lyu/e;", "lib_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {
    public static final e a(h layoutInfo, InterfaceC6468y<Float> interfaceC6468y, InterfaceC6452i<Float> interfaceC6452i, Function3<? super h, ? super Integer, ? super Integer, Integer> snapIndex, Composer composer, int i10, int i11) {
        Intrinsics.j(layoutInfo, "layoutInfo");
        Intrinsics.j(snapIndex, "snapIndex");
        composer.startReplaceableGroup(1638456080);
        if ((i11 & 2) != 0) {
            interfaceC6468y = y.b(composer, 0);
        }
        if ((i11 & 4) != 0) {
            interfaceC6452i = f.f172139a.c();
        }
        Object[] objArr = {layoutInfo, interfaceC6468y, interfaceC6452i, snapIndex};
        composer.startReplaceableGroup(-568225417);
        boolean zV = false;
        for (int i12 = 0; i12 < 4; i12++) {
            zV |= composer.V(objArr[i12]);
        }
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new e(layoutInfo, interfaceC6468y, interfaceC6452i, snapIndex);
            composer.t(objB);
        }
        composer.U();
        e eVar = (e) objB;
        composer.U();
        return eVar;
    }
}
