package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
public enum MDLogLevel {
    OFF(0),
    FATAL(1),
    ERROR(2),
    WARN(3),
    INFO(4),
    DEBUG(5);

    private final int level;

    MDLogLevel(int i10) {
        this.level = i10;
    }

    public static MDLogLevel getMDLogLevelFromString(String str) {
        if (str == null || str.isEmpty()) {
            return OFF;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "off":
                return OFF;
            case "info":
                return INFO;
            case "warn":
                return WARN;
            case "debug":
                return DEBUG;
            case "error":
                return ERROR;
            case "fatal":
                return FATAL;
            default:
                return OFF;
        }
    }

    public int getLevel() {
        return this.level;
    }
}
