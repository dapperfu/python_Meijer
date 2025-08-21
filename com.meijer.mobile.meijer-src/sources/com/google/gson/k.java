package com.google.gson;

import com.google.gson.internal.H;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes8.dex */
public abstract class k {
    public String h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean k() {
        return this instanceof h;
    }

    public boolean l() {
        return this instanceof l;
    }

    public boolean m() {
        return this instanceof m;
    }

    public boolean n() {
        return this instanceof n;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setStrictness(s.LENIENT);
            H.b(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Deprecated
    public k() {
    }

    public h a() {
        if (k()) {
            return (h) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public m e() {
        if (m()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public n f() {
        if (n()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }
}
