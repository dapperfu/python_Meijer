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

/* loaded from: classes11.dex */
public final class i extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124632a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l parent) {
        super(parent.getLooper());
        Intrinsics.j(parent, "parent");
        this.f124632a = new WeakReference(parent);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.j(msg, "msg");
        l lVar = (l) this.f124632a.get();
        if (lVar == null) {
            return;
        }
        switch (msg.what) {
            case 1:
                Object obj = msg.obj;
                Intrinsics.h(obj, "null cannot be cast to non-null type com.scandit.datacapture.core.internal.module.gl.GlRenderThread.SurfaceTextureData");
                k kVar = (k) obj;
                lVar.f124642a = new Size2(kVar.f124638b, kVar.f124639c);
                lVar.f124643b = kVar.f124640d;
                a aVar = lVar.f124650i;
                if (aVar != null) {
                    aVar.b();
                }
                SurfaceTexture surfaceTexture = lVar.f124644c;
                if (surfaceTexture != null) {
                    kVar.f124637a.invoke(surfaceTexture);
                }
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new GlRenderThreadObtainSurfaceEvent(lVar.a()));
                return;
            case 2:
                n nVar = lVar.f124667z;
                nVar.f124670b.clear();
                Iterator it = nVar.f124671c.iterator();
                while (it.hasNext()) {
                    ((NativeCopiedCameraTexture) it.next()).releaseGlResources();
                }
                nVar.f124671c.clear();
                nVar.f124672d = null;
                nVar.f124673e = null;
                com.scandit.datacapture.core.internal.module.utils.f fVar = lVar.f124663v;
                synchronized (fVar) {
                    com.scandit.datacapture.core.internal.module.utils.c cVar = fVar.f125328b;
                    cVar.f125320b.clear();
                    cVar.f125321c = 0.0d;
                    cVar.f125322d = false;
                    com.scandit.datacapture.core.internal.module.utils.c cVar2 = fVar.f125329c;
                    cVar2.f125320b.clear();
                    cVar2.f125321c = 0.0d;
                    cVar2.f125322d = false;
                    fVar.f125331e = 0L;
                    Unit unit = Unit.f142422a;
                }
                lVar.f124661t.set(false);
                SurfaceTexture surfaceTexture2 = lVar.f124644c;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.setOnFrameAvailableListener(null);
                }
                SurfaceTexture surfaceTexture3 = lVar.f124644c;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                }
                lVar.f124644c = null;
                a aVar2 = lVar.f124650i;
                if (aVar2 != null) {
                    aVar2.a();
                }
                lVar.f124650i = null;
                lVar.f124660s.set(true);
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new GlRenderThreadDisposedEvent(lVar.a()));
                return;
            case 3:
                Choreographer choreographer = lVar.f124652k;
                if (choreographer != null) {
                    choreographer.postFrameCallback(lVar);
                    return;
                }
                return;
            case 4:
                Choreographer choreographer2 = lVar.f124652k;
                if (choreographer2 != null) {
                    Object obj2 = msg.obj;
                    Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Long");
                    choreographer2.postFrameCallbackDelayed(lVar, ((Long) obj2).longValue());
                    return;
                }
                return;
            case 5:
                lVar.f124660s.set(false);
                a aVar3 = new a();
                lVar.f124650i = aVar3;
                aVar3.b();
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                int i10 = iArr[0];
                GLES20.glBindTexture(36197, i10);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                lVar.f124647f = i10;
                SurfaceTexture surfaceTexture4 = new SurfaceTexture(lVar.f124647f);
                lVar.f124644c = surfaceTexture4;
                surfaceTexture4.setOnFrameAvailableListener(new h(lVar));
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new GlRenderThreadPreparedEvent(lVar.a()));
                return;
            case 6:
                Object obj3 = msg.obj;
                Intrinsics.h(obj3, "null cannot be cast to non-null type android.graphics.SurfaceTexture");
                SurfaceTexture surfaceTexture5 = (SurfaceTexture) obj3;
                if (lVar.f124651j.get()) {
                    a aVar4 = lVar.f124650i;
                    if (aVar4 != null) {
                        aVar4.a(lVar.f124646e);
                    }
                    a aVar5 = lVar.f124650i;
                    if (aVar5 != null) {
                        aVar5.b();
                    }
                    a aVar6 = lVar.f124650i;
                    lVar.f124646e = aVar6 != null ? aVar6.a(surfaceTexture5) : null;
                    lVar.f124645d = surfaceTexture5;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
