package androidx.compose.ui.platform;

import Z.AbstractC5519q;
import android.content.res.Resources;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import r1.AccessibilityAction;
import r1.C16706n;
import r1.ProgressBarRangeInfo;
import t1.EnumC17055a;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u000f\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001aY\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00132\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0019j\b\u0012\u0004\u0012\u00020\u0013`\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00150\u001c2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001aS\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0011\u001a\u00020\u00022\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0019j\b\u0012\u0004\u0012\u00020\u0013`\u001a2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00150\u001cH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)\u001a!\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010,\u001a!\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010,\u001a\u0017\u0010.\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b.\u0010/\u001aS\u00103\u001a\u00020\u00022:\u00102\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0015000\u0019j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001500`\u001a2\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b3\u00104\u001a\u0013\u00105\u001a\u00020\u0002*\u00020\u0013H\u0002¢\u0006\u0004\b5\u0010/\u001a\u001b\u00108\u001a\u00020\u0002*\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109\u001a\u0013\u0010:\u001a\u00020\u0002*\u00020\u0013H\u0002¢\u0006\u0004\b:\u0010/\u001a!\u0010>\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030;2\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?\"*\u0010E\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130Aj\b\u0012\u0004\u0012\u00020\u0013`B0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D\"&\u0010J\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I\"\u0018\u0010L\u001a\u00020\u0002*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010/¨\u0006M"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "selector", "q", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/LayoutNode;", "LZ/q;", "Landroidx/compose/ui/platform/A1;", "currentSemanticsNodes", "LZ/I;", "outputBeforeMap", "outputAfterMap", "Landroid/content/res/Resources;", "resources", "", "z", "(LZ/q;LZ/I;LZ/I;Landroid/content/res/Resources;)V", "layoutIsRtl", "", "Lr1/n;", "listToSort", "", "C", "(ZLjava/util/List;LZ/q;Landroid/content/res/Resources;)Ljava/util/List;", "currNode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "geometryList", "LZ/K;", "containerMapToChildren", "r", "(Lr1/n;Ljava/util/ArrayList;LZ/K;LZ/q;Landroid/content/res/Resources;)V", "parentListToSort", "containerChildrenMapping", "A", "(ZLjava/util/ArrayList;Landroid/content/res/Resources;LZ/K;)Ljava/util/List;", "node", "w", "(Lr1/n;Landroid/content/res/Resources;)Z", "Landroidx/compose/ui/text/AnnotatedString;", "u", "(Lr1/n;)Landroidx/compose/ui/text/AnnotatedString;", "", "t", "(Lr1/n;Landroid/content/res/Resources;)Ljava/lang/String;", "n", "s", "(Lr1/n;)Z", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "rowGroupings", "x", "(Ljava/util/ArrayList;Lr1/n;)Z", "o", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "oldConfig", "y", "(Lr1/n;Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "p", "Lr1/a;", "", "other", "m", "(Lr1/a;Ljava/lang/Object;)Z", "", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "a", "[Ljava/util/Comparator;", "semanticComparators", "Lkotlin/Function2;", "", "b", "Lkotlin/jvm/functions/Function2;", "UnmergedConfigComparator", "v", "isRtl", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5903x {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<C16706n>[] f52270a;

    /* renamed from: b, reason: collision with root package name */
    private static final Function2<C16706n, C16706n, Integer> f52271b;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.x$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17055a.values().length];
            try {
                iArr[EnumC17055a.f161355a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17055a.f161356b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17055a.f161357c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.x$d */
    static final class d extends Lambda implements Function0<Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f52276f = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.platform.x$e */
    public static final class e<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f52277a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f52278b;

        public e(Comparator comparator, Comparator comparator2) {
            this.f52277a = comparator;
            this.f52278b = comparator2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f52277a.compare(t10, t11);
            return iCompare != 0 ? iCompare : this.f52278b.compare(((C16706n) t10).getLayoutNode(), ((C16706n) t11).getLayoutNode());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.platform.x$f */
    public static final class f<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f52279a;

        public f(Comparator comparator) {
            this.f52279a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f52279a.compare(t10, t11);
            return iCompare != 0 ? iCompare : ComparisonsKt.d(Integer.valueOf(((C16706n) t10).getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()), Integer.valueOf(((C16706n) t11).getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()));
        }
    }

    static {
        Comparator<C16706n>[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            comparatorArr[i10] = new f(new e(i10 == 0 ? C5905x1.f52282a : T0.f51938a, LayoutNode.INSTANCE.b()));
            i10++;
        }
        f52270a = comparatorArr;
        f52271b = a.f52272f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!Intrinsics.e(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.a() != null || accessibilityAction2.a() == null) {
            return accessibilityAction.a() == null || accessibilityAction2.a() != null;
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0004"}, d2 = {"Lr1/n;", "a", "b", "", "(Lr1/n;Lr1/n;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.x$a */
    static final class a extends Lambda implements Function2<C16706n, C16706n, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f52272f = new a();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.platform.x$a$a, reason: collision with other inner class name */
        static final class C1069a extends Lambda implements Function0<Float> {

            /* renamed from: f, reason: collision with root package name */
            public static final C1069a f52273f = new C1069a();

            C1069a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.platform.x$a$b */
        static final class b extends Lambda implements Function0<Float> {

            /* renamed from: f, reason: collision with root package name */
            public static final b f52274f = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C16706n c16706n, C16706n c16706n2) {
            SemanticsConfiguration unmergedConfig = c16706n.getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            return Integer.valueOf(Float.compare(((Number) unmergedConfig.o(semanticsProperties.D(), C1069a.f52273f)).floatValue(), ((Number) c16706n2.getUnmergedConfig().o(semanticsProperties.D(), b.f52274f)).floatValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.x$c */
    static final class c extends Lambda implements Function1<LayoutNode, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f52275f = new c();

        c() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r3) {
            /*
                r2 = this;
                androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getSemanticsConfiguration()
                if (r3 == 0) goto L1a
                boolean r0 = r3.getIsMergingSemanticsOfDescendants()
                r1 = 1
                if (r0 != r1) goto L1a
                androidx.compose.ui.semantics.SemanticsProperties r0 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
                androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.getEditableText()
                boolean r3 = r3.contains(r0)
                if (r3 == 0) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5903x.c.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
        }
    }

    private static final List<C16706n> A(boolean z10, ArrayList<C16706n> arrayList, Resources resources, Z.K<List<C16706n>> k10) {
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iO = CollectionsKt.o(arrayList);
        int size = 0;
        if (iO >= 0) {
            int i10 = 0;
            while (true) {
                C16706n c16706n = arrayList.get(i10);
                if (i10 == 0 || !x(arrayList2, c16706n)) {
                    arrayList2.add(new Pair(c16706n.j(), CollectionsKt.s(c16706n)));
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        CollectionsKt.B(arrayList2, K1.f51836a);
        ArrayList arrayList3 = new ArrayList();
        Comparator<C16706n> comparator = f52270a[!z10 ? 1 : 0];
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Pair pair = (Pair) arrayList2.get(i11);
            CollectionsKt.B((List) pair.d(), comparator);
            arrayList3.addAll((Collection) pair.d());
        }
        final Function2<C16706n, C16706n, Integer> function2 = f52271b;
        CollectionsKt.B(arrayList3, new Comparator() { // from class: androidx.compose.ui.platform.w
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C5903x.B(function2, obj, obj2);
            }
        });
        while (size <= CollectionsKt.o(arrayList3)) {
            List<C16706n> listB = k10.b(((C16706n) arrayList3.get(size)).getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
            if (listB != null) {
                if (w((C16706n) arrayList3.get(size), resources)) {
                    size++;
                } else {
                    arrayList3.remove(size);
                }
                arrayList3.addAll(size, listB);
                size += listB.size();
            } else {
                size++;
            }
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int B(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private static final List<C16706n> C(boolean z10, List<C16706n> list, AbstractC5519q<A1> abstractC5519q, Resources resources) {
        Z.K kC = Z.r.c();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r(list.get(i10), arrayList, kC, abstractC5519q, resources);
        }
        return A(z10, arrayList, resources, kC);
    }

    private static final String n(C16706n c16706n, Resources resources) {
        SemanticsConfiguration semanticsConfigurationN = c16706n.a().n();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Collection collection = (Collection) SemanticsConfigurationKt.getOrNull(semanticsConfigurationN, semanticsProperties.getContentDescription());
        if (collection == null || collection.isEmpty()) {
            Collection collection2 = (Collection) SemanticsConfigurationKt.getOrNull(semanticsConfigurationN, semanticsProperties.getText());
            if (collection2 == null || collection2.isEmpty()) {
                CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(semanticsConfigurationN, semanticsProperties.getEditableText());
                if (charSequence != null && charSequence.length() != 0) {
                    return null;
                }
                return resources.getString(P0.l.f24568n);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(C16706n c16706n) {
        return !c16706n.n().contains(SemanticsProperties.INSTANCE.getDisabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(C16706n c16706n) {
        boolean zE;
        SemanticsConfiguration unmergedConfig = c16706n.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig.contains(semanticsProperties.getEditableText()) && !Intrinsics.e(SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), semanticsProperties.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNodeQ = q(c16706n.getLayoutNode(), c.f52275f);
        if (layoutNodeQ != null) {
            SemanticsConfiguration semanticsConfiguration = layoutNodeQ.getSemanticsConfiguration();
            if (semanticsConfiguration != null) {
                zE = Intrinsics.e(SemanticsConfigurationKt.getOrNull(semanticsConfiguration, semanticsProperties.getFocused()), Boolean.TRUE);
            } else {
                zE = false;
            }
            if (!zE) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode q(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (function1.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    private static final void r(C16706n c16706n, ArrayList<C16706n> arrayList, Z.K<List<C16706n>> k10, AbstractC5519q<A1> abstractC5519q, Resources resources) {
        boolean zV = v(c16706n);
        boolean zBooleanValue = ((Boolean) c16706n.getUnmergedConfig().o(SemanticsProperties.INSTANCE.r(), d.f52276f)).booleanValue();
        if ((zBooleanValue || w(c16706n, resources)) && abstractC5519q.a(c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String())) {
            arrayList.add(c16706n);
        }
        if (zBooleanValue) {
            k10.r(c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), C(zV, c16706n.k(), abstractC5519q, resources));
            return;
        }
        List<C16706n> listK = c16706n.k();
        int size = listK.size();
        for (int i10 = 0; i10 < size; i10++) {
            r(listK.get(i10), arrayList, k10, abstractC5519q, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(C16706n c16706n) {
        boolean z10;
        SemanticsConfiguration unmergedConfig = c16706n.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        EnumC17055a enumC17055a = (EnumC17055a) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.C());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), semanticsProperties.getRole());
        boolean zM = false;
        if (enumC17055a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((Boolean) SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), semanticsProperties.y())) != null) {
            int iH = Role.INSTANCE.h();
            if (role != null) {
                zM = Role.m(role.getValue(), iH);
            }
            if (!zM) {
                return true;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(C16706n c16706n, Resources resources) throws Resources.NotFoundException {
        boolean z10;
        float current;
        boolean z11;
        boolean zM;
        boolean zM2;
        boolean zM3;
        SemanticsConfiguration unmergedConfig = c16706n.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.z());
        EnumC17055a enumC17055a = (EnumC17055a) SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), semanticsProperties.C());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), semanticsProperties.getRole());
        int iO = 0;
        if (enumC17055a != null) {
            int i10 = b.$EnumSwitchMapping$0[enumC17055a.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && orNull == null) {
                        orNull = resources.getString(P0.l.f24562h);
                    }
                } else {
                    int iG = Role.INSTANCE.g();
                    if (role == null) {
                        zM3 = false;
                    } else {
                        zM3 = Role.m(role.getValue(), iG);
                    }
                    if (zM3 && orNull == null) {
                        orNull = resources.getString(P0.l.f24569o);
                    }
                }
            } else {
                int iG2 = Role.INSTANCE.g();
                if (role == null) {
                    zM2 = false;
                } else {
                    zM2 = Role.m(role.getValue(), iG2);
                }
                if (zM2 && orNull == null) {
                    orNull = resources.getString(P0.l.f24570p);
                }
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), semanticsProperties.y());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            int iH = Role.INSTANCE.h();
            if (role == null) {
                zM = false;
            } else {
                zM = Role.m(role.getValue(), iH);
            }
            if (!zM && orNull == null) {
                if (zBooleanValue) {
                    orNull = resources.getString(P0.l.f24567m);
                } else {
                    orNull = resources.getString(P0.l.f24564j);
                }
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), semanticsProperties.w());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.a()) {
                if (orNull == null) {
                    ClosedFloatingPointRange<Float> closedFloatingPointRangeC = progressBarRangeInfo.c();
                    if (closedFloatingPointRangeC.getEndInclusive().floatValue() - closedFloatingPointRangeC.getStart().floatValue() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        current = 0.0f;
                    } else {
                        current = (progressBarRangeInfo.getCurrent() - closedFloatingPointRangeC.getStart().floatValue()) / (closedFloatingPointRangeC.getEndInclusive().floatValue() - closedFloatingPointRangeC.getStart().floatValue());
                    }
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (current == 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (current == 1.0f) {
                            iO = 1;
                        }
                        if (iO != 0) {
                            iO = 100;
                        } else {
                            iO = RangesKt.o(Math.round(current * 100), 1, 99);
                        }
                    }
                    orNull = resources.getString(P0.l.f24573s, Integer.valueOf(iO));
                }
            } else if (orNull == null) {
                orNull = resources.getString(P0.l.f24561g);
            }
        }
        if (c16706n.getUnmergedConfig().contains(semanticsProperties.getEditableText())) {
            orNull = n(c16706n, resources);
        }
        return (String) orNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString u(C16706n c16706n) {
        AnnotatedString annotatedString;
        SemanticsConfiguration unmergedConfig = c16706n.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        AnnotatedString annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.getEditableText());
        List list = (List) SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), semanticsProperties.getText());
        if (list != null) {
            annotatedString = (AnnotatedString) CollectionsKt.u0(list);
        } else {
            annotatedString = null;
        }
        if (annotatedString2 == null) {
            return annotatedString;
        }
        return annotatedString2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(C16706n c16706n) {
        if (c16706n.p().getLayoutDirection() == H1.t.f12007b) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(C16706n c16706n, Resources resources) {
        String str;
        boolean z10;
        List list = (List) SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
        if (list != null) {
            str = (String) CollectionsKt.u0(list);
        } else {
            str = null;
        }
        if (str == null && u(c16706n) == null && t(c16706n, resources) == null && !s(c16706n)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!B1.f(c16706n) && (c16706n.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || (c16706n.A() && z10))) {
            return true;
        }
        return false;
    }

    private static final boolean x(ArrayList<Pair<Rect, List<C16706n>>> arrayList, C16706n c16706n) {
        boolean z10;
        boolean z11;
        float top = c16706n.j().getTop();
        float fI = c16706n.j().i();
        if (top >= fI) {
            z10 = true;
        } else {
            z10 = false;
        }
        int iO = CollectionsKt.o(arrayList);
        if (iO >= 0) {
            int i10 = 0;
            while (true) {
                Rect rectC = arrayList.get(i10).c();
                if (rectC.getTop() >= rectC.i()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z10 && !z11 && Math.max(top, rectC.getTop()) < Math.min(fI, rectC.i())) {
                    arrayList.set(i10, new Pair<>(rectC.o(0.0f, top, Float.POSITIVE_INFINITY, fI), arrayList.get(i10).d()));
                    arrayList.get(i10).d().add(c16706n);
                    return true;
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(C16706n c16706n, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!c16706n.n().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(AbstractC5519q<A1> abstractC5519q, Z.I i10, Z.I i11, Resources resources) {
        C16706n semanticsNode;
        i10.i();
        i11.i();
        A1 a1B = abstractC5519q.b(-1);
        if (a1B != null) {
            semanticsNode = a1B.getSemanticsNode();
        } else {
            semanticsNode = null;
        }
        Intrinsics.g(semanticsNode);
        List<C16706n> listC = C(v(semanticsNode), CollectionsKt.e(semanticsNode), abstractC5519q, resources);
        int iO = CollectionsKt.o(listC);
        int i12 = 1;
        if (1 > iO) {
            return;
        }
        while (true) {
            int i13 = listC.get(i12 - 1).getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            int i14 = listC.get(i12).getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            i10.q(i13, i14);
            i11.q(i14, i13);
            if (i12 != iO) {
                i12++;
            } else {
                return;
            }
        }
    }
}
