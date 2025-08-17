package androidx.compose.runtime;

import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/f0;", "", "Landroidx/compose/runtime/SlotTable;", "slotTable", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/Applier;", "applier", "LZ/c0;", "Landroidx/compose/runtime/g0;", "references", "LZ/h0;", "c", "(Landroidx/compose/runtime/Applier;LZ/c0;)LZ/h0;", "a", "Landroidx/compose/runtime/SlotTable;", "d", "()Landroidx/compose/runtime/SlotTable;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5718f0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SlotTable slotTable;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/g0;", "it", "", "a", "(Landroidx/compose/runtime/g0;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.f0$a */
    static final class a extends Lambda implements Function1<C5720g0, Integer> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C5720g0 c5720g0) {
            return Integer.valueOf(C5718f0.this.getSlotTable().f(c5720g0.getAnchor()));
        }
    }

    public final Z.h0<C5720g0, C5718f0> c(Applier<?> applier, Z.c0<C5720g0> references) {
        Object[] objArr = references.content;
        int i10 = references._size;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            if (this.slotTable.D(((C5720g0) objArr[i11]).getAnchor())) {
                i11++;
            } else {
                Z.T t10 = new Z.T(0, 1, null);
                Object[] objArr2 = references.content;
                int i12 = references._size;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object obj = objArr2[i13];
                    if (this.slotTable.D(((C5720g0) obj).getAnchor())) {
                        t10.n(obj);
                    }
                }
                references = t10;
            }
        }
        Z.c0 c0VarD = D0.a.d(references, new a());
        if (c0VarD.g()) {
            return Z.i0.a();
        }
        Z.W wC = Z.i0.c();
        SlotWriter slotWriterC = this.slotTable.C();
        try {
            Object[] objArr3 = c0VarD.content;
            int i14 = c0VarD._size;
            for (int i15 = 0; i15 < i14; i15++) {
                C5720g0 c5720g0 = (C5720g0) objArr3[i15];
                int iE = slotWriterC.E(c5720g0.getAnchor());
                int iParent = slotWriterC.parent(iE);
                a(slotWriterC, iParent);
                b(slotWriterC, iParent);
                slotWriterC.C(iE - slotWriterC.getCurrentGroup());
                wC.x(c5720g0, ComposerKt.x(c5720g0.getComposition(), c5720g0, slotWriterC, applier));
            }
            a(slotWriterC, a.e.API_PRIORITY_OTHER);
            Unit unit = Unit.f142422a;
            slotWriterC.L(true);
            return wC;
        } catch (Throwable th2) {
            slotWriterC.L(false);
            throw th2;
        }
    }

    /* renamed from: d, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    public C5718f0(SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    private static final void a(SlotWriter slotWriter, int i10) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i10) {
            slotWriter.Z0();
            slotWriter.T();
        }
    }

    private static final void b(SlotWriter slotWriter, int i10) {
        boolean z10;
        a(slotWriter, i10);
        while (slotWriter.getCurrentGroup() != i10 && !slotWriter.r0()) {
            if (i10 < ComposerKt.F(slotWriter)) {
                slotWriter.i1();
            } else {
                slotWriter.Y0();
            }
        }
        if (slotWriter.getCurrentGroup() == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            ComposerKt.t("Unexpected slot table structure");
        }
        slotWriter.i1();
    }
}
