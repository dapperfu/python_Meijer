package androidx.compose.ui.platform;

import android.os.Looper;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "b", "()Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
