package com.scandit.datacapture.core.internal.module.https.scandit;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.https.scandit.v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13319v extends D {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13319v(String message) {
        super(new IOException(message));
        Intrinsics.j(message, "message");
    }
}
