package com.meijer.mobile.widget;

import Mn.AbstractC4230f3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import dk.C13530b;
import java.io.File;

/* loaded from: classes11.dex */
public class MPerksBarcodeView extends ConstraintLayout {

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC4230f3 f119505x;

    /* renamed from: y, reason: collision with root package name */
    private a f119506y;

    public interface a {
        void r0();
    }

    private void E() {
        a aVar = this.f119506y;
        if (aVar != null) {
            aVar.r0();
        }
    }

    public void C(boolean z10) {
        this.f119505x.f20625I.setClickable(z10);
    }

    public void F() {
        this.f119505x.f20622F.setVisibility(0);
        this.f119505x.f20617A.setVisibility(8);
    }

    public void setBarcode(File file) {
        if (file == null) {
            F();
            return;
        }
        this.f119505x.f20622F.setVisibility(8);
        this.f119505x.f20617A.setVisibility(0);
        Zr.a.d(this.f119505x.f20618B);
        C13530b.d(this.f119505x.f20618B, file);
    }

    public void setListener(a aVar) {
        this.f119506y = aVar;
    }

    public void setLoading(boolean z10) {
        this.f119505x.f20622F.setVisibility(8);
        this.f119505x.f20617A.setVisibility(0);
        this.f119505x.f20624H.setVisibility(z10 ? 0 : 8);
    }

    public MPerksBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC4230f3 abstractC4230f3K0 = AbstractC4230f3.K0(LayoutInflater.from(context), this, true);
        this.f119505x = abstractC4230f3K0;
        abstractC4230f3K0.f20625I.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119576a.D(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(View view) {
        E();
    }
}
