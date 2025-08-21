package Wd;

import Wd.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.annotation.RecentlyNonNull;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import ld.C15483a;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f40896a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f40897b;

    /* renamed from: c, reason: collision with root package name */
    private Camera f40898c;

    /* renamed from: d, reason: collision with root package name */
    private int f40899d;

    /* renamed from: e, reason: collision with root package name */
    private int f40900e;

    /* renamed from: f, reason: collision with root package name */
    private C15483a f40901f;

    /* renamed from: g, reason: collision with root package name */
    private float f40902g;

    /* renamed from: h, reason: collision with root package name */
    private int f40903h;

    /* renamed from: i, reason: collision with root package name */
    private int f40904i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f40905j;

    /* renamed from: k, reason: collision with root package name */
    private String f40906k;

    /* renamed from: l, reason: collision with root package name */
    private SurfaceTexture f40907l;

    /* renamed from: m, reason: collision with root package name */
    private Thread f40908m;

    /* renamed from: n, reason: collision with root package name */
    private b f40909n;

    /* renamed from: o, reason: collision with root package name */
    private final IdentityHashMap<byte[], ByteBuffer> f40910o;

    /* renamed from: Wd.a$a, reason: collision with other inner class name */
    public static class C0879a {

        /* renamed from: a, reason: collision with root package name */
        private final Wd.b<?> f40911a;

        /* renamed from: b, reason: collision with root package name */
        private a f40912b;

        @RecentlyNonNull
        public C0879a d(float f10) {
            if (f10 > 0.0f) {
                this.f40912b.f40902g = f10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Invalid fps: ");
            sb2.append(f10);
            throw new IllegalArgumentException(sb2.toString());
        }

        @RecentlyNonNull
        public a a() {
            a aVar = this.f40912b;
            aVar.getClass();
            aVar.f40909n = aVar.new b(this.f40911a);
            return this.f40912b;
        }

        @RecentlyNonNull
        public C0879a b(boolean z10) {
            this.f40912b.f40905j = z10;
            return this;
        }

        @RecentlyNonNull
        public C0879a c(int i10) {
            if (i10 == 0 || i10 == 1) {
                this.f40912b.f40899d = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("Invalid camera: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }

        public C0879a(@RecentlyNonNull Context context, @RecentlyNonNull Wd.b<?> bVar) {
            a aVar = new a();
            this.f40912b = aVar;
            if (context != null) {
                if (bVar != null) {
                    this.f40911a = bVar;
                    aVar.f40896a = context;
                    return;
                }
                throw new IllegalArgumentException("No detector supplied.");
            }
            throw new IllegalArgumentException("No context supplied.");
        }
    }

    private class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Wd.b<?> f40913a;

        /* renamed from: e, reason: collision with root package name */
        private long f40917e;

        /* renamed from: g, reason: collision with root package name */
        private ByteBuffer f40919g;

        /* renamed from: b, reason: collision with root package name */
        private long f40914b = SystemClock.elapsedRealtime();

        /* renamed from: c, reason: collision with root package name */
        private final Object f40915c = new Object();

        /* renamed from: d, reason: collision with root package name */
        private boolean f40916d = true;

        /* renamed from: f, reason: collision with root package name */
        private int f40918f = 0;

        b(Wd.b<?> bVar) {
            this.f40913a = bVar;
        }

        @SuppressLint({"Assert"})
        final void a() {
            Wd.b<?> bVar = this.f40913a;
            if (bVar != null) {
                bVar.d();
                this.f40913a = null;
            }
        }

        final void b(boolean z10) {
            synchronized (this.f40915c) {
                this.f40916d = z10;
                this.f40915c.notifyAll();
            }
        }

        final void c(byte[] bArr, Camera camera) {
            synchronized (this.f40915c) {
                try {
                    ByteBuffer byteBuffer = this.f40919g;
                    if (byteBuffer != null) {
                        camera.addCallbackBuffer(byteBuffer.array());
                        this.f40919g = null;
                    }
                    if (!a.this.f40910o.containsKey(bArr)) {
                        FS.log_d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                        return;
                    }
                    this.f40917e = SystemClock.elapsedRealtime() - this.f40914b;
                    this.f40918f++;
                    this.f40919g = (ByteBuffer) a.this.f40910o.get(bArr);
                    this.f40915c.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        @SuppressLint({"InlinedApi"})
        public final void run() {
            boolean z10;
            Wd.c cVarA;
            ByteBuffer byteBuffer;
            while (true) {
                synchronized (this.f40915c) {
                    while (true) {
                        z10 = this.f40916d;
                        if (!z10 || this.f40919g != null) {
                            break;
                        }
                        try {
                            this.f40915c.wait();
                        } catch (InterruptedException e10) {
                            FS.log_d("CameraSource", "Frame processing loop terminated.", e10);
                            return;
                        }
                    }
                    if (!z10) {
                        return;
                    }
                    cVarA = new c.a().c((ByteBuffer) r.l(this.f40919g), a.this.f40901f.b(), a.this.f40901f.a(), 17).b(this.f40918f).e(this.f40917e).d(a.this.f40900e).a();
                    byteBuffer = this.f40919g;
                    this.f40919g = null;
                }
                try {
                    ((Wd.b) r.l(this.f40913a)).c(cVarA);
                } catch (Exception e11) {
                    FS.log_e("CameraSource", "Exception thrown from receiver.", e11);
                } finally {
                    ((Camera) r.l(a.this.f40898c)).addCallbackBuffer(((ByteBuffer) r.l(byteBuffer)).array());
                }
            }
        }
    }

    private class c implements Camera.PreviewCallback {
        private c() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            a.this.f40909n.c(bArr, camera);
        }
    }

    @VisibleForTesting
    static class d {

        /* renamed from: a, reason: collision with root package name */
        private C15483a f40922a;

        /* renamed from: b, reason: collision with root package name */
        private C15483a f40923b;

        public final C15483a a() {
            return this.f40922a;
        }

        public final C15483a b() {
            return this.f40923b;
        }

        public d(Camera.Size size, Camera.Size size2) {
            this.f40922a = new C15483a(size.width, size.height);
            if (size2 != null) {
                this.f40923b = new C15483a(size2.width, size2.height);
            }
        }
    }

    private a() {
        this.f40897b = new Object();
        this.f40899d = 0;
        this.f40902g = 30.0f;
        this.f40903h = 1024;
        this.f40904i = 768;
        this.f40905j = false;
        this.f40910o = new IdentityHashMap<>();
    }

    @SuppressLint({"InlinedApi"})
    private final Camera g() throws IOException {
        int i10;
        int i11;
        int i12 = this.f40899d;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= Camera.getNumberOfCameras()) {
                i14 = -1;
                break;
            }
            Camera.getCameraInfo(i14, cameraInfo);
            if (cameraInfo.facing == i12) {
                break;
            }
            i14++;
        }
        if (i14 == -1) {
            throw new IOException("Could not find requested camera.");
        }
        Camera cameraOpen = Camera.open(i14);
        int i15 = this.f40903h;
        int i16 = this.f40904i;
        Camera.Parameters parameters = cameraOpen.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPreviewSizes) {
            float f10 = size.width / size.height;
            Iterator<Camera.Size> it = supportedPictureSizes.iterator();
            while (true) {
                if (it.hasNext()) {
                    Camera.Size next = it.next();
                    if (Math.abs(f10 - (next.width / next.height)) < 0.01f) {
                        arrayList.add(new d(size, next));
                        break;
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            FS.log_w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
            Iterator<Camera.Size> it2 = supportedPreviewSizes.iterator();
            while (it2.hasNext()) {
                arrayList.add(new d(it2.next(), null));
            }
        }
        int size2 = arrayList.size();
        int i17 = a.e.API_PRIORITY_OTHER;
        int i18 = 0;
        int i19 = Integer.MAX_VALUE;
        d dVar = null;
        while (i18 < size2) {
            Object obj = arrayList.get(i18);
            i18++;
            d dVar2 = (d) obj;
            C15483a c15483aA = dVar2.a();
            int iAbs = Math.abs(c15483aA.b() - i15) + Math.abs(c15483aA.a() - i16);
            if (iAbs < i19) {
                dVar = dVar2;
                i19 = iAbs;
            }
        }
        d dVar3 = (d) r.l(dVar);
        if (dVar3 == null) {
            throw new IOException("Could not find suitable preview size.");
        }
        C15483a c15483aB = dVar3.b();
        this.f40901f = dVar3.a();
        int i20 = (int) (this.f40902g * 1000.0f);
        int[] iArr = null;
        for (int[] iArr2 : cameraOpen.getParameters().getSupportedPreviewFpsRange()) {
            int iAbs2 = Math.abs(i20 - iArr2[0]) + Math.abs(i20 - iArr2[1]);
            if (iAbs2 < i17) {
                iArr = iArr2;
                i17 = iAbs2;
            }
        }
        int[] iArr3 = (int[]) r.l(iArr);
        if (iArr3 == null) {
            throw new IOException("Could not find suitable preview frames per second range.");
        }
        Camera.Parameters parameters2 = cameraOpen.getParameters();
        if (c15483aB != null) {
            parameters2.setPictureSize(c15483aB.b(), c15483aB.a());
        }
        parameters2.setPreviewSize(this.f40901f.b(), this.f40901f.a());
        parameters2.setPreviewFpsRange(iArr3[0], iArr3[1]);
        parameters2.setPreviewFormat(17);
        int rotation = ((WindowManager) r.l((WindowManager) this.f40896a.getSystemService("window"))).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i13 = 90;
            } else if (rotation == 2) {
                i13 = 180;
            } else if (rotation != 3) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Bad rotation value: ");
                sb2.append(rotation);
                FS.log_e("CameraSource", sb2.toString());
            } else {
                i13 = 270;
            }
        }
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i14, cameraInfo2);
        if (cameraInfo2.facing == 1) {
            i10 = (cameraInfo2.orientation + i13) % 360;
            i11 = (360 - i10) % 360;
        } else {
            i10 = ((cameraInfo2.orientation - i13) + 360) % 360;
            i11 = i10;
        }
        this.f40900e = i10 / 90;
        cameraOpen.setDisplayOrientation(i11);
        parameters2.setRotation(i10);
        if (this.f40906k != null) {
            if (parameters2.getSupportedFocusModes().contains(this.f40906k)) {
                parameters2.setFocusMode((String) r.l(this.f40906k));
            } else {
                FS.log_w("CameraSource", String.format("FocusMode %s is not supported on this device.", this.f40906k));
                this.f40906k = null;
            }
        }
        if (this.f40906k == null && this.f40905j) {
            if (parameters2.getSupportedFocusModes().contains("continuous-video")) {
                parameters2.setFocusMode("continuous-video");
                this.f40906k = "continuous-video";
            } else {
                FS.log_i("CameraSource", "Camera auto focus is not supported on this device.");
            }
        }
        cameraOpen.setParameters(parameters2);
        cameraOpen.setPreviewCallbackWithBuffer(new c());
        cameraOpen.addCallbackBuffer(i(this.f40901f));
        cameraOpen.addCallbackBuffer(i(this.f40901f));
        cameraOpen.addCallbackBuffer(i(this.f40901f));
        cameraOpen.addCallbackBuffer(i(this.f40901f));
        return cameraOpen;
    }

    @SuppressLint({"InlinedApi"})
    private final byte[] i(C15483a c15483a) {
        byte[] bArr = new byte[((int) Math.ceil(((c15483a.a() * c15483a.b()) * ImageFormat.getBitsPerPixel(17)) / 8.0d)) + 1];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (!byteBufferWrap.hasArray() || byteBufferWrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.f40910o.put(bArr, byteBufferWrap);
        return bArr;
    }

    public void a() {
        synchronized (this.f40897b) {
            c();
            this.f40909n.a();
        }
    }

    @RecentlyNonNull
    public a b(@RecentlyNonNull SurfaceHolder surfaceHolder) throws IOException {
        synchronized (this.f40897b) {
            try {
                if (this.f40898c != null) {
                    return this;
                }
                Camera cameraG = g();
                this.f40898c = cameraG;
                cameraG.setPreviewDisplay(surfaceHolder);
                this.f40898c.startPreview();
                this.f40908m = new Thread(this.f40909n);
                this.f40909n.b(true);
                Thread thread = this.f40908m;
                if (thread != null) {
                    thread.start();
                }
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021 A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000e, B:12:0x001b, B:13:0x001d, B:15:0x0021, B:16:0x0029, B:20:0x0057, B:19:0x0037, B:21:0x0064, B:22:0x0069, B:11:0x0014), top: B:28:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[Catch: all -> 0x0012, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000e, B:12:0x001b, B:13:0x001d, B:15:0x0021, B:16:0x0029, B:20:0x0057, B:19:0x0037, B:21:0x0064, B:22:0x0069, B:11:0x0014), top: B:28:0x0003, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f40897b
            monitor-enter(r0)
            Wd.a$b r1 = r6.f40909n     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.b(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.Thread r1 = r6.f40908m     // Catch: java.lang.Throwable -> L12
            r2 = 0
            if (r1 == 0) goto L1d
            r1.join()     // Catch: java.lang.Throwable -> L12 java.lang.InterruptedException -> L14
            goto L1b
        L12:
            r1 = move-exception
            goto L6b
        L14:
            java.lang.String r1 = "CameraSource"
            java.lang.String r3 = "Frame processing thread interrupted on release."
            com.fullstory.FS.log_d(r1, r3)     // Catch: java.lang.Throwable -> L12
        L1b:
            r6.f40908m = r2     // Catch: java.lang.Throwable -> L12
        L1d:
            android.hardware.Camera r1 = r6.f40898c     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L64
            r1.stopPreview()     // Catch: java.lang.Throwable -> L12
            android.hardware.Camera r1 = r6.f40898c     // Catch: java.lang.Throwable -> L12
            r1.setPreviewCallbackWithBuffer(r2)     // Catch: java.lang.Throwable -> L12
            android.hardware.Camera r1 = r6.f40898c     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L36
            r1.setPreviewTexture(r2)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L36
            r6.f40907l = r2     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L36
            android.hardware.Camera r1 = r6.f40898c     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L36
            r1.setPreviewDisplay(r2)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L36
            goto L57
        L36:
            r1 = move-exception
            java.lang.String r3 = "CameraSource"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L12
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L12
            int r4 = r4 + 32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "Failed to clear camera preview: "
            r5.append(r4)     // Catch: java.lang.Throwable -> L12
            r5.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L12
            com.fullstory.FS.log_e(r3, r1)     // Catch: java.lang.Throwable -> L12
        L57:
            android.hardware.Camera r1 = r6.f40898c     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = com.google.android.gms.common.internal.r.l(r1)     // Catch: java.lang.Throwable -> L12
            android.hardware.Camera r1 = (android.hardware.Camera) r1     // Catch: java.lang.Throwable -> L12
            r1.release()     // Catch: java.lang.Throwable -> L12
            r6.f40898c = r2     // Catch: java.lang.Throwable -> L12
        L64:
            java.util.IdentityHashMap<byte[], java.nio.ByteBuffer> r1 = r6.f40910o     // Catch: java.lang.Throwable -> L12
            r1.clear()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Wd.a.c():void");
    }
}
