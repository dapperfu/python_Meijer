package com.launchdarkly.sdk;

import java.util.Objects;
import og.InterfaceC16126b;

@InterfaceC16126b(EvaluationReasonTypeAdapter.class)
/* loaded from: classes8.dex */
public final class EvaluationReason implements com.launchdarkly.sdk.json.c {
    private static final EvaluationReason ERROR_CLIENT_NOT_READY;
    private static final EvaluationReason ERROR_EXCEPTION;
    private static final EvaluationReason ERROR_FLAG_NOT_FOUND;
    private static final EvaluationReason ERROR_MALFORMED_FLAG;
    private static final EvaluationReason ERROR_USER_NOT_SPECIFIED;
    private static final EvaluationReason ERROR_WRONG_TYPE;
    private static final EvaluationReason FALLTHROUGH_INSTANCE;
    private static final EvaluationReason FALLTHROUGH_INSTANCE_IN_EXPERIMENT;
    private static boolean IN_EXPERIMENT = true;
    private static boolean NOT_IN_EXPERIMENT;
    private static final EvaluationReason OFF_INSTANCE = new EvaluationReason(Kind.OFF);
    private static final EvaluationReason TARGET_MATCH_INSTANCE;
    private final BigSegmentsStatus bigSegmentsStatus;
    private final ErrorKind errorKind;
    private final Exception exception;
    private final boolean inExperiment;
    private final Kind kind;
    private final String prerequisiteKey;
    private final String ruleId;
    private final int ruleIndex;

    public enum BigSegmentsStatus {
        HEALTHY,
        STALE,
        NOT_CONFIGURED,
        STORE_ERROR
    }

    public enum ErrorKind {
        CLIENT_NOT_READY,
        FLAG_NOT_FOUND,
        MALFORMED_FLAG,
        USER_NOT_SPECIFIED,
        WRONG_TYPE,
        EXCEPTION
    }

    public enum Kind {
        OFF,
        FALLTHROUGH,
        TARGET_MATCH,
        RULE_MATCH,
        PREREQUISITE_FAILED,
        ERROR
    }

    private EvaluationReason(Kind kind, int i10, String str, String str2, boolean z10, ErrorKind errorKind, Exception exc, BigSegmentsStatus bigSegmentsStatus) {
        this.kind = kind;
        this.ruleIndex = i10;
        this.ruleId = str;
        this.prerequisiteKey = str2;
        this.inExperiment = z10;
        this.errorKind = errorKind;
        this.exception = exc;
        this.bigSegmentsStatus = bigSegmentsStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EvaluationReason) {
            EvaluationReason evaluationReason = (EvaluationReason) obj;
            if (this.kind == evaluationReason.kind && this.ruleIndex == evaluationReason.ruleIndex && Objects.equals(this.ruleId, evaluationReason.ruleId) && Objects.equals(this.prerequisiteKey, evaluationReason.prerequisiteKey) && this.inExperiment == evaluationReason.inExperiment && Objects.equals(this.errorKind, evaluationReason.errorKind) && Objects.equals(this.exception, evaluationReason.exception) && Objects.equals(this.bigSegmentsStatus, evaluationReason.bigSegmentsStatus)) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91834a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f91835b;

        static {
            int[] iArr = new int[ErrorKind.values().length];
            f91835b = iArr;
            try {
                iArr[ErrorKind.CLIENT_NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91835b[ErrorKind.EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91835b[ErrorKind.FLAG_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91835b[ErrorKind.MALFORMED_FLAG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f91835b[ErrorKind.USER_NOT_SPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f91835b[ErrorKind.WRONG_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Kind.values().length];
            f91834a = iArr2;
            try {
                iArr2[Kind.RULE_MATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f91834a[Kind.PREREQUISITE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f91834a[Kind.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        Kind kind = Kind.FALLTHROUGH;
        FALLTHROUGH_INSTANCE = new EvaluationReason(kind);
        FALLTHROUGH_INSTANCE_IN_EXPERIMENT = new EvaluationReason(kind, IN_EXPERIMENT);
        TARGET_MATCH_INSTANCE = new EvaluationReason(Kind.TARGET_MATCH);
        ERROR_CLIENT_NOT_READY = new EvaluationReason(ErrorKind.CLIENT_NOT_READY, (Exception) null);
        ERROR_FLAG_NOT_FOUND = new EvaluationReason(ErrorKind.FLAG_NOT_FOUND, (Exception) null);
        ERROR_MALFORMED_FLAG = new EvaluationReason(ErrorKind.MALFORMED_FLAG, (Exception) null);
        ERROR_USER_NOT_SPECIFIED = new EvaluationReason(ErrorKind.USER_NOT_SPECIFIED, (Exception) null);
        ERROR_WRONG_TYPE = new EvaluationReason(ErrorKind.WRONG_TYPE, (Exception) null);
        ERROR_EXCEPTION = new EvaluationReason(ErrorKind.EXCEPTION, (Exception) null);
    }

    public static EvaluationReason a(ErrorKind errorKind) {
        switch (a.f91835b[errorKind.ordinal()]) {
            case 1:
                return ERROR_CLIENT_NOT_READY;
            case 2:
                return ERROR_EXCEPTION;
            case 3:
                return ERROR_FLAG_NOT_FOUND;
            case 4:
                return ERROR_MALFORMED_FLAG;
            case 5:
                return ERROR_USER_NOT_SPECIFIED;
            case 6:
                return ERROR_WRONG_TYPE;
            default:
                return new EvaluationReason(errorKind, (Exception) null);
        }
    }

    public static EvaluationReason b() {
        return FALLTHROUGH_INSTANCE;
    }

    public static EvaluationReason c(boolean z10) {
        return z10 ? FALLTHROUGH_INSTANCE_IN_EXPERIMENT : FALLTHROUGH_INSTANCE;
    }

    public static EvaluationReason k() {
        return OFF_INSTANCE;
    }

    public static EvaluationReason l(String str) {
        return new EvaluationReason(Kind.PREREQUISITE_FAILED, -1, null, str, NOT_IN_EXPERIMENT, null, null, null);
    }

    public static EvaluationReason m(int i10, String str, boolean z10) {
        return new EvaluationReason(Kind.RULE_MATCH, i10, str, null, z10, null, null, null);
    }

    public static EvaluationReason n() {
        return TARGET_MATCH_INSTANCE;
    }

    public BigSegmentsStatus d() {
        return this.bigSegmentsStatus;
    }

    public ErrorKind e() {
        return this.errorKind;
    }

    public Kind f() {
        return this.kind;
    }

    public String g() {
        return this.prerequisiteKey;
    }

    public String h() {
        return this.ruleId;
    }

    public int hashCode() {
        return Objects.hash(this.kind, Integer.valueOf(this.ruleIndex), this.ruleId, this.prerequisiteKey, Boolean.valueOf(this.inExperiment), this.errorKind, this.exception, this.bigSegmentsStatus);
    }

    public int i() {
        return this.ruleIndex;
    }

    public boolean j() {
        return this.inExperiment;
    }

    public EvaluationReason o(BigSegmentsStatus bigSegmentsStatus) {
        return new EvaluationReason(this.kind, this.ruleIndex, this.ruleId, this.prerequisiteKey, this.inExperiment, this.errorKind, this.exception, bigSegmentsStatus);
    }

    public String toString() {
        int i10 = a.f91834a[this.kind.ordinal()];
        String str = "";
        if (i10 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.kind);
            sb2.append("(");
            sb2.append(this.ruleIndex);
            if (this.ruleId != null) {
                str = "," + this.ruleId;
            }
            sb2.append(str);
            sb2.append(")");
            return sb2.toString();
        }
        if (i10 == 2) {
            return this.kind + "(" + this.prerequisiteKey + ")";
        }
        if (i10 != 3) {
            return f().name();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.kind);
        sb3.append("(");
        sb3.append(this.errorKind);
        if (this.exception != null) {
            str = "," + this.exception;
        }
        sb3.append(str);
        sb3.append(")");
        return sb3.toString();
    }

    private EvaluationReason(Kind kind) {
        this(kind, -1, null, null, NOT_IN_EXPERIMENT, null, null, null);
    }

    private EvaluationReason(Kind kind, boolean z10) {
        this(kind, -1, null, null, z10, null, null, null);
    }

    private EvaluationReason(ErrorKind errorKind, Exception exc) {
        this(Kind.ERROR, -1, null, null, NOT_IN_EXPERIMENT, errorKind, exc, null);
    }
}
