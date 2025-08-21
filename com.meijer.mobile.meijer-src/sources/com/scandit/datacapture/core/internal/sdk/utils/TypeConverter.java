package com.scandit.datacapture.core.internal.sdk.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/utils/TypeConverter;", "", "value", "", "intFromAny", "(Ljava/lang/Object;)Ljava/lang/Integer;", "", "longFromAny", "(Ljava/lang/Object;)Ljava/lang/Long;", "", "booleanFromAny", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class TypeConverter {
    public static final TypeConverter INSTANCE = new TypeConverter();

    public final Boolean booleanFromAny(Object value) {
        if (value instanceof Integer) {
            return Boolean.valueOf(Intrinsics.e(value, 1));
        }
        if (value instanceof Long) {
            return Boolean.valueOf(Intrinsics.e(value, 1L));
        }
        if (value instanceof Short) {
            return Boolean.valueOf(value != null && ((Number) value).shortValue() == 1);
        }
        if (value instanceof Byte) {
            return Boolean.valueOf(value != null && ((Number) value).byteValue() == 1);
        }
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        if (value instanceof String) {
            return Boolean.valueOf(Boolean.parseBoolean((String) value));
        }
        return null;
    }

    public final Integer intFromAny(Object value) {
        if (value instanceof Integer) {
            return (Integer) value;
        }
        if (value instanceof Long) {
            return Integer.valueOf((int) ((Number) value).longValue());
        }
        if (value instanceof Short) {
            return Integer.valueOf(((Number) value).shortValue());
        }
        if (value instanceof Byte) {
            return Integer.valueOf(((Number) value).byteValue());
        }
        if (value instanceof Boolean) {
            return Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0);
        }
        return null;
    }

    public final Long longFromAny(Object value) {
        if (value instanceof Integer) {
            return Long.valueOf(((Number) value).intValue());
        }
        if (value instanceof Long) {
            return (Long) value;
        }
        if (value instanceof Short) {
            return Long.valueOf(((Number) value).shortValue());
        }
        if (value instanceof Byte) {
            return Long.valueOf(((Number) value).byteValue());
        }
        if (value instanceof Boolean) {
            return Long.valueOf(((Boolean) value).booleanValue() ? 1L : 0L);
        }
        return null;
    }

    private TypeConverter() {
    }
}
