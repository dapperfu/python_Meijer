package androidx.compose.ui.semantics;

import Q0.L;
import Q0.N;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16694b;
import r1.C16695c;
import r1.C16699g;
import r1.ProgressBarRangeInfo;
import r1.ScrollAxisRange;
import r1.s;
import t1.EnumC17055a;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\nR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\nR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\f\u0010\nR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001b\u0010\nR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\b\u001a\u0004\b#\u0010\nR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b'\u0010\nR\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b+\u0010\nR&\u00100\u001a\b\u0012\u0004\u0012\u00020)0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\b\u0012\u0004\b/\u0010\u0003\u001a\u0004\b.\u0010\nR\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020)0\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\b\u001a\u0004\b1\u0010\nR&\u00105\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\b\u0012\u0004\b4\u0010\u0003\u001a\u0004\b-\u0010\nR\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\b\u001a\u0004\b\u001e\u0010\nR\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002080\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020;0\u00048\u0006¢\u0006\f\n\u0004\b<\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020>0\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\b\u001a\u0004\b?\u0010\nR\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020A0\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\b\u001a\u0004\b \u0010\nR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020A0\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\bD\u0010\nR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\b\u001a\u0004\b9\u0010\nR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b3\u0010\nR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\bJ\u0010\nR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\bL\u0010\nR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\b\u001a\u0004\bB\u0010\nR#\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\bQ\u0010\nR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020P0\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\b\u001a\u0004\bT\u0010\nR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020)0\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\b\u001a\u0004\b<\u0010\nR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020P0\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\b\u001a\u0004\b*\u0010\nR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020P0\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\b\u001a\u0004\bY\u0010\nR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bS\u0010\nR\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020]0\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\b\u001a\u0004\b\"\u0010\nR\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020)0\u00048\u0006¢\u0006\f\n\u0004\b`\u0010\b\u001a\u0004\bN\u0010\nR\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020b0\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\b\u001a\u0004\bW\u0010\nR\u001d\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006¢\u0006\f\n\u0004\be\u0010\b\u001a\u0004\bf\u0010\nR\u001d\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bh\u0010\b\u001a\u0004\b\u0017\u0010\nR)\u0010m\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020k0j0\u00048\u0006¢\u0006\f\n\u0004\bl\u0010\b\u001a\u0004\b&\u0010\nR\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020)0\u00048\u0006¢\u0006\f\n\u0004\bn\u0010\b\u001a\u0004\b6\u0010\nR\u001d\u0010q\u001a\b\u0012\u0004\u0012\u00020k0\u00048\u0006¢\u0006\f\n\u0004\bp\u0010\b\u001a\u0004\bF\u0010\n¨\u0006r"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "a", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getContentDescription", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "ContentDescription", "b", "z", "StateDescription", "Lr1/h;", "c", "w", "ProgressBarRangeInfo", "d", "v", "PaneTitle", "", "e", "x", "SelectableGroup", "Lr1/b;", "f", "CollectionInfo", "Lr1/c;", "g", "CollectionItemInfo", "h", "Heading", "i", "getDisabled", "Disabled", "Lr1/g;", "j", "t", "LiveRegion", "", "k", "getFocused", "Focused", "l", "m", "getIsContainer$annotations", "IsContainer", "r", "IsTraversalGroup", "n", "getInvisibleToUser$annotations", "InvisibleToUser", "o", "HideFromAccessibility", "LQ0/N;", "p", "ContentType", "LQ0/L;", "q", "ContentDataType", "", "D", "TraversalIndex", "Lr1/i;", "s", "HorizontalScrollAxisRange", "E", "VerticalScrollAxisRange", "u", "IsPopup", "IsDialog", "Landroidx/compose/ui/semantics/Role;", "getRole", "Role", "getTestTag", "TestTag", "y", "LinkTestMarker", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "Text", "A", "B", "TextSubstitution", "IsShowingTextSubstitution", "C", "InputText", "getEditableText", "EditableText", "Landroidx/compose/ui/text/y;", "TextSelectionRange", "Landroidx/compose/ui/text/input/a;", "F", "ImeAction", "G", "Selected", "Lt1/a;", "H", "ToggleableState", "I", "getPassword", "Password", "J", "Error", "Lkotlin/Function1;", "", "K", "IndexForKey", "L", "IsEditable", "M", "MaxTextLength", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsProperties {
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<List<String>> ContentDescription = s.b("ContentDescription", b.f52389f);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<String> StateDescription = s.a("StateDescription");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = s.a("ProgressBarRangeInfo");

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<String> PaneTitle = s.b("PaneTitle", i.f52396f);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> SelectableGroup = s.a("SelectableGroup");

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<C16694b> CollectionInfo = s.a("CollectionInfo");

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<C16695c> CollectionItemInfo = s.a("CollectionItemInfo");

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> Heading = s.a("Heading");

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> Disabled = s.a("Disabled");

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<C16699g> LiveRegion = s.a("LiveRegion");

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> Focused = s.a("Focused");

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> IsContainer = s.a("IsContainer");

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = new SemanticsPropertyKey<>("IsTraversalGroup", null, 2, null);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", e.f52392f);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> HideFromAccessibility = new SemanticsPropertyKey<>("HideFromAccessibility", d.f52391f);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<N> ContentType = new SemanticsPropertyKey<>("ContentType", c.f52390f);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<L> ContentDataType = new SemanticsPropertyKey<>("ContentDataType", a.f52388f);

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Float> TraversalIndex = new SemanticsPropertyKey<>("TraversalIndex", m.f52400f);

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = s.a("HorizontalScrollAxisRange");

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = s.a("VerticalScrollAxisRange");

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> IsPopup = s.b("IsPopup", g.f52394f);

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> IsDialog = s.b("IsDialog", f.f52393f);

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Role> Role = s.b("Role", j.f52397f);

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, k.f52398f);

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> LinkTestMarker = new SemanticsPropertyKey<>("LinkTestMarker", false, h.f52395f);

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = s.b("Text", l.f52399f);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", null, 2, null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", null, 2, null);

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AnnotatedString> InputText = s.a("InputText");

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = s.a("EditableText");

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<y> TextSelectionRange = s.a("TextSelectionRange");

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<androidx.compose.ui.text.input.a> ImeAction = s.a("ImeAction");

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> Selected = s.a("Selected");

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<EnumC17055a> ToggleableState = s.a("ToggleableState");

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> Password = s.a("Password");

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<String> Error = s.a("Error");

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Function1<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", null, 2, null);

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> IsEditable = new SemanticsPropertyKey<>("IsEditable", null, 2, null);

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Integer> MaxTextLength = new SemanticsPropertyKey<>("MaxTextLength", null, 2, null);

    /* renamed from: N, reason: collision with root package name */
    public static final int f52361N = 8;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ0/L;", "parentValue", "<anonymous parameter 1>", "a", "(LQ0/L;LQ0/L;)LQ0/L;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function2<L, L, L> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f52388f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L invoke(L l10, L l11) {
            return l10;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "parentValue", "childValue", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function2<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f52389f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(List<String> list, List<String> list2) {
            List<String> listM1;
            if (list == null || (listM1 = CollectionsKt.m1(list)) == null) {
                return list2;
            }
            listM1.addAll(list2);
            return listM1;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ0/N;", "parentValue", "<anonymous parameter 1>", "a", "(LQ0/N;LQ0/N;)LQ0/N;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function2<N, N, N> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f52390f = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N invoke(N n10, N n11) {
            return n10;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function2<Unit, Unit, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f52391f = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function2<Unit, Unit, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f52392f = new e();

        e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function2<Unit, Unit, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f52393f = new f();

        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function2<Unit, Unit, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f52394f = new g();

        g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {1, 9, 0})
    static final class h extends Lambda implements Function2<Unit, Unit, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f52395f = new h();

        h() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class i extends Lambda implements Function2<String, String, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final i f52396f = new i();

        i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/semantics/Role;", "parentValue", "<anonymous parameter 1>", "a", "(Landroidx/compose/ui/semantics/Role;I)Landroidx/compose/ui/semantics/Role;"}, k = 3, mv = {1, 9, 0})
    static final class j extends Lambda implements Function2<Role, Role, Role> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f52397f = new j();

        j() {
            super(2);
        }

        public final Role a(Role role, int i10) {
            return role;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Role invoke(Role role, Role role2) {
            return a(role, role2.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class k extends Lambda implements Function2<String, String, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f52398f = new k();

        k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/AnnotatedString;", "parentValue", "childValue", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class l extends Lambda implements Function2<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>> {

        /* renamed from: f, reason: collision with root package name */
        public static final l f52399f = new l();

        l() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<AnnotatedString> invoke(List<AnnotatedString> list, List<AnnotatedString> list2) {
            List<AnnotatedString> listM1;
            if (list == null || (listM1 = CollectionsKt.m1(list)) == null) {
                return list2;
            }
            listM1.addAll(list2);
            return listM1;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/Float;F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class m extends Lambda implements Function2<Float, Float, Float> {

        /* renamed from: f, reason: collision with root package name */
        public static final m f52400f = new m();

        m() {
            super(2);
        }

        public final Float a(Float f10, float f11) {
            return f10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
            return a(f10, f11.floatValue());
        }
    }

    public final SemanticsPropertyKey<y> A() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey<AnnotatedString> B() {
        return TextSubstitution;
    }

    public final SemanticsPropertyKey<EnumC17055a> C() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey<Float> D() {
        return TraversalIndex;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> E() {
        return VerticalScrollAxisRange;
    }

    public final SemanticsPropertyKey<C16694b> a() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey<C16695c> b() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey<L> c() {
        return ContentDataType;
    }

    public final SemanticsPropertyKey<N> d() {
        return ContentType;
    }

    public final SemanticsPropertyKey<String> e() {
        return Error;
    }

    public final SemanticsPropertyKey<Unit> f() {
        return Heading;
    }

    public final SemanticsPropertyKey<Unit> g() {
        return HideFromAccessibility;
    }

    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey<Unit> getDisabled() {
        return Disabled;
    }

    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    public final SemanticsPropertyKey<Unit> getPassword() {
        return Password;
    }

    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> h() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey<androidx.compose.ui.text.input.a> i() {
        return ImeAction;
    }

    public final SemanticsPropertyKey<Function1<Object, Integer>> j() {
        return IndexForKey;
    }

    public final SemanticsPropertyKey<AnnotatedString> k() {
        return InputText;
    }

    public final SemanticsPropertyKey<Unit> l() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey<Boolean> m() {
        return IsContainer;
    }

    public final SemanticsPropertyKey<Unit> n() {
        return IsDialog;
    }

    public final SemanticsPropertyKey<Boolean> o() {
        return IsEditable;
    }

    public final SemanticsPropertyKey<Unit> p() {
        return IsPopup;
    }

    public final SemanticsPropertyKey<Boolean> q() {
        return IsShowingTextSubstitution;
    }

    public final SemanticsPropertyKey<Boolean> r() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey<Unit> s() {
        return LinkTestMarker;
    }

    public final SemanticsPropertyKey<C16699g> t() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey<Integer> u() {
        return MaxTextLength;
    }

    public final SemanticsPropertyKey<String> v() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey<ProgressBarRangeInfo> w() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey<Unit> x() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey<Boolean> y() {
        return Selected;
    }

    public final SemanticsPropertyKey<String> z() {
        return StateDescription;
    }

    private SemanticsProperties() {
    }
}
