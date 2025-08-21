package Es;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes12.dex */
public class d extends Es.c {

    /* renamed from: n, reason: collision with root package name */
    private c f8499n;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8498m = true;

    /* renamed from: o, reason: collision with root package name */
    private int f8500o = 0;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f8501a;

        a(RecyclerView.F f10) {
            this.f8501a = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.dispatchAddFinished(this.f8501a);
            d.this.dispatchFinishedWhenDone();
            d.this.f8498m = false;
            animator.removeListener(this);
            if (d.this.f8499n == null || d.this.f8453b.size() != 0) {
                return;
            }
            d.this.f8499n.Q();
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f8503a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f8504b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8505c;

        b(RecyclerView.F f10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f8503a = f10;
            this.f8504b = viewPropertyAnimator;
            this.f8505c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8504b.setListener(null);
            this.f8505c.setAlpha(1.0f);
            d.this.dispatchRemoveFinished(this.f8503a);
            d.this.f8461j.remove(this.f8503a);
            d.this.dispatchFinishedWhenDone();
            if (d.this.f8499n == null || d.this.f8452a.size() != 0) {
                return;
            }
            d.this.f8499n.Q();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.dispatchRemoveStarting(this.f8503a);
        }
    }

    public interface c {
        void Q();
    }

    @Override // Es.c, androidx.recyclerview.widget.x
    public boolean animateAdd(RecyclerView.F f10) {
        if (!this.f8498m || f10.getAdapterPosition() < this.f8500o) {
            return super.animateAdd(f10);
        }
        View view = f10.itemView;
        AnimatorSet animatorSet = new AnimatorSet();
        view.setTranslationY(Es.a.a(view.getContext()));
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationY", 0.0f), ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 1.0f));
        animatorSet.setTarget(view);
        animatorSet.setDuration(700L);
        animatorSet.setInterpolator(new DecelerateInterpolator(4.0f));
        animatorSet.setStartDelay(((f10.getLayoutPosition() * HttpResponseStatus.ERROR_BAD_REQUEST) / 10) + HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
        animatorSet.addListener(new a(f10));
        animatorSet.start();
        return false;
    }

    @Override // Es.c
    protected void animateRemoveImpl(RecyclerView.F f10) {
        View view = f10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f8461j.add(f10);
        viewPropertyAnimatorAnimate.setDuration(0L).alpha(0.0f).setListener(new b(f10, viewPropertyAnimatorAnimate, view)).start();
    }

    public void f(c cVar) {
        this.f8499n = cVar;
    }

    public void g(boolean z10) {
        this.f8498m = z10;
    }
}
