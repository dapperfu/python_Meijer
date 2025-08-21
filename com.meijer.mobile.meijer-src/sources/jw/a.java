package jw;

import com.google.maps.android.BuildConfig;
import java.util.Iterator;

/* loaded from: classes14.dex */
public abstract class a implements b {
    protected abstract void c(char c10);

    protected abstract void d(String str);

    private <T> b g(String str, String str2, String str3, Iterator<T> it) {
        return f(str, str2, str3, new kw.c(it));
    }

    private void i(char c10) {
        if (c10 == '\t') {
            d("\\t");
            return;
        }
        if (c10 == '\n') {
            d("\\n");
            return;
        }
        if (c10 == '\r') {
            d("\\r");
        } else if (c10 != '\"') {
            c(c10);
        } else {
            d("\\\"");
        }
    }

    private void j(String str) {
        c('\"');
        for (int i10 = 0; i10 < str.length(); i10++) {
            i(str.charAt(i10));
        }
        c('\"');
    }

    @Override // jw.b
    public b b(Object obj) {
        if (obj == null) {
            d(BuildConfig.TRAVIS);
            return this;
        }
        if (obj instanceof String) {
            j((String) obj);
            return this;
        }
        if (obj instanceof Character) {
            c('\"');
            i(((Character) obj).charValue());
            c('\"');
            return this;
        }
        if (obj instanceof Short) {
            c('<');
            d(h(obj));
            d("s>");
            return this;
        }
        if (obj instanceof Long) {
            c('<');
            d(h(obj));
            d("L>");
            return this;
        }
        if (obj instanceof Float) {
            c('<');
            d(h(obj));
            d("F>");
            return this;
        }
        if (obj.getClass().isArray()) {
            g("[", ", ", "]", new kw.a(obj));
            return this;
        }
        c('<');
        d(h(obj));
        c('>');
        return this;
    }

    private b f(String str, String str2, String str3, Iterator<? extends c> it) {
        d(str);
        boolean z10 = false;
        while (it.hasNext()) {
            if (z10) {
                d(str2);
            }
            e(it.next());
            z10 = true;
        }
        d(str3);
        return this;
    }

    private String h(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    @Override // jw.b
    public b a(String str) {
        d(str);
        return this;
    }

    public b e(c cVar) {
        cVar.a(this);
        return this;
    }
}
