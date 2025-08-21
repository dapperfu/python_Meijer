package com.medallia.digital.mobilesdk;

import java.util.ArrayList;

/* loaded from: classes8.dex */
public class u1 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93918a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f93919b;

        static {
            int[] iArr = new int[b.values().length];
            f93919b = iArr;
            try {
                iArr[b.sdkInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93919b[b.updateConfiguration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93919b[b.backToForeground.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93919b[b.customParameters.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93919b[b.evaluationTimerFG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93919b[b.enableIntercept.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93919b[b.evaluationTimerBG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f93919b[b.declineInvitation.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ValueType.values().length];
            f93918a = iArr2;
            try {
                iArr2[ValueType.TypeInteger.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f93918a[ValueType.TypeLong.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f93918a[ValueType.TypeString.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f93918a[ValueType.TypeDouble.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f93918a[ValueType.TypeBoolean.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    protected enum b {
        sdkInit,
        updateConfiguration,
        enableIntercept,
        backToForeground,
        customParameters,
        evaluationTimerFG,
        evaluationTimerBG,
        declineInvitation
    }

    enum c {
        TRIGGER_RULES,
        NEXT_EVALUATION;

        protected static c a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            if (upperCase.equals("TRIGGER_RULES")) {
                return TRIGGER_RULES;
            }
            if (upperCase.equals("NEXT_EVALUATION")) {
                return NEXT_EVALUATION;
            }
            return null;
        }
    }

    enum d {
        FOREGROUND,
        BACKGROUND;

        protected static d a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            if (upperCase.equals("FOREGROUND")) {
                return FOREGROUND;
            }
            if (upperCase.equals("BACKGROUND")) {
                return BACKGROUND;
            }
            return null;
        }
    }

    enum e {
        GREATER_THAN,
        SMALLER_THAN,
        EQUALS,
        DOES_NOT_EQUAL,
        MATCH,
        CONTAINS,
        HAS_VALUE,
        ENDS_WITH,
        STARTS_WITH,
        DOES_NOT_CONTAIN,
        DIFF;

        protected static e a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.replaceAll("([a-z])([A-Z]+)", "$1_$2").toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
            }
            return null;
        }
    }

    enum f {
        OR,
        AND,
        MIN,
        MAX;

        protected static f a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
            }
            return null;
        }
    }

    enum g {
        MULT,
        ADD,
        SUBSTRACT,
        DIVIDE,
        LOWER_CASE,
        UPPER_CASE,
        ABS;

        protected static g a(String str) {
            str.getClass();
            switch (str) {
                case "UPPER_CASE":
                    return UPPER_CASE;
                case "SUBSTRACT":
                    return SUBSTRACT;
                case "ABS":
                    return ABS;
                case "ADD":
                    return ADD;
                case "MULT":
                    return MULT;
                case "LOWER_CASE":
                    return LOWER_CASE;
                case "DIVIDE":
                    return DIVIDE;
                default:
                    return null;
            }
        }
    }

    enum h {
        TIME_NOW;

        protected static h a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            if (upperCase.equals("TIME_NOW")) {
                return TIME_NOW;
            }
            return null;
        }
    }

    enum i {
        VALUE,
        TIMESTAMP;

        protected static i a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            if (upperCase.equals("TIMESTAMP")) {
                return TIMESTAMP;
            }
            if (upperCase.equals("VALUE")) {
                return VALUE;
            }
            return null;
        }
    }

    enum j {
        USER_JOURNEY,
        OS,
        CUSTOM_PARAM,
        OCQ_RULE;

        protected static j a(String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
            }
            return null;
        }
    }

    enum k {
        INTEGER,
        STRING,
        DOUBLE,
        BOOLEAN;

        protected static k a(ValueType valueType) {
            if (valueType == null) {
                return null;
            }
            int i10 = a.f93918a[valueType.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return INTEGER;
            }
            if (i10 == 3) {
                return STRING;
            }
            if (i10 == 4) {
                return DOUBLE;
            }
            if (i10 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        protected static k a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
            }
            return null;
        }
    }

    static ArrayList<d> a(b bVar) {
        d dVar;
        ArrayList<d> arrayList = new ArrayList<>();
        switch (a.f93919b[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                arrayList.add(d.BACKGROUND);
            case 5:
            case 6:
                dVar = d.FOREGROUND;
                arrayList.add(dVar);
                break;
            case 7:
            case 8:
                dVar = d.BACKGROUND;
                arrayList.add(dVar);
                break;
        }
        return arrayList;
    }
}
