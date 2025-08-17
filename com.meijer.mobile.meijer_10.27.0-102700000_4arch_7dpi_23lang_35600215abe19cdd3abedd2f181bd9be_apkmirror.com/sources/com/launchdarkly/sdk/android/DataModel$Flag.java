package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.EvaluationReason;
import com.launchdarkly.sdk.LDValue;
import com.launchdarkly.sdk.json.SerializationException;
import java.util.Objects;
import nh.AbstractC15796a;

/* loaded from: classes7.dex */
public final class DataModel$Flag {
    private final Long debugEventsUntilDate;
    private final Boolean deleted;
    private final Integer flagVersion;
    private final String key;
    private final String[] prerequisites;
    private final EvaluationReason reason;
    private final Boolean trackEvents;
    private final Boolean trackReason;
    private final LDValue value;
    private final Integer variation;
    private final int version;

    private DataModel$Flag(String str, LDValue lDValue, int i10, Integer num, Integer num2, EvaluationReason evaluationReason, boolean z10, boolean z11, Long l10, String[] strArr, boolean z12) {
        this.key = str;
        this.value = lDValue;
        this.version = i10;
        this.flagVersion = num;
        this.variation = num2;
        this.reason = evaluationReason;
        this.trackEvents = z10 ? Boolean.TRUE : null;
        this.trackReason = z11 ? Boolean.TRUE : null;
        this.debugEventsUntilDate = l10;
        this.prerequisites = strArr;
        this.deleted = z12 ? Boolean.TRUE : null;
    }

    public static DataModel$Flag a(String str, int i10) {
        return new DataModel$Flag(str, null, i10, null, null, null, false, false, null, null, true);
    }

    Long c() {
        return this.debugEventsUntilDate;
    }

    Integer d() {
        return this.flagVersion;
    }

    String e() {
        return this.key;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DataModel$Flag) {
            DataModel$Flag dataModel$Flag = (DataModel$Flag) obj;
            if (Objects.equals(this.key, dataModel$Flag.key) && Objects.equals(this.value, dataModel$Flag.value) && this.version == dataModel$Flag.version && Objects.equals(this.variation, dataModel$Flag.variation) && Objects.equals(this.reason, dataModel$Flag.reason) && this.trackEvents == dataModel$Flag.trackEvents && this.trackReason == dataModel$Flag.trackReason && Objects.equals(this.debugEventsUntilDate, dataModel$Flag.debugEventsUntilDate) && Objects.equals(this.prerequisites, dataModel$Flag.prerequisites) && this.deleted == dataModel$Flag.deleted) {
                return true;
            }
        }
        return false;
    }

    String[] f() {
        return this.prerequisites;
    }

    EvaluationReason g() {
        return this.reason;
    }

    LDValue h() {
        return LDValue.o(this.value);
    }

    Integer i() {
        return this.variation;
    }

    int j() {
        return this.version;
    }

    int k() {
        Integer num = this.flagVersion;
        return num == null ? this.version : num.intValue();
    }

    boolean l() {
        Boolean bool = this.deleted;
        return bool != null && bool.booleanValue();
    }

    boolean m() {
        Boolean bool = this.trackEvents;
        return bool != null && bool.booleanValue();
    }

    boolean n() {
        Boolean bool = this.trackReason;
        return bool != null && bool.booleanValue();
    }

    public static DataModel$Flag b(String str) throws SerializationException {
        try {
            return (DataModel$Flag) AbstractC15796a.a().o(str, DataModel$Flag.class);
        } catch (Exception e10) {
            throw new SerializationException(e10);
        }
    }

    public String o() {
        return AbstractC15796a.a().x(this);
    }

    public String toString() {
        return o();
    }

    public DataModel$Flag(String str, LDValue lDValue, int i10, Integer num, Integer num2, boolean z10, boolean z11, Long l10, EvaluationReason evaluationReason, String[] strArr) {
        this(str, lDValue, i10, num, num2, evaluationReason, z10, z11, l10, strArr, false);
    }
}
