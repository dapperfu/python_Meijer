package com.journeyapps.barcodescanner;

import Eg.f;
import Eg.g;
import Eg.k;
import Eg.l;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.zxing.o;
import fh.C13894c;
import fh.InterfaceC13892a;
import fh.InterfaceC13899h;
import gh.i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private BarcodeView f90950a;

    /* renamed from: b, reason: collision with root package name */
    private ViewfinderView f90951b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f90952c;

    public interface a {
    }

    private class b implements InterfaceC13892a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC13892a f90953a;

        public b(InterfaceC13892a interfaceC13892a) {
            this.f90953a = interfaceC13892a;
        }

        @Override // fh.InterfaceC13892a
        public void a(C13894c c13894c) {
            this.f90953a.a(c13894c);
        }

        @Override // fh.InterfaceC13892a
        public void b(List<o> list) {
            Iterator<o> it = list.iterator();
            while (it.hasNext()) {
                DecoratedBarcodeView.this.f90951b.a(it.next());
            }
            this.f90953a.b(list);
        }
    }

    public void setTorchListener(a aVar) {
    }

    public void b(InterfaceC13892a interfaceC13892a) {
        this.f90950a.I(new b(interfaceC13892a));
    }

    public void e() {
        this.f90950a.u();
    }

    public void f() throws InterruptedException {
        this.f90950a.v();
    }

    public void g() {
        this.f90950a.y();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(k.f9013b);
    }

    public i getCameraSettings() {
        return this.f90950a.getCameraSettings();
    }

    public InterfaceC13899h getDecoderFactory() {
        return this.f90950a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f90952c;
    }

    public ViewfinderView getViewFinder() {
        return this.f90951b;
    }

    public void h() {
        this.f90950a.setTorch(false);
    }

    public void i() {
        this.f90950a.setTorch(true);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 24) {
            i();
            return true;
        }
        if (i10 == 25) {
            h();
            return true;
        }
        if (i10 == 27 || i10 == 80) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void setCameraSettings(i iVar) {
        this.f90950a.setCameraSettings(iVar);
    }

    public void setDecoderFactory(InterfaceC13899h interfaceC13899h) {
        this.f90950a.setDecoderFactory(interfaceC13899h);
    }

    public void setStatusText(String str) {
        TextView textView = this.f90952c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
    }

    private void c(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Eg.o.f9049t);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(Eg.o.f9050u, l.f9024a);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(k.f9013b);
        this.f90950a = barcodeView;
        if (barcodeView != null) {
            barcodeView.q(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(k.f9023l);
            this.f90951b = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f90950a);
                this.f90952c = (TextView) findViewById(k.f9022k);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public void d(Intent intent) {
        int intExtra;
        Set<com.google.zxing.a> setA = f.a(intent);
        Map<com.google.zxing.d, ?> mapA = g.a(intent);
        i iVar = new i();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            iVar.i(intExtra);
        }
        if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
            i();
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new com.google.zxing.i().e(mapA);
        this.f90950a.setCameraSettings(iVar);
        this.f90950a.setDecoderFactory(new fh.k(setA, mapA, stringExtra2, intExtra2));
    }
}
