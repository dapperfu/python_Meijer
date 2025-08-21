package com.scandit.datacapture.core.internal.module.https.scandit;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.https.scandit.y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13455y extends D {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13455y(String from, String to2) {
        super(new IllegalStateException("Request was routed from \"" + from + "\" to \"" + to2 + '\"'));
        Intrinsics.j(from, "from");
        Intrinsics.j(to2, "to");
    }
}
