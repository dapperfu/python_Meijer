package q2;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import com.google.maps.android.BuildConfig;
import com.medallia.digital.mobilesdk.l3;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import q2.InterfaceC16593B;

/* loaded from: classes.dex */
public class y {

    /* renamed from: d, reason: collision with root package name */
    private static int f157811d;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f157812a;

    /* renamed from: b, reason: collision with root package name */
    public int f157813b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f157814c = -1;

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f157815A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f157816B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f157817C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f157818D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f157819E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f157820F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f157821G;

        /* renamed from: H, reason: collision with root package name */
        public static final a f157822H;

        /* renamed from: I, reason: collision with root package name */
        public static final a f157823I;

        /* renamed from: J, reason: collision with root package name */
        public static final a f157824J;

        /* renamed from: K, reason: collision with root package name */
        public static final a f157825K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f157826L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f157827M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f157828N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f157829O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f157830P;

        /* renamed from: Q, reason: collision with root package name */
        public static final a f157831Q;

        /* renamed from: R, reason: collision with root package name */
        public static final a f157832R;

        /* renamed from: S, reason: collision with root package name */
        public static final a f157833S;

        /* renamed from: T, reason: collision with root package name */
        public static final a f157834T;

        /* renamed from: U, reason: collision with root package name */
        public static final a f157835U;

        /* renamed from: V, reason: collision with root package name */
        public static final a f157836V;

        /* renamed from: e, reason: collision with root package name */
        public static final a f157837e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f157838f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f157839g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f157840h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f157841i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f157842j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f157843k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f157844l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f157845m = new a(256, (CharSequence) null, (Class<? extends InterfaceC16593B.a>) InterfaceC16593B.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f157846n = new a(512, (CharSequence) null, (Class<? extends InterfaceC16593B.a>) InterfaceC16593B.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f157847o = new a(1024, (CharSequence) null, (Class<? extends InterfaceC16593B.a>) InterfaceC16593B.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f157848p = new a(RecyclerView.m.FLAG_MOVED, (CharSequence) null, (Class<? extends InterfaceC16593B.a>) InterfaceC16593B.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f157849q = new a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f157850r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f157851s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f157852t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f157853u = new a(65536, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f157854v = new a(131072, (CharSequence) null, (Class<? extends InterfaceC16593B.a>) InterfaceC16593B.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f157855w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f157856x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f157857y = new a(1048576, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f157858z = new a(2097152, (CharSequence) null, (Class<? extends InterfaceC16593B.a>) InterfaceC16593B.h.class);

        /* renamed from: a, reason: collision with root package name */
        final Object f157859a;

        /* renamed from: b, reason: collision with root package name */
        private final int f157860b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<? extends InterfaceC16593B.a> f157861c;

        /* renamed from: d, reason: collision with root package name */
        protected final InterfaceC16593B f157862d;

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f157859a;
            return obj2 == null ? aVar.f157859a == null : obj2.equals(aVar.f157859a);
        }

        static {
            int i10 = Build.VERSION.SDK_INT;
            f157815A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f157816B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC16593B.e.class);
            f157817C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f157818D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f157819E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f157820F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f157821G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f157822H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f157823I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f157824J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f157825K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f157826L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC16593B.f.class);
            f157827M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, InterfaceC16593B.d.class);
            f157828N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f157829O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f157830P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f157831Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f157832R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f157833S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f157834T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f157835U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f157836V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence, InterfaceC16593B interfaceC16593B) {
            this(null, i10, charSequence, interfaceC16593B, null);
        }

        public a a(CharSequence charSequence, InterfaceC16593B interfaceC16593B) {
            return new a(null, this.f157860b, charSequence, interfaceC16593B, this.f157861c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f157859a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f157859a).getLabel();
        }

        public boolean d(View view, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            InterfaceC16593B.a aVarNewInstance;
            if (this.f157862d == null) {
                return false;
            }
            Class<? extends InterfaceC16593B.a> cls = this.f157861c;
            InterfaceC16593B.a aVar = null;
            if (cls != null) {
                try {
                    aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    aVarNewInstance.a(bundle);
                    aVar = aVarNewInstance;
                } catch (Exception e11) {
                    e = e11;
                    aVar = aVarNewInstance;
                    Class<? extends InterfaceC16593B.a> cls2 = this.f157861c;
                    FS.log_e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? BuildConfig.TRAVIS : cls2.getName()), e);
                    return this.f157862d.a(view, aVar);
                }
            }
            return this.f157862d.a(view, aVar);
        }

        public int hashCode() {
            Object obj = this.f157859a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strJ = y.j(this.f157860b);
            if (strJ.equals("ACTION_UNKNOWN") && c() != null) {
                strJ = c().toString();
            }
            sb2.append(strJ);
            return sb2.toString();
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends InterfaceC16593B.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, InterfaceC16593B interfaceC16593B, Class<? extends InterfaceC16593B.a> cls) {
            this.f157860b = i10;
            this.f157862d = interfaceC16593B;
            if (obj == null) {
                this.f157859a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f157859a = obj;
            }
            this.f157861c = cls;
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        final Object f157863a;

        public static e a(int i10, int i11, boolean z10) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static e b(int i10, int i11, boolean z10, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }

        e(Object obj) {
            this.f157863a = obj;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        final Object f157864a;

        public static f a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }

        f(Object obj) {
            this.f157864a = obj;
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        final Object f157865a;

        public static g a(int i10, float f10, float f11, float f12) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        g(Object obj) {
            this.f157865a = obj;
        }
    }

    @Deprecated
    public y(Object obj) {
        this.f157812a = (AccessibilityNodeInfo) obj;
    }

    static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case l3.f93325e /* 32 */:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecyclerView.m.FLAG_MOVED /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public void L0(View view) {
        this.f157813b = -1;
        this.f157812a.setParent(view);
    }

    public void U0(View view) {
        this.f157814c = -1;
        this.f157812a.setSource(view);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f157812a;
        if (accessibilityNodeInfo == null) {
            if (yVar.f157812a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(yVar.f157812a)) {
            return false;
        }
        return this.f157814c == yVar.f157814c && this.f157813b == yVar.f157813b;
    }

    @Deprecated
    public void f0() {
    }

    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> A(View view) {
        return (SparseArray) view.getTag(Y1.e.f42792I);
    }

    private boolean G() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int H(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f157811d;
        f157811d = i11 + 1;
        return i11;
    }

    public static y d0(y yVar) {
        return g1(AccessibilityNodeInfo.obtain(yVar.f157812a));
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void g() {
        this.f157812a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f157812a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f157812a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f157812a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public static y g1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new y(accessibilityNodeInfo);
    }

    private List<Integer> h(String str) {
        ArrayList<Integer> integerArrayList = this.f157812a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f157812a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void A0(boolean z10) {
        this.f157812a.setFocused(z10);
    }

    public CharSequence B() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f157812a) : this.f157812a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void B0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f157812a.setHeading(z10);
        } else {
            k0(2, z10);
        }
    }

    public void C0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f157812a.setHintText(charSequence);
        } else {
            this.f157812a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence D() {
        return Build.VERSION.SDK_INT >= 28 ? this.f157812a.getTooltipText() : this.f157812a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void D0(boolean z10) {
        this.f157812a.setImportantForAccessibility(z10);
    }

    public String E() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f157812a) : this.f157812a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void E0(View view) {
        this.f157812a.setLabelFor(view);
    }

    public String F() {
        return this.f157812a.getViewIdResourceName();
    }

    public void F0(int i10) {
        this.f157812a.setLiveRegion(i10);
    }

    public void G0(boolean z10) {
        this.f157812a.setLongClickable(z10);
    }

    public void H0(int i10) {
        this.f157812a.setMaxTextLength(i10);
    }

    public boolean I() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f157812a) : l(64);
    }

    public void I0(int i10) {
        this.f157812a.setMovementGranularities(i10);
    }

    public boolean J() {
        return this.f157812a.isAccessibilityFocused();
    }

    public void J0(CharSequence charSequence) {
        this.f157812a.setPackageName(charSequence);
    }

    public boolean K() {
        return this.f157812a.isCheckable();
    }

    public void K0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f157812a.setPaneTitle(charSequence);
        } else {
            this.f157812a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public boolean L() {
        return this.f157812a.isChecked();
    }

    public boolean M() {
        return this.f157812a.isClickable();
    }

    public void M0(View view, int i10) {
        this.f157813b = i10;
        this.f157812a.setParent(view, i10);
    }

    public boolean N() {
        return this.f157812a.isContextClickable();
    }

    public void N0(boolean z10) {
        this.f157812a.setPassword(z10);
    }

    public boolean O() {
        return this.f157812a.isEnabled();
    }

    public void O0(g gVar) {
        this.f157812a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f157865a);
    }

    public boolean P() {
        return this.f157812a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void P0(CharSequence charSequence) {
        this.f157812a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean Q() {
        return this.f157812a.isFocusable();
    }

    public void Q0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f157812a.setScreenReaderFocusable(z10);
        } else {
            k0(1, z10);
        }
    }

    public boolean R() {
        return this.f157812a.isFocused();
    }

    public void R0(boolean z10) {
        this.f157812a.setScrollable(z10);
    }

    public boolean S() {
        return l(67108864);
    }

    public void S0(boolean z10) {
        this.f157812a.setSelected(z10);
    }

    public boolean T() {
        return this.f157812a.isImportantForAccessibility();
    }

    public void T0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f157812a.setShowingHintText(z10);
        } else {
            k0(4, z10);
        }
    }

    public boolean U() {
        return this.f157812a.isLongClickable();
    }

    public boolean V() {
        return this.f157812a.isPassword();
    }

    public void V0(View view, int i10) {
        this.f157814c = i10;
        this.f157812a.setSource(view, i10);
    }

    public boolean W() {
        return this.f157812a.isScrollable();
    }

    public void W0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f157812a, charSequence);
        } else {
            this.f157812a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean X() {
        return this.f157812a.isSelected();
    }

    public void X0(CharSequence charSequence) {
        this.f157812a.setText(charSequence);
    }

    public boolean Y() {
        return Build.VERSION.SDK_INT >= 26 ? this.f157812a.isShowingHintText() : l(4);
    }

    public void Y0(int i10, int i11) {
        this.f157812a.setTextSelection(i10, i11);
    }

    public boolean Z() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f157812a) : l(8388608);
    }

    public void Z0(View view) {
        this.f157812a.setTraversalAfter(view);
    }

    public void a(int i10) {
        this.f157812a.addAction(i10);
    }

    public boolean a0() {
        return this.f157812a.isVisibleToUser();
    }

    public void a1(View view, int i10) {
        this.f157812a.setTraversalAfter(view, i10);
    }

    public void b(a aVar) {
        this.f157812a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f157859a);
    }

    public void b1(View view) {
        this.f157812a.setTraversalBefore(view);
    }

    public void c(View view) {
        this.f157812a.addChild(view);
    }

    public void c1(View view, int i10) {
        this.f157812a.setTraversalBefore(view, i10);
    }

    public void d(View view, int i10) {
        this.f157812a.addChild(view, i10);
    }

    public void d1(String str) {
        this.f157812a.setViewIdResourceName(str);
    }

    public boolean e0(int i10, Bundle bundle) {
        return this.f157812a.performAction(i10, bundle);
    }

    public void e1(boolean z10) {
        this.f157812a.setVisibleToUser(z10);
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            h0(view);
            ClickableSpan[] clickableSpanArrR = r(charSequence);
            if (clickableSpanArrR == null || clickableSpanArrR.length <= 0) {
                return;
            }
            v().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", Y1.e.f42804a);
            SparseArray<WeakReference<ClickableSpan>> sparseArrayY = y(view);
            for (int i10 = 0; i10 < clickableSpanArrR.length; i10++) {
                int iH = H(clickableSpanArrR[i10], sparseArrayY);
                sparseArrayY.put(iH, new WeakReference<>(clickableSpanArrR[i10]));
                e(clickableSpanArrR[i10], (Spanned) charSequence, iH);
            }
        }
    }

    public AccessibilityNodeInfo f1() {
        return this.f157812a;
    }

    public boolean g0(a aVar) {
        return this.f157812a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f157859a);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f157812a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f157812a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void i0(boolean z10) {
        this.f157812a.setAccessibilityFocused(z10);
    }

    public void j0(List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f157812a.setAvailableExtraData(list);
        }
    }

    @Deprecated
    public int k() {
        return this.f157812a.getActions();
    }

    @Deprecated
    public void l0(Rect rect) {
        this.f157812a.setBoundsInParent(rect);
    }

    @Deprecated
    public void m(Rect rect) {
        this.f157812a.getBoundsInParent(rect);
    }

    public void m0(Rect rect) {
        this.f157812a.setBoundsInScreen(rect);
    }

    public void n(Rect rect) {
        this.f157812a.getBoundsInScreen(rect);
    }

    public void n0(boolean z10) {
        this.f157812a.setCheckable(z10);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f157812a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f157812a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o0(boolean z10) {
        this.f157812a.setChecked(z10);
    }

    public int p() {
        return this.f157812a.getChildCount();
    }

    public void p0(CharSequence charSequence) {
        this.f157812a.setClassName(charSequence);
    }

    public CharSequence q() {
        return this.f157812a.getClassName();
    }

    public void q0(boolean z10) {
        this.f157812a.setClickable(z10);
    }

    public void r0(Object obj) {
        this.f157812a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f157863a);
    }

    public CharSequence s() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f157812a) : this.f157812a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void s0(Object obj) {
        this.f157812a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f157864a);
    }

    public CharSequence t() {
        return this.f157812a.getContentDescription();
    }

    public void t0(CharSequence charSequence) {
        this.f157812a.setContentDescription(charSequence);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        o(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(z());
        sb2.append("; className: ");
        sb2.append(q());
        sb2.append("; text: ");
        sb2.append(C());
        sb2.append("; error: ");
        sb2.append(u());
        sb2.append("; maxTextLength: ");
        sb2.append(w());
        sb2.append("; stateDescription: ");
        sb2.append(B());
        sb2.append("; contentDescription: ");
        sb2.append(t());
        sb2.append("; tooltipText: ");
        sb2.append(D());
        sb2.append("; viewIdResName: ");
        sb2.append(F());
        sb2.append("; uniqueId: ");
        sb2.append(E());
        sb2.append("; checkable: ");
        sb2.append(K());
        sb2.append("; checked: ");
        sb2.append(L());
        sb2.append("; fieldRequired: ");
        sb2.append(P());
        sb2.append("; focusable: ");
        sb2.append(Q());
        sb2.append("; focused: ");
        sb2.append(R());
        sb2.append("; selected: ");
        sb2.append(X());
        sb2.append("; clickable: ");
        sb2.append(M());
        sb2.append("; longClickable: ");
        sb2.append(U());
        sb2.append("; contextClickable: ");
        sb2.append(N());
        sb2.append("; enabled: ");
        sb2.append(O());
        sb2.append("; password: ");
        sb2.append(V());
        sb2.append("; scrollable: " + W());
        sb2.append("; containerTitle: ");
        sb2.append(s());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(S());
        sb2.append("; importantForAccessibility: ");
        sb2.append(T());
        sb2.append("; visible: ");
        sb2.append(a0());
        sb2.append("; isTextSelectable: ");
        sb2.append(Z());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(I());
        sb2.append("; [");
        List<a> listI = i();
        for (int i10 = 0; i10 < listI.size(); i10++) {
            a aVar = listI.get(i10);
            String strJ = j(aVar.b());
            if (strJ.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strJ = aVar.c().toString();
            }
            sb2.append(strJ);
            if (i10 != listI.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public CharSequence u() {
        return this.f157812a.getError();
    }

    public void u0(boolean z10) {
        this.f157812a.setContentInvalid(z10);
    }

    public Bundle v() {
        return this.f157812a.getExtras();
    }

    public void v0(boolean z10) {
        this.f157812a.setDismissable(z10);
    }

    public int w() {
        return this.f157812a.getMaxTextLength();
    }

    public void w0(boolean z10) {
        this.f157812a.setEditable(z10);
    }

    public int x() {
        return this.f157812a.getMovementGranularities();
    }

    public void x0(boolean z10) {
        this.f157812a.setEnabled(z10);
    }

    public void y0(CharSequence charSequence) {
        this.f157812a.setError(charSequence);
    }

    public CharSequence z() {
        return this.f157812a.getPackageName();
    }

    public void z0(boolean z10) {
        this.f157812a.setFocusable(z10);
    }

    public static y b0() {
        return g1(AccessibilityNodeInfo.obtain());
    }

    public static y c0(View view) {
        return g1(AccessibilityNodeInfo.obtain(view));
    }

    private void h0(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayA = A(view);
        if (sparseArrayA != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayA.size(); i10++) {
                if (sparseArrayA.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayA.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void k0(int i10, boolean z10) {
        Bundle bundleV = v();
        if (bundleV != null) {
            int i11 = bundleV.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleV.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private boolean l(int i10) {
        Bundle bundleV = v();
        if (bundleV == null || (bundleV.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) != i10) {
            return false;
        }
        return true;
    }

    private SparseArray<WeakReference<ClickableSpan>> y(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayA = A(view);
        if (sparseArrayA == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(Y1.e.f42792I, sparseArray);
            return sparseArray;
        }
        return sparseArrayA;
    }

    public CharSequence C() {
        if (G()) {
            List<Integer> listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f157812a.getText(), 0, this.f157812a.getText().length()));
            for (int i10 = 0; i10 < listH.size(); i10++) {
                spannableString.setSpan(new C16594a(listH4.get(i10).intValue(), this, v().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listH.get(i10).intValue(), listH2.get(i10).intValue(), listH3.get(i10).intValue());
            }
            return spannableString;
        }
        return this.f157812a.getText();
    }

    private y(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f157812a = accessibilityNodeInfo;
    }
}
