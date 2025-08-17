package com.journeyapps.barcodescanner;

import Eg.k;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import com.google.zxing.o;
import fh.C13894c;
import fh.C13898g;
import fh.InterfaceC13892a;
import fh.InterfaceC13899h;
import fh.i;
import fh.j;
import fh.s;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class BarcodeView extends CameraPreview {

    /* renamed from: B, reason: collision with root package name */
    private b f90905B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC13892a f90906C;

    /* renamed from: D, reason: collision with root package name */
    private j f90907D;

    /* renamed from: E, reason: collision with root package name */
    private InterfaceC13899h f90908E;

    /* renamed from: F, reason: collision with root package name */
    private Handler f90909F;

    /* renamed from: G, reason: collision with root package name */
    private final Handler.Callback f90910G;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == k.f9018g) {
                C13894c c13894c = (C13894c) message.obj;
                if (c13894c != null && BarcodeView.this.f90906C != null && BarcodeView.this.f90905B != b.NONE) {
                    BarcodeView.this.f90906C.a(c13894c);
                    if (BarcodeView.this.f90905B == b.SINGLE) {
                        BarcodeView.this.M();
                    }
                }
                return true;
            }
            if (i10 == k.f9017f) {
                return true;
            }
            if (i10 != k.f9019h) {
                return false;
            }
            List<o> list = (List) message.obj;
            if (BarcodeView.this.f90906C != null && BarcodeView.this.f90905B != b.NONE) {
                BarcodeView.this.f90906C.b(list);
            }
            return true;
        }
    }

    private enum b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    private C13898g G() {
        if (this.f90908E == null) {
            this.f90908E = H();
        }
        i iVar = new i();
        HashMap map = new HashMap();
        map.put(com.google.zxing.d.NEED_RESULT_POINT_CALLBACK, iVar);
        C13898g c13898gA = this.f90908E.a(map);
        iVar.b(c13898gA);
        return c13898gA;
    }

    private void J() {
        this.f90908E = new fh.k();
        this.f90909F = new Handler(this.f90910G);
    }

    private void L() {
        j jVar = this.f90907D;
        if (jVar != null) {
            jVar.l();
            this.f90907D = null;
        }
    }

    protected InterfaceC13899h H() {
        return new fh.k();
    }

    public void I(InterfaceC13892a interfaceC13892a) {
        this.f90905B = b.SINGLE;
        this.f90906C = interfaceC13892a;
        K();
    }

    public void M() {
        this.f90905B = b.NONE;
        this.f90906C = null;
        L();
    }

    public InterfaceC13899h getDecoderFactory() {
        return this.f90908E;
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90905B = b.NONE;
        this.f90906C = null;
        this.f90910G = new a();
        J();
    }

    private void K() {
        L();
        if (this.f90905B != b.NONE && t()) {
            j jVar = new j(getCameraInstance(), G(), this.f90909F);
            this.f90907D = jVar;
            jVar.i(getPreviewFramingRect());
            this.f90907D.k();
        }
    }

    public void setDecoderFactory(InterfaceC13899h interfaceC13899h) {
        s.a();
        this.f90908E = interfaceC13899h;
        j jVar = this.f90907D;
        if (jVar != null) {
            jVar.j(G());
        }
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview
    public void u() {
        L();
        super.u();
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview
    protected void x() {
        super.x();
        K();
    }
}
