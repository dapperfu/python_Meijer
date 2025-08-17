package S0;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.A0;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.C0;
import androidx.compose.ui.node.C5815k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\u0003\"\b\b\u0000\u0010\r*\u00020\f*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LS0/f;", "LS0/b;", "event", "", "e", "(LS0/f;LS0/b;)V", "LS0/d;", "LU0/f;", "positionInRoot", "", "d", "(LS0/d;J)Z", "Landroidx/compose/ui/node/B0;", "T", "Lkotlin/Function1;", "Landroidx/compose/ui/node/A0;", "block", "f", "(Landroidx/compose/ui/node/B0;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(d dVar, long j10) {
        if (!dVar.getNode().getIsAttached()) {
            return false;
        }
        LayoutCoordinates coordinates = C5815k.o(dVar).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long jE = LayoutCoordinatesKt.e(coordinates);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fR2 = ((int) (dVar.getSize() >> 32)) + fIntBitsToFloat;
        float fR22 = ((int) (dVar.getSize() & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= fR2) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= fR22) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(f fVar, b bVar) {
        fVar.m1(bVar);
        fVar.r0(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends B0> void f(T t10, Function1<? super T, ? extends A0> function1) {
        if (function1.invoke(t10) != A0.f51160a) {
            return;
        }
        C0.f(t10, function1);
    }
}
