package Rj;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import ee.C13790a;
import ee.C13792c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p2.C16349c0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\u0003*\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/View;", "", "count", "", "e", "(Landroid/view/View;I)V", "Landroidx/appcompat/widget/Toolbar;", "Landroidx/appcompat/widget/ActionMenuView;", "d", "(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;", "menuItemId", "Landroidx/appcompat/view/menu/ActionMenuItemView;", "c", "(Landroidx/appcompat/widget/ActionMenuView;I)Landroidx/appcompat/view/menu/ActionMenuItemView;", "Lee/a;", "badgeDrawable", "a", "(Landroidx/appcompat/widget/Toolbar;ILee/a;)V", "b", "(Landroidx/appcompat/widget/Toolbar;Lee/a;)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class a {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Rj.a$a, reason: collision with other inner class name */
    public static final class ViewOnLayoutChangeListenerC0752a implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C13790a f33410a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuItemView f33411b;

        public ViewOnLayoutChangeListenerC0752a(C13790a c13790a, ActionMenuItemView actionMenuItemView) {
            this.f33410a = c13790a;
            this.f33411b = actionMenuItemView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            C13792c.a(this.f33410a, this.f33411b);
            this.f33410a.O(this.f33411b.getTotalPaddingEnd() + (this.f33410a.getIntrinsicWidth() / 2));
            this.f33410a.S(this.f33411b.getTotalPaddingTop());
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Toolbar f33412a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C13790a f33413b;

        public b(Toolbar toolbar, C13790a c13790a) {
            this.f33412a = toolbar;
            this.f33413b = c13790a;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            Sequence<View> sequenceB;
            Sequence sequenceB2;
            Sequence sequenceM;
            view.removeOnLayoutChangeListener(this);
            ActionMenuView actionMenuViewD = a.d(this.f33412a);
            if (actionMenuViewD != null && (sequenceB = C16349c0.b(actionMenuViewD)) != null && (sequenceB2 = SequencesKt.B(sequenceB, c.f33414a)) != null && (sequenceM = SequencesKt.M(sequenceB2, d.f33415a)) != null) {
                Iterator it = sequenceM.iterator();
                while (it.hasNext()) {
                    ((ActionMenuItemView) it.next()).getOverlay().remove(this.f33413b);
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<View, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f33414a = new c();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View it) {
            Intrinsics.j(it, "it");
            return Boolean.valueOf(it instanceof ActionMenuItemView);
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<View, ActionMenuItemView> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f33415a = new d();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActionMenuItemView invoke(View it) {
            Intrinsics.j(it, "it");
            return (ActionMenuItemView) it;
        }

        d() {
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C13790a f33416a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f33417b;

        public e(C13790a c13790a, View view) {
            this.f33416a = c13790a;
            this.f33417b = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            C13792c.a(this.f33416a, this.f33417b);
        }
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public static final void a(Toolbar toolbar, int i10, C13790a badgeDrawable) {
        ActionMenuItemView actionMenuItemViewC;
        Intrinsics.j(toolbar, "<this>");
        Intrinsics.j(badgeDrawable, "badgeDrawable");
        b(toolbar, badgeDrawable);
        ActionMenuView actionMenuViewD = d(toolbar);
        if (actionMenuViewD == null || (actionMenuItemViewC = c(actionMenuViewD, i10)) == null) {
            return;
        }
        if (!toolbar.isLaidOut() || toolbar.isLayoutRequested()) {
            toolbar.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0752a(badgeDrawable, actionMenuItemViewC));
            return;
        }
        C13792c.a(badgeDrawable, actionMenuItemViewC);
        badgeDrawable.O(actionMenuItemViewC.getTotalPaddingEnd() + (badgeDrawable.getIntrinsicWidth() / 2));
        badgeDrawable.S(actionMenuItemViewC.getTotalPaddingTop());
    }

    @SuppressLint({"RestrictedApi"})
    public static final void b(Toolbar toolbar, C13790a badgeDrawable) {
        Sequence<View> sequenceB;
        Sequence sequenceB2;
        Sequence sequenceM;
        Intrinsics.j(toolbar, "<this>");
        Intrinsics.j(badgeDrawable, "badgeDrawable");
        if (!toolbar.isLaidOut() || toolbar.isLayoutRequested()) {
            toolbar.addOnLayoutChangeListener(new b(toolbar, badgeDrawable));
            return;
        }
        ActionMenuView actionMenuViewD = d(toolbar);
        if (actionMenuViewD == null || (sequenceB = C16349c0.b(actionMenuViewD)) == null || (sequenceB2 = SequencesKt.B(sequenceB, c.f33414a)) == null || (sequenceM = SequencesKt.M(sequenceB2, d.f33415a)) == null) {
            return;
        }
        Iterator it = sequenceM.iterator();
        while (it.hasNext()) {
            ((ActionMenuItemView) it.next()).getOverlay().remove(badgeDrawable);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static final ActionMenuItemView c(ActionMenuView actionMenuView, int i10) {
        View next;
        h itemData;
        Intrinsics.j(actionMenuView, "<this>");
        Iterator<View> it = C16349c0.b(actionMenuView).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            View view = next;
            if ((view instanceof ActionMenuItemView) && (itemData = ((ActionMenuItemView) view).getItemData()) != null && itemData.getItemId() == i10) {
                break;
            }
        }
        View view2 = next;
        if (view2 != null) {
            return (ActionMenuItemView) view2;
        }
        return null;
    }

    public static final ActionMenuView d(Toolbar toolbar) {
        View next;
        Intrinsics.j(toolbar, "<this>");
        Iterator<View> it = C16349c0.b(toolbar).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof ActionMenuView) {
                break;
            }
        }
        View view = next;
        if (view != null) {
            return (ActionMenuView) view;
        }
        return null;
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public static final void e(View view, int i10) {
        Intrinsics.j(view, "<this>");
        view.getOverlay().clear();
        C13790a c13790aE = C13790a.e(view.getContext());
        c13790aE.R(i10);
        c13790aE.V(i10 > 0);
        Intrinsics.i(c13790aE, "apply(...)");
        c13790aE.O(view.getPaddingEnd() + (c13790aE.getIntrinsicWidth() / 2));
        c13790aE.S(view.getPaddingTop());
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new e(c13790aE, view));
        } else {
            C13792c.a(c13790aE, view);
        }
    }
}
