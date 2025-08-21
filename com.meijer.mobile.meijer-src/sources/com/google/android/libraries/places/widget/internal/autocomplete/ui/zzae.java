package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzmr;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzae extends AnimatorListenerAdapter {
    final /* synthetic */ View zza;
    final /* synthetic */ RecyclerView.F zzb;
    final /* synthetic */ ViewPropertyAnimator zzc;
    final /* synthetic */ zzaf zzd;

    zzae(zzaf zzafVar, View view, RecyclerView.F f10, ViewPropertyAnimator viewPropertyAnimator) {
        this.zza = view;
        this.zzb = f10;
        this.zzc = viewPropertyAnimator;
        Objects.requireNonNull(zzafVar);
        this.zzd = zzafVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        try {
            zzaf.zzf(this.zza);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        try {
            ViewPropertyAnimator viewPropertyAnimator = this.zzc;
            viewPropertyAnimator.setListener(null);
            zzaf zzafVar = this.zzd;
            RecyclerView.F f10 = this.zzb;
            zzafVar.dispatchAddFinished(f10);
            zzafVar.zzc().remove(f10);
            zzafVar.zza();
            viewPropertyAnimator.setStartDelay(0L);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        try {
            this.zza.setAlpha(0.0f);
            this.zzd.dispatchAddStarting(this.zzb);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }
}
