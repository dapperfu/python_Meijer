package Cn;

import Eh.AccountAddress;
import Eh.EnumC3241e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tk.C17269a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCn/a;", "LEh/a;", "a", "(LCn/a;)LEh/a;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {
    public static final AccountAddress a(AddressInfo addressInfo) {
        Intrinsics.j(addressInfo, "<this>");
        return new AccountAddress(0L, 0L, null, C17269a.f163094a.a(addressInfo.getStreetNumber(), addressInfo.getStreetName()), null, addressInfo.getCity(), addressInfo.getStateShortName(), addressInfo.getZipCode(), EnumC3241e.f7540d, null, 0L, null, null, null, null, false, null, null, null, null, 1048086, null);
    }
}
