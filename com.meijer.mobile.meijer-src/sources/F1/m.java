package F1;

import V0.AbstractC5467i0;
import V0.C5489q0;
import V0.C5492s0;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u0003*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"LF1/n;", "start", "stop", "", "fraction", "b", "(LF1/n;LF1/n;F)LF1/n;", "LV0/q0;", "alpha", "c", "(JF)J", "Lkotlin/Function0;", "block", "d", "(FLkotlin/jvm/functions/Function0;)F", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class m {
    public static final n b(n nVar, n nVar2, float f10) {
        boolean z10 = nVar instanceof BrushStyle;
        return (z10 || (nVar2 instanceof BrushStyle)) ? (z10 && (nVar2 instanceof BrushStyle)) ? n.INSTANCE.a((AbstractC5467i0) u1.n.d(((BrushStyle) nVar).getBrush(), ((BrushStyle) nVar2).getBrush(), f10), J1.b.b(nVar.getAlpha(), nVar2.getAlpha(), f10)) : (n) u1.n.d(nVar, nVar2, f10) : n.INSTANCE.b(C5492s0.h(nVar.getValue(), nVar2.getValue(), f10));
    }

    public static final long c(long j10, float f10) {
        if (Float.isNaN(f10) || f10 >= 1.0f) {
            return j10;
        }
        return C5489q0.q(j10, C5489q0.t(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f10, Function0<Float> function0) {
        if (Float.isNaN(f10)) {
            return function0.invoke().floatValue();
        }
        return f10;
    }
}
