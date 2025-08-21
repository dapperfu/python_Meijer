package com.google.android.gms.dynamic;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.dynamic.c;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import id.C14723f;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public abstract class a<T extends c> {

    /* renamed from: a, reason: collision with root package name */
    private c f65815a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f65816b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList f65817c;

    /* renamed from: d, reason: collision with root package name */
    private final e f65818d = new f(this);

    protected abstract void a(e<T> eVar);

    public T b() {
        return (T) this.f65815a;
    }

    private final void t(int i10) {
        while (!this.f65817c.isEmpty() && ((m) this.f65817c.getLast()).a() >= i10) {
            this.f65817c.removeLast();
        }
    }

    private final void u(Bundle bundle, m mVar) {
        c cVar = this.f65815a;
        if (cVar != null) {
            mVar.b(cVar);
            return;
        }
        if (this.f65817c == null) {
            this.f65817c = new LinkedList();
        }
        this.f65817c.add(mVar);
        if (bundle != null) {
            Bundle bundle2 = this.f65816b;
            if (bundle2 == null) {
                this.f65816b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f65818d);
    }

    public void d(Bundle bundle) {
        u(bundle, new h(this, bundle));
    }

    @ResultIgnorabilityUnspecified
    public View e(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        u(bundle, new i(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f65815a == null) {
            c(frameLayout);
        }
        return frameLayout;
    }

    public void f() {
        c cVar = this.f65815a;
        if (cVar != null) {
            cVar.onDestroy();
        } else {
            t(1);
        }
    }

    public void g() {
        c cVar = this.f65815a;
        if (cVar != null) {
            cVar.H();
        } else {
            t(2);
        }
    }

    public void h(Activity activity, Bundle bundle, Bundle bundle2) {
        u(bundle2, new g(this, activity, bundle, bundle2));
    }

    public void i() {
        c cVar = this.f65815a;
        if (cVar != null) {
            cVar.onLowMemory();
        }
    }

    public void j() {
        c cVar = this.f65815a;
        if (cVar != null) {
            cVar.onPause();
        } else {
            t(5);
        }
    }

    public void k() {
        u(null, new l(this));
    }

    public void l(Bundle bundle) {
        c cVar = this.f65815a;
        if (cVar != null) {
            cVar.n(bundle);
            return;
        }
        Bundle bundle2 = this.f65816b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void m() {
        u(null, new k(this));
    }

    public void n() {
        c cVar = this.f65815a;
        if (cVar != null) {
            cVar.onStop();
        } else {
            t(4);
        }
    }

    public static void o(FrameLayout frameLayout) {
        C14723f c14723fM = C14723f.m();
        Context context = frameLayout.getContext();
        int iG = c14723fM.g(context);
        String strC = E.c(context, iG);
        String strB = E.b(context, iG);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentB = c14723fM.b(context, iG, null);
        if (intentB != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strB);
            linearLayout.addView(button);
            button.setOnClickListener(new j(context, intentB));
        }
    }

    protected void c(FrameLayout frameLayout) {
        o(frameLayout);
    }
}
