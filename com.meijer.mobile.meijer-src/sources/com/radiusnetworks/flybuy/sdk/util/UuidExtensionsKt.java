package com.radiusnetworks.flybuy.sdk.util;

import androidx.annotation.Keep;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"toByteArray", "", "Ljava/util/UUID;", "toUUID", "common_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UuidExtensionsKt {
    @Keep
    public static final byte[] toByteArray(UUID uuid) {
        Intrinsics.j(uuid, "<this>");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        Intrinsics.i(bArrArray, "array(...)");
        return bArrArray;
    }

    @Keep
    public static final UUID toUUID(byte[] bArr) {
        Intrinsics.j(bArr, "<this>");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }
}
