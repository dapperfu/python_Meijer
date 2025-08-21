package com.meijer.mobile.widget;

import Nn.AbstractC4235f3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ek.C13806b;
import java.io.File;

/* loaded from: classes12.dex */
public class MPerksBarcodeView extends ConstraintLayout {

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC4235f3 f120478x;

    /* renamed from: y, reason: collision with root package name */
    private a f120479y;

    public interface a {
        void v0();
    }

    private void E() {
        a aVar = this.f120479y;
        if (aVar != null) {
            aVar.v0();
        }
    }

    public void C(boolean z10) {
        this.f120478x.f21957I.setClickable(z10);
    }

    public void F() {
        this.f120478x.f21954F.setVisibility(0);
        this.f120478x.f21949A.setVisibility(8);
    }

    public void setBarcode(File file) {
        if (file == null) {
            F();
            return;
        }
        this.f120478x.f21954F.setVisibility(8);
        this.f120478x.f21949A.setVisibility(0);
        Zr.a.d(this.f120478x.f21950B);
        C13806b.d(this.f120478x.f21950B, file);
    }

    public void setListener(a aVar) {
        this.f120479y = aVar;
    }

    public void setLoading(boolean z10) {
        this.f120478x.f21954F.setVisibility(8);
        this.f120478x.f21949A.setVisibility(0);
        this.f120478x.f21956H.setVisibility(z10 ? 0 : 8);
    }

    public MPerksBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC4235f3 abstractC4235f3M0 = AbstractC4235f3.M0(LayoutInflater.from(context), this, true);
        this.f120478x = abstractC4235f3M0;
        abstractC4235f3M0.f21957I.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120549a.D(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(View view) {
        E();
    }
}
