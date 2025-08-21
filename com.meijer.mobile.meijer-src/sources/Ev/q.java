package Ev;

import Bv.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LEv/q;", "Lzv/b;", "LEv/i;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "s", "(LCv/f;LEv/i;)V", "LCv/e;", "decoder", "r", "(LCv/e;)LEv/i;", "LBv/f;", "b", "LBv/f;", "a", "()LBv/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes14.dex */
public final class q implements zv.b<i> {

    /* renamed from: a, reason: collision with root package name */
    public static final q f8643a = new q();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Bv.f descriptor = Bv.l.c("kotlinx.serialization.json.JsonElement", d.b.f3699a, new Bv.f[0], new Function1() { // from class: Ev.k
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return q.l((Bv.a) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Bv.a buildSerialDescriptor) {
        Intrinsics.j(buildSerialDescriptor, "$this$buildSerialDescriptor");
        Bv.a.b(buildSerialDescriptor, "JsonPrimitive", r.f(new Function0() { // from class: Ev.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.m();
            }
        }), null, false, 12, null);
        Bv.a.b(buildSerialDescriptor, "JsonNull", r.f(new Function0() { // from class: Ev.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.n();
            }
        }), null, false, 12, null);
        Bv.a.b(buildSerialDescriptor, "JsonLiteral", r.f(new Function0() { // from class: Ev.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.o();
            }
        }), null, false, 12, null);
        Bv.a.b(buildSerialDescriptor, "JsonObject", r.f(new Function0() { // from class: Ev.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.p();
            }
        }), null, false, 12, null);
        Bv.a.b(buildSerialDescriptor, "JsonArray", r.f(new Function0() { // from class: Ev.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.q();
            }
        }), null, false, 12, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bv.f m() {
        return F.f8592a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bv.f n() {
        return A.f8584a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bv.f o() {
        return w.f8649a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bv.f p() {
        return D.f8587a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bv.f q() {
        return C3262d.f8604a.getDescriptor();
    }

    @Override // zv.b, zv.h, zv.InterfaceC18555a
    /* renamed from: a */
    public Bv.f getDescriptor() {
        return descriptor;
    }

    @Override // zv.InterfaceC18555a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public i c(Cv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        return r.d(decoder).j();
    }

    @Override // zv.h
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void b(Cv.f encoder, i value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        r.h(encoder);
        if (value instanceof E) {
            encoder.D(F.f8592a, value);
        } else if (value instanceof C) {
            encoder.D(D.f8587a, value);
        } else {
            if (!(value instanceof C3261c)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.D(C3262d.f8604a, value);
        }
    }

    private q() {
    }
}
