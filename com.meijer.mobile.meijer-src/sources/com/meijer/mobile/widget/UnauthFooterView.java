package com.meijer.mobile.widget;

import Nn.N2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meijer.mobile.meijer.V;

/* loaded from: classes12.dex */
public class UnauthFooterView extends ConstraintLayout {

    /* renamed from: x, reason: collision with root package name */
    private N2 f120497x;

    /* renamed from: y, reason: collision with root package name */
    private Qj.g f120498y;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(View view) {
        Qj.g gVar = this.f120498y;
        if (gVar != null) {
            gVar.onSignIn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(View view) {
        Qj.g gVar = this.f120498y;
        if (gVar != null) {
            gVar.onCreateAccount();
        }
    }

    public void setListener(Qj.g gVar) {
        this.f120498y = gVar;
    }

    public UnauthFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        D(context);
    }

    private void D(Context context) {
        N2 n22 = (N2) androidx.databinding.g.e(LayoutInflater.from(context), V.f100221a1, this, true);
        this.f120497x = n22;
        n22.f21568B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120553a.E(view);
            }
        });
        this.f120497x.f21569z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120554a.F(view);
            }
        });
    }
}
