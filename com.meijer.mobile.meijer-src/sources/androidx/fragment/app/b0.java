package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.view.C5756b;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u0000 \u00132\u00020\u0001:\u0004>B36B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010 \u001a\u00020\u00122\u0011\u0010\u001f\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b(\u0010'J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b)\u0010'J\u0015\u0010+\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0017¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0012¢\u0006\u0004\b-\u0010\u001cJ\r\u0010.\u001a\u00020\u0017¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u001cJ\r\u00101\u001a\u00020\u0012¢\u0006\u0004\b1\u0010\u001cJ\u0017\u00103\u001a\u00020\u00122\u0006\u00102\u001a\u00020\bH\u0000¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0012¢\u0006\u0004\b5\u0010\u001cJ*\u00106\u001a\u00020\u00122\u0011\u0010\u001f\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u001e0\u001d2\u0006\u0010*\u001a\u00020\u0017H&¢\u0006\u0004\b6\u00107J\"\u00108\u001a\u00020\u00122\u0011\u0010\u001f\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u001e0\u001dH\u0010¢\u0006\u0004\b8\u0010!J\u0015\u0010;\u001a\u00020\u00122\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0012¢\u0006\u0004\b=\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010CR\u0016\u0010G\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010FR\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010FR\u0016\u0010I\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010F¨\u0006J"}, d2 = {"Landroidx/fragment/app/b0;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/b0$d;", "o", "(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/b0$d;", "p", "Landroidx/fragment/app/b0$d$b;", "finalState", "Landroidx/fragment/app/b0$d$a;", "lifecycleImpact", "Landroidx/fragment/app/O;", "fragmentStateManager", "", "g", "(Landroidx/fragment/app/b0$d$b;Landroidx/fragment/app/b0$d$a;Landroidx/fragment/app/O;)V", "", "newPendingOperations", "", "x", "(Ljava/util/List;)Z", "w", "C", "()V", "", "Lkotlin/jvm/JvmSuppressWildcards;", "operations", "B", "(Ljava/util/List;)V", "s", "(Landroidx/fragment/app/O;)Landroidx/fragment/app/b0$d$a;", "j", "(Landroidx/fragment/app/b0$d$b;Landroidx/fragment/app/O;)V", "m", "(Landroidx/fragment/app/O;)V", "k", "l", "isPop", "D", "(Z)V", "z", "y", "()Z", "r", "n", "operation", "c", "(Landroidx/fragment/app/b0$d;)V", "q", "d", "(Ljava/util/List;Z)V", "e", "Landroidx/activity/b;", "backEvent", "A", "(Landroidx/activity/b;)V", "f", "a", "Landroid/view/ViewGroup;", "t", "()Landroid/view/ViewGroup;", "b", "Ljava/util/List;", "pendingOperations", "runningOperations", "Z", "runningNonSeekableTransition", "operationDirectionIsPop", "isContainerPostponed", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup container;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<d> pendingOperations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<d> runningOperations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean runningNonSeekableTransition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean operationDirectionIsPop;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isContainerPostponed;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/b0$a;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/b0;", "a", "(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/b0;", "Landroidx/fragment/app/c0;", "factory", "b", "(Landroid/view/ViewGroup;Landroidx/fragment/app/c0;)Landroidx/fragment/app/b0;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.b0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final b0 a(ViewGroup container, FragmentManager fragmentManager) {
            Intrinsics.j(container, "container");
            Intrinsics.j(fragmentManager, "fragmentManager");
            c0 specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
            Intrinsics.i(specialEffectsControllerFactory, "fragmentManager.specialEffectsControllerFactory");
            return b(container, specialEffectsControllerFactory);
        }

        @JvmStatic
        public final b0 b(ViewGroup container, c0 factory) {
            Intrinsics.j(container, "container");
            Intrinsics.j(factory, "factory");
            Object tag = container.getTag(K2.b.f16259b);
            if (tag instanceof b0) {
                return (b0) tag;
            }
            b0 b0VarA = factory.a(container);
            Intrinsics.i(b0VarA, "factory.createController(container)");
            container.setTag(K2.b.f16259b, b0VarA);
            return b0VarA;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/fragment/app/b0$b;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "", "g", "(Landroid/view/ViewGroup;)V", "f", "Landroidx/activity/b;", "backEvent", "e", "(Landroidx/activity/b;Landroid/view/ViewGroup;)V", "d", "a", "c", "", "Z", "b", "()Z", "isSeekingSupported", "isStarted", "isCancelled", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isSeekingSupported;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isStarted;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isCancelled;

        public void c(ViewGroup container) {
            Intrinsics.j(container, "container");
        }

        public void d(ViewGroup container) {
            Intrinsics.j(container, "container");
        }

        public void e(C5756b backEvent, ViewGroup container) {
            Intrinsics.j(backEvent, "backEvent");
            Intrinsics.j(container, "container");
        }

        public void f(ViewGroup container) {
            Intrinsics.j(container, "container");
        }

        public final void a(ViewGroup container) {
            Intrinsics.j(container, "container");
            if (!this.isCancelled) {
                c(container);
            }
            this.isCancelled = true;
        }

        /* renamed from: b, reason: from getter */
        public boolean getIsSeekingSupported() {
            return this.isSeekingSupported;
        }

        public final void g(ViewGroup container) {
            Intrinsics.j(container, "container");
            if (!this.isStarted) {
                f(container);
            }
            this.isStarted = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/b0$c;", "Landroidx/fragment/app/b0$d;", "Landroidx/fragment/app/b0$d$b;", "finalState", "Landroidx/fragment/app/b0$d$a;", "lifecycleImpact", "Landroidx/fragment/app/O;", "fragmentStateManager", "<init>", "(Landroidx/fragment/app/b0$d$b;Landroidx/fragment/app/b0$d$a;Landroidx/fragment/app/O;)V", "", "p", "()V", "d", "l", "Landroidx/fragment/app/O;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class c extends d {

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final O fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b finalState, d.a lifecycleImpact, O fragmentStateManager) {
            Intrinsics.j(finalState, "finalState");
            Intrinsics.j(lifecycleImpact, "lifecycleImpact");
            Intrinsics.j(fragmentStateManager, "fragmentStateManager");
            Fragment fragmentK = fragmentStateManager.k();
            Intrinsics.i(fragmentK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragmentK);
            this.fragmentStateManager = fragmentStateManager;
        }

        @Override // androidx.fragment.app.b0.d
        public void d() {
            super.d();
            getFragment().mTransitioning = false;
            this.fragmentStateManager.m();
        }

        @Override // androidx.fragment.app.b0.d
        public void p() {
            if (!getIsStarted()) {
                super.p();
                if (getLifecycleImpact() == d.a.ADDING) {
                    Fragment fragmentK = this.fragmentStateManager.k();
                    Intrinsics.i(fragmentK, "fragmentStateManager.fragment");
                    View viewFindFocus = fragmentK.mView.findFocus();
                    if (viewFindFocus != null) {
                        fragmentK.setFocusedView(viewFindFocus);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            FS.log_v(FragmentManager.TAG, "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK);
                        }
                    }
                    View viewRequireView = getFragment().requireView();
                    Intrinsics.i(viewRequireView, "this.fragment.requireView()");
                    if (viewRequireView.getParent() == null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            FS.log_v(FragmentManager.TAG, "Adding fragment " + fragmentK + " view " + viewRequireView + " to container in onStart");
                        }
                        this.fragmentStateManager.b();
                        viewRequireView.setAlpha(0.0f);
                    }
                    if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            FS.log_v(FragmentManager.TAG, "Making view " + viewRequireView + " INVISIBLE in onStart");
                        }
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(fragmentK.getPostOnViewCreatedAlpha());
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "Setting view alpha to " + fragmentK.getPostOnViewCreatedAlpha() + " in onStart");
                        return;
                    }
                    return;
                }
                if (getLifecycleImpact() == d.a.REMOVING) {
                    Fragment fragmentK2 = this.fragmentStateManager.k();
                    Intrinsics.i(fragmentK2, "fragmentStateManager.fragment");
                    View viewRequireView2 = fragmentK2.requireView();
                    Intrinsics.i(viewRequireView2, "fragment.requireView()");
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "Clearing focus " + viewRequireView2.findFocus() + " on view " + viewRequireView2 + " for Fragment " + fragmentK2);
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0016\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0011¢\u0006\u0004\b\u001f\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R$\u00105\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R$\u00108\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R*\u0010<\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u0010;R$\u0010>\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b=\u00104R\"\u0010A\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00102\u001a\u0004\b?\u00104\"\u0004\b@\u0010;R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010.R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b6\u0010D¨\u0006F"}, d2 = {"Landroidx/fragment/app/b0$d;", "", "Landroidx/fragment/app/b0$d$b;", "finalState", "Landroidx/fragment/app/b0$d$a;", "lifecycleImpact", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/b0$d$b;Landroidx/fragment/app/b0$d$a;Landroidx/fragment/app/Fragment;)V", "", "toString", "()Ljava/lang/String;", "Landroid/view/ViewGroup;", "container", "", "c", "(Landroid/view/ViewGroup;)V", "o", "(Landroidx/fragment/app/b0$d$b;Landroidx/fragment/app/b0$d$a;)V", "Ljava/lang/Runnable;", "listener", "a", "(Ljava/lang/Runnable;)V", "Landroidx/fragment/app/b0$b;", "effect", "b", "(Landroidx/fragment/app/b0$b;)V", "e", "p", "()V", "d", "Landroidx/fragment/app/b0$d$b;", "g", "()Landroidx/fragment/app/b0$d$b;", "setFinalState", "(Landroidx/fragment/app/b0$d$b;)V", "Landroidx/fragment/app/b0$d$a;", "i", "()Landroidx/fragment/app/b0$d$a;", "setLifecycleImpact", "(Landroidx/fragment/app/b0$d$a;)V", "Landroidx/fragment/app/Fragment;", "h", "()Landroidx/fragment/app/Fragment;", "", "Ljava/util/List;", "completionListeners", "", "<set-?>", "Z", "k", "()Z", "isCanceled", "f", "l", "isComplete", "m", "r", "(Z)V", "isSeeking", "n", "isStarted", "j", "q", "isAwaitingContainerChanges", "_effects", "", "()Ljava/util/List;", "effects", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private b finalState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private a lifecycleImpact;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Fragment fragment;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<Runnable> completionListeners;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean isCanceled;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean isComplete;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean isSeeking;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean isStarted;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean isAwaitingContainerChanges;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final List<b> _effects;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final List<b> effects;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/b0$d$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nj\u0002\b\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/b0$d$b;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "container", "", "b", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "a", "c", "d", "e", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/b0$d$b$a;", "", "<init>", "()V", "Landroid/view/View;", "Landroidx/fragment/app/b0$d$b;", "a", "(Landroid/view/View;)Landroidx/fragment/app/b0$d$b;", "", "visibility", "b", "(I)Landroidx/fragment/app/b0$d$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.fragment.app.b0$d$b$a, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final b a(View view) {
                    Intrinsics.j(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                @JvmStatic
                public final b b(int visibility) {
                    if (visibility == 0) {
                        return b.VISIBLE;
                    }
                    if (visibility == 4) {
                        return b.INVISIBLE;
                    }
                    if (visibility == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.fragment.app.b0$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C1123b {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @JvmStatic
            public static final b e(int i10) {
                return INSTANCE.b(i10);
            }

            public final void b(View view, ViewGroup container) {
                Intrinsics.j(view, "view");
                Intrinsics.j(container, "container");
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Calling apply state");
                }
                int i10 = C1123b.$EnumSwitchMapping$0[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class c {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public void d() {
            this.isStarted = false;
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public void p() {
            this.isStarted = true;
        }

        public d(b finalState, a lifecycleImpact, Fragment fragment) {
            Intrinsics.j(finalState, "finalState");
            Intrinsics.j(lifecycleImpact, "lifecycleImpact");
            Intrinsics.j(fragment, "fragment");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.isAwaitingContainerChanges = true;
            ArrayList arrayList = new ArrayList();
            this._effects = arrayList;
            this.effects = arrayList;
        }

        public final void a(Runnable listener) {
            Intrinsics.j(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void b(b effect) {
            Intrinsics.j(effect, "effect");
            this._effects.add(effect);
        }

        public final void c(ViewGroup container) {
            Intrinsics.j(container, "container");
            this.isStarted = false;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this._effects.isEmpty()) {
                d();
                return;
            }
            Iterator it = CollectionsKt.j1(this.effects).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        public final void e(b effect) {
            Intrinsics.j(effect, "effect");
            if (this._effects.remove(effect) && this._effects.isEmpty()) {
                d();
            }
        }

        public final List<b> f() {
            return this.effects;
        }

        /* renamed from: g, reason: from getter */
        public final b getFinalState() {
            return this.finalState;
        }

        /* renamed from: h, reason: from getter */
        public final Fragment getFragment() {
            return this.fragment;
        }

        /* renamed from: i, reason: from getter */
        public final a getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getIsAwaitingContainerChanges() {
            return this.isAwaitingContainerChanges;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getIsSeeking() {
            return this.isSeeking;
        }

        /* renamed from: n, reason: from getter */
        public final boolean getIsStarted() {
            return this.isStarted;
        }

        public final void o(b finalState, a lifecycleImpact) {
            Intrinsics.j(finalState, "finalState");
            Intrinsics.j(lifecycleImpact, "lifecycleImpact");
            int i10 = c.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.finalState == b.REMOVED) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                    }
                    this.finalState = b.VISIBLE;
                    this.lifecycleImpact = a.ADDING;
                    this.isAwaitingContainerChanges = true;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = b.REMOVED;
                this.lifecycleImpact = a.REMOVING;
                this.isAwaitingContainerChanges = true;
                return;
            }
            if (i10 == 3 && this.finalState != b.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    FS.log_v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + '.');
                }
                this.finalState = finalState;
            }
        }

        public final void q(boolean z10) {
            this.isAwaitingContainerChanges = z10;
        }

        public final void r(boolean z10) {
            this.isSeeking = z10;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final b0 u(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return INSTANCE.a(viewGroup, fragmentManager);
    }

    @JvmStatic
    public static final b0 v(ViewGroup viewGroup, c0 c0Var) {
        return INSTANCE.b(viewGroup, c0Var);
    }

    public abstract void d(List<d> operations, boolean isPop);

    public final void f() {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "SpecialEffectsController: Completing Back ");
        }
        B(this.runningOperations);
        e(this.runningOperations);
    }

    public final void q() {
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                C();
                B(this.pendingOperations);
                List<d> listM1 = CollectionsKt.m1(this.runningOperations);
                Iterator it = listM1.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).r(false);
                }
                for (d dVar : listM1) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.container);
                }
                List<d> listM12 = CollectionsKt.m1(this.pendingOperations);
                Iterator it2 = listM12.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).r(false);
                }
                for (d dVar2 : listM12) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.container);
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b0(ViewGroup container) {
        Intrinsics.j(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    private final void C() {
        for (d dVar : this.pendingOperations) {
            if (dVar.getLifecycleImpact() == d.a.ADDING) {
                View viewRequireView = dVar.getFragment().requireView();
                Intrinsics.i(viewRequireView, "fragment.requireView()");
                dVar.o(d.b.INSTANCE.b(viewRequireView.getVisibility()), d.a.NONE);
            }
        }
    }

    private final void g(d.b finalState, d.a lifecycleImpact, O fragmentStateManager) {
        synchronized (this.pendingOperations) {
            try {
                Fragment fragmentK = fragmentStateManager.k();
                Intrinsics.i(fragmentK, "fragmentStateManager.fragment");
                d dVarO = o(fragmentK);
                if (dVarO == null) {
                    if (fragmentStateManager.k().mTransitioning || fragmentStateManager.k().mRemoving) {
                        Fragment fragmentK2 = fragmentStateManager.k();
                        Intrinsics.i(fragmentK2, "fragmentStateManager.fragment");
                        dVarO = p(fragmentK2);
                    } else {
                        dVarO = null;
                    }
                }
                if (dVarO != null) {
                    dVarO.o(finalState, lifecycleImpact);
                    return;
                }
                final c cVar = new c(finalState, lifecycleImpact, fragmentStateManager);
                this.pendingOperations.add(cVar);
                cVar.a(new Runnable() { // from class: androidx.fragment.app.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.h(this.f55191a, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: androidx.fragment.app.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.i(this.f55197a, cVar);
                    }
                });
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(b0 this$0, c operation) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            d.b finalState = operation.getFinalState();
            View view = operation.getFragment().mView;
            Intrinsics.i(view, "operation.fragment.mView");
            finalState.b(view, this$0.container);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(b0 this$0, c operation) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    private final d o(Fragment fragment) {
        Object next;
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (Intrinsics.e(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                break;
            }
        }
        return (d) next;
    }

    private final d p(Fragment fragment) {
        Object next;
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (Intrinsics.e(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                break;
            }
        }
        return (d) next;
    }

    private final boolean w(List<d> newPendingOperations) {
        boolean z10;
        List<d> list = newPendingOperations;
        loop0: while (true) {
            z10 = true;
            for (d dVar : list) {
                if (!dVar.f().isEmpty()) {
                    List<b> listF = dVar.f();
                    if (!(listF instanceof Collection) || !listF.isEmpty()) {
                        Iterator<T> it = listF.iterator();
                        while (it.hasNext()) {
                            if (!((b) it.next()).getIsSeekingSupported()) {
                                break;
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                CollectionsKt.C(arrayList, ((d) it2.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(List<d> newPendingOperations) {
        Iterator<T> it = newPendingOperations.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).getFragment().mTransitioning) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void A(C5756b backEvent) {
        Intrinsics.j(backEvent, "backEvent");
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Processing Progress " + backEvent.getProgress());
        }
        List<d> list = this.runningOperations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((d) it.next()).f());
        }
        List listJ1 = CollectionsKt.j1(CollectionsKt.o1(arrayList));
        int size = listJ1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listJ1.get(i10)).e(backEvent, this.container);
        }
    }

    public final void D(boolean isPop) {
        this.operationDirectionIsPop = isPop;
    }

    public final void c(d operation) {
        Intrinsics.j(operation, "operation");
        if (operation.getIsAwaitingContainerChanges()) {
            d.b finalState = operation.getFinalState();
            View viewRequireView = operation.getFragment().requireView();
            Intrinsics.i(viewRequireView, "operation.fragment.requireView()");
            finalState.b(viewRequireView, this.container);
            operation.q(false);
        }
    }

    public void e(List<d> operations) {
        Intrinsics.j(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((d) it.next()).f());
        }
        List listJ1 = CollectionsKt.j1(CollectionsKt.o1(arrayList));
        int size = listJ1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listJ1.get(i10)).d(this.container);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c(operations.get(i11));
        }
        List listJ12 = CollectionsKt.j1(operations);
        int size3 = listJ12.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) listJ12.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void j(d.b finalState, O fragmentStateManager) {
        Intrinsics.j(finalState, "finalState");
        Intrinsics.j(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(O fragmentStateManager) {
        Intrinsics.j(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(O fragmentStateManager) {
        Intrinsics.j(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(O fragmentStateManager) {
        Intrinsics.j(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    public final void n() {
        boolean z10;
        if (this.isContainerPostponed) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            q();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                List<d> listM1 = CollectionsKt.m1(this.runningOperations);
                this.runningOperations.clear();
                Iterator it = listM1.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.pendingOperations.isEmpty() || !dVar.getFragment().mTransitioning) {
                        z10 = false;
                    }
                    dVar.r(z10);
                }
                for (d dVar2 : listM1) {
                    if (this.runningNonSeekableTransition) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Cancelling operation " + dVar2);
                        }
                        dVar2.c(this.container);
                    }
                    this.runningNonSeekableTransition = false;
                    if (!dVar2.getIsComplete()) {
                        this.runningOperations.add(dVar2);
                    }
                }
                if (!this.pendingOperations.isEmpty()) {
                    C();
                    List<d> listM12 = CollectionsKt.m1(this.pendingOperations);
                    if (listM12.isEmpty()) {
                        return;
                    }
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(listM12);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Executing pending operations");
                    }
                    d(listM12, this.operationDirectionIsPop);
                    boolean zW = w(listM12);
                    boolean zX = x(listM12);
                    if (!zX || zW) {
                        z10 = false;
                    }
                    this.runningNonSeekableTransition = z10;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Operation seekable = " + zW + " \ntransition = " + zX);
                    }
                    if (!zX) {
                        B(listM12);
                        e(listM12);
                    } else if (zW) {
                        B(listM12);
                        int size = listM12.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            c(listM12.get(i10));
                        }
                    }
                    this.operationDirectionIsPop = false;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        if (this.isContainerPostponed) {
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            n();
        }
    }

    public final d.a s(O fragmentStateManager) {
        Intrinsics.j(fragmentStateManager, "fragmentStateManager");
        Fragment fragmentK = fragmentStateManager.k();
        Intrinsics.i(fragmentK, "fragmentStateManager.fragment");
        d dVarO = o(fragmentK);
        d.a lifecycleImpact = dVarO != null ? dVarO.getLifecycleImpact() : null;
        d dVarP = p(fragmentK);
        d.a lifecycleImpact2 = dVarP != null ? dVarP.getLifecycleImpact() : null;
        int i10 = lifecycleImpact == null ? -1 : e.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        return (i10 == -1 || i10 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    /* renamed from: t, reason: from getter */
    public final ViewGroup getContainer() {
        return this.container;
    }

    public final boolean y() {
        return !this.pendingOperations.isEmpty();
    }

    public final void z() {
        d dVarPrevious;
        synchronized (this.pendingOperations) {
            try {
                C();
                List<d> list = this.pendingOperations;
                ListIterator<d> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        dVarPrevious = null;
                        break;
                    }
                    dVarPrevious = listIterator.previous();
                    d dVar = dVarPrevious;
                    d.b.Companion companion = d.b.INSTANCE;
                    View view = dVar.getFragment().mView;
                    Intrinsics.i(view, "operation.fragment.mView");
                    d.b bVarA = companion.a(view);
                    d.b finalState = dVar.getFinalState();
                    d.b bVar = d.b.VISIBLE;
                    if (finalState == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = dVarPrevious;
                Fragment fragment = dVar2 != null ? dVar2.getFragment() : null;
                this.isContainerPostponed = fragment != null ? fragment.isPostponed() : false;
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void B(List<d> operations) {
        int size = operations.size();
        for (int i10 = 0; i10 < size; i10++) {
            operations.get(i10).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((d) it.next()).f());
        }
        List listJ1 = CollectionsKt.j1(CollectionsKt.o1(arrayList));
        int size2 = listJ1.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) listJ1.get(i11)).g(this.container);
        }
    }
}
