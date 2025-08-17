package com.google.android.libraries.places.internal;

import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
final /* synthetic */ class zzcbq {
    public static final /* synthetic */ int zza = 0;

    static {
        Logger.getLogger("okio.Okio");
    }

    public static final boolean zza(AssertionError assertionError) {
        String message;
        Intrinsics.j(assertionError, "<this>");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !StringsKt.c0(message, "getsockname failed", false, 2, null)) ? false : true;
    }
}
