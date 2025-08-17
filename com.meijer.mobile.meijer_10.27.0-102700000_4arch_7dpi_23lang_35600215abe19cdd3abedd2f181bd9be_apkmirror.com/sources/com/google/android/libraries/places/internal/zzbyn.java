package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zzbyn {
    private final List zza = new ArrayList(20);

    final /* synthetic */ List zzc() {
        return this.zza;
    }

    public final zzbyo zzb() {
        return new zzbyo(this, null);
    }

    public final zzbyn zza(String str, String str2) {
        if (!str.isEmpty()) {
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str.charAt(i11);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i11), str));
                }
            }
            if (str2 != null) {
                for (int i12 = 0; i12 < str2.length(); i12++) {
                    char cCharAt2 = str2.charAt(i12);
                    if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i12), str2));
                    }
                }
                while (true) {
                    List list = this.zza;
                    if (i10 < list.size()) {
                        if (str.equalsIgnoreCase((String) list.get(i10))) {
                            list.remove(i10);
                            list.remove(i10);
                            i10 -= 2;
                        }
                        i10 += 2;
                    } else {
                        list.add(str);
                        list.add(str2.trim());
                        return this;
                    }
                }
            } else {
                throw new IllegalArgumentException("value == null");
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }
}
