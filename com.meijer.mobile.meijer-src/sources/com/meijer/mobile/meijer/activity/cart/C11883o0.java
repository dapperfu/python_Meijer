package com.meijer.mobile.meijer.activity.cart;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.cart.o0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11883o0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ',') {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }
}
