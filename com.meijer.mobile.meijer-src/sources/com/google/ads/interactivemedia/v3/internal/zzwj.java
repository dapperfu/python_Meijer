package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes4.dex */
public abstract class zzwj<T> {
    public final T fromJson(Reader reader) throws IOException {
        return read(new zzacc(reader));
    }

    public final zzwj<T> nullSafe() {
        return new zzwi(this);
    }

    public abstract T read(zzacc zzaccVar) throws IOException;

    public final void toJson(Writer writer, T t10) throws IOException {
        write(new zzace(writer), t10);
    }

    public abstract void write(zzace zzaceVar, T t10) throws IOException;

    public final T fromJsonTree(zzvw zzvwVar) {
        try {
            return read(new zzyz(zzvwVar));
        } catch (IOException e10) {
            throw new zzvx(e10);
        }
    }

    public final zzvw toJsonTree(T t10) {
        try {
            zzzb zzzbVar = new zzzb();
            write(zzzbVar, t10);
            return zzzbVar.zza();
        } catch (IOException e10) {
            throw new zzvx(e10);
        }
    }

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new zzvx(e10);
        }
    }
}
