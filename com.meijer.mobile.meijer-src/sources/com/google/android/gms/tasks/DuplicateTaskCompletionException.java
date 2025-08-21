package com.google.android.gms.tasks;

import Vd.AbstractC5516j;

/* loaded from: classes6.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th2) {
        super(str, th2);
    }

    public static IllegalStateException a(AbstractC5516j<?> abstractC5516j) {
        String strConcat;
        if (!abstractC5516j.q()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excM = abstractC5516j.m();
        if (excM != null) {
            strConcat = "failure";
        } else if (abstractC5516j.r()) {
            strConcat = "result ".concat(String.valueOf(abstractC5516j.n()));
        } else if (abstractC5516j.p()) {
            strConcat = "cancellation";
        } else {
            strConcat = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), excM);
    }
}
