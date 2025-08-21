package androidx.fragment.app;

import Z.C5603a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.C6107f;
import androidx.fragment.app.C6120t;
import androidx.fragment.app.b0;
import androidx.view.C5756b;
import com.fullstory.FS;
import j2.C14924d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\b%&'#()*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ9\u0010\u0015\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$¨\u0006,"}, d2 = {"Landroidx/fragment/app/f;", "Landroidx/fragment/app/b0;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/b0$d;", "operations", "", "K", "(Ljava/util/List;)V", "Landroidx/fragment/app/f$b;", "animationInfos", "F", "Landroidx/fragment/app/f$h;", "transitionInfos", "", "isPop", "firstOut", "lastIn", "H", "(Ljava/util/List;ZLandroidx/fragment/app/b0$d;Landroidx/fragment/app/b0$d;)V", "LZ/a;", "", "Landroid/view/View;", "", "names", "J", "(LZ/a;Ljava/util/Collection;)V", "", "namedViews", "view", "I", "(Ljava/util/Map;Landroid/view/View;)V", "d", "(Ljava/util/List;Z)V", "a", "b", "c", "e", "f", "g", "h", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6107f extends b0 {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/f$a;", "Landroidx/fragment/app/b0$b;", "Landroidx/fragment/app/f$b;", "animationInfo", "<init>", "(Landroidx/fragment/app/f$b;)V", "Landroid/view/ViewGroup;", "container", "", "d", "(Landroid/view/ViewGroup;)V", "c", "Landroidx/fragment/app/f$b;", "h", "()Landroidx/fragment/app/f$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.f$a */
    static final class a extends b0.b {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final b animationInfo;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"androidx/fragment/app/f$a$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.fragment.app.f$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC1124a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0.d f55253a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f55254b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f55255c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f55256d;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                Intrinsics.j(animation, "animation");
            }

            AnimationAnimationListenerC1124a(b0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f55253a = dVar;
                this.f55254b = viewGroup;
                this.f55255c = view;
                this.f55256d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(ViewGroup container, View view, a this$0) {
                Intrinsics.j(container, "$container");
                Intrinsics.j(this$0, "this$0");
                container.endViewTransition(view);
                this$0.getAnimationInfo().getOperation().e(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Intrinsics.j(animation, "animation");
                final ViewGroup viewGroup = this.f55254b;
                final View view = this.f55255c;
                final a aVar = this.f55256d;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6107f.a.AnimationAnimationListenerC1124a.b(viewGroup, view, aVar);
                    }
                });
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "Animation from operation " + this.f55253a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                Intrinsics.j(animation, "animation");
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "Animation from operation " + this.f55253a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b animationInfo) {
            Intrinsics.j(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        @Override // androidx.fragment.app.b0.b
        public void c(ViewGroup container) {
            Intrinsics.j(container, "container");
            b0.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().e(this);
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.b0.b
        public void d(ViewGroup container) throws Resources.NotFoundException {
            Intrinsics.j(container, "container");
            if (this.animationInfo.b()) {
                this.animationInfo.getOperation().e(this);
                return;
            }
            Context context = container.getContext();
            b0.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            b bVar = this.animationInfo;
            Intrinsics.i(context, "context");
            C6120t.a aVarC = bVar.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarC.f55329a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != b0.d.b.REMOVED) {
                view.startAnimation(animation);
                this.animationInfo.getOperation().e(this);
                return;
            }
            container.startViewTransition(view);
            C6120t.b bVar2 = new C6120t.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC1124a(operation, container, view, this));
            view.startAnimation(bVar2);
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Animation from operation " + operation + " has started.");
            }
        }

        /* renamed from: h, reason: from getter */
        public final b getAnimationInfo() {
            return this.animationInfo;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/f$b;", "Landroidx/fragment/app/f$f;", "Landroidx/fragment/app/b0$d;", "operation", "", "isPop", "<init>", "(Landroidx/fragment/app/b0$d;Z)V", "Landroid/content/Context;", "context", "Landroidx/fragment/app/t$a;", "c", "(Landroid/content/Context;)Landroidx/fragment/app/t$a;", "b", "Z", "isAnimLoaded", "d", "Landroidx/fragment/app/t$a;", "animation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.f$b */
    private static final class b extends C1125f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isPop;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isAnimLoaded;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private C6120t.a animation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0.d operation, boolean z10) {
            super(operation);
            Intrinsics.j(operation, "operation");
            this.isPop = z10;
        }

        public final C6120t.a c(Context context) throws Resources.NotFoundException {
            Intrinsics.j(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            C6120t.a aVarB = C6120t.b(context, getOperation().getFragment(), getOperation().getFinalState() == b0.d.b.VISIBLE, this.isPop);
            this.animation = aVarB;
            this.isAnimLoaded = true;
            return aVarB;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/fragment/app/f$c;", "Landroidx/fragment/app/b0$b;", "Landroidx/fragment/app/f$b;", "animatorInfo", "<init>", "(Landroidx/fragment/app/f$b;)V", "Landroid/view/ViewGroup;", "container", "", "f", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/b;", "backEvent", "e", "(Landroidx/activity/b;Landroid/view/ViewGroup;)V", "d", "c", "Landroidx/fragment/app/f$b;", "h", "()Landroidx/fragment/app/f$b;", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "animator", "", "b", "()Z", "isSeekingSupported", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.f$c */
    private static final class c extends b0.b {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final b animatorInfo;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private AnimatorSet animator;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/app/f$c$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "anim", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.fragment.app.f$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewGroup f55262a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f55263b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f55264c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b0.d f55265d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f55266e;

            a(ViewGroup viewGroup, View view, boolean z10, b0.d dVar, c cVar) {
                this.f55262a = viewGroup;
                this.f55263b = view;
                this.f55264c = z10;
                this.f55265d = dVar;
                this.f55266e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                Intrinsics.j(anim, "anim");
                this.f55262a.endViewTransition(this.f55263b);
                if (this.f55264c) {
                    b0.d.b finalState = this.f55265d.getFinalState();
                    View viewToAnimate = this.f55263b;
                    Intrinsics.i(viewToAnimate, "viewToAnimate");
                    finalState.b(viewToAnimate, this.f55262a);
                }
                this.f55266e.getAnimatorInfo().getOperation().e(this.f55266e);
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "Animator from operation " + this.f55265d + " has ended.");
                }
            }
        }

        @Override // androidx.fragment.app.b0.b
        /* renamed from: b */
        public boolean getIsSeekingSupported() {
            return true;
        }

        public c(b animatorInfo) {
            Intrinsics.j(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        @Override // androidx.fragment.app.b0.b
        public void c(ViewGroup container) {
            Intrinsics.j(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            b0.d operation = this.animatorInfo.getOperation();
            if (!operation.getIsSeeking()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.f55268a.a(animatorSet);
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(operation);
                sb2.append(" has been canceled");
                sb2.append(operation.getIsSeeking() ? " with seeking." : ".");
                sb2.append(' ');
                FS.log_v(FragmentManager.TAG, sb2.toString());
            }
        }

        @Override // androidx.fragment.app.b0.b
        public void d(ViewGroup container) {
            Intrinsics.j(container, "container");
            b0.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.b0.b
        public void e(C5756b backEvent, ViewGroup container) {
            Intrinsics.j(backEvent, "backEvent");
            Intrinsics.j(container, "container");
            b0.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().mTransitioning) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long jA = d.f55267a.a(animatorSet);
            long progress = (long) (backEvent.getProgress() * jA);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == jA) {
                progress = jA - 1;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation);
            }
            e.f55268a.b(animatorSet, progress);
        }

        @Override // androidx.fragment.app.b0.b
        public void f(ViewGroup container) throws Resources.NotFoundException {
            c cVar;
            Intrinsics.j(container, "container");
            if (this.animatorInfo.b()) {
                return;
            }
            Context context = container.getContext();
            b bVar = this.animatorInfo;
            Intrinsics.i(context, "context");
            C6120t.a aVarC = bVar.c(context);
            this.animator = aVarC != null ? aVarC.f55330b : null;
            b0.d operation = this.animatorInfo.getOperation();
            Fragment fragment = operation.getFragment();
            boolean z10 = operation.getFinalState() == b0.d.b.GONE;
            View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z10, operation, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        /* renamed from: h, reason: from getter */
        public final b getAnimatorInfo() {
            return this.animatorInfo;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/f$d;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.f$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f55267a = new d();

        public final long a(AnimatorSet animatorSet) {
            Intrinsics.j(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/f$e;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)V", "", "time", "b", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.f$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f55268a = new e();

        public final void a(AnimatorSet animatorSet) {
            Intrinsics.j(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long time) {
            Intrinsics.j(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(time);
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/fragment/app/f$f;", "", "Landroidx/fragment/app/b0$d;", "operation", "<init>", "(Landroidx/fragment/app/b0$d;)V", "a", "Landroidx/fragment/app/b0$d;", "()Landroidx/fragment/app/b0$d;", "", "b", "()Z", "isVisibilityUnchanged", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.f$f, reason: collision with other inner class name */
    public static class C1125f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0.d operation;

        public C1125f(b0.d operation) {
            Intrinsics.j(operation, "operation");
            this.operation = operation;
        }

        /* renamed from: a, reason: from getter */
        public final b0.d getOperation() {
            return this.operation;
        }

        public final boolean b() {
            View view = this.operation.getFragment().mView;
            b0.d.b bVarA = view != null ? b0.d.b.INSTANCE.a(view) : null;
            b0.d.b finalState = this.operation.getFinalState();
            if (bVarA == finalState) {
                return true;
            }
            b0.d.b bVar = b0.d.b.VISIBLE;
            return (bVarA == bVar || finalState == bVar) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020#2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010ER'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b)\u0010I\u001a\u0004\bP\u0010KR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b\u0019\u0010TR\u001d\u0010\\\u001a\u00020U8\u0006¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010YR$\u0010a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010S\u001a\u0004\bb\u0010T\"\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010TR\u0011\u0010i\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bh\u0010T¨\u0006j"}, d2 = {"Landroidx/fragment/app/f$g;", "Landroidx/fragment/app/b0$b;", "", "Landroidx/fragment/app/f$h;", "transitionInfos", "Landroidx/fragment/app/b0$d;", "firstOut", "lastIn", "Landroidx/fragment/app/V;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "LZ/a;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/b0$d;Landroidx/fragment/app/b0$d;Landroidx/fragment/app/V;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;LZ/a;Ljava/util/ArrayList;Ljava/util/ArrayList;LZ/a;LZ/a;Z)V", "Landroid/view/ViewGroup;", "container", "Lkotlin/Pair;", "o", "(Landroid/view/ViewGroup;Landroidx/fragment/app/b0$d;Landroidx/fragment/app/b0$d;)Lkotlin/Pair;", "enteringViews", "Lkotlin/Function0;", "", "executeTransition", "B", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "transitioningViews", "view", "n", "(Ljava/util/ArrayList;Landroid/view/View;)V", "f", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/b;", "backEvent", "e", "(Landroidx/activity/b;Landroid/view/ViewGroup;)V", "d", "c", "Ljava/util/List;", "w", "()Ljava/util/List;", "Landroidx/fragment/app/b0$d;", "t", "()Landroidx/fragment/app/b0$d;", "u", "g", "Landroidx/fragment/app/V;", "v", "()Landroidx/fragment/app/V;", "h", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "i", "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "j", "getSharedElementLastInViews", "k", "LZ/a;", "getSharedElementNameMapping", "()LZ/a;", "l", "getEnteringNames", "m", "getExitingNames", "getFirstOutViews", "getLastInViews", "p", "Z", "()Z", "Lj2/d;", "q", "Lj2/d;", "getTransitionSignal", "()Lj2/d;", "getTransitionSignal$annotations", "()V", "transitionSignal", "r", "s", "C", "(Ljava/lang/Object;)V", "controller", "getNoControllerReturned", "D", "(Z)V", "noControllerReturned", "b", "isSeekingSupported", "x", "transitioning", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.fragment.app.f$g */
    static final class g extends b0.b {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<h> transitionInfos;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final b0.d firstOut;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final b0.d lastIn;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final V transitionImpl;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Object sharedElementTransition;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<View> sharedElementFirstOutViews;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<View> sharedElementLastInViews;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final C5603a<String, String> sharedElementNameMapping;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<String> enteringNames;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<String> exitingNames;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final C5603a<String, View> firstOutViews;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final C5603a<String, View> lastInViews;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final boolean isPop;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final C14924d transitionSignal;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private Object controller;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean noControllerReturned;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.fragment.app.f$g$a */
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ViewGroup f55287g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f55288h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f55287g = viewGroup;
                this.f55288h = obj;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                g.this.getTransitionImpl().e(this.f55287g, this.f55288h);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.fragment.app.f$g$b */
        static final class b extends Lambda implements Function0<Unit> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ViewGroup f55290g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f55291h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<Function0<Unit>> f55292i;

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: androidx.fragment.app.f$g$b$a */
            static final class a extends Lambda implements Function0<Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ g f55293f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Object f55294g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ ViewGroup f55295h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f55293f = gVar;
                    this.f55294g = obj;
                    this.f55295h = viewGroup;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void c(g this$0, ViewGroup container) {
                    Intrinsics.j(this$0, "this$0");
                    Intrinsics.j(container, "$container");
                    Iterator<T> it = this$0.w().iterator();
                    while (it.hasNext()) {
                        b0.d operation = ((h) it.next()).getOperation();
                        View view = operation.getFragment().getView();
                        if (view != null) {
                            operation.getFinalState().b(view, container);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void d(g this$0) {
                    Intrinsics.j(this$0, "this$0");
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "Transition for all operations has completed");
                    }
                    Iterator<T> it = this$0.w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).getOperation().e(this$0);
                    }
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    List<h> listW = this.f55293f.w();
                    if (!(listW instanceof Collection) || !listW.isEmpty()) {
                        Iterator<T> it = listW.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).getOperation().getIsSeeking()) {
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    FS.log_v(FragmentManager.TAG, "Completing animating immediately");
                                }
                                C14924d c14924d = new C14924d();
                                V transitionImpl = this.f55293f.getTransitionImpl();
                                Fragment fragment = this.f55293f.w().get(0).getOperation().getFragment();
                                Object obj = this.f55294g;
                                final g gVar = this.f55293f;
                                transitionImpl.w(fragment, obj, c14924d, new Runnable() { // from class: androidx.fragment.app.n
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C6107f.g.b.a.d(gVar);
                                    }
                                });
                                c14924d.a();
                                return;
                            }
                        }
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "Animating to start");
                    }
                    V transitionImpl2 = this.f55293f.getTransitionImpl();
                    Object controller = this.f55293f.getController();
                    Intrinsics.g(controller);
                    final g gVar2 = this.f55293f;
                    final ViewGroup viewGroup = this.f55295h;
                    transitionImpl2.d(controller, new Runnable() { // from class: androidx.fragment.app.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6107f.g.b.a.c(gVar2, viewGroup);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ViewGroup viewGroup, Object obj, Ref.ObjectRef<Function0<Unit>> objectRef) {
                super(0);
                this.f55290g = viewGroup;
                this.f55291h = obj;
                this.f55292i = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.f$g$b$a] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "Attempting to create TransitionSeekController");
                }
                g gVar = g.this;
                gVar.C(gVar.getTransitionImpl().j(this.f55290g, this.f55291h));
                if (g.this.getController() == null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "TransitionSeekController was not created.");
                    }
                    g.this.D(true);
                    return;
                }
                this.f55292i.f143742a = new a(g.this, this.f55291h, this.f55290g);
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "Started executing operations from " + g.this.getFirstOut() + " to " + g.this.getLastIn());
                }
            }
        }

        private final void B(ArrayList<View> enteringViews, ViewGroup container, Function0<Unit> executeTransition) {
            T.e(enteringViews, 4);
            ArrayList<String> arrayListQ = this.transitionImpl.q(this.sharedElementLastInViews);
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, ">>>>> Beginning transition <<<<<");
                FS.log_v(FragmentManager.TAG, ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it = this.sharedElementFirstOutViews.iterator();
                while (it.hasNext()) {
                    View sharedElementFirstOutViews = it.next();
                    Intrinsics.i(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = sharedElementFirstOutViews;
                    FS.log_v(FragmentManager.TAG, "View: " + view + " Name: " + ViewCompat.I(view));
                }
                FS.log_v(FragmentManager.TAG, ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it2 = this.sharedElementLastInViews.iterator();
                while (it2.hasNext()) {
                    View sharedElementLastInViews = it2.next();
                    Intrinsics.i(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = sharedElementLastInViews;
                    FS.log_v(FragmentManager.TAG, "View: " + view2 + " Name: " + ViewCompat.I(view2));
                }
            }
            executeTransition.invoke();
            this.transitionImpl.y(container, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListQ, this.sharedElementNameMapping);
            T.e(enteringViews, 0);
            this.transitionImpl.A(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        public g(List<h> transitionInfos, b0.d dVar, b0.d dVar2, V transitionImpl, Object obj, ArrayList<View> sharedElementFirstOutViews, ArrayList<View> sharedElementLastInViews, C5603a<String, String> sharedElementNameMapping, ArrayList<String> enteringNames, ArrayList<String> exitingNames, C5603a<String, View> firstOutViews, C5603a<String, View> lastInViews, boolean z10) {
            Intrinsics.j(transitionInfos, "transitionInfos");
            Intrinsics.j(transitionImpl, "transitionImpl");
            Intrinsics.j(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            Intrinsics.j(sharedElementLastInViews, "sharedElementLastInViews");
            Intrinsics.j(sharedElementNameMapping, "sharedElementNameMapping");
            Intrinsics.j(enteringNames, "enteringNames");
            Intrinsics.j(exitingNames, "exitingNames");
            Intrinsics.j(firstOutViews, "firstOutViews");
            Intrinsics.j(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = dVar;
            this.lastIn = dVar2;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z10;
            this.transitionSignal = new C14924d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(b0.d operation, g this$0) {
            Intrinsics.j(operation, "$operation");
            Intrinsics.j(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        private final void n(ArrayList<View> transitioningViews, View view) {
            if (!(view instanceof ViewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (androidx.core.view.g.c(viewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.i(child, "child");
                    n(transitioningViews, child);
                }
            }
        }

        private final Pair<ArrayList<View>, Object> o(ViewGroup container, b0.d lastIn, final b0.d firstOut) {
            final b0.d dVar = lastIn;
            View view = new View(container.getContext());
            final Rect rect = new Rect();
            Iterator<h> it = this.transitionInfos.iterator();
            boolean z10 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().g() && firstOut != null && dVar != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    T.a(dVar.getFragment(), firstOut.getFragment(), this.isPop, this.firstOutViews, true);
                    p2.J.a(container, new Runnable() { // from class: androidx.fragment.app.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6107f.g.p(dVar, firstOut, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        Intrinsics.i(str, "exitingNames[0]");
                        view2 = this.firstOutViews.get(str);
                        this.transitionImpl.v(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        Intrinsics.i(str2, "enteringNames[0]");
                        final View view3 = this.lastInViews.get(str2);
                        if (view3 != null) {
                            final V v10 = this.transitionImpl;
                            p2.J.a(container, new Runnable() { // from class: androidx.fragment.app.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C6107f.g.q(v10, view3, rect);
                                }
                            });
                            z10 = true;
                        }
                    }
                    this.transitionImpl.z(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    V v11 = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    v11.s(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<h> it2 = this.transitionInfos.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                h next = it2.next();
                b0.d operation = next.getOperation();
                boolean z11 = z10;
                Object objH = this.transitionImpl.h(next.getTransition());
                if (objH != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    Iterator<h> it3 = it2;
                    View view4 = operation.getFragment().mView;
                    Intrinsics.i(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation == firstOut || operation == dVar)) {
                        if (operation == firstOut) {
                            arrayList2.removeAll(CollectionsKt.o1(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(CollectionsKt.o1(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.a(objH, view);
                    } else {
                        this.transitionImpl.b(objH, arrayList2);
                        this.transitionImpl.s(objH, objH, arrayList2, null, null, null, null);
                        if (operation.getFinalState() == b0.d.b.GONE) {
                            operation.q(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation.getFragment().mView);
                            this.transitionImpl.r(objH, operation.getFragment().mView, arrayList3);
                            p2.J.a(container, new Runnable() { // from class: androidx.fragment.app.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C6107f.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation.getFinalState() == b0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z11) {
                            this.transitionImpl.u(objH, rect);
                        }
                        if (FragmentManager.isLoggingEnabled(2)) {
                            FS.log_v(FragmentManager.TAG, "Entering Transition: " + objH);
                            FS.log_v(FragmentManager.TAG, ">>>>> EnteringViews <<<<<");
                            Iterator<View> it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                View transitioningViews = it4.next();
                                Intrinsics.i(transitioningViews, "transitioningViews");
                                FS.log_v(FragmentManager.TAG, "View: " + transitioningViews);
                            }
                        }
                    } else {
                        this.transitionImpl.v(objH, view2);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            FS.log_v(FragmentManager.TAG, "Exiting Transition: " + objH);
                            FS.log_v(FragmentManager.TAG, ">>>>> ExitingViews <<<<<");
                            Iterator<View> it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                View transitioningViews2 = it5.next();
                                Intrinsics.i(transitioningViews2, "transitioningViews");
                                FS.log_v(FragmentManager.TAG, "View: " + transitioningViews2);
                            }
                        }
                    }
                    if (next.getIsOverlapAllowed()) {
                        objP = this.transitionImpl.p(objP, objH, null);
                    } else {
                        objP2 = this.transitionImpl.p(objP2, objH, null);
                    }
                    dVar = lastIn;
                    z10 = z11;
                    it2 = it3;
                } else {
                    dVar = lastIn;
                    z10 = z11;
                }
            }
            Object objO = this.transitionImpl.o(objP, objP2, this.sharedElementTransition);
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Final merged transition: " + objO + " for container " + container);
            }
            return new Pair<>(arrayList, objO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(b0.d dVar, b0.d dVar2, g this$0) {
            Intrinsics.j(this$0, "this$0");
            T.a(dVar.getFragment(), dVar2.getFragment(), this$0.isPop, this$0.lastInViews, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(V impl, View view, Rect lastInEpicenterRect) {
            Intrinsics.j(impl, "$impl");
            Intrinsics.j(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.k(view, lastInEpicenterRect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ArrayList transitioningViews) {
            Intrinsics.j(transitioningViews, "$transitioningViews");
            T.e(transitioningViews, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(b0.d operation, g this$0) {
            Intrinsics.j(operation, "$operation");
            Intrinsics.j(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(Ref.ObjectRef seekCancelLambda) {
            Intrinsics.j(seekCancelLambda, "$seekCancelLambda");
            Function0 function0 = (Function0) seekCancelLambda.f143742a;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void C(Object obj) {
            this.controller = obj;
        }

        public final void D(boolean z10) {
            this.noControllerReturned = z10;
        }

        @Override // androidx.fragment.app.b0.b
        /* renamed from: b */
        public boolean getIsSeekingSupported() {
            if (!this.transitionImpl.m()) {
                return false;
            }
            List<h> list = this.transitionInfos;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.getTransition() == null || !this.transitionImpl.n(hVar.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.n(obj);
        }

        @Override // androidx.fragment.app.b0.b
        public void c(ViewGroup container) {
            Intrinsics.j(container, "container");
            this.transitionSignal.a();
        }

        @Override // androidx.fragment.app.b0.b
        public void d(ViewGroup container) {
            Intrinsics.j(container, "container");
            if (!container.isLaidOut() || this.noControllerReturned) {
                for (h hVar : this.transitionInfos) {
                    b0.d operation = hVar.getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (this.noControllerReturned) {
                            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + operation);
                        } else {
                            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                        }
                    }
                    hVar.getOperation().e(this);
                }
                this.noControllerReturned = false;
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                V v10 = this.transitionImpl;
                Intrinsics.g(obj);
                v10.c(obj);
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> pairO = o(container, this.lastIn, this.firstOut);
            ArrayList<View> arrayListA = pairO.a();
            Object objB = pairO.b();
            List<h> list = this.transitionInfos;
            ArrayList<b0.d> arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).getOperation());
            }
            for (final b0.d dVar : arrayList) {
                this.transitionImpl.w(dVar.getFragment(), objB, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6107f.g.y(dVar, this);
                    }
                });
            }
            B(arrayListA, container, new a(container, objB));
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
            }
        }

        @Override // androidx.fragment.app.b0.b
        public void e(C5756b backEvent, ViewGroup container) {
            Intrinsics.j(backEvent, "backEvent");
            Intrinsics.j(container, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.t(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.b0.b
        public void f(ViewGroup container) {
            Intrinsics.j(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    b0.d operation = ((h) it.next()).getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            if (x() && this.sharedElementTransition != null && !getIsSeekingSupported()) {
                FS.log_i(FragmentManager.TAG, "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (getIsSeekingSupported() && x()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Pair<ArrayList<View>, Object> pairO = o(container, this.lastIn, this.firstOut);
                ArrayList<View> arrayListA = pairO.a();
                Object objB = pairO.b();
                List<h> list = this.transitionInfos;
                ArrayList<b0.d> arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((h) it2.next()).getOperation());
                }
                for (final b0.d dVar : arrayList) {
                    this.transitionImpl.x(dVar.getFragment(), objB, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6107f.g.z(objectRef);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6107f.g.A(dVar, this);
                        }
                    });
                }
                B(arrayListA, container, new b(container, objB, objectRef));
            }
        }

        /* renamed from: s, reason: from getter */
        public final Object getController() {
            return this.controller;
        }

        /* renamed from: t, reason: from getter */
        public final b0.d getFirstOut() {
            return this.firstOut;
        }

        /* renamed from: u, reason: from getter */
        public final b0.d getLastIn() {
            return this.lastIn;
        }

        /* renamed from: v, reason: from getter */
        public final V getTransitionImpl() {
            return this.transitionImpl;
        }

        public final List<h> w() {
            return this.transitionInfos;
        }

        public final boolean x() {
            List<h> list = this.transitionInfos;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).getOperation().getFragment().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/f$h;", "Landroidx/fragment/app/f$f;", "Landroidx/fragment/app/b0$d;", "operation", "", "isPop", "providesSharedElementTransition", "<init>", "(Landroidx/fragment/app/b0$d;ZZ)V", "", "transition", "Landroidx/fragment/app/V;", "d", "(Ljava/lang/Object;)Landroidx/fragment/app/V;", "g", "()Z", "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "c", "Z", "h", "isOverlapAllowed", "e", "sharedElementTransition", "()Landroidx/fragment/app/V;", "handlingImpl", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.f$h */
    private static final class h extends C1125f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object transition;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isOverlapAllowed;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Object sharedElementTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b0.d operation, boolean z10, boolean z11) {
            Object returnTransition;
            super(operation);
            Intrinsics.j(operation, "operation");
            b0.d.b finalState = operation.getFinalState();
            b0.d.b bVar = b0.d.b.VISIBLE;
            if (finalState == bVar) {
                Fragment fragment = operation.getFragment();
                returnTransition = z10 ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z10 ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            this.isOverlapAllowed = operation.getFinalState() == bVar ? z10 ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap() : true;
            this.sharedElementTransition = z11 ? z10 ? operation.getFragment().getSharedElementReturnTransition() : operation.getFragment().getSharedElementEnterTransition() : null;
        }

        private final V d(Object transition) {
            if (transition == null) {
                return null;
            }
            V v10 = T.PLATFORM_IMPL;
            if (v10 != null && v10.g(transition)) {
                return v10;
            }
            V v11 = T.SUPPORT_IMPL;
            if (v11 != null && v11.g(transition)) {
                return v11;
            }
            throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final V c() {
            V vD = d(this.transition);
            V vD2 = d(this.sharedElementTransition);
            if (vD == null || vD2 == null || vD == vD2) {
                return vD == null ? vD2 : vD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        /* renamed from: e, reason: from getter */
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        /* renamed from: f, reason: from getter */
        public final Object getTransition() {
            return this.transition;
        }

        public final boolean g() {
            return this.sharedElementTransition != null;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsOverlapAllowed() {
            return this.isOverlapAllowed;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "entry", "", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.f$i */
    static final class i extends Lambda implements Function1<Map.Entry<String, View>, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Collection<String> f55299f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Collection<String> collection) {
            super(1);
            this.f55299f = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Map.Entry<String, View> entry) {
            Intrinsics.j(entry, "entry");
            return Boolean.valueOf(CollectionsKt.h0(this.f55299f, ViewCompat.I(entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6107f(ViewGroup container) {
        super(container);
        Intrinsics.j(container, "container");
    }

    @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    private final void F(List<b> animationInfos) throws Resources.NotFoundException {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = animationInfos.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList2, ((b) it.next()).getOperation().f());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z10 = false;
        for (b bVar : animationInfos) {
            Context context = getContainer().getContext();
            b0.d operation = bVar.getOperation();
            Intrinsics.i(context, "context");
            C6120t.a aVarC = bVar.c(context);
            if (aVarC != null) {
                if (aVarC.f55330b == null) {
                    arrayList.add(bVar);
                } else {
                    Fragment fragment = operation.getFragment();
                    if (operation.f().isEmpty()) {
                        if (operation.getFinalState() == b0.d.b.GONE) {
                            operation.q(false);
                        }
                        operation.b(new c(bVar));
                        z10 = true;
                    } else if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            b0.d operation2 = bVar2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (zIsEmpty) {
                if (!z10) {
                    operation2.b(new a(bVar2));
                } else if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(C6107f this$0, b0.d operation) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(operation, "$operation");
        this$0.c(operation);
    }

    private final void H(List<h> transitionInfos, boolean isPop, b0.d firstOut, b0.d lastIn) {
        ArrayList arrayList;
        Iterator it;
        V v10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        int i10;
        String strB;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : transitionInfos) {
            if (!((h) obj2).b()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<h> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (((h) obj3).c() != null) {
                arrayList5.add(obj3);
            }
        }
        V v11 = null;
        Object obj4 = null;
        for (h hVar : arrayList5) {
            V vC = hVar.c();
            if (v11 != null && vC != v11) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.getOperation().getFragment() + " returned Transition " + hVar.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            v11 = vC;
        }
        if (v11 == null) {
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        C5603a c5603a = new C5603a();
        ArrayList<String> arrayList8 = new ArrayList<>();
        ArrayList<String> arrayList9 = new ArrayList<>();
        C5603a<String, View> c5603a2 = new C5603a<>();
        C5603a<String, View> c5603a3 = new C5603a<>();
        ArrayList<String> sharedElementTargetNames = arrayList8;
        Iterator it2 = arrayList5.iterator();
        ArrayList<String> sharedElementSourceNames = arrayList9;
        while (it2.hasNext()) {
            h hVar2 = (h) it2.next();
            if (!hVar2.g() || firstOut == null || lastIn == null) {
                arrayList = arrayList5;
                it = it2;
                v10 = v11;
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
            } else {
                Object objB = v11.B(v11.h(hVar2.getSharedElementTransition()));
                sharedElementSourceNames = lastIn.getFragment().getSharedElementSourceNames();
                Intrinsics.i(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = firstOut.getFragment().getSharedElementSourceNames();
                Intrinsics.i(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames2 = firstOut.getFragment().getSharedElementTargetNames();
                Intrinsics.i(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames2.size();
                arrayList = arrayList5;
                it = it2;
                int i11 = 0;
                while (i11 < size) {
                    V v12 = v11;
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i11));
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i11));
                    }
                    i11++;
                    v11 = v12;
                }
                v10 = v11;
                sharedElementTargetNames = lastIn.getFragment().getSharedElementTargetNames();
                Intrinsics.i(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                Pair pairA = !isPop ? TuplesKt.a(firstOut.getFragment().getExitTransitionCallback(), lastIn.getFragment().getEnterTransitionCallback()) : TuplesKt.a(firstOut.getFragment().getEnterTransitionCallback(), lastIn.getFragment().getExitTransitionCallback());
                androidx.core.app.x xVar = (androidx.core.app.x) pairA.a();
                androidx.core.app.x xVar2 = (androidx.core.app.x) pairA.b();
                int size2 = sharedElementSourceNames.size();
                int i12 = 0;
                while (true) {
                    arrayList2 = arrayList6;
                    if (i12 >= size2) {
                        break;
                    }
                    ArrayList arrayList10 = arrayList7;
                    String str = sharedElementSourceNames.get(i12);
                    Intrinsics.i(str, "exitingNames[i]");
                    String str2 = sharedElementTargetNames.get(i12);
                    Intrinsics.i(str2, "enteringNames[i]");
                    c5603a.put(str, str2);
                    i12++;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList10;
                }
                arrayList3 = arrayList7;
                int i13 = 2;
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, ">>> entering view names <<<");
                    Iterator<String> it3 = sharedElementTargetNames.iterator();
                    while (true) {
                        i10 = i13;
                        if (!it3.hasNext()) {
                            break;
                        }
                        Iterator<String> it4 = it3;
                        FS.log_v(FragmentManager.TAG, "Name: " + it3.next());
                        objB = objB;
                        i13 = i10;
                        it3 = it4;
                    }
                    obj = objB;
                    FS.log_v(FragmentManager.TAG, ">>> exiting view names <<<");
                    for (Iterator<String> it5 = sharedElementSourceNames.iterator(); it5.hasNext(); it5 = it5) {
                        FS.log_v(FragmentManager.TAG, "Name: " + it5.next());
                    }
                } else {
                    obj = objB;
                    i10 = 2;
                }
                View view = firstOut.getFragment().mView;
                Intrinsics.i(view, "firstOut.fragment.mView");
                I(c5603a2, view);
                c5603a2.s(sharedElementSourceNames);
                if (xVar != null) {
                    if (FragmentManager.isLoggingEnabled(i10)) {
                        FS.log_v(FragmentManager.TAG, "Executing exit callback for operation " + firstOut);
                    }
                    xVar.d(sharedElementSourceNames, c5603a2);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i14 = size3 - 1;
                            String str3 = sharedElementSourceNames.get(size3);
                            Intrinsics.i(str3, "exitingNames[i]");
                            String str4 = str3;
                            View view2 = c5603a2.get(str4);
                            if (view2 == null) {
                                c5603a.remove(str4);
                            } else if (!Intrinsics.e(str4, ViewCompat.I(view2))) {
                                c5603a.put(ViewCompat.I(view2), (String) c5603a.remove(str4));
                            }
                            if (i14 < 0) {
                                break;
                            } else {
                                size3 = i14;
                            }
                        }
                    }
                } else {
                    c5603a.s(c5603a2.keySet());
                }
                View view3 = lastIn.getFragment().mView;
                Intrinsics.i(view3, "lastIn.fragment.mView");
                I(c5603a3, view3);
                c5603a3.s(sharedElementTargetNames);
                c5603a3.s(c5603a.values());
                if (xVar2 != null) {
                    if (FragmentManager.isLoggingEnabled(i10)) {
                        FS.log_v(FragmentManager.TAG, "Executing enter callback for operation " + lastIn);
                    }
                    xVar2.d(sharedElementTargetNames, c5603a3);
                    int size4 = sharedElementTargetNames.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i15 = size4 - 1;
                            String str5 = sharedElementTargetNames.get(size4);
                            Intrinsics.i(str5, "enteringNames[i]");
                            String str6 = str5;
                            View view4 = c5603a3.get(str6);
                            if (view4 == null) {
                                String strB2 = T.b(c5603a, str6);
                                if (strB2 != null) {
                                    c5603a.remove(strB2);
                                }
                            } else if (!Intrinsics.e(str6, ViewCompat.I(view4)) && (strB = T.b(c5603a, str6)) != null) {
                                c5603a.put(strB, ViewCompat.I(view4));
                            }
                            if (i15 < 0) {
                                break;
                            } else {
                                size4 = i15;
                            }
                        }
                    }
                } else {
                    T.d(c5603a, c5603a3);
                }
                Collection<String> collectionKeySet = c5603a.keySet();
                Intrinsics.i(collectionKeySet, "sharedElementNameMapping.keys");
                J(c5603a2, collectionKeySet);
                Collection<String> collectionValues = c5603a.values();
                Intrinsics.i(collectionValues, "sharedElementNameMapping.values");
                J(c5603a3, collectionValues);
                if (c5603a.isEmpty()) {
                    FS.log_i(FragmentManager.TAG, "Ignoring shared elements transition " + obj + " between " + firstOut + " and " + lastIn + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList5 = arrayList;
                    it2 = it;
                    v11 = v10;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    obj4 = null;
                } else {
                    obj4 = obj;
                }
            }
            arrayList5 = arrayList;
            it2 = it;
            v11 = v10;
            arrayList6 = arrayList2;
            arrayList7 = arrayList3;
        }
        ArrayList arrayList11 = arrayList5;
        V v13 = v11;
        ArrayList arrayList12 = arrayList6;
        ArrayList arrayList13 = arrayList7;
        if (obj4 == null) {
            if (arrayList11.isEmpty()) {
                return;
            }
            Iterator it6 = arrayList11.iterator();
            while (it6.hasNext()) {
                if (((h) it6.next()).getTransition() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList11, firstOut, lastIn, v13, obj4, arrayList12, arrayList13, c5603a, sharedElementTargetNames, sharedElementSourceNames, c5603a2, c5603a3, isPop);
        Iterator it7 = arrayList11.iterator();
        while (it7.hasNext()) {
            ((h) it7.next()).getOperation().b(gVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    @Override // androidx.fragment.app.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.util.List<? extends androidx.fragment.app.b0.d> r11, boolean r12) throws android.content.res.Resources.NotFoundException {
        /*
            r10 = this;
            java.lang.String r0 = "operations"
            kotlin.jvm.internal.Intrinsics.j(r11, r0)
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L13
            java.lang.String r1 = "Collecting Effects"
            com.fullstory.FS.log_v(r2, r1)
        L13:
            r1 = r11
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r3 = r1.hasNext()
            r4 = 0
            java.lang.String r5 = "operation.fragment.mView"
            if (r3 == 0) goto L44
            java.lang.Object r3 = r1.next()
            r6 = r3
            androidx.fragment.app.b0$d r6 = (androidx.fragment.app.b0.d) r6
            androidx.fragment.app.b0$d$b$a r7 = androidx.fragment.app.b0.d.b.INSTANCE
            androidx.fragment.app.Fragment r8 = r6.getFragment()
            android.view.View r8 = r8.mView
            kotlin.jvm.internal.Intrinsics.i(r8, r5)
            androidx.fragment.app.b0$d$b r7 = r7.a(r8)
            androidx.fragment.app.b0$d$b r8 = androidx.fragment.app.b0.d.b.VISIBLE
            if (r7 != r8) goto L1a
            androidx.fragment.app.b0$d$b r6 = r6.getFinalState()
            if (r6 == r8) goto L1a
            goto L45
        L44:
            r3 = r4
        L45:
            androidx.fragment.app.b0$d r3 = (androidx.fragment.app.b0.d) r3
            int r1 = r11.size()
            java.util.ListIterator r1 = r11.listIterator(r1)
        L4f:
            boolean r6 = r1.hasPrevious()
            if (r6 == 0) goto L76
            java.lang.Object r6 = r1.previous()
            r7 = r6
            androidx.fragment.app.b0$d r7 = (androidx.fragment.app.b0.d) r7
            androidx.fragment.app.b0$d$b$a r8 = androidx.fragment.app.b0.d.b.INSTANCE
            androidx.fragment.app.Fragment r9 = r7.getFragment()
            android.view.View r9 = r9.mView
            kotlin.jvm.internal.Intrinsics.i(r9, r5)
            androidx.fragment.app.b0$d$b r8 = r8.a(r9)
            androidx.fragment.app.b0$d$b r9 = androidx.fragment.app.b0.d.b.VISIBLE
            if (r8 == r9) goto L4f
            androidx.fragment.app.b0$d$b r7 = r7.getFinalState()
            if (r7 != r9) goto L4f
            r4 = r6
        L76:
            androidx.fragment.app.b0$d r4 = (androidx.fragment.app.b0.d) r4
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L9a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Executing operations from "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " to "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.fullstory.FS.log_v(r2, r0)
        L9a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.K(r11)
            java.util.Iterator r11 = r11.iterator()
        Lab:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Ldb
            java.lang.Object r2 = r11.next()
            androidx.fragment.app.b0$d r2 = (androidx.fragment.app.b0.d) r2
            androidx.fragment.app.f$b r5 = new androidx.fragment.app.f$b
            r5.<init>(r2, r12)
            r0.add(r5)
            androidx.fragment.app.f$h r5 = new androidx.fragment.app.f$h
            r6 = 0
            r7 = 1
            if (r12 == 0) goto Lc9
            if (r2 != r3) goto Lcc
        Lc7:
            r6 = r7
            goto Lcc
        Lc9:
            if (r2 != r4) goto Lcc
            goto Lc7
        Lcc:
            r5.<init>(r2, r12, r6)
            r1.add(r5)
            androidx.fragment.app.d r5 = new androidx.fragment.app.d
            r5.<init>()
            r2.a(r5)
            goto Lab
        Ldb:
            r10.H(r1, r12, r3, r4)
            r10.F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C6107f.d(java.util.List, boolean):void");
    }

    private final void I(Map<String, View> namedViews, View view) {
        String strI = ViewCompat.I(view);
        if (strI != null) {
            namedViews.put(strI, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.i(child, "child");
                    I(namedViews, child);
                }
            }
        }
    }

    private final void J(C5603a<String, View> c5603a, Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = c5603a.entrySet();
        Intrinsics.i(entries, "entries");
        CollectionsKt.O(entries, new i(collection));
    }

    private final void K(List<? extends b0.d> operations) {
        Fragment fragment = ((b0.d) CollectionsKt.D0(operations)).getFragment();
        for (b0.d dVar : operations) {
            dVar.getFragment().mAnimationInfo.f55014c = fragment.mAnimationInfo.f55014c;
            dVar.getFragment().mAnimationInfo.f55015d = fragment.mAnimationInfo.f55015d;
            dVar.getFragment().mAnimationInfo.f55016e = fragment.mAnimationInfo.f55016e;
            dVar.getFragment().mAnimationInfo.f55017f = fragment.mAnimationInfo.f55017f;
        }
    }
}
