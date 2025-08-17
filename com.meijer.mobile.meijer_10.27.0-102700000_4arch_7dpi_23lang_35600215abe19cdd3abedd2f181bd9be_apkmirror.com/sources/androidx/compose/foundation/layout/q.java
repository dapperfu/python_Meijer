package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Deprecated
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0016B\u007f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012+\b\u0002\u0010\u000e\u001a%\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u0007\u0012+\b\u0002\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR7\u0010\u000e\u001a%\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR7\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\u0082\u0001\u0001 ¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/q;", "", "Landroidx/compose/foundation/layout/q$a;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/r;", "Lkotlin/ParameterName;", "name", "state", "Lkotlin/Function0;", "", "seeMoreGetter", "collapseGetter", "<init>", "(Landroidx/compose/foundation/layout/q$a;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "b", "()Landroidx/compose/foundation/layout/r;", "", "list", "a", "(Landroidx/compose/foundation/layout/r;Ljava/util/List;)V", "Landroidx/compose/foundation/layout/q$a;", "getType$foundation_layout_release", "()Landroidx/compose/foundation/layout/q$a;", "I", "c", "d", "Lkotlin/jvm/functions/Function1;", "e", "Landroidx/compose/foundation/layout/u;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minLinesToShowCollapse;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minCrossAxisSizeToShowCollapse;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> seeMoreGetter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> collapseGetter;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/layout/q$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f48678a = new a("Visible", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f48679b = new a("Clip", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f48680c = new a("ExpandIndicator", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f48681d = new a("ExpandOrCollapseIndicator", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f48682e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f48683f;

        private static final /* synthetic */ a[] a() {
            return new a[]{f48678a, f48679b, f48680c, f48681d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f48682e.clone();
        }

        static {
            a[] aVarArrA = a();
            f48682e = aVarArrA;
            f48683f = EnumEntriesKt.a(aVarArrA);
        }

        private a(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f48680c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f48681d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ q(a aVar, int i10, int i11, Function1 function1, Function1 function12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i10, i11, function1, function12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q(a aVar, int i10, int i11, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super Composer, ? super Integer, Unit>> function1, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super Composer, ? super Integer, Unit>> function12) {
        this.type = aVar;
        this.minLinesToShowCollapse = i10;
        this.minCrossAxisSizeToShowCollapse = i11;
        this.seeMoreGetter = function1;
        this.collapseGetter = function12;
    }

    public final void a(FlowLayoutOverflowState state, List<Function2<Composer, Integer, Unit>> list) {
        Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> function1 = this.seeMoreGetter;
        Function2<Composer, Integer, Unit> function2Invoke = function1 != null ? function1.invoke(state) : null;
        Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> function12 = this.collapseGetter;
        Function2<Composer, Integer, Unit> function2Invoke2 = function12 != null ? function12.invoke(state) : null;
        int i10 = b.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i10 == 1) {
            if (function2Invoke != null) {
                list.add(function2Invoke);
            }
        } else {
            if (i10 != 2) {
                return;
            }
            if (function2Invoke != null) {
                list.add(function2Invoke);
            }
            if (function2Invoke2 != null) {
                list.add(function2Invoke2);
            }
        }
    }

    public final FlowLayoutOverflowState b() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }
}
