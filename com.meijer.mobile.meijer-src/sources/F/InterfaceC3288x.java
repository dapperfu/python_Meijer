package F;

import C.C3030o;
import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.Set;

/* renamed from: F.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3288x {

    /* renamed from: F.x$a */
    public interface a {
        InterfaceC3288x a(Context context, F f10, C3030o c3030o, long j10) throws InitializationException;
    }

    InterfaceC3290z a(String str) throws CameraUnavailableException;

    Set<String> b();

    Object c();

    D.a d();
}
