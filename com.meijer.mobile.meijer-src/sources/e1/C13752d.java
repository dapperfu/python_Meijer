package e1;

import android.view.KeyEvent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u0011\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0015\u0010\u0013\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e*\n\u0010\u0015\"\u00020\u00142\u00020\u0014¨\u0006\u0016"}, d2 = {"Le1/b;", "Le1/a;", "a", "(Landroid/view/KeyEvent;)J", "key", "", "c", "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "Le1/c;", "b", "type", "", "d", "(Landroid/view/KeyEvent;)Z", "isAltPressed", "e", "isCtrlPressed", "f", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: e1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13752d {
    public static final long a(KeyEvent keyEvent) {
        return f.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return C13751c.INSTANCE.c();
            }
            return C13751c.INSTANCE.b();
        }
        return C13751c.INSTANCE.a();
    }

    public static final int c(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final boolean e(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean f(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
