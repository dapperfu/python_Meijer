package com.journeyapps.barcodescanner;

import Gg.f;
import Gg.g;
import Gg.k;
import Gg.l;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.zxing.o;
import gh.C14367c;
import gh.InterfaceC14365a;
import gh.InterfaceC14372h;
import hh.i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private BarcodeView f91789a;

    /* renamed from: b, reason: collision with root package name */
    private ViewfinderView f91790b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f91791c;

    public interface a {
    }

    private class b implements InterfaceC14365a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC14365a f91792a;

        public b(InterfaceC14365a interfaceC14365a) {
            this.f91792a = interfaceC14365a;
        }

        @Override // gh.InterfaceC14365a
        public void b(C14367c c14367c) {
            this.f91792a.b(c14367c);
        }

        @Override // gh.InterfaceC14365a
        public void a(List<o> list) {
            Iterator<o> it = list.iterator();
            while (it.hasNext()) {
                DecoratedBarcodeView.this.f91790b.a(it.next());
            }
            this.f91792a.a(list);
        }
    }

    public void setTorchListener(a aVar) {
    }

    public void b(InterfaceC14365a interfaceC14365a) {
        this.f91789a.I(new b(interfaceC14365a));
    }

    public void e() {
        this.f91789a.u();
    }

    public void f() throws InterruptedException {
        this.f91789a.v();
    }

    public void g() {
        this.f91789a.y();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(k.f12565b);
    }

    public i getCameraSettings() {
        return this.f91789a.getCameraSettings();
    }

    public InterfaceC14372h getDecoderFactory() {
        return this.f91789a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f91791c;
    }

    public ViewfinderView getViewFinder() {
        return this.f91790b;
    }

    public void h() {
        this.f91789a.setTorch(false);
    }

    public void i() {
        this.f91789a.setTorch(true);
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
        this.f91789a.setCameraSettings(iVar);
    }

    public void setDecoderFactory(InterfaceC14372h interfaceC14372h) {
        this.f91789a.setDecoderFactory(interfaceC14372h);
    }

    public void setStatusText(String str) {
        TextView textView = this.f91791c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
    }

    private void c(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Gg.o.f12601t);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(Gg.o.f12602u, l.f12576a);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(k.f12565b);
        this.f91789a = barcodeView;
        if (barcodeView != null) {
            barcodeView.q(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(k.f12575l);
            this.f91790b = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f91789a);
                this.f91791c = (TextView) findViewById(k.f12574k);
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
        this.f91789a.setCameraSettings(iVar);
        this.f91789a.setDecoderFactory(new gh.k(setA, mapA, stringExtra2, intExtra2));
    }
}
