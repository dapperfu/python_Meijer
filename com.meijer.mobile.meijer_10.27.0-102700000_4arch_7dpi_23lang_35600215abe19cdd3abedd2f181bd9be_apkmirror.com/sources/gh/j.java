package gh;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private SurfaceHolder f133447a;

    /* renamed from: b, reason: collision with root package name */
    private SurfaceTexture f133448b;

    public j(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalArgumentException("surfaceHolder may not be null");
        }
        this.f133447a = surfaceHolder;
    }

    public void a(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.f133447a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f133448b);
        }
    }

    public j(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f133448b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}
