package Ef;

import Ef.d;
import java.lang.annotation.Annotation;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f8947a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f8948b = d.a.DEFAULT;

    /* renamed from: Ef.a$a, reason: collision with other inner class name */
    private static final class C0127a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f8949a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f8950b;

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f8949a == dVar.tag() && this.f8950b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // Ef.d
        public d.a intEncoding() {
            return this.f8950b;
        }

        @Override // Ef.d
        public int tag() {
            return this.f8949a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f8949a + "intEncoding=" + this.f8950b + ')';
        }

        C0127a(int i10, d.a aVar) {
            this.f8949a = i10;
            this.f8950b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f8949a) + (this.f8950b.hashCode() ^ 2041407134);
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0127a(this.f8947a, this.f8948b);
    }

    public a c(int i10) {
        this.f8947a = i10;
        return this;
    }
}
