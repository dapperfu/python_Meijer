package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.pal.p6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10839p6 {
    static final CharSequence a(Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static final Appendable b(Appendable appendable, Iterator it, String str) throws IOException {
        if (it.hasNext()) {
            appendable.append(a(it.next()));
            while (it.hasNext()) {
                appendable.append(",");
                appendable.append(a(it.next()));
            }
        }
        return appendable;
    }
}
