package g1;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Lg1/l;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "", "index", "LU0/f;", "a", "(Landroid/view/MotionEvent;I)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C14309l {

    /* renamed from: a, reason: collision with root package name */
    public static final C14309l f133952a = new C14309l();

    private C14309l() {
    }

    public final long a(MotionEvent motionEvent, int index) {
        float rawX = motionEvent.getRawX(index);
        float rawY = motionEvent.getRawY(index);
        return U0.f.e((Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
    }
}
