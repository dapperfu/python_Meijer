package Dv;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LDv/H0;", "Lzv/b;", "", "<init>", "()V", "LCv/f;", "encoder", "value", "g", "(LCv/f;Lkotlin/Unit;)V", "LCv/e;", "decoder", "f", "(LCv/e;)V", "LBv/f;", "a", "()LBv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes14.dex */
public final class H0 implements zv.b<Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final H0 f6699b = new H0();

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ W<Unit> f6700a = new W<>("kotlin.Unit", Unit.f143329a);

    @Override // zv.b, zv.h, zv.InterfaceC18555a
    /* renamed from: a */
    public Bv.f getDescriptor() {
        return this.f6700a.getDescriptor();
    }

    public void f(Cv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        this.f6700a.c(decoder);
    }

    @Override // zv.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(Cv.f encoder, Unit value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        this.f6700a.b(encoder, value);
    }

    private H0() {
    }

    @Override // zv.InterfaceC18555a
    public /* bridge */ /* synthetic */ Object c(Cv.e eVar) {
        f(eVar);
        return Unit.f143329a;
    }
}
