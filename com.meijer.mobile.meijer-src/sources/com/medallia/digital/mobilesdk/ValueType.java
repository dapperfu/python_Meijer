package com.medallia.digital.mobilesdk;

/* loaded from: classes8.dex */
enum ValueType {
    TypeString,
    TypeInteger,
    TypeDouble,
    TypeLong,
    TypeBoolean;

    protected static ValueType fromString(String str) {
        ValueType valueType = TypeString;
        if (valueType.name().equals(str)) {
            return valueType;
        }
        ValueType valueType2 = TypeInteger;
        if (valueType2.name().equals(str)) {
            return valueType2;
        }
        ValueType valueType3 = TypeDouble;
        if (valueType3.name().equals(str)) {
            return valueType3;
        }
        ValueType valueType4 = TypeLong;
        if (valueType4.name().equals(str)) {
            return valueType4;
        }
        ValueType valueType5 = TypeBoolean;
        if (valueType5.name().equals(str)) {
            return valueType5;
        }
        return null;
    }
}
