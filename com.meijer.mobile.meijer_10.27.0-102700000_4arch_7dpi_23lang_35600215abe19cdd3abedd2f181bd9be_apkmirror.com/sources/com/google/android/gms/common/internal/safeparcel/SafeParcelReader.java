package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class SafeParcelReader {
    public static short B(Parcel parcel, int i10) {
        G(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    public static int m(int i10) {
        return (char) i10;
    }

    public static boolean n(Parcel parcel, int i10) {
        G(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static byte p(Parcel parcel, int i10) {
        G(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static float s(Parcel parcel, int i10) {
        G(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static int w(Parcel parcel, int i10) {
        G(parcel, i10, 4);
        return parcel.readInt();
    }

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static int C(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    private static void F(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new ParseException("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    public static double q(Parcel parcel, int i10) {
        G(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static long z(Parcel parcel, int i10) {
        G(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long A(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        if (iC == 0) {
            return null;
        }
        F(parcel, i10, iC, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static void D(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + C(parcel, i10));
    }

    public static int E(Parcel parcel) {
        int iU = u(parcel);
        int iC = C(parcel, iU);
        int iM = m(iU);
        int iDataPosition = parcel.dataPosition();
        if (iM == 20293) {
            int i10 = iC + iDataPosition;
            if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new ParseException("Size read is invalid start=" + iDataPosition + " end=" + i10, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iU))), parcel);
    }

    private static void G(Parcel parcel, int i10, int i11) {
        int iC = C(parcel, i10);
        if (iC == i11) {
            return;
        }
        throw new ParseException("Expected size " + i11 + " got " + iC + " (0x" + Integer.toHexString(iC) + ")", parcel);
    }

    public static Bundle a(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iC);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iC);
        return bArrCreateByteArray;
    }

    public static byte[][] c(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        byte[][] bArr = new byte[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iC);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iC);
        return iArrCreateIntArray;
    }

    public static ArrayList<Integer> e(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iC);
        return arrayList;
    }

    public static <T extends Parcelable> T f(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iC);
        return tCreateFromParcel;
    }

    public static String g(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iC);
        return string;
    }

    public static String[] h(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iC);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> i(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iC);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] j(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iC);
        return tArr;
    }

    public static <T> ArrayList<T> k(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iC);
        return arrayListCreateTypedArrayList;
    }

    public static void l(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i10, parcel);
    }

    public static Boolean o(Parcel parcel, int i10) {
        boolean z10;
        int iC = C(parcel, i10);
        if (iC == 0) {
            return null;
        }
        F(parcel, i10, iC, 4);
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static Double r(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        if (iC == 0) {
            return null;
        }
        F(parcel, i10, iC, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float t(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        if (iC == 0) {
            return null;
        }
        F(parcel, i10, iC, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int u(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder v(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iC);
        return strongBinder;
    }

    public static Integer x(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        if (iC == 0) {
            return null;
        }
        F(parcel, i10, iC, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void y(Parcel parcel, int i10, List list, ClassLoader classLoader) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(iDataPosition + iC);
    }
}
