package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class L extends AbstractC10560x {
    @Override // com.google.android.gms.internal.measurement.AbstractC10560x
    public final InterfaceC10498q a(String str, U1 u12, List list) {
        if (str == null || str.isEmpty() || !u12.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC10498q interfaceC10498qH = u12.h(str);
        if (interfaceC10498qH instanceof AbstractC10444k) {
            return ((AbstractC10444k) interfaceC10498qH).b(u12, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
