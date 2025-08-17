package com.journeyapps.barcodescanner;

import Eg.e;
import Eg.h;
import Eg.n;
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
import fh.C13894c;
import fh.InterfaceC13892a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: o, reason: collision with root package name */
    private static final String f90974o = "d";

    /* renamed from: p, reason: collision with root package name */
    private static int f90975p = 250;

    /* renamed from: a, reason: collision with root package name */
    private Activity f90976a;

    /* renamed from: b, reason: collision with root package name */
    private DecoratedBarcodeView f90977b;

    /* renamed from: h, reason: collision with root package name */
    private h f90983h;

    /* renamed from: i, reason: collision with root package name */
    private e f90984i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f90985j;

    /* renamed from: m, reason: collision with root package name */
    private final CameraPreview.f f90988m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f90989n;

    /* renamed from: c, reason: collision with root package name */
    private int f90978c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f90979d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f90980e = true;

    /* renamed from: f, reason: collision with root package name */
    private String f90981f = "";

    /* renamed from: g, reason: collision with root package name */
    private boolean f90982g = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f90986k = false;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC13892a f90987l = new a();

    class a implements InterfaceC13892a {
        @Override // fh.InterfaceC13892a
        public void b(List<o> list) {
        }

        a() {
        }

        @Override // fh.InterfaceC13892a
        public void a(final C13894c c13894c) {
            d.this.f90977b.e();
            d.this.f90984i.d();
            d.this.f90985j.post(new Runnable() { // from class: com.journeyapps.barcodescanner.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.y(c13894c);
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
            if (d.this.f90986k) {
                FS.log_d(d.f90974o, "Camera closed; finishing activity");
                d.this.n();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void c(Exception exc) {
            d dVar = d.this;
            dVar.m(dVar.f90976a.getString(n.f9029c));
        }
    }

    public void r() {
        this.f90982g = true;
        this.f90983h.d();
        this.f90985j.removeCallbacksAndMessages(null);
    }

    private void A() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("MISSING_CAMERA_PERMISSION", true);
        this.f90976a.setResult(0, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.f90976a.finish();
    }

    private String o(C13894c c13894c) throws IOException {
        if (!this.f90979d) {
            return null;
        }
        Bitmap bitmapB = c13894c.b();
        try {
            File fileCreateTempFile = File.createTempFile("barcodeimage", ".jpg", this.f90976a.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            bitmapB.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            return fileCreateTempFile.getAbsolutePath();
        } catch (IOException e10) {
            FS.log_w(f90974o, "Unable to create temporary file and store bitmap! " + e10);
            return null;
        }
    }

    @TargetApi(23)
    private void w() {
        if (Z1.b.a(this.f90976a, "android.permission.CAMERA") == 0) {
            this.f90977b.g();
        } else {
            if (this.f90989n) {
                return;
            }
            androidx.core.app.b.v(this.f90976a, new String[]{"android.permission.CAMERA"}, f90975p);
            this.f90989n = true;
        }
    }

    public static Intent x(C13894c c13894c, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", c13894c.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", c13894c.a().toString());
        byte[] bArrC = c13894c.c();
        if (bArrC != null && bArrC.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", bArrC);
        }
        Map<com.google.zxing.n, Object> mapD = c13894c.d();
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
        this.f90980e = z10;
        if (str == null) {
            str = "";
        }
        this.f90981f = str;
    }

    protected void k() {
        if (this.f90977b.getBarcodeView().s()) {
            n();
        } else {
            this.f90986k = true;
        }
        this.f90977b.e();
        this.f90983h.d();
    }

    public void l() {
        this.f90977b.b(this.f90987l);
    }

    protected void m(String str) {
        if (this.f90976a.isFinishing() || this.f90982g || this.f90986k) {
            return;
        }
        if (str.isEmpty()) {
            str = this.f90976a.getString(n.f9029c);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f90976a);
        builder.setTitle(this.f90976a.getString(n.f9027a));
        builder.setMessage(str);
        builder.setPositiveButton(n.f9028b, new DialogInterface.OnClickListener() { // from class: fh.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f131102a.n();
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: fh.f
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f131103a.n();
            }
        });
        builder.show();
    }

    public void p(Intent intent, Bundle bundle) {
        this.f90976a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f90978c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                q();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f90977b.d(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f90984i.e(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                B(intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true), intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"));
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f90985j.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f90971a.z();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f90979d = true;
            }
        }
    }

    protected void q() {
        if (this.f90978c == -1) {
            int rotation = this.f90976a.getWindowManager().getDefaultDisplay().getRotation();
            int i10 = this.f90976a.getResources().getConfiguration().orientation;
            int i11 = 0;
            if (i10 == 2) {
                if (rotation != 0 && rotation != 1) {
                    i11 = 8;
                }
            } else if (i10 == 1) {
                i11 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f90978c = i11;
        }
        this.f90976a.setRequestedOrientation(this.f90978c);
    }

    public void s() throws InterruptedException {
        this.f90983h.d();
        this.f90977b.f();
    }

    public void t(int i10, String[] strArr, int[] iArr) {
        if (i10 == f90975p) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f90977b.g();
                return;
            }
            A();
            if (this.f90980e) {
                m(this.f90981f);
            } else {
                k();
            }
        }
    }

    public void v(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f90978c);
    }

    protected void z() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f90976a.setResult(0, intent);
        k();
    }

    public d(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f90988m = bVar;
        this.f90989n = false;
        this.f90976a = activity;
        this.f90977b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().i(bVar);
        this.f90985j = new Handler();
        this.f90983h = new h(activity, new Runnable() { // from class: fh.d
            @Override // java.lang.Runnable
            public final void run() {
                com.journeyapps.barcodescanner.d.c(this.f131101a);
            }
        });
        this.f90984i = new e(activity);
    }

    public static /* synthetic */ void c(d dVar) {
        dVar.getClass();
        FS.log_d(f90974o, "Finishing due to inactivity");
        dVar.n();
    }

    public void u() {
        w();
        this.f90983h.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void y(C13894c c13894c) {
        this.f90976a.setResult(-1, x(c13894c, o(c13894c)));
        k();
    }
}
