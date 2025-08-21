package com.google.android.tv.ads.controls;

import Be.f;
import Be.g;
import Be.h;
import Be.i;
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
import com.google.android.gms.internal.atv_ads_framework.C10324a0;
import com.google.android.gms.internal.atv_ads_framework.C10390w;
import com.google.android.tv.ads.controls.SideDrawerFragment;

/* loaded from: classes4.dex */
public final class SideDrawerFragment extends Fragment {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f88856h = 0;

    /* renamed from: a, reason: collision with root package name */
    private ConstraintLayout f88857a;

    /* renamed from: b, reason: collision with root package name */
    private ConstraintLayout f88858b;

    /* renamed from: c, reason: collision with root package name */
    private ConstraintLayout f88859c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f88860d;

    /* renamed from: e, reason: collision with root package name */
    private Button f88861e;

    /* renamed from: f, reason: collision with root package name */
    private ConstraintLayout f88862f;

    /* renamed from: g, reason: collision with root package name */
    private Button f88863g;

    public SideDrawerFragment() {
        super(i.f2730a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0() {
        this.f88859c.setVisibility(8);
        this.f88862f.setVisibility(0);
        this.f88863g.requestFocus();
    }

    @Keep
    public float getBackgroundAlpha() {
        return this.f88857a.getAlpha();
    }

    @Keep
    public float getDrawerTranslationX() {
        return this.f88858b.getTranslationX() / this.f88858b.getWidth();
    }

    @Keep
    public void setBackgroundAlpha(float f10) {
        this.f88857a.setAlpha(f10);
        this.f88857a.invalidate();
    }

    @Keep
    public void setDrawerTranslationX(float f10) {
        this.f88858b.setTranslationX(r0.getWidth() * f10);
        this.f88858b.invalidate();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        viewGroup.getClass();
        View viewInflate = layoutInflater.inflate(i.f2730a, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(h.f2725c);
        constraintLayout.getClass();
        this.f88857a = constraintLayout;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate.findViewById(h.f2726d);
        constraintLayout2.getClass();
        this.f88858b = constraintLayout2;
        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate.findViewById(h.f2728f);
        constraintLayout3.getClass();
        this.f88859c = constraintLayout3;
        ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate.findViewById(h.f2724b);
        constraintLayout4.getClass();
        this.f88862f = constraintLayout4;
        ImageView imageView = (ImageView) viewInflate.findViewById(h.f2729g);
        imageView.getClass();
        this.f88860d = imageView;
        Button button = (Button) viewInflate.findViewById(h.f2727e);
        button.getClass();
        this.f88861e = button;
        Button button2 = (Button) viewInflate.findViewById(h.f2723a);
        button2.getClass();
        this.f88863g = button2;
        boolean z10 = requireArguments().getBoolean("render_error_message");
        String string = requireArguments().getString("wta_uri");
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), f.f2720a);
        animatorSet.setTarget(this);
        animatorSet.start();
        final AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), f.f2721b);
        animatorSet2.setTarget(this);
        animatorSet2.addListener(new a(this));
        this.f88861e.setOnClickListener(new View.OnClickListener() { // from class: Ce.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnimatorSet animatorSet3 = animatorSet2;
                int i10 = SideDrawerFragment.f88856h;
                animatorSet3.start();
            }
        });
        this.f88863g.setOnClickListener(new View.OnClickListener() { // from class: Ce.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnimatorSet animatorSet3 = animatorSet2;
                int i10 = SideDrawerFragment.f88856h;
                animatorSet3.start();
            }
        });
        requireActivity().getOnBackPressedDispatcher().i(this, new b(this, true, animatorSet2));
        if (!z10 && string != null) {
            this.f88859c.setVisibility(0);
            this.f88861e.requestFocus();
            String strB = C10390w.b(requireArguments().getString("wta_uri"));
            String string2 = requireArguments().getString("wta_alt_text");
            if (!TextUtils.isEmpty(string2)) {
                this.f88860d.setContentDescription(string2);
            }
            com.bumptech.glide.b.u(this).i(C10324a0.a(strB, "zTvAdsFrameworkz")).X(getResources().getDrawable(g.f2722a, requireContext().getTheme())).j().z0(new c(this, this.f88860d));
            return viewInflate;
        }
        w0();
        return viewInflate;
    }
}
