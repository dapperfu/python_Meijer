package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class H {

    private static final class b extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f90334a;

        /* renamed from: b, reason: collision with root package name */
        private final a f90335b = new a();

        private static class a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            private char[] f90336a;

            /* renamed from: b, reason: collision with root package name */
            private String f90337b;

            private a() {
            }

            void a(char[] cArr) {
                this.f90336a = cArr;
                this.f90337b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f90336a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f90336a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f90336a, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f90337b == null) {
                    this.f90337b = new String(this.f90336a);
                }
                return this.f90337b;
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.f90335b.a(cArr);
            this.f90334a.append(this.f90335b, i10, i11 + i10);
        }

        b(Appendable appendable) {
            this.f90334a = appendable;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f90334a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f90334a.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.f90334a.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.f90334a.append(str, i10, i11 + i10);
        }
    }

    public static void b(com.google.gson.k kVar, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.f90446V.write(jsonWriter, kVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    public static com.google.gson.k a(JsonReader jsonReader) throws JsonParseException {
        boolean z10;
        try {
            try {
                jsonReader.peek();
                z10 = false;
            } catch (EOFException e10) {
                e = e10;
                z10 = true;
            }
            try {
                return TypeAdapters.f90446V.read(jsonReader);
            } catch (EOFException e11) {
                e = e11;
                if (z10) {
                    return com.google.gson.l.f90536a;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e12) {
            throw new JsonSyntaxException(e12);
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        } catch (NumberFormatException e14) {
            throw new JsonSyntaxException(e14);
        }
    }
}
