package s0;

import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "a", "Z", "()Z", "isStylusHandwritingSupported", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16844b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f159834a;

    static {
        f159834a = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean a() {
        return f159834a;
    }
}
