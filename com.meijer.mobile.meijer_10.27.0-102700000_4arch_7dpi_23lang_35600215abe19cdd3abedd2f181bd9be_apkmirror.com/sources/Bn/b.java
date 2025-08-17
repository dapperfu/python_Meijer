package Bn;

import Dh.AccountAddress;
import Dh.EnumC3372e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import sk.C16981a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBn/a;", "LDh/a;", "a", "(LBn/a;)LDh/a;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {
    public static final AccountAddress a(AddressInfo addressInfo) {
        Intrinsics.j(addressInfo, "<this>");
        return new AccountAddress(0L, 0L, null, C16981a.f160555a.a(addressInfo.getStreetNumber(), addressInfo.getStreetName()), null, addressInfo.getCity(), addressInfo.getStateShortName(), addressInfo.getZipCode(), EnumC3372e.f6514d, null, 0L, null, null, null, null, false, null, null, null, null, 1048086, null);
    }
}
