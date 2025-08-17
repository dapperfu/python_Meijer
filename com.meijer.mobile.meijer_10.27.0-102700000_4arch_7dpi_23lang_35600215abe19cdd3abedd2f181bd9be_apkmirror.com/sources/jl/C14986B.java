package jl;

import Hk.Validation;
import Hk.c;
import ij.FulfillmentSlot;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\rB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Ljl/B;", "LIk/k;", "Lij/c;", "Lkotlin/reflect/KProperty0;", "LHk/b;", "field", "<init>", "(Lkotlin/reflect/KProperty0;)V", "", "LHk/c;", "d", "()Ljava/util/List;", "f", "a", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jl.B, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14986B extends Ik.k<FulfillmentSlot> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14986B(KProperty0<Validation<FulfillmentSlot>> field) {
        super(field, null, 2, null);
        Intrinsics.j(field, "field");
    }

    @Override // Ik.k
    public List<Hk.c> d() {
        if (i() == null) {
            return CollectionsKt.e(new c.Null(getFieldName(), null, 2, null));
        }
        FulfillmentSlot fulfillmentSlotI = i();
        if (fulfillmentSlotI != null && !fulfillmentSlotI.s()) {
            return CollectionsKt.e(new c.Invalid(getFieldName(), "invalid_time_slot", "Invalid time slot. Make sure the time slot is available and at least 62 minutes in the future."));
        }
        return CollectionsKt.m();
    }
}
