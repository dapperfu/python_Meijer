package com.scandit.datacapture.core.internal.module.gl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.module.ui.video.NativeCopiedCameraTexture;
import com.scandit.datacapture.core.logger.GlRenderThreadDisposedEvent;
import com.scandit.datacapture.core.logger.GlRenderThreadObtainSurfaceEvent;
import com.scandit.datacapture.core.logger.GlRenderThreadPreparedEvent;
import com.scandit.datacapture.core.logger.SdcLogger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class i extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f125584a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l parent) {
        super(parent.getLooper());
        Intrinsics.j(parent, "parent");
        this.f125584a = new WeakReference(parent);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.j(msg, "msg");
        l lVar = (l) this.f125584a.get();
        if (lVar == null) {
            return;
        }
        switch (msg.what) {
            case 1:
                Object obj = msg.obj;
                Intrinsics.h(obj, "null cannot be cast to non-null type com.scandit.datacapture.core.internal.module.gl.GlRenderThread.SurfaceTextureData");
                k kVar = (k) obj;
                lVar.f125594a = new Size2(kVar.f125590b, kVar.f125591c);
                lVar.f125595b = kVar.f125592d;
                a aVar = lVar.f125602i;
                if (aVar != null) {
                    aVar.b();
                }
                SurfaceTexture surfaceTexture = lVar.f125596c;
                if (surfaceTexture != null) {
                    kVar.f125589a.invoke(surfaceTexture);
                }
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new GlRenderThreadObtainSurfaceEvent(lVar.a()));
                return;
            case 2:
                n nVar = lVar.f125619z;
                nVar.f125622b.clear();
                Iterator it = nVar.f125623c.iterator();
                while (it.hasNext()) {
                    ((NativeCopiedCameraTexture) it.next()).releaseGlResources();
                }
                nVar.f125623c.clear();
                nVar.f125624d = null;
                nVar.f125625e = null;
                com.scandit.datacapture.core.internal.module.utils.f fVar = lVar.f125615v;
                synchronized (fVar) {
                    com.scandit.datacapture.core.internal.module.utils.c cVar = fVar.f126280b;
                    cVar.f126272b.clear();
                    cVar.f126273c = 0.0d;
                    cVar.f126274d = false;
                    com.scandit.datacapture.core.internal.module.utils.c cVar2 = fVar.f126281c;
                    cVar2.f126272b.clear();
                    cVar2.f126273c = 0.0d;
                    cVar2.f126274d = false;
                    fVar.f126283e = 0L;
                    Unit unit = Unit.f143329a;
                }
                lVar.f125613t.set(false);
                SurfaceTexture surfaceTexture2 = lVar.f125596c;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.setOnFrameAvailableListener(null);
                }
                SurfaceTexture surfaceTexture3 = lVar.f125596c;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                }
                lVar.f125596c = null;
                a aVar2 = lVar.f125602i;
                if (aVar2 != null) {
                    aVar2.a();
                }
                lVar.f125602i = null;
                lVar.f125612s.set(true);
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new GlRenderThreadDisposedEvent(lVar.a()));
                return;
            case 3:
                Choreographer choreographer = lVar.f125604k;
                if (choreographer != null) {
                    choreographer.postFrameCallback(lVar);
                    return;
                }
                return;
            case 4:
                Choreographer choreographer2 = lVar.f125604k;
                if (choreographer2 != null) {
                    Object obj2 = msg.obj;
                    Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Long");
                    choreographer2.postFrameCallbackDelayed(lVar, ((Long) obj2).longValue());
                    return;
                }
                return;
            case 5:
                lVar.f125612s.set(false);
                a aVar3 = new a();
                lVar.f125602i = aVar3;
                aVar3.b();
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                int i10 = iArr[0];
                GLES20.glBindTexture(36197, i10);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                lVar.f125599f = i10;
                SurfaceTexture surfaceTexture4 = new SurfaceTexture(lVar.f125599f);
                lVar.f125596c = surfaceTexture4;
                surfaceTexture4.setOnFrameAvailableListener(new h(lVar));
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new GlRenderThreadPreparedEvent(lVar.a()));
                return;
            case 6:
                Object obj3 = msg.obj;
                Intrinsics.h(obj3, "null cannot be cast to non-null type android.graphics.SurfaceTexture");
                SurfaceTexture surfaceTexture5 = (SurfaceTexture) obj3;
                if (lVar.f125603j.get()) {
                    a aVar4 = lVar.f125602i;
                    if (aVar4 != null) {
                        aVar4.a(lVar.f125598e);
                    }
                    a aVar5 = lVar.f125602i;
                    if (aVar5 != null) {
                        aVar5.b();
                    }
                    a aVar6 = lVar.f125602i;
                    lVar.f125598e = aVar6 != null ? aVar6.a(surfaceTexture5) : null;
                    lVar.f125597d = surfaceTexture5;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
