package com.scandit.datacapture.core.internal.sdk.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"bitmapByKey", "Landroid/graphics/Bitmap;", "Lcom/scandit/datacapture/core/json/JsonValue;", "key", "", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class JsonExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap bitmapByKey(com.scandit.datacapture.core.json.JsonValue r4, java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "key"
            kotlin.jvm.internal.Intrinsics.j(r5, r1)
            r1 = 0
            if (r4 != 0) goto Lb
            return r1
        Lb:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r4.getByKeyAsNullableString$scandit_capture_core(r5, r0)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = kotlin.Result.b(r2)     // Catch: java.lang.Throwable -> L16
            goto L21
        L16:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            java.lang.Object r2 = kotlin.ResultKt.a(r2)
            java.lang.Object r2 = kotlin.Result.b(r2)
        L21:
            boolean r3 = kotlin.Result.h(r2)
            if (r3 == 0) goto L32
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L32
            android.graphics.Bitmap r2 = com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt.bitmapFromBase64(r2)
            if (r2 == 0) goto L32
            return r2
        L32:
            com.scandit.datacapture.core.json.JsonValue r4 = r4.getByKeyAsObject(r5, r1)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L68
            java.lang.String r5 = "type"
            java.lang.String r5 = r4.getByKeyAsNullableString$scandit_capture_core(r5, r1)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L68
            java.lang.String r2 = "base64"
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r5, r2)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L55
            java.lang.String r5 = "data"
            java.lang.String r4 = r4.getByKeyAsString(r5, r0)     // Catch: java.lang.Throwable -> L53
            android.graphics.Bitmap r4 = com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt.bitmapFromBase64(r4)     // Catch: java.lang.Throwable -> L53
            goto L69
        L53:
            r4 = move-exception
            goto L6e
        L55:
            java.lang.String r2 = "resource"
            boolean r5 = kotlin.jvm.internal.Intrinsics.e(r5, r2)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L68
            java.lang.String r5 = "name"
            java.lang.String r4 = r4.getByKeyAsString(r5, r0)     // Catch: java.lang.Throwable -> L53
            android.graphics.Bitmap r4 = com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt.bitmapFromResourceName(r4)     // Catch: java.lang.Throwable -> L53
            goto L69
        L68:
            r4 = r1
        L69:
            java.lang.Object r4 = kotlin.Result.b(r4)     // Catch: java.lang.Throwable -> L53
            goto L78
        L6e:
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE
            java.lang.Object r4 = kotlin.ResultKt.a(r4)
            java.lang.Object r4 = kotlin.Result.b(r4)
        L78:
            boolean r5 = kotlin.Result.h(r4)
            if (r5 == 0) goto L81
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            return r4
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.sdk.extensions.JsonExtensionsKt.bitmapByKey(com.scandit.datacapture.core.json.JsonValue, java.lang.String):android.graphics.Bitmap");
    }
}
