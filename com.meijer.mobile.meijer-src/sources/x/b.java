package x;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.camera.core.impl.k;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import u.C17296a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx/b;", "", "<init>", "()V", "Lu/a$a;", "options", "Landroidx/camera/core/impl/k$c;", "priority", "", "a", "(Lu/a$a;Landroidx/camera/core/impl/k$c;)V", "camera-camera2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f167697a = new b();

    @JvmStatic
    public static final void a(C17296a.C2582a options, k.c priority) {
        Intrinsics.j(options, "options");
        Intrinsics.j(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            options.g(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }

    private b() {
    }
}
