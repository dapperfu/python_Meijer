package com.journeyapps.barcodescanner;

import Eg.k;
import Eg.l;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* loaded from: classes7.dex */
public class CaptureActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private d f90948a;

    /* renamed from: b, reason: collision with root package name */
    private DecoratedBarcodeView f90949b;

    protected DecoratedBarcodeView a() {
        setContentView(l.f9025b);
        return (DecoratedBarcodeView) findViewById(k.f9012a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f90949b.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f90948a.t(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f90949b = a();
        d dVar = new d(this, this.f90949b);
        this.f90948a = dVar;
        dVar.p(getIntent(), bundle);
        this.f90948a.l();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f90948a.r();
    }

    @Override // android.app.Activity
    protected void onPause() throws InterruptedException {
        super.onPause();
        this.f90948a.s();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f90948a.u();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f90948a.v(bundle);
    }
}
