package Iv;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LIv/d;", "LDv/b;", "LIv/c;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;LIv/c;)V", "LGv/e;", "decoder", "f", "(LGv/e;)LIv/c;", "LFv/f;", "b", "LFv/f;", "a", "()LFv/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* renamed from: Iv.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3763d implements Dv.b<C3762c> {

    /* renamed from: a, reason: collision with root package name */
    public static final C3763d f14402a = new C3763d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Fv.f descriptor = a.f14404b;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\u00020\u00068\u0016X\u0097D¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u001b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00128VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00128VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\u00048\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"LIv/d$a;", "LFv/f;", "<init>", "()V", "", "index", "", "j", "(I)Ljava/lang/String;", "name", "h", "(Ljava/lang/String;)I", "", "", "k", "(I)Ljava/util/List;", "l", "(I)LFv/f;", "", "n", "(I)Z", "c", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "getSerialName$annotations", "serialName", "LFv/m;", "f", "()LFv/m;", "kind", "g", "()Z", "isNullable", "isInline", "i", "()I", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Iv.d$a */
    private static final class a implements Fv.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f14404b = new a();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final String serialName = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Fv.f f14406a = Ev.a.g(q.f14441a).getDescriptor();

        @Override // Fv.f
        /* renamed from: f */
        public Fv.m getKind() {
            return this.f14406a.getKind();
        }

        @Override // Fv.f
        public boolean g() {
            return this.f14406a.g();
        }

        @Override // Fv.f
        public List<Annotation> getAnnotations() {
            return this.f14406a.getAnnotations();
        }

        @Override // Fv.f
        public int h(String name) {
            Intrinsics.j(name, "name");
            return this.f14406a.h(name);
        }

        @Override // Fv.f
        /* renamed from: i */
        public int getElementsCount() {
            return this.f14406a.getElementsCount();
        }

        @Override // Fv.f
        /* renamed from: isInline */
        public boolean getIsInline() {
            return this.f14406a.getIsInline();
        }

        @Override // Fv.f
        public String j(int index) {
            return this.f14406a.j(index);
        }

        @Override // Fv.f
        public List<Annotation> k(int index) {
            return this.f14406a.k(index);
        }

        @Override // Fv.f
        public Fv.f l(int index) {
            return this.f14406a.l(index);
        }

        @Override // Fv.f
        /* renamed from: m */
        public String getSerialName() {
            return serialName;
        }

        @Override // Fv.f
        public boolean n(int index) {
            return this.f14406a.n(index);
        }

        private a() {
        }
    }

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a */
    public Fv.f getDescriptor() {
        return descriptor;
    }

    @Override // Dv.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C3762c d(Gv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        r.g(decoder);
        return new C3762c((List) Ev.a.g(q.f14441a).d(decoder));
    }

    @Override // Dv.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(Gv.f encoder, C3762c value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        r.h(encoder);
        Ev.a.g(q.f14441a).b(encoder, value);
    }

    private C3763d() {
    }
}
