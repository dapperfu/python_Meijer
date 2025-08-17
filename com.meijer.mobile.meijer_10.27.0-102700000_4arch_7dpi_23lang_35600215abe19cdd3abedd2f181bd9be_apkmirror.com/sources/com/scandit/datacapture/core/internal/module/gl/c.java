package com.scandit.datacapture.core.internal.module.gl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final b f124622c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f124623d;

    /* renamed from: a, reason: collision with root package name */
    public final int f124624a;

    /* renamed from: b, reason: collision with root package name */
    public final String f124625b;

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f124623d.clone();
    }

    static {
        c[] cVarArr = {new c("EGL_SUCCESS", 0, 12288, "The last function succeeded without error."), new c("EGL_NOT_INITIALIZED", 1, 12289, "EGL is not initialized, or could not be initialized, for the specified EGL display connection."), new c("EGL_BAD_ACCESS", 2, 12290, "EGL cannot access a requested resource (for example a context is bound in another thread)."), new c("EGL_BAD_ALLOC", 3, 12291, "EGL failed to allocate resources for the requested operation."), new c("EGL_BAD_ATTRIBUTE", 4, 12292, "An unrecognized attribute or attribute value was passed in the attribute list."), new c("EGL_BAD_CONFIG", 5, 12293, "An EGLConfig argument does not name a valid EGL frame buffer configuration."), new c("EGL_BAD_CONTEXT", 6, 12294, "An EGLContext argument does not name a valid EGL rendering context."), new c("EGL_BAD_CURRENT_SURFACE", 7, 12295, "The current surface of the calling thread is a window, pixel buffer or pixmap that is no longer valid."), new c("EGL_BAD_DISPLAY", 8, 12296, "An EGLDisplay argument does not name a valid EGL display connection."), new c("EGL_BAD_MATCH", 9, 12297, "Arguments are inconsistent (for example, a valid context requires buffers not supplied by a valid surface)."), new c("EGL_BAD_NATIVE_PIXMAP", 10, 12298, "A NativePixmapType argument does not refer to a valid native pixmap."), new c("EGL_BAD_NATIVE_WINDOW", 11, 12299, "A NativeWindowType argument does not refer to a valid native window."), new c("EGL_BAD_PARAMETER", 12, 12300, "One or more argument values are invalid."), new c("EGL_BAD_SURFACE", 13, 12301, "An EGLSurface argument does not name a valid surface (window, pixel buffer or pixmap) configured for GL rendering."), new c("EGL_CONTEXT_LOST", 14, 12302, "A power management event has occurred. The application must destroy all contexts and reinitialise OpenGL ES state and objects to continue rendering.")};
        f124623d = cVarArr;
        EnumEntriesKt.a(cVarArr);
        f124622c = new b();
    }

    public c(String str, int i10, int i11, String str2) {
        this.f124624a = i11;
        this.f124625b = str2;
    }
}
