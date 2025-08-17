package androidx.compose.ui.semantics;

import U0.f;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.AccessibilityAction;
import r1.CustomAccessibilityAction;
import r1.r;
import r1.s;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rRS\u0010\u001e\u001a>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t0\u00160\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rRH\u0010$\u001a3\u0012/\u0012-\b\u0001\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0!\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR/\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\rR/\u0010,\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\rR>\u0010/\u001a)\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b\u001a\u0010\rR;\u00101\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t000\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u001b\u0010\rR/\u00104\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\rR/\u00106\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b5\u0010\rR/\u00108\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b7\u0010\rR)\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u000b\u001a\u0004\b\n\u0010\rR/\u0010;\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b2\u0010\rR)\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b<\u0010\u000b\u001a\u0004\b9\u0010\rR2\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010\u000b\u0012\u0004\b@\u0010\u0003\u001a\u0004\b?\u0010\rR)\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u000b\u001a\u0004\b\u0013\u0010\rR)\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\u000b\u001a\u0004\b\"\u0010\rR)\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u000b\u001a\u0004\bF\u0010\rR)\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bH\u0010\u000b\u001a\u0004\b*\u0010\rR)\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u0010\u0010\rR)\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b&\u0010\rR)\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\bH\u0010\rR#\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M0\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001c\u0010\rR)\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\bD\u0010\rR)\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b>\u0010\rR)\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u000b\u001a\u0004\b<\u0010\rR)\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u000b\u001a\u0004\bB\u0010\rR5\u0010V\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u000b\u001a\u0004\b.\u0010\r¨\u0006W"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lr1/a;", "Lkotlin/Function1;", "", "Lu1/v;", "", "a", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "i", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "GetTextLayoutResult", "Lkotlin/Function0;", "b", "l", "OnClick", "c", "n", "OnLongClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "x", "y", "d", "u", "ScrollBy", "LU0/f;", "offset", "Lkotlin/coroutines/Continuation;", "e", "v", "ScrollByOffset", "", "f", "w", "ScrollToIndex", "Landroidx/compose/ui/text/AnnotatedString;", "g", "k", "OnAutofillText", "progress", "h", "SetProgress", "Lkotlin/Function3;", "SetSelection", "j", "getSetText", "SetText", "z", "SetTextSubstitution", "A", "ShowTextSubstitution", "m", "ClearTextSubstitution", "InsertTextAtCursor", "o", "OnImeAction", "p", "getPerformImeAction", "getPerformImeAction$annotations", "PerformImeAction", "q", "CopyText", "r", "CutText", "s", "PasteText", "t", "Expand", "Collapse", "Dismiss", "RequestFocus", "", "Lr1/e;", "CustomActions", "PageUp", "PageLeft", "PageDown", "B", "PageRight", "C", "GetScrollViewportLength", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SemanticsActions {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageDown;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageRight;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<List<Float>, Boolean>>> GetScrollViewportLength;

    /* renamed from: D, reason: collision with root package name */
    public static final int f52316D;
    public static final SemanticsActions INSTANCE = new SemanticsActions();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnClick;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnLongClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> ScrollBy;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Function2<f, Continuation<? super f>, Object>> ScrollByOffset;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> ScrollToIndex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> OnAutofillText;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> SetProgress;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function3<Integer, Integer, Boolean, Boolean>>> SetSelection;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> SetText;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> SetTextSubstitution;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Boolean, Boolean>>> ShowTextSubstitution;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> ClearTextSubstitution;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> InsertTextAtCursor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnImeAction;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PerformImeAction;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CopyText;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CutText;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PasteText;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Expand;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Collapse;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Dismiss;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> RequestFocus;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageUp;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageLeft;

    static {
        r rVar = r.f157801f;
        GetTextLayoutResult = s.b("GetTextLayoutResult", rVar);
        OnClick = s.b("OnClick", rVar);
        OnLongClick = s.b("OnLongClick", rVar);
        ScrollBy = s.b("ScrollBy", rVar);
        ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", null, 2, null);
        ScrollToIndex = s.b("ScrollToIndex", rVar);
        OnAutofillText = s.b("OnAutofillText", rVar);
        SetProgress = s.b("SetProgress", rVar);
        SetSelection = s.b("SetSelection", rVar);
        SetText = s.b("SetText", rVar);
        SetTextSubstitution = s.b("SetTextSubstitution", rVar);
        ShowTextSubstitution = s.b("ShowTextSubstitution", rVar);
        ClearTextSubstitution = s.b("ClearTextSubstitution", rVar);
        InsertTextAtCursor = s.b("InsertTextAtCursor", rVar);
        OnImeAction = s.b("PerformImeAction", rVar);
        PerformImeAction = s.b("PerformImeAction", rVar);
        CopyText = s.b("CopyText", rVar);
        CutText = s.b("CutText", rVar);
        PasteText = s.b("PasteText", rVar);
        Expand = s.b("Expand", rVar);
        Collapse = s.b("Collapse", rVar);
        Dismiss = s.b("Dismiss", rVar);
        RequestFocus = s.b("RequestFocus", rVar);
        CustomActions = s.a("CustomActions");
        PageUp = s.b("PageUp", rVar);
        PageLeft = s.b("PageLeft", rVar);
        PageDown = s.b("PageDown", rVar);
        PageRight = s.b("PageRight", rVar);
        GetScrollViewportLength = s.b("GetScrollViewportLength", rVar);
        f52316D = 8;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Boolean, Boolean>>> A() {
        return ShowTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> a() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> b() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> c() {
        return CopyText;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> d() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> e() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> f() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> g() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<Float>, Boolean>>> h() {
        return GetScrollViewportLength;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> i() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> j() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> k() {
        return OnAutofillText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> l() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> m() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> n() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> o() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> p() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> q() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> r() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> s() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> t() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> u() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<Function2<f, Continuation<? super f>, Object>> v() {
        return ScrollByOffset;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> w() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> x() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function3<Integer, Integer, Boolean, Boolean>>> y() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> z() {
        return SetTextSubstitution;
    }

    private SemanticsActions() {
    }
}
