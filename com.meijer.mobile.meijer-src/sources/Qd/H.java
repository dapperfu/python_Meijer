package Qd;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes6.dex */
public final class H {
    public static Object b(Object obj) throws Throwable {
        Throwable th2;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        try {
            if (obj != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            Object object = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            return object;
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream == null) {
                                throw th2;
                            }
                            objectInputStream.close();
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        objectInputStream = null;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    objectInputStream = null;
                    objectOutputStream = null;
                }
            }
        } catch (IOException | ClassNotFoundException unused) {
        }
        return null;
    }

    public static String a(Context context, String str, String str2) {
        com.google.android.gms.common.internal.r.l(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = o.a(context);
        }
        return o.b("google_app_id", resources, str2);
    }

    public static String c(String str, String[] strArr, String[] strArr2) {
        com.google.android.gms.common.internal.r.l(strArr);
        com.google.android.gms.common.internal.r.l(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }
}
