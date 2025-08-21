package kotlin;

import Z.AbstractC5626y;
import Z.C5627z;
import Z.O;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.layout.LayoutCoordinates;
import i0.C14592e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 o2\u00020\u0001:\u0001\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J2\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010#\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0006J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0005R\"\u0010,\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101R\u001a\u00107\u001a\u000603j\u0002`48\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R0\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=RB\u0010E\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR6\u0010L\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010F8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KRN\u0010S\u001a.\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c\u0018\u00010M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR*\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR0\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u00109\u001a\u0004\b\\\u0010;\"\u0004\b]\u0010=R0\u0010b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u00109\u001a\u0004\b`\u0010;\"\u0004\ba\u0010=R7\u0010k\u001a\b\u0012\u0004\u0012\u00020d0c2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020d0c8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\b5\u0010h\"\u0004\bi\u0010jR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00070c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010h\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006q"}, d2 = {"Lw0/L;", "Lw0/J;", "", "initialIncrementId", "<init>", "(J)V", "()V", "Lw0/n;", "selectable", "b", "(Lw0/n;)Lw0/n;", "", "e", "(Lw0/n;)V", "a", "()J", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "", "w", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;", "selectableId", "f", "layoutCoordinates", "LU0/f;", "startPosition", "Lw0/v;", "adjustment", "", "isInTouchMode", "c", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLw0/v;Z)V", "newPosition", "previousPosition", "isStartHandle", "h", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLw0/v;Z)Z", "i", "g", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "sorted", "", "Ljava/util/List;", "_selectables", "LZ/O;", "LZ/O;", "_selectableMap", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "d", "Ljava/util/concurrent/atomic/AtomicLong;", "incrementId", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnPositionChangeCallback$foundation_release", "()Lkotlin/jvm/functions/Function1;", "p", "(Lkotlin/jvm/functions/Function1;)V", "onPositionChangeCallback", "Lkotlin/Function4;", "Lkotlin/jvm/functions/Function4;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lkotlin/jvm/functions/Function4;", "u", "(Lkotlin/jvm/functions/Function4;)V", "onSelectionUpdateStartCallback", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "getOnSelectionUpdateSelectAll$foundation_release", "()Lkotlin/jvm/functions/Function2;", "t", "(Lkotlin/jvm/functions/Function2;)V", "onSelectionUpdateSelectAll", "Lkotlin/Function6;", "Lkotlin/jvm/functions/Function6;", "getOnSelectionUpdateCallback$foundation_release", "()Lkotlin/jvm/functions/Function6;", "r", "(Lkotlin/jvm/functions/Function6;)V", "onSelectionUpdateCallback", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lkotlin/jvm/functions/Function0;", "s", "(Lkotlin/jvm/functions/Function0;)V", "onSelectionUpdateEndCallback", "j", "getOnSelectableChangeCallback$foundation_release", "q", "onSelectableChangeCallback", "k", "getAfterSelectableUnsubscribe$foundation_release", "o", "afterSelectableUnsubscribe", "LZ/y;", "Lw0/p;", "<set-?>", "l", "Landroidx/compose/runtime/l0;", "()LZ/y;", "v", "(LZ/y;)V", "subselections", "n", "()Ljava/util/List;", "selectables", "m", "selectableMap", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17773L implements InterfaceC17771J {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f166550n = 8;

    /* renamed from: o, reason: collision with root package name */
    private static final L0.k<C17773L, Long> f166551o = L0.l.a(a.f166564f, b.f166565f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean sorted;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC17798n> _selectables;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final O<InterfaceC17798n> _selectableMap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private AtomicLong incrementId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Long, Unit> onPositionChangeCallback;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Function4<? super Boolean, ? super LayoutCoordinates, ? super U0.f, ? super InterfaceC17806v, Unit> onSelectionUpdateStartCallback;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Function2<? super Boolean, ? super Long, Unit> onSelectionUpdateSelectAll;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Function6<? super Boolean, ? super LayoutCoordinates, ? super U0.f, ? super U0.f, ? super Boolean, ? super InterfaceC17806v, Boolean> onSelectionUpdateCallback;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onSelectionUpdateEndCallback;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Long, Unit> onSelectableChangeCallback;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Long, Unit> afterSelectableUnsubscribe;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 subselections;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lw0/L;", "a", "(J)Lw0/L;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.L$b */
    static final class b extends Lambda implements Function1<Long, C17773L> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f166565f = new b();

        b() {
            super(1);
        }

        public final C17773L a(long j10) {
            return new C17773L(j10, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C17773L invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw0/L$c;", "", "<init>", "()V", "LL0/k;", "Lw0/L;", "", "Saver", "LL0/k;", "a", "()LL0/k;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.L$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final L0.k<C17773L, Long> a() {
            return C17773L.f166551o;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0004"}, d2 = {"Lw0/n;", "a", "b", "", "(Lw0/n;Lw0/n;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.L$d */
    static final class d extends Lambda implements Function2<InterfaceC17798n, InterfaceC17798n, Integer> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LayoutCoordinates f166566f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(LayoutCoordinates layoutCoordinates) {
            super(2);
            this.f166566f = layoutCoordinates;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(InterfaceC17798n interfaceC17798n, InterfaceC17798n interfaceC17798n2) {
            long jC;
            long jC2;
            int iD;
            LayoutCoordinates layoutCoordinatesB = interfaceC17798n.B();
            LayoutCoordinates layoutCoordinatesB2 = interfaceC17798n2.B();
            if (layoutCoordinatesB != null) {
                jC = this.f166566f.J(layoutCoordinatesB, U0.f.INSTANCE.c());
            } else {
                jC = U0.f.INSTANCE.c();
            }
            if (layoutCoordinatesB2 != null) {
                jC2 = this.f166566f.J(layoutCoordinatesB2, U0.f.INSTANCE.c());
            } else {
                jC2 = U0.f.INSTANCE.c();
            }
            int i10 = (int) (jC & 4294967295L);
            int i11 = (int) (4294967295L & jC2);
            if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
                iD = ComparisonsKt.d(Float.valueOf(Float.intBitsToFloat((int) (jC >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jC2 >> 32))));
            } else {
                iD = ComparisonsKt.d(Float.valueOf(Float.intBitsToFloat(i10)), Float.valueOf(Float.intBitsToFloat(i11)));
            }
            return Integer.valueOf(iD);
        }
    }

    public /* synthetic */ C17773L(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // kotlin.InterfaceC17771J
    public void f(long selectableId) {
        this.sorted = false;
        Function1<? super Long, Unit> function1 = this.onPositionChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // kotlin.InterfaceC17771J
    public boolean h(LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, InterfaceC17806v adjustment, boolean isInTouchMode) {
        Function6<? super Boolean, ? super LayoutCoordinates, ? super U0.f, ? super U0.f, ? super Boolean, ? super InterfaceC17806v, Boolean> function6 = this.onSelectionUpdateCallback;
        if (function6 != null) {
            return function6.h(Boolean.valueOf(isInTouchMode), layoutCoordinates, U0.f.d(newPosition), U0.f.d(previousPosition), Boolean.valueOf(isStartHandle), adjustment).booleanValue();
        }
        return true;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Lw0/L;", "it", "", "a", "(LL0/m;Lw0/L;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.L$a */
    static final class a extends Lambda implements Function2<L0.m, C17773L, Long> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f166564f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(L0.m mVar, C17773L c17773l) {
            return Long.valueOf(c17773l.incrementId.get());
        }
    }

    private C17773L(long j10) {
        this._selectables = new ArrayList();
        this._selectableMap = C5627z.c();
        this.incrementId = new AtomicLong(j10);
        this.subselections = t1.e(C5627z.a(), null, 2, null);
    }

    @Override // kotlin.InterfaceC17771J
    public long a() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // kotlin.InterfaceC17771J
    public void c(LayoutCoordinates layoutCoordinates, long startPosition, InterfaceC17806v adjustment, boolean isInTouchMode) {
        Function4<? super Boolean, ? super LayoutCoordinates, ? super U0.f, ? super InterfaceC17806v, Unit> function4 = this.onSelectionUpdateStartCallback;
        if (function4 != null) {
            function4.invoke(Boolean.valueOf(isInTouchMode), layoutCoordinates, U0.f.d(startPosition), adjustment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.InterfaceC17771J
    public AbstractC5626y<Selection> d() {
        return (AbstractC5626y) this.subselections.getValue();
    }

    @Override // kotlin.InterfaceC17771J
    public void e(InterfaceC17798n selectable) {
        if (this._selectableMap.a(selectable.i())) {
            this._selectables.remove(selectable);
            this._selectableMap.o(selectable.i());
            Function1<? super Long, Unit> function1 = this.afterSelectableUnsubscribe;
            if (function1 != null) {
                function1.invoke(Long.valueOf(selectable.i()));
            }
        }
    }

    @Override // kotlin.InterfaceC17771J
    public void g(long selectableId) {
        Function1<? super Long, Unit> function1 = this.onSelectableChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // kotlin.InterfaceC17771J
    public void i() {
        Function0<Unit> function0 = this.onSelectionUpdateEndCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final AbstractC5626y<InterfaceC17798n> m() {
        return this._selectableMap;
    }

    public final List<InterfaceC17798n> n() {
        return this._selectables;
    }

    public final void o(Function1<? super Long, Unit> function1) {
        this.afterSelectableUnsubscribe = function1;
    }

    public final void p(Function1<? super Long, Unit> function1) {
        this.onPositionChangeCallback = function1;
    }

    public final void q(Function1<? super Long, Unit> function1) {
        this.onSelectableChangeCallback = function1;
    }

    public final void r(Function6<? super Boolean, ? super LayoutCoordinates, ? super U0.f, ? super U0.f, ? super Boolean, ? super InterfaceC17806v, Boolean> function6) {
        this.onSelectionUpdateCallback = function6;
    }

    public final void s(Function0<Unit> function0) {
        this.onSelectionUpdateEndCallback = function0;
    }

    public final void t(Function2<? super Boolean, ? super Long, Unit> function2) {
        this.onSelectionUpdateSelectAll = function2;
    }

    public final void u(Function4<? super Boolean, ? super LayoutCoordinates, ? super U0.f, ? super InterfaceC17806v, Unit> function4) {
        this.onSelectionUpdateStartCallback = function4;
    }

    public void v(AbstractC5626y<Selection> abstractC5626y) {
        this.subselections.setValue(abstractC5626y);
    }

    public final List<InterfaceC17798n> w(LayoutCoordinates containerLayoutCoordinates) {
        if (!this.sorted) {
            List<InterfaceC17798n> list = this._selectables;
            final d dVar = new d(containerLayoutCoordinates);
            CollectionsKt.B(list, new Comparator() { // from class: w0.K
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C17773L.x(dVar, obj, obj2);
                }
            });
            this.sorted = true;
        }
        return n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    @Override // kotlin.InterfaceC17771J
    public InterfaceC17798n b(InterfaceC17798n selectable) {
        boolean z10;
        if (selectable.i() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C14592e.a("The selectable contains an invalid id: " + selectable.i());
        }
        if (this._selectableMap.a(selectable.i())) {
            C14592e.a("Another selectable with the id: " + selectable + ".selectableId has already subscribed.");
        }
        this._selectableMap.r(selectable.i(), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    public C17773L() {
        this(1L);
    }
}
