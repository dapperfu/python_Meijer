package androidx.camera.camera2;

import C.C3030o;
import C.C3035u;
import F.F;
import F.InterfaceC3287w;
import F.InterfaceC3288x;
import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.E;
import java.util.Set;
import v.C17563w;
import v.F0;
import v.K0;

/* loaded from: classes.dex */
public final class Camera2Config {

    public static final class DefaultProvider implements C3035u.b {
        @Override // C.C3035u.b
        public C3035u getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static /* synthetic */ E a(Context context) {
        return new K0(context);
    }

    public static /* synthetic */ InterfaceC3287w b(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new F0(context, obj, set);
        } catch (CameraUnavailableException e10) {
            throw new InitializationException(e10);
        }
    }

    public static C3035u c() {
        InterfaceC3288x.a aVar = new InterfaceC3288x.a() { // from class: t.a
            @Override // F.InterfaceC3288x.a
            public final InterfaceC3288x a(Context context, F f10, C3030o c3030o, long j10) {
                return new C17563w(context, f10, c3030o, j10);
            }
        };
        InterfaceC3287w.a aVar2 = new InterfaceC3287w.a() { // from class: t.b
            @Override // F.InterfaceC3287w.a
            public final InterfaceC3287w a(Context context, Object obj, Set set) {
                return Camera2Config.b(context, obj, set);
            }
        };
        return new C3035u.a().c(aVar).d(aVar2).g(new E.c() { // from class: t.c
            @Override // androidx.camera.core.impl.E.c
            public final E a(Context context) {
                return Camera2Config.a(context);
            }
        }).a();
    }
}
