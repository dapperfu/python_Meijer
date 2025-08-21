package g1;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lg1/g;", "", "LZ/C;", "Lg1/B;", "changes", "Lg1/D;", "pointerInputEvent", "<init>", "(LZ/C;Lg1/D;)V", "Lg1/A;", "pointerId", "", "a", "(J)Z", "LZ/C;", "b", "()LZ/C;", "Lg1/D;", "getPointerInputEvent", "()Lg1/D;", "c", "Z", "d", "()Z", "e", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14304g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Z.C<PointerInputChange> changes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D pointerInputEvent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean suppressMovementConsumption;

    public final boolean a(long pointerId) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> listB = this.pointerInputEvent.b();
        int size = listB.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = listB.get(i10);
            if (C14296A.b(pointerInputEventData.getId(), pointerId)) {
                break;
            }
            i10++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.getActiveHover();
        }
        return false;
    }

    public final Z.C<PointerInputChange> b() {
        return this.changes;
    }

    public final MotionEvent c() {
        return this.pointerInputEvent.getMotionEvent();
    }

    /* renamed from: d, reason: from getter */
    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final void e(boolean z10) {
        this.suppressMovementConsumption = z10;
    }

    public C14304g(Z.C<PointerInputChange> c10, D d10) {
        this.changes = c10;
        this.pointerInputEvent = d10;
    }
}
