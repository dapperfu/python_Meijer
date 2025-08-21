package com.journeyapps.barcodescanner;

import Gg.k;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import com.google.zxing.o;
import gh.C14367c;
import gh.C14371g;
import gh.InterfaceC14365a;
import gh.InterfaceC14372h;
import gh.i;
import gh.j;
import gh.s;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public class BarcodeView extends CameraPreview {

    /* renamed from: B, reason: collision with root package name */
    private b f91744B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC14365a f91745C;

    /* renamed from: D, reason: collision with root package name */
    private j f91746D;

    /* renamed from: E, reason: collision with root package name */
    private InterfaceC14372h f91747E;

    /* renamed from: F, reason: collision with root package name */
    private Handler f91748F;

    /* renamed from: G, reason: collision with root package name */
    private final Handler.Callback f91749G;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == k.f12570g) {
                C14367c c14367c = (C14367c) message.obj;
                if (c14367c != null && BarcodeView.this.f91745C != null && BarcodeView.this.f91744B != b.NONE) {
                    BarcodeView.this.f91745C.b(c14367c);
                    if (BarcodeView.this.f91744B == b.SINGLE) {
                        BarcodeView.this.M();
                    }
                }
                return true;
            }
            if (i10 == k.f12569f) {
                return true;
            }
            if (i10 != k.f12571h) {
                return false;
            }
            List<o> list = (List) message.obj;
            if (BarcodeView.this.f91745C != null && BarcodeView.this.f91744B != b.NONE) {
                BarcodeView.this.f91745C.a(list);
            }
            return true;
        }
    }

    private enum b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    private C14371g G() {
        if (this.f91747E == null) {
            this.f91747E = H();
        }
        i iVar = new i();
        HashMap map = new HashMap();
        map.put(com.google.zxing.d.NEED_RESULT_POINT_CALLBACK, iVar);
        C14371g c14371gA = this.f91747E.a(map);
        iVar.b(c14371gA);
        return c14371gA;
    }

    private void J() {
        this.f91747E = new gh.k();
        this.f91748F = new Handler(this.f91749G);
    }

    private void L() {
        j jVar = this.f91746D;
        if (jVar != null) {
            jVar.l();
            this.f91746D = null;
        }
    }

    protected InterfaceC14372h H() {
        return new gh.k();
    }

    public void I(InterfaceC14365a interfaceC14365a) {
        this.f91744B = b.SINGLE;
        this.f91745C = interfaceC14365a;
        K();
    }

    public void M() {
        this.f91744B = b.NONE;
        this.f91745C = null;
        L();
    }

    public InterfaceC14372h getDecoderFactory() {
        return this.f91747E;
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91744B = b.NONE;
        this.f91745C = null;
        this.f91749G = new a();
        J();
    }

    private void K() {
        L();
        if (this.f91744B != b.NONE && t()) {
            j jVar = new j(getCameraInstance(), G(), this.f91748F);
            this.f91746D = jVar;
            jVar.i(getPreviewFramingRect());
            this.f91746D.k();
        }
    }

    public void setDecoderFactory(InterfaceC14372h interfaceC14372h) {
        s.a();
        this.f91747E = interfaceC14372h;
        j jVar = this.f91746D;
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
