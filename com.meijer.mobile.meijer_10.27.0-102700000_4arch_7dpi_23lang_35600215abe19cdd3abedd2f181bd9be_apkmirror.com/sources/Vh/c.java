package Vh;

import Dh.AccountAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LDh/a;", "", "isFirstItem", "LVh/b;", "a", "(LDh/a;Z)LVh/b;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {
    public static final PaymentsAddressDecorator a(AccountAddress accountAddress, boolean z10) {
        Intrinsics.j(accountAddress, "<this>");
        return new PaymentsAddressDecorator(accountAddress.getFirstName() + ' ' + accountAddress.getLastName(), accountAddress.getAddressLine1(), accountAddress.getAddressLine2(), accountAddress.getCity() + ", " + accountAddress.getState() + ' ' + accountAddress.getZipCode(), accountAddress.getIsPrimary(), z10);
    }
}
