package com.scandit.datacapture.core.internal.module.source;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.fullstory.FS;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13506w {

    /* renamed from: a, reason: collision with root package name */
    public Camera f126078a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f126079b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public Camera.Parameters f126080c;

    public final boolean a(SurfaceTexture texture) throws IOException {
        Intrinsics.j(texture, "texture");
        Camera camera = this.f126078a;
        if (camera == null) {
            return false;
        }
        try {
            camera.setPreviewTexture(texture);
            camera.setDisplayOrientation(0);
            return true;
        } catch (IOException e10) {
            Intrinsics.j(e10, "e");
            e10.printStackTrace();
            return false;
        } catch (RuntimeException e11) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Either the Camera object has been released or a hardware or other low-level error occurred", e11);
            return false;
        }
    }

    public final boolean a() {
        try {
            Camera camera = this.f126078a;
            if (camera != null) {
                camera.cancelAutoFocus();
            }
        } catch (Exception unused) {
            Intrinsics.j("cancelAutoFocus failed", "message");
            FS.log_i("sdc-core", "cancelAutoFocus failed");
        }
        try {
            Camera camera2 = this.f126078a;
            if (camera2 != null) {
                camera2.autoFocus(null);
            }
            return true;
        } catch (Exception unused2) {
            Intrinsics.j("autoFocus failed", "message");
            FS.log_e("sdc-core", "autoFocus failed");
            return false;
        }
    }

    public final boolean a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        Camera camera = this.f126078a;
        if (camera == null) {
            Intrinsics.j("No camera. failed to set camera parameters", "message");
            FS.log_e("sdc-core", "No camera. failed to set camera parameters");
            return false;
        }
        try {
            camera.setParameters(camParams);
            this.f126080c = camParams;
            return true;
        } catch (Exception unused) {
            Intrinsics.j("Failed to set camera parameters", "message");
            FS.log_e("sdc-core", "Failed to set camera parameters");
            return false;
        }
    }
}
