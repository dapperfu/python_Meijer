package kotlin.collections.unsigned;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0087\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0006\u001a\u00020\u0002*\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005H\u0087\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\t\u001a\u00020\u0002*\u0004\u0018\u00010\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\bH\u0087\u0004¢\u0006\u0004\b\t\u0010\n\u001a \u0010\f\u001a\u00020\u0002*\u0004\u0018\u00010\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u000bH\u0087\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/UIntArray;", "other", "", "b", "([I[I)Z", "Lkotlin/ULongArray;", "d", "([J[J)Z", "Lkotlin/UByteArray;", "c", "([B[B)Z", "Lkotlin/UShortArray;", "a", "([S[S)Z", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
@SourceDebugExtension
/* loaded from: classes6.dex */
public class b extends a {
    @SinceKotlin
    @ExperimentalUnsignedTypes
    public static boolean a(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    public static boolean b(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    public static boolean d(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }
}
