package g1;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lg1/q;", "LU0/f;", "offset", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "block", "c", "(Lg1/q;JLkotlin/jvm/functions/Function1;)V", "b", "", "nowMillis", "a", "(JLkotlin/jvm/functions/Function1;)V", "", "cancel", "d", "(Lg1/q;JLkotlin/jvm/functions/Function1;Z)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class M {
    public static final void a(long j10, Function1<? super MotionEvent, Unit> function1) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        function1.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void b(C14314q c14314q, long j10, Function1<? super MotionEvent, Unit> function1) {
        d(c14314q, j10, function1, true);
    }

    public static final void c(C14314q c14314q, long j10, Function1<? super MotionEvent, Unit> function1) {
        d(c14314q, j10, function1, false);
    }

    private static final void d(C14314q c14314q, long j10, Function1<? super MotionEvent, Unit> function1, boolean z10) {
        MotionEvent motionEventF = c14314q.f();
        if (motionEventF != null) {
            int action = motionEventF.getAction();
            if (z10) {
                motionEventF.setAction(3);
            }
            int i10 = (int) (j10 >> 32);
            int i11 = (int) (j10 & 4294967295L);
            motionEventF.offsetLocation(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
            function1.invoke(motionEventF);
            motionEventF.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
            motionEventF.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}
