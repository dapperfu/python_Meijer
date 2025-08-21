package com.meijer.mobile.meijer.activity.shoppinglist.view;

import Nn.V2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes10.dex */
public class AddFromFavoritesView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final V2 f113360a;

    public interface a {
    }

    private void c() {
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    public void setListener(a aVar) {
    }

    public AddFromFavoritesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        V2 v2M0 = V2.M0(LayoutInflater.from(context), this, true);
        this.f113360a = v2M0;
        v2M0.f21709z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113380a.b(view);
            }
        });
        setOrientation(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        c();
    }
}
