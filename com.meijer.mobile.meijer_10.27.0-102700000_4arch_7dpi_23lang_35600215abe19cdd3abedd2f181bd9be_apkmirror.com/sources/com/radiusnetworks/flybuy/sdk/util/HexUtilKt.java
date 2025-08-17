package com.radiusnetworks.flybuy.sdk.util;

import androidx.annotation.Keep;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\f\u0010\t\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\f\u0010\n\u001a\u00020\u0002*\u00020\u0005H\u0007\u001a\f\u0010\n\u001a\u00020\u0002*\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"asHexLower", "", "", "asHexUpper", "getIntAt", "", "index", "getLongAt", "", "hexAsByteArray", "toByteArray", "common_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class HexUtilKt {
    @Keep
    public static final String asHexLower(byte[] bArr) {
        Intrinsics.j(bArr, "<this>");
        return ArraysKt.B0(bArr, "", null, null, 0, null, new Function1<Byte, CharSequence>() { // from class: com.radiusnetworks.flybuy.sdk.util.HexUtilKt.asHexLower.1
            public final CharSequence invoke(byte b10) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
                String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b10 & 255)}, 1));
                Intrinsics.i(str, "format(format, *args)");
                return str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Byte b10) {
                return invoke(b10.byteValue());
            }
        }, 30, null);
    }

    @Keep
    public static final String asHexUpper(byte[] bArr) {
        Intrinsics.j(bArr, "<this>");
        return ArraysKt.B0(bArr, "", null, null, 0, null, new Function1<Byte, CharSequence>() { // from class: com.radiusnetworks.flybuy.sdk.util.HexUtilKt.asHexUpper.1
            public final CharSequence invoke(byte b10) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
                String str = String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(b10 & 255)}, 1));
                Intrinsics.i(str, "format(format, *args)");
                return str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Byte b10) {
                return invoke(b10.byteValue());
            }
        }, 30, null);
    }

    @Keep
    public static final int getIntAt(byte[] bArr, int i10) {
        Intrinsics.j(bArr, "<this>");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        Intrinsics.i(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.put(ArraysKt.u(bArr, i10, i10 + 4));
        byteBufferAllocate.flip();
        return byteBufferAllocate.getInt();
    }

    @Keep
    public static final long getLongAt(byte[] bArr, int i10) {
        Intrinsics.j(bArr, "<this>");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        Intrinsics.i(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.put(ArraysKt.u(bArr, i10, i10 + 8));
        byteBufferAllocate.flip();
        return byteBufferAllocate.getLong();
    }

    @Keep
    public static final byte[] hexAsByteArray(String str) {
        Intrinsics.j(str, "<this>");
        List<String> listD1 = StringsKt.D1(str, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listD1, 10));
        for (String str2 : listD1) {
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            String upperCase = str2.toUpperCase(US);
            Intrinsics.i(upperCase, "this as java.lang.String).toUpperCase(locale)");
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(upperCase, CharsKt.a(16))));
        }
        return CollectionsKt.e1(arrayList);
    }

    @Keep
    public static final byte[] toByteArray(int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i10);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.i(bArrArray, "array(...)");
        return bArrArray;
    }

    @Keep
    public static final byte[] toByteArray(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        Intrinsics.i(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.putLong(j10);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.i(bArrArray, "array(...)");
        return bArrArray;
    }
}
