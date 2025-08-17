package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0005\u001a1\u0010\f\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000f\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u0017\u001a\u00020\u0013*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroid/view/View;", "root", "", "direction", "f", "(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;", "start", PreferencesHelper.PREF_ID, "i", "Lkotlin/Function1;", "", "predicate", "g", "(Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)Landroid/view/View;", "childToSkip", "h", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroid/view/View;)Landroid/view/View;", "LZ/T;", "views", "", "d", "(Landroid/view/View;LZ/T;I)V", "inTouchMode", "e", "(Landroid/view/View;LZ/T;IZ)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class D0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "t", "", "a", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<View, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f51781f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f51782g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, View view2) {
            super(1);
            this.f51781f = view;
            this.f51782g = view2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(D0.i(this.f51781f, view, view.getNextFocusForwardId()) == this.f51782g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View f(View view, View view2, int i10) {
        int nextFocusForwardId;
        if (i10 == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return g(view2, view, new a(view2, view));
        }
        if (i10 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return i(view2, view, nextFocusForwardId);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.View g(android.view.View r4, android.view.View r5, kotlin.jvm.functions.Function1<? super android.view.View, java.lang.Boolean> r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            android.view.View r1 = h(r5, r6, r1)
            if (r1 != 0) goto L1d
            if (r5 != r4) goto Lb
            goto L1d
        Lb:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L1c
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L16
            goto L1c
        L16:
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L2
        L1c:
            return r0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.D0.g(android.view.View, android.view.View, kotlin.jvm.functions.Function1):android.view.View");
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<View, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f51783f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f51783f = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            boolean z10;
            if (view.getId() == this.f51783f) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View i(View view, View view2, int i10) {
        return g(view, view2, new b(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(View view, Z.T<View> t10, int i10) {
        e(view, t10, i10, view.isInTouchMode());
    }

    private static final void e(View view, Z.T<View> t10, int i10, boolean z10) {
        if (view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z10 || view.isFocusableInTouchMode())) {
            t10.n(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                e(viewGroup.getChildAt(i11), t10, i10, z10);
            }
        }
    }

    private static final View h(View view, Function1<? super View, Boolean> function1, View view2) {
        View viewH;
        if (function1.invoke(view).booleanValue()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != view2 && (viewH = h(childAt, function1, view2)) != null) {
                    return viewH;
                }
            }
            return null;
        }
        return null;
    }
}
