package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.vf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9854vf0 {
    static final CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static final StringBuilder b(StringBuilder sb2, Iterable iterable, String str) throws IOException {
        c(sb2, iterable.iterator(), str);
        return sb2;
    }

    public static final StringBuilder c(StringBuilder sb2, Iterator it, String str) throws IOException {
        try {
            if (it.hasNext()) {
                sb2.append(a(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) str);
                    sb2.append(a(it.next()));
                }
            }
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
