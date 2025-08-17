package Iv;

import Fv.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LIv/q;", "LDv/b;", "LIv/i;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "s", "(LGv/f;LIv/i;)V", "LGv/e;", "decoder", "r", "(LGv/e;)LIv/i;", "LFv/f;", "b", "LFv/f;", "a", "()LFv/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes13.dex */
public final class q implements Dv.b<i> {

    /* renamed from: a, reason: collision with root package name */
    public static final q f14441a = new q();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Fv.f descriptor = Fv.l.c("kotlinx.serialization.json.JsonElement", d.b.f11104a, new Fv.f[0], new Function1() { // from class: Iv.k
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return q.l((Fv.a) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Fv.a buildSerialDescriptor) {
        Intrinsics.j(buildSerialDescriptor, "$this$buildSerialDescriptor");
        Fv.a.b(buildSerialDescriptor, "JsonPrimitive", r.f(new Function0() { // from class: Iv.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.m();
            }
        }), null, false, 12, null);
        Fv.a.b(buildSerialDescriptor, "JsonNull", r.f(new Function0() { // from class: Iv.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.n();
            }
        }), null, false, 12, null);
        Fv.a.b(buildSerialDescriptor, "JsonLiteral", r.f(new Function0() { // from class: Iv.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.o();
            }
        }), null, false, 12, null);
        Fv.a.b(buildSerialDescriptor, "JsonObject", r.f(new Function0() { // from class: Iv.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.p();
            }
        }), null, false, 12, null);
        Fv.a.b(buildSerialDescriptor, "JsonArray", r.f(new Function0() { // from class: Iv.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.q();
            }
        }), null, false, 12, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fv.f m() {
        return F.f14390a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fv.f n() {
        return A.f14382a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fv.f o() {
        return w.f14447a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fv.f p() {
        return D.f14385a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fv.f q() {
        return C3763d.f14402a.getDescriptor();
    }

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a */
    public Fv.f getDescriptor() {
        return descriptor;
    }

    @Override // Dv.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public i d(Gv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        return r.d(decoder).g();
    }

    @Override // Dv.h
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void b(Gv.f encoder, i value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        r.h(encoder);
        if (value instanceof E) {
            encoder.p(F.f14390a, value);
        } else if (value instanceof C) {
            encoder.p(D.f14385a, value);
        } else {
            if (!(value instanceof C3762c)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.p(C3763d.f14402a, value);
        }
    }

    private q() {
    }
}
