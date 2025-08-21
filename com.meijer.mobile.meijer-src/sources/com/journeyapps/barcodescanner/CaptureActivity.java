package com.journeyapps.barcodescanner;

import Gg.k;
import Gg.l;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* loaded from: classes8.dex */
public class CaptureActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private d f91787a;

    /* renamed from: b, reason: collision with root package name */
    private DecoratedBarcodeView f91788b;

    protected DecoratedBarcodeView a() {
        setContentView(l.f12577b);
        return (DecoratedBarcodeView) findViewById(k.f12564a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f91788b.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f91787a.t(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f91788b = a();
        d dVar = new d(this, this.f91788b);
        this.f91787a = dVar;
        dVar.p(getIntent(), bundle);
        this.f91787a.l();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f91787a.r();
    }

    @Override // android.app.Activity
    protected void onPause() throws InterruptedException {
        super.onPause();
        this.f91787a.s();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f91787a.u();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f91787a.v(bundle);
    }
}
