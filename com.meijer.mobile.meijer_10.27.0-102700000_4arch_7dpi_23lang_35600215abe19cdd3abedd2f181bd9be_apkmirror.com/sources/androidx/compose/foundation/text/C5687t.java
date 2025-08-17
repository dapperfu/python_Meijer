package androidx.compose.foundation.text;

import android.view.KeyEvent;
import e1.C13603c;
import e1.C13604d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Le1/b;", "", "a", "(Landroid/view/KeyEvent;)Z", "", "b", "()V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5687t {
    public static final void b() {
    }

    public static final boolean a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && C13603c.e(C13604d.b(keyEvent), C13603c.INSTANCE.b())) {
            return true;
        }
        return false;
    }
}
