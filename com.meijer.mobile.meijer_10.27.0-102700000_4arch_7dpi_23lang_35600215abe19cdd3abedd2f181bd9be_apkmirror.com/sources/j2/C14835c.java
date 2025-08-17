package j2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Lkotlin/Pair;", "", "", "pairs", "Landroid/os/Bundle;", "b", "([Lkotlin/Pair;)Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14835c {
    public static final Bundle a() {
        return new Bundle(0);
    }

    public static final Bundle b(Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String strA = pair.a();
            Object objB = pair.b();
            if (objB == null) {
                bundle.putString(strA, null);
            } else if (objB instanceof Boolean) {
                bundle.putBoolean(strA, ((Boolean) objB).booleanValue());
            } else if (objB instanceof Byte) {
                bundle.putByte(strA, ((Number) objB).byteValue());
            } else if (objB instanceof Character) {
                bundle.putChar(strA, ((Character) objB).charValue());
            } else if (objB instanceof Double) {
                bundle.putDouble(strA, ((Number) objB).doubleValue());
            } else if (objB instanceof Float) {
                bundle.putFloat(strA, ((Number) objB).floatValue());
            } else if (objB instanceof Integer) {
                bundle.putInt(strA, ((Number) objB).intValue());
            } else if (objB instanceof Long) {
                bundle.putLong(strA, ((Number) objB).longValue());
            } else if (objB instanceof Short) {
                bundle.putShort(strA, ((Number) objB).shortValue());
            } else if (objB instanceof Bundle) {
                bundle.putBundle(strA, (Bundle) objB);
            } else if (objB instanceof CharSequence) {
                bundle.putCharSequence(strA, (CharSequence) objB);
            } else if (objB instanceof Parcelable) {
                bundle.putParcelable(strA, (Parcelable) objB);
            } else if (objB instanceof boolean[]) {
                bundle.putBooleanArray(strA, (boolean[]) objB);
            } else if (objB instanceof byte[]) {
                bundle.putByteArray(strA, (byte[]) objB);
            } else if (objB instanceof char[]) {
                bundle.putCharArray(strA, (char[]) objB);
            } else if (objB instanceof double[]) {
                bundle.putDoubleArray(strA, (double[]) objB);
            } else if (objB instanceof float[]) {
                bundle.putFloatArray(strA, (float[]) objB);
            } else if (objB instanceof int[]) {
                bundle.putIntArray(strA, (int[]) objB);
            } else if (objB instanceof long[]) {
                bundle.putLongArray(strA, (long[]) objB);
            } else if (objB instanceof short[]) {
                bundle.putShortArray(strA, (short[]) objB);
            } else if (objB instanceof Object[]) {
                Class<?> componentType = objB.getClass().getComponentType();
                Intrinsics.g(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Intrinsics.h(objB, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(strA, (Parcelable[]) objB);
                } else if (String.class.isAssignableFrom(componentType)) {
                    Intrinsics.h(objB, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(strA, (String[]) objB);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    Intrinsics.h(objB, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(strA, (CharSequence[]) objB);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + strA + '\"');
                    }
                    bundle.putSerializable(strA, (Serializable) objB);
                }
            } else if (objB instanceof Serializable) {
                bundle.putSerializable(strA, (Serializable) objB);
            } else if (objB instanceof IBinder) {
                bundle.putBinder(strA, (IBinder) objB);
            } else if (objB instanceof Size) {
                C14833a.a(bundle, strA, (Size) objB);
            } else {
                if (!(objB instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objB.getClass().getCanonicalName() + " for key \"" + strA + '\"');
                }
                C14833a.b(bundle, strA, (SizeF) objB);
            }
        }
        return bundle;
    }
}
