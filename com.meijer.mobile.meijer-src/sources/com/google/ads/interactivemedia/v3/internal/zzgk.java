package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.fullstory.FS;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class zzgk {
    private static final String zza = "zzgk";

    protected abstract HashMap zzb();

    public final String toString() throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(zzb());
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException unused) {
            return null;
        }
    }

    protected static HashMap zza(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
            }
            return null;
        } catch (IOException | ClassNotFoundException unused) {
            FS.log_d(zza, "decode object failure");
            return null;
        }
    }
}
