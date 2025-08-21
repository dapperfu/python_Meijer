package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0014\u0010$R6\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u001e\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b\"\u0010+R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b%\u0010'¨\u0006,"}, d2 = {"Landroidx/compose/runtime/g0;", "", "Landroidx/compose/runtime/e0;", "content", "parameter", "Landroidx/compose/runtime/z;", "composition", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/Anchor;", "anchor", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/I0;", "invalidations", "Landroidx/compose/runtime/y0;", "locals", "nestedReferences", "<init>", "(Landroidx/compose/runtime/e0;Ljava/lang/Object;Landroidx/compose/runtime/z;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;Ljava/util/List;Landroidx/compose/runtime/y0;Ljava/util/List;)V", "a", "Landroidx/compose/runtime/e0;", "c", "()Landroidx/compose/runtime/e0;", "b", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "Landroidx/compose/runtime/z;", "()Landroidx/compose/runtime/z;", "d", "Landroidx/compose/runtime/SlotTable;", "h", "()Landroidx/compose/runtime/SlotTable;", "e", "Landroidx/compose/runtime/Anchor;", "()Landroidx/compose/runtime/Anchor;", "f", "Ljava/util/List;", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "Landroidx/compose/runtime/y0;", "()Landroidx/compose/runtime/y0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5862g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C5857e0<Object> content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object parameter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5898z composition;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SlotTable slotTable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Anchor anchor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<? extends Pair<I0, ? extends Object>> invalidations;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5897y0 locals;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<C5862g0> nestedReferences;

    /* renamed from: a, reason: from getter */
    public final Anchor getAnchor() {
        return this.anchor;
    }

    /* renamed from: b, reason: from getter */
    public final InterfaceC5898z getComposition() {
        return this.composition;
    }

    public final C5857e0<Object> c() {
        return this.content;
    }

    public final List<Pair<I0, Object>> d() {
        return this.invalidations;
    }

    /* renamed from: e, reason: from getter */
    public final InterfaceC5897y0 getLocals() {
        return this.locals;
    }

    public final List<C5862g0> f() {
        return this.nestedReferences;
    }

    /* renamed from: g, reason: from getter */
    public final Object getParameter() {
        return this.parameter;
    }

    /* renamed from: h, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    public final void i(List<? extends Pair<I0, ? extends Object>> list) {
        this.invalidations = list;
    }

    public C5862g0(C5857e0<Object> c5857e0, Object obj, InterfaceC5898z interfaceC5898z, SlotTable slotTable, Anchor anchor, List<? extends Pair<I0, ? extends Object>> list, InterfaceC5897y0 interfaceC5897y0, List<C5862g0> list2) {
        this.content = c5857e0;
        this.parameter = obj;
        this.composition = interfaceC5898z;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = interfaceC5897y0;
        this.nestedReferences = list2;
    }
}
