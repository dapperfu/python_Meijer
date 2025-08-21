package androidx.core.os;

import o2.c;

/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(c.e(str, "The operation has been canceled."));
    }
}
