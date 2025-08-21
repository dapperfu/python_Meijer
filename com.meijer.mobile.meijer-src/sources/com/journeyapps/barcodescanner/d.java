package com.journeyapps.barcodescanner;

import Gg.e;
import Gg.h;
import Gg.n;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import com.fullstory.FS;
import com.google.zxing.o;
import com.journeyapps.barcodescanner.CameraPreview;
import gh.C14367c;
import gh.InterfaceC14365a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: o, reason: collision with root package name */
    private static final String f91813o = "d";

    /* renamed from: p, reason: collision with root package name */
    private static int f91814p = 250;

    /* renamed from: a, reason: collision with root package name */
    private Activity f91815a;

    /* renamed from: b, reason: collision with root package name */
    private DecoratedBarcodeView f91816b;

    /* renamed from: h, reason: collision with root package name */
    private h f91822h;

    /* renamed from: i, reason: collision with root package name */
    private e f91823i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f91824j;

    /* renamed from: m, reason: collision with root package name */
    private final CameraPreview.f f91827m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f91828n;

    /* renamed from: c, reason: collision with root package name */
    private int f91817c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f91818d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f91819e = true;

    /* renamed from: f, reason: collision with root package name */
    private String f91820f = "";

    /* renamed from: g, reason: collision with root package name */
    private boolean f91821g = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f91825k = false;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC14365a f91826l = new a();

    class a implements InterfaceC14365a {
        @Override // gh.InterfaceC14365a
        public void a(List<o> list) {
        }

        a() {
        }

        @Override // gh.InterfaceC14365a
        public void b(final C14367c c14367c) {
            d.this.f91816b.e();
            d.this.f91823i.d();
            d.this.f91824j.post(new Runnable() { // from class: com.journeyapps.barcodescanner.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.y(c14367c);
                }
            });
        }
    }

    class b implements CameraPreview.f {
        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void a() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void d() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void e() {
        }

        b() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void b() {
            if (d.this.f91825k) {
                FS.log_d(d.f91813o, "Camera closed; finishing activity");
                d.this.n();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void c(Exception exc) {
            d dVar = d.this;
            dVar.m(dVar.f91815a.getString(n.f12581c));
        }
    }

    public void r() {
        this.f91821g = true;
        this.f91822h.d();
        this.f91824j.removeCallbacksAndMessages(null);
    }

    private void A() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("MISSING_CAMERA_PERMISSION", true);
        this.f91815a.setResult(0, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.f91815a.finish();
    }

    private String o(C14367c c14367c) throws IOException {
        if (!this.f91818d) {
            return null;
        }
        Bitmap bitmapB = c14367c.b();
        try {
            File fileCreateTempFile = File.createTempFile("barcodeimage", ".jpg", this.f91815a.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            bitmapB.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            return fileCreateTempFile.getAbsolutePath();
        } catch (IOException e10) {
            FS.log_w(f91813o, "Unable to create temporary file and store bitmap! " + e10);
            return null;
        }
    }

    @TargetApi(23)
    private void w() {
        if (Z1.b.a(this.f91815a, "android.permission.CAMERA") == 0) {
            this.f91816b.g();
        } else {
            if (this.f91828n) {
                return;
            }
            androidx.core.app.b.v(this.f91815a, new String[]{"android.permission.CAMERA"}, f91814p);
            this.f91828n = true;
        }
    }

    public static Intent x(C14367c c14367c, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", c14367c.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", c14367c.a().toString());
        byte[] bArrC = c14367c.c();
        if (bArrC != null && bArrC.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", bArrC);
        }
        Map<com.google.zxing.n, Object> mapD = c14367c.d();
        if (mapD != null) {
            com.google.zxing.n nVar = com.google.zxing.n.UPC_EAN_EXTENSION;
            if (mapD.containsKey(nVar)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", mapD.get(nVar).toString());
            }
            Number number = (Number) mapD.get(com.google.zxing.n.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) mapD.get(com.google.zxing.n.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable iterable = (Iterable) mapD.get(com.google.zxing.n.BYTE_SEGMENTS);
            if (iterable != null) {
                Iterator it = iterable.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i10, (byte[]) it.next());
                    i10++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    public void B(boolean z10, String str) {
        this.f91819e = z10;
        if (str == null) {
            str = "";
        }
        this.f91820f = str;
    }

    protected void k() {
        if (this.f91816b.getBarcodeView().s()) {
            n();
        } else {
            this.f91825k = true;
        }
        this.f91816b.e();
        this.f91822h.d();
    }

    public void l() {
        this.f91816b.b(this.f91826l);
    }

    protected void m(String str) {
        if (this.f91815a.isFinishing() || this.f91821g || this.f91825k) {
            return;
        }
        if (str.isEmpty()) {
            str = this.f91815a.getString(n.f12581c);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f91815a);
        builder.setTitle(this.f91815a.getString(n.f12579a));
        builder.setMessage(str);
        builder.setPositiveButton(n.f12580b, new DialogInterface.OnClickListener() { // from class: gh.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f134201a.n();
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: gh.f
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f134202a.n();
            }
        });
        builder.show();
    }

    public void p(Intent intent, Bundle bundle) {
        this.f91815a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f91817c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                q();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f91816b.d(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f91823i.e(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                B(intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true), intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"));
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f91824j.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f91810a.z();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f91818d = true;
            }
        }
    }

    protected void q() {
        if (this.f91817c == -1) {
            int rotation = this.f91815a.getWindowManager().getDefaultDisplay().getRotation();
            int i10 = this.f91815a.getResources().getConfiguration().orientation;
            int i11 = 0;
            if (i10 == 2) {
                if (rotation != 0 && rotation != 1) {
                    i11 = 8;
                }
            } else if (i10 == 1) {
                i11 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f91817c = i11;
        }
        this.f91815a.setRequestedOrientation(this.f91817c);
    }

    public void s() throws InterruptedException {
        this.f91822h.d();
        this.f91816b.f();
    }

    public void t(int i10, String[] strArr, int[] iArr) {
        if (i10 == f91814p) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f91816b.g();
                return;
            }
            A();
            if (this.f91819e) {
                m(this.f91820f);
            } else {
                k();
            }
        }
    }

    public void v(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f91817c);
    }

    protected void z() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f91815a.setResult(0, intent);
        k();
    }

    public d(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f91827m = bVar;
        this.f91828n = false;
        this.f91815a = activity;
        this.f91816b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().i(bVar);
        this.f91824j = new Handler();
        this.f91822h = new h(activity, new Runnable() { // from class: gh.d
            @Override // java.lang.Runnable
            public final void run() {
                com.journeyapps.barcodescanner.d.c(this.f134200a);
            }
        });
        this.f91823i = new e(activity);
    }

    public static /* synthetic */ void c(d dVar) {
        dVar.getClass();
        FS.log_d(f91813o, "Finishing due to inactivity");
        dVar.n();
    }

    public void u() {
        w();
        this.f91822h.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void y(C14367c c14367c) {
        this.f91815a.setResult(-1, x(c14367c, o(c14367c)));
        k();
    }
}
