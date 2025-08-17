package jl;

import Hk.Validation;
import Hk.c;
import Tq.PointOfService;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ej.DeliveryMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0011B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Ljl/x;", "LIk/k;", "Lej/h;", "Lkotlin/reflect/KProperty0;", "LHk/b;", "field", "LTq/c;", PlaceTypes.STORE, "<init>", "(Lkotlin/reflect/KProperty0;LTq/c;)V", "", "LHk/c;", "d", "()Ljava/util/List;", "f", "LTq/c;", "g", "a", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class x extends Ik.k<DeliveryMode> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final PointOfService store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(KProperty0<Validation<DeliveryMode>> field, PointOfService pointOfService) {
        super(field, null, 2, null);
        Intrinsics.j(field, "field");
        this.store = pointOfService;
    }

    @Override // Ik.k
    public List<Hk.c> d() {
        String code;
        DeliveryMode deliveryModeI = i();
        String code2 = null;
        invalid = null;
        invalid = null;
        invalid = null;
        Object invalid = null;
        if (deliveryModeI != null) {
            code = deliveryModeI.getCode();
        } else {
            code = null;
        }
        if (Intrinsics.e(code, "delivery")) {
            PointOfService pointOfService = this.store;
            if (pointOfService != null) {
                if (pointOfService.getIsEligibleForDelivery()) {
                    pointOfService = null;
                }
                if (pointOfService != null) {
                    invalid = new c.Invalid(getFieldName(), "unsupported_fulfillment", "store does not support delivery");
                }
            }
        } else if (Intrinsics.e(code, "pickup")) {
            PointOfService pointOfService2 = this.store;
            if (pointOfService2 != null) {
                if (pointOfService2.getCurbSideEligibility()) {
                    pointOfService2 = null;
                }
                if (pointOfService2 != null) {
                    invalid = new c.Invalid(getFieldName(), "unsupported_fulfillment", "store does not support curbside pickup");
                }
            }
        } else if (code == null) {
            invalid = new c.Pending(getFieldName());
        } else {
            String fieldName = getFieldName();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unknown fulfillment mode ");
            DeliveryMode deliveryModeI2 = i();
            if (deliveryModeI2 != null) {
                code2 = deliveryModeI2.getCode();
            }
            sb2.append(code2);
            invalid = new c.Invalid(fieldName, "unsupported_fulfillment", sb2.toString());
        }
        return CollectionsKt.q(invalid);
    }
}
