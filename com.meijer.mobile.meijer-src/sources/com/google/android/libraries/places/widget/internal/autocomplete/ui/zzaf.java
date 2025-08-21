package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import Q2.b;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzmr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzaf extends g {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();
    private final int zzd;

    final /* synthetic */ List zzc() {
        return this.zzc;
    }

    private final void zzd(RecyclerView.F f10) {
        List list = this.zzc;
        View view = f10.itemView;
        list.add(f10);
        long moveDuration = getMoveDuration() + (f10.getLayoutPosition() * 67);
        view.setTranslationY(-this.zzd);
        view.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        viewPropertyAnimatorAnimate.cancel();
        viewPropertyAnimatorAnimate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new b()).setStartDelay(moveDuration);
        viewPropertyAnimatorAnimate.setListener(new zzae(this, view, f10, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final void endAnimations() throws Throwable {
        try {
            List list = this.zza;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                RecyclerView.F f10 = (RecyclerView.F) list.get(size);
                zzf(f10.itemView);
                dispatchAddFinished(f10);
                list.remove(size);
            }
            List list2 = this.zzc;
            int size2 = list2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    super.endAnimations();
                    return;
                }
                ((RecyclerView.F) list2.get(size2)).itemView.animate().cancel();
            }
        } catch (Error e10) {
            e = e10;
            zzmr.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmr.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final void runPendingAnimations() throws Throwable {
        try {
            List list = this.zzb;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                super.animateAdd((RecyclerView.F) it.next());
            }
            list.clear();
            super.runPendingAnimations();
            List list2 = this.zza;
            if (list2.isEmpty()) {
                return;
            }
            ArrayList<RecyclerView.F> arrayList = new ArrayList(list2);
            list2.clear();
            for (RecyclerView.F f10 : arrayList) {
                View view = f10.itemView;
                this.zzc.add(f10);
                long moveDuration = getMoveDuration() + (f10.getLayoutPosition() * 67);
                view.setTranslationY(-this.zzd);
                view.setAlpha(0.0f);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                viewPropertyAnimatorAnimate.cancel();
                viewPropertyAnimatorAnimate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new b()).setStartDelay(moveDuration);
                viewPropertyAnimatorAnimate.setListener(new zzae(this, view, f10, viewPropertyAnimatorAnimate)).start();
            }
        } catch (Error e10) {
            e = e10;
            zzmr.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmr.zzb(e);
            throw e;
        }
    }

    public zzaf(Resources resources) {
        this.zzd = resources.getDimensionPixelSize(R.dimen.places_autocomplete_vertical_dropdown);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zza() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.x
    public final boolean animateAdd(RecyclerView.F f10) throws Throwable {
        try {
            endAnimation(f10);
            f10.itemView.setAlpha(0.0f);
            if (f10 instanceof zzak) {
                if (((zzak) f10).zzb()) {
                    this.zza.add(f10);
                    return true;
                }
                this.zzb.add(f10);
                return true;
            }
            if (((zzq) f10).zzb()) {
                this.zza.add(f10);
                return true;
            }
            this.zzb.add(f10);
            return true;
        } catch (Error e10) {
            e = e10;
            zzmr.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmr.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final void endAnimation(RecyclerView.F f10) throws Throwable {
        try {
            super.endAnimation(f10);
            if (this.zza.remove(f10)) {
                zzf(f10.itemView);
                dispatchAddFinished(f10);
            }
            zza();
        } catch (Error e10) {
            e = e10;
            zzmr.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmr.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final boolean isRunning() {
        try {
            if (!super.isRunning() && this.zzb.isEmpty() && this.zza.isEmpty()) {
                if (this.zzc.isEmpty()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }
}
