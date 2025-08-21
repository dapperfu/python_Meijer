package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.constructor.data.local.PreferencesHelper;
import java.util.Collections;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002%\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0012\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\rR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/ui/platform/C0;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "focused", "g", "(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/ViewGroup;", "", "direction", "f", "(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "LZ/T;", "focusables", "c", "(Landroid/view/ViewGroup;Landroid/view/View;ILZ/T;)Landroid/view/View;", "e", "(LZ/T;Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "LZ/c0;", "count", "", "outLooped", "h", "(Landroid/view/View;LZ/c0;I[Z)Landroid/view/View;", "i", PreferencesHelper.PREF_ID, "", "j", "(I)Z", "d", "Landroid/graphics/Rect;", "a", "Landroid/graphics/Rect;", "focusedRect", "Landroidx/compose/ui/platform/C0$c;", "b", "Landroidx/compose/ui/platform/C0$c;", "userSpecifiedFocusComparator", "LZ/T;", "tmpList", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f51992e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static final a f51993f = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Rect focusedRect = new Rect();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c userSpecifiedFocusComparator = new c(new c.a() { // from class: androidx.compose.ui.platform.B0
        @Override // androidx.compose.ui.platform.C0.c.a
        public final View a(View view, View view2) {
            return C0.k(this.f51988a, view, view2);
        }
    });

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Z.T<View> tmpList = new Z.T<>(0, 1, null);

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/C0$a", "Ljava/lang/ThreadLocal;", "Landroidx/compose/ui/platform/C0;", "a", "()Landroidx/compose/ui/platform/C0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ThreadLocal<C0> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0 initialValue() {
            return new C0();
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/C0$b;", "", "<init>", "()V", "Landroidx/compose/ui/platform/C0;", "a", "()Landroidx/compose/ui/platform/C0;", "instance", "androidx/compose/ui/platform/C0$a", "FocusFinderThreadLocal", "Landroidx/compose/ui/platform/C0$a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.C0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C0 a() {
            C0 c02 = C0.f51993f.get();
            Intrinsics.g(c02);
            return c02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003:\u0001\u0016B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/C0$c;", "Ljava/util/Comparator;", "Landroid/view/View;", "Lkotlin/Comparator;", "Landroidx/compose/ui/platform/C0$c$a;", "mNextFocusGetter", "<init>", "(Landroidx/compose/ui/platform/C0$c$a;)V", "", "b", "()V", "LZ/c0;", "focusables", "root", "c", "(LZ/c0;Landroid/view/View;)V", "head", "d", "(Landroid/view/View;)V", "first", "second", "", "a", "(Landroid/view/View;Landroid/view/View;)I", "Landroidx/compose/ui/platform/C0$c$a;", "LZ/W;", "LZ/W;", "nextFoci", "LZ/X;", "LZ/X;", "isConnectedTo", "headsOfChains", "LZ/S;", "e", "LZ/S;", "originalOrdinal", "f", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Comparator<View> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a mNextFocusGetter;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Z.W<View, View> nextFoci = Z.i0.c();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Z.X<View> isConnectedTo = Z.k0.a();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Z.W<View, View> headsOfChains = Z.i0.c();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Z.S<View> originalOrdinal = Z.b0.b();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private View root;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/C0$c$a;", "", "Landroid/view/View;", "root", "view", "a", "(Landroid/view/View;Landroid/view/View;)Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a {
            View a(View root, View view);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View first, View second) {
            if (first == second) {
                return 0;
            }
            if (first == null) {
                return -1;
            }
            if (second == null) {
                return 1;
            }
            View viewE = this.headsOfChains.e(first);
            View viewE2 = this.headsOfChains.e(second);
            if (viewE == viewE2 && viewE != null) {
                if (first == viewE) {
                    return -1;
                }
                return (second == viewE || this.nextFoci.e(first) == null) ? 1 : -1;
            }
            if (viewE != null) {
                first = viewE;
            }
            if (viewE2 != null) {
                second = viewE2;
            }
            if (viewE == null && viewE2 == null) {
                return 0;
            }
            return this.originalOrdinal.c(first) < this.originalOrdinal.c(second) ? -1 : 1;
        }

        public final void b() {
            this.root = null;
            this.headsOfChains.k();
            this.isConnectedTo.m();
            this.originalOrdinal.j();
            this.nextFoci.k();
        }

        public final void d(View head) {
            View view = head;
            while (head != null) {
                View viewE = this.headsOfChains.e(head);
                if (viewE != null) {
                    if (viewE == view) {
                        return;
                    }
                    head = view;
                    view = viewE;
                }
                this.headsOfChains.x(head, view);
                head = this.nextFoci.e(head);
            }
        }

        public final void c(Z.c0<View> focusables, View root) {
            this.root = root;
            Object[] objArr = focusables.content;
            int i10 = focusables._size;
            for (int i11 = 0; i11 < i10; i11++) {
                this.originalOrdinal.u((View) objArr[i11], i11);
            }
            IntRange intRangeX = RangesKt.x(0, focusables._size);
            int first = intRangeX.getFirst();
            int last = intRangeX.getLast();
            if (first <= last) {
                while (true) {
                    View viewD = focusables.d(last);
                    View viewA = this.mNextFocusGetter.a(root, viewD);
                    if (viewA != null && this.originalOrdinal.a(viewA)) {
                        this.nextFoci.x(viewD, viewA);
                        this.isConnectedTo.h(viewA);
                    }
                    if (last == first) {
                        break;
                    } else {
                        last--;
                    }
                }
            }
            IntRange intRangeX2 = RangesKt.x(0, focusables._size);
            int first2 = intRangeX2.getFirst();
            int last2 = intRangeX2.getLast();
            if (first2 > last2) {
                return;
            }
            while (true) {
                View viewD2 = focusables.d(last2);
                if (this.nextFoci.e(viewD2) != null && !this.isConnectedTo.a(viewD2)) {
                    d(viewD2);
                }
                if (last2 == first2) {
                    return;
                } else {
                    last2--;
                }
            }
        }

        public c(a aVar) {
            this.mNextFocusGetter = aVar;
        }
    }

    private final View h(View focused, Z.c0<View> focusables, int count, boolean[] outLooped) {
        int i10;
        if (count < 2) {
            return null;
        }
        int iK = focusables.k(focused);
        if (iK >= 0 && (i10 = iK + 1) < count) {
            return focusables.d(i10);
        }
        outLooped[0] = true;
        return focusables.d(0);
    }

    private final View i(View focused, Z.c0<View> focusables, int count, boolean[] outLooped) {
        int iF;
        if (count < 2) {
            return null;
        }
        if (focused != null && (iF = focusables.f(focused)) > 0) {
            return focusables.d(iF - 1);
        }
        outLooped[0] = true;
        return focusables.d(count - 1);
    }

    private final boolean j(int id2) {
        return (id2 == 0 || id2 == -1) ? false : true;
    }

    private final View c(ViewGroup root, View focused, int direction, Z.T<View> focusables) {
        Rect rect = this.focusedRect;
        focused.getFocusedRect(rect);
        root.offsetDescendantRectToMyCoords(focused, rect);
        return e(focusables, root, focused, direction);
    }

    @SuppressLint({"AsCollectionCall"})
    private final View e(Z.T<View> focusables, ViewGroup root, View focused, int direction) {
        try {
            c cVar = this.userSpecifiedFocusComparator;
            Intrinsics.g(root);
            cVar.c(focusables, root);
            Collections.sort(focusables.s(), this.userSpecifiedFocusComparator);
            this.userSpecifiedFocusComparator.b();
            int i10 = focusables.get_size();
            View viewI = null;
            if (i10 < 2) {
                return null;
            }
            boolean[] zArr = new boolean[1];
            if (direction == 1) {
                viewI = i(focused, focusables, i10, zArr);
            } else if (direction == 2) {
                viewI = h(focused, focusables, i10, zArr);
            }
            return viewI == null ? focusables.d(i10 - 1) : viewI;
        } catch (Throwable th2) {
            this.userSpecifiedFocusComparator.b();
            throw th2;
        }
    }

    private final ViewGroup g(ViewGroup root, View focused) {
        if (focused != null && focused != root) {
            ViewParent parent = focused.getParent();
            ViewGroup viewGroup = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == root) {
                    if (viewGroup == null) {
                        break;
                    }
                    return viewGroup;
                }
                ViewGroup viewGroup2 = (ViewGroup) parent;
                if (viewGroup2.getTouchscreenBlocksFocus() && focused.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup = viewGroup2;
                }
                parent = viewGroup2.getParent();
            }
        }
        return root;
    }

    private final View f(ViewGroup root, View focused, int direction) {
        View viewF = D0.f(focused, root, direction);
        boolean z10 = true;
        View viewF2 = viewF;
        while (viewF != null) {
            if (!viewF.isFocusable() || viewF.getVisibility() != 0 || (viewF.isInTouchMode() && !viewF.isFocusableInTouchMode())) {
                viewF = D0.f(viewF, root, direction);
                boolean z11 = !z10;
                if (!z10) {
                    if (viewF2 != null) {
                        viewF2 = D0.f(viewF2, root, direction);
                    } else {
                        viewF2 = null;
                    }
                    if (viewF2 == viewF) {
                        break;
                    }
                }
                z10 = z11;
            } else {
                return viewF;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View k(C0 c02, View view, View view2) {
        if (c02.j(view2.getNextFocusForwardId())) {
            return D0.f(view2, view, 2);
        }
        return null;
    }

    public final View d(ViewGroup root, View focused, int direction) {
        ViewGroup viewGroupG = g(root, focused);
        View viewF = f(viewGroupG, focused, direction);
        if (viewF != null) {
            return viewF;
        }
        Z.T<View> t10 = this.tmpList;
        try {
            t10.t();
            D0.d(viewGroupG, t10, direction);
            if (!t10.g()) {
                viewF = c(viewGroupG, focused, direction, t10);
            }
            return viewF;
        } finally {
            t10.t();
        }
    }
}
