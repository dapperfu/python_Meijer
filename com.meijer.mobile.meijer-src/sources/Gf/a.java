package Gf;

import Gf.d;
import java.lang.annotation.Annotation;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f12499a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f12500b = d.a.DEFAULT;

    /* renamed from: Gf.a$a, reason: collision with other inner class name */
    private static final class C0188a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f12501a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f12502b;

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f12501a == dVar.tag() && this.f12502b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // Gf.d
        public d.a intEncoding() {
            return this.f12502b;
        }

        @Override // Gf.d
        public int tag() {
            return this.f12501a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f12501a + "intEncoding=" + this.f12502b + ')';
        }

        C0188a(int i10, d.a aVar) {
            this.f12501a = i10;
            this.f12502b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f12501a) + (this.f12502b.hashCode() ^ 2041407134);
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0188a(this.f12499a, this.f12500b);
    }

    public a c(int i10) {
        this.f12499a = i10;
        return this;
    }
}
