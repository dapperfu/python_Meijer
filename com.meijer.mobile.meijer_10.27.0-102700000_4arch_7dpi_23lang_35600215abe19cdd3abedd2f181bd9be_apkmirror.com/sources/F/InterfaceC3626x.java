package F;

import C.C2972o;
import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.Set;

/* renamed from: F.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3626x {

    /* renamed from: F.x$a */
    public interface a {
        InterfaceC3626x a(Context context, F f10, C2972o c2972o, long j10) throws InitializationException;
    }

    InterfaceC3628z a(String str) throws CameraUnavailableException;

    Set<String> b();

    Object c();

    D.a d();
}
