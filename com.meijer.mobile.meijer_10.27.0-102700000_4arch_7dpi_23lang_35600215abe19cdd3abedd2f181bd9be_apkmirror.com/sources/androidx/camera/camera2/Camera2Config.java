package androidx.camera.camera2;

import C.C2972o;
import C.C2977u;
import F.F;
import F.InterfaceC3625w;
import F.InterfaceC3626x;
import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.E;
import java.util.Set;
import v.C17424w;
import v.F0;
import v.K0;

/* loaded from: classes.dex */
public final class Camera2Config {

    public static final class DefaultProvider implements C2977u.b {
        @Override // C.C2977u.b
        public C2977u getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static /* synthetic */ E a(Context context) {
        return new K0(context);
    }

    public static /* synthetic */ InterfaceC3625w b(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new F0(context, obj, set);
        } catch (CameraUnavailableException e10) {
            throw new InitializationException(e10);
        }
    }

    public static C2977u c() {
        InterfaceC3626x.a aVar = new InterfaceC3626x.a() { // from class: t.a
            @Override // F.InterfaceC3626x.a
            public final InterfaceC3626x a(Context context, F f10, C2972o c2972o, long j10) {
                return new C17424w(context, f10, c2972o, j10);
            }
        };
        InterfaceC3625w.a aVar2 = new InterfaceC3625w.a() { // from class: t.b
            @Override // F.InterfaceC3625w.a
            public final InterfaceC3625w a(Context context, Object obj, Set set) {
                return Camera2Config.b(context, obj, set);
            }
        };
        return new C2977u.a().c(aVar).d(aVar2).g(new E.c() { // from class: t.c
            @Override // androidx.camera.core.impl.E.c
            public final E a(Context context) {
                return Camera2Config.a(context);
            }
        }).a();
    }
}
