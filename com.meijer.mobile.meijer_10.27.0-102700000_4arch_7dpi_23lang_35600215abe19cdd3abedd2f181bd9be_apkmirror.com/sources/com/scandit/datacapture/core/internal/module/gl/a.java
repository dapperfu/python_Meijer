package com.scandit.datacapture.core.internal.module.gl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.scandit.datacapture.core.logger.CreateDummySurface;
import com.scandit.datacapture.core.logger.SdcLogger;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final EGLDisplay f124618a;

    /* renamed from: b, reason: collision with root package name */
    public final EGLContext f124619b;

    /* renamed from: c, reason: collision with root package name */
    public final EGLConfig f124620c;

    /* renamed from: d, reason: collision with root package name */
    public final EGLSurface f124621d;

    public final void a() {
        EGLSurface eGLSurface = this.f124621d;
        if (eGLSurface != null) {
            EGL14.eglDestroySurface(this.f124618a, eGLSurface);
        }
        EGL14.eglDestroyContext(this.f124618a, this.f124619b);
    }

    public final void b() {
        EGLSurface eGLSurface = this.f124621d;
        if (eGLSurface == null) {
            EGLDisplay eGLDisplay = this.f124618a;
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.f124619b);
        } else {
            EGL14.eglMakeCurrent(this.f124618a, eGLSurface, eGLSurface, this.f124619b);
        }
        a("makeCurrentWithoutSurface");
    }

    public final void c(EGLSurface surface) {
        Intrinsics.j(surface, "surface");
        EGL14.eglSwapBuffers(this.f124618a, surface);
    }

    public a() {
        EGLConfig eGLConfig;
        List listA1;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        Intrinsics.i(eGLDisplayEglGetDisplay, "eglGetDisplay(...)");
        this.f124618a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGLSurface eGLSurfaceEglCreatePbufferSurface = null;
                if (EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    eGLConfig = eGLConfigArr[0];
                } else {
                    eGLConfig = null;
                }
                if (eGLConfig != null) {
                    this.f124620c = eGLConfig;
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    Intrinsics.i(eGLContextEglCreateContext, "eglCreateContext(...)");
                    this.f124619b = eGLContextEglCreateContext;
                    a("eglCreateContext");
                    String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
                    List listM = (strEglQueryString == null || (listM = StringsKt.a1(strEglQueryString, new String[]{" "}, false, 0, 6, null)) == null) ? CollectionsKt.m() : listM;
                    if (!listM.contains("EGL_KHR_surfaceless_context")) {
                        String strEglQueryString2 = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12371);
                        String strEglQueryString3 = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12372);
                        String strEglQueryString4 = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12429);
                        SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CreateDummySurface(strEglQueryString2, strEglQueryString3, (strEglQueryString4 == null || (listA1 = StringsKt.a1(strEglQueryString4, new String[]{" "}, false, 0, 6, null)) == null) ? CollectionsKt.m() : listA1, listM));
                        eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 32, 12374, 32, 12344}, 0);
                        a("createOffscreenSurface");
                        Intrinsics.g(eGLSurfaceEglCreatePbufferSurface);
                    }
                    this.f124621d = eGLSurfaceEglCreatePbufferSurface;
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            throw new IllegalStateException("unable to initialize EGL14");
        }
        throw new IllegalStateException("unable to get EGL14 display");
    }

    public static void a(String str) {
        c cVar;
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(": ");
        c.f124622c.getClass();
        c[] cVarArrValues = c.values();
        int length = cVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i10];
            if (cVar.f124624a == iEglGetError) {
                break;
            } else {
                i10++;
            }
        }
        if (cVar != null) {
            StringBuilder sb3 = new StringBuilder("EglError ");
            sb3.append(cVar.name());
            sb3.append('(');
            b bVar = c.f124622c;
            int i11 = cVar.f124624a;
            bVar.getClass();
            sb3.append("0x" + Integer.toHexString(i11));
            sb3.append("): ");
            sb3.append(cVar.f124625b);
            sb2.append(sb3.toString());
            throw new IllegalStateException(sb2.toString().toString());
        }
        StringBuilder sb4 = new StringBuilder("Unknown EGL error code: ");
        c.f124622c.getClass();
        sb4.append("0x" + Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sb4.toString().toString());
    }

    public final boolean b(EGLSurface readAndWriteSurface) {
        Intrinsics.j(readAndWriteSurface, "readAndWriteSurface");
        EGL14.eglMakeCurrent(this.f124618a, readAndWriteSurface, readAndWriteSurface, this.f124619b);
        return EGL14.eglGetError() == 12288;
    }

    public final EGLSurface a(SurfaceTexture surface) {
        Intrinsics.j(surface, "surface");
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f124618a, this.f124620c, surface, new int[]{12344}, 0);
        a("createWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("returned EGL surface is null");
    }

    public final void a(EGLSurface eGLSurface) {
        if (eGLSurface != null) {
            EGL14.eglDestroySurface(this.f124618a, eGLSurface);
            a("destroySurface");
        }
    }
}
