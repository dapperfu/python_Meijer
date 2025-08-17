package g1;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!R \u0010(\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010/R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Lg1/i;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "", "a", "(Landroid/view/MotionEvent;)V", "h", "", "pointerId", "", "g", "(Landroid/view/MotionEvent;I)Z", "motionEventPointerId", "Lg1/A;", "f", "(I)J", "b", "Lg1/P;", "positionCalculator", "index", "pressed", "Lg1/E;", "d", "(Lg1/P;Landroid/view/MotionEvent;IZ)Lg1/E;", "Lg1/D;", "c", "(Landroid/view/MotionEvent;Lg1/P;)Lg1/D;", "e", "(I)V", "", "J", "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "activeHoverIds", "", "Ljava/util/List;", "pointers", "I", "previousToolType", "previousSource", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14177i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long nextId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<PointerInputEventData> pointers = new ArrayList();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int previousToolType = -1;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int previousSource = -1;

    private final PointerInputEventData d(P positionCalculator, MotionEvent motionEvent, int index, boolean pressed) {
        long jQ;
        long jA;
        int i10;
        long jF = f(motionEvent.getPointerId(index));
        float pressure = motionEvent.getPressure(index);
        char c10 = ' ';
        long j10 = 4294967295L;
        long jE = U0.f.e((Float.floatToRawIntBits(motionEvent.getY(index)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(index)) << 32));
        long jG = U0.f.g(jE, 0.0f, 0.0f, 3, null);
        if (index == 0) {
            jA = U0.f.e((Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32));
            jQ = positionCalculator.q(jA);
        } else if (Build.VERSION.SDK_INT >= 29) {
            jA = C14180l.f132662a.a(motionEvent, index);
            jQ = positionCalculator.q(jA);
        } else {
            long jS = positionCalculator.s(jE);
            jQ = jE;
            jA = jS;
        }
        int toolType = motionEvent.getToolType(index);
        int iE = toolType != 0 ? toolType != 1 ? toolType != 2 ? toolType != 3 ? toolType != 4 ? O.INSTANCE.e() : O.INSTANCE.a() : O.INSTANCE.b() : O.INSTANCE.c() : O.INSTANCE.d() : O.INSTANCE.e();
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i11 = 0;
        while (i11 < historySize) {
            float historicalX = motionEvent.getHistoricalX(index, i11);
            float historicalY = motionEvent.getHistoricalY(index, i11);
            char c11 = c10;
            long j11 = j10;
            if ((Float.floatToRawIntBits(historicalX) & a.e.API_PRIORITY_OTHER) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & a.e.API_PRIORITY_OTHER) >= 2139095040) {
                i10 = i11;
            } else {
                long jE2 = U0.f.e((Float.floatToRawIntBits(historicalX) << c11) | (Float.floatToRawIntBits(historicalY) & j11));
                i10 = i11;
                arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i10), jE2, jE2, null));
            }
            i11 = i10 + 1;
            c10 = c11;
            j10 = j11;
        }
        return new PointerInputEventData(jF, motionEvent.getEventTime(), jA, jQ, pressed, pressure, iE, this.activeHoverIds.get(motionEvent.getPointerId(index), false), arrayList, motionEvent.getActionMasked() == 8 ? U0.f.e((Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j10) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c10)) : U0.f.INSTANCE.c(), jG, null);
    }

    private final long f(int motionEventPointerId) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(motionEventPointerId, jValueAt);
        }
        return C14167A.a(jValueAt);
    }

    public final void e(int pointerId) {
        this.activeHoverIds.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                    SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                    long j10 = this.nextId;
                    this.nextId = 1 + j10;
                    sparseLongArray.put(pointerId, j10);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j11 = this.nextId;
            this.nextId = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType == this.previousToolType && source == this.previousSource) {
                return;
            }
            this.previousToolType = toolType;
            this.previousSource = source;
            this.activeHoverIds.clear();
            this.motionEventToComposePointerIdMap.clear();
        }
    }

    private final boolean g(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!g(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(iKeyAt);
                }
            }
        }
    }

    public final D c(MotionEvent motionEvent, P positionCalculator) {
        boolean z10;
        boolean z11;
        int actionIndex;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3 && actionMasked != 4) {
            b(motionEvent);
            a(motionEvent);
            if (actionMasked != 9 && actionMasked != 7 && actionMasked != 10) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (actionMasked == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
            }
            if (actionMasked != 1) {
                if (actionMasked != 6) {
                    actionIndex = -1;
                } else {
                    actionIndex = motionEvent.getActionIndex();
                }
            } else {
                actionIndex = 0;
            }
            this.pointers.clear();
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 0; i10 < pointerCount; i10++) {
                List<PointerInputEventData> list = this.pointers;
                if (!z10 && i10 != actionIndex && (!z11 || motionEvent.getButtonState() != 0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                list.add(d(positionCalculator, motionEvent, i10, z12));
            }
            h(motionEvent);
            return new D(motionEvent.getEventTime(), this.pointers, motionEvent);
        }
        this.motionEventToComposePointerIdMap.clear();
        this.activeHoverIds.clear();
        return null;
    }
}
