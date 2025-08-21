package Ss;

import Bv.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LSs/h;", "Lzv/b;", "Lokhttp3/HttpUrl;", "<init>", "()V", "LCv/e;", "decoder", "f", "(LCv/e;)Lokhttp3/HttpUrl;", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;Lokhttp3/HttpUrl;)V", "LBv/f;", "b", "LBv/f;", "a", "()LBv/f;", "descriptor", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements zv.b<HttpUrl> {

    /* renamed from: a, reason: collision with root package name */
    public static final h f35781a = new h();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Bv.f descriptor = Bv.l.b("HttpUrl", e.i.f3708a);

    @Override // zv.b, zv.h, zv.InterfaceC18555a
    /* renamed from: a */
    public Bv.f getDescriptor() {
        return descriptor;
    }

    @Override // zv.InterfaceC18555a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public HttpUrl c(Cv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        return HttpUrl.INSTANCE.c(decoder.B());
    }

    @Override // zv.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(Cv.f encoder, HttpUrl value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        encoder.E(value.getUrl());
    }

    private h() {
    }
}
