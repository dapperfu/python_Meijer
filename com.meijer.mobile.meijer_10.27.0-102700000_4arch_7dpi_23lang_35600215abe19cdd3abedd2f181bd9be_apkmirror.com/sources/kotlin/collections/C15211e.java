package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aI\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00022\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "R", "", "Lkotlin/Pair;", "", "e", "([Lkotlin/Pair;)Lkotlin/Pair;", "other", "", "d", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
@SourceDebugExtension
/* renamed from: kotlin.collections.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15211e extends C15210d {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    @PublishedApi
    @JvmName
    public static <T> boolean d(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object[] objArr = tArr[i10];
            Object[] objArr2 = tArr2[i10];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!d(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof UByteArray) && (objArr2 instanceof UByteArray)) {
                    if (!UArraysKt.c(((UByteArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), ((UByteArray) objArr2).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String())) {
                        return false;
                    }
                } else if ((objArr instanceof UShortArray) && (objArr2 instanceof UShortArray)) {
                    if (!UArraysKt.a(((UShortArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), ((UShortArray) objArr2).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String())) {
                        return false;
                    }
                } else if ((objArr instanceof UIntArray) && (objArr2 instanceof UIntArray)) {
                    if (!UArraysKt.b(((UIntArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), ((UIntArray) objArr2).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String())) {
                        return false;
                    }
                } else if ((objArr instanceof ULongArray) && (objArr2 instanceof ULongArray)) {
                    if (!UArraysKt.d(((ULongArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), ((ULongArray) objArr2).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String())) {
                        return false;
                    }
                } else if (!Intrinsics.e(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static <T, R> Pair<List<T>, List<R>> e(Pair<? extends T, ? extends R>[] pairArr) {
        Intrinsics.j(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.c());
            arrayList2.add(pair.d());
        }
        return TuplesKt.a(arrayList, arrayList2);
    }
}
