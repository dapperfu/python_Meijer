package com.meijer.mobile.widget;

import Mn.N2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meijer.mobile.meijer.V;

/* loaded from: classes11.dex */
public class UnauthFooterView extends ConstraintLayout {

    /* renamed from: x, reason: collision with root package name */
    private N2 f119524x;

    /* renamed from: y, reason: collision with root package name */
    private Pj.g f119525y;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(View view) {
        Pj.g gVar = this.f119525y;
        if (gVar != null) {
            gVar.onSignIn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(View view) {
        Pj.g gVar = this.f119525y;
        if (gVar != null) {
            gVar.onCreateAccount();
        }
    }

    public void setListener(Pj.g gVar) {
        this.f119525y = gVar;
    }

    public UnauthFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        D(context);
    }

    private void D(Context context) {
        N2 n22 = (N2) androidx.databinding.g.e(LayoutInflater.from(context), V.f99365a1, this, true);
        this.f119524x = n22;
        n22.f20236B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119580a.E(view);
            }
        });
        this.f119524x.f20237z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119581a.F(view);
            }
        });
    }
}
