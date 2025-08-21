package Ev;

import Bv.f;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0012\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LCv/f;", "encoder", "", "h", "(LCv/f;)V", "LCv/e;", "decoder", "g", "(LCv/e;)V", "LEv/h;", "d", "(LCv/e;)LEv/h;", "LEv/s;", "e", "(LCv/f;)LEv/s;", "Lkotlin/Function0;", "LBv/f;", "deferred", "f", "(Lkotlin/jvm/functions/Function0;)LBv/f;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r {

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Ev/r$a", "LBv/f;", "", "index", "", "j", "(I)Ljava/lang/String;", "name", "h", "(Ljava/lang/String;)I", "", "", "k", "(I)Ljava/util/List;", "l", "(I)LBv/f;", "", "n", "(I)Z", "a", "Lkotlin/Lazy;", "()LBv/f;", "original", "m", "()Ljava/lang/String;", "serialName", "LBv/m;", "f", "()LBv/m;", "kind", "i", "()I", "elementsCount", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Bv.f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Lazy original;

        private final Bv.f a() {
            return (Bv.f) this.original.getValue();
        }

        @Override // Bv.f
        public int h(String name) {
            Intrinsics.j(name, "name");
            return a().h(name);
        }

        a(Function0<? extends Bv.f> function0) {
            this.original = LazyKt.b(function0);
        }

        @Override // Bv.f
        /* renamed from: f */
        public Bv.m getKind() {
            return a().getKind();
        }

        @Override // Bv.f
        public boolean g() {
            return f.a.c(this);
        }

        @Override // Bv.f
        public List<Annotation> getAnnotations() {
            return f.a.a(this);
        }

        @Override // Bv.f
        /* renamed from: i */
        public int getElementsCount() {
            return a().getElementsCount();
        }

        @Override // Bv.f
        /* renamed from: isInline */
        public boolean getIsInline() {
            return f.a.b(this);
        }

        @Override // Bv.f
        public String j(int index) {
            return a().j(index);
        }

        @Override // Bv.f
        public List<Annotation> k(int index) {
            return a().k(index);
        }

        @Override // Bv.f
        public Bv.f l(int index) {
            return a().l(index);
        }

        @Override // Bv.f
        /* renamed from: m */
        public String getSerialName() {
            return a().getSerialName();
        }

        @Override // Bv.f
        public boolean n(int index) {
            return a().n(index);
        }
    }

    public static final h d(Cv.e eVar) {
        Intrinsics.j(eVar, "<this>");
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.b(eVar.getClass()));
    }

    public static final s e(Cv.f fVar) {
        Intrinsics.j(fVar, "<this>");
        s sVar = fVar instanceof s ? (s) fVar : null;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.b(fVar.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bv.f f(Function0<? extends Bv.f> function0) {
        return new a(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Cv.e eVar) {
        d(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Cv.f fVar) {
        e(fVar);
    }
}
