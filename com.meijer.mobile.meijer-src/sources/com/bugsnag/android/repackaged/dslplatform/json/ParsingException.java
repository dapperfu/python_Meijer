package com.bugsnag.android.repackaged.dslplatform.json;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ParsingException extends IOException {

    private static class b extends ParsingException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }

        private b(String str) {
            super(str);
        }

        private b(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public static ParsingException a(String str, Throwable th2, boolean z10) {
        return z10 ? new ParsingException(str, th2) : new b(str, th2);
    }

    public static ParsingException b(String str, boolean z10) {
        return z10 ? new ParsingException(str) : new b(str);
    }

    private ParsingException(String str) {
        super(str);
    }

    private ParsingException(String str, Throwable th2) {
        super(str, th2);
    }
}
