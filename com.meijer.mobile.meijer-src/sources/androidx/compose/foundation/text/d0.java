package androidx.compose.foundation.text;

import androidx.compose.runtime.A0;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.o1;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.EnumC13937z;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R+\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010$\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R+\u0010*\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010+R(\u00102\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u0010\t\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b3\u00105\"\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/foundation/text/d0;", "", "Lf0/z;", "initialOrientation", "", "initial", "<init>", "(Lf0/z;F)V", "()V", "orientation", "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "", "containerSize", "textFieldSize", "", "k", "(Lf0/z;Landroidx/compose/ui/geometry/Rect;II)V", "cursorStart", "cursorEnd", "b", "(FFI)V", "Landroidx/compose/ui/text/y;", "selection", "e", "(J)I", "<set-?>", "a", "Landroidx/compose/runtime/i0;", "d", "()F", "h", "(F)V", "offset", "c", "g", "maximum", "Landroidx/compose/runtime/j0;", "getViewportSize", "()I", "j", "(I)V", "viewportSize", "Landroidx/compose/ui/geometry/Rect;", "previousCursorRect", "J", "getPreviousSelection-d9O1mEE", "()J", "i", "(J)V", "previousSelection", "f", "Landroidx/compose/runtime/l0;", "()Lf0/z;", "setOrientation", "(Lf0/z;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final L0.k<d0, Object> f49594h = L0.a.a(a.f49601f, b.f49602f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5866i0 offset;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5866i0 maximum;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5868j0 viewportSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Rect previousCursorRect;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long previousSelection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 orientation;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "restored", "Landroidx/compose/foundation/text/d0;", "a", "(Ljava/util/List;)Landroidx/compose/foundation/text/d0;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<List<? extends Object>, d0> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f49602f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke(List<? extends Object> list) {
            Object obj = list.get(1);
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Boolean");
            EnumC13937z enumC13937z = ((Boolean) obj).booleanValue() ? EnumC13937z.f131419a : EnumC13937z.f131420b;
            Object obj2 = list.get(0);
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new d0(enumC13937z, ((Float) obj2).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/d0$c;", "", "<init>", "()V", "LL0/k;", "Landroidx/compose/foundation/text/d0;", "Saver", "LL0/k;", "a", "()LL0/k;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.d0$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final L0.k<d0, Object> a() {
            return d0.f49594h;
        }
    }

    public d0(EnumC13937z enumC13937z, float f10) {
        this.offset = A0.a(f10);
        this.maximum = A0.a(0.0f);
        this.viewportSize = C5844c1.a(0);
        this.previousCursorRect = Rect.INSTANCE.a();
        this.previousSelection = androidx.compose.ui.text.y.INSTANCE.a();
        this.orientation = o1.i(enumC13937z, o1.r());
    }

    public final void k(EnumC13937z orientation, Rect cursorRect, int containerSize, int textFieldSize) {
        float f10 = textFieldSize - containerSize;
        g(f10);
        if (cursorRect.getLeft() != this.previousCursorRect.getLeft() || cursorRect.getTop() != this.previousCursorRect.getTop()) {
            boolean z10 = orientation == EnumC13937z.f131419a;
            b(z10 ? cursorRect.getTop() : cursorRect.getLeft(), z10 ? cursorRect.i() : cursorRect.l(), containerSize);
            this.previousCursorRect = cursorRect;
        }
        h(RangesKt.n(d(), 0.0f, f10));
        j(containerSize);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LL0/m;", "Landroidx/compose/foundation/text/d0;", "it", "", "", "a", "(LL0/m;Landroidx/compose/foundation/text/d0;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function2<L0.m, d0, List<? extends Object>> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f49601f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(L0.m mVar, d0 d0Var) {
            boolean z10;
            Float fValueOf = Float.valueOf(d0Var.d());
            if (d0Var.f() == EnumC13937z.f131419a) {
                z10 = true;
            } else {
                z10 = false;
            }
            return CollectionsKt.p(fValueOf, Boolean.valueOf(z10));
        }
    }

    private final void g(float f10) {
        this.maximum.A(f10);
    }

    private final void j(int i10) {
        this.viewportSize.i(i10);
    }

    public final float c() {
        return this.maximum.b();
    }

    public final float d() {
        return this.offset.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC13937z f() {
        return (EnumC13937z) this.orientation.getValue();
    }

    public final void h(float f10) {
        this.offset.A(f10);
    }

    public final void i(long j10) {
        this.previousSelection = j10;
    }

    public final void b(float cursorStart, float cursorEnd, int containerSize) {
        float f10;
        float fD = d();
        float f11 = containerSize;
        float f12 = fD + f11;
        if (cursorEnd > f12 || (cursorStart < fD && cursorEnd - cursorStart > f11)) {
            f10 = cursorEnd - f12;
        } else if (cursorStart < fD && cursorEnd - cursorStart <= f11) {
            f10 = cursorStart - fD;
        } else {
            f10 = 0.0f;
        }
        h(d() + f10);
    }

    public final int e(long selection) {
        if (androidx.compose.ui.text.y.n(selection) != androidx.compose.ui.text.y.n(this.previousSelection)) {
            return androidx.compose.ui.text.y.n(selection);
        }
        if (androidx.compose.ui.text.y.i(selection) != androidx.compose.ui.text.y.i(this.previousSelection)) {
            return androidx.compose.ui.text.y.i(selection);
        }
        return androidx.compose.ui.text.y.l(selection);
    }

    public /* synthetic */ d0(EnumC13937z enumC13937z, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC13937z, (i10 & 2) != 0 ? 0.0f : f10);
    }

    public d0() {
        this(EnumC13937z.f131419a, 0.0f, 2, null);
    }
}
