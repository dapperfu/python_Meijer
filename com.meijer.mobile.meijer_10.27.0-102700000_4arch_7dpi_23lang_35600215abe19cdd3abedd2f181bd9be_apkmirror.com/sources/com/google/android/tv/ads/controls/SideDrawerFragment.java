package com.google.android.tv.ads.controls;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.atv_ads_framework.C10199a0;
import com.google.android.gms.internal.atv_ads_framework.C10265w;
import com.google.android.tv.ads.controls.SideDrawerFragment;
import ze.f;
import ze.g;
import ze.h;
import ze.i;

/* loaded from: classes4.dex */
public final class SideDrawerFragment extends Fragment {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f88016h = 0;

    /* renamed from: a, reason: collision with root package name */
    private ConstraintLayout f88017a;

    /* renamed from: b, reason: collision with root package name */
    private ConstraintLayout f88018b;

    /* renamed from: c, reason: collision with root package name */
    private ConstraintLayout f88019c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f88020d;

    /* renamed from: e, reason: collision with root package name */
    private Button f88021e;

    /* renamed from: f, reason: collision with root package name */
    private ConstraintLayout f88022f;

    /* renamed from: g, reason: collision with root package name */
    private Button f88023g;

    public SideDrawerFragment() {
        super(i.f171816a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        this.f88019c.setVisibility(8);
        this.f88022f.setVisibility(0);
        this.f88023g.requestFocus();
    }

    @Keep
    public float getBackgroundAlpha() {
        return this.f88017a.getAlpha();
    }

    @Keep
    public float getDrawerTranslationX() {
        return this.f88018b.getTranslationX() / this.f88018b.getWidth();
    }

    @Keep
    public void setBackgroundAlpha(float f10) {
        this.f88017a.setAlpha(f10);
        this.f88017a.invalidate();
    }

    @Keep
    public void setDrawerTranslationX(float f10) {
        this.f88018b.setTranslationX(r0.getWidth() * f10);
        this.f88018b.invalidate();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        viewGroup.getClass();
        View viewInflate = layoutInflater.inflate(i.f171816a, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(h.f171811c);
        constraintLayout.getClass();
        this.f88017a = constraintLayout;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate.findViewById(h.f171812d);
        constraintLayout2.getClass();
        this.f88018b = constraintLayout2;
        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate.findViewById(h.f171814f);
        constraintLayout3.getClass();
        this.f88019c = constraintLayout3;
        ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate.findViewById(h.f171810b);
        constraintLayout4.getClass();
        this.f88022f = constraintLayout4;
        ImageView imageView = (ImageView) viewInflate.findViewById(h.f171815g);
        imageView.getClass();
        this.f88020d = imageView;
        Button button = (Button) viewInflate.findViewById(h.f171813e);
        button.getClass();
        this.f88021e = button;
        Button button2 = (Button) viewInflate.findViewById(h.f171809a);
        button2.getClass();
        this.f88023g = button2;
        boolean z10 = requireArguments().getBoolean("render_error_message");
        String string = requireArguments().getString("wta_uri");
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), f.f171806a);
        animatorSet.setTarget(this);
        animatorSet.start();
        final AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), f.f171807b);
        animatorSet2.setTarget(this);
        animatorSet2.addListener(new a(this));
        this.f88021e.setOnClickListener(new View.OnClickListener() { // from class: Ae.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnimatorSet animatorSet3 = animatorSet2;
                int i10 = SideDrawerFragment.f88016h;
                animatorSet3.start();
            }
        });
        this.f88023g.setOnClickListener(new View.OnClickListener() { // from class: Ae.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnimatorSet animatorSet3 = animatorSet2;
                int i10 = SideDrawerFragment.f88016h;
                animatorSet3.start();
            }
        });
        requireActivity().getOnBackPressedDispatcher().i(this, new b(this, true, animatorSet2));
        if (!z10 && string != null) {
            this.f88019c.setVisibility(0);
            this.f88021e.requestFocus();
            String strB = C10265w.b(requireArguments().getString("wta_uri"));
            String string2 = requireArguments().getString("wta_alt_text");
            if (!TextUtils.isEmpty(string2)) {
                this.f88020d.setContentDescription(string2);
            }
            com.bumptech.glide.b.u(this).i(C10199a0.a(strB, "zTvAdsFrameworkz")).X(getResources().getDrawable(g.f171808a, requireContext().getTheme())).j().z0(new c(this, this.f88020d));
            return viewInflate;
        }
        t0();
        return viewInflate;
    }
}
