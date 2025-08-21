package Ev;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LEv/d;", "Lzv/b;", "LEv/c;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;LEv/c;)V", "LCv/e;", "decoder", "f", "(LCv/e;)LEv/c;", "LBv/f;", "b", "LBv/f;", "a", "()LBv/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* renamed from: Ev.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3262d implements zv.b<C3261c> {

    /* renamed from: a, reason: collision with root package name */
    public static final C3262d f8604a = new C3262d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Bv.f descriptor = a.f8606b;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\u00020\u00068\u0016X\u0097D¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u001b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00128VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00128VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\u00048\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"LEv/d$a;", "LBv/f;", "<init>", "()V", "", "index", "", "j", "(I)Ljava/lang/String;", "name", "h", "(Ljava/lang/String;)I", "", "", "k", "(I)Ljava/util/List;", "l", "(I)LBv/f;", "", "n", "(I)Z", "c", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "getSerialName$annotations", "serialName", "LBv/m;", "f", "()LBv/m;", "kind", "g", "()Z", "isNullable", "isInline", "i", "()I", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ev.d$a */
    private static final class a implements Bv.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f8606b = new a();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final String serialName = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Bv.f f8608a = Av.a.g(q.f8643a).getDescriptor();

        @Override // Bv.f
        /* renamed from: f */
        public Bv.m getKind() {
            return this.f8608a.getKind();
        }

        @Override // Bv.f
        public boolean g() {
            return this.f8608a.g();
        }

        @Override // Bv.f
        public List<Annotation> getAnnotations() {
            return this.f8608a.getAnnotations();
        }

        @Override // Bv.f
        public int h(String name) {
            Intrinsics.j(name, "name");
            return this.f8608a.h(name);
        }

        @Override // Bv.f
        /* renamed from: i */
        public int getElementsCount() {
            return this.f8608a.getElementsCount();
        }

        @Override // Bv.f
        /* renamed from: isInline */
        public boolean getIsInline() {
            return this.f8608a.getIsInline();
        }

        @Override // Bv.f
        public String j(int index) {
            return this.f8608a.j(index);
        }

        @Override // Bv.f
        public List<Annotation> k(int index) {
            return this.f8608a.k(index);
        }

        @Override // Bv.f
        public Bv.f l(int index) {
            return this.f8608a.l(index);
        }

        @Override // Bv.f
        /* renamed from: m */
        public String getSerialName() {
            return serialName;
        }

        @Override // Bv.f
        public boolean n(int index) {
            return this.f8608a.n(index);
        }

        private a() {
        }
    }

    @Override // zv.b, zv.h, zv.InterfaceC18555a
    /* renamed from: a */
    public Bv.f getDescriptor() {
        return descriptor;
    }

    @Override // zv.InterfaceC18555a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C3261c c(Cv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        r.g(decoder);
        return new C3261c((List) Av.a.g(q.f8643a).c(decoder));
    }

    @Override // zv.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(Cv.f encoder, C3261c value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        r.h(encoder);
        Av.a.g(q.f8643a).b(encoder, value);
    }

    private C3262d() {
    }
}
