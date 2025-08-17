package Hv;

import Hv.InterfaceC3718z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "name", "LDv/b;", "primitiveSerializer", "LFv/f;", "a", "(Ljava/lang/String;LDv/b;)LFv/f;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class B {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Hv/B$a", "LHv/z;", "", "LDv/b;", "e", "()[LDv/b;", "LGv/f;", "encoder", "value", "", "b", "(LGv/f;Ljava/lang/Object;)V", "LGv/e;", "decoder", "d", "(LGv/e;)Ljava/lang/Object;", "LFv/f;", "a", "()LFv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements InterfaceC3718z<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Dv.b<T> f13260a;

        a(Dv.b<T> bVar) {
            this.f13260a = bVar;
        }

        @Override // Dv.b, Dv.h, Dv.a
        /* renamed from: a */
        public Fv.f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // Dv.h
        public void b(Gv.f encoder, T value) {
            Intrinsics.j(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // Dv.a
        public T d(Gv.e decoder) {
            Intrinsics.j(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Hv.InterfaceC3718z
        public Dv.b<?>[] e() {
            return new Dv.b[]{this.f13260a};
        }

        @Override // Hv.InterfaceC3718z
        public Dv.b<?>[] c() {
            return InterfaceC3718z.a.a(this);
        }
    }

    public static final <T> Fv.f a(String name, Dv.b<T> primitiveSerializer) {
        Intrinsics.j(name, "name");
        Intrinsics.j(primitiveSerializer, "primitiveSerializer");
        return new A(name, new a(primitiveSerializer));
    }
}
