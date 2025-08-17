package com.google.android.gms.tasks;

import Td.AbstractC5232j;

/* loaded from: classes6.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th2) {
        super(str, th2);
    }

    public static IllegalStateException a(AbstractC5232j<?> abstractC5232j) {
        String strConcat;
        if (!abstractC5232j.q()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excM = abstractC5232j.m();
        if (excM != null) {
            strConcat = "failure";
        } else if (abstractC5232j.r()) {
            strConcat = "result ".concat(String.valueOf(abstractC5232j.n()));
        } else if (abstractC5232j.p()) {
            strConcat = "cancellation";
        } else {
            strConcat = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), excM);
    }
}
