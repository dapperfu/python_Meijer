package di;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Ldi/c;", "", "e", "(Ldi/c;)Ljava/lang/String;", "deliveryAddress", "", "f", "(Ldi/c;Ldi/c;)Z", "b", "c", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: di.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13687e {
    public static final String b(CustomerAddress customerAddress) {
        Intrinsics.j(customerAddress, "<this>");
        return customerAddress.getFirstName() + ' ' + customerAddress.getLastName();
    }

    public static final String c(CustomerAddress customerAddress) {
        Intrinsics.j(customerAddress, "<this>");
        return CollectionsKt.B0(CollectionsKt.p(customerAddress.getLine1(), customerAddress.getLine2(), customerAddress.getTown(), customerAddress.getRegion().getName(), customerAddress.getPostalCode()), ", ", null, null, 0, null, new Function1() { // from class: di.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C13687e.d((String) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(String str) {
        return str == null ? "" : str;
    }

    public static final String e(CustomerAddress customerAddress) {
        Intrinsics.j(customerAddress, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(customerAddress.getLine1());
        sb2.append(",\n");
        sb2.append(customerAddress.getTown());
        sb2.append(", ");
        Region region = customerAddress.getRegion();
        String isoCodeShort = region.getIsoCodeShort();
        if (isoCodeShort == null) {
            isoCodeShort = StringsKt.K0(region.getIsoCode(), "US-");
        }
        sb2.append(isoCodeShort);
        sb2.append(", ");
        sb2.append(customerAddress.getPostalCode());
        return sb2.toString();
    }

    public static final boolean f(CustomerAddress customerAddress, CustomerAddress customerAddress2) {
        Intrinsics.j(customerAddress, "<this>");
        return customerAddress2 != null && Intrinsics.e(customerAddress.getName(), customerAddress2.getName()) && Intrinsics.e(customerAddress.getFirstName(), customerAddress2.getFirstName()) && Intrinsics.e(customerAddress.getLastName(), customerAddress2.getLastName()) && Intrinsics.e(customerAddress.getLine1(), customerAddress2.getLine1()) && Intrinsics.e(customerAddress.getLine2(), customerAddress2.getLine2()) && Intrinsics.e(customerAddress.getTown(), customerAddress2.getTown()) && Intrinsics.e(customerAddress.getRegion().getIsoCode(), customerAddress2.getRegion().getIsoCode()) && Intrinsics.e(customerAddress.getPostalCode(), customerAddress2.getPostalCode()) && Intrinsics.e(customerAddress.getPhone(), customerAddress2.getPhone()) && Intrinsics.e(customerAddress.getCountry().getIsoCode(), customerAddress2.getCountry().getIsoCode()) && Intrinsics.e(customerAddress.getState(), customerAddress2.getState());
    }
}
