package hh;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;

/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private SurfaceHolder f135513a;

    /* renamed from: b, reason: collision with root package name */
    private SurfaceTexture f135514b;

    public j(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalArgumentException("surfaceHolder may not be null");
        }
        this.f135513a = surfaceHolder;
    }

    public void a(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.f135513a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f135514b);
        }
    }

    public j(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f135514b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}
