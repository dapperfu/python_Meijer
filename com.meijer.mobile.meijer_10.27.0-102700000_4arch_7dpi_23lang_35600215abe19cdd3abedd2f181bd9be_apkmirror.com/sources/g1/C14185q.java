package g1;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0010\u0010\fR\u001d\u0010\u001a\u001a\u00020\u00178\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\fR0\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n8\u0006@@X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lg1/q;", "", "", "Lg1/B;", "changes", "Lg1/g;", "internalPointerEvent", "<init>", "(Ljava/util/List;Lg1/g;)V", "(Ljava/util/List;)V", "Lg1/t;", "a", "()I", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lg1/g;", "e", "()Lg1/g;", "Lg1/o;", "I", "buttons", "Lg1/N;", "d", "getKeyboardModifiers-k7X9c1A", "keyboardModifiers", "<set-?>", "g", "h", "(I)V", "type", "Landroid/view/MotionEvent;", "f", "()Landroid/view/MotionEvent;", "motionEvent", "", "classification", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14185q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<PointerInputChange> changes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14175g internalPointerEvent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int buttons;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keyboardModifiers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int type;

    public C14185q(List<PointerInputChange> list, C14175g c14175g) {
        this.changes = list;
        this.internalPointerEvent = c14175g;
        MotionEvent motionEventF = f();
        this.buttons = C14183o.a(motionEventF != null ? motionEventF.getButtonState() : 0);
        MotionEvent motionEventF2 = f();
        this.keyboardModifiers = N.b(motionEventF2 != null ? motionEventF2.getMetaState() : 0);
        this.type = a();
    }

    /* renamed from: b, reason: from getter */
    public final int getButtons() {
        return this.buttons;
    }

    public final List<PointerInputChange> c() {
        return this.changes;
    }

    public final int d() {
        MotionEvent motionEventF;
        if (Build.VERSION.SDK_INT < 29 || (motionEventF = f()) == null) {
            return 0;
        }
        return motionEventF.getClassification();
    }

    /* renamed from: e, reason: from getter */
    public final C14175g getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    public final MotionEvent f() {
        C14175g c14175g = this.internalPointerEvent;
        if (c14175g != null) {
            return c14175g.c();
        }
        return null;
    }

    /* renamed from: g, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final void h(int i10) {
        this.type = i10;
    }

    private final int a() {
        MotionEvent motionEventF = f();
        if (motionEventF != null) {
            int actionMasked = motionEventF.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return C14187t.INSTANCE.f();
                            case 9:
                                return C14187t.INSTANCE.a();
                            case 10:
                                return C14187t.INSTANCE.b();
                            default:
                                return C14187t.INSTANCE.g();
                        }
                    }
                    return C14187t.INSTANCE.c();
                }
                return C14187t.INSTANCE.e();
            }
            return C14187t.INSTANCE.d();
        }
        List<PointerInputChange> list = this.changes;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputChange c14168b = list.get(i10);
            if (r.d(c14168b)) {
                return C14187t.INSTANCE.e();
            }
            if (r.b(c14168b)) {
                return C14187t.INSTANCE.d();
            }
        }
        return C14187t.INSTANCE.c();
    }

    public C14185q(List<PointerInputChange> list) {
        this(list, null);
    }
}
