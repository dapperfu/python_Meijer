package jl;

import Hk.Validation;
import Hk.c;
import gk.EbtPaymentOption;
import j$.time.YearMonth;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljl/y;", "LIk/k;", "Lgk/d;", "Lkotlin/reflect/KProperty0;", "LHk/b;", "field", "<init>", "(Lkotlin/reflect/KProperty0;)V", "", "LHk/c;", "d", "()Ljava/util/List;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class y extends Ik.k<EbtPaymentOption> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(KProperty0<Validation<EbtPaymentOption>> field) {
        super(field, null, 2, null);
        Intrinsics.j(field, "field");
    }

    @Override // Ik.k
    public List<Hk.c> d() {
        List<Hk.c> listM;
        EbtPaymentOption ebtPaymentOptionI = i();
        if (ebtPaymentOptionI != null) {
            String ebtBalance = ebtPaymentOptionI.getEbtBalance();
            YearMonth yearMonthNow = YearMonth.now();
            Intrinsics.i(yearMonthNow, "now(...)");
            boolean zH = ebtPaymentOptionI.h(yearMonthNow);
            if (StringsKt.r0(ebtBalance)) {
                listM = CollectionsKt.e(new c.Invalid("ebtBalance", "", "The card balance is empty"));
            } else if (zH) {
                listM = CollectionsKt.e(new c.Invalid("expiryDate", "", "The card is expired"));
            } else {
                listM = CollectionsKt.m();
            }
            if (listM != null) {
                return listM;
            }
        }
        return CollectionsKt.m();
    }
}
