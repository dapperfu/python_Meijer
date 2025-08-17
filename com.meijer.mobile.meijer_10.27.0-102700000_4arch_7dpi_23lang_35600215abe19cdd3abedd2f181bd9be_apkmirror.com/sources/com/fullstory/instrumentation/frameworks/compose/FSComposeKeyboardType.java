package com.fullstory.instrumentation.frameworks.compose;

import fsimpl.bF;

/* loaded from: classes14.dex */
public enum FSComposeKeyboardType {
    TEXT,
    ASCII,
    NUMBER,
    PHONE,
    URI,
    EMAIL,
    PASSWORD,
    NUMBER_PASSWORD,
    DECIMAL,
    UNKNOWN;

    public static FSComposeKeyboardType from(int i10) {
        FSComposeKeyboardTypeCompanion fSComposeKeyboardTypeCompanion = bF.f131763a;
        if (fSComposeKeyboardTypeCompanion == null) {
            return UNKNOWN;
        }
        Integer numValueOf = Integer.valueOf(i10);
        return numValueOf.equals(fSComposeKeyboardTypeCompanion._fsGetText()) ? TEXT : numValueOf.equals(fSComposeKeyboardTypeCompanion._fsGetAscii()) ? ASCII : numValueOf.equals(fSComposeKeyboardTypeCompanion._fsGetNumber()) ? NUMBER : numValueOf.equals(fSComposeKeyboardTypeCompanion._fsGetPhone()) ? PHONE : numValueOf.equals(fSComposeKeyboardTypeCompanion._fsGetUri()) ? URI : numValueOf.equals(fSComposeKeyboardTypeCompanion._fsGetEmail()) ? EMAIL : numValueOf.equals(fSComposeKeyboardTypeCompanion._fsGetPassword()) ? PASSWORD : numValueOf.equals(fSComposeKeyboardTypeCompanion._fsGetNumberPassword()) ? NUMBER_PASSWORD : numValueOf.equals(fSComposeKeyboardTypeCompanion._fsGetDecimal()) ? DECIMAL : UNKNOWN;
    }
}
