package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class L extends AbstractC10685x {
    @Override // com.google.android.gms.internal.measurement.AbstractC10685x
    public final InterfaceC10623q a(String str, U1 u12, List list) {
        if (str == null || str.isEmpty() || !u12.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC10623q interfaceC10623qH = u12.h(str);
        if (interfaceC10623qH instanceof AbstractC10569k) {
            return ((AbstractC10569k) interfaceC10623qH).b(u12, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
